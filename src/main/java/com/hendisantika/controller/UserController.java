package com.hendisantika.controller;

import com.hendisantika.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-upload-file-with-json
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/11/23
 * Time: 09:34
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final RegistrationService registrationService;

    @PostMapping("register")
    public ResponseEntity<String> registerUser(@ModelAttribute UserDTO userDTO) {

        registrationService.registerUser(userDTO);
        return new ResponseEntity<>
                ("User registered successfully.",
                        HttpStatus.CREATED);
    }
}
