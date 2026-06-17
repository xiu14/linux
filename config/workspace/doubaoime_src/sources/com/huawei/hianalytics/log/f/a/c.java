package com.huawei.hianalytics.log.f.a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7136c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f7137d = new HashMap();

    public c() {
    }

    public c(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.f7136c = str3;
    }

    public String a() {
        return this.a;
    }

    public void a(String str, String str2) {
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f7137d.put(str, str2);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f7136c;
    }

    public final Map<String, String> d() {
        return this.f7137d;
    }
}
