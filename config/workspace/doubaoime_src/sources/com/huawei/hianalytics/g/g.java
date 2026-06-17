package com.huawei.hianalytics.g;

import android.os.Process;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public class g {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f7116c;

    /* renamed from: d, reason: collision with root package name */
    private long f7117d;

    /* renamed from: e, reason: collision with root package name */
    private long f7118e;

    /* renamed from: f, reason: collision with root package name */
    private String f7119f;

    /* renamed from: g, reason: collision with root package name */
    private int f7120g;
    private int h;
    private int i;
    private final StringBuilder j = new StringBuilder();

    g(int i, String str, int i2, String str2) {
        this.a = null;
        this.b = "HA";
        this.f7116c = 0;
        this.f7117d = 0L;
        this.f7118e = 0L;
        this.i = 0;
        this.i = i;
        this.a = str;
        this.f7116c = i2;
        if (str2 != null) {
            this.b = str2;
        }
        this.f7117d = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.f7118e = currentThread.getId();
        this.f7120g = Process.myPid();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        int length = stackTrace.length;
        int i3 = this.i;
        if (length > i3) {
            StackTraceElement stackTraceElement = stackTrace[i3];
            this.f7119f = stackTraceElement.getFileName();
            this.h = stackTraceElement.getLineNumber();
        }
    }

    private StringBuilder b(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.f7117d)));
        String a = e.a(this.f7116c);
        sb.append(' ');
        sb.append(a);
        sb.append('/');
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.f7120g);
        sb.append(':');
        sb.append(this.f7118e);
        sb.append(' ');
        sb.append(this.f7119f);
        sb.append(':');
        sb.append(this.h);
        sb.append(']');
        return sb;
    }

    public <T> g a(T t) {
        this.j.append(t);
        return this;
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        return sb.toString();
    }

    public String b() {
        return ' ' + this.j.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(4096);
        b(sb);
        sb.append(' ');
        sb.append(this.j.toString());
        return sb.toString();
    }
}
