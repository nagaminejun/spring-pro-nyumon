package com.example.di.repository;

import com.example.di.domain.Training;
import java.util.List;

// interface は「何ができるか」を定義する契約
// Service は、この interface に依存することで、
// JdbcTrainingRepository に直接ベタ依存しない設計にできる。
public interface TrainingRepository {

    // 研修一覧を取得する機能
    List<Training> selectAll();
}
