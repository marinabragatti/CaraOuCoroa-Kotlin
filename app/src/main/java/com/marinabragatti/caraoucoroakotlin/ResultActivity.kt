package com.marinabragatti.caraoucoroakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Recuperar os dados passados pela MainActivity
        var numero:Int = intent.getIntExtra("numero", 0)
        if(numero == 0)
            moeda.setImageResource(R.drawable.moeda_cara)
        else
            moeda.setImageResource(R.drawable.moeda_coroa)

        buttonVoltar.setOnClickListener{
            finish()
        }
    }
}
