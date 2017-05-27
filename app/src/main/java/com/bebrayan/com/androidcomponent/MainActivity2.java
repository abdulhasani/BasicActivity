package com.bebrayan.com.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle data = getIntent().getExtras();

        TextView name = (TextView) findViewById(R.id.nameValue);
        TextView age = (TextView) findViewById(R.id.umurValue);
        TextView gender = (TextView) findViewById(R.id.jenisKelaminValue);

        name.setText(data.getCharSequence("nama"));
        age.setText(data.getCharSequence("umur"));
        gender.setText(data.getCharSequence("jeniskelamin"));

    }
}
