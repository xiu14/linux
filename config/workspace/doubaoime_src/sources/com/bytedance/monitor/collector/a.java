package com.bytedance.monitor.collector;

import android.os.Message;
import androidx.annotation.CallSuper;

/* loaded from: classes.dex */
public abstract class a {
    public static long b;

    /* renamed from: c, reason: collision with root package name */
    public static long f5422c;
    public volatile boolean a = false;

    @CallSuper
    public void a(String str, Message message) {
        this.a = false;
    }

    @CallSuper
    public void b(String str) {
        this.a = true;
    }

    public boolean c() {
        return false;
    }
}
