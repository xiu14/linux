package com.bytedance.applog.z;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class c {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f3933c;

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f3934d;

    /* renamed from: e, reason: collision with root package name */
    private final List<a> f3935e = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r2, int r3, java.util.Set<java.lang.String> r4, java.util.Map<java.lang.String, java.util.List<java.util.Set<java.lang.String>>> r5, java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r6) {
        /*
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L29
            r0 = 2
            if (r3 == r0) goto L23
            r0 = 3
            if (r3 == r0) goto L1d
            r0 = 4
            if (r3 == r0) goto L17
            r0 = 6
            if (r3 == r0) goto L11
            r2 = 0
            goto L2f
        L11:
            com.bytedance.applog.z.i r3 = new com.bytedance.applog.z.i
            r3.<init>(r2, r4, r5, r6)
            goto L2e
        L17:
            com.bytedance.applog.z.h r3 = new com.bytedance.applog.z.h
            r3.<init>(r2, r4, r5, r6)
            goto L2e
        L1d:
            com.bytedance.applog.z.f r3 = new com.bytedance.applog.z.f
            r3.<init>(r2, r4, r5, r6)
            goto L2e
        L23:
            com.bytedance.applog.z.e r3 = new com.bytedance.applog.z.e
            r3.<init>(r2, r4, r5, r6)
            goto L2e
        L29:
            com.bytedance.applog.z.g r3 = new com.bytedance.applog.z.g
            r3.<init>(r2, r4, r5, r6)
        L2e:
            r2 = r3
        L2f:
            if (r2 == 0) goto L36
            java.util.List<com.bytedance.applog.z.a> r3 = r1.f3935e
            r3.add(r2)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.z.c.a(int, int, java.util.Set, java.util.Map, java.util.Map):void");
    }

    public int b() {
        return this.b;
    }

    public JSONArray c() {
        return this.f3934d;
    }

    public int d() {
        return this.a;
    }

    public boolean e() {
        return !this.f3935e.isEmpty();
    }

    public boolean f(b bVar, String str, String str2) {
        for (a aVar : this.f3935e) {
            if (aVar.b(str, str2)) {
                return aVar.d(bVar);
            }
        }
        return false;
    }

    public void g(int i) {
        this.b = i;
    }

    public void h(JSONArray jSONArray) {
        this.f3934d = jSONArray;
    }

    public void i(JSONArray jSONArray) {
        this.f3933c = jSONArray;
    }

    public void j(int i) {
        this.a = i;
    }
}
