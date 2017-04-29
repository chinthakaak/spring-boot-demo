package com.hello;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kushan_chinthaka on 4/29/2017.
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "index";
    }
}
