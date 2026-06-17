package com.bytedance.crash.X;

import com.ss.ttuploader.TTUploadResolver;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b {
    private int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4528c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.crash.npth_repair.a.b f4529d;

    public b(int i, int i2, boolean z, JSONArray jSONArray) {
        this.a = TTUploadResolver.HOST_MAX_CACHE_TIME;
        this.b = i;
        if (i2 > 0) {
            this.a = i2;
        }
        this.f4528c = z;
        this.f4529d = (jSONArray == null || jSONArray.length() < 2) ? null : new com.bytedance.crash.npth_repair.a.b(jSONArray);
    }

    public boolean a() {
        return this.f4528c;
    }

    public int b() {
        return this.a;
    }

    public com.bytedance.crash.npth_repair.a.b c() {
        return this.f4529d;
    }

    public int d() {
        return this.b;
    }
}
