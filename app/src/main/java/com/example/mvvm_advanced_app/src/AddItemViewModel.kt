package com.example.mvvm_advanced_app.src

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class AddItemViewModel() : ViewModel() {
    private val repository = AddItemRepository()

    private val _showDialog =
        mutableStateOf(
            repository.getAddItem().showDialog,
        )
    val showDialog: MutableState<Boolean> = _showDialog

    fun setShowDialog(showDialog: Boolean) {
        repository.setShowDialog(showDialog)
        _showDialog.value = repository.getAddItem().showDialog
    }
}
