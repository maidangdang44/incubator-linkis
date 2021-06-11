package com.webank.wedatasphere.linkis.common.errorcode;


public enum LinkisComputationGovernanceErrorCodeSummary {

    ENGINE_LAUNCH_REQUEST_USER_BLANK(20000,
            "请求引擎的参数中user为空",
            "请求引擎的参数中user为空",
            "EngineConnManger"),
    ENGINE_LAUNCH_REQUEST_CREATOR_BLANK(20001,
            "请求启动引擎的参数中creator为空",
            "请求启动引擎的参数中creator为空",
             "EngineConnManager"),
    ENGINE_INIT_FAILED(20002, "引擎初始化失败", "引擎初始化失败", "EngineConnManager"),

    ENGINE_REQUEST_USER_BLANK(20000, "请求引擎的参数中user为空", "请求引擎的参数中user为空", "EngineConnManger"),


    AM_EM_NOT_FOUND(20100, "请求引擎的参数中user为空", "请求引擎的参数中user为空", "EngineConnManger");
    /**
     * 错误码
     */
    private int errorCode;
    /**
     * 错误描述
     */
    private String errorDesc;
    /**
     * 错误可能出现的原因
     */
    private String comment;
    /**
     * 所属的linkis的模块
     */
    private String module;

    LinkisComputationGovernanceErrorCodeSummary(int errorCode, String errorDesc, String comment, String module) {
        ErrorCodeUtils.validateErrorCode(errorCode, 20000, 24999);
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
        this.comment = comment;
        this.module = module;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }


    @Override
    public String toString() {
        return "errorCode: " + this.errorCode + ", errorDesc:" + this.errorDesc;
    }
}
