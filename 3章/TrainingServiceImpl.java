package com.example.di.service;

import com.example.di.domain.Training;
import com.example.di.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service
// → Springに「このクラスはServiceの部品(Bean)として管理してください」と伝える。
@Service
public class TrainingServiceImpl implements TrainingService {

    // Service は具象クラス(JdbcTrainingRepository)ではなく、
    // interface(TrainingRepository)に依存する。
    //
    // これにより、実際の実装が Jdbc でも Mock でも差し替えやすくなる。
    private final TrainingRepository trainingRepository;

    // @Autowired
    // → Springへ、このServiceを作るときに必要な部品をここへ入れるよう指示をする、
    //   という意味。
    //
    // 今回の依存オブジェクトは TrainingRepository を実装したオブジェクト。
    // 例えば JdbcTrainingRepository のインスタンスがここに渡される。
    //
    // ※ 最近のSpringでは、コンストラクタが1つだけなら
    //   @Autowired は省略できることが多い。
    @Autowired
    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public List<Training> findAll() {
        // Service は「研修一覧を取得する」という機能に集中する。
        //
        // ここで大事なのは
        // 「一覧を取得できること」であって、
        // その裏側がDBなのか、Mockなのかは気にしない。
        // 外部依存となるような new XXX のようなコードは記述しないこと。
        // 「抽象」の実装のみを行うこと
        return trainingRepository.selectAll();
    }
}
