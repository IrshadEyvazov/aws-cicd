package az.example.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MsAwsCiCdApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsAwsCiCdApplication.class, args);
        System.out.println("AWS ci/cd starting...");
    }

}
