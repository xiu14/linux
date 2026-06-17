package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class b extends o {
    private Context a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private d f6704c;

    public b(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        if (applicationContext == null) {
            StringBuilder M = e.a.a.a.a.M("context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: ");
            M.append(context.getApplicationInfo().nativeLibraryDir);
            Log.w("SoLoader", M.toString());
            this.a = context;
        }
        this.b = i;
        this.f6704c = new d(new File(this.a.getApplicationInfo().nativeLibraryDir), i);
    }

    public static File d(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.o
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.f6704c.a(str, i, threadPolicy);
    }

    @Override // com.facebook.soloader.o
    protected void b(int i) throws IOException {
        this.f6704c.b(i);
    }

    public boolean c() throws IOException {
        File file = this.f6704c.a;
        Context e2 = e();
        File d2 = d(e2);
        if (file.equals(d2)) {
            return false;
        }
        Log.d("SoLoader", "Native library directory updated from " + file + " to " + d2);
        int i = this.b | 1;
        this.b = i;
        this.f6704c = new d(d2, i);
        this.a = e2;
        return true;
    }

    public Context e() {
        try {
            Context context = this.a;
            return context.createPackageContext(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.facebook.soloader.o
    public String toString() {
        return this.f6704c.toString();
    }
}
