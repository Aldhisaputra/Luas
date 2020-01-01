package com.example.luas


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            var longRectangle = edt_Long?.text.toString()
            var wide = edt_Wide?.text.toString()


            if (longRectangle == "") {
                Toast.makeText(this@MainActivity, "Panjang harus di isi", Toast.LENGTH_SHORT).show()

            } else if (wide == "") {
                Toast.makeText(this@MainActivity, "Lebar harus di isi", Toast.LENGTH_SHORT).show()


            }else{
                var large = longRectangle.toInt() * wide.toInt()
                edt_Result?.setText("$large")
            }
             






        }
        }
    }










