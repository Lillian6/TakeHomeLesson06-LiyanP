package com.example.pengbuding.tipcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView receiptTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receiptTextView = (TextView) findViewById(R.id.result_text_view);
        Intent intent = getIntent();
        Receipt receipt = (Receipt) intent.getSerializableExtra(Keys.RECEIPT_KEY);
        receiptTextView.setText(receipt.toString());
    }
}
