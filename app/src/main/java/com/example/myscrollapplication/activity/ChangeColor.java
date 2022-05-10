package com.example.myscrollapplication.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myscrollapplication.R;

public class ChangeColor extends AppCompatActivity {
    Spannable mspanable;
    int hashTagIsComing = 0;
    EditText editText;
    TextView textView;
    TextWatcher textWatcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_color);

        String str = "I would #like to do #something similar to the #Twitter app";

        final EditText edt = findViewById(R.id.editText2);

       // mspanable = edt.getText();

        edt.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String startChar = null;

                try{
                    startChar = Character.toString(s.charAt(start));
                    Log.i(getClass().getSimpleName(), "CHARACTER OF NEW WORD: " + startChar);
                }
                catch(Exception ex){
                    startChar = " ";
                }

                if (startChar.equals("#")) {
                    tagCheck(s.toString().substring(start), start, start + count);
                    hashTagIsComing++;
                }

                if(startChar.equals(" ")){
                    hashTagIsComing = 0;
                }

                if(hashTagIsComing != 0) {
                    tagCheck(s.toString().substring(start), start, start + count);
                    hashTagIsComing++;
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
               editText.removeTextChangedListener(textWatcher);
                colorText(s.toString());
            }

            private void colorText(String s) {
                if (!TextUtils.isEmpty(s)) {
                    Spannable spannable = new SpannableString(s);
                    int position = 0;
                    position = s.indexOf("#", position);
                    while (position != -1) {
                        colorSpannable(spannable, position, s.indexOf(" ", position + 1) != -1 ? s.indexOf(" ", position + 1) : s.length());
                        position = s.indexOf("#", position + 1);
                    }
                    textView.setText(spannable);
                }
                editText.addTextChangedListener(textWatcher);
            }

            private void colorSpannable(Spannable s, int start, int end){
                s.setSpan(new ForegroundColorSpan(Color.BLUE), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        });



    }


    private void tagCheck(String s, int start, int end) {
        mspanable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.color)), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
    }

}
