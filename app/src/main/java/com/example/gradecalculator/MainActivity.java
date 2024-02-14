package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7;

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        edit1 = findViewById(R.id.name_edit);
        edit2 = findViewById(R.id.inclass_edit);
        edit3 = findViewById(R.id.mid_exam_edit);
        edit4 = findViewById(R.id.end_exam_edit);
        edit5 = findViewById(R.id.total_edit);
        edit6 = findViewById(R.id.average_edit);
        edit7 = findViewById(R.id.final_edit);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calmarks();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });



    }

    public void calmarks()
    {

        int mark1,mark2,mark3,tot;
        double avg;
        String grade;
        mark1 = Integer.parseInt(edit2.getText().toString());
        mark2 = Integer.parseInt(edit3.getText().toString());
        mark3 = Integer.parseInt(edit4.getText().toString());

        tot = mark1 + mark2 + mark3;
        edit5.setText(String.valueOf(tot));
        avg = tot/3;
        edit6.setText(String.valueOf(avg));

        if(avg >= 75)
        {
            edit7.setText("A");
        }
        else if(avg >= 65)
        {
            edit7.setText("B");
        }

        else if(avg >= 55)
        {
            edit7.setText("C");
        }


        else if(avg >= 40)
        {
            edit7.setText("S");
        }

        else
        {
            edit7.setText("F");
        }
    }



    public void clear()
    {
        edit1.setText("");
        edit2.setText("");
        edit3.setText("");
        edit4.setText("");
        edit5.setText("");
        edit6.setText("");
        edit7.setText("");

        edit1.requestFocus();

    }

}


