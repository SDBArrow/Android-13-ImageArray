package com.example.android_13_imagearray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //導入圖片到陣列
    private int[] PhotoId = {R.drawable.t01, R.drawable.t02, R.drawable.t03,
            R.drawable.t04, R.drawable.t05, R.drawable.t06,
            R.drawable.t07, R.drawable.t08, R.drawable.t09, R.drawable.t10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //切換圖片
    public void choseimage (View v){
        ImageView mImage = (ImageView) findViewById(R.id.IV_imgae);
        final EditText mdigital = findViewById(R.id.ET_digital);
        if (Integer.parseInt(mdigital.getText().toString())<1 || (Integer.parseInt(mdigital.getText().toString()))>10){
            showToast("輸入錯誤");
        }else{
            mImage.setImageResource(PhotoId[(Integer.parseInt(mdigital.getText().toString()))-1]);
        }
    }
    //輸出提示
    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}