package com.stackingrule.dianping.common;

/*
* Created by Stackingrule on 2019/12/29
 */
public class CommonError {

    //错误码
    private Integer errCode;

    //错误描述
    private String errMsg;


    public CommonError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
