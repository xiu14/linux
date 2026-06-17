package com.bytedance.news.common.settings.internal;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public class a {
    private static volatile Context a;

    private a() {
    }

    public static Context a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    throw new IllegalStateException("SettingsManager尚未被配置");
                }
            }
        }
        return a;
    }

    public static synchronized void b(Context context) {
        synchronized (a.class) {
            if (a == null) {
                if (context instanceof Application) {
                    a = context;
                } else {
                    a = context.getApplicationContext();
                }
            }
        }
    }
}
