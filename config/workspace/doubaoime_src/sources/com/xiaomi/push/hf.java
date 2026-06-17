package com.xiaomi.push;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public class hf extends hd {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private a f549a;

    /* renamed from: a, reason: collision with other field name */
    private b f550a;
    private String b;

    public enum a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    public enum b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public hf(b bVar) {
        this.f550a = b.available;
        this.b = null;
        this.a = Integer.MIN_VALUE;
        this.f549a = null;
        a(bVar);
    }

    @Override // com.xiaomi.push.hd
    public Bundle a() {
        Bundle a2 = super.a();
        b bVar = this.f550a;
        if (bVar != null) {
            a2.putString("ext_pres_type", bVar.toString());
        }
        String str = this.b;
        if (str != null) {
            a2.putString("ext_pres_status", str);
        }
        int i = this.a;
        if (i != Integer.MIN_VALUE) {
            a2.putInt("ext_pres_prio", i);
        }
        a aVar = this.f549a;
        if (aVar != null && aVar != a.available) {
            a2.putString("ext_pres_mode", aVar.toString());
        }
        return a2;
    }

    public hf(Bundle bundle) {
        super(bundle);
        this.f550a = b.available;
        this.b = null;
        this.a = Integer.MIN_VALUE;
        this.f549a = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.f550a = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.b = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.a = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f549a = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    public void a(b bVar) {
        Objects.requireNonNull(bVar, "Type cannot be null");
        this.f550a = bVar;
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(int i) {
        if (i >= -128 && i <= 128) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException(e.a.a.a.a.k("Priority value ", i, " is not valid. Valid range is -128 through 128."));
    }

    public void a(a aVar) {
        this.f549a = aVar;
    }

    @Override // com.xiaomi.push.hd
    /* renamed from: a */
    public String mo469a() {
        StringBuilder M = e.a.a.a.a.M("<presence");
        if (p() != null) {
            M.append(" xmlns=\"");
            M.append(p());
            M.append("\"");
        }
        if (j() != null) {
            M.append(" id=\"");
            M.append(j());
            M.append("\"");
        }
        if (l() != null) {
            M.append(" to=\"");
            M.append(hm.a(l()));
            M.append("\"");
        }
        if (m() != null) {
            M.append(" from=\"");
            M.append(hm.a(m()));
            M.append("\"");
        }
        if (k() != null) {
            M.append(" chid=\"");
            M.append(hm.a(k()));
            M.append("\"");
        }
        if (this.f550a != null) {
            M.append(" type=\"");
            M.append(this.f550a);
            M.append("\"");
        }
        M.append(">");
        if (this.b != null) {
            M.append("<status>");
            M.append(hm.a(this.b));
            M.append("</status>");
        }
        if (this.a != Integer.MIN_VALUE) {
            M.append("<priority>");
            M.append(this.a);
            M.append("</priority>");
        }
        a aVar = this.f549a;
        if (aVar != null && aVar != a.available) {
            M.append("<show>");
            M.append(this.f549a);
            M.append("</show>");
        }
        M.append(o());
        hh m470a = m470a();
        if (m470a != null) {
            M.append(m470a.m473a());
        }
        M.append("</presence>");
        return M.toString();
    }
}
