package com.example.shoppinglistapp.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {
    fun addItem(shopItem: ShopItem)

    fun deleteItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getShopList(): LiveData<List<ShopItem>>

    fun getItemById(shopItemId: Int): ShopItem?
}