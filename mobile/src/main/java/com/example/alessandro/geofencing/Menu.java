package com.example.alessandro.geofencing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton pdfButton = (ImageButton)findViewById(R.id.buttonPdf);
        pdfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Pdfviewer.class);
                startActivity(intent);
            }
        });

        ImageButton offersButton = (ImageButton)findViewById(R.id.buttonOffers);
        offersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Offers.class);
                startActivity(intent);
            }
        });
    }
}
