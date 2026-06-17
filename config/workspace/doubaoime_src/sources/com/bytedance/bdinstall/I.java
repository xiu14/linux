package com.bytedance.bdinstall;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class I {

    @Nullable
    public final String a;
    public final boolean b;

    public I(@Nullable String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Oaid{id='");
        e.a.a.a.a.G0(M, this.a, '\'', ", maySupport=");
        return e.a.a.a.a.L(M, this.b, '}');
    }
}
