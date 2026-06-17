package com.bytedance.crash.N;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class g {
    private static final g m = new g();
    private String a = com.bytedance.crash.runtime.a.a();
    private String b = e.a.a.a.a.J(new StringBuilder(), this.a, "/monitor/collect/c/core_dump_collect");

    /* renamed from: c, reason: collision with root package name */
    private String f4454c = e.a.a.a.a.J(new StringBuilder(), this.a, "/monitor/collect/c/crash");

    /* renamed from: d, reason: collision with root package name */
    private String f4455d = e.a.a.a.a.J(new StringBuilder(), this.a, "/monitor/collect/c/exception/dump_collection");

    /* renamed from: e, reason: collision with root package name */
    private String f4456e = e.a.a.a.a.J(new StringBuilder(), this.a, "/monitor/collect/c/exception");

    /* renamed from: g, reason: collision with root package name */
    private String f4458g = e.a.a.a.a.J(new StringBuilder(), this.a, "/monitor/collect/c/exception/dump_collection");
    private String h = e.a.a.a.a.J(new StringBuilder(), this.a, "/monitor/collect/batch/");
    private String i = e.a.a.a.a.J(new StringBuilder(), this.a, "/monitor/collect/c/native_bin_crash");
    private String j = e.a.a.a.a.J(new StringBuilder(), this.a, "/monitor/collect/c/logcollect");
    private String k = e.a.a.a.a.J(new StringBuilder(), this.a, "/monitor/appmonitor/v3/settings");
    private String l = e.a.a.a.a.J(new StringBuilder(), this.a, "/monitor/collect/quota_status");

    /* renamed from: f, reason: collision with root package name */
    private String f4457f = e.a.a.a.a.J(new StringBuilder(), this.a, "/monitor/collect/c/biz_exception");

    private g() {
    }

    public static g a() {
        return m;
    }

    @NonNull
    public static String b() {
        return m.j;
    }

    @NonNull
    public static String c() {
        return m.k;
    }

    @NonNull
    public static String d() {
        return m.i;
    }

    @NonNull
    public static String e() {
        return m.f4457f;
    }

    @NonNull
    public static String f() {
        return m.b;
    }

    @NonNull
    public static String g() {
        return m.h;
    }

    @NonNull
    public static String h() {
        return m.f4456e;
    }

    @NonNull
    public static String i() {
        return m.f4458g;
    }

    @NonNull
    public static String j() {
        return m.f4454c;
    }

    @NonNull
    public static String k() {
        return m.f4455d;
    }

    @NonNull
    public static String l() {
        return m.i;
    }

    public static String m() {
        return m.l;
    }

    public void n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.j = str;
    }

    public void o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.k = str;
    }

    public void p(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f4454c = str;
    }

    public void q(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f4456e = str;
        int indexOf = str.indexOf("//");
        if (indexOf == -1) {
            this.f4455d = str.substring(0, str.indexOf("/") + 1) + "monitor/collect/c/exception/dump_collection";
            this.f4458g = str.substring(0, str.indexOf("/") + 1) + "monitor/collect/c/custom_exception/zip";
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = indexOf + 2;
        sb.append(str.substring(0, str.indexOf("/", i) + 1));
        sb.append("monitor/collect/c/exception/dump_collection");
        this.f4455d = sb.toString();
        this.f4458g = str.substring(0, str.indexOf("/", i) + 1) + "monitor/collect/c/custom_exception/zip";
    }

    public void r(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i = str;
    }
}
