package com.example.health

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.fragment.app.FragmentActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.health.screens.Login
import com.example.health.screens.Patient
import com.example.health.screens.Scan

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "login") {
                composable("login") {
                    Login(navController)
                }
                composable("scan") {
                    Scan(navController)
                }
                composable("patient") {
                    Patient(navController)
                }
            }
            // A surface container using the 'background' color from the theme

        }
    }
}

