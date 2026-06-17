package com.bytedance.android.input.basic.settings.api.c;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class c {

    @SerializedName("seed_id")
    private String a;

    @SerializedName("bot_seed_params")
    private String b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c() {
        /*
            r2 = this;
            r0 = 0
            r1 = 3
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.basic.settings.api.c.c.<init>():void");
    }

    public c(String str, String str2) {
        kotlin.s.c.l.f(str, "seedId");
        kotlin.s.c.l.f(str2, "paramsSeed");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.s.c.l.a(this.a, cVar.a) && kotlin.s.c.l.a(this.b, cVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("BotConfig(seedId=");
        M.append(this.a);
        M.append(", paramsSeed=");
        return e.a.a.a.a.G(M, this.b, ')');
    }

    public /* synthetic */ c(String str, String str2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? null : "");
    }
}
