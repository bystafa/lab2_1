package com.example.lr2_1_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var f1 = findViewById<TextInputEditText>(R.id.edit1)
        var f2 = findViewById<TextInputEditText>(R.id.edit2)
        var f3 = findViewById<TextInputEditText>(R.id.edit3)
        var view = findViewById<TextView>(R.id.view1)
        var view2 = findViewById<TextView>(R.id.view2)

        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            var a = f1.text.toString().toDouble()
            var b = f2.text.toString().toDouble()
            var c = f3.text.toString().toDouble()
            var d = b*b - 4*a*c
            view.text = "${a}x^2 + ${b}x + ${c},\n D = ${d}"
            if(d < 0)
                view2.text = "Решений нет"
            else{
                var x1 = (-b + sqrt(d))/2*a
                var x2 = (-b - sqrt(d))/2*a
                if(d == 0.0)
                    view2.text = "x = ${x1}"
                else {
                    view2.text = "x1 = ${x1}, x2 = ${x2}"
                }
            }

        }
    }
}