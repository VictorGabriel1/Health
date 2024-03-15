package com.example.health.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.navigation.NavController

@Composable
fun Login(navController: NavController, modifier: Modifier = Modifier) {

    Surface (
        modifier.fillMaxSize(),
        color = Color(0xFF693AB8),
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "Bem vindo!", color = Color.White, fontSize = 9.em)
            Text(text = "Login", color = Color.White, fontSize = 9.em)
            // E-mail input
            Column ( horizontalAlignment = Alignment.Start ) {
                var user by remember { mutableStateOf("CRM09999") }
                Text(text = "Usúario", color = Color.White, fontSize = 5.em)
                OutlinedTextField(
                    shape = RoundedCornerShape(40.dp),
                    value = user, onValueChange = { user = it},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White
                    )
                )
            }
            // Password Input
            Column ( horizontalAlignment = Alignment.Start ) {
                var password by remember { mutableStateOf("senhaqualquer") }
                Text(text = "Senha", color = Color.White, fontSize = 5.em)
                OutlinedTextField(
                    shape = RoundedCornerShape(40.dp),
                    value = password,
                    onValueChange = { password = it},
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White
                    )
                )
            }
            // Login button
            Button(onClick = { navController.navigate("scan") }, colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.White
            ),) {
                Text(text = "Entrar", color = Color(0xff693ab8), fontSize = 5.em)
            }

            Column {
                Text(text = "Não tem conta?", color = Color.White)
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Cadastre-se!", color = Color.White)
                }
            }
        }
    }
}