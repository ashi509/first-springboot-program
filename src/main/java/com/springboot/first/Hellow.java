package com.springboot.first;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hellow {

    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public ResponseEntity<?>show(){
        return ResponseEntity.status(HttpStatus.OK).body("hellow Ashhish");
    }


}
