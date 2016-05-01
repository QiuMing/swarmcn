##所做工作
* spring boot  和 dubbo 整合，主要参考于 [inux-china/spring-boot-dubbo](https://github.com/linux-china/spring-boot-dubbo)
* 初步整合swagger ,访问链接 swagger 的 http://localhost:8080/swagger-ui.html

##启动方法

###1、编译spring-boot-starter-dubbo

* spring-boot-starter-dubbo目前在github 上面有几个版本，我们这个项目采用的版本源于[inux-china/spring-boot-dubbo](https://github.com/linux-china/spring-boot-dubbo)
依赖于dubbo 3.0,而maven 中央仓库并没有提供这个两个依赖，所以我们需要自己在本地编译生成，步骤如下：

####编译dubbo3.0
    * git clone https://github.com/linux-china/dubbo.git
    * 在源码目录中执行mvn install -Dmaven.test.skip=true
    
####编译spring-boot-starter-dubbo
    * git clone https://github.com/linux-china/spring-boot-dubbo.git
    * 在源码目录中执行mvn install -Dmaven.test.skip=true
 
###2、使用redis 或者zookeeper 作为注册中心
* dubbo  支持 redis 、zookeeper 等作为注册中心，当然我们的项目也支持。
* 切换注册中心的方法，修改application.properties 里面spring.dubbo.registry 的地址就好。
* 另外，经过本地测试， spring-boot-starter-dubbo 支持redis作为注册中心，如果要使用zookeeper 
作为注册中心，需要在手动添加以下依赖


```
<!-- zookeeper begin -->  
<dependency>  
    <groupId>org.apache.zookeeper</groupId>  
    <artifactId>zookeeper</artifactId>  
    <version>3.4.6</version>  
    <exclusions>  
        <exclusion>  
            <groupId>org.slf4j</groupId>  
            <artifactId>slf4j-log4j12</artifactId>  
        </exclusion>  
    </exclusions>  
</dependency>  
<dependency>  
    <groupId>com.101tec</groupId>  
    <artifactId>zkclient</artifactId>  
    <version>0.4</version>  
</dependency>  
<!-- zookeeper end --> 
```
###3、项目启动
* 在前两部的基础上，先启动服务端项目，即service项目 ,运行swarmcn-user-service 下的SpringBootDubboServerApplication方法，
然后在启动客户端项目，即web 项目，运行swarmcn-user-web 。

##接下来要做的
* 整合mybatis、shiro
