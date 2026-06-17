package com.bytedance.services.apm.api;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {
    private int a;
    private Map<String, String> b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f6085c;

    public c(int i, byte[] bArr) {
        this.a = i;
        this.f6085c = bArr;
    }

    @Nullable
    public Map<String, String> a() {
        return this.b;
    }

    public byte[] b() {
        return this.f6085c;
    }

    public int c() {
        return this.a;
    }

    public c(int i, Map<String, String> map, byte[] bArr) {
        this.a = i;
        this.b = map;
        this.f6085c = bArr;
    }
}
