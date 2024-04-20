package com.example.jetpackcomposetutorial

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposetutorial.navigation.GetCustomToolbar
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

@Composable
fun InitPresentationCard(navController: NavController) {
    GetCustomToolbar(
        titleView = "PresentationCard",
        contentDescription = "Arrow Back",
        containerColor = Color(0xFFD2E8D4),
        unitView = {
            GetAndroidDeveloper(
                name = stringResource(R.string.developer_name),
                rol = stringResource(R.string.android_developer_extraordinaire),
                modifier = Modifier
                    .background(Color(0xFFD2E8D4))
            )
        },
        navController = navController
    )
}

@Composable
fun GetAndroidDeveloper(name: String, rol: String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxSize()
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = modifier
                    .padding(start = 124.dp, end = 124.dp)
                    .background(Color(0xFF073042))
            )
            Text(
                text = name,
                fontSize = 32.sp,
                modifier = modifier
                    .padding(top = 16.dp)
            )
            Text(
                text = rol,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF5D9D78),
                modifier = modifier
                    .padding(top = 16.dp)
            )
        }
        GetContactNetworks(
            modifier = modifier
                .padding(top = 24.dp)
        )
    }
}

@Composable
fun GetContactNetworks(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(24.dp)
    ) {
        GetNetwork(
            icon = Icons.Rounded.Call,
            contentDescription = stringResource(R.string.call_phone),
            description = stringResource(R.string.description_phone),
            iconColor = Color(0xFF5D9D78),
            modifier = modifier
        )
        GetNetwork(
            icon = Icons.Rounded.Share,
            contentDescription = stringResource(R.string.share),
            description = stringResource(R.string.description_share),
            iconColor = Color(0xFF5D9D78),
            modifier = modifier
        )
        GetNetwork(
            icon = Icons.Rounded.Email,
            contentDescription = stringResource(R.string.email),
            description = stringResource(R.string.description_email),
            iconColor = Color(0xFF5D9D78),
            modifier = modifier
        )
    }
}

@Composable
fun GetNetwork(
    icon: ImageVector,
    contentDescription: String,
    description: String,
    iconColor: Color,
    modifier: Modifier = Modifier
) {
    Row {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = iconColor,
            modifier = modifier
                .padding(end = 16.dp)
        )
        Text(
            text = description,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    JetpackComposeTutorialTheme {
        InitPresentationCard(rememberNavController())
    }
}