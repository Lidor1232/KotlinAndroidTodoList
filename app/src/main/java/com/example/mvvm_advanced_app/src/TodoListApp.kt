package com.example.mvvm_advanced_app.src

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.mvvm_advanced_app.src.TodoItem.TodoItem

@Composable
fun TodoListApp(viewModel: TodoListViewModel) {
    Column {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Add Item")
        }
        LazyColumn(content = {
            items(viewModel.list.value.size) {
                    index ->
                TodoItem(viewModel, index)
            }
        })
    }
}
