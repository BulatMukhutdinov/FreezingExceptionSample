package com.example.freezingexceptionsample.androidApp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.freezingexceptionsample.shared.Greeter
import com.example.freezingexceptionsample.shared.initKoin
import org.koin.android.ext.android.get
import org.koin.android.ext.koin.androidContext

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initKoin {
            androidContext(this@MainActivity)
        }

        val tv: TextView = findViewById(R.id.text_view)

        val greeter = get<Greeter>()

        tv.text = greeter.greet()
    }
}
