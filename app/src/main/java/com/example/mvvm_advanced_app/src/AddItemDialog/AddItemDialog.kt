package com.example.mvvm_advanced_app.src.AddItemDialog

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import com.example.mvvm_advanced_app.src.AddItemViewModel
import com.example.mvvm_advanced_app.src.TodoListViewModel
import timber.log.Timber

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddItemDialog(
    addItemViewModel: AddItemViewModel,
    todoListViewModel: TodoListViewModel,
) {
    Timber.d(addItemViewModel.itemName.value)

    if (addItemViewModel.showDialog.value) {
        AlertDialog(
            onDismissRequest = {
                addItemViewModel.setShowDialog(false)
            },
            title = { Text(text = "Hello World") },
            text = {
                Column {
                    Text("Enter your text here:")

                    TextField(
                        value = addItemViewModel.itemName.value,
                        onValueChange = { newText: String ->
                            addItemViewModel.setItemName(newText)
                        },
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        addItemViewModel.setItemName("")
                        todoListViewModel.addItem(addItemViewModel.itemName.value)
                        addItemViewModel.setShowDialog(false)
                    },
                ) {
                    Text("Confirm")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        addItemViewModel.setShowDialog(false)
                    },
                ) {
                    Text("Cancel")
                }
            },
        )
    }
}
