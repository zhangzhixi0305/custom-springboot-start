# custom-springboot-start
>自定义SpringBoot-Start简单实现,在调用者的SpringBoot项目中，引入自定义的SpringBoot-Start，即可在调用者的SpringBoot项目中使用自定义的SpringBoot-Start提供的功能； 

>实现的功能：在调用sayHello()方法时，如果在配置文件中配置了：zhixi.hello.prefix，zhixi.hello.suffix 属性，则在调用sayHello()方法时，会在前后拼接上这两个属性的值；

## 1. 项目结构
[zhixi-hello-spring-boot-starter-autoconfigure](zhixi-hello-spring-boot-starter-autoconfigure)：自定义SpringBoot-Start的自动配置模块；  
[zhixi-hello-spring-boot-starter](zhixi-hello-spring-boot-starter)：自定义SpringBoot-Start的启动模块；    
[custom-start-test](custom-start-test)：自定义SpringBoot-Start的测试模块；