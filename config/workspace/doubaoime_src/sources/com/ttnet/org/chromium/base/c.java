package com.ttnet.org.chromium.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes2.dex */
public class c {
    private static Context a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        private static SharedPreferences a = c.a();
    }

    static SharedPreferences a() {
        h h = h.h();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(a);
            h.close();
            return defaultSharedPreferences;
        } catch (Throwable th) {
            try {
                h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Context b() {
        return a;
    }

    public static void c(Context context) {
        a = context;
    }

    public static Intent d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 4);
    }
}
