package com.example.rhdmf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdminActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        Button Ad_Coupon = findViewById(R.id.Ad_Coupon);
        Ad_Coupon.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        Intent intent = new Intent(getApplicationContext(), CouponActivity.class);
                        startActivity(intent);
                    }
                }
        );

        Button Ad_MMS = findViewById(R.id.Ad_MMS);
        Ad_MMS.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        Intent intent = new Intent(getApplicationContext(), MmsActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
