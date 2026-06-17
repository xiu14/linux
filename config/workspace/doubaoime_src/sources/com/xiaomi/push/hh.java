package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class hh {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private String f553a;

    /* renamed from: a, reason: collision with other field name */
    private List<ha> f554a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f9147c;

    /* renamed from: d, reason: collision with root package name */
    private String f9148d;

    public static class a {
        public static final a a = new a("internal-server-error");
        public static final a b = new a("forbidden");

        /* renamed from: c, reason: collision with root package name */
        public static final a f9149c = new a("bad-request");

        /* renamed from: d, reason: collision with root package name */
        public static final a f9150d = new a("conflict");

        /* renamed from: e, reason: collision with root package name */
        public static final a f9151e = new a("feature-not-implemented");

        /* renamed from: f, reason: collision with root package name */
        public static final a f9152f = new a("gone");

        /* renamed from: g, reason: collision with root package name */
        public static final a f9153g = new a("item-not-found");
        public static final a h = new a("jid-malformed");
        public static final a i = new a("not-acceptable");
        public static final a j = new a("not-allowed");
        public static final a k = new a("not-authorized");
        public static final a l = new a("payment-required");
        public static final a m = new a("recipient-unavailable");
        public static final a n = new a("redirect");
        public static final a o = new a("registration-required");
        public static final a p = new a("remote-server-error");
        public static final a q = new a("remote-server-not-found");
        public static final a r = new a("remote-server-timeout");
        public static final a s = new a("resource-constraint");
        public static final a t = new a("service-unavailable");
        public static final a u = new a("subscription-required");
        public static final a v = new a("undefined-condition");
        public static final a w = new a("unexpected-request");
        public static final a x = new a("request-timeout");

        /* renamed from: a, reason: collision with other field name */
        private String f555a;

        public a(String str) {
            this.f555a = str;
        }

        public String toString() {
            return this.f555a;
        }
    }

    public hh(a aVar) {
        this.f554a = null;
        a(aVar);
        this.f9148d = null;
    }

    private void a(a aVar) {
        this.b = aVar.f555a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.b;
        if (str != null) {
            sb.append(str);
        }
        sb.append("(");
        sb.append(this.a);
        sb.append(")");
        if (this.f9148d != null) {
            sb.append(" ");
            sb.append(this.f9148d);
        }
        return sb.toString();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.f553a;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.a);
        String str2 = this.f9147c;
        if (str2 != null) {
            bundle.putString("ext_err_reason", str2);
        }
        String str3 = this.b;
        if (str3 != null) {
            bundle.putString("ext_err_cond", str3);
        }
        String str4 = this.f9148d;
        if (str4 != null) {
            bundle.putString("ext_err_msg", str4);
        }
        List<ha> list = this.f554a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            Iterator<ha> it2 = this.f554a.iterator();
            while (it2.hasNext()) {
                Bundle a2 = it2.next().a();
                if (a2 != null) {
                    bundleArr[i] = a2;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public hh(int i, String str, String str2, String str3, String str4, List<ha> list) {
        this.f554a = null;
        this.a = i;
        this.f553a = str;
        this.f9147c = str2;
        this.b = str3;
        this.f9148d = str4;
        this.f554a = list;
    }

    public hh(Bundle bundle) {
        this.f554a = null;
        this.a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f553a = bundle.getString("ext_err_type");
        }
        this.b = bundle.getString("ext_err_cond");
        this.f9147c = bundle.getString("ext_err_reason");
        this.f9148d = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f554a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                ha a2 = ha.a((Bundle) parcelable);
                if (a2 != null) {
                    this.f554a.add(a2);
                }
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m473a() {
        StringBuilder M = e.a.a.a.a.M("<error code=\"");
        M.append(this.a);
        M.append("\"");
        if (this.f553a != null) {
            M.append(" type=\"");
            M.append(this.f553a);
            M.append("\"");
        }
        if (this.f9147c != null) {
            M.append(" reason=\"");
            M.append(this.f9147c);
            M.append("\"");
        }
        M.append(">");
        if (this.b != null) {
            M.append("<");
            M.append(this.b);
            M.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.f9148d != null) {
            M.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            M.append(this.f9148d);
            M.append("</text>");
        }
        Iterator<ha> it2 = m474a().iterator();
        while (it2.hasNext()) {
            M.append(it2.next().d());
        }
        M.append("</error>");
        return M.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized List<ha> m474a() {
        List<ha> list = this.f554a;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }
}
