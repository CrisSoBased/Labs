// AT1
package com.example.labs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AT1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL
        setContentView(linearLayout)

        val button = Button(this)
        button.text = getString(R.string.button_text_at1)
        linearLayout.addView(button)

        val textView = TextView(this)
        textView.text = getString(R.string.at1_page)
        linearLayout.addView(textView)

        button.setOnClickListener {
            val intent = Intent(this, AT2::class.java)
            startActivity(intent)
        }
    }
}
