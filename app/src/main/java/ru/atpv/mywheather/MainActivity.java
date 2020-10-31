package ru.atpv.mywheather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static String city = "";


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void on_click_button1(View view) {
        startActivity(new Intent(this,ActivityB.class));
        setContentView(R.layout.activity_main);
        final TextView viewText = (TextView) findViewById(R.id.temprathure);
        System.out.println("Работает");
        viewText.setText("Нижний");
        Log.d(TAG, "Кнопка работает");
        Toast.makeText(this,"Работает кнопка 1",Toast.LENGTH_SHORT).show();

    }
}