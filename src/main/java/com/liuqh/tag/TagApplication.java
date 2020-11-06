package com.liuqh.tag;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * LL
 * 2020年10月23日 下午2:52:58
 */
//@MapperScan("com.liuqh.tag.dao")
@SpringBootApplication
public class TagApplication {
    public static void main(String[] args) {
        SpringApplication.run(TagApplication.class, args);
    }
}
