package com.hendisantika.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-upload-file-with-json
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/11/23
 * Time: 09:35
 * To change this template use File | Settings | File Templates.
 */
@Service
public class FileService {
    public void saveFile(MultipartFile multipartFile, Path path) {
        try {
            File directory = new File(path.toString());
            if (!directory.exists())
                directory.mkdirs();
            Files.write
                    (path.resolve(multipartFile.getOriginalFilename()),
                            multipartFile.getBytes());
        } catch (IOException e) {
            System.out.println("Error while storing file " + e);
        }
    }
}
