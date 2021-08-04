package com.example.taplyticsweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.weatherTextView)
    TextView weatherText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        String locale = "Toronto";
        float temperature = 23.4f;
        /**
         * Implement this method in WeatherApi
         */
        // float temperature = WeatherApi.getWeather(locale);
        setWeatherText(locale, temperature);
    }

    @SuppressLint("DefaultLocale")
    private void setWeatherText(String locale, float temperature) {
        weatherText.setText(String.format("The temperature in %s is %.1f \u2103", locale, temperature));
    }

}