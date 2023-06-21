package com.zhixi;

import com.zhixi.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomStartTestApplicationTests {

    @Autowired
    private HelloService helloService;

    @Test
    public void helloController() {
        System.out.println(helloService.sayHello("张志喜"));
    }

}
