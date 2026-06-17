package com.bytedance.bdinstall.p0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.bdinstall.Q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends d {
    private final Context b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f4102c;

    /* renamed from: d, reason: collision with root package name */
    private final Q f4103d;

    public i(Context context, SharedPreferences sharedPreferences, Q q) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.b = context;
        this.f4102c = sharedPreferences;
        this.f4103d = q;
    }

    private SharedPreferences n(String str) {
        return ("device_id".equals(str) || "install_id".equals(str) || "bd_did".equals(str)) ? this.f4102c : com.bytedance.bdinstall.util.g.d(this.b, this.f4103d);
    }

    private void o(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor edit = n(str).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    @Override // com.bytedance.bdinstall.p0.d, com.bytedance.bdinstall.p0.h
    public void a(String str, String str2) {
        o(str, str2);
    }

    @Override // com.bytedance.bdinstall.p0.d, com.bytedance.bdinstall.p0.h
    public String b(String str) {
        return n(str).getString(str, null);
    }

    @Override // com.bytedance.bdinstall.p0.d
    protected void d(String str, String[] strArr) {
        if (strArr == null) {
            return;
        }
        o(str, TextUtils.join("\n", strArr));
    }

    @Override // com.bytedance.bdinstall.p0.d
    public void e(List<String> list) {
        if (list == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                SharedPreferences n = n(str);
                SharedPreferences.Editor editor = (SharedPreferences.Editor) hashMap.get(n);
                if (editor == null) {
                    editor = n(str).edit();
                    hashMap.put(n, editor);
                }
                if (n != null && n.contains(str)) {
                    editor.remove(str);
                }
            }
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) ((Map.Entry) it2.next()).getValue()).apply();
        }
        super.e(list);
    }

    @Override // com.bytedance.bdinstall.p0.d
    protected String[] f(String str) {
        String string = n(str).getString(str, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string.split("\n");
    }
}
