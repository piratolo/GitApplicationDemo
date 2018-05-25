package com.depasmatte.gitapplicationdemo;

import android.content.Context;
import android.widget.Toast;

public class ClasseProva {

    public void ciao(Context context){
        Toast.makeText(context,  "Sono il metodo ciao", Toast.LENGTH_SHORT).show();
        String a = "ciao";

        a += "x";

    }

}
