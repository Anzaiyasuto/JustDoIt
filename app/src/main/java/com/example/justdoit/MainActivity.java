/**
 * 作成者:安齊康人
 * 作成日:2020年6月23日
 * ホーム画面について
 */

package com.example.justdoit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * ホーム画面に関する処理
 *
 */
public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListViewオブジェクトの取得
        ListView listView = (ListView) findViewById(R.id.list);

        //ArrayAdapterオブジェクト生成
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1);


        //Buttonオブジェクト取得
        Button btn_input = (Button) findViewById(R.id.btn);

        //クリックイベント
        btn_input.setOnClickListener(new Btn_InputClickListener());
    }


    private static class Btn_InputClickListener implements AdapterView.OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }
}