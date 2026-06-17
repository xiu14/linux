package com.bytedance.android.input.keyboard.toolbar.clipboard;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class f {
    private final String a;
    private final boolean b;

    public f(String str, boolean z) {
        l.f(str, "text");
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.a, fVar.a) && this.b == fVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ToolbarClipboardItemData(text=");
        M.append(this.a);
        M.append(", isOriginText=");
        return e.a.a.a.a.L(M, this.b, ')');
    }
}
