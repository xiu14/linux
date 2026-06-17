package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class BaseDispatchAction {
    private static final String o = "BaseDispatchAction";
    private long h;
    private long i;
    private int j;
    private long k;
    protected String l;
    protected int m;
    protected List<String> a = new ArrayList();
    protected List<String> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    protected List<String> f5203c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    protected List<String> f5204d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    protected List<String> f5205e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    protected List<String> f5206f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    protected List<String> f5207g = new ArrayList();
    private List<String> n = new ArrayList();

    public enum DispatchResultEnum {
        DISPATCH_NONE,
        DISPATCH_HIT,
        DISPATCH_DROP,
        DISPATCH_DELAY
    }

    public static BaseDispatchAction a(String str, JSONObject jSONObject, int i, long j, long j2, long j3, String str2, long j4, List<String> list, int i2) {
        BaseDispatchAction hVar = str.equals("tc") ? new h() : null;
        if (str.equals("dispatch")) {
            hVar = new e();
        }
        if (str.equals("delay")) {
            hVar = new b();
        }
        if (hVar == null) {
            return null;
        }
        hVar.j = i;
        hVar.h = j;
        hVar.i = j2;
        hVar.k = j3;
        hVar.n = list;
        if (i2 < 0) {
            hVar.m = Integer.MAX_VALUE;
        } else {
            hVar.m = i2;
        }
        if (hVar.d(jSONObject, str2, j4)) {
            return hVar;
        }
        return null;
    }

    private boolean g() {
        long j = this.h;
        if (j == 0 && this.i == 0) {
            return true;
        }
        if (j != -1 && this.i != -1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.h && currentTimeMillis < this.i) {
                return true;
            }
            if (Logger.debug()) {
                Logger.d(o, "current time is out action lifecycle");
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j(org.json.JSONObject r4, java.lang.String r5, java.util.List<java.lang.String> r6, boolean r7) {
        /*
            r3 = this;
            org.json.JSONArray r4 = r4.optJSONArray(r5)
            if (r4 == 0) goto L33
            r5 = 0
            r0 = r5
        L8:
            int r1 = r4.length()
            if (r0 >= r1) goto L33
            java.lang.String r1 = r4.optString(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L30
            if (r7 == 0) goto L2d
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L21
            goto L26
        L21:
            java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Throwable -> L26
            r2 = 1
            goto L27
        L26:
            r2 = r5
        L27:
            if (r2 == 0) goto L30
            r6.add(r1)
            goto L30
        L2d:
            r6.add(r1)
        L30:
            int r0 = r0 + 1
            goto L8
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction.j(org.json.JSONObject, java.lang.String, java.util.List, boolean):void");
    }

    public int b() {
        return this.j;
    }

    public long c() {
        return this.k;
    }

    public abstract boolean d(JSONObject jSONObject, String str, long j);

    public boolean e(k kVar) {
        if (kVar.a() > this.j) {
            if (Logger.debug()) {
                String str = o;
                StringBuilder M = e.a.a.a.a.M("jump action: ");
                M.append(this.l);
                M.append(", dispatchPriority: ");
                M.append(kVar.a());
                M.append(", actionPriority: ");
                e.a.a.a.a.D0(M, this.j, str);
            }
            return false;
        }
        if (this.n.isEmpty() || TextUtils.isEmpty(kVar.c()) || this.n.contains(kVar.c())) {
            return g();
        }
        if (Logger.debug()) {
            String str2 = o;
            StringBuilder M2 = e.a.a.a.a.M("request method not support: ");
            M2.append(kVar.c());
            Logger.d(str2, M2.toString());
        }
        return false;
    }

    public boolean f() {
        return g();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean h(android.net.Uri r7) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction.h(android.net.Uri):boolean");
    }

    protected void i(JSONObject jSONObject) {
        j(jSONObject, "host_group", this.a, false);
        j(jSONObject, "equal_group", this.b, false);
        j(jSONObject, "prefixes_group", this.f5203c, false);
        j(jSONObject, "contain_group", this.f5204d, false);
        j(jSONObject, "pattern_group", this.f5205e, true);
        j(jSONObject, "url_group", this.f5206f, true);
        j(jSONObject, "path_contain", this.f5207g, false);
    }
}
