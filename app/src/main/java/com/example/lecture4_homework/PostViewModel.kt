package com.example.lecture4_homework

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class PostViewModel : ViewModel() {
    private val _itemsList = MutableStateFlow(
        List(5) {
            "Post Title" to "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam molestie nisl ac faucibus blandit. Donec quis nulla quis quam vestibulum egestas at eget velit. Praesent nec ex quis nisl ullamcorper euismod. Vestibulum accumsan a..."
        }
    )
    val itemsList: StateFlow<List<Pair<String, String>>> = _itemsList
}
