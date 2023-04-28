package com.example.prac12;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import jakarta.annotation.PreDestroy;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.nio.charset.StandardCharsets;

@Component
public class FileHandler {

    @Value("#{springApplicationArguments.nonOptionArgs[0]}")
    private String file1Path;
    @Value("#{springApplicationArguments.nonOptionArgs[1]}")
    private String file2Path;
    private String mainPath = "C:/Users/georn/Desktop/javaSpringWorks/practice/prac12/src/main/java/com/example/prac12/";

    @PostConstruct
    public void hashFile() throws Exception{
        try(FileReader reader = new FileReader(this.mainPath + this.file1Path))
        {
            int c;
            String data = "";
            while((c=reader.read())!=-1){
                data += (char)c;
            }


            try(FileWriter writer = new FileWriter(this.mainPath + this.file2Path, false))
            {

                Cipher cipher = Cipher.getInstance("AES");

                byte[] keyData = "abcdefghijklmnopqrstuvwx".getBytes("UTF-8");
                SecretKeySpec key = new SecretKeySpec(keyData, "AES");

                cipher.init(Cipher.ENCRYPT_MODE, key);
                byte[] plainText  = data.getBytes("UTF-8");
                byte[] cipherText = cipher.doFinal(plainText);

                String text = new String(cipherText, StandardCharsets.UTF_8);
                writer.write(text);


            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
        catch(IOException ex){

            try(FileWriter writer = new FileWriter(this.mainPath + this.file2Path, false))
            {

                writer.write("null");


            }
            catch(IOException e){

                System.out.println(e.getMessage());
            }

            System.out.println(ex.getMessage());
        }
    }

    @PreDestroy
    public void deleteFile() {
        File file = new File(this.mainPath + this.file1Path);

        if (file.exists()) {
            file.delete();
        }
    }
}
