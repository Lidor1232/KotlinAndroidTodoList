package com.example.mvvm_advanced_app.src

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

// private val repository: TodoListRepository
class TodoListViewModel() : ViewModel() {
    private val repository = TodoListRepository()

    private val _list =
        mutableStateOf(
            repository.getTodoList().list,
        )
    val list: MutableState<List<String>> = _list

    fun addItem(item: String) {
        repository.addItem(item)
        _list.value = repository.getTodoList().list
    }

    fun removeItem(item: String) {
        repository.removeItem(item)
        _list.value = repository.getTodoList().list
    }
}
