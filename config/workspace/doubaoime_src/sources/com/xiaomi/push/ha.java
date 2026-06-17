package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class ha implements he {
    private String a;

    /* renamed from: a, reason: collision with other field name */
    private List<ha> f537a;

    /* renamed from: a, reason: collision with other field name */
    private String[] f538a;
    private String b;

    /* renamed from: b, reason: collision with other field name */
    private String[] f539b;

    /* renamed from: c, reason: collision with root package name */
    private String f9125c;

    public ha(String str, String str2, String[] strArr, String[] strArr2) {
        this.f538a = null;
        this.f539b = null;
        this.f537a = null;
        this.a = str;
        this.b = str2;
        this.f538a = strArr;
        this.f539b = strArr2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m466a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return !TextUtils.isEmpty(this.f9125c) ? hm.b(this.f9125c) : this.f9125c;
    }

    @Override // com.xiaomi.push.he
    public String d() {
        StringBuilder M = e.a.a.a.a.M("<");
        M.append(this.a);
        if (!TextUtils.isEmpty(this.b)) {
            e.a.a.a.a.K0(M, " ", "xmlns=", "\"");
            M.append(this.b);
            M.append("\"");
        }
        String[] strArr = this.f538a;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < this.f538a.length; i++) {
                if (!TextUtils.isEmpty(this.f539b[i])) {
                    M.append(" ");
                    M.append(this.f538a[i]);
                    M.append("=\"");
                    M.append(hm.a(this.f539b[i]));
                    M.append("\"");
                }
            }
        }
        if (TextUtils.isEmpty(this.f9125c)) {
            List<ha> list = this.f537a;
            if (list == null || list.size() <= 0) {
                M.append("/>");
            } else {
                M.append(">");
                Iterator<ha> it2 = this.f537a.iterator();
                while (it2.hasNext()) {
                    M.append(it2.next().d());
                }
                M.append("</");
                M.append(this.a);
                M.append(">");
            }
        } else {
            M.append(">");
            M.append(this.f9125c);
            M.append("</");
            M.append(this.a);
            M.append(">");
        }
        return M.toString();
    }

    public String toString() {
        return d();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.a);
        bundle.putString("ext_ns", this.b);
        bundle.putString("ext_text", this.f9125c);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f538a;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f538a;
                if (i >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i], this.f539b[i]);
                i++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<ha> list = this.f537a;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", a(this.f537a));
        }
        return bundle;
    }

    public ha(String str, String str2, String[] strArr, String[] strArr2, String str3, List<ha> list) {
        this.f538a = null;
        this.f539b = null;
        this.f537a = null;
        this.a = str;
        this.b = str2;
        this.f538a = strArr;
        this.f539b = strArr2;
        this.f9125c = str3;
        this.f537a = list;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Parcelable m465a() {
        return a();
    }

    public static Parcelable[] a(ha[] haVarArr) {
        if (haVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[haVarArr.length];
        for (int i = 0; i < haVarArr.length; i++) {
            parcelableArr[i] = haVarArr[i].m465a();
        }
        return parcelableArr;
    }

    public static Parcelable[] a(List<ha> list) {
        return a((ha[]) list.toArray(new ha[list.size()]));
    }

    public static ha a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> keySet = bundle2.keySet();
        String[] strArr = new String[keySet.size()];
        String[] strArr2 = new String[keySet.size()];
        int i = 0;
        for (String str : keySet) {
            strArr[i] = str;
            strArr2[i] = bundle2.getString(str);
            i++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            ArrayList arrayList2 = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList2.add(a((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new ha(string, string2, strArr, strArr2, string3, arrayList);
    }

    public String a(String str) {
        if (str != null) {
            if (this.f538a == null) {
                return null;
            }
            int i = 0;
            while (true) {
                String[] strArr = this.f538a;
                if (i >= strArr.length) {
                    return null;
                }
                if (str.equals(strArr[i])) {
                    return this.f539b[i];
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void a(ha haVar) {
        if (this.f537a == null) {
            this.f537a = new ArrayList();
        }
        if (this.f537a.contains(haVar)) {
            return;
        }
        this.f537a.add(haVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m467a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f9125c = hm.a(str);
        } else {
            this.f9125c = str;
        }
    }
}
