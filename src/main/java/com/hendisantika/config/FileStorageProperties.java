package com.hendisantika.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-upload-file-with-json
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/11/23
 * Time: 10:13
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Component
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
