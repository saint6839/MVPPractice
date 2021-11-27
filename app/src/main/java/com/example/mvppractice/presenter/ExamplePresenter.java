package com.example.mvppractice.presenter;

public interface ExamplePresenter {
    void confirm();

    interface View {
        void setText(String text);
    }
}
