package com.example.senthur_4695.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button num[]=new Button[10];
    Button add,sub,div,mul,dot,equal,del,clear;
    EditText number;
    TextView viewNum;
    double num1,num2;
    char op=' ';
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=(EditText) findViewById(R.id.numInput);
        viewNum=(TextView) findViewById(R.id.numText);
        num[0] = (Button) findViewById(R.id.num0);
        num[1] = (Button) findViewById(R.id.num1);
        num[2] = (Button) findViewById(R.id.num2);
        num[3] = (Button) findViewById(R.id.num3);
        num[4] = (Button) findViewById(R.id.num4);
        num[5] = (Button) findViewById(R.id.num5);
        num[6] = (Button) findViewById(R.id.num6);
        num[7] = (Button) findViewById(R.id.num7);
        num[8] = (Button) findViewById(R.id.num8);
        num[9] = (Button) findViewById(R.id.num9);
        clear=(Button) findViewById(R.id.clear);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        div=(Button) findViewById(R.id.div);
        dot=(Button) findViewById(R.id.deci);
        mul=(Button) findViewById(R.id.mul);
        equal=(Button) findViewById(R.id.equal);
        del=(Button) findViewById(R.id.del);
        num[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText().toString().concat("0"));
                number.setSelection(number.getText().length());
            }
        });
        num[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText().toString().concat("1"));
                number.setSelection(number.getText().length());
            }
        });
        num[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText().toString().concat("2"));
                number.setSelection(number.getText().length());
            }
        });
        num[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText().toString().concat("3"));
                number.setSelection(number.getText().length());
            }
        });
        num[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText().toString().concat("4"));
                number.setSelection(number.getText().length());
            }
        });
        num[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText().toString().concat("5"));
                number.setSelection(number.getText().length());
            }
        });
        num[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText().toString().concat("6"));
                number.setSelection(number.getText().length());
            }
        });
        num[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText().toString().concat("7"));
                number.setSelection(number.getText().length());
            }
        });
        num[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText().toString().concat("8"));
                number.setSelection(number.getText().length());
            }
        });
        num[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText().toString().concat("9"));
                number.setSelection(number.getText().length());
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!number.getText().toString().contains("."))
                number.setText(number.getText().toString().concat("."));
                number.setSelection(number.getText().length());
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {try{
                String temp=number.getText().toString();
                if(op==' ') {
                    op = '-';
                    if(number.getText().length()==0 && viewNum.getText().length()!=0)
                    {
                        viewNum.setText(String.valueOf(num1).concat("-"));
                    }else
                    {
                        viewNum.setText(temp.concat("-"));

                    }

                    num1=Double.parseDouble(temp);
                    number.setText("");

                } else {

                    num2=Double.parseDouble(temp);
                        num1=equal();
                    viewNum.setText(String.valueOf(num1).concat("-"));
                    number.setText("");
                    op='-';


                }}
            catch (Exception e)
            {

            }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {try {
                String temp=number.getText().toString();
                if(op==' ') {
                    op = '+';
                    if(number.getText().length()==0 && viewNum.getText().length()!=0)
                    {
                        viewNum.setText(String.valueOf(num1).concat("+"));
                    }else
                    {
                        viewNum.setText(temp.concat("+"));

                    }

                    num1=Double.parseDouble(temp);
                    number.setText("");

                } else {

                        num2=Double.parseDouble(temp);

                        num1=equal();
                    viewNum.setText(String.valueOf(num1).concat("+"));
                    number.setText("");
                    op='+';
                }}
            catch (Exception e)
            {

            }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {try {
                String temp=number.getText().toString();
                if(op==' ') {
                    op = 'x';
                    if(number.getText().length()==0 && viewNum.getText().length()!=0)
                    {
                        viewNum.setText(String.valueOf(num1).concat("x"));
                    }else
                    {
                        viewNum.setText(temp.concat("x"));

                    }

                    num1=Double.parseDouble(temp);
                    number.setText("");

                } else {

                        num2=Double.parseDouble(temp);

                        num1=equal();
                        viewNum.setText(String.valueOf(num1).concat("x"));
                        number.setText("");
                        op='x';
                } }
            catch (Exception e)
            {

            }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {try {
                String temp=number.getText().toString();
                if(op==' ') {
                    op = '÷';
                    if(number.getText().length()==0 && viewNum.getText().length()!=0)
                    {
                        viewNum.setText(String.valueOf(num1).concat("÷"));
                    }else
                    {
                        viewNum.setText(temp.concat("÷"));

                    }
                    num1=Double.parseDouble(temp);
                    number.setText("");

                } else {

                    num2=Double.parseDouble(temp);

                    num1=equal();
                    viewNum.setText(String.valueOf(num1).concat("÷"));
                    number.setText("");
                    op='÷';
                } }
            catch (Exception e)
            {

            }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String temp=number.getText().toString();


                        num2=Double.parseDouble(temp);

                        num1=equal();
                        viewNum.setText(String.valueOf(num1));
                        number.setText("");
                        op=' ';
                    }
                catch (Exception e)
                {

                }
            }


        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String temp=number.getText().toString();
                    if(temp.length()>0)
                    {
                        if(number.getSelectionEnd()==temp.length())
                        {
                            number.setText(temp.substring(0,temp.length()-1));
                            number.setSelection(number.getText().length());
                        }else {
                            int index = number.getSelectionEnd();
                            number.setText(temp.substring(0, index) + temp.substring(index + 1));
                            number.setSelection(index);
                        }
                    }


                }
                catch (Exception e)
                {

                }
            }


        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String temp=number.getText().toString();

                        num1=Double.NaN;
                    num2=Double.NaN;
                        number.setText("");
                        viewNum.setText("");
                        op=' ';


                }
                catch (Exception e)
                {

                }
            }


        });



    }
    public double equal()
    {
        switch (op)
        {
            case '-':
                return num1-num2;
            case '+':
                return num1+num2;
            case 'x':
                return num1*num2;
            case '÷':
                return num1/num2;
            default:
                return num1;

        }

    }
}
