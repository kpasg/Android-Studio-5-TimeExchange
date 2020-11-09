package com.example.a005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText a1,b2,c3,d4,e5,f6;
    TextView fa,fb,fc,fd,fe,ff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fa = (TextView)findViewById(R.id.textView11);
        fb = (TextView)findViewById(R.id.textView13);
        fc = (TextView)findViewById(R.id.textView15);
        fd = (TextView)findViewById(R.id.textView16);
        fe = (TextView)findViewById(R.id.textView18);
        ff = (TextView)findViewById(R.id.textView20);

        a1 = (EditText)findViewById(R.id.year);
        b2 = (EditText)findViewById(R.id.mon);
        c3= (EditText)findViewById(R.id.day);
        d4 = (EditText)findViewById(R.id.hr);
        e5 = (EditText)findViewById(R.id.min);
        f6 = (EditText)findViewById(R.id.sec);
        Button submit = (Button)findViewById(R.id.button);

        submit.setOnClickListener(new Button.OnClickListener() {


            public void onClick(View arg0) {
                fa.setText(a1.getText().toString());
                fb.setText(b2.getText().toString());
                fc.setText(c3.getText().toString());
                fd.setText(d4.getText().toString());
                fe.setText(e5.getText().toString());
                ff.setText(f6.getText().toString());


            }

        });

    }
}