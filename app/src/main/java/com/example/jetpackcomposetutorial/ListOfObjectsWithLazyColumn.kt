package com.example.jetpackcomposetutorial

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposetutorial.navigation.GetCustomToolbar
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme
import com.example.jetpackcomposetutorial.ui.theme.getCustomColorOfTextBySystemOfTheme

private val messages: List<MyMessage> = listOf(
    MyMessage(
        title = "Hola jetpack Compose!",
        body = "Preparado?"
    ),
    MyMessage(
        title = "Hola jetpack Compose 1",
        body = "Preparado? Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content."
    ),
    MyMessage(
        title = "Hola jetpack Compose 2",
        body = "Preparado? Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content. Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content."
    ),
    MyMessage(
        title = "Hola jetpack Compose 3",
        body = "Preparado?"
    ),
    MyMessage(
        title = "Hola jetpack Compose 4",
        body = "Preparado? Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content. Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content. Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content. Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content."
    ),
    MyMessage(
        title = "Hola jetpack Compose 5",
        body = "Preparado?"
    ),
    MyMessage(
        title = "Hola jetpack Compose 6",
        body = "Preparado?"
    ),
    MyMessage(
        title = "Hola jetpack Compose 7",
        body = "Preparado? Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content. Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content."
    ),
    MyMessage(
        title = "Hola jetpack Compose 8",
        body = "Preparado?"
    ),
    MyMessage(
        title = "Hola jetpack Compose 9",
        body = "Preparado?"
    ),
    MyMessage(
        title = "Hola jetpack Compose 10",
        body = "Preparado? Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content.Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content.Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content.Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content.Lorem ipsum is a placeholder text that's commonly used for testing designs and layouts. It's a pseudo-Latin text that's been used in typography, web design, layout, and printing since the 1500s to emphasize design elements over content."
    ),
    MyMessage(
        title = "Hola jetpack Compose 11",
        body = "Preparado?"
    ),
    MyMessage(
        title = "Hola jetpack Compose 12",
        body = "Preparado?"
    ),
    MyMessage(
        title = "Hola jetpack Compose 13",
        body = "Preparado?"
    ),
)


@Composable
fun InitListOfObjectWithLazyColumn(navController: NavController) {
    GetCustomToolbar(
        titleView = "ListOfObjectsWithLazyColumn",
        contentDescription = "Arrow Back",
        unitView = {
            ListOfObjectsWithLazyColumn(messages)
        },
        navController = navController
    )
}

/**
 * Show how create a list of data with the rows inse of lazyColumn (tutorial MoureDev).
 */
data class MyMessage(val title: String, val body: String)

@Composable
fun ListOfObjectsWithLazyColumn(messages: List<MyMessage>) {
    LazyColumn {
        items(messages) { message ->
            MyComponent(message)
        }
    }
}

@Composable
fun MyComponent(myMessage: MyMessage) {
    Row(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(8.dp)
    ) {
        MyImage()
        MyTexts(myMessage)
    }
}

@Composable
fun MyImage() {
    Image(
        painterResource(id = R.drawable.ic_launcher_foreground),
        "Imagen de prueba",
        modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
            .size(64.dp)
    )
}

@Composable
fun MyTexts(myMessage: MyMessage) {
    val colorText = getCustomColorOfTextBySystemOfTheme()
    var expanded by remember { mutableStateOf(false) }
    Column(modifier = Modifier
        .padding(start = 8.dp)
        .clickable {
            expanded = !expanded
        }) {
        MyText(
            text = myMessage.title,
            colorText,
            MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(16.dp))
        MyText(
            text = myMessage.body,
            colorText,
            MaterialTheme.typography.bodySmall,
            if (expanded) Int.MAX_VALUE else 1
        )
    }
}

@Composable
fun MyText(text: String, color: Color, style: TextStyle, lines: Int = Int.MAX_VALUE) {
    Text(text = text, color = color, style = style, maxLines = lines)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    JetpackComposeTutorialTheme {
        InitListOfObjectWithLazyColumn(rememberNavController())
    }
}