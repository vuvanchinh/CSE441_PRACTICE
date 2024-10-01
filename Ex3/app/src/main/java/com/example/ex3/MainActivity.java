package com.example.ex3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText edta, edtb, edtc;
    private Button btncong, btntru, btnnhan, btnchia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btncong = findViewById(R.id.btncong);
        btntru = findViewById(R.id.btntru);
        btnnhan = findViewById(R.id.btnnhan);
        btnchia = findViewById(R.id.btnchia);

        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt("0"+edta.getText());
                int b = Integer.parseInt("0"+edtb.getText());

                edtc.setText("a + b = " +(a+b));
            }
        });

        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt("0"+edta.getText());
                int b = Integer.parseInt("0"+edtb.getText());

                edtc.setText("a - b = " +(a-b));
            }
        });

        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(""+edta.getText());
                int b = Integer.parseInt(""+edtb.getText());

                edtc.setText(a*b);
            }
        });

        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt("0"+edta.getText());
                int b = Integer.parseInt("0"+edtb.getText());

                if (b==0){
                    edtc.setText("Giá trị b không thỏa mãn");
                }else {
                    edtc.setText("a / b = " +(a/b));
                }
            }
        });

    }
}