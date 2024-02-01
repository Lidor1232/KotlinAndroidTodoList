package com.example.mvvm_advanced_app.src.AddItemDialog

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.mvvm_advanced_app.src.AddItemViewModel
import timber.log.Timber

@Composable
fun AddItemDialog(addItemViewModel: AddItemViewModel) {
    if (addItemViewModel.showDialog.value) {
        AlertDialog(
            onDismissRequest = { /* TODO: Handle the dismiss. */ },
            title = { Text(text = "Hello World") },
            confirmButton = {
                Button(
                    onClick = {
                        Timber.d("Confirm!")
                        // TODO: Handle the confirm action
                    },
                ) {
                    Text("Confirm")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        // TODO: Handle the dismiss action
                    },
                ) {
                    Text("Dismiss")
                }
            },
        )
    }
}
