package com.bytedance.common.wschannel.channel.c.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import okhttp3.B;

/* loaded from: classes.dex */
class f {
    private final List<String> a;
    private com.bytedance.common.wschannel.channel.c.a.h.a b;

    /* renamed from: c, reason: collision with root package name */
    private int f4219c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f4220d;

    f(List<String> list, com.bytedance.common.wschannel.channel.c.a.h.a aVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        Logger.d("WsChannelSdk_ok", "urls : " + arrayList);
        this.b = aVar;
        d();
    }

    synchronized String a() {
        int i = this.f4219c + 1;
        this.f4219c = i;
        if (this.a.size() <= i) {
            return "";
        }
        String str = this.a.get(i);
        this.f4220d = str;
        return str;
    }

    synchronized Pair<String, Long> b(B b) {
        String c2;
        long b2;
        c2 = c();
        b2 = this.b.b(b);
        if (b2 == -1) {
            this.b.c();
            c2 = a();
            if (!TextUtils.isEmpty(c2)) {
                Objects.requireNonNull(this.b);
                b2 = (long) ((Math.random() * 4500.0d) + 500.0d);
            }
        }
        return new Pair<>(c2, Long.valueOf(b2));
    }

    public synchronized String c() {
        if (com.bytedance.android.input.k.b.a.Y(this.f4220d)) {
            int size = this.a.size();
            int i = this.f4219c;
            if (size > i) {
                this.f4220d = this.a.get(i);
            }
        }
        return this.f4220d;
    }

    synchronized void d() {
        this.b.c();
        this.f4220d = null;
        this.f4219c = 0;
    }
}
