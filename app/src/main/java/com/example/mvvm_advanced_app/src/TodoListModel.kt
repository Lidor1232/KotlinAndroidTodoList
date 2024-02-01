package com.example.mvvm_advanced_app.src

data class TodoListModel(var list: List<String>)

class TodoListRepository {
    private var _todoList = TodoListModel(listOf())

    fun getTodoList() = _todoList

    fun addItem(item: String) {
        _todoList.list = _todoList.list + item
    }

    fun removeItem(item: String) {
        _todoList.list =
            _todoList.list.filter {
                    it ->
                it != item
            }
    }
}
