package com.example.shoppinglistapp.domain

class GetShopUseCase(private val shopListRepository: ShopListRepository) {
    fun getItemById(shopItemId: Int): ShopItem? {
        return shopListRepository.getItemById(shopItemId)
    }
}