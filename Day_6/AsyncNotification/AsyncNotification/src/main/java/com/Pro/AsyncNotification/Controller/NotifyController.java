package com.Pro.AsyncNotification.Controller;

import com.Pro.AsyncNotification.Model.User;
import com.Pro.AsyncNotification.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class NotifyController {
    @Autowired
    UserService service;
    @GetMapping
    public ResponseEntity<User> addUser(@RequestBody User user){
        service.sendMail(user);
        return ResponseEntity.ok(user);
    }

}
