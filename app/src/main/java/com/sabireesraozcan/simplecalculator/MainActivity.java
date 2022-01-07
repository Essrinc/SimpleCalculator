package com.sabireesraozcan.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //aşağıda tanımlamaları yaptım, int x; gibi.
    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tanımlama tiplerini yazmıyorum. edittext vs yazsaydım bir tane daha int yazmak gibi olurdu yani başka değişken gibi.
        //burda yukarıdaki referans al dedik.
        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);


    }

    public void sum(View view){

        //
        if (number1Text.getText().toString().matches( "") || number2Text.getText().toString().matches( "")){
            resultText.setText("Enter Number!");
        } else {
            //mesela burda d gettext string getirtti hemen ama intlerle işlem yapmak istedim, stringle değil.
            //o yüzden Integer.parseInt diyerek inte çevirdim.
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result: " + result);
            //setText benden (result) bunu kabul etmezdi string isterdi o yüzden  "" olayına girdim.
            //başında bir metin olduğu için bizim için direkt stringe çevirdi sayılır.

        }

    }

    public void deduct(View view){

        // ==  "" şeklinde boş mu diye kontrol edemezsin stringde, matchesle edebilirsin.
        if (number1Text.getText().toString().matches( "") || number2Text.getText().toString().matches( "")){
            resultText.setText("Enter Number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result: " + result);

        }
    }

    public void multiply(View view){
        if (number1Text.getText().toString().matches( "") || number2Text.getText().toString().matches( "")){
            resultText.setText("Enter Number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result: " + result);

        }

    }

    public void divide(View view){
        if (number1Text.getText().toString().matches( "") || number2Text.getText().toString().matches( "")){
            resultText.setText("Enter Number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 / number2;

            resultText.setText("Result: " + result);

        }

    }
}

//if olayını her işleme sonradan ekledim, neden?
//kullanıcı yanlış yapmaz, senin kodun eksiktir.
//öncelikle harf girmesini layoutta inputtype'dan engelledim. sadece sayı.
//sayı girmez de boş bırakırsa diye de koşulumu ekledim.