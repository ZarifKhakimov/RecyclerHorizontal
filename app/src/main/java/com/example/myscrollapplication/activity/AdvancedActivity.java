package com.example.myscrollapplication.activity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myscrollapplication.R;
import com.google.android.material.textfield.TextInputLayout;

import androidx.appcompat.app.AppCompatActivity;

public class AdvancedActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textt);
        initViews();

    }
    void initViews() {
//        TextView textView = findViewById(R.id.textView);
//        String text = "I know just how to #whisper, And I know just how to cry, I know just where to find the answers";
//        Spannable wordToSpan = new SpannableString(text);
//        wordToSpan.setSpan(new ForegroundColorSpan(Color.BLUE), 18, 27, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        textView.setText(wordToSpan);
//        TextInputLayout numberInputLayout = (TextInputLayout) view.findViewById(R.id.number_input_layout);
//        EditText numberEditText = (EditText) getView().findViewById(R.id.edit_text);
//        numberInputLayout.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
//        numberInputLayout.setErrorEnabled(true);
//        numberInputLayout.setError("Tis an error dear");
//        Toast.makeText(getActivity(), "error", Toast.LENGTH_SHORT).show();
//    }
//
//    private Context getActivity() {
//
//        return null;
//    }
//
//    private View getView() {
//        return view;
    }
}
