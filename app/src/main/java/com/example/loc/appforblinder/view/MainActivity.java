package com.example.loc.appforblinder.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.loc.appforblinder.R;
import com.example.loc.appforblinder.presenter.Presenter;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity implements ViewTextToSpeech {
    private Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();
        RelativeLayout rlayout = (RelativeLayout) findViewById(R.id.activity_main);
        rlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.captureImage();
            }
        });
    }
    private void initPresenter(){
        presenter = new Presenter(this);
    }

}
