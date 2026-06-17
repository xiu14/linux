package com.bytedance.apm.B.l;

/* loaded from: classes.dex */
public class k implements Comparable {
    public String a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public long f3285c;

    /* renamed from: e, reason: collision with root package name */
    public long f3287e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    public int f3286d = 1;

    public k(String str, long j, String str2) {
        this.a = str;
        this.f3285c = j;
        this.b = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        long j = this.f3285c;
        long j2 = ((k) obj).f3285c;
        if (j == j2) {
            return 0;
        }
        return j > j2 ? 1 : -1;
    }
}
