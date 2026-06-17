package com.bytedance.bdinstall;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class a0 extends AbstractC0631k {
    static final long[] n = {com.heytap.mcssdk.constant.a.q, 30000, com.heytap.mcssdk.constant.a.f6886d, 120000, 120000, 120000, 180000, 180000};
    private static final long[] o = {180000, 360000, 540000, 540000, com.heytap.mcssdk.constant.a.h, 1800000};
    private static final long[] p = {100, 15000, 20000, 20000, com.heytap.mcssdk.constant.a.f6886d, com.heytap.mcssdk.constant.a.f6886d, 180000, 180000, 540000, 540000};
    private final com.bytedance.bdinstall.f0.b h;
    private final C0641v i;
    private final com.bytedance.bdinstall.g0.h j;
    private final com.bytedance.bdinstall.o0.a k;
    private final com.bytedance.bdinstall.k0.m l;
    private final Q m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    a0(com.bytedance.bdinstall.Q r10, com.bytedance.bdinstall.k0.m r11, com.bytedance.bdinstall.C0641v r12, com.bytedance.bdinstall.f0.b r13) {
        /*
            r9 = this;
            android.content.Context r0 = r10.q()
            r1 = 0
            if (r12 != 0) goto L9
            goto L3f
        L9:
            android.content.SharedPreferences r3 = r12.b(r10)
            if (r3 != 0) goto L10
            goto L3f
        L10:
            java.lang.String r4 = "register_time"
            long r5 = r3.getLong(r4, r1)
            com.bytedance.bdinstall.P r7 = r11.h()
            java.lang.String r8 = r7.c()
            boolean r8 = com.bytedance.bdinstall.e0.b(r8)
            if (r8 == 0) goto L2e
            java.lang.String r7 = r7.e()
            boolean r7 = com.bytedance.bdinstall.e0.b(r7)
            if (r7 != 0) goto L3e
        L2e:
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 == 0) goto L3e
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r3 = r3.putLong(r4, r1)
            r3.apply()
            goto L3f
        L3e:
            r1 = r5
        L3f:
            r9.<init>(r0, r10, r1)
            r9.l = r11
            r9.m = r10
            r9.h = r13
            r9.i = r12
            r9.j = r11
            java.lang.Class<com.bytedance.bdinstall.o0.a> r11 = com.bytedance.bdinstall.o0.a.class
            int r10 = r10.h()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.Object r10 = com.bytedance.bdinstall.o0.d.a(r11, r10)
            com.bytedance.bdinstall.o0.a r10 = (com.bytedance.bdinstall.o0.a) r10
            r9.k = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.a0.<init>(com.bytedance.bdinstall.Q, com.bytedance.bdinstall.k0.m, com.bytedance.bdinstall.v, com.bytedance.bdinstall.f0.b):void");
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected void a() {
        com.bytedance.bdinstall.h0.c d2 = com.bytedance.bdinstall.util.d.b().d(this.m.h());
        SharedPreferences d3 = com.bytedance.bdinstall.util.g.d(this.m.q(), this.m);
        SharedPreferences.Editor edit = d3.edit();
        if (!d3.getBoolean("is_first_register_for_app", false) && edit != null) {
            edit.putBoolean("is_first_register_for_app", true);
            edit.apply();
            d2.g(true);
        }
        Q q = this.m;
        com.bytedance.bdinstall.util.d.b().d(q.h()).b(q, "dr_register_result");
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected boolean b() throws JSONException {
        int i = C0640u.a;
        com.bytedance.bdinstall.l0.a p2 = p();
        if (p2 == null) {
            return false;
        }
        boolean t = ((com.bytedance.bdinstall.k0.m) this.j).t(p2, this.i, this.k);
        if (t) {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences b = this.i.b(this.m);
            if (b != null) {
                b.edit().putLong("register_time", currentTimeMillis).apply();
            }
        }
        return t;
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected String c() {
        return DownloadFileUtils.MODE_READ;
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected long[] e() {
        int i = this.l.i();
        if (i == 0) {
            return p;
        }
        if (i == 1) {
            return o;
        }
        if (i == 2) {
            return n;
        }
        int i2 = C0640u.a;
        return o;
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    public boolean g() {
        return true;
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected boolean h() {
        return true;
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected long i() {
        if (((com.bytedance.bdinstall.f0.a) this.h).b()) {
            return 21600000L;
        }
        return com.heytap.mcssdk.constant.a.f6889g;
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected void j(boolean z) {
        com.bytedance.bdinstall.util.d.b().d(this.m.h()).j(z);
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected void n(int i) {
        com.bytedance.bdinstall.util.d.b().d(this.b.h()).i(i);
    }

    protected com.bytedance.bdinstall.l0.a p() throws JSONException {
        String str;
        str = "";
        JSONObject e2 = this.l.e();
        JSONObject jSONObject = new JSONObject();
        e0.d(jSONObject, e2);
        this.l.x(jSONObject, this.i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("header", jSONObject);
        jSONObject2.put("magic_tag", "ss_app_log");
        jSONObject2.put("_gen_time", System.currentTimeMillis());
        int i = C0640u.a;
        String uri = Uri.parse(this.i.a().d()).buildUpon().appendQueryParameter("req_id", com.bytedance.bdinstall.util.m.b()).build().toString();
        this.f4010e.o().b(true);
        boolean z = (TextUtils.isEmpty(jSONObject.optString("device_id")) || TextUtils.isEmpty(jSONObject.optString("install_id"))) ? false : true;
        com.bytedance.bdinstall.l0.a aVar = null;
        try {
            com.bytedance.bdinstall.h0.c d2 = com.bytedance.bdinstall.util.d.b().d(this.m.h());
            d2.e();
            G w = this.m.w();
            Objects.requireNonNull(C0629i.d());
            aVar = C0624d.e(w, null, uri, jSONObject2, this.m.c(), this.m.t(), z, this.l.j().a(uri, true, true));
            d2.d();
            return aVar;
        } finally {
            this.f4010e.o().b(false);
            com.bytedance.bdinstall.util.d.e(this.m, jSONObject, new JSONObject(aVar != null ? aVar.a() : ""));
        }
    }
}
