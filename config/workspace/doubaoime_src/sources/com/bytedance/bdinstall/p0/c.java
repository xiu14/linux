package com.bytedance.bdinstall.p0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.bdinstall.e0;
import com.bytedance.bdinstall.util.o;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class c extends a {
    private volatile String i;
    private volatile String[] j;
    private volatile String k;
    private volatile JSONArray l;

    c(Context context, j jVar) {
        super(context, jVar);
    }

    @Override // com.bytedance.bdinstall.o0.a
    public void a() {
        this.f4088c.e(Arrays.asList("openudid", "clientudid", "serial_number", "sim_serial_number", "udid", "device_id", "install_id"));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    @Override // com.bytedance.bdinstall.p0.a, com.bytedance.bdinstall.o0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String c(boolean r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f4090e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r9 = r8.f4090e
            return r9
        Lb:
            android.content.Context r0 = r8.a
            r1 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r2)     // Catch: java.lang.Exception -> L19
            goto L1e
        L19:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r1
        L1e:
            android.content.Context r2 = r8.a
            com.bytedance.bdinstall.p0.j r3 = r8.b
            com.bytedance.bdinstall.Q r3 = r3.c()
            android.content.SharedPreferences r2 = com.bytedance.bdinstall.util.g.d(r2, r3)
            java.lang.String r3 = "openudid"
            java.lang.String r4 = r2.getString(r3, r1)
            boolean r5 = com.bytedance.bdinstall.e0.g(r0)     // Catch: java.lang.Exception -> Lbc
            if (r5 == 0) goto L54
            java.lang.String r5 = "9774d56d682e549c"
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Exception -> Lbc
            if (r5 == 0) goto L3f
            goto L54
        L3f:
            boolean r9 = com.bytedance.bdinstall.e0.g(r4)     // Catch: java.lang.Exception -> Lbc
            if (r9 == 0) goto L4c
            com.bytedance.bdinstall.p0.d r9 = r8.f4088c     // Catch: java.lang.Exception -> Lbc
            java.lang.String r9 = r9.j(r0, r4)     // Catch: java.lang.Exception -> Lbc
            goto L52
        L4c:
            com.bytedance.bdinstall.p0.d r9 = r8.f4088c     // Catch: java.lang.Exception -> Lbc
            java.lang.String r9 = r9.j(r1, r0)     // Catch: java.lang.Exception -> Lbc
        L52:
            r0 = r9
            goto Lbc
        L54:
            boolean r5 = com.bytedance.bdinstall.e0.g(r4)     // Catch: java.lang.Exception -> Lbc
            if (r5 != 0) goto Lb4
            java.security.SecureRandom r4 = new java.security.SecureRandom     // Catch: java.lang.Exception -> Lbc
            r4.<init>()     // Catch: java.lang.Exception -> Lbc
            java.math.BigInteger r5 = new java.math.BigInteger     // Catch: java.lang.Exception -> Lbc
            r6 = 80
            r5.<init>(r6, r4)     // Catch: java.lang.Exception -> Lbc
            r4 = 16
            java.lang.String r4 = r5.toString(r4)     // Catch: java.lang.Exception -> Lbc
            r5 = 0
            char r5 = r4.charAt(r5)     // Catch: java.lang.Exception -> Lbc
            r6 = 45
            if (r5 != r6) goto L7a
            r5 = 1
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.Exception -> Lbc
        L7a:
            int r5 = r4.length()     // Catch: java.lang.Exception -> Lbc
            int r5 = 13 - r5
            if (r5 <= 0) goto L98
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbc
            r6.<init>()     // Catch: java.lang.Exception -> Lbc
        L87:
            if (r5 <= 0) goto L91
            r7 = 70
            r6.append(r7)     // Catch: java.lang.Exception -> Lbc
            int r5 = r5 + (-1)
            goto L87
        L91:
            r6.append(r4)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> Lbc
        L98:
            if (r9 == 0) goto La9
            com.bytedance.bdinstall.p0.b r9 = r8.f4089d     // Catch: java.lang.Exception -> Lbc
            if (r9 == 0) goto La2
            java.lang.String r1 = r9.j(r1, r4)     // Catch: java.lang.Exception -> Lbc
        La2:
            boolean r9 = com.bytedance.bdinstall.e0.g(r1)     // Catch: java.lang.Exception -> Lbc
            if (r9 == 0) goto La9
            r4 = r1
        La9:
            android.content.SharedPreferences$Editor r9 = r2.edit()     // Catch: java.lang.Exception -> Lbc
            r9.putString(r3, r4)     // Catch: java.lang.Exception -> Lbc
            r9.apply()     // Catch: java.lang.Exception -> Lbc
            goto Lbb
        Lb4:
            com.bytedance.bdinstall.p0.b r9 = r8.f4089d     // Catch: java.lang.Exception -> Lbc
            if (r9 == 0) goto Lbb
            r9.j(r4, r1)     // Catch: java.lang.Exception -> Lbc
        Lbb:
            r0 = r4
        Lbc:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 != 0) goto Lcf
            java.lang.StringBuilder r9 = e.a.a.a.a.M(r0)
            java.lang.String r0 = r8.h
            r9.append(r0)
            java.lang.String r0 = r9.toString()
        Lcf:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 != 0) goto Ld7
            r8.f4090e = r0
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.p0.c.c(boolean):java.lang.String");
    }

    @Override // com.bytedance.bdinstall.p0.a, com.bytedance.bdinstall.o0.a
    public String d() {
        if (!TextUtils.isEmpty(this.f4091f)) {
            return this.f4091f;
        }
        try {
            SharedPreferences d2 = com.bytedance.bdinstall.util.g.d(this.a, this.b.c());
            String string = d2.getString("clientudid", null);
            if (e0.g(string)) {
                b bVar = this.f4089d;
                if (bVar != null) {
                    bVar.i(string, null);
                }
            } else {
                string = UUID.randomUUID().toString();
                b bVar2 = this.f4089d;
                String i = bVar2 != null ? bVar2.i(null, string) : null;
                if (e0.g(i)) {
                    string = i;
                }
                SharedPreferences.Editor edit = d2.edit();
                edit.putString("clientudid", string);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                string = string + this.h;
            }
            this.f4091f = string;
            return string;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    @Override // com.bytedance.bdinstall.p0.a
    protected void e(j jVar, d dVar) {
        d dVar2;
        d dVar3;
        StringBuilder M = e.a.a.a.a.M("ZQLiNFJR+CWEI4px");
        M.append(com.bytedance.bdinstall.util.e.e());
        String sb = M.toString();
        String substring = new String(new char[]{sb.charAt(1), sb.charAt(3), sb.charAt(1), sb.charAt(11), sb.charAt(15), sb.charAt(10), sb.charAt(8), sb.charAt(17), sb.charAt(9), sb.charAt(9), sb.charAt(12), sb.charAt(13), sb.charAt(13), sb.charAt(5), sb.charAt(18), sb.charAt(13), sb.charAt(14), sb.charAt(11), sb.charAt(4), sb.charAt(19), sb.charAt(7)}).substring(2, 18);
        boolean z = !jVar.f();
        try {
            dVar3 = new g(this.a, z, Environment.getExternalStorageDirectory().getPath() + com.bytedance.bdinstall.util.e.a("L0FuZHJvaWQvZGF0YS9jb20uc25zc2RrLmFwaS9ieXRlZGFuY2U=") + this.h, jVar.b(), substring, jVar.c().i());
            dVar2 = dVar;
        } catch (Exception e2) {
            e = e2;
            dVar2 = dVar;
        }
        try {
            try {
                dVar2.m(dVar3);
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                dVar3 = dVar2;
                dVar3.m(new g(this.a, z, Environment.getExternalStorageDirectory().getPath() + "/" + com.bytedance.bdinstall.util.e.e() + this.h, jVar.b(), substring, jVar.c().i()));
            }
            dVar3.m(new g(this.a, z, Environment.getExternalStorageDirectory().getPath() + "/" + com.bytedance.bdinstall.util.e.e() + this.h, jVar.b(), substring, jVar.c().i()));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public String f() {
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        }
        try {
            String k = this.f4088c.k(null, o.g(this.a, this.b.c()));
            if (!TextUtils.isEmpty(k)) {
                k = k + this.h;
            }
            this.i = k;
            return k;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String[] g() {
        if (this.j != null && this.j.length > 0) {
            return this.j;
        }
        try {
            String[] h = this.f4088c.h(null, o.h(this.a, this.b.c()));
            if (h == null) {
                h = new String[0];
            }
            for (int i = 0; i < h.length; i++) {
                h[i] = h[i] + this.h;
            }
            this.j = h;
            return h;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String h() {
        if (!TextUtils.isEmpty(this.k)) {
            return this.k;
        }
        try {
            String l = this.f4088c.l(null, o.b(this.a, this.b.c()));
            if (!TextUtils.isEmpty(l)) {
                l = l + this.h;
            }
            this.k = l;
            return l;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public JSONArray i() {
        if (this.l != null) {
            return this.l;
        }
        try {
            this.l = o.e(this.a, this.b.c());
            return this.l;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
