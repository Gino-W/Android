package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView screen;
    private Button ac, mul, div, min, sub, back, spot, equal, one, two, three, four, five, six, seven, eight, nine, zero;
    private String input, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen=findViewById(R.id.screen);
        ac=findViewById(R.id.ac);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        min=findViewById(R.id.min);
        sub=findViewById(R.id.sub);
        back=findViewById(R.id.back);
        spot=findViewById(R.id.spot);
        equal=findViewById(R.id.equal);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);

    }
    public void ButtonClick(View view){
        Button button = (Button)view;
        String data = button.getText().toString();
        switch (data){
            case "AC":
                input = "";
                break;
            case "x":
                Solve();
                input += "*";
                break;
            case "=":
                Solve();
                answer = input;
                break;
            case "←":
                String newText = input.substring(0, input.length()-1);
                input = newText;
                break;
            default:
                if(input == null){
                    input = "";
                }
                if(data.equals("+") || data.equals("-") || data.equals("/")){
                    Solve();
                }
                input += data;
        }
        screen.setText(input);

    }
    private void Solve(){
        if(input.split("\\+").length ==2 ){
            String number[] = input.split("\\+");
            try {
                double min = Double.parseDouble(number[0]) + Double.parseDouble(number[1]);
                input = min + "";
            }
            catch(Exception e){
                //Error
            }
        }
        else if(input.split("\\-").length > 1){
            String number[] = input.split("\\-");
            if(number[0] =="" && number.length == 2){
                number[0] = 0 + "";
            }
            try{
                double sub = 0;
                if(number.length == 2){
                    sub = Double.parseDouble(number[0]) - Double.parseDouble(number[1]);
                }
                else if(number.length == 3){
                    sub = -Double.parseDouble(number[1]) - Double.parseDouble(number[0]);
                }
                input = sub + "";
            }
            catch(Exception e){
                //Error
            }
        }
        else if(input.split("\\*").length == 2){
            String number[] = input.split("\\*");
            try{
                double mul = Double.parseDouble(number[0]) * Double.parseDouble(number[1]);
                input = mul + "";
            }
            catch(Exception e){
                //Error
            }
        }
        else if(input.split("/").length == 2){
            String number[] = input.split("/");
            try{
                double div = Double.parseDouble(number[0]) / Double.parseDouble(number[1]);
                input = div + "";
            }
            catch(Exception e){
                //Error
            }
        }
        String n[] = input.split("\\.");
        if(n.length>1){
            if(n[1].equals("0")){
                input = n[0];
            }
        }
        screen.setText(input);
    }
}
