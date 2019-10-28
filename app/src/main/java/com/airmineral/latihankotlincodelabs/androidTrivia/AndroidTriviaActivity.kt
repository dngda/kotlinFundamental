package com.airmineral.latihankotlincodelabs.androidTrivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.airmineral.latihankotlincodelabs.R
import com.airmineral.latihankotlincodelabs.databinding.ActivityAndroidTriviaBinding

class AndroidTriviaActivity : AppCompatActivity() {
private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityAndroidTriviaBinding>(this, R.layout.activity_android_trivia)

        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
        NavigationUI.setupWithNavController(binding.navView, navController)

        drawerLayout = binding.drawerLayout
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)

    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}