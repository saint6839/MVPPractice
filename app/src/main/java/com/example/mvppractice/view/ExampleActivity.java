package com.example.mvppractice.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mvppractice.R;
import com.example.mvppractice.presenter.ExamplePresenter;
import com.example.mvppractice.presenter.ExamplePresenterImpl;

public class ExampleActivity extends AppCompatActivity implements ExamplePresenter.View {
    private TextView textView;
    private ExamplePresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        presenter = new ExamplePresenterImpl(this);

        textView = findViewById(R.id.textView2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.confirm();
            }
        });
    }

    @Override
    public void setText(String text) {
        textView.setText(text);
    }
}