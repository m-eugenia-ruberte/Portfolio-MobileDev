package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonadeApp()
                }
            }
        }
    }
}

@Preview
@Composable
fun LemonadeApp() {
    LemonadeWithButtonAndImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun LemonadeWithButtonAndImage(modifier: Modifier = Modifier) {
    var estado by remember { mutableStateOf( 1) }
    var imageResource by remember { mutableStateOf( R.drawable.lemon_tree) }
    var textDescription by remember { mutableStateOf( R.string.lemon_tree_content_description) }
    var textAction by remember { mutableStateOf( R.string.action1) }
    var contador by remember { mutableStateOf( 0) }
    var progreso by remember { mutableStateOf( 0) }

  
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(imageResource),
            contentDescription = stringResource(textDescription),
            Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(colorResource(R.color.teal_200))
                .clickable(onClick ={
                    when(estado) {
                        1 -> {
                            estado = 2
                            contador = Random.nextInt(2, 5)
                            progreso = 0

                            imageResource = R.drawable.lemon_squeeze
                            textDescription = R.string.lemon_content_description
                            textAction = R.string.action2
                        }

                        2 -> {

                            progreso++
                            if (progreso >= contador) {
                                estado = 3

                                imageResource = R.drawable.lemon_drink
                                textDescription = R.string.glass_of_lemonade_content_description
                                textAction = R.string.action3
                            }
                        }

                        3 -> {
                            estado = 4

                            imageResource = R.drawable.lemon_restart
                            textDescription = R.string.empty_glass_content_description
                            textAction = R.string.action4
                        }
                        else -> {
                            estado = 1

                            imageResource = R.drawable.lemon_tree
                            textDescription = R.string.lemon_tree_content_description
                            textAction = R.string.action1
                        }
                    }
                })
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = stringResource(textAction), fontSize = 18.sp)
    }
}