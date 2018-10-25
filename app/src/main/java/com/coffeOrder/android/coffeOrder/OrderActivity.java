package com.coffeOrder.android.coffeOrder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        //getting the message from the intent
        //setting the message into the text
        Intent i = getIntent();
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(i.getStringExtra("message"));
    }
}
