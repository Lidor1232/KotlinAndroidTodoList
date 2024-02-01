package com.example.mvvm_advanced_app.src.TodoItem

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.mvvm_advanced_app.src.TodoListViewModel

@Composable
fun TodoItem(
    viewModel: TodoListViewModel,
    index: Int,
) {
    Text(text = "item: $index")
}
