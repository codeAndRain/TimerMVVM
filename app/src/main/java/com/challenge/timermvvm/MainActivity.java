package com.challenge.timermvvm;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.timer_text)
    TextView timerTexView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        TimerViewModel timerViewModel = ViewModelProviders.of(this).get(TimerViewModel.class);

        timerViewModel.getTimerMutableLiveData().observe(this, timerValue -> timerTexView.setText(timerValue));
    }
}
