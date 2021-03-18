package com.internshala.foodrunner.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\rH\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/internshala/foodrunner/adapter/AllRestaurantsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/internshala/foodrunner/adapter/AllRestaurantsAdapter$AllRestaurantsViewHolder;", "restaurants", "Ljava/util/ArrayList;", "Lcom/internshala/foodrunner/model/Restaurants;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "AllRestaurantsViewHolder", "DBAsyncTask", "GetAllFavAsyncTask", "app_debug"})
public final class AllRestaurantsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.internshala.foodrunner.adapter.AllRestaurantsAdapter.AllRestaurantsViewHolder> {
    private java.util.ArrayList<com.internshala.foodrunner.model.Restaurants> restaurants;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.internshala.foodrunner.adapter.AllRestaurantsAdapter.AllRestaurantsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.internshala.foodrunner.adapter.AllRestaurantsAdapter.AllRestaurantsViewHolder p0, int p1) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public AllRestaurantsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.internshala.foodrunner.model.Restaurants> restaurants, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/internshala/foodrunner/adapter/AllRestaurantsAdapter$AllRestaurantsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "cardRestaurant", "Landroidx/cardview/widget/CardView;", "getCardRestaurant", "()Landroidx/cardview/widget/CardView;", "cost", "Landroid/widget/TextView;", "getCost", "()Landroid/widget/TextView;", "favImage", "Landroid/widget/ImageView;", "getFavImage", "()Landroid/widget/ImageView;", "rating", "getRating", "resThumbnail", "getResThumbnail", "restaurantName", "getRestaurantName", "app_debug"})
    public static final class AllRestaurantsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView resThumbnail = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView restaurantName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView rating = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView cost = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView cardRestaurant = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView favImage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getResThumbnail() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getRestaurantName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getRating() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCardRestaurant() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getFavImage() {
            return null;
        }
        
        public AllRestaurantsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u0013\u001a\u00020\u00032\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0015\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/internshala/foodrunner/adapter/AllRestaurantsAdapter$DBAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "restaurantEntity", "Lcom/internshala/foodrunner/database/RestaurantEntity;", "mode", "", "(Landroid/content/Context;Lcom/internshala/foodrunner/database/RestaurantEntity;I)V", "db", "Lcom/internshala/foodrunner/database/RestaurantDatabase;", "getDb", "()Lcom/internshala/foodrunner/database/RestaurantDatabase;", "getMode", "()I", "getRestaurantEntity", "()Lcom/internshala/foodrunner/database/RestaurantEntity;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "app_debug"})
    public static final class DBAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull()
        private final com.internshala.foodrunner.database.RestaurantDatabase db = null;
        @org.jetbrains.annotations.NotNull()
        private final com.internshala.foodrunner.database.RestaurantEntity restaurantEntity = null;
        private final int mode = 0;
        
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
        public final com.internshala.foodrunner.database.RestaurantEntity getRestaurantEntity() {
            return null;
        }
        
        public final int getMode() {
            return 0;
        }
        
        public DBAsyncTask(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.internshala.foodrunner.database.RestaurantEntity restaurantEntity, int mode) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/internshala/foodrunner/adapter/AllRestaurantsAdapter$GetAllFavAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "db", "Lcom/internshala/foodrunner/database/RestaurantDatabase;", "getDb", "()Lcom/internshala/foodrunner/database/RestaurantDatabase;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class GetAllFavAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends java.lang.String>> {
        @org.jetbrains.annotations.NotNull()
        private final com.internshala.foodrunner.database.RestaurantDatabase db = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.internshala.foodrunner.database.RestaurantDatabase getDb() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.List<java.lang.String> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        public GetAllFavAsyncTask(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
}