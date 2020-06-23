/**
 *
 */
package com.example.justdoit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
}