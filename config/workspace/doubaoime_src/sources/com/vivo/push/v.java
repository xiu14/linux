package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class v {
    private int a;
    private String b;

    public v(int i) {
        this.a = -1;
        if (i < 0) {
            throw new IllegalArgumentException("PushCommand: the value of command must > 0.");
        }
        this.a = i;
    }

    public static long c() {
        return 0L;
    }

    private void e(d dVar) {
        dVar.a(com.heytap.mcssdk.constant.b.y, this.a);
        dVar.a("client_pkgname", this.b);
        c(dVar);
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    protected abstract void c(d dVar);

    protected abstract void d(d dVar);

    public boolean d() {
        return false;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void b(Intent intent) {
        d a = d.a(intent);
        if (a == null) {
            com.vivo.push.util.t.b("PushCommand", "bundleWapper is null");
            return;
        }
        a.a("method", this.a);
        e(a);
        Bundle b = a.b();
        if (b != null) {
            intent.putExtras(b);
        }
    }

    public final void a(Intent intent) {
        d a = d.a(intent);
        if (a == null) {
            com.vivo.push.util.t.b("PushCommand", "bundleWapper is null");
            return;
        }
        a(a);
        Bundle b = a.b();
        if (b != null) {
            intent.putExtras(b);
        }
    }

    public final void a(d dVar) {
        String a = x.a(this.a);
        if (a == null) {
            a = "";
        }
        dVar.a("method", a);
        e(dVar);
    }

    public final void b(d dVar) {
        String a = dVar.a();
        if (!TextUtils.isEmpty(a)) {
            this.b = a;
        } else {
            this.b = dVar.a("client_pkgname");
        }
        d(dVar);
    }
}
