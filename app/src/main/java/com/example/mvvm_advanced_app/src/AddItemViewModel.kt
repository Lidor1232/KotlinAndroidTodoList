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

    private val _itemName =
        mutableStateOf(
            repository.getAddItem().itemName,
        )
    val itemName: MutableState<String> = _itemName

    fun setShowDialog(showDialog: Boolean) {
        repository.setShowDialog(showDialog)
        _showDialog.value = repository.getAddItem().showDialog
    }

    fun setItemName(itemName: String) {
        repository.setItemName(itemName)
        _itemName.value = repository.getAddItem().itemName
    }
}
