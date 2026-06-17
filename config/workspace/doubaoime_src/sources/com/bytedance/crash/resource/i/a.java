package com.bytedance.crash.resource.i;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class a {
    private final File a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4677c;

    public a(@NonNull String str, String str2, long j) {
        this.a = new File(str, str2);
        this.b = str2;
        this.f4677c = j <= 0 ? 604800L : j;
    }

    public boolean a() {
        if (!this.a.exists()) {
            return true;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long parseLong = Long.parseLong(com.bytedance.crash.util.a.r(this.a.getAbsolutePath()));
            if (currentTimeMillis < parseLong) {
                com.bytedance.android.input.k.b.a.X("GuardFile: ", this.b + ": time error currentTime is earlier than lastTime");
                return false;
            }
            if (currentTimeMillis - parseLong >= this.f4677c) {
                String absolutePath = this.a.getAbsolutePath();
                if (!TextUtils.isEmpty(absolutePath)) {
                    com.bytedance.crash.util.a.b(new File(absolutePath));
                }
                com.bytedance.android.input.k.b.a.X("GuardFile: ", this.b + ": deleteFile guard file");
                return true;
            }
            com.bytedance.android.input.k.b.a.X("GuardFile: ", this.b + ": CheckTime Less than " + this.f4677c + " seconds, lastTime:" + parseLong + " currentTime:" + currentTimeMillis);
            return false;
        } catch (IOException unused) {
            com.bytedance.android.input.k.b.a.X("GuardFile: ", this.b + ": read guard file faild!");
            return false;
        }
    }

    public void b() {
        try {
            com.bytedance.crash.util.a.x(this.a, String.valueOf(System.currentTimeMillis() / 1000), false);
            com.bytedance.android.input.k.b.a.X("GuardFile: ", this.b + ": createGuardFile success");
        } catch (Throwable unused) {
            com.bytedance.android.input.k.b.a.X("GuardFile: ", this.b + ": createGuardFile fail");
        }
    }

    public void c() {
        if (this.a.exists()) {
            if (this.a.delete()) {
                com.bytedance.android.input.k.b.a.X("GuardFile: ", "delete guard file success");
            } else {
                com.bytedance.android.input.k.b.a.X("GuardFile: ", "delete guard file faild!");
            }
        }
    }
}
