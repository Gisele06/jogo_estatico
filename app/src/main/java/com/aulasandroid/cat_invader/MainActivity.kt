package com.aulasandroid.cat_invader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.cat_invader.ui.theme.Cat_InvaderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Cat_InvaderTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicComponentsScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicComponentsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0, 0, 0, 255))
    ) {
        DadosDeJogo()
    }
}

@Composable
fun CatEnemy(
    color: Color,
    modifier: Modifier = Modifier
){

    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.lucky_cat),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "Cat Enemy"
    )
}

@Composable
fun DadosDeJogo(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween, // Agora sim isso vai funcionar!
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "SCORE: 0050",
            textAlign = TextAlign.Start,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = Color(0xFFFFFFFF) // REMOVI o fillMaxWidth daqui de dentro!
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "LIVES: ",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                color = Color(0xFFFFFFFF)
            )
            CatEnemy(
                color = Color.Green,
                modifier = Modifier.size(24.dp).padding(start = 4.dp)
            )
            CatEnemy(
                color = Color.Green,
                modifier = Modifier.size(24.dp).padding(start = 4.dp)
            )
            CatEnemy(
                color = Color.Green,
                modifier = Modifier.size(24.dp).padding(start = 4.dp)
            )
        } // Fim da Row das vidas
    } // Fim da Row principal
}


@Composable
fun Nave(
    color: Color,
    modifier: Modifier = Modifier
) {

    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.japanese_pagoda),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "Japanese pagode"
    )
}