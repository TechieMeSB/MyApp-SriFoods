package com.internshala.foodrunner.fragment;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/internshala/foodrunner/fragment/FavouritesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "allRestaurantsAdapter", "Lcom/internshala/foodrunner/adapter/AllRestaurantsAdapter;", "recyclerRestaurant", "Landroidx/recyclerview/widget/RecyclerView;", "restaurantList", "Ljava/util/ArrayList;", "Lcom/internshala/foodrunner/model/Restaurants;", "rlFav", "Landroid/widget/RelativeLayout;", "rlLoading", "rlNoFav", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setUpRecycler", "", "view", "FavouritesAsync", "app_debug"})
public final class FavouritesFragment extends androidx.fragment.app.Fragment {
    private androidx.recyclerview.widget.RecyclerView recyclerRestaurant;
    private com.internshala.foodrunner.adapter.AllRestaurantsAdapter allRestaurantsAdapter;
    private java.util.ArrayList<com.internshala.foodrunner.model.Restaurants> restaurantList;
    private android.widget.RelativeLayout rlLoading;
    private android.widget.RelativeLayout rlFav;
    private android.widget.RelativeLayout rlNoFav;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpRecycler(android.view.View view) {
    }
    
    public FavouritesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/internshala/foodrunner/fragment/FavouritesFragment$FavouritesAsync;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/internshala/foodrunner/database/RestaurantEntity;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "db", "Lcom/internshala/foodrunner/database/RestaurantDatabase;", "getDb", "()Lcom/internshala/foodrunner/database/RestaurantDatabase;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class FavouritesAsync extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.internshala.foodrunner.database.RestaurantEntity>> {
        @org.jetbrains.annotations.NotNull()
        private final com.internshala.foodrunner.database.RestaurantDatabase db = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.internshala.foodrunner.database.RestaurantDatabase getDb() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.List<com.internshala.foodrunner.database.RestaurantEntity> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        public FavouritesAsync(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
}