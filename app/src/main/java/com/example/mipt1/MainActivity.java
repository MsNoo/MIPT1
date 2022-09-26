package com.example.mipt1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    private Typeface tvMainFontFamily;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = (TextView)findViewById(R.id.tvMain);
        tvMainFontFamily = getResources().getFont(R.font.paprika);
    }

    public void onBtnChangeTextClick(View view) {
        tvMain.setText("Good morning town");
    }

    public void onBtnChangeColorClick(View view) {
        tvMain.setTextColor(Color.parseColor("#FFBF00"));
    }

    public void onBtnMakeBoldAndUnderline(View view) {
        tvMain.setTypeface(null,Typeface.BOLD);
        tvMain.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        tvMain.setTypeface(tvMainFontFamily);
        tvMain.setTextSize(40);
    }
}