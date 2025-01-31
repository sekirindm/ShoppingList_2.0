package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShopItem

class ShopItemMapper {
    fun mapEntityToDbModel (shopItem: ShopItem) = ShopItemDbModel(
        id = shopItem.id,
        name = shopItem.name,
        count = shopItem.count,
        enabled = shopItem.enabled

    )

     fun mapDbModelToEntity(shopItemDbModel: ShopItemDbModel) = ShopItem(
        id = shopItemDbModel.id,
        name = shopItemDbModel.name,
        count = shopItemDbModel.count,
        enabled = shopItemDbModel.enabled
    )

    fun mapListDbModelToEntity(list: List<ShopItemDbModel>) = list.map {
        mapDbModelToEntity(it)
    }
}