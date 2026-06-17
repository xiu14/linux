package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class i {
    private Class<?> a;
    private Class<?> b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f1860c;

    public i() {
    }

    public void a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.f1860c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b) && j.b(this.f1860c, iVar.f1860c);
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class<?> cls = this.f1860c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MultiClassKey{first=");
        M.append(this.a);
        M.append(", second=");
        M.append(this.b);
        M.append('}');
        return M.toString();
    }

    public i(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.f1860c = cls3;
    }
}
