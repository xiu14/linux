package com.bytedance.bdinstall.util;

import android.text.TextUtils;
import com.bytedance.bdinstall.InterfaceC0627g;
import com.bytedance.bdinstall.Q;

/* loaded from: classes.dex */
public class k {
    private InterfaceC0627g a;
    private Q b;

    public k(Q q) {
        this.b = q;
    }

    public long a() {
        int aid;
        Q q = this.b;
        if (q != null) {
            aid = q.h();
        } else {
            InterfaceC0627g interfaceC0627g = this.a;
            if (interfaceC0627g == null) {
                return 0L;
            }
            aid = interfaceC0627g.getAid();
        }
        return aid;
    }

    public String b() {
        Q q = this.b;
        if (q != null) {
            return q.k();
        }
        InterfaceC0627g interfaceC0627g = this.a;
        if (interfaceC0627g != null) {
            return interfaceC0627g.getAppName();
        }
        return null;
    }

    public String c() {
        Q q = this.b;
        if (q != null) {
            String D = q.D();
            return TextUtils.isEmpty(D) ? this.b.o() : D;
        }
        InterfaceC0627g interfaceC0627g = this.a;
        if (interfaceC0627g == null) {
            return null;
        }
        String a = interfaceC0627g.a();
        return TextUtils.isEmpty(a) ? this.a.getChannel() : a;
    }

    public long d() {
        Q q = this.b;
        if (q != null) {
            return q.v();
        }
        InterfaceC0627g interfaceC0627g = this.a;
        if (interfaceC0627g != null) {
            return interfaceC0627g.getManifestVersionCode();
        }
        return 0L;
    }

    public long e() {
        Q q = this.b;
        if (q != null) {
            return q.E();
        }
        InterfaceC0627g interfaceC0627g = this.a;
        if (interfaceC0627g != null) {
            return interfaceC0627g.getUpdateVersionCode();
        }
        return 0L;
    }

    public String f() {
        Q q = this.b;
        if (q != null) {
            return q.G();
        }
        InterfaceC0627g interfaceC0627g = this.a;
        if (interfaceC0627g != null) {
            return interfaceC0627g.c();
        }
        return null;
    }

    public long g() {
        Q q = this.b;
        if (q != null) {
            return q.H();
        }
        InterfaceC0627g interfaceC0627g = this.a;
        if (interfaceC0627g != null) {
            return interfaceC0627g.getVersionCode();
        }
        return 0L;
    }
}
