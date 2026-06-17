package com.bytedance.applog.w;

import android.annotation.SuppressLint;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class g {
    private static final ThreadLocal<SimpleDateFormat> i = new a();
    public static final /* synthetic */ int j = 0;
    private String a;
    private String b;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f3904e;

    /* renamed from: f, reason: collision with root package name */
    private String f3905f;
    private Throwable h;

    /* renamed from: c, reason: collision with root package name */
    private int f3902c = 1;

    /* renamed from: d, reason: collision with root package name */
    private int f3903d = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f3906g = System.currentTimeMillis();

    static class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        @SuppressLint({"SimpleDateFormat"})
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    }

    private String m(Object obj) {
        return obj != null ? obj.toString() : "";
    }

    public int a() {
        return this.f3902c;
    }

    public String b() {
        int i2 = this.f3902c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "" : "ASSERT" : "ERROR" : "WARN" : "INFO" : "DEBUG" : "VERBOSE";
    }

    public Throwable c() {
        return this.h;
    }

    public void d(String str) {
        this.a = str;
    }

    public void e(int i2) {
        this.f3903d = i2;
    }

    public void f(int i2) {
        this.f3902c = i2;
    }

    public void g(String str) {
        this.f3905f = str;
    }

    public void h(List<String> list) {
        this.f3904e = list;
    }

    public void i(String str) {
        this.b = str;
    }

    public void j(Throwable th) {
        this.h = th;
    }

    public void k(long j2) {
        this.f3906g = j2;
    }

    public String l() {
        StringBuilder M = e.a.a.a.a.M("[");
        M.append(b());
        M.append("][");
        M.append(m(this.a));
        M.append("] ");
        M.append(m(this.f3905f));
        return M.toString();
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder M = e.a.a.a.a.M("[");
        M.append(this.f3906g > 0 ? i.get().format(new Date(this.f3906g)) : "--");
        M.append("][");
        M.append(b());
        M.append("][");
        M.append(m(this.a));
        M.append("][");
        M.append(m(this.b));
        M.append("][");
        switch (this.f3903d) {
            case 1:
                str = "DEVICE_REGISTER";
                break;
            case 2:
                str = "ABTEST";
                break;
            case 3:
                str = "ALINK";
                break;
            case 4:
                str = "EVENT";
                break;
            case 5:
                str = "DATABASE";
                break;
            case 6:
                str = "EVENT_VERIFY";
                break;
            case 7:
                str = "VIEW_EXPOSURE";
                break;
            case 8:
                str = "MONITOR";
                break;
            case 9:
                str = "USER_PROFILE";
                break;
            case 10:
                str = "PICKER";
                break;
            case 11:
                str = "REQUEST";
                break;
            case 12:
                str = "EVENT_SAMPLING";
                break;
            case 13:
                str = "EVENT_PRIORITY";
                break;
            case 14:
                str = "COMPRESS";
                break;
            case 15:
                str = "ONE_ID";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        M.append(str);
        M.append("][");
        List<String> list = this.f3904e;
        if (list == null || list.size() <= 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < this.f3904e.size(); i2++) {
                sb.append(this.f3904e.get(i2));
                if (i2 < this.f3904e.size() - 1) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            str2 = sb.toString();
        }
        M.append(str2);
        M.append("] ");
        M.append(m(this.f3905f));
        String sb2 = M.toString();
        if (this.h == null) {
            return sb2;
        }
        StringBuilder S = e.a.a.a.a.S(sb2, "\nstacktrace: ");
        StringBuilder sb3 = new StringBuilder();
        for (Throwable th = this.h; th != null; th = th.getCause()) {
            sb3.append(th.toString());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb3.append("\n\tat ");
                sb3.append(stackTraceElement);
            }
        }
        S.append(sb3.toString());
        return S.toString();
    }
}
