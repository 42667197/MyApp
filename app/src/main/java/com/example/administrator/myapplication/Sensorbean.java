package com.example.administrator.myapplication;

import java.util.List;

/**
 * Created by Administrator on 2019/11/22.
 */

public class Sensorbean {

    /**
     * StatusCode : 0
     * Status : 0
     * Msg : null
     * ResultObj : {"IsShare":false,"DeviceID":60370,"Sensors":[{"Name":"湿度","Groups":1,"Value":12,"SensorType":"humidity","DeviceID":60370,"DataType":1,"ApiTag":"z_humidity","TransType":0,"TypeAttrs":"","RecordTime":"2019-11-22 14:14:56","CreateDate":"2019-11-18 10:12:25","Protocol":2,"Unit":"%RH"},{"Name":"温度","Groups":1,"Value":12,"SensorType":"temperature","DeviceID":60370,"DataType":1,"ApiTag":"z_temperature","TransType":0,"TypeAttrs":"","RecordTime":"2019-11-22 14:14:56","CreateDate":"2019-11-18 10:25:12","Protocol":2,"Unit":"℃"},{"Value":false,"SensorType":"","DeviceID":60370,"DataType":2,"OperType":1,"ApiTag":"wurnjwbmtlrr","RecordTime":"2019-11-22 14:14:56","CreateDate":"2019-11-18 10:13:52","OperTypeAttrs":"","Name":"123456789","Groups":2,"TransType":1,"TypeAttrs":"","Protocol":2},{"Value":false,"SensorType":"","DeviceID":60370,"DataType":2,"OperType":1,"ApiTag":"tuvsxosumhzv","RecordTime":"2019-11-22 14:14:56","CreateDate":"2019-11-18 10:23:37","OperTypeAttrs":"","Name":"123","Groups":2,"TransType":1,"TypeAttrs":"","Protocol":2}],"LastOnlineTime":"2019-11-22 13:44:45","LastOnlineIP":"221.12.38.144","IsOnline":false,"SecurityKey":"16e1d5e21f7d4d76af06c1de91630a8a","CreateDate":"2019-11-15 13:46:19","Name":"影院","IsTrans":true,"Tag":"P98D0500144","Coordinate":"","Protocol":"TCP","ProjectID":32299}
     * ErrorObj : null
     */

