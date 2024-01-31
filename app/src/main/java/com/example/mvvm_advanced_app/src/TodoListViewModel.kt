package com.example.mvvm_advanced_app.src

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class TodoListViewModel : ViewModel() {
    private val _list =
        mutableStateOf(
            listOf<String>(),
        )
    val list: MutableState<List<String>> = _list

    fun addItem(item: String) {
        _list.value = _list.value + item
    }

    fun removeItem(item: String) {
        _list.value =
            _list.value.filter {
                    listItem ->
                item != listItem
            }
    }
}
