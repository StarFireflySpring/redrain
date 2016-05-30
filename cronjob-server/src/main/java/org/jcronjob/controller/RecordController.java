/**
 * Copyright 2016 benjobs
 * <p>
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jcronjob.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jcronjob.base.job.CronJob;
import org.jcronjob.tag.Page;
import org.jcronjob.base.utils.PageIOUtils;
import org.jcronjob.domain.Record;
import org.jcronjob.service.ExecuteService;
import org.jcronjob.service.RecordService;
import org.jcronjob.service.JobService;
import org.jcronjob.service.WorkerService;
import org.jcronjob.vo.RecordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

import static org.jcronjob.base.utils.CommonUtils.notEmpty;

@Controller
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @Autowired
    private WorkerService workerService;

    @Autowired
    private JobService jobService;

    @Autowired
    private ExecuteService executeService;

    /**
     * 查询已完成任务列表
     * @param page
     * @param recordVo
     * @param model
     * @return
     */
    @RequestMapping("/done")
    public String queryDone(HttpSession session, Page page, RecordVo recordVo, String queryTime, Model model) {

        model.addAttribute("workers", workerService.getAll());

        if (notEmpty(recordVo.getSuccess())) {
            model.addAttribute("success", recordVo.getSuccess());
        }
        if (notEmpty(recordVo.getWorkerId())) {
            model.addAttribute("workerId", recordVo.getWorkerId());
        }

        if (notEmpty(recordVo.getWorkerId())) {
            model.addAttribute("workerId", recordVo.getWorkerId());
            model.addAttribute("jobs", jobService.getJobByWorkerId(recordVo.getWorkerId()));
        } else {
            model.addAttribute("jobs", jobService.getAll());
        }

        if (notEmpty(recordVo.getJobId())) {
            model.addAttribute("jobId", recordVo.getJobId());
        }
        if (notEmpty(queryTime)) {
            model.addAttribute("queryTime", queryTime);
        }
        if (notEmpty(recordVo.getExecType())) {
            model.addAttribute("execType", recordVo.getExecType());
        }
        recordService.query(session, page, recordVo, queryTime, true);

        return "/record/done";
    }

    @RequestMapping("/running")
    public String queryRunning(HttpSession session, HttpServletRequest request, Page page, RecordVo recordVo, String queryTime, Model model) {

        model.addAttribute("workers", workerService.getAll());

        if (notEmpty(recordVo.getWorkerId())) {
            model.addAttribute("workerId", recordVo.getWorkerId());
            model.addAttribute("jobs", jobService.getJobByWorkerId(recordVo.getWorkerId()));
        } else {
            model.addAttribute("jobs", jobService.getAll());
        }

        if (notEmpty(recordVo.getJobId())) {
            model.addAttribute("jobId", recordVo.getJobId());
        }
        if (notEmpty(queryTime)) {
            model.addAttribute("queryTime", queryTime);
        }
        if (notEmpty(recordVo.getExecType())) {
            model.addAttribute("execType", recordVo.getExecType());
        }
        recordService.query(session, page, recordVo, queryTime, false);

        if (request.getParameter("refresh") != null) {
            return "/record/refresh";
        }
        return "/record/running";
    }

    @RequestMapping("/detail")
    public String showDetail(Model model, Long id) {
        RecordVo recordVo = recordService.getDetailById(id);
        model.addAttribute("record", recordVo);
        return "/record/detail";
    }

    @RequestMapping("/kill")
    public void kill(HttpServletResponse response, Long recordId) {
        Record record = recordService.get(recordId);
        Boolean flag = executeService.killJob(record);
        PageIOUtils.writeHtml(response, flag.toString());
    }

}
