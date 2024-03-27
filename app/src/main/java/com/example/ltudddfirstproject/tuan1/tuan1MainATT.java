package com.example.ltudddfirstproject.tuan1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ltudddfirstproject.R;


public class tuan1MainATT extends AppCompatActivity {
    EditText txt1, txt2;
    Button btn1;
    TextView tv1;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan1_main);
        txt1 = findViewById(R.id.txtedit1);
        txt2 = findViewById(R.id.txtedit2);
        btn1 = findViewById(R.id.demobtn1);
        tv1 = findViewById(R.id.demotv1);

        btn1.setOnClickListener(v->{
            tinhTong();
        });
    }
    private void tinhTong() {
        String str1=txt1.getText().toString();
        float nb1=Float.parseFloat(str1);

        String str2=txt2.getText().toString();
        float nb2=Float.parseFloat(str2);

        float tong=nb1+nb2;

        tv1.setText(String.valueOf(tong));
    }

}
