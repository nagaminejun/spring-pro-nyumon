package com.example.di.controller;

import com.example.di.domain.Training;
import com.example.di.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Controller は画面やHTTPリクエストの入口。
// 今回は「ServiceもDIされる」ことを確認するために用意している。
@RestController
public class TrainingController {

    // Controller も具象クラスではなく Service の抽象に依存する。
    private final TrainingService trainingService;

    @Autowired
    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    @GetMapping("/trainings")
    public List<Training> findAll() {
        // Controller はServiceを呼び出すだけ。
        // 業務ロジックの詳細は Service に任せる。
        return trainingService.findAll();
    }
}
