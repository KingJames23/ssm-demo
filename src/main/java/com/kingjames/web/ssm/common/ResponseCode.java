/**
 * @(#)ResponseCode.java, 2015年8月20日.
 *
 * Copyright 2015 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.kingjames.web.ssm.common;

/**
 * 返回的code
 * 
 * @author 王国云
 */
public enum ResponseCode {
    OK("200"), // 成功响应
    ILLEGAL("400"), //非法请求
    FAIL("500"), // 服务器内部错误
    NODATA("600");

    private String code;

    private ResponseCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String toString() {
        return code;
    }
}
