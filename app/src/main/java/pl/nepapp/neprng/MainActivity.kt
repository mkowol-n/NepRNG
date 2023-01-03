package pl.nepapp.neprng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.generateButton).setOnClickListener {
            val text = findViewById<TextView>(R.id.randomNumber)
            text.text = Random.nextInt(0, 1000).toString()
        }
    }
}