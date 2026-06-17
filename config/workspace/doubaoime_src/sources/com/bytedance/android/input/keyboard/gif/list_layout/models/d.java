package com.bytedance.android.input.keyboard.gif.list_layout.models;

import com.bytedance.android.input.basic.IAppGlobals;
import com.google.gson.annotations.SerializedName;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class d {

    @SerializedName("channel")
    private final String a;

    @SerializedName("version_code")
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("version_name")
    private final String f2752c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("pkg_url")
    private final String f2753d;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f2753d;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return (this.f2753d.length() > 0) && this.b > IAppGlobals.a.o().getInt("emoticons_version_code", 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.a, dVar.a) && this.b == dVar.b && l.a(this.f2752c, dVar.f2752c) && l.a(this.f2753d, dVar.f2753d);
    }

    public int hashCode() {
        return this.f2753d.hashCode() + e.a.a.a.a.p0(this.f2752c, e.a.a.a.a.I(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("EmoticonsWordData(channel=");
        M.append(this.a);
        M.append(", versionCode=");
        M.append(this.b);
        M.append(", versionName=");
        M.append(this.f2752c);
        M.append(", pkgUrl=");
        return e.a.a.a.a.G(M, this.f2753d, ')');
    }
}
