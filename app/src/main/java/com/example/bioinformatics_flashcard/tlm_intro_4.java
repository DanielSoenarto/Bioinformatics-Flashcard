package com.example.bioinformatics_flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tlm_intro_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlm_intro4);
    }

    public void launch_TLM_3(View v){
        Intent i = new Intent(this, tlm_intro_3.class);
        startActivity(i);
    }

    public void launch_TLM_5(View a){
        Intent i = new Intent(this, tlm_intro_5.class);
        startActivity(i);
    }
}