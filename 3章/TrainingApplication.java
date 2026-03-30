package com.example.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// → Spring Bootアプリケーションの起動クラス。
//    このクラスを起点に、Springが @Service や @Repository などを探し、
//    Beanとして管理してくれる。
@SpringBootApplication
public class TrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingApplication.class, args);
    }
}
