package com.bytedance.crash.S;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.monitor.h;
import com.bytedance.crash.monitor.l;
import com.bytedance.crash.runtime.b;
import com.bytedance.crash.s;
import com.bytedance.crash.upload.CrashUploader;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;

/* loaded from: classes.dex */
public class a {
    private static boolean a;
    private static s b;

    /* renamed from: com.bytedance.crash.S.a$a, reason: collision with other inner class name */
    static class RunnableC0201a implements Runnable {
        private final long a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4506c;

        /* renamed from: d, reason: collision with root package name */
        private final String f4507d;

        /* renamed from: e, reason: collision with root package name */
        private final String f4508e;

        RunnableC0201a(String str, long j, String str2, String str3, String str4) {
            this.f4507d = str;
            this.a = j;
            this.b = str2;
            this.f4506c = str3;
            this.f4508e = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.crash.monitor.a e2 = l.e();
            if (e2 == null) {
                return;
            }
            boolean z = false;
            try {
                com.bytedance.crash.entity.a a = a.a(e2, this.f4507d, this.a, this.b, this.f4506c, this.f4508e);
                z = CrashUploader.q(CrashUploader.j(CrashType.GAME, a.a().e()), a.c());
            } catch (Throwable unused) {
            }
            if (z) {
                return;
            }
            com.bytedance.android.input.k.b.a.W("upload failed!");
        }
    }

    static com.bytedance.crash.entity.a a(@NonNull h hVar, String str, long j, String str2, String str3, String str4) {
        com.bytedance.crash.entity.a aVar = new com.bytedance.crash.entity.a();
        try {
            aVar.d(RemoteMessageConst.DATA, str4);
            aVar.d(CrashHianalyticsData.CRASH_TYPE, CrashType.GAME.getName());
            aVar.d("crash_time", Long.valueOf(j));
            aVar.d("crash_name", str2);
            aVar.d("crash_reason", str3);
            aVar.d("crash_thread_name", str);
            aVar.d("process_name", com.bytedance.crash.util.a.i());
            aVar.d("app_start_time", Long.valueOf(C0652g.b()));
            aVar.d("upload_scene", "direct");
        } catch (Throwable unused) {
        }
        aVar.e(Header.b(hVar, j, CrashType.GAME, Process.myPid()));
        return aVar;
    }

    public static void b(File file) {
        s sVar = b;
        if (sVar != null) {
            try {
                String a2 = sVar.a();
                if (a2 != null) {
                    com.bytedance.crash.util.a.x(new File(file, "game_script_stack.txt"), a2, false);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void c(String str, String str2, String str3) {
        if ((TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) || a) {
            return;
        }
        b.d(new RunnableC0201a(Thread.currentThread().getName(), System.currentTimeMillis(), str, str2, str3));
    }

    public static void d(s sVar) {
        b = sVar;
    }

    public static void e(boolean z) {
        a = z;
    }
}
