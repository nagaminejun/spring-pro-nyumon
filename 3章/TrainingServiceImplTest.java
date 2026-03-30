package com.example.di.service;

import com.example.di.config.MockRepositoryTestConfig;
import com.example.di.domain.Training;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Spring Bootのテスト例。
// MockRepositoryTestConfig を読み込むことで、
// Service 側を変更せずに Repository の実装だけ差し替えられる。
@SpringBootTest
@Import(MockRepositoryTestConfig.class)
class TrainingServiceImplTest {

    @Autowired
    private TrainingService trainingService;

    @Test
    void findAll_shouldReturnMockData() {
        List<Training> trainings = trainingService.findAll();

        // MockTrainingRepository が返したデータを確認する
        assertEquals(2, trainings.size());
        assertEquals("Mockデータ1", trainings.get(0).getTitle());
    }
}
