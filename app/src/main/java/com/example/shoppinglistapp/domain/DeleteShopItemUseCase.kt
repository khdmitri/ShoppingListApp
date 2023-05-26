package com.example.shoppinglistapp.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun deleteItem(shopItem: ShopItem) {
        shopListRepository.deleteItem(shopItem)
    }
}