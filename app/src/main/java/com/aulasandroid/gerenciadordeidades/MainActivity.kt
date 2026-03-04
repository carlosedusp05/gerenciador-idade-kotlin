package com.aulasandroid.gerenciadordeidades

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.gerenciadordeidades.ui.theme.GerenciadorDeIdadesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GerenciadorDeIdadesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GerenciadorScreen(modifier = Modifier .padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun GerenciadorScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .background(Color.White)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
                Text(text = "Qual é a sua idade?",
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue,
                    fontSize = 25.sp
                )
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .height(30.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Aperte os botões para informar a sua idade",
                fontSize = 15.sp)
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .height(75.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "18",
                fontSize = 25.sp
            )
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(120.dp, 0.dp),
            horizontalArrangement = Arrangement.spacedBy(40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {},

                modifier = Modifier.size(70.dp),

                colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue),

                shape = RoundedCornerShape( 10.dp),
            ) {
                Text(text = "-",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                )

            }

            Button(
                onClick = {},

                modifier = Modifier.size(70.dp),

                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue),

                shape = RoundedCornerShape( 10.dp),
            ) {
                Text(text = "+",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                    )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .height(55.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Você é ???? de idade!",
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                fontSize = 28.sp)
        }

    }
}

