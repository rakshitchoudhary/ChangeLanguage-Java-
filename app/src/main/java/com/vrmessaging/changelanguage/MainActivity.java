package com.vrmessaging.changelanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_en, btn_fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        setUpView();
    }

    private void setUpView() {
        btn_fr = findViewById(R.id.btn_fr);
        btn_en = findViewById(R.id.btn_en);

        btn_en.setOnClickListener(this);
        btn_fr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_fr:
                String lang = "fr";

//create a string for country
                String country = "BE";
//use constructor with country
                Locale locale = new Locale(lang, country);

                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());

                finish();
                startActivity(getIntent());
                break;
            case R.id.btn_en:
                String lang1 = "en";

//create a string for country
                String country1 = "BE";
//use constructor with country
                Locale locale1 = new Locale(lang1, country1);

                Locale.setDefault(locale1);
                Configuration config1 = new Configuration();
                config1.locale = locale1;
                getBaseContext().getResources().updateConfiguration(config1,
                        getBaseContext().getResources().getDisplayMetrics());

                finish();
                startActivity(getIntent());
                break;
        }
    }
}