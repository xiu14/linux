package com.bytedance.apm.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class h {
    private final SharedPreferences a = com.bytedance.apm.core.e.e(com.bytedance.apm.g.h(), "monitor_config");

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        private static final h a = new h(null);
    }

    h(a aVar) {
    }

    public static h a() {
        return b.a;
    }

    public int b(String str) {
        return this.a.getInt(str, -1);
    }

    public long c(String str) {
        return this.a.getLong(str, 0L);
    }

    public String d(String str) {
        return this.a.getString(str, null);
    }

    public void e(String str, int i) {
        this.a.edit().putInt(str, i).apply();
    }

    public void f(String str, long j) {
        this.a.edit().putLong(str, j).apply();
    }

    public void g(String str, String str2) {
        this.a.edit().putString(str, str2).apply();
    }
}
