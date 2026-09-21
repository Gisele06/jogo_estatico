package com.aulasandroid.cat_invader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
                    //BasicComponentsScreen(modifier = Modifier.padding(innerPadding))
                    EndGame(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun EndGame (modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()
        .background(Color.Black),
        contentAlignment = Alignment.Center){
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            GatoMeteoro()
            GatoMeteoro()
            GatoMeteoro()
            GatoMeteoro()
            GatoMeteoro()
        }
        Text(
            text = "GAME OVER",
            modifier = modifier,
            color = Color.Red,
            textAlign = TextAlign.Center,
            fontSize = 65.sp,
            fontWeight = FontWeight.Bold
        )

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
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            GatoMeteoro()
            GatoMeteoro()
            GatoMeteoro()
            GatoMeteoro()
            GatoMeteoro()
        }

        Box(modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter) {
            Column() {
                Nave(Color(243, 195, 74, 255),
                    modifier = modifier
                        .fillMaxWidth()
                        .size(80.dp)
                )
                Text(
                    text = "PRESS START",
                    modifier = modifier
                        .background(Color.Gray)
                        .fillMaxWidth()
                        .padding(10.dp),
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun GatoMeteoro( modifier: Modifier = Modifier) {
    Image(
        modifier = modifier.size(50.dp),
        painter = painterResource(R.drawable.gatosorrino),
        contentDescription = "Cat Enemy"
    )
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
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "SCORE: 0050",
            textAlign = TextAlign.Start,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = Color(0xFFFFFFFF)
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
                modifier = Modifier
                    .size(24.dp)
                    .padding(start = 4.dp)
            )
            CatEnemy(
                color = Color.Green,
                modifier = Modifier
                    .size(24.dp)
                    .padding(start = 4.dp)
            )
            CatEnemy(
                color = Color.Green,
                modifier = Modifier
                    .size(24.dp)
                    .padding(start = 4.dp)
            )
        }
    }
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