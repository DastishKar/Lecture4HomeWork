package com.example.lecture4_homework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lecture4_homework.ui.theme.Lecture4HomeWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lecture4HomeWorkTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val itemsList = List(5) { // Создаем список из 5 элементов
                        "Post Title" to "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam molestie nisl ac faucibus blandit. Donec quis nulla quis quam vestibulum egestas at eget velit. Praesent nec ex quis nisl ullamcorper euismod. Vestibulum accumsan a..."
                    }
                    PostList(items = itemsList)
                }
            }
        }
    }
}

@Composable
fun PostList(items: List<Pair<String, String>>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        items(items) { item ->
            PostItem(title = item.first, description = item.second)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun PostItem(title: String, description: String, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp).background(color = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = title,
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = description,
                modifier = Modifier.padding(top = 8.dp),
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostListPreview() {
    Lecture4HomeWorkTheme {
        val itemsList = List(5) { // Создаем список из 5 элементов
            "Post Title" to "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam molestie nisl ac faucibus blandit. Donec quis nulla quis quam vestibulum egestas at eget velit. Praesent nec ex quis nisl ullamcorper euismod. Vestibulum accumsan a..."
        }
        PostList(items = itemsList)
    }
}
