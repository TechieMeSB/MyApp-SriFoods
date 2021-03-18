package com.internshala.foodrunner.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lcom/internshala/foodrunner/database/OrderDao;", "", "deleteOrder", "", "orderEntity", "Lcom/internshala/foodrunner/database/OrderEntity;", "deleteOrders", "resId", "", "getAllOrders", "", "insertOrder", "app_release"})
public abstract interface OrderDao {
    
    @androidx.room.Insert()
    public abstract void insertOrder(@org.jetbrains.annotations.NotNull()
    com.internshala.foodrunner.database.OrderEntity orderEntity);
    
    @androidx.room.Delete()
    public abstract void deleteOrder(@org.jetbrains.annotations.NotNull()
    com.internshala.foodrunner.database.OrderEntity orderEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM orders")
    public abstract java.util.List<com.internshala.foodrunner.database.OrderEntity> getAllOrders();
    
    @androidx.room.Query(value = "DELETE FROM orders WHERE resId = :resId")
    public abstract void deleteOrders(@org.jetbrains.annotations.NotNull()
    java.lang.String resId);
}