package com.example.exercicio_android_06;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        try{
            Course javaCourse = new Course("Java for Beginners", 2);

            Student student1 = new Student("Diogenes Carvalho", 1);
            Student student2 = new Student("Marlon Melo", 2);
            Student student3 = new Student("Tatiana Limongi", 3);

            javaCourse.enrollStudent(student1);
            javaCourse.enrollStudent(student2);
            javaCourse.enrollStudent(student3);

        }catch (EnrollmentLimitException e) {
            Log.i("Error", e.getMessage());
        }
    }
}