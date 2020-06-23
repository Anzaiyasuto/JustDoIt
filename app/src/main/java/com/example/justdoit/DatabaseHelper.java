/**
 * 作成者:安齊康人
 * 作成日:2020年6月24日
 * データベース操作のためのクラス
 */
package com.example.justdoit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * データベース処理の核
 * データベースヘルパークラス
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    /**
     * データベースファイル名の定数フィールド
     */
    private static final String DATABASE_NAME = "justdoit.db";
    /**
     * バージョン情報の定数フィールド
     */
    private  static final int DATABASE_VERSION = 1;

    /**
     * コンストラクタ
     * @param context　コンテキストです
     */
    public DatabaseHelper(Context context) {
        //親クラスであるSQLiteOpenHelperのコンストラクタの呼び出し
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * 編集した場合は必ずアプリをアンインストール
     * さもなくばデータベースが残る
     * @param db データベース(justdoit.db)を表す
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        //テーブル作成用SQL文字列の作成 (id(key), name, level, limit, congress)
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE justdoit(");
        //task_idを主キーとする
        sb.append("task_id INTEGER PRIMARY KEY,");
        sb.append("task_name TEXT,");
        sb.append("task_level INTEGER,");
        //日にち情報はデータベース上で何型のデータなのか?
        sb.append("task_limit ???,");
        sb.append("task_congress INTEGER");
        sb.append(");");
        String sql = sb.toString();

        //SQLの実行
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
