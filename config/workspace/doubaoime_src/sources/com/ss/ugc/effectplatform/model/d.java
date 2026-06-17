package com.ss.ugc.effectplatform.model;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.ugc.effectplatform.util.i;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f8500f = new a(null);
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f8501c;

    /* renamed from: d, reason: collision with root package name */
    private int f8502d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final String f8503e;

    public static final class a {
        public a(g gVar) {
        }
    }

    public d(String str, g gVar) {
        this.f8503e = str;
    }

    public final String a() {
        return this.f8503e;
    }

    public final String b() {
        String g2;
        String str = this.f8501c;
        if ((str == null || kotlin.text.a.s(str)) && (g2 = bytekn.foundation.io.file.c.b.g(this.f8503e)) != null) {
            i iVar = i.f8543c;
            this.f8501c = i.b(g2);
        }
        return this.f8501c;
    }

    public final String c() {
        String g2;
        String str = this.a;
        if ((str == null || kotlin.text.a.s(str)) && (g2 = bytekn.foundation.io.file.c.b.g(this.f8503e)) != null) {
            i iVar = i.f8543c;
            this.a = i.d(g2);
        }
        return this.a;
    }

    public final int d() {
        String g2;
        if (this.f8502d == -1) {
            bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
            int i = 0;
            if (cVar.d(this.f8503e) && (g2 = cVar.g(this.f8503e)) != null) {
                i iVar = i.f8543c;
                i = i.e(g2);
            }
            this.f8502d = i;
        }
        return this.f8502d;
    }

    public final String e() {
        String g2;
        String str;
        String str2 = this.b;
        if ((str2 == null || kotlin.text.a.s(str2)) && (g2 = bytekn.foundation.io.file.c.b.g(this.f8503e)) != null) {
            kotlin.text.a.w(g2, "/", 0, false, 6, null);
            int w = kotlin.text.a.w(g2, "_v", 0, false, 6, null);
            int w2 = kotlin.text.a.d(g2, MonitorConstants.SIZE, false, 2, null) ? kotlin.text.a.w(g2, "_size", 0, false, 6, null) : kotlin.text.a.w(g2, "_model", 0, false, 6, null);
            if (w > 0) {
                String substring = g2.substring(w + 2, w2);
                l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                str = kotlin.text.a.D(substring, '_', '.', false, 4, null);
            } else {
                str = "1.0";
            }
            this.b = str;
        }
        return this.b;
    }

    public final void f(String str) {
        l.g(str, "md5");
        this.f8501c = str;
    }

    public final void g(String str) {
        l.g(str, "name");
        this.a = str;
    }

    public final void h(int i) {
        this.f8502d = i;
    }

    public final void i(String str) {
        l.g(str, "version");
        this.b = str;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("LocalModelInfo{name=");
        M.append(c());
        M.append('\'');
        M.append(",version=");
        M.append(e());
        M.append('\'');
        M.append(",size=");
        M.append(d());
        M.append('\'');
        M.append('}');
        return M.toString();
    }
}
