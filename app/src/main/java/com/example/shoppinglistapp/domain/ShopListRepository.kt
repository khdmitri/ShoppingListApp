package com.example.shoppinglistapp.domain

interface ShopListRepository {
    fun addItem(shopItem: ShopItem)

    fun deleteItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getShopList(): List<ShopItem>

    fun getItemById(shopItemId: Int): ShopItem?
}