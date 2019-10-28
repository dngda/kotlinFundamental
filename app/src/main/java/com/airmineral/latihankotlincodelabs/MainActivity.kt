package com.airmineral.latihankotlincodelabs

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.airmineral.latihankotlincodelabs.aboutMe.AboutMeDataBinding
import com.airmineral.latihankotlincodelabs.androidTrivia.AndroidTriviaActivity
import com.airmineral.latihankotlincodelabs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button1.setOnClickListener {
            startActivity(Intent(this, DiceRollerActivity::class.java))
        }
        binding.button2.setOnClickListener {
            startActivity(Intent(this, ColorMyViewsActivity::class.java))
        }
        binding.button3.setOnClickListener {
            startActivity(Intent(this, AboutMeDataBinding::class.java))
        }
        binding.button4.setOnClickListener {
            startActivity(Intent(this, AndroidTriviaActivity::class.java))
        }

    }
}
