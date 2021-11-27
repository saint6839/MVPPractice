package com.example.mvppractice.contract;

public interface Contract {
    interface View {
        void showResult(int value);
    }

    interface Presenter {
        void addNum(int num1, int num2);
    }
}
