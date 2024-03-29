package com.example.joblystapp.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.joblystapp.R

@Composable
fun WelcomeScreen2(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_welcome2),
            contentDescription = null,
            modifier = Modifier
                .size(250.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Browse Job List",
            style = TextStyle(
                color = Color.Blue,
                fontSize = 18.sp
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "We can find the best job for you",
            style = TextStyle(
                color = Color.Black,
                fontSize = 15.sp
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate("sign_in")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = contentColorFor(MaterialTheme.colorScheme.primary)
            ),
            contentPadding = PaddingValues(16.dp)
        ) {
            Text(text = "Start Journey")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePreview2() {
    val navController = rememberNavController()
    WelcomeScreen2(navController = navController)
}
