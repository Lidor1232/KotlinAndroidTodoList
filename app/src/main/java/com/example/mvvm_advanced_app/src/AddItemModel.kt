package com.example.mvvm_advanced_app.src

data class AddItemModel(var showDialog: Boolean, var itemName: String)

class AddItemRepository {
    private var _addItem = AddItemModel(false, "")

    fun getAddItem() = _addItem

    fun setShowDialog(showDialog: Boolean) {
        _addItem.showDialog = showDialog
    }

    fun setItemName(itemName: String) {
        _addItem.itemName = itemName
    }
}
