package com.example.mvppractice.presenter;

import com.example.mvppractice.model.ExampleModel;

public class ExamplePresenterImpl implements ExamplePresenter{
    private ExamplePresenter.View view;
    private ExampleModel model;

    public ExamplePresenterImpl(View view) {
        this.view = view;
        this.model = new ExampleModel();
    }

    @Override
    public void confirm() {
        view.setText(model.clickedButton());
    }
}
