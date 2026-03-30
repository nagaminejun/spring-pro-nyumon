package com.example.di.config;

import com.example.di.repository.MockTrainingRepository;
import com.example.di.repository.TrainingRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// テスト時だけ使う設定クラスの例。
// ここが「別のところ」に近い役割を持つ。
@Configuration
public class MockRepositoryTestConfig {

    @Bean
    @Primary
    public TrainingRepository trainingRepository() {
        // テスト時は JdbcTrainingRepository ではなく
        // MockTrainingRepository を優先して使う。
        return new MockTrainingRepository();
    }
}
