/**
 *制作者：大網啓裕
 * タスク変更画面について
 */
package com.example.justdoit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * タスクの変更をするクラス.
 * オブジェクトのpush,popが可能.
 *
 * @author Takahiro Oami
 */
public class ChangeTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_task);


    }

    private  void changeStringData(){

        EditText edit_name = (EditText)findViewById(R.id.editText_Name);
        EditText edit_level = (EditText)findViewById(R.id.editText_level);
        EditText edit_limit = (EditText)findViewById(R.id.editText_limit);

        SpannableStringBuilder sb1=  (SpannableStringBuilder)edit_name.getText();
        SpannableStringBuilder sb2 = (SpannableStringBuilder)edit_level.getText();
        SpannableStringBuilder sb3 = (SpannableStringBuilder)edit_limit.getText();
        String change_name = sb1.toString();
        String change_level = sb2.toString();
        String change_limit = sb3.toString();

    }

    public void onBackButtonClick(View view) {
        finish();
    }

    Button btn = (Button)findViewById(R.id.btn);

    public void ChangeString(){

        changeStringData();

        finish();
    }


}
