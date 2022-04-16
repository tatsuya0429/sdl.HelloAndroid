package jp.ac.titech.itpro.sdl.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var inputName: EditText
    private lateinit var outputView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputName = findViewById<EditText>(R.id.input_your_name)
        outputView = findViewById<TextView>(R.id.output_view)
    }

    fun greet(view: View) {
        var name = inputName.text.toString().trim()
        if (name.isNotEmpty()) {
            outputView.text = "Hello ${name}!\nNice to see you!"
        }
    }
}