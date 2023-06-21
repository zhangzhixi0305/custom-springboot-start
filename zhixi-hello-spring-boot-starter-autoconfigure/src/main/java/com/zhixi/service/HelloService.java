package com.zhixi.service;

import com.zhixi.beans.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhangzhixi
 * @date 2021/4/2 22:24
 * 默认不要放在组件中,因为要在spring.factories中配置
 */
public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    /**
     * 打招呼的方法
     *
     * @return 处理后的字符串
     */
    public String sayHello(String name) {
        String prefix = helloProperties.getPrefix();
        String suffix = helloProperties.getSuffix();

        StringBuilder sb = new StringBuilder();
        if (prefix != null) {
            sb.append(prefix).append(",");
        }
        sb.append(name);
        if (suffix != null) {
            sb.append(",").append(suffix);
        }
        return sb.toString();
    }
}