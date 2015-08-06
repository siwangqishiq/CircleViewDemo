package com.xinlan.circleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.xinlan.discview.DiscView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private DiscView mDiscView;
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDiscView = (DiscView) findViewById(R.id.disc_view);
        mBtn = (Button) findViewById(R.id.btn);
        mBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        mCircleView.setStrokenWidth(30);
        mDiscView.setValue(230);
    }
}//end class
