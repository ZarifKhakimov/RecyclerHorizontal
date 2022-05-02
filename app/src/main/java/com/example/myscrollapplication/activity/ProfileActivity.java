package com.example.myscrollapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myscrollapplication.R;
import com.example.myscrollapplication.model.Member;

import java.io.Serializable;

public class ProfileActivity extends AppCompatActivity {
    static final String TAG = ProfileActivity.class.toString();

    Member member;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        getMember();
    }

    void getMember(){
        TextView detail = findViewById(R.id.textview);
        Member member = (Member)getIntent().getSerializableExtra("member");
        detail.setText(member.toString());
    }

}
