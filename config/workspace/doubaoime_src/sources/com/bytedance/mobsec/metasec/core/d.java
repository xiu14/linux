package com.bytedance.mobsec.metasec.core;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.InputDeviceCompat;
import java.util.Objects;
import ms.bd.c.w2;
import ms.bd.c.y2;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements w2 {
    public final long a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final c f5407c;

    public d(c cVar, Context context, long j) {
        Objects.requireNonNull(context, "context could not be null");
        this.f5407c = cVar;
        this.b = context.getApplicationContext();
        this.a = j;
    }

    @Override // ms.bd.c.w2
    public final void a(String str, String str2) {
        if (this.a == -1 || TextUtils.isEmpty(str)) {
            return;
        }
        y2.a(InputDeviceCompat.SOURCE_HDMI, 0, this.a, str, str2);
    }

    @Override // ms.bd.c.w2
    public final void b(String str) {
        if (this.a != -1) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.contains("content")) {
                    str = new JSONObject(str).getString("content");
                }
                y2.a(33554447, 0, this.a, str, this.b);
            } catch (Exception unused) {
            }
        }
    }

    @Override // ms.bd.c.w2
    public final void c(String str) {
        this.f5407c.f5403d = str;
        long j = this.a;
        if (j != -1) {
            y2.a(33554435, 0, j, str, this.b);
        }
    }

    @Override // ms.bd.c.w2
    public final void d(int i) {
        long j = this.a;
        if (j != -1) {
            y2.a(33554441, i, j, null, null);
        }
    }

    @Override // ms.bd.c.w2
    public final void e(String str) {
        this.f5407c.f5402c = str;
        long j = this.a;
        if (j != -1) {
            y2.a(33554434, 0, j, str, this.b);
        }
    }
}
