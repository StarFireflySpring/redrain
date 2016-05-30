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
package org.jcronjob.base.job;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-05-30")
public class Request implements org.apache.thrift.TBase<Request, Request._Fields>, java.io.Serializable, Cloneable, Comparable<Request> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Request");

    private static final org.apache.thrift.protocol.TField HOST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("hostName", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)2);
    private static final org.apache.thrift.protocol.TField ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("action", org.apache.thrift.protocol.TType.I32, (short)3);
    private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)4);
    private static final org.apache.thrift.protocol.TField PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("params", org.apache.thrift.protocol.TType.MAP, (short)5);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
        schemes.put(StandardScheme.class, new RequestStandardSchemeFactory());
        schemes.put(TupleScheme.class, new RequestTupleSchemeFactory());
    }

    public String hostName; // required
    public int port; // required
    /**
     *
     * @see Action
     */
    public Action action; // required
    public String password; // required
    public Map<String,String> params; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        HOST_NAME((short)1, "hostName"),
        PORT((short)2, "port"),
        /**
         *
         * @see Action
         */
        ACTION((short)3, "action"),
        PASSWORD((short)4, "password"),
        PARAMS((short)5, "params");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch(fieldId) {
                case 1: // HOST_NAME
                    return HOST_NAME;
                case 2: // PORT
                    return PORT;
                case 3: // ACTION
                    return ACTION;
                case 4: // PASSWORD
                    return PASSWORD;
                case 5: // PARAMS
                    return PARAMS;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __PORT_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.HOST_NAME, new org.apache.thrift.meta_data.FieldMetaData("hostName", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        tmpMap.put(_Fields.ACTION, new org.apache.thrift.meta_data.FieldMetaData("action", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Action.class)));
        tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.PARAMS, new org.apache.thrift.meta_data.FieldMetaData("params", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP,
                        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING),
                        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Request.class, metaDataMap);
    }

    public Request() {
    }

    public Request(
            String hostName,
            int port,
            Action action,
            String password,
            Map<String,String> params)
    {
        this();
        this.hostName = hostName;
        this.port = port;
        setPortIsSet(true);
        this.action = action;
        this.password = password;
        this.params = params;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public Request(Request other) {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetHostName()) {
            this.hostName = other.hostName;
        }
        this.port = other.port;
        if (other.isSetAction()) {
            this.action = other.action;
        }
        if (other.isSetPassword()) {
            this.password = other.password;
        }
        if (other.isSetParams()) {
            Map<String,String> __this__params = new HashMap<String,String>(other.params);
            this.params = __this__params;
        }
    }

    public Request deepCopy() {
        return new Request(this);
    }

    @Override
    public void clear() {
        this.hostName = null;
        setPortIsSet(false);
        this.port = 0;
        this.action = null;
        this.password = null;
        this.params = null;
    }

    public String getHostName() {
        return this.hostName;
    }

    public Request setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    public void unsetHostName() {
        this.hostName = null;
    }

    /** Returns true if field hostName is set (has been assigned a value) and false otherwise */
    public boolean isSetHostName() {
        return this.hostName != null;
    }

    public void setHostNameIsSet(boolean value) {
        if (!value) {
            this.hostName = null;
        }
    }

    public int getPort() {
        return this.port;
    }

    public Request setPort(int port) {
        this.port = port;
        setPortIsSet(true);
        return this;
    }

    public void unsetPort() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
    }

    /** Returns true if field port is set (has been assigned a value) and false otherwise */
    public boolean isSetPort() {
        return EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
    }

    public void setPortIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
    }

    /**
     *
     * @see Action
     */
    public Action getAction() {
        return this.action;
    }

    /**
     *
     * @see Action
     */
    public Request setAction(Action action) {
        this.action = action;
        return this;
    }

    public void unsetAction() {
        this.action = null;
    }

    /** Returns true if field action is set (has been assigned a value) and false otherwise */
    public boolean isSetAction() {
        return this.action != null;
    }

    public void setActionIsSet(boolean value) {
        if (!value) {
            this.action = null;
        }
    }

    public String getPassword() {
        return this.password;
    }

    public Request setPassword(String password) {
        this.password = password;
        return this;
    }

    public void unsetPassword() {
        this.password = null;
    }

    /** Returns true if field password is set (has been assigned a value) and false otherwise */
    public boolean isSetPassword() {
        return this.password != null;
    }

    public void setPasswordIsSet(boolean value) {
        if (!value) {
            this.password = null;
        }
    }

    public int getParamsSize() {
        return (this.params == null) ? 0 : this.params.size();
    }

    public void putToParams(String key, String val) {
        if (this.params == null) {
            this.params = new HashMap<String,String>();
        }
        this.params.put(key, val);
    }

    public Map<String,String> getParams() {
        return this.params;
    }

    public Request setParams(Map<String,String> params) {
        this.params = params;
        return this;
    }

    public void unsetParams() {
        this.params = null;
    }

    /** Returns true if field params is set (has been assigned a value) and false otherwise */
    public boolean isSetParams() {
        return this.params != null;
    }

    public void setParamsIsSet(boolean value) {
        if (!value) {
            this.params = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case HOST_NAME:
                if (value == null) {
                    unsetHostName();
                } else {
                    setHostName((String)value);
                }
                break;

            case PORT:
                if (value == null) {
                    unsetPort();
                } else {
                    setPort((Integer)value);
                }
                break;

            case ACTION:
                if (value == null) {
                    unsetAction();
                } else {
                    setAction((Action)value);
                }
                break;

            case PASSWORD:
                if (value == null) {
                    unsetPassword();
                } else {
                    setPassword((String)value);
                }
                break;

            case PARAMS:
                if (value == null) {
                    unsetParams();
                } else {
                    setParams((Map<String,String>)value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case HOST_NAME:
                return getHostName();

            case PORT:
                return getPort();

            case ACTION:
                return getAction();

            case PASSWORD:
                return getPassword();

            case PARAMS:
                return getParams();

        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case HOST_NAME:
                return isSetHostName();
            case PORT:
                return isSetPort();
            case ACTION:
                return isSetAction();
            case PASSWORD:
                return isSetPassword();
            case PARAMS:
                return isSetParams();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof Request)
            return this.equals((Request)that);
        return false;
    }

    public boolean equals(Request that) {
        if (that == null)
            return false;

        boolean this_present_hostName = true && this.isSetHostName();
        boolean that_present_hostName = true && that.isSetHostName();
        if (this_present_hostName || that_present_hostName) {
            if (!(this_present_hostName && that_present_hostName))
                return false;
            if (!this.hostName.equals(that.hostName))
                return false;
        }

        boolean this_present_port = true;
        boolean that_present_port = true;
        if (this_present_port || that_present_port) {
            if (!(this_present_port && that_present_port))
                return false;
            if (this.port != that.port)
                return false;
        }

        boolean this_present_action = true && this.isSetAction();
        boolean that_present_action = true && that.isSetAction();
        if (this_present_action || that_present_action) {
            if (!(this_present_action && that_present_action))
                return false;
            if (!this.action.equals(that.action))
                return false;
        }

        boolean this_present_password = true && this.isSetPassword();
        boolean that_present_password = true && that.isSetPassword();
        if (this_present_password || that_present_password) {
            if (!(this_present_password && that_present_password))
                return false;
            if (!this.password.equals(that.password))
                return false;
        }

        boolean this_present_params = true && this.isSetParams();
        boolean that_present_params = true && that.isSetParams();
        if (this_present_params || that_present_params) {
            if (!(this_present_params && that_present_params))
                return false;
            if (!this.params.equals(that.params))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_hostName = true && (isSetHostName());
        list.add(present_hostName);
        if (present_hostName)
            list.add(hostName);

        boolean present_port = true;
        list.add(present_port);
        if (present_port)
            list.add(port);

        boolean present_action = true && (isSetAction());
        list.add(present_action);
        if (present_action)
            list.add(action.getValue());

        boolean present_password = true && (isSetPassword());
        list.add(present_password);
        if (present_password)
            list.add(password);

        boolean present_params = true && (isSetParams());
        list.add(present_params);
        if (present_params)
            list.add(params);

        return list.hashCode();
    }

    @Override
    public int compareTo(Request other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetHostName()).compareTo(other.isSetHostName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetHostName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostName, other.hostName);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetPort()).compareTo(other.isSetPort());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetPort()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetAction()).compareTo(other.isSetAction());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetAction()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action, other.action);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetPassword()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetParams()).compareTo(other.isSetParams());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetParams()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.params, other.params);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Request(");
        boolean first = true;

        sb.append("hostName:");
        if (this.hostName == null) {
            sb.append("null");
        } else {
            sb.append(this.hostName);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("port:");
        sb.append(this.port);
        first = false;
        if (!first) sb.append(", ");
        sb.append("action:");
        if (this.action == null) {
            sb.append("null");
        } else {
            sb.append(this.action);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("password:");
        if (this.password == null) {
            sb.append("null");
        } else {
            sb.append(this.password);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("params:");
        if (this.params == null) {
            sb.append("null");
        } else {
            sb.append(this.params);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class RequestStandardSchemeFactory implements SchemeFactory {
        public RequestStandardScheme getScheme() {
            return new RequestStandardScheme();
        }
    }

    private static class RequestStandardScheme extends StandardScheme<Request> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, Request struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true)
            {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // HOST_NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.hostName = iprot.readString();
                            struct.setHostNameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // PORT
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.port = iprot.readI32();
                            struct.setPortIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // ACTION
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.action = org.jcronjob.base.job.Action.findByValue(iprot.readI32());
                            struct.setActionIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 4: // PASSWORD
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.password = iprot.readString();
                            struct.setPasswordIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 5: // PARAMS
                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
                            {
                                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                                struct.params = new HashMap<String,String>(2*_map0.size);
                                String _key1;
                                String _val2;
                                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                                {
                                    _key1 = iprot.readString();
                                    _val2 = iprot.readString();
                                    struct.params.put(_key1, _val2);
                                }
                                iprot.readMapEnd();
                            }
                            struct.setParamsIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, Request struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.hostName != null) {
                oprot.writeFieldBegin(HOST_NAME_FIELD_DESC);
                oprot.writeString(struct.hostName);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(PORT_FIELD_DESC);
            oprot.writeI32(struct.port);
            oprot.writeFieldEnd();
            if (struct.action != null) {
                oprot.writeFieldBegin(ACTION_FIELD_DESC);
                oprot.writeI32(struct.action.getValue());
                oprot.writeFieldEnd();
            }
            if (struct.password != null) {
                oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
                oprot.writeString(struct.password);
                oprot.writeFieldEnd();
            }
            if (struct.params != null) {
                oprot.writeFieldBegin(PARAMS_FIELD_DESC);
                {
                    oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.params.size()));
                    for (Map.Entry<String, String> _iter4 : struct.params.entrySet())
                    {
                        oprot.writeString(_iter4.getKey());
                        oprot.writeString(_iter4.getValue());
                    }
                    oprot.writeMapEnd();
                }
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class RequestTupleSchemeFactory implements SchemeFactory {
        public RequestTupleScheme getScheme() {
            return new RequestTupleScheme();
        }
    }

    private static class RequestTupleScheme extends TupleScheme<Request> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetHostName()) {
                optionals.set(0);
            }
            if (struct.isSetPort()) {
                optionals.set(1);
            }
            if (struct.isSetAction()) {
                optionals.set(2);
            }
            if (struct.isSetPassword()) {
                optionals.set(3);
            }
            if (struct.isSetParams()) {
                optionals.set(4);
            }
            oprot.writeBitSet(optionals, 5);
            if (struct.isSetHostName()) {
                oprot.writeString(struct.hostName);
            }
            if (struct.isSetPort()) {
                oprot.writeI32(struct.port);
            }
            if (struct.isSetAction()) {
                oprot.writeI32(struct.action.getValue());
            }
            if (struct.isSetPassword()) {
                oprot.writeString(struct.password);
            }
            if (struct.isSetParams()) {
                {
                    oprot.writeI32(struct.params.size());
                    for (Map.Entry<String, String> _iter5 : struct.params.entrySet())
                    {
                        oprot.writeString(_iter5.getKey());
                        oprot.writeString(_iter5.getValue());
                    }
                }
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(5);
            if (incoming.get(0)) {
                struct.hostName = iprot.readString();
                struct.setHostNameIsSet(true);
            }
            if (incoming.get(1)) {
                struct.port = iprot.readI32();
                struct.setPortIsSet(true);
            }
            if (incoming.get(2)) {
                struct.action = org.jcronjob.base.job.Action.findByValue(iprot.readI32());
                struct.setActionIsSet(true);
            }
            if (incoming.get(3)) {
                struct.password = iprot.readString();
                struct.setPasswordIsSet(true);
            }
            if (incoming.get(4)) {
                {
                    org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
                    struct.params = new HashMap<String,String>(2*_map6.size);
                    String _key7;
                    String _val8;
                    for (int _i9 = 0; _i9 < _map6.size; ++_i9)
                    {
                        _key7 = iprot.readString();
                        _val8 = iprot.readString();
                        struct.params.put(_key7, _val8);
                    }
                }
                struct.setParamsIsSet(true);
            }
        }
    }


    public static Request request(String hostName, Integer port, Action action, String password) {
        return new Request().setHostName(hostName).setPort(port).setAction(action).setPassword(password);
    }

    public Request putParam(String key, String value) {
        if (this.params == null) {
            this.params = new HashMap<String, String>(0);
        }
        this.params.put(key, value);
        return this;
    }


}
