package com.myapplicationdev.android.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Get the RadioGroup object
                RadioGroup rg = findViewById(R.id.rg1);

                // Get the ID of the selected radio button in the RadioGroup
                int selectedButtonId = rg.getCheckedRadioButtonId();

                // Get the radio button object from the ID we had gotten above
                RadioButton rb = findViewById(selectedButtonId);

                // Show a Toast that display the text on the selected radio button
                Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_LONG).show();

            }
        });


    }
}
