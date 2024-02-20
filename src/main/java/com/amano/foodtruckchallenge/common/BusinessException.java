package com.amano.foodtruckchallenge.common;

import org.springframework.transaction.interceptor.TransactionAspectSupport;

public class BusinessException extends RuntimeException {

    private Boolean report;

    private Integer errCode;
    private String errMessage;


    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Integer errCode, String errMessage) {
        super(errMessage);
        this.errCode = errCode;
        this.errMessage = errMessage;
    }

    public static BusinessException reportBusinessException(String errorMsg) {
        BusinessException businessException = new BusinessException(errorMsg);
        businessException.setReport(true);
        return businessException;
    }

    public static BusinessException reportBusinessException(String errorMsg, Throwable cause) {

        BusinessException businessException = new BusinessException(errorMsg, cause);
        businessException.setReport(true);
        TransactionAspectSupport.currentTransactionStatus().isRollbackOnly();
        return businessException;
    }

    public Boolean getReport() {
        return report;
    }

    public void setReport(Boolean report) {
        this.report = report;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
