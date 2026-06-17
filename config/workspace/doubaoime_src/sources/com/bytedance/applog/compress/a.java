package com.bytedance.applog.compress;

/* loaded from: classes.dex */
public class a {
    public int a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f3783c;

    /* renamed from: d, reason: collision with root package name */
    public long f3784d;

    /* renamed from: e, reason: collision with root package name */
    public int f3785e;

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("{dataSize=");
        M.append(this.a);
        M.append(", compressSize=");
        M.append(this.b);
        M.append(", encodeType=");
        M.append(this.f3783c);
        M.append(", compressTime=");
        M.append(this.f3784d);
        M.append(", result=");
        M.append(this.f3785e);
        M.append(", token=");
        M.append(0);
        M.append('}');
        return M.toString();
    }
}
