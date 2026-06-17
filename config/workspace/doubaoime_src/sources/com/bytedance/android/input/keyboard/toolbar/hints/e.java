package com.bytedance.android.input.keyboard.toolbar.hints;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class e extends com.bytedance.android.input.keyboard.toolbar.entity.a {
    private String a;
    private long b;

    public e(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.a, eVar.a) && this.b == eVar.b;
    }

    public int hashCode() {
        String str = this.a;
        return Long.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ToolbarHintsViewData(hintsText=");
        M.append(this.a);
        M.append(", displayTime=");
        return e.a.a.a.a.E(M, this.b, ')');
    }
}