    private int StatusCode;
    private int Status;
    private Object Msg;
    private ResultObjBean ResultObj;
    private Object ErrorObj;

    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int StatusCode) {
        this.StatusCode = StatusCode;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public Object getMsg() {
        return Msg;
    }

    public void setMsg(Object Msg) {
        this.Msg = Msg;
    }

    public ResultObjBean getResultObj() {
        return ResultObj;
    }

    public void setResultObj(ResultObjBean ResultObj) {
        this.ResultObj = ResultObj;
    }

    public Object getErrorObj() {
        return ErrorObj;
    }

    public void setErrorObj(Object ErrorObj) {
        this.ErrorObj = ErrorObj;
    }

    public static class ResultObjBean {
        /**
         * IsShare : false
         * DeviceID : 60370
         * Sensors : [{"Name":"湿度","Groups":1,"Value":12,"SensorType":"humidity","DeviceID":60370,"DataType":1,"ApiTag":"z_humidity","TransType":0,"TypeAttrs":"","RecordTime":"2019-11-22 14:14:56","CreateDate":"2019-11-18 10:12:25","Protocol":2,"Unit":"%RH"},{"Name":"温度","Groups":1,"Value":12,"SensorType":"temperature","DeviceID":60370,"DataType":1,"ApiTag":"z_temperature","TransType":0,"TypeAttrs":"","RecordTime":"2019-11-22 14:14:56","CreateDate":"2019-11-18 10:25:12","Protocol":2,"Unit":"℃"},{"Value":false,"SensorType":"","DeviceID":60370,"DataType":2,"OperType":1,"ApiTag":"wurnjwbmtlrr","RecordTime":"2019-11-22 14:14:56","CreateDate":"2019-11-18 10:13:52","OperTypeAttrs":"","Name":"123456789","Groups":2,"TransType":1,"TypeAttrs":"","Protocol":2},{"Value":false,"SensorType":"","DeviceID":60370,"DataType":2,"OperType":1,"ApiTag":"tuvsxosumhzv","RecordTime":"2019-11-22 14:14:56","CreateDate":"2019-11-18 10:23:37","OperTypeAttrs":"","Name":"123","Groups":2,"TransType":1,"TypeAttrs":"","Protocol":2}]
         * LastOnlineTime : 2019-11-22 13:44:45
         * LastOnlineIP : 221.12.38.144
         * IsOnline : false
         * SecurityKey : 16e1d5e21f7d4d76af06c1de91630a8a
         * CreateDate : 2019-11-15 13:46:19
         * Name : 影院
         * IsTrans : true
         * Tag : P98D0500144
         * Coordinate :
         * Protocol : TCP
         * ProjectID : 32299
         */

        private boolean IsShare;
        private int DeviceID;
        private String LastOnlineTime;
        private String LastOnlineIP;
        private boolean IsOnline;
        private String SecurityKey;
        private String CreateDate;
        private String Name;
        private boolean IsTrans;
        private String Tag;
        private String Coordinate;
        private String Protocol;
        private int ProjectID;
        private List<SensorsBean> Sensors;

        public boolean isIsShare() {
            return IsShare;
        }

        public void setIsShare(boolean IsShare) {
            this.IsShare = IsShare;
        }

        public int getDeviceID() {
            return DeviceID;
        }

        public void setDeviceID(int DeviceID) {
            this.DeviceID = DeviceID;
        }

        public String getLastOnlineTime() {
            return LastOnlineTime;
        }

        public void setLastOnlineTime(String LastOnlineTime) {
            this.LastOnlineTime = LastOnlineTime;
        }

        public String getLastOnlineIP() {
            return LastOnlineIP;
        }

        public void setLastOnlineIP(String LastOnlineIP) {
            this.LastOnlineIP = LastOnlineIP;
        }

        public boolean isIsOnline() {
            return IsOnline;
        }

        public void setIsOnline(boolean IsOnline) {
            this.IsOnline = IsOnline;
        }

        public String getSecurityKey() {
            return SecurityKey;
        }

        public void setSecurityKey(String SecurityKey) {
            this.SecurityKey = SecurityKey;
        }

        public String getCreateDate() {
            return CreateDate;
        }

        public void setCreateDate(String CreateDate) {
            this.CreateDate = CreateDate;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public boolean isIsTrans() {
            return IsTrans;
        }

        public void setIsTrans(boolean IsTrans) {
            this.IsTrans = IsTrans;
        }

        public String getTag() {
            return Tag;
        }

        public void setTag(String Tag) {
            this.Tag = Tag;
        }

        public String getCoordinate() {
            return Coordinate;
        }

        public void setCoordinate(String Coordinate) {
            this.Coordinate = Coordinate;
        }

        public String getProtocol() {
            return Protocol;
        }

        public void setProtocol(String Protocol) {
            this.Protocol = Protocol;
        }

        public int getProjectID() {
            return ProjectID;
        }

        public void setProjectID(int ProjectID) {
            this.ProjectID = ProjectID;
        }

        public List<SensorsBean> getSensors() {
            return Sensors;
        }

        public void setSensors(List<SensorsBean> Sensors) {
            this.Sensors = Sensors;
        }

        public static class SensorsBean {
            /**
             * Name : 湿度
             * Groups : 1
             * Value : 12
             * SensorType : humidity
             * DeviceID : 60370
             * DataType : 1
             * ApiTag : z_humidity
             * TransType : 0
             * TypeAttrs :
             * RecordTime : 2019-11-22 14:14:56
             * CreateDate : 2019-11-18 10:12:25
             * Protocol : 2
             * Unit : %RH
             * OperType : 1
             * OperTypeAttrs :
             */

            private String Name;
            private int Groups;
            private int Value;
            private String SensorType;
            private int DeviceID;
            private int DataType;
            private String ApiTag;
            private int TransType;
            private String TypeAttrs;
            private String RecordTime;
            private String CreateDate;
            private int Protocol;
            private String Unit;
            private int OperType;
            private String OperTypeAttrs;

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public int getGroups() {
                return Groups;
            }

            public void setGroups(int Groups) {
                this.Groups = Groups;
            }

            public int getValue() {
                return Value;
            }

            public void setValue(int Value) {
                this.Value = Value;
            }

            public String getSensorType() {
                return SensorType;
            }

            public void setSensorType(String SensorType) {
                this.SensorType = SensorType;
            }

            public int getDeviceID() {
                return DeviceID;
            }

            public void setDeviceID(int DeviceID) {
                this.DeviceID = DeviceID;
            }

            public int getDataType() {
                return DataType;
            }

            public void setDataType(int DataType) {
                this.DataType = DataType;
            }

            public String getApiTag() {
                return ApiTag;
            }

            public void setApiTag(String ApiTag) {
                this.ApiTag = ApiTag;
            }

            public int getTransType() {
                return TransType;
            }

            public void setTransType(int TransType) {
                this.TransType = TransType;
            }

            public String getTypeAttrs() {
                return TypeAttrs;
            }

            public void setTypeAttrs(String TypeAttrs) {
                this.TypeAttrs = TypeAttrs;
            }

            public String getRecordTime() {
                return RecordTime;
            }

            public void setRecordTime(String RecordTime) {
                this.RecordTime = RecordTime;
            }

            public String getCreateDate() {
                return CreateDate;
            }

            public void setCreateDate(String CreateDate) {
                this.CreateDate = CreateDate;
            }

            public int getProtocol() {
                return Protocol;
            }

            public void setProtocol(int Protocol) {
                this.Protocol = Protocol;
            }

            public String getUnit() {
                return Unit;
            }

            public void setUnit(String Unit) {
                this.Unit = Unit;
            }

            public int getOperType() {
                return OperType;
            }

            public void setOperType(int OperType) {
                this.OperType = OperType;
            }

            public String getOperTypeAttrs() {
                return OperTypeAttrs;
            }

            public void setOperTypeAttrs(String OperTypeAttrs) {
                this.OperTypeAttrs = OperTypeAttrs;
            }
        }
    }
}
