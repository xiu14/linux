package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public class e {
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7225c;

    /* renamed from: d, reason: collision with root package name */
    private int f7226d;

    /* renamed from: g, reason: collision with root package name */
    private String f7229g;
    private int h;
    private int i;
    private int j;
    private final StringBuilder a = new StringBuilder();

    /* renamed from: e, reason: collision with root package name */
    private long f7227e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f7228f = 0;

    e(int i, String str, int i2, String str2) {
        this.f7225c = "HMS";
        this.j = i;
        this.b = str;
        this.f7226d = i2;
        if (str2 != null) {
            this.f7225c = str2;
        }
        b();
    }

    public static String a(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? String.valueOf(i) : ExifInterface.LONGITUDE_EAST : ExifInterface.LONGITUDE_WEST : "I" : "D";
    }

    private e b() {
        this.f7227e = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.f7228f = currentThread.getId();
        this.h = Process.myPid();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        int length = stackTrace.length;
        int i = this.j;
        if (length > i) {
            StackTraceElement stackTraceElement = stackTrace[i];
            this.f7229g = stackTraceElement.getFileName();
            this.i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        a(sb);
        return sb.toString();
    }

    public <T> e a(T t) {
        this.a.append(t);
        return this;
    }

    public e a(Throwable th) {
        a((e) '\n').a((e) Log.getStackTraceString(th));
        return this;
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    private StringBuilder a(StringBuilder sb) {
        sb.append(' ');
        sb.append(this.a.toString());
        return sb;
    }

    private StringBuilder b(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.f7227e)));
        String a = a(this.f7226d);
        sb.append(' ');
        sb.append(a);
        sb.append('/');
        sb.append(this.f7225c);
        sb.append('/');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.h);
        sb.append(':');
        sb.append(this.f7228f);
        sb.append(' ');
        sb.append(this.f7229g);
        sb.append(':');
        sb.append(this.i);
        sb.append(']');
        return sb;
    }
}
