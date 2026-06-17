package com.bytedance.android.input.basic.network.b;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a<T> {

    @SerializedName("code")
    private int a = -1;

    @SerializedName("msg")
    private String b = "";

    /* renamed from: c, reason: collision with root package name */
    @SerializedName(RemoteMessageConst.DATA)
    private T f2071c;

    public final int a() {
        return this.a;
    }

    public final T b() {
        return this.f2071c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.a == 0;
    }

    public final void e(int i) {
        this.a = i;
    }

    public final void f(String str) {
        l.f(str, "<set-?>");
        this.b = str;
    }
}
