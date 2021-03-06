package com.example.myscrollapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        EditText edittext;
        edittext = (EditText) findViewById(R.id.editText1);

        edittext.setOnKeyListener(new EditText.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                return false;
            }
        });

        initViews();

    }

    void initViews() {
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        Button go1 = (Button) findViewById(R.id.Go1);

        go1.setEnabled(false); //Default turning off my button


        TextWatcher watcher = new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                go1.setEnabled(!TextUtils.isEmpty(input1.getText())
                        && !TextUtils.isEmpty(input2.getText()));
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        };

        input1.addTextChangedListener(watcher);
        input2.addTextChangedListener(watcher);
    }

    


}
