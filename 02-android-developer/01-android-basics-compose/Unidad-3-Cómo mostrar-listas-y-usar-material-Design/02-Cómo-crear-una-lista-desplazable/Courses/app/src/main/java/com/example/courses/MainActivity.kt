package com.example.courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courses.data.DataSource.DataSource.topics
import com.example.courses.model.Topic
import com.example.courses.ui.theme.CoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CoursesApp()
                }
            }
        }
    }
}

@Composable
fun CoursesApp() {
    val layoutDirection = LocalLayoutDirection.current
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(
                start = WindowInsets.safeDrawing.asPaddingValues()
                    .calculateStartPadding(layoutDirection),
                end = WindowInsets.safeDrawing.asPaddingValues()
                    .calculateEndPadding(layoutDirection),
            ),
    ) {
        CoursesGrid(topics)
    }
}

@Composable
fun CoursesCard(topic: Topic, modifier: Modifier = Modifier ){
    Card(shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .height(68.dp)
    ){
        Row {
            Image(
                painter = painterResource(topic.imagenResId),
                contentDescription = stringResource(topic.nombreResId),
                modifier = Modifier
                    .width(68.dp)
                    .fillMaxHeight(),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier
                        .padding(bottom =  8.dp)
                        .fillMaxWidth(),
                    style = MaterialTheme.typography.bodyMedium,
                    text = LocalContext.current.getString(topic.nombreResId)
                )
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(R.drawable.ic_grain),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(end = 8.dp),
                        colorFilter = ColorFilter.tint(Color.Black)
                    )
                    Text(
                        text = topic.cantidad.toString(),
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }
}

@Composable
fun CoursesGrid(topicList: List<Topic>){
    LazyVerticalGrid (
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(topics){ topic ->
            CoursesCard(
                topic = topic,
                modifier = Modifier
            )

        }
    }
}

@Preview
@Composable
private fun CoursesCardPreview(){
    CoursesGrid(topics)
    //CoursesCard(Topic(R.string.photography, 321,R.drawable.photography))
}