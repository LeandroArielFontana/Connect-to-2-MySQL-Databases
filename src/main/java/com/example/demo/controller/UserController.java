package com.example.demo.controller;

import java.util.List;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.User;

/*controller que expondrá la información obtenida vía HTTP a través de un servicio REST*/

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/users")
    @ResponseBody
    public ResponseEntity getUsers() {
        return new ResponseEntity(service.getUsers(), HttpStatus.OK);
    }
}
