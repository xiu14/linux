package com.xiaomi.push;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;

/* loaded from: classes2.dex */
public class hc extends hd {
    private boolean a;
    private String b;

    /* renamed from: b, reason: collision with other field name */
    private boolean f542b;

    /* renamed from: c, reason: collision with root package name */
    private String f9129c;

    /* renamed from: d, reason: collision with root package name */
    private String f9130d;

    /* renamed from: e, reason: collision with root package name */
    private String f9131e;

    /* renamed from: f, reason: collision with root package name */
    private String f9132f;

    /* renamed from: g, reason: collision with root package name */
    private String f9133g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    public hc() {
        this.b = null;
        this.f9129c = null;
        this.a = false;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.f542b = false;
    }

    public void a(boolean z) {
        this.a = z;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.i;
    }

    public String e() {
        return this.j;
    }

    @Override // com.xiaomi.push.hd
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hc hcVar = (hc) obj;
        if (!super.equals(hcVar)) {
            return false;
        }
        String str = this.f9132f;
        if (str == null ? hcVar.f9132f != null : !str.equals(hcVar.f9132f)) {
            return false;
        }
        String str2 = this.f9130d;
        if (str2 == null ? hcVar.f9130d != null : !str2.equals(hcVar.f9130d)) {
            return false;
        }
        String str3 = this.f9131e;
        if (str3 == null ? hcVar.f9131e != null : !str3.equals(hcVar.f9131e)) {
            return false;
        }
        String str4 = this.f9129c;
        if (str4 == null ? hcVar.f9129c == null : str4.equals(hcVar.f9129c)) {
            return this.b == hcVar.b;
        }
        return false;
    }

    public String f() {
        return this.k;
    }

    public String g() {
        return this.l;
    }

    public void h(String str) {
        this.f9132f = str;
    }

    @Override // com.xiaomi.push.hd
    public int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9132f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9129c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9130d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f9131e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public void i(String str) {
        this.f9129c = str;
    }

    public void j(String str) {
        this.f9130d = str;
    }

    public void a(String str) {
        this.h = str;
    }

    public void b(String str) {
        this.i = str;
    }

    public void c(String str) {
        this.j = str;
    }

    public void d(String str) {
        this.k = str;
    }

    public void e(String str) {
        this.l = str;
    }

    public void f(String str) {
        this.b = str;
    }

    public void g(String str) {
        this.f9131e = str;
    }

    public String h() {
        return this.f9130d;
    }

    public void a(String str, String str2) {
        this.f9132f = str;
        this.f9133g = str2;
    }

    public void b(boolean z) {
        this.f542b = z;
    }

    @Override // com.xiaomi.push.hd
    public Bundle a() {
        Bundle a = super.a();
        if (!TextUtils.isEmpty(this.b)) {
            a.putString("ext_msg_type", this.b);
        }
        String str = this.f9130d;
        if (str != null) {
            a.putString("ext_msg_lang", str);
        }
        String str2 = this.f9131e;
        if (str2 != null) {
            a.putString("ext_msg_sub", str2);
        }
        String str3 = this.f9132f;
        if (str3 != null) {
            a.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.f9133g)) {
            a.putString("ext_body_encode", this.f9133g);
        }
        String str4 = this.f9129c;
        if (str4 != null) {
            a.putString("ext_msg_thread", str4);
        }
        String str5 = this.h;
        if (str5 != null) {
            a.putString("ext_msg_appid", str5);
        }
        if (this.a) {
            a.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.i)) {
            a.putString("ext_msg_seq", this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            a.putString("ext_msg_mseq", this.j);
        }
        if (!TextUtils.isEmpty(this.k)) {
            a.putString("ext_msg_fseq", this.k);
        }
        if (this.f542b) {
            a.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.l)) {
            a.putString("ext_msg_status", this.l);
        }
        return a;
    }

    public hc(Bundle bundle) {
        super(bundle);
        this.b = null;
        this.f9129c = null;
        this.a = false;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.f542b = false;
        this.b = bundle.getString("ext_msg_type");
        this.f9130d = bundle.getString("ext_msg_lang");
        this.f9129c = bundle.getString("ext_msg_thread");
        this.f9131e = bundle.getString("ext_msg_sub");
        this.f9132f = bundle.getString("ext_msg_body");
        this.f9133g = bundle.getString("ext_body_encode");
        this.h = bundle.getString("ext_msg_appid");
        this.a = bundle.getBoolean("ext_msg_trans", false);
        this.f542b = bundle.getBoolean("ext_msg_encrypt", false);
        this.i = bundle.getString("ext_msg_seq");
        this.j = bundle.getString("ext_msg_mseq");
        this.k = bundle.getString("ext_msg_fseq");
        this.l = bundle.getString("ext_msg_status");
    }

    @Override // com.xiaomi.push.hd
    /* renamed from: a */
    public String mo469a() {
        hh m470a;
        StringBuilder M = e.a.a.a.a.M("<message");
        if (p() != null) {
            M.append(" xmlns=\"");
            M.append(p());
            M.append("\"");
        }
        if (this.f9130d != null) {
            M.append(" xml:lang=\"");
            M.append(h());
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
        if (!TextUtils.isEmpty(d())) {
            M.append(" seq=\"");
            M.append(d());
            M.append("\"");
        }
        if (!TextUtils.isEmpty(e())) {
            M.append(" mseq=\"");
            M.append(e());
            M.append("\"");
        }
        if (!TextUtils.isEmpty(f())) {
            M.append(" fseq=\"");
            M.append(f());
            M.append("\"");
        }
        if (!TextUtils.isEmpty(g())) {
            M.append(" status=\"");
            M.append(g());
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
        if (this.a) {
            M.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.h)) {
            M.append(" appid=\"");
            M.append(c());
            M.append("\"");
        }
        if (!TextUtils.isEmpty(this.b)) {
            M.append(" type=\"");
            M.append(this.b);
            M.append("\"");
        }
        if (this.f542b) {
            M.append(" s=\"1\"");
        }
        M.append(">");
        if (this.f9131e != null) {
            M.append("<subject>");
            M.append(hm.a(this.f9131e));
            M.append("</subject>");
        }
        if (this.f9132f != null) {
            M.append("<body");
            if (!TextUtils.isEmpty(this.f9133g)) {
                M.append(" encode=\"");
                M.append(this.f9133g);
                M.append("\"");
            }
            M.append(">");
            M.append(hm.a(this.f9132f));
            M.append("</body>");
        }
        if (this.f9129c != null) {
            M.append("<thread>");
            M.append(this.f9129c);
            M.append("</thread>");
        }
        if (WsConstants.KEY_CONNECTION_ERROR.equalsIgnoreCase(this.b) && (m470a = m470a()) != null) {
            M.append(m470a.m473a());
        }
        return e.a.a.a.a.J(M, o(), "</message>");
    }
}
