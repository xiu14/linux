package com.bytedance.bdinstall;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* renamed from: com.bytedance.bdinstall.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0639t extends AbstractC0621a {
    private final Context a;
    private volatile Q b;

    public C0639t(Q q, C0641v c0641v) {
        this.b = q;
        this.a = q.q();
    }

    @Override // com.bytedance.bdinstall.InterfaceC0638s
    public void a(String str, C0641v c0641v) {
        SharedPreferences b;
        if (c0641v != null && (b = c0641v.b(this.b)) != null) {
            b.edit().putString(RemoteMessageConst.DEVICE_TOKEN, str).apply();
        }
        c0.c(this.a).e(this.b.i(), RemoteMessageConst.DEVICE_TOKEN, str);
    }
}
