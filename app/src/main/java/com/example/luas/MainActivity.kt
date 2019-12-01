package com.example.luas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

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
            var one = edt_Long?.text
            var two = edt_Wide?.text
            Log.d("isi","$one,$two")


                Toast.makeText(this@MainActivity, "input harus di isi", Toast.LENGTH_SHORT).show()


        }
    }
}
