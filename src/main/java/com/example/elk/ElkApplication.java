package com.example.elk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ElkApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ElkApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        int i = 0;
        while (true) {
            Thread.sleep(3000);
            if (1 != 1) {
                break;
            }
            log.info("Hello World ::: {}", ++i);
        }
    }
}
