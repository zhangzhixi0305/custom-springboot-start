package com.zhixi.auto;

import com.zhixi.beans.HelloProperties;
import com.zhixi.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangzhixi
 * @date 2021/4/2 22:33
 */
@Configuration
/**
 * 没有配置HelloService，下面配置才生效
 */
@ConditionalOnMissingBean(HelloService.class)
/**
 * 开启属性自动绑定,默认会将HelloProperties放在容器当中
 */
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}