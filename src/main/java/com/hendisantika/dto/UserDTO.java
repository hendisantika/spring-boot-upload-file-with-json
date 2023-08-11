package com.hendisantika.dto;

import lombok.*;

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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private String name;

    private String address;

    private String mobileNo;

    private AddressProofDTO addressProof;
}
