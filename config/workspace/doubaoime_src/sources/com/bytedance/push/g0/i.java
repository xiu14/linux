package com.bytedance.push.g0;

import android.os.SystemProperties;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: f, reason: collision with root package name */
    private static volatile i f5708f;
    private double a = -1.0d;
    private volatile Object b;

    /* renamed from: c, reason: collision with root package name */
    String f5709c;

    /* renamed from: d, reason: collision with root package name */
    String f5710d;

    /* renamed from: e, reason: collision with root package name */
    String f5711e;

    private i() {
    }

    public static i b() {
        if (f5708f == null) {
            synchronized (i.class) {
                if (f5708f == null) {
                    f5708f = new i();
                }
            }
        }
        return f5708f;
    }

    private Object c() {
        if (this.b == null) {
            synchronized (i.class) {
                if (this.b == null) {
                    try {
                        this.b = Class.forName("android.os.SystemProperties").newInstance();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        return this.b;
    }

    public String a(String str) throws IllegalArgumentException {
        try {
            return SystemProperties.get(str);
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                Object c2 = c();
                return (String) c2.getClass().getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(c2, str);
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    public boolean d() {
        if (TextUtils.isEmpty(this.f5710d)) {
            this.f5710d = a("ro.build.version.opporom");
        }
        return !TextUtils.isEmpty(this.f5710d);
    }

    public boolean e() {
        if (TextUtils.isEmpty(this.f5711e)) {
            this.f5711e = a("ro.build.version.emui");
        }
        if (!(!TextUtils.isEmpty(this.f5711e))) {
            return false;
        }
        try {
            if (this.a == -1.0d) {
                if (TextUtils.isEmpty(this.f5711e)) {
                    return false;
                }
                String str = this.f5711e;
                String substring = str.substring(str.indexOf(BundleUtil.UNDERLINE_TAG) + 1);
                if (substring.indexOf(".") > 0) {
                    substring = substring.substring(0, substring.indexOf("."));
                }
                this.a = Double.parseDouble(substring);
            }
            return this.a >= 10.0d;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean f() {
        if (TextUtils.isEmpty(this.f5709c)) {
            this.f5709c = SystemProperties.get("ro.miui.ui.version.name", "");
        }
        return !TextUtils.isEmpty(this.f5709c);
    }
}
