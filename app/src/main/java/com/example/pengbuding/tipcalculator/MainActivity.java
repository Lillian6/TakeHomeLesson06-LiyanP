package com.example.pengbuding.tipcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText amountEditText;
    private EditText taxPercentageEditText;
    private EditText tipPercentageEditText;
    private Button submitButton;

    private double amount;
    private double taxPercentage;
    private double tipPercentage;
    private double totalPrice;
    private Receipt receipt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountEditText = (EditText) findViewById(R.id.amount_edit_text);
        taxPercentageEditText = (EditText) findViewById(R.id.tax_percentage_edit_text);
        tipPercentageEditText = (EditText) findViewById(R.id.tip_percentage_edit_text);
        submitButton = (Button) findViewById(R.id.submit_button);



        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = Double.parseDouble(amountEditText.getText().toString());
                taxPercentage = Double.parseDouble(taxPercentageEditText.getText().toString());
                tipPercentage = Double.parseDouble(tipPercentageEditText.getText().toString());
                totalPrice = amount + amount * taxPercentage + amount * tipPercentage;

                receipt = new Receipt(amount, taxPercentage, tipPercentage, totalPrice);
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                intent.putExtra(Keys.RECEIPT_KEY, receipt);
                startActivity(intent);
            }
        });


    }

}
