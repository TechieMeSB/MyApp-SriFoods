package com.internshala.foodrunner.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/internshala/foodrunner/util/Sorter;", "", "()V", "Companion", "app_release"})
public final class Sorter {
    @org.jetbrains.annotations.NotNull()
    private static java.util.Comparator<com.internshala.foodrunner.model.Restaurants> costComparator;
    @org.jetbrains.annotations.NotNull()
    private static java.util.Comparator<com.internshala.foodrunner.model.Restaurants> ratingComparator;
    public static final com.internshala.foodrunner.util.Sorter.Companion Companion = null;
    
    public Sorter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/internshala/foodrunner/util/Sorter$Companion;", "", "()V", "costComparator", "Ljava/util/Comparator;", "Lcom/internshala/foodrunner/model/Restaurants;", "getCostComparator", "()Ljava/util/Comparator;", "setCostComparator", "(Ljava/util/Comparator;)V", "ratingComparator", "getRatingComparator", "setRatingComparator", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Comparator<com.internshala.foodrunner.model.Restaurants> getCostComparator() {
            return null;
        }
        
        public final void setCostComparator(@org.jetbrains.annotations.NotNull()
        java.util.Comparator<com.internshala.foodrunner.model.Restaurants> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Comparator<com.internshala.foodrunner.model.Restaurants> getRatingComparator() {
            return null;
        }
        
        public final void setRatingComparator(@org.jetbrains.annotations.NotNull()
        java.util.Comparator<com.internshala.foodrunner.model.Restaurants> p0) {
        }
        
        private Companion() {
            super();
        }
    }
}