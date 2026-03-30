package com.example.di.repository;

import com.example.di.domain.Training;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository
// → Springに「このクラスはRepositoryの部品(Bean)として管理してください」と伝える。
//
// このクラスは本番用の実装をイメージしている。
// 実務ではDB接続やSQL実行を書くが、ここでは学習用に固定データを返している。
@Repository
public class JdbcTrainingRepository implements TrainingRepository {

    @Override
    public List<Training> selectAll() {
        // 本来はここでDBアクセスを行うイメージ
        return List.of(
                new Training(1L, "Spring Framework 入門"),
                new Training(2L, "DI の基礎"),
                new Training(3L, "Spring Boot 実践")
        );
    }
}
