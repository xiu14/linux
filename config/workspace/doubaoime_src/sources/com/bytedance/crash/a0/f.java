package com.bytedance.crash.a0;

import android.text.TextUtils;
import com.bytedance.crash.C0652g;
import java.io.File;
import java.util.Date;

/* loaded from: classes.dex */
public class f {
    private static volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static File f4560c;

    /* renamed from: d, reason: collision with root package name */
    private static File f4561d;

    /* renamed from: e, reason: collision with root package name */
    private static File f4562e;

    /* renamed from: f, reason: collision with root package name */
    private static File f4563f;

    /* renamed from: g, reason: collision with root package name */
    private static f f4564g = new f();
    private boolean a;

    private f() {
    }

    private File b() {
        File file = f4563f;
        if (file != null) {
            return file;
        }
        if (!b) {
            File file2 = new File(C0652g.k(), "processTrack");
            f4560c = file2;
            com.bytedance.android.input.k.b.a.m(file2);
            File file3 = new File(f4560c, String.valueOf(C0652g.b() / com.heytap.mcssdk.constant.a.f6888f));
            f4561d = file3;
            com.bytedance.android.input.k.b.a.m(file3);
            File file4 = new File(f4561d, com.bytedance.crash.util.a.i());
            f4562e = file4;
            com.bytedance.android.input.k.b.a.m(file4);
            b = true;
        }
        if (f4562e == null) {
            return f4563f;
        }
        File file5 = new File(f4562e, String.valueOf(C0652g.b()));
        f4563f = file5;
        return file5;
    }

    public static f c() {
        return f4564g;
    }

    public void a(String str, String str2, long j) {
        try {
            File b2 = b();
            if (b2 != null) {
                com.bytedance.crash.util.a.x(b2, str + ' ' + str2 + ' ' + com.bytedance.crash.util.a.g().format(new Date(j)) + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }

    public File d(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String valueOf = String.valueOf(j / com.heytap.mcssdk.constant.a.f6888f);
        String valueOf2 = String.valueOf(j);
        File k = C0652g.k();
        StringBuilder M = e.a.a.a.a.M("processTrack");
        String str2 = File.separator;
        e.a.a.a.a.M0(M, str2, valueOf, str2, str);
        return new File(k, e.a.a.a.a.J(M, str2, valueOf2));
    }

    public boolean e() {
        return this.a;
    }

    public void f(boolean z) {
        if (z) {
            this.a = true;
        }
    }
}
