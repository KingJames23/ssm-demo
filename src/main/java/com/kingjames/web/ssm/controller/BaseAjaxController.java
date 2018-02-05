
package com.kingjames.web.ssm.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.kingjames.web.ssm.common.AjaxResult;
import com.kingjames.web.ssm.common.ResponseCode;

/**
 * 所有异步请求继承该类
 * 
 * @author 王国云
 */
public abstract class BaseAjaxController {

    /**
     * 初始化操作成功的AjaxResult
     * 
     * @return
     */
    public AjaxResult initSuccessResult() {
        return new AjaxResult(ResponseCode.OK);
    }

    /**
     * 初始化操作成功的AjaxResult
     * 
     * @param data
     * @return
     */
    public AjaxResult initSuccessResult(Object data) {
        AjaxResult ajaxResult = new AjaxResult(ResponseCode.OK);
        if (data != null) {
            ajaxResult.setData(data);
        }

        return ajaxResult;
    }

    /**
     * 初始化操作失败的AjaxResult
     * 
     * @return
     */
    public AjaxResult initFailureResult() {
        return new AjaxResult(ResponseCode.FAIL);
    }

    /**
     * 初始化操作失败的AjaxResult
     * 
     * @param code
     * @return
     */
    public AjaxResult initFailureResult(ResponseCode code) {
        return new AjaxResult(code);
    }

    /**
     * 初始化操作失败的AjaxResult
     * 
     * @param code
     * @param errorCode
     * @return
     */
    public AjaxResult initFailureResult(ResponseCode code, String errorCode) {
        AjaxResult ajaxResult = new AjaxResult(code);
        ajaxResult.setErrorCode(errorCode);
        return ajaxResult;
    }

    /**
     * 初始化操作失败的AjaxResult
     * 
     * @param code
     * @param errorCode
     * @param data
     * @return
     */
    public AjaxResult initFailureResult(ResponseCode code, String errorCode,
        Object data) {
        AjaxResult ajaxResult = new AjaxResult(code);
        ajaxResult.setErrorCode(errorCode);
        if (data != null) {
            ajaxResult.setData(data);
        }
        return ajaxResult;
    }

    /**
     * 初始化操作失败的AjaxResult
     * 
     * @param errorCode
     *            错误码
     * @return
     */
    public AjaxResult initFailureResult(String errorCode) {
        AjaxResult ajaxResult = new AjaxResult(ResponseCode.FAIL);
        ajaxResult.setErrorCode(errorCode);
        return ajaxResult;
    }

    /**
     * 初始化操作失败的AjaxResult
     * 
     * @param errorCode
     *            错误码
     * @param data
     *            数据
     * @return
     */
    public AjaxResult initFailureResult(String errorCode, Object data) {
        AjaxResult ajaxResult = new AjaxResult(ResponseCode.FAIL);
        ajaxResult.setErrorCode(errorCode);
        if (data != null) {
            ajaxResult.setData(data);
        }
        return ajaxResult;
    }

    /**
     * 初始化包含响应码的AjaxResult
     * 
     * @param result
     *            响应码
     * @return
     */
    public AjaxResult initResult(boolean result) {
        return initResult(result, null);
    }

    /**
     * 初始化包含响应码和错误码的AjaxResult
     * 
     * @param result
     *            响应码
     * @param errorCode
     *            错误码
     * @return
     */
    public AjaxResult initResult(boolean result, String errorCode) {
        return initResult(result, errorCode, null);
    }

    /**
     * 初始化包含响应码，错误码和数据的AjaxResult
     * 
     * @param result
     *            响应码
     * @param errorCode
     *            错误码
     * @param data
     *            数据
     * @return
     */
    public AjaxResult initResult(boolean result, String errorCode,
        Object data) {
        AjaxResult ajaxResult = null;
        if (result)
            ajaxResult = new AjaxResult(ResponseCode.OK);
        else
            ajaxResult = new AjaxResult(ResponseCode.FAIL);

        if (errorCode != null)
            ajaxResult.setErrorCode(errorCode);
        if (data != null)
            ajaxResult.setData(data);
        return ajaxResult;
    }

    /**
     * 异常处理<br>
     * ajax请求catch所有异常
     * 
     * @param e
     * @return
     */
    @ExceptionHandler
    @ResponseBody
    public AjaxResult exceptionHandler(Exception e) {
        e.printStackTrace();
        return new AjaxResult(ResponseCode.FAIL);
    }

}
