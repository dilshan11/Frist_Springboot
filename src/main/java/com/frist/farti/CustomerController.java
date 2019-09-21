package com.frist.farti;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("frist")
public class CustomerController {

    @GetMapping
    public String saveCustomer(){
        System.out.println("save custome");
        return "hiiiiiiiiiiiii ";
    }
}
