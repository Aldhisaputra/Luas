package com.example.luas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.makeText
import kotlin.Int as Int1

class MainActivity : AppCompatActivity() {

    var edt_Long: EditText? = null
    var edt_Wide: EditText? = null
    var btn_Hitung: Button? = null
    var edt_Result: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_Long = findViewById(R.id.edt_Long)
        edt_Wide = findViewById(R.id.edt_Wide)
        btn_Hitung = findViewById(R.id.btn_Hitung)
        edt_Result =findViewById(R.id.edt_Result)


        btn_Hitung?.setOnClickListener {
            var P = edt_Long?.text.toString().toInt()
            var l = edt_Wide?.text.toString().toInt()
            var L = P*l
            edt_Result?.setText(L)





        }
    }
}
