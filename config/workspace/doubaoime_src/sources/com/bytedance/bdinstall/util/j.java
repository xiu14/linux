package com.bytedance.bdinstall.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.common.utility.NetworkUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class j {
    private static volatile BroadcastReceiver b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile j f4109c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile NetworkUtils.NetworkType f4110d = NetworkUtils.NetworkType.MOBILE;

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicInteger f4111e = new AtomicInteger(0);
    private Context a;

    private j(Context context) {
        this.a = context;
        int i = C0640u.a;
        f4110d = NetworkUtils.e(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        b = new i(this);
        this.a.registerReceiver(b, intentFilter);
    }

    public static j d(Context context) {
        if (f4109c == null) {
            synchronized (j.class) {
                if (f4109c == null) {
                    f4109c = new j(context);
                }
            }
        }
        return f4109c;
    }

    public static void f() {
        f4111e.incrementAndGet();
        int i = C0640u.a;
    }

    public NetworkUtils.NetworkType e() {
        return f4110d;
    }
}
