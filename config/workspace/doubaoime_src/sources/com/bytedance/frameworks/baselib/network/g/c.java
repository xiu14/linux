package com.bytedance.frameworks.baselib.network.g;

import java.util.Objects;

/* loaded from: classes.dex */
public class c {
    private int a;
    private int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private b f5078c;

    /* renamed from: d, reason: collision with root package name */
    private a f5079d;

    public c(int i, b bVar, a aVar) {
        this.a = i;
        this.f5078c = bVar;
        this.f5079d = aVar;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public a c() {
        return this.f5079d;
    }

    public b d() {
        return this.f5078c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && Objects.equals(this.f5078c, cVar.f5078c) && Objects.equals(this.f5079d, cVar.f5079d);
    }
}
