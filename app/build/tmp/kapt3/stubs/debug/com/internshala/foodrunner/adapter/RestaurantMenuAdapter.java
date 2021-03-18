package com.internshala.foodrunner.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u001aB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/internshala/foodrunner/adapter/RestaurantMenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/internshala/foodrunner/adapter/RestaurantMenuAdapter$MenuViewHolder;", "context", "Landroid/content/Context;", "menuList", "Ljava/util/ArrayList;", "Lcom/internshala/foodrunner/model/FoodItem;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/internshala/foodrunner/adapter/RestaurantMenuAdapter$OnItemClickListener;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/internshala/foodrunner/adapter/RestaurantMenuAdapter$OnItemClickListener;)V", "getContext", "()Landroid/content/Context;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "Companion", "MenuViewHolder", "OnItemClickListener", "app_debug"})
public final class RestaurantMenuAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.internshala.foodrunner.adapter.RestaurantMenuAdapter.MenuViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final java.util.ArrayList<com.internshala.foodrunner.model.FoodItem> menuList = null;
    private final com.internshala.foodrunner.adapter.RestaurantMenuAdapter.OnItemClickListener listener = null;
    private static boolean isCartEmpty;
    public static final com.internshala.foodrunner.adapter.RestaurantMenuAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.internshala.foodrunner.adapter.RestaurantMenuAdapter.MenuViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.internshala.foodrunner.adapter.RestaurantMenuAdapter.MenuViewHolder p0, int p1) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public RestaurantMenuAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.internshala.foodrunner.model.FoodItem> menuList, @org.jetbrains.annotations.NotNull()
    com.internshala.foodrunner.adapter.RestaurantMenuAdapter.OnItemClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/internshala/foodrunner/adapter/RestaurantMenuAdapter$OnItemClickListener;", "", "onAddItemClick", "", "foodItem", "Lcom/internshala/foodrunner/model/FoodItem;", "onRemoveItemClick", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onAddItemClick(@org.jetbrains.annotations.NotNull()
        com.internshala.foodrunner.model.FoodItem foodItem);
        
        public abstract void onRemoveItemClick(@org.jetbrains.annotations.NotNull()
        com.internshala.foodrunner.model.FoodItem foodItem);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/internshala/foodrunner/adapter/RestaurantMenuAdapter$MenuViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "addToCart", "Landroid/widget/Button;", "getAddToCart", "()Landroid/widget/Button;", "foodItemCost", "Landroid/widget/TextView;", "getFoodItemCost", "()Landroid/widget/TextView;", "foodItemName", "getFoodItemName", "removeFromCart", "getRemoveFromCart", "sno", "getSno", "app_debug"})
    public static final class MenuViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView foodItemName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView foodItemCost = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView sno = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button addToCart = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button removeFromCart = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFoodItemName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFoodItemCost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSno() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getAddToCart() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getRemoveFromCart() {
            return null;
        }
        
        public MenuViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/internshala/foodrunner/adapter/RestaurantMenuAdapter$Companion;", "", "()V", "isCartEmpty", "", "()Z", "setCartEmpty", "(Z)V", "app_debug"})
    public static final class Companion {
        
        public final boolean isCartEmpty() {
            return false;
        }
        
        public final void setCartEmpty(boolean p0) {
        }
        
        private Companion() {
            super();
        }
    }
}