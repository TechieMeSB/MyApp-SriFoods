package com.internshala.foodrunner.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00190\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\""}, d2 = {"Lcom/internshala/foodrunner/util/SessionManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "KEY_IS_LOGGEDIN", "", "getKEY_IS_LOGGEDIN", "()Ljava/lang/String;", "PREF_NAME", "getPREF_NAME", "PRIVATE_MODE", "", "getPRIVATE_MODE", "()I", "setPRIVATE_MODE", "(I)V", "editor", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "setEditor", "(Landroid/content/SharedPreferences$Editor;)V", "pref", "Landroid/content/SharedPreferences;", "getPref", "()Landroid/content/SharedPreferences;", "setPref", "(Landroid/content/SharedPreferences;)V", "isLoggedIn", "", "setLogin", "", "app_release"})
public final class SessionManager {
    private int PRIVATE_MODE;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PREF_NAME = "FoodApp";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String KEY_IS_LOGGEDIN = "isLoggedIn";
    private android.content.SharedPreferences pref;
    private android.content.SharedPreferences.Editor editor;
    
    public final int getPRIVATE_MODE() {
        return 0;
    }
    
    public final void setPRIVATE_MODE(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPREF_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKEY_IS_LOGGEDIN() {
        return null;
    }
    
    public final android.content.SharedPreferences getPref() {
        return null;
    }
    
    public final void setPref(android.content.SharedPreferences p0) {
    }
    
    public final android.content.SharedPreferences.Editor getEditor() {
        return null;
    }
    
    public final void setEditor(android.content.SharedPreferences.Editor p0) {
    }
    
    public final void setLogin(boolean isLoggedIn) {
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    public SessionManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}