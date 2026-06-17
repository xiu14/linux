package com.vivo.push.b;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.aa;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes2.dex */
public class c extends com.vivo.push.v {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private long f8787c;

    /* renamed from: d, reason: collision with root package name */
    private int f8788d;

    /* renamed from: e, reason: collision with root package name */
    private int f8789e;

    /* renamed from: f, reason: collision with root package name */
    private String f8790f;

    /* renamed from: g, reason: collision with root package name */
    private String f8791g;
    private String h;

    public c(int i, String str) {
        super(i);
        this.f8787c = -1L;
        this.f8788d = -1;
        this.a = null;
        this.b = str;
    }

    public final int a(Context context) {
        if (this.f8788d == -1) {
            String str = this.b;
            if (TextUtils.isEmpty(str)) {
                com.vivo.push.util.t.a("BaseAppCommand", "pkg name is null");
                String a = a();
                if (TextUtils.isEmpty(a)) {
                    com.vivo.push.util.t.a("BaseAppCommand", "src is null");
                    return -1;
                }
                str = a;
            }
            this.f8788d = aa.b(context, str);
            if (!TextUtils.isEmpty(this.f8790f)) {
                this.f8788d = 2;
            }
        }
        return this.f8788d;
    }

    public final void b(int i) {
        this.f8789e = i;
    }

    public final void c(String str) {
        this.h = str;
    }

    public final void d(String str) {
        this.f8791g = str;
    }

    public final int e() {
        return this.f8789e;
    }

    public final void f() {
        this.f8790f = null;
    }

    public final String g() {
        return this.a;
    }

    @Override // com.vivo.push.v
    public String toString() {
        return "BaseAppCommand";
    }

    public final void b(String str) {
        this.a = str;
    }

    @Override // com.vivo.push.v
    protected void c(com.vivo.push.d dVar) {
        dVar.a("req_id", this.a);
        dVar.a(Constants.PACKAGE_NAME, this.b);
        dVar.a("sdk_version", 356L);
        dVar.a("PUSH_APP_STATUS", this.f8788d);
        if (!TextUtils.isEmpty(this.f8790f)) {
            dVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION", this.f8790f);
        }
        dVar.a("BaseAppCommand.EXTRA_APPID", this.h);
        dVar.a("BaseAppCommand.EXTRA_APPKEY", this.f8791g);
    }

    @Override // com.vivo.push.v
    protected void d(com.vivo.push.d dVar) {
        this.a = dVar.a("req_id");
        this.b = dVar.a(Constants.PACKAGE_NAME);
        this.f8787c = dVar.b("sdk_version", 0L);
        this.f8788d = dVar.b("PUSH_APP_STATUS", 0);
        this.f8790f = dVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION");
        this.h = dVar.a("BaseAppCommand.EXTRA_APPID");
        this.f8791g = dVar.a("BaseAppCommand.EXTRA_APPKEY");
    }
}
