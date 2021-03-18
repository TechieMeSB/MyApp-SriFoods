package com.internshala.foodrunner.database;

import java.lang.System;

@androidx.room.Database(entities = {com.internshala.foodrunner.database.RestaurantEntity.class, com.internshala.foodrunner.database.OrderEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/internshala/foodrunner/database/RestaurantDatabase;", "Landroidx/room/RoomDatabase;", "()V", "orderDao", "Lcom/internshala/foodrunner/database/OrderDao;", "restaurantDao", "Lcom/internshala/foodrunner/database/RestaurantDao;", "app_debug"})
public abstract class RestaurantDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.internshala.foodrunner.database.RestaurantDao restaurantDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.internshala.foodrunner.database.OrderDao orderDao();
    
    public RestaurantDatabase() {
        super();
    }
}