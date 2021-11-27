package com.example.mvppractice.presenter;

import com.example.mvppractice.contract.Contract;
import com.example.mvppractice.model.Model;

public class PresenterImpl implements Contract.Presenter {
    private Contract.View view;
    private Model model;

    public PresenterImpl(Contract.View view) {
        this.view = view;
        this.model = new Model();
    }

    @Override
    public void addNum(int num1, int num2) {
        view.showResult(model.add(num1,num2));
    }
}
