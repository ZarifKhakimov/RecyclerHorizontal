package com.example.myscrollapplication.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.myscrollapplication.R;
import androidx.appcompat.app.AppCompatActivity;

public class AdvancedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        initViews();

    }
    void initViews() {
        TextView textView = findViewById(R.id.textView);
        String text = "I know just how to #whisper, And I know just how to cry, I know just where to find the answers";
        Spannable wordToSpan = new SpannableString(text);
        wordToSpan.setSpan(new ForegroundColorSpan(Color.BLUE), 18, 27, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(wordToSpan);
    }
}
