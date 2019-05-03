package org.saber.blogfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BlogFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogFileApplication.class, args);
    }

}
