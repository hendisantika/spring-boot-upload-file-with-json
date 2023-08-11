package com.hendisantika.service;

import com.hendisantika.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-upload-file-with-json
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/11/23
 * Time: 09:36
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class RegistrationService {
    private final FileService fileService;

    public void registerUser(UserDTO userDTO) {
        //TODO Add code to store user basic details like name, address etc
        // 2L should be replaced by dynamic user id which will be generated after storing user details
        fileService.saveFile
                (userDTO.getAddressProof().getFile(),
                        getFilePath("F:\\TEST",
                                userDTO.getAddressProof().getDocumentType(), 2L));
    }
}
