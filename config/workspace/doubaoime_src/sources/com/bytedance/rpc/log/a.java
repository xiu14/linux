package com.bytedance.rpc.log;

import android.app.Application;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import e.b.l.o;
import e.b.l.q.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static a f6047f;

    /* renamed from: g, reason: collision with root package name */
    private static final b f6048g = new C0313a();
    private TreeSet<String> a = null;
    private String[] b;

    /* renamed from: c, reason: collision with root package name */
    private int f6049c;

    /* renamed from: d, reason: collision with root package name */
    private int f6050d;

    /* renamed from: e, reason: collision with root package name */
    private int f6051e;

    /* renamed from: com.bytedance.rpc.log.a$a, reason: collision with other inner class name */
    static class C0313a implements b {
        C0313a() {
        }
    }

    public interface b {
    }

    public a(int i, int i2, int i3, String... strArr) {
        this.b = null;
        this.f6049c = -1;
        this.f6050d = -1;
        this.f6051e = -1;
        this.f6051e = i;
        this.f6049c = i2;
        this.f6050d = i3;
        if (strArr.length > 1) {
            this.b = strArr;
        }
    }

    public static a a() {
        if (f6047f == null) {
            synchronized (a.class) {
                if (f6047f == null) {
                    f6047f = new a(6, 18, 3, new String[0]);
                }
            }
        }
        return f6047f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0159, code lost:
    
        if (r4.get(0) != r2[0]) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b(java.lang.Throwable r19) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.rpc.log.a.b(java.lang.Throwable):java.lang.String");
    }

    protected TreeSet<String> c() {
        String substring;
        int lastIndexOf;
        boolean z;
        if (this.a == null) {
            Application f2 = o.g().f();
            HashSet hashSet = new HashSet();
            if (f2 != null) {
                try {
                    String packageName = f2.getApplicationContext().getPackageName();
                    if (c.c(packageName)) {
                        hashSet.add(packageName);
                        ActivityInfo[] activityInfoArr = f2.getApplicationContext().getPackageManager().getPackageInfo(packageName, 15).activities;
                        if (activityInfoArr != null && activityInfoArr.length > 0) {
                            for (ActivityInfo activityInfo : activityInfoArr) {
                                if (activityInfo != null && c.c(activityInfo.packageName)) {
                                    hashSet.add(activityInfo.packageName);
                                    String str = activityInfo.name;
                                    int lastIndexOf2 = str == null ? -1 : str.lastIndexOf(46);
                                    if (lastIndexOf2 > 0 && (lastIndexOf = (substring = str.substring(0, lastIndexOf2)).lastIndexOf(46)) > 0) {
                                        hashSet.add(substring.substring(0, lastIndexOf));
                                    }
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.printStackTrace();
                }
            }
            String[] strArr = this.b;
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    if (c.c(str2)) {
                        hashSet.add(str2);
                    }
                }
            }
            this.a = new TreeSet<>();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (!this.a.isEmpty()) {
                    Iterator<String> it3 = this.a.iterator();
                    while (it3.hasNext()) {
                        String next = it3.next();
                        if (str3.startsWith(next)) {
                            z = false;
                            break;
                        }
                        if (next.startsWith(str3)) {
                            it3.remove();
                        }
                    }
                }
                z = true;
                if (z) {
                    this.a.add(str3);
                }
            }
        }
        return this.a;
    }
}
