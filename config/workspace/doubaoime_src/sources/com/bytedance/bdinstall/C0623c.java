package com.bytedance.bdinstall;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.TimeZone;

/* renamed from: com.bytedance.bdinstall.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0623c extends AbstractC0631k {
    private boolean h;
    private final Q i;
    private final C0641v j;
    private C0626f k;

    C0623c(Q q, C0641v c0641v) {
        super(q.q(), q);
        this.h = false;
        this.i = q;
        this.j = c0641v;
        C0632l c0632l = this.f4010e;
        if (c0632l != null) {
            this.k = c0632l.f();
        }
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected void a() {
        com.bytedance.bdinstall.h0.a a = com.bytedance.bdinstall.util.d.b().a(this.i.h());
        SharedPreferences d2 = com.bytedance.bdinstall.util.g.d(this.i.q(), this.i);
        SharedPreferences.Editor edit = d2.edit();
        if (!d2.getBoolean("is_first_activate_for_app", false) && edit != null) {
            edit.putBoolean("is_first_activate_for_app", true);
            edit.apply();
            a.g(true);
        }
        Q q = this.i;
        com.bytedance.bdinstall.util.d.b().a(q.h()).b(q, "dr_active_result");
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected boolean b() {
        String sb;
        String c2 = this.j.a().c();
        C0626f c0626f = this.k;
        if (c0626f != null) {
            c2 = c0626f.a(this.a, new StringBuilder(c2), null, true, Level.L0);
        }
        StringBuilder sb2 = new StringBuilder(c2);
        try {
            float rawOffset = (TimeZone.getDefault().getRawOffset() * 1.0f) / 3600000.0f;
            if (rawOffset < -12.0f) {
                rawOffset = -12.0f;
            }
            if (rawOffset > 12.0f) {
                rawOffset = 12.0f;
            }
            C0624d.b(sb2, "req_id", com.bytedance.bdinstall.util.m.b());
            com.bytedance.bdinstall.j0.b n = this.i.n();
            if (n != null) {
                C0624d.b(sb2, "app_trait", n.a(this.i.q()));
            }
            C0624d.b(sb2, "timezone", rawOffset + "");
            String J2 = this.i.J();
            if (!TextUtils.isEmpty(J2)) {
                C0624d.b(sb2, "package", J2);
                C0624d.b(sb2, "real_package_name", this.a.getPackageName());
            }
            try {
                Q q = this.i;
                int i = com.bytedance.bdinstall.util.o.h;
                C0624d.b(sb2, "carrier", q.z().h());
                C0624d.b(sb2, "mcc_mnc", this.i.z().g());
                C0624d.b(sb2, "sim_region", this.i.z().j());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            C0625e.a(this.a, this.i, sb2);
            C0624d.b(sb2, "app_version_minor", this.i.I());
            C0624d.b(sb2, "custom_bt", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
            Objects.requireNonNull(this.i);
            sb = sb2.toString();
        } catch (Throwable unused) {
            int i2 = C0640u.a;
            sb = sb2.toString();
        }
        String str = sb;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            C0632l c0632l = this.f4010e;
            if (c0632l != null) {
                c0632l.o().a(true);
            }
            com.bytedance.bdinstall.h0.a a = com.bytedance.bdinstall.util.d.b().a(this.i.h());
            a.e();
            G w = this.i.w();
            Objects.requireNonNull(C0629i.d());
            boolean a2 = C0624d.a(w, null, str, this.i.c(), this.i.t(), this.h);
            a.d();
            if (a2) {
                this.h = true;
            }
            if (a2) {
                m();
            }
            return a2;
        } finally {
            C0632l c0632l2 = this.f4010e;
            if (c0632l2 != null) {
                c0632l2.o().a(false);
            }
        }
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected String c() {
        return "ac";
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected long[] e() {
        return a0.n;
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
        return 0L;
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected void j(boolean z) {
        com.bytedance.bdinstall.util.d.b().a(this.i.h()).i(z);
    }

    @Override // com.bytedance.bdinstall.AbstractC0631k
    protected void n(int i) {
        com.bytedance.bdinstall.util.d.b().a(this.b.h()).f(i);
    }
}
