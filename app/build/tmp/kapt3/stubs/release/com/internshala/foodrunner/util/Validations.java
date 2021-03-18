package com.internshala.foodrunner.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/internshala/foodrunner/util/Validations;", "", "()V", "matchPassword", "", "pass", "", "confirmPass", "validateEmail", "email", "validateMobile", "mobile", "validateNameLength", "name", "validatePasswordLength", "password", "app_release"})
public final class Validations {
    public static final com.internshala.foodrunner.util.Validations INSTANCE = null;
    
    public final boolean validateMobile(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile) {
        return false;
    }
    
    public final boolean validatePasswordLength(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    public final boolean validateNameLength(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public final boolean matchPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmPass) {
        return false;
    }
    
    public final boolean validateEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    private Validations() {
        super();
    }
}