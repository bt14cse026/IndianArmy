package com.example.vikram.indianarmy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Donate extends AppCompatActivity {
    EditText getfn;
    EditText getln;
    EditText getemail;
    EditText getphone;
    EditText getareacode;
    EditText getAmount;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        getfn=(EditText)findViewById(R.id.editText);
        getln=(EditText)findViewById(R.id.editText2);
        getemail=(EditText)findViewById(R.id.editText3);
        getphone=(EditText)findViewById(R.id.editText4);
        getareacode=(EditText)findViewById(R.id.editText5);
        getAmount=(EditText)findViewById(R.id.editText6);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fn=getfn.getText().toString();
                String ln=getln.getText().toString();
                String email=getemail.getText().toString();
                String pnone=getphone.getText().toString();
                String areacode=getareacode.getText().toString();
                String gamount=getAmount.getText().toString();
                Intent intent=new Intent(getApplicationContext(),PaypalActivity.class);
                intent.putExtra("donerFname",fn);
                intent.putExtra("TextBox",gamount);
                startActivity(intent);

            }
        });
    }

}
