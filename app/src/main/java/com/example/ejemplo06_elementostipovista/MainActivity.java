package com.example.ejemplo06_elementostipovista;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

public class MainActivity extends AppCompatActivity {

    private Switch aSwitch;
    private CheckBox cbBox;
    private Button btnRegistrar;
    private ToggleButton tb;
    private RadioGroup radioGroup;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.swMain);
        btnRegistrar = findViewById(R.id.btnCheckMain);
        cbBox = findViewById(R.id.cbCheckBoxMain);


        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Switch switch1 = (Switch) compoundButton;

                if (b) {
                    Log.d("SWITCH", switch1.getTextOn().toString());
                    btnRegistrar.setEnabled(true);
                } else {
                    Log.d("SWITCH", switch1.getTextOff().toString());
                    btnRegistrar.setEnabled(false);
                }
            }
        });

        aSwitch.isChecked();

    }




}
