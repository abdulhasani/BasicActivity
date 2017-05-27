package com.bebrayan.com.androidcomponent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /**
     * Deklarasi attribut
     */
    private Button button;
    private RadioGroup genderRadioGroup;
    private EditText name;
    private EditText age;


    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //call method findAllViewId
        findAllViewId();

    }

    /**
     * method ini berisi insialisai attribut
     * yang telah dideklarasikan diatas
     */
    private void findAllViewId(){
        button = (Button) findViewById(R.id.kirimData);
        name = (EditText) findViewById(R.id.nama);
        age = (EditText) findViewById(R.id.umur);
        genderRadioGroup = (RadioGroup) findViewById(R.id.jenisKelamin);
    }


    /**
     * event tombol kirim data akan
     * dideklarasikan pada methd onClik
     * @param v
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        //crate object bundle
        Bundle bundle = new Bundle();
        //mapping value component EditText
        bundle.putString("nama",name.getText().toString());
        bundle.putString("umur",age.getText().toString());
        int gender = genderRadioGroup.getCheckedRadioButtonId();
        RadioButton rdBtn = (RadioButton) findViewById(gender);
        bundle.putString("jeniskelamin",rdBtn.getText().toString());

        intent.putExtras(bundle);
        startActivity(intent);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.os.Debug.stopMethodTracing();
    }
}
