package com.example.mvppractice.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mvppractice.R;
import com.example.mvppractice.contract.Contract;
import com.example.mvppractice.presenter.PresenterImpl;

public class MainActivity extends AppCompatActivity implements Contract.View {
    private TextView textView;
    private Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterImpl(this);
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNum(10,10);
            }
        });
    }

    @Override
    public void showResult(int value) {
        textView.setText(String.valueOf(value));
    }
}