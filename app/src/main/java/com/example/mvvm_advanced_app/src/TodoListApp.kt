package com.example.mvvm_advanced_app.src

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.mvvm_advanced_app.src.AddItemDialog.AddItemDialog
import com.example.mvvm_advanced_app.src.TodoItem.TodoItem

@Composable
fun TodoListApp(
    todoListViewModel: TodoListViewModel,
    addItemViewModel: AddItemViewModel,
) {
    Column {
        Button(onClick = {
            addItemViewModel.setShowDialog(true)
        }) {
            Text(text = "Add Item")
        }
        LazyColumn(content = {
            items(todoListViewModel.list.value.size) {
                    index ->
                TodoItem(todoListViewModel, index)
            }
        })
    }
    AddItemDialog(addItemViewModel, todoListViewModel)
}
