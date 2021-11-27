package com.example.mvppractice;

public interface Presenter {
    void confirm();

    interface View {
        void setText(String text);
    }

}
