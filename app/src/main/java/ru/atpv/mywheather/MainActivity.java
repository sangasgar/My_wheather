package ru.atpv.mywheather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final String EXTRA_MESSAGE = "";
    private static String city = "";
    private static String[] cityWord = {"МОСКВА","ЕРЕВАН","САНКТ-ПЕТЕРБУРГ"};
    private static String[] temprathure = {"+10","+20","+8"};



    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView viewText = (TextView) findViewById(R.id.City);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        viewText.setText(message);
        final TextView temp = (TextView) findViewById(R.id.temprathure);

        try {
            if(message.equals(cityWord[0])) {
                temp.setText(temprathure[0]);
            } else if (message.equals(cityWord[1])) {
                temp.setText(temprathure[1]);
            } else if (message.equals(cityWord[2])) {
                temp.setText(temprathure[2]);
            } else  {
                temp.setText(temprathure[0]);
            }
        } catch (Exception e) {
            viewText.setText(cityWord[0]);
            e.printStackTrace();
        }
    }


    public void on_click_button1(View view) {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Кнопка работает");
        Toast.makeText(this,"Работает кнопка 1",Toast.LENGTH_SHORT).show();


    }

}