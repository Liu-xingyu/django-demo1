package com.springboot.dubboconsumer;

import com.springboot.dubboconsumer.controller.CityController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class DubboConsumerApplication {

    private static CityController cityController;

    public static void main(String[] args) {

//        SpringApplication.run(DubboConsumerApplication.class, args);
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(DubboConsumerApplication.class, args);

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Logger logger = LoggerFactory.getLogger(DubboConsumerApplication.class);
        logger.info("DubboConsumerApplication类已经启动==>" + format.format(timestamp));

        cityController = run.getBean(CityController.class);
        cityController.printCity();
    }


}
