package com.internshala.foodrunner.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002#$B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/internshala/foodrunner/activity/CartActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnPlaceOrder", "Landroid/widget/Button;", "cartItemAdapter", "Lcom/internshala/foodrunner/adapter/CartItemAdapter;", "orderList", "Ljava/util/ArrayList;", "Lcom/internshala/foodrunner/model/FoodItem;", "recyclerCart", "Landroidx/recyclerview/widget/RecyclerView;", "resId", "", "resName", "", "rlCart", "Landroid/widget/RelativeLayout;", "rlLoading", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "txtResName", "Landroid/widget/TextView;", "init", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "placeOrder", "sendServerRequest", "setUpCartList", "setupToolbar", "ClearDBAsync", "GetItemsFromDBAsync", "app_release"})
public final class CartActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.appcompat.widget.Toolbar toolbar;
    private androidx.recyclerview.widget.RecyclerView recyclerCart;
    private com.internshala.foodrunner.adapter.CartItemAdapter cartItemAdapter;
    private java.util.ArrayList<com.internshala.foodrunner.model.FoodItem> orderList;
    private android.widget.TextView txtResName;
    private android.widget.RelativeLayout rlLoading;
    private android.widget.RelativeLayout rlCart;
    private android.widget.Button btnPlaceOrder;
    private int resId;
    private java.lang.String resName;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void setupToolbar() {
    }
    
    private final void setUpCartList() {
    }
    
    private final void placeOrder() {
    }
    
    private final void sendServerRequest() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public CartActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/internshala/foodrunner/activity/CartActivity$GetItemsFromDBAsync;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/internshala/foodrunner/database/OrderEntity;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "db", "Lcom/internshala/foodrunner/database/RestaurantDatabase;", "getDb", "()Lcom/internshala/foodrunner/database/RestaurantDatabase;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_release"})
    public static final class GetItemsFromDBAsync extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.internshala.foodrunner.database.OrderEntity>> {
        @org.jetbrains.annotations.NotNull()
        private final com.internshala.foodrunner.database.RestaurantDatabase db = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.internshala.foodrunner.database.RestaurantDatabase getDb() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.List<com.internshala.foodrunner.database.OrderEntity> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        public GetItemsFromDBAsync(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\u000f\u001a\u00020\u00032\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0011\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/internshala/foodrunner/activity/CartActivity$ClearDBAsync;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "resId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "db", "Lcom/internshala/foodrunner/database/RestaurantDatabase;", "getDb", "()Lcom/internshala/foodrunner/database/RestaurantDatabase;", "getResId", "()Ljava/lang/String;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "app_release"})
    public static final class ClearDBAsync extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull()
        private final com.internshala.foodrunner.database.RestaurantDatabase db = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String resId = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.internshala.foodrunner.database.RestaurantDatabase getDb() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getResId() {
            return null;
        }
        
        public ClearDBAsync(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String resId) {
            super();
        }
    }
}