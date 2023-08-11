# spring-boot-upload-file-with-json

### Things ToDo List

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-upload-file-with-json.git`
2. Navigate to the folder: `cd spring-boot-upload-file-with-json`
3. Run the application: `mvn clean spring-boot:run`
4. Run this cURL:

```shell
curl --location 'localhost:8080/user/register' \
--form 'name="Uzumaki Naruto"' \
--form 'address="KONOHA"' \
--form 'mobileNo="081321411800"' \
--form 'addressProof.file=@"/Users/hendisantika/Desktop/islamic times.png"' \
--form 'addressProof.documentType="LOGO"'
```


