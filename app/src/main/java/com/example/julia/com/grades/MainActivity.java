package com.example.julia.com.grades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard reportCard = new ReportCard();
        reportCard.addGrade(new Grade("Matemática", 9.5f));
        reportCard.addGrade(new Grade("Lengua", 7.5f));
        reportCard.addGrade(new Grade("Historia", 6.0f));

        Log.d("Guche test", reportCard.toString());
    }
}
