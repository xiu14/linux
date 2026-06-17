package com.obric.common.upgrade.n;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.obric.common.upgrade.VersionCheckResponse;
import com.obric.common.upgrade.h;
import com.obric.common.upgrade.j;
import com.obric.common.upgrade.p.a;
import com.obric.common.upgrade.util.c;
import com.prolificinteractive.materialcalendarview.r;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import kotlin.e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.s.c.g;
import kotlin.s.c.l;
import okhttp3.B;
import okhttp3.Request;
import okhttp3.x;
import okhttp3.y;

@SourceDebugExtension({"SMAP\nUpgradeFileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeFileManager.kt\ncom/obric/common/upgrade/download/UpgradeFileManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n13579#2,2:199\n1#3:201\n*S KotlinDebug\n*F\n+ 1 UpgradeFileManager.kt\ncom/obric/common/upgrade/download/UpgradeFileManager\n*L\n60#1:199,2\n*E\n"})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0356a f7593f = new C0356a(null);

    /* renamed from: g, reason: collision with root package name */
    private static volatile a f7594g;
    private final Context a;
    private VersionCheckResponse b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f7595c;

    /* renamed from: d, reason: collision with root package name */
    private final e f7596d = kotlin.a.c(new b(this));

    /* renamed from: e, reason: collision with root package name */
    private final Object f7597e = new Object();

    /* renamed from: com.obric.common.upgrade.n.a$a, reason: collision with other inner class name */
    public static final class C0356a {
        public C0356a(g gVar) {
        }
    }

    public a(Context context, VersionCheckResponse versionCheckResponse, g gVar) {
        this.a = context;
        this.b = versionCheckResponse;
    }

    private final void f(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileInputStream.getChannel().transferTo(0L, fileInputStream.getChannel().size(), fileOutputStream.getChannel());
                r.E(fileOutputStream, null);
                r.E(fileInputStream, null);
            } finally {
            }
        } finally {
        }
    }

    private final void g(File file) {
        if (!(file != null && file.exists()) || file.delete()) {
            return;
        }
        file.deleteOnExit();
    }

    private final File j() {
        return (File) this.f7596d.getValue();
    }

    private final String k(String str) {
        String O = kotlin.text.a.O(str, "/", null, 2, null);
        if (!kotlin.text.a.d(O, ".apk", false, 2, null)) {
            return O;
        }
        return kotlin.text.a.Q(O, ".apk", null, 2, null) + ".apk";
    }

    private final void l(B b, File file, j jVar, String str) throws Throwable {
        long j;
        InputStream a = b.a().a();
        if (a != null) {
            try {
                OutputStream fileOutputStream = new FileOutputStream(file);
                BufferedOutputStream bufferedOutputStream = fileOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) fileOutputStream : new BufferedOutputStream(fileOutputStream, 8192);
                try {
                    long d2 = b.a().d();
                    byte[] bArr = new byte[1024];
                    int i = 0;
                    long j2 = 0;
                    while (true) {
                        int read = a.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                        long j3 = j2 + read;
                        if (d2 >= 0) {
                            int i2 = 100;
                            if (d2 != j3) {
                                i2 = (int) (((j3 * 1.0f) / d2) * 100);
                            }
                            if (i2 == 0) {
                                i2 = 1;
                            }
                            int i3 = i2;
                            if (i != i3) {
                                j = j3;
                                jVar.c(i3, j3, d2, str);
                                i = i3;
                                j2 = j;
                            }
                        }
                        j = j3;
                        j2 = j;
                    }
                    bufferedOutputStream.flush();
                    if (d2 > 0 && d2 != j2) {
                        throw new Throwable("io error , totalLength != sum");
                    }
                    r.E(bufferedOutputStream, null);
                    r.E(a, null);
                } finally {
                }
            } finally {
            }
        }
        b.close();
    }

    public final boolean h(j jVar) {
        l.f(jVar, "callback");
        synchronized (this.f7597e) {
            File i = i();
            if (i != null) {
                this.b.q(i.getAbsolutePath());
                this.b.t(false);
                jVar.b(this.b);
                return true;
            }
            c.c("download apk begin");
            synchronized (this) {
                File[] listFiles = j().listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        g(file);
                    }
                }
            }
            String b = this.b.b();
            if (TextUtils.isEmpty(b)) {
                return false;
            }
            c.c("upgrade_downloadapk_start");
            a.C0357a c0357a = com.obric.common.upgrade.p.a.b;
            com.obric.common.upgrade.p.a a = c0357a.a();
            long g2 = this.b.g();
            if (h.f7570d == null) {
                throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
            }
            h hVar = h.f7570d;
            l.c(hVar);
            a.c(2, g2, hVar.i().j(), this.b.k(), (r19 & 16) != 0 ? "" : null);
            Request.a aVar = new Request.a();
            aVar.j(b);
            Request b2 = aVar.b();
            String k = k(b);
            File file2 = new File(j(), k);
            File file3 = new File(j(), k + "_temp");
            try {
                this.f7595c = true;
                x.b bVar = new x.b();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                bVar.d(60L, timeUnit);
                bVar.o(300L, timeUnit);
                bVar.s(300L, timeUnit);
                bVar.p(true);
                bVar.a(com.obric.common.upgrade.util.a.a);
                x c2 = bVar.c();
                l.e(c2, "Builder()\n            .c…  })\n            .build()");
                B c3 = ((y) c2.m(b2)).c();
                l.e(c3, "response");
                l(c3, file3, jVar, b);
                String b3 = com.obric.common.upgrade.util.b.b(file3);
                if (!kotlin.text.a.i(b3, this.b.f(), true)) {
                    throw new Throwable("md5 check  error , tmpFile md5 =" + b3 + ", info md5 =" + this.b.f());
                }
                if (!file3.renameTo(file2)) {
                    f(file3, file2);
                    g(file3);
                    c.c("renameTo fail . path =" + file2.getAbsolutePath());
                }
                this.b.q(file2.getAbsolutePath());
                this.b.t(true);
                com.obric.common.upgrade.p.a a2 = c0357a.a();
                long g3 = this.b.g();
                if (h.f7570d == null) {
                    throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
                }
                h hVar2 = h.f7570d;
                l.c(hVar2);
                a2.c(3, g3, hVar2.i().j(), this.b.k(), (r19 & 16) != 0 ? "" : null);
                jVar.b(this.b);
                c.c("download apk success . path =" + file2.getAbsolutePath());
                this.f7595c = false;
                return true;
            } catch (Throwable th) {
                g(file2);
                g(file3);
                Log.e("OAppUpgrade", "download apk error", th);
                com.obric.common.upgrade.p.a a3 = com.obric.common.upgrade.p.a.b.a();
                long g4 = this.b.g();
                if (h.f7570d == null) {
                    throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
                }
                h hVar3 = h.f7570d;
                l.c(hVar3);
                long j = hVar3.i().j();
                long k2 = this.b.k();
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                a3.c(4, g4, j, k2, message);
                jVar.a(-4, "网络下载过程中失败 " + th.getMessage());
                this.f7595c = false;
                return false;
            }
        }
    }

    public final synchronized File i() {
        Log.d("OAppUpgrade", "升级弹窗 upgradeInfo：" + this.b);
        String b = this.b.b();
        if (TextUtils.isEmpty(b)) {
            Log.e("OAppUpgrade", "invoke method getApk , but the apkUrl is null");
            return null;
        }
        String k = k(b);
        File file = new File(j(), k);
        Log.d("OAppUpgrade", "升级弹窗 ，apkName：" + k + " download_url: " + b + ",mCacheDir:" + j() + "，apkFile：" + file + "，apkFile.exists()：" + file.exists());
        return file.exists() ? file : null;
    }
}
