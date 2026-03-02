package com.example.praktam_2417053003

import android.R
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.praktam_2417053003.ui.theme.PrakTAM_2417053003Theme
import model.foodSource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTAM_2417053003Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(

                    )
                }
            }
        }
    }
}


@Composable
fun Greeting() {
    val food = foodSource.dummyFood[0]

    Column(modifier = Modifier.fillMaxSize().padding(all= 60.dp)) {
        Image(
            painter = painterResource(food.ImageRes),
            contentDescription = food.nama,
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Crop
        )


        Text(text = "Nama: ${food.nama}")
        Text(text = "Deskripsi: ${food.deskripsi}")
        Text(text = "Harga: ${food.harga}")



    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrakTAM_2417053003Theme {
        Greeting()
    }
}