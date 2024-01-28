package com.example.targilhagash2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etFirstName,etLastName;
    TextView tvDisplay;
   Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstName = (EditText)findViewById(R.id.etFname);
        etLastName = (EditText)findViewById(R.id.etLname);
        btnSave = (Button)findViewById(R.id.btnSave);
        tvDisplay=(TextView)findViewById(R.id.tvDisplay);
        btnSave.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        if(v==btnSave)
        {
            if(etLastName.getText().toString().length()>0 && etFirstName.getText().toString().length()>0)
            {
                tvDisplay.setText(etFirstName.getText().toString() + "  " + etLastName.getText().toString());
                etFirstName.setText("");
                etLastName.setText("");
            }
        }
    }

}