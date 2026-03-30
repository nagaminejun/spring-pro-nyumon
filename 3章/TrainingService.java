package com.example.di.service;

import com.example.di.domain.Training;
import java.util.List;

// Service の interface
// 実務では interface を切る場合と切らない場合があるが、
// 学習用として役割を明確にするために用意している。
public interface TrainingService {

    // 研修一覧を取得する業務機能
    List<Training> findAll();
}
