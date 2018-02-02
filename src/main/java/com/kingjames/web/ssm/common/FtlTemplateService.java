/**
 * @(#)FtlTemplateService.java, 2015-12-15.
 *
 * Copyright 2015 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.kingjames.web.ssm.common;

import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

/**
 * @author machao
 */
public class FtlTemplateService {

    private FreeMarkerConfigurer freemarkerConfig;

    public FtlTemplateService() {

    }

    public String generateHtmlFromFtl(String name, Map<String, Object> map)
        throws IOException, TemplateException {
        Template tmpl = freemarkerConfig.getConfiguration().getTemplate(name);
        StringWriter sw = new StringWriter();
        tmpl.process(map, sw);
        String content = sw.toString();
        return content;
    }

    public FreeMarkerConfigurer getFreemarkerConfig() {
        return freemarkerConfig;
    }

    public void setFreemarkerConfig(FreeMarkerConfigurer freemarkerConfig) {
        this.freemarkerConfig = freemarkerConfig;
    }

}
