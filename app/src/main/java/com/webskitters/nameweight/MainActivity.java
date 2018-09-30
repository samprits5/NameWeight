package com.webskitters.nameweight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String s, val;
    char[] chars;
    int total = 0;
    char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.editText2);
        final TextView textView = (TextView) findViewById(R.id.textView);
        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(": The Position Weights :");
                textView.append("\n\n");
                s = editText.getText().toString();
                chars = s.toUpperCase().toCharArray();

                for (int i=0; i<=(chars.length-1);i++){
                    for (int j=0; j <= (alpha.length-1); j++){
                        if (chars[i] == alpha[j]){
                            textView.append(chars[i]+ " : " + String.valueOf(j+1));
                            textView.append("\n");
                            total+=(j+1);
                        }
                    }
                }
                val = String.valueOf(total);
                textView.append("\n\n");
                textView.append("The total value is : "+val);
                total = 0;
                val=null;


            }
        });


    }
}
