package com.example.persona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class third_section extends AppCompatActivity {
    ImageView imageView;
    ImageView hr;
    ImageView git;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_section);
        imageView = findViewById(R.id.imageView2);
        hr= findViewById(R.id.imageView_hr);
        git = findViewById(R.id.imageView_git);
        button = findViewById(R.id.button_resume);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToURL("https://drive.google.com/file/d/1j-2_sCW2iRV6U0-C9-9FjST7N7UZcQld/view?usp=sharing");
            }
        });

        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToURL("https://github.com/imprasath71");
            }
        });
        hr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToURL("https://www.hackerrank.com/prasathhari085");
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToURL("https://www.linkedin.com/in/hari-prasath-1134631b2/");
            }
        });
    }

    private void goToURL(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}