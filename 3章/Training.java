package com.example.di.domain;

// 研修情報を表すシンプルなクラス
// 本題はDIなので、ドメインクラスは最小限にしています。
public class Training {

    private final Long id;
    private final String title;

    public Training(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
