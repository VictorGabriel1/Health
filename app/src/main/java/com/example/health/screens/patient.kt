package com.example.health.screens

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.navigation.NavController

@Composable
fun Patient (navController: NavController, modifier: Modifier = Modifier) {
    Surface (modifier.fillMaxSize(), color = Color(0xFFFFFFFF),) {
        var offset by remember { mutableStateOf(0f) }
        Column (
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())) {
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
                    .background(Color(0xff693ab8))
            ) {
                Row (
                    Modifier
                        .fillMaxSize()
                        .padding(20.dp, 0.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Prontuário Médico",
                        fontSize = 5.em,
                        color = Color.White
                    )
                }
            }
            Column (modifier.fillMaxSize()) {
                Row (
                    Modifier
                        .padding(20.dp, 0.dp)
                        .fillMaxWidth()
                        .height(100.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Joana Silva", fontSize = 7.em, fontWeight = FontWeight.Bold)
                    IconButton(onClick = { /*TODO*/ }, Modifier.size(70.dp)) {
                        Icon(
                            Icons.Filled.AccountCircle,
                            "perfil",
                            Modifier.size(70.dp)
                        )
                    }
                }
                Column (
                    Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "25 anos", fontSize = 4.em)
                    Text(text = "Sexo: Feminino", fontSize = 4.em)
                    Text(text = "Tipo sanguinio: B+", fontSize = 4.em)
                }
                Column (
                    Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "Histórico médico:", fontWeight = FontWeight.Bold, fontSize = 4.em)
                    Text(text = " - Alergias: Nenhuma conhecida", fontSize = 4.em)
                    Text(text = " - Doenças Crônicas: Nenhuma", fontSize = 4.em)
                    Text(text = " - Cirurgias Anteriores: Apêndice(2010)", fontSize = 4.em)
                }
                Column (
                    Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "Medicações Atuais:", fontWeight = FontWeight.Bold, fontSize = 4.em)
                    Text(text = " - Nenhuma", fontSize = 4.em)

                }
                Column (
                    Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "Histórico de vacinação:", fontWeight = FontWeight.Bold, fontSize = 4.em)
                    Text(text = " - Última vacina contra Gripe: 05/03/2023", fontSize = 4.em)
                    Text(text = " - Hepatipe B: Completa", fontSize = 4.em)
                    Text(text = " - Covid: 3 doses (Última: 11/04/2023)", fontSize = 4.em)
                }
                Column (
                    Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "Histórico de vacinação:", fontWeight = FontWeight.Bold, fontSize = 4.em)
                    Text(text = " - Última vacina contra Gripe: 05/03/2023", fontSize = 4.em)
                    Text(text = " - Hepatipe B: Completa", fontSize = 4.em)
                    Text(text = " - Covid: 3 doses (Última: 11/04/2023)", fontSize = 4.em)
                }
                Column (
                    Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "Consultas Recentes:", fontWeight = FontWeight.Bold, fontSize = 4.em)
                    Text(text = "1.Data: 10/05/2023 - Check-up anual,\nSem observações", fontSize = 4.em)
                }
                Column (
                    Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "Pressão Arterial:", fontWeight = FontWeight.Bold, fontSize = 4.em)
                    Text(text = "Última medição: - 120/80 mmHg", fontSize = 4.em)
                }
                Column (
                    Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "Exames Recentes:", fontWeight = FontWeight.Bold, fontSize = 4.em)
                    Text(text = "1. Hemograma - 15/04/2023\nResultados dentro do esperado", fontSize = 4.em)
                }
                Column (
                    Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "2. Colesterol Total - 20/04/2023", fontWeight = FontWeight.Bold, fontSize = 4.em)
                    Text(text = "Colesterol LDL: 110 mg/dL", fontSize = 4.em)
                    Text(text = "Colesterol HDL: 50 mg/dL", fontSize = 4.em)
                }
                Column (
                    Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "3. Glicose - 25/04/2024:", fontWeight = FontWeight.Bold, fontSize = 4.em)
                    Text(text = "Em jejum: 90 mg/dL", fontSize = 4.em)
                }
                Column (
                    Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "Recomendações:", fontWeight = FontWeight.Bold, fontSize = 4.em)
                    Text(text = " - Manter dieta balanceada e praticar exercícios regularmente.", fontSize = 4.em)
                    Text(text = " - Realizar exames de rotina conforme orientação médica.", fontSize = 4.em)
                }
                
                Row (
                    Modifier.padding(20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(text = "Assinatura Médica:", fontWeight = FontWeight.Bold, fontSize = 4.em)
                        Text(text = "Dr. Ana Oliveira", fontSize = 4.em)
                        Text(text = "CRM 12345", fontSize = 4.em)
                    }
                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End,
                    ) {
                        IconButton(onClick = { /*TODO*/ }, Modifier.size(70.dp)) {
                            Icon(
                                Icons.Filled.AddCircle,
                                "doc",
                            )
                        }
                        Text(text = "Clique para ver\no documento na\níntegra", fontSize = 4.em)
                    }
                }

                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(5.dp),
                    modifier = Modifier.fillMaxWidth().padding(20.dp).height(50.dp)
                ) {
                    Text(text = "Exportar Arquivo", fontSize = 4.em)
                }
            }
        }

    }
}