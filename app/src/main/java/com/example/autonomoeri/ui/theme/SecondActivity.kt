package com.example.autonomoeri.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AutonomoeriTheme {
                UserInfoScreen()
            }
        }
    }
}

@Composable
fun UserInfoScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Bienvenido, [Usuario]")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "¡Tienes 1200 puntos acumulados!")
    }
}

@Preview(showBackground = true)
@Composable
fun UserInfoScreenPreview() {
    AutonomoeriTheme {
        UserInfoScreen()
    }
}