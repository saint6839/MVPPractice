package com.example.mvppractice;

public class PresenterImpl implements Presenter{
    private Presenter.View view;
    private Model model;

    public PresenterImpl(View view) {
        this.view = view;
        this.model = new Model();
    }

    @Override
    public void confirm() {
        if (view != null) {
            view.setText(model.clickedTextView());
        }
    }
}
