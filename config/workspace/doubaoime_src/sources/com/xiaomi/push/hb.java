package com.xiaomi.push;

import android.os.Bundle;
import com.bytedance.common.wschannel.WsConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class hb extends hd {
    private a a;

    /* renamed from: a, reason: collision with other field name */
    private final Map<String, String> f540a;

    public static class a {
        public static final a a = new a(MonitorConstants.CONNECT_TYPE_GET);
        public static final a b = new a("set");

        /* renamed from: c, reason: collision with root package name */
        public static final a f9126c = new a("result");

        /* renamed from: d, reason: collision with root package name */
        public static final a f9127d = new a(WsConstants.KEY_CONNECTION_ERROR);

        /* renamed from: e, reason: collision with root package name */
        public static final a f9128e = new a(com.heytap.mcssdk.constant.b.y);

        /* renamed from: a, reason: collision with other field name */
        private String f541a;

        private a(String str) {
            this.f541a = str;
        }

        public static a a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            a aVar = a;
            if (aVar.toString().equals(lowerCase)) {
                return aVar;
            }
            a aVar2 = b;
            if (aVar2.toString().equals(lowerCase)) {
                return aVar2;
            }
            a aVar3 = f9127d;
            if (aVar3.toString().equals(lowerCase)) {
                return aVar3;
            }
            a aVar4 = f9126c;
            if (aVar4.toString().equals(lowerCase)) {
                return aVar4;
            }
            a aVar5 = f9128e;
            if (aVar5.toString().equals(lowerCase)) {
                return aVar5;
            }
            return null;
        }

        public String toString() {
            return this.f541a;
        }
    }

    public hb() {
        this.a = a.a;
        this.f540a = new HashMap();
    }

    public synchronized void a(Map<String, String> map) {
        this.f540a.putAll(map);
    }

    public String b() {
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public a m468a() {
        return this.a;
    }

    public hb(Bundle bundle) {
        super(bundle);
        this.a = a.a;
        this.f540a = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.a = a.a(bundle.getString("ext_iq_type"));
        }
    }

    public void a(a aVar) {
        if (aVar == null) {
            this.a = a.a;
        } else {
            this.a = aVar;
        }
    }

    @Override // com.xiaomi.push.hd
    public Bundle a() {
        Bundle a2 = super.a();
        a aVar = this.a;
        if (aVar != null) {
            a2.putString("ext_iq_type", aVar.toString());
        }
        return a2;
    }

    @Override // com.xiaomi.push.hd
    /* renamed from: a, reason: collision with other method in class */
    public String mo469a() {
        StringBuilder M = e.a.a.a.a.M("<iq ");
        if (j() != null) {
            StringBuilder M2 = e.a.a.a.a.M("id=\"");
            M2.append(j());
            M2.append("\" ");
            M.append(M2.toString());
        }
        if (l() != null) {
            M.append("to=\"");
            M.append(hm.a(l()));
            M.append("\" ");
        }
        if (m() != null) {
            M.append("from=\"");
            M.append(hm.a(m()));
            M.append("\" ");
        }
        if (k() != null) {
            M.append("chid=\"");
            M.append(hm.a(k()));
            M.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.f540a.entrySet()) {
            M.append(hm.a(entry.getKey()));
            M.append("=\"");
            M.append(hm.a(entry.getValue()));
            M.append("\" ");
        }
        if (this.a == null) {
            M.append("type=\"get\">");
        } else {
            M.append("type=\"");
            M.append(m468a());
            M.append("\">");
        }
        String b = b();
        if (b != null) {
            M.append(b);
        }
        M.append(o());
        hh m470a = m470a();
        if (m470a != null) {
            M.append(m470a.m473a());
        }
        M.append("</iq>");
        return M.toString();
    }
}
