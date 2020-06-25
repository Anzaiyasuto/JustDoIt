/**
 * 作成者:飯田
 *
 */

package com.example.justdoit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    }

    public void onBackButtonClick(View view) {
        finish();
    }
}
