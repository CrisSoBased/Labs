// AT2
package com.example.labs

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL
        setContentView(linearLayout)

        val button = Button(this)
        button.text = getString(R.string.button_text_at2)
        linearLayout.addView(button)

        val textViewPage = TextView(this)
        textViewPage.text = getString(R.string.at2_page)
        linearLayout.addView(textViewPage)

        val textViewData = TextView(this)
        textViewData.text = getString(R.string.data_heading)
        linearLayout.addView(textViewData)

        // Adicionando informações do aluno em uma lista vertical
        val nomeTextView = TextView(this)
        nomeTextView.text = getString(R.string.name)
        linearLayout.addView(nomeTextView)

        val numeroTextView = TextView(this)
        numeroTextView.text = getString(R.string.number)
        linearLayout.addView(numeroTextView)

        val turnoTextView = TextView(this)
        turnoTextView.text = getString(R.string.shift)
        linearLayout.addView(turnoTextView)

        val cidadeTextView = TextView(this)
        cidadeTextView.text = getString(R.string.city)
        linearLayout.addView(cidadeTextView)

        button.setOnClickListener {
            finish()
        }
    }
}
