package com.zhixi.beans;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhangzhixi
 * @date 2021/4/2 22:26
 */
@ConfigurationProperties("zhixi.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}