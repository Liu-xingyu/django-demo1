package com.springboot.demo;

import com.springboot.demo.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// RestController = ResponseBody + Controller
// RestController返回的是json类型数据，Controller返回才是设置定向的文件路径名称
@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String index() {
        return "index page";
    }

    @RequestMapping(value = "/index")
    public User index2() throws Exception {
        User user = new User();
        user.setName("xiaomi");
        user.setAge(22);
        user.setGender("female");
        return user;
    }
}
