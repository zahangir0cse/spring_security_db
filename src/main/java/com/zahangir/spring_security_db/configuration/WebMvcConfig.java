package com.zahangir.spring_security_db.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Zahangir Alam on 2018-07-27.
 */
@Configuration
public class WebMvcConfig {
    @Bean
    public BCryptPasswordEncoder getBCryptPasswordEncoder(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
}
