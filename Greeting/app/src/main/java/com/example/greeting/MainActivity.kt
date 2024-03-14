package com.example.greeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.greeting.ui.theme.GreetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Hello ITS", "Tegar Ganang Satrio Priambodo", "5025201002","PPB I", "Kalo buka puasa bareng itu namanya apasi??","BUBAR YA?")
                }
            }
        }
    }
}

@Composable
fun Greeting(salute:String, name: String, nrp:String, kelas:String, kata:String, jawaban:String) {
    Column(
        modifier= Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            color = Color.Magenta,
            text = "$salute!"
        )
        Text(text = "Hi! my name is $name")
        Text(text = "My student registration number $nrp")
        Text(text = "This semester i take class $kelas")
        Text(text = "Words of the day $kata $jawaban")
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingTheme {
        Greeting("Hello ITS", "Tegar Ganang Satrio Priambodo", "5025201002","PPB I", "Kalo buka puasa bareng itu namanya apasi??","BUBAR YA?")
    }
}