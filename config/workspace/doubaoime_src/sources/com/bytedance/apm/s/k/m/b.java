package com.bytedance.apm.s.k.m;

/* loaded from: classes.dex */
public abstract class b {
    public long a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public String f3519c;

    /* renamed from: d, reason: collision with root package name */
    public StackTraceElement[] f3520d;

    String a() {
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i < this.f3520d.length; i++) {
            sb.append("\tat ");
            sb.append(this.f3520d[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
