package com.example.room;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewWordActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.android.wordlistsql.REPLY";
    EditText mEditText;
    Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);
        mEditText = findViewById(R.id.edit_word);
        mBtn = findViewById(R.id.button_save);
        mBtn.setOnClickListener(view -> {
            Intent intent = new Intent();
            if (TextUtils.isEmpty(mEditText.getText())){
                setResult(RESULT_CANCELED,intent);
            }else{
                String word=mEditText.getText().toString();
                intent.putExtra(EXTRA_REPLY,word);
                setResult(RESULT_OK,intent);
            }
            finish();
        });
    }
}