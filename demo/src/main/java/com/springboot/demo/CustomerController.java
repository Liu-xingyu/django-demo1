package com.springboot.demo;

import com.springboot.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR Yrp
 * @CREATE 2018-05-23
 * 15:38
 **/
@Controller
public class CustomerController {

    @RequestMapping(value = "/jsp")
    public String index(Model model) {
        List<User> userList = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("xiao=>" + i);
            user.setAge(20 + i);
            user.setGender(i % 2 == 0 ? "male" : "female");
            userList.add(user);
        }
        // 使用model传送对象，和request.setAttribute()效果一样，但是实现起来更简单
        model.addAttribute(userList);
        return "page";
    }

}
