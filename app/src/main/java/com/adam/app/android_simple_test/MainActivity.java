package com.adam.app.android_simple_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInfo = findViewById(R.id.hello_world);
    }

    public void test1Press(View view) {
        mInfo.setText(this.getResources().getString(R.string.label_test_when_press_test1_button));
    }
}
