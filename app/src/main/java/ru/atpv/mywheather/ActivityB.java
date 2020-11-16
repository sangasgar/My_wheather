package ru.atpv.mywheather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityB extends Activity {

    private static final String EXTRA_MESSAGE = "";

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityb);
    }

    public void enterCity(View view) {
        final TextView choose = (TextView) findViewById(R.id.cityName);
        Intent intent1 = new Intent(this, MainActivity.class);
        String message = choose.getText().toString();
        intent1.putExtra(EXTRA_MESSAGE,message.toUpperCase());
        Toast.makeText(this,"Город передан",Toast.LENGTH_SHORT).show();
        startActivity(intent1);
    }
}
