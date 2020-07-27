package com.gmail.carbit3333333;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLine(UserService userService) {
//        return args -> {
//            userService.addUser(new CustomUser("admin", "$2y$08$H8UBBdc.kTgOPWaHiIR8fOH0R8sSEriePRtTrqktX31FTP/wW78oS", UserRole.ADMIN));
//            userService.addUser(new CustomUser("user", "$2y$08$H8UBBdc.kTgOPWaHiIR8fOH0R8sSEriePRtTrqktX31FTP/wW78oS", UserRole.USER));
//        };
//    }

}
