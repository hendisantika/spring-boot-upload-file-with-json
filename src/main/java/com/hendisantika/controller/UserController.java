package com.hendisantika.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hendisantika.dto.User;
import com.hendisantika.dto.UserDTO;
import com.hendisantika.service.FileService;
import com.hendisantika.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
    private final FileService fileService;

    @PostMapping("register")
    public ResponseEntity<String> registerUser(@ModelAttribute UserDTO userDTO) {
        registrationService.registerUser(userDTO);
        return new ResponseEntity<>
                ("User registered successfully.",
                        HttpStatus.CREATED);
    }

    private final ObjectMapper objectMapper;

    @PostMapping("/json-object-file-upload")
    public User uploadFile(@RequestParam("model") String jsonObject, @RequestParam("file") MultipartFile file) {
        User response = null;
        try {
            String fileName = fileService.storeFile(file);
            ServletUriComponentsBuilder.fromCurrentContextPath().path(fileName).toUriString();
            response = objectMapper.readValue(jsonObject, User.class);
            response.setImage(file.getOriginalFilename());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return response;
    }
}
