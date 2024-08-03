package com.example.lecture4_homework

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState

@Composable
fun PostScreen(postViewModel: PostViewModel) {
    val itemsList = postViewModel.itemsList.collectAsState().value
    PostList(items = itemsList)
}
