package com.huawei.hianalytics.log.g;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.hianalytics.log.b.a;
import java.io.File;

/* loaded from: classes2.dex */
public final class a {
    private static Context a;
    private static int b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile HandlerC0349a f7138c;

    /* renamed from: d, reason: collision with root package name */
    private static String f7139d;

    /* renamed from: e, reason: collision with root package name */
    private static a f7140e;

    /* renamed from: com.huawei.hianalytics.log.g.a$a, reason: collision with other inner class name */
    private static class HandlerC0349a extends Handler {
        HandlerC0349a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (6 == message.what && com.huawei.hianalytics.log.e.f.a(a.a)) {
                if (com.huawei.hianalytics.log.e.f.a(a.f7139d + a.C0347a.f7126c)) {
                    com.huawei.hianalytics.i.b.d().a(new g(a.a, com.huawei.hianalytics.log.e.e.a(a.a, true, false), a.f7139d));
                }
            }
        }
    }

    public static a a() {
        a aVar;
        synchronized (a.class) {
            if (f7140e == null) {
                f7140e = new a();
            }
            aVar = f7140e;
        }
        return aVar;
    }

    public static void a(int i, String str, String str2, String str3) {
        if (a == null) {
            com.huawei.hianalytics.g.b.d("AppLogApiImpl", "No init of logServer");
            return;
        }
        if (d(str2, str3)) {
            com.huawei.hianalytics.g.b.d("AppLogApiImpl", "tag or msg Parameter error!");
            return;
        }
        if (i >= b) {
            com.huawei.hianalytics.i.b.c().a(new f(new com.huawei.hianalytics.log.c.a(str, str2, str3), null, f7139d));
        } else {
            com.huawei.hianalytics.g.b.c("AppLogApiImpl", "levelInt < Specified level for write log");
        }
    }

    public static void a(String str, String str2) {
        String a2 = com.huawei.hianalytics.util.g.a("logClintID", str, "[a-zA-Z0-9_]{1,256}", "");
        if (!com.huawei.hianalytics.util.g.a("logClintKey", str2, 4096)) {
            str2 = "";
        }
        com.huawei.hianalytics.a.d.a(a2);
        com.huawei.hianalytics.a.d.b(str2);
    }

    @TargetApi(18)
    public static void a(String str, String str2, String str3, Bundle bundle) {
        if (a == null) {
            com.huawei.hianalytics.g.b.c("AppLogApiImpl", "No init of SDK logServer");
            return;
        }
        if (!com.huawei.hianalytics.util.g.a("errorCode", str3, 256)) {
            com.huawei.hianalytics.g.b.c("AppLogApiImpl", "This method is stopped from execution due to a parameter error");
            return;
        }
        if (bundle == null) {
            com.huawei.hianalytics.g.b.c("AppLogApiImpl", "bundle is null");
            bundle = new Bundle();
        }
        if (d(str, str2)) {
            com.huawei.hianalytics.g.b.c("AppLogApiImpl", "This method is stopped from execution due to a parameter error");
            return;
        }
        bundle.putString("MetaData", com.huawei.hianalytics.util.g.a("metaData", bundle.getString("MetaData"), 20480) ? bundle.getString("MetaData") : "");
        a(6, ExifInterface.LONGITUDE_EAST, str, str2);
        bundle.putString("Eventid", str3);
        d dVar = new d(bundle, "eventinfo.log", f7139d + a.C0347a.b);
        com.huawei.hianalytics.i.b c2 = com.huawei.hianalytics.i.b.c();
        c2.a(dVar);
        String a2 = com.huawei.hianalytics.log.e.e.a(a, false, "CrashHandler".equals(str));
        if (f7138c != null) {
            c2.a(new b(a2, f7138c, f7139d));
        }
    }

    public static void b() {
        a = null;
    }

    public static void c() {
        if (com.huawei.hianalytics.log.e.f.b(a) && com.huawei.hianalytics.log.e.f.a(a)) {
            String str = f7139d + a.C0347a.f7126c;
            File file = new File(f7139d + a.C0347a.b);
            if (!file.exists()) {
                com.huawei.hianalytics.g.b.c("AppLogApiImpl", "checkUploadLog() No logs file");
                return;
            }
            File[] listFiles = file.listFiles();
            boolean z = true;
            if (listFiles == null || listFiles.length <= 0 || listFiles.length > 5) {
                com.huawei.hianalytics.log.e.a.a(file);
                File[] listFiles2 = new File(str).listFiles();
                if (listFiles2 == null || listFiles2.length == 0) {
                    com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "No error log.");
                    return;
                }
                com.huawei.hianalytics.log.e.a.a(new File(f7139d + a.C0347a.f7127d));
                com.huawei.hianalytics.i.b.d().a(new g(a, com.huawei.hianalytics.log.e.e.a(a, true, false), f7139d));
                return;
            }
            int length = listFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if ("eventinfo.log".equals(listFiles[i].getName())) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "No error log.");
            } else {
                com.huawei.hianalytics.i.b.c().a(new b(com.huawei.hianalytics.log.e.e.a(a, false, false), f7138c, f7139d));
            }
        }
    }

    @TargetApi(18)
    private static void c(Context context) {
        a = context;
        f7139d = context.getFilesDir().getPath();
        if (TextUtils.isEmpty(com.huawei.hianalytics.a.b.e())) {
            com.huawei.hianalytics.a.b.c(context.getPackageName());
        }
        if (f7138c == null) {
            HandlerThread handlerThread = new HandlerThread(a.class.getCanonicalName(), 10);
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            if (looper == null) {
                com.huawei.hianalytics.g.b.d("AppLogApiImpl", "handler thread looper is null,send data over!");
                handlerThread.quitSafely();
                return;
            }
            f7138c = new HandlerC0349a(looper);
        }
        b = com.huawei.hianalytics.a.d.e();
    }

    private static boolean d(String str, String str2) {
        return !(!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.length() <= 256 && str2.length() <= 20480);
    }

    public final synchronized void a(Context context) {
        c(context);
    }
}
