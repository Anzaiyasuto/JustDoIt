/**
 * 作成者:飯田
 *
 */

package com.example.justdoit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.EditText;


public class InputTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_task);

        EditText edit = new EditText(this);
        edit.setHeight(50);
        setContentView(edit);

        EditText edit = (EditText)findViewById(R.id.edit);
        android.text.InputFilter[] filters = new android.text.InputFilter[1];
        filters[0] = new android.text.InputFilter(30) {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                return source;
            }
        };
        edit.setFilters(filters);


    }

    public void onBackButtonClick(View view) {
        finish();
    }
}
