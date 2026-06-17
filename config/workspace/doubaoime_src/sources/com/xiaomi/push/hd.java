package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class hd {

    /* renamed from: a, reason: collision with other field name */
    public static final DateFormat f543a;
    private static long b;

    /* renamed from: c, reason: collision with root package name */
    private static String f9134c;

    /* renamed from: a, reason: collision with other field name */
    public long f545a;

    /* renamed from: a, reason: collision with other field name */
    private hh f546a;

    /* renamed from: a, reason: collision with other field name */
    private List<ha> f547a;

    /* renamed from: a, reason: collision with other field name */
    private final Map<String, Object> f548a;

    /* renamed from: d, reason: collision with root package name */
    private String f9135d;

    /* renamed from: e, reason: collision with root package name */
    private String f9136e;

    /* renamed from: f, reason: collision with root package name */
    private String f9137f;

    /* renamed from: g, reason: collision with root package name */
    private String f9138g;
    private String h;
    private String i;
    protected static final String a = Locale.getDefault().getLanguage().toLowerCase();

    /* renamed from: b, reason: collision with other field name */
    private static String f544b = null;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f543a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f9134c = hm.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        b = 0L;
    }

    public hd() {
        this.f9135d = f544b;
        this.f9136e = null;
        this.f9137f = null;
        this.f9138g = null;
        this.h = null;
        this.i = null;
        this.f547a = new CopyOnWriteArrayList();
        this.f548a = new HashMap();
        this.f546a = null;
    }

    public static synchronized String i() {
        String sb;
        synchronized (hd.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f9134c);
            long j = b;
            b = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    public static String q() {
        return a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public hh m470a() {
        return this.f546a;
    }

    /* renamed from: a */
    public abstract String mo469a();

    public synchronized Collection<String> b() {
        if (this.f548a == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.f548a.keySet()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hd hdVar = (hd) obj;
        hh hhVar = this.f546a;
        if (hhVar == null ? hdVar.f546a != null : !hhVar.equals(hdVar.f546a)) {
            return false;
        }
        String str = this.f9138g;
        if (str == null ? hdVar.f9138g != null : !str.equals(hdVar.f9138g)) {
            return false;
        }
        if (!this.f547a.equals(hdVar.f547a)) {
            return false;
        }
        String str2 = this.f9136e;
        if (str2 == null ? hdVar.f9136e != null : !str2.equals(hdVar.f9136e)) {
            return false;
        }
        String str3 = this.h;
        if (str3 == null ? hdVar.h != null : !str3.equals(hdVar.h)) {
            return false;
        }
        Map<String, Object> map = this.f548a;
        if (map == null ? hdVar.f548a != null : !map.equals(hdVar.f548a)) {
            return false;
        }
        String str4 = this.f9137f;
        if (str4 == null ? hdVar.f9137f != null : !str4.equals(hdVar.f9137f)) {
            return false;
        }
        String str5 = this.f9135d;
        String str6 = hdVar.f9135d;
        if (str5 != null) {
            if (str5.equals(str6)) {
                return true;
            }
        } else if (str6 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9135d;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9136e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9137f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9138g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.h;
        int hashCode5 = (this.f548a.hashCode() + ((this.f547a.hashCode() + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31)) * 31;
        hh hhVar = this.f546a;
        return hashCode5 + (hhVar != null ? hhVar.hashCode() : 0);
    }

    public String j() {
        if ("ID_NOT_AVAILABLE".equals(this.f9136e)) {
            return null;
        }
        if (this.f9136e == null) {
            this.f9136e = i();
        }
        return this.f9136e;
    }

    public void k(String str) {
        this.f9136e = str;
    }

    public void l(String str) {
        this.h = str;
    }

    public void m(String str) {
        this.f9137f = str;
    }

    public void n(String str) {
        this.f9138g = str;
    }

    public void o(String str) {
        this.i = str;
    }

    public String p() {
        return this.f9135d;
    }

    public void a(hh hhVar) {
        this.f546a = hhVar;
    }

    public String k() {
        return this.h;
    }

    public String l() {
        return this.f9137f;
    }

    public String m() {
        return this.f9138g;
    }

    public String n() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected synchronized java.lang.String o() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hd.o():java.lang.String");
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized Collection<ha> m472a() {
        if (this.f547a == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.f547a));
    }

    public ha a(String str) {
        return a(str, null);
    }

    public ha a(String str, String str2) {
        for (ha haVar : this.f547a) {
            if (str2 == null || str2.equals(haVar.b())) {
                if (str.equals(haVar.m466a())) {
                    return haVar;
                }
            }
        }
        return null;
    }

    public void a(ha haVar) {
        this.f547a.add(haVar);
    }

    public hd(Bundle bundle) {
        this.f9135d = f544b;
        this.f9136e = null;
        this.f9137f = null;
        this.f9138g = null;
        this.h = null;
        this.i = null;
        this.f547a = new CopyOnWriteArrayList();
        this.f548a = new HashMap();
        this.f546a = null;
        this.f9137f = bundle.getString("ext_to");
        this.f9138g = bundle.getString("ext_from");
        this.h = bundle.getString("ext_chid");
        this.f9136e = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f547a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                ha a2 = ha.a((Bundle) parcelable);
                if (a2 != null) {
                    this.f547a.add(a2);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f546a = new hh(bundle2);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized Object m471a(String str) {
        Map<String, Object> map = this.f548a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f9135d)) {
            bundle.putString("ext_ns", this.f9135d);
        }
        if (!TextUtils.isEmpty(this.f9138g)) {
            bundle.putString("ext_from", this.f9138g);
        }
        if (!TextUtils.isEmpty(this.f9137f)) {
            bundle.putString("ext_to", this.f9137f);
        }
        if (!TextUtils.isEmpty(this.f9136e)) {
            bundle.putString("ext_pkt_id", this.f9136e);
        }
        if (!TextUtils.isEmpty(this.h)) {
            bundle.putString("ext_chid", this.h);
        }
        hh hhVar = this.f546a;
        if (hhVar != null) {
            bundle.putBundle("ext_ERROR", hhVar.a());
        }
        List<ha> list = this.f547a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            Iterator<ha> it2 = this.f547a.iterator();
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
}
