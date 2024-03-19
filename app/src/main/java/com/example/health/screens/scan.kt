package com.example.health.screens

import android.util.Log
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricManager.Authenticators.BIOMETRIC_STRONG
import androidx.biometric.BiometricPrompt
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.navigation.NavController
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity

@Composable
fun Scan(navController: NavController, modifier: Modifier = Modifier) {
    val context = LocalContext.current as FragmentActivity
    val biometricManager = remember { BiometricManager.from(context) }

    val canAuthenticateWithBiometrics = when (biometricManager.canAuthenticate(BiometricManager.Authenticators.BIOMETRIC_WEAK)) {
        BiometricManager.BIOMETRIC_SUCCESS -> true
        else -> {
            Log.e("TAG", "Device does not support strong biometric authentication")
            false
        }
    }

    val executor = remember { ContextCompat.getMainExecutor(context) }
    val biometricPrompt = BiometricPrompt(
        context as FragmentActivity,
        executor,
        object : BiometricPrompt.AuthenticationCallback() {
            override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                super.onAuthenticationError(errorCode, errString)
                // handle authentication error here
            }

            override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                super.onAuthenticationSucceeded(result)
                // handle authentication success here
                navController.navigate("patient")
            }

            override fun onAuthenticationFailed() {
                super.onAuthenticationFailed()
                // handle authentication failure here
            }
        }
    )

    val promptInfo = BiometricPrompt.PromptInfo.Builder()
        .setAllowedAuthenticators(BIOMETRIC_STRONG)
        .setTitle("Biometric Authentication")
        .setSubtitle("Log in using your biometric credential")
        .setNegativeButtonText("Use account password")
        .build()

    Surface (modifier.fillMaxSize(), color = Color(0xFFFFFFFF),) {
        Column {
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
                    .background(Color(0xff693ab8))
            ) {
                Row (Modifier.fillMaxSize().padding(20.dp, 0.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically){
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Menu, "menu", Modifier.size(40.dp))
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.AccountCircle, "perfil", Modifier.size(40.dp))
                    }
                }
            }
            Column (
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Column (
                    Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp), horizontalAlignment = Alignment.End) {
                    Text(text = "Dra. Júlia Lins", fontSize = 4.em)
                    Text(text = "CRM 09999", fontSize = 4.em)
                }
                Text(
                    text = "Paciente, coloque sua digital\npara acessar seu prontuario\nmédico.",
                    fontSize = 4.em,
                    textAlign = TextAlign.Center
                )
                Button(onClick = {
                    if(canAuthenticateWithBiometrics) {
                        biometricPrompt.authenticate(promptInfo)
                    } else {
                        navController.navigate("patient")
                    }
                }) {
                    Text(
                        text = "Escanear biometria",
                        fontSize = 5.em
                    )
                }
                Text(
                    text = "Ao escanear sua biometria, o paciente receberá\num e-mail o informando sobre o acesso e suas\ninformações.",
                    fontSize = 4.em,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }

    }
}
