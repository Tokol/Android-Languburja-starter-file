package com.icms.langurburja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    ImageButton club, king, diamond, heart, flag,spade;
    Button roll;
    TextView selectedDice;
    FrameLayout frame1, frame2, frame3, frame4, frame5, frame6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        club = findViewById(R.id.clubsBtn);
        king = findViewById(R.id.kingsBtn);
        diamond = findViewById(R.id.diamondBtn);
        heart = findViewById(R.id.heartBtn);
        flag = findViewById(R.id.flagBtn);
        spade = findViewById(R.id.spadeBtn);

        roll = findViewById(R.id.roll_btn);

        selectedDice = findViewById(R.id.selected_dice_msg);


        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }








}