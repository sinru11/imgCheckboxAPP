package com.u1065138.imgcheckboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        CheckBox chk;

        ImageView Mina,Momo,Sana,Tzuyu;

        Mina=findViewById(R.id.mina);
        Momo=findViewById(R.id.momo);
        Sana=findViewById(R.id.sana);
        Tzuyu=findViewById(R.id.tzuyu);

        Mina.setVisibility(View.GONE);
        Momo.setVisibility(View.GONE);
        Sana.setVisibility(View.GONE);
        Tzuyu.setVisibility(View.GONE);


        int[] id = {R.id.chkMina, R.id.chkMomo, R.id.chkSana, R.id.chkTzuyu};

        for (int i :id){
            chk = findViewById(i);
            if(chk.isChecked()){
                if(chk.getId()==R.id.chkMina)
                    Mina.setVisibility(View.VISIBLE);
                if(chk.getId()==R.id.chkMomo)
                    Momo.setVisibility(View.VISIBLE);
                if(chk.getId()==R.id.chkSana)
                    Sana.setVisibility(View.VISIBLE);
                if(chk.getId()==R.id.chkTzuyu)
                    Tzuyu.setVisibility(View.VISIBLE);





            }
        }


    }
}
