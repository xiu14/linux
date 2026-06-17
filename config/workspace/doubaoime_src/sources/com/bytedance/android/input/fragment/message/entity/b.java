package com.bytedance.android.input.fragment.message.entity;

import com.google.gson.annotations.SerializedName;
import com.ss.android.message.log.PushLog;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b {

    @SerializedName("type")
    private final String a;

    @SerializedName(PushLog.KEY_VALUE)
    private final String b;

    public b() {
        this(null, null, 3);
    }

    public b(String str, String str2, int i) {
        String str3 = (i & 1) != 0 ? "" : null;
        String str4 = (i & 2) != 0 ? "" : null;
        l.f(str3, "type");
        l.f(str4, PushLog.KEY_VALUE);
        this.a = str3;
        this.b = str4;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return l.a(this.a, "webview");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.a, bVar.a) && l.a(this.b, bVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MessageContent(type=");
        M.append(this.a);
        M.append(", value=");
        return e.a.a.a.a.G(M, this.b, ')');
    }
}
