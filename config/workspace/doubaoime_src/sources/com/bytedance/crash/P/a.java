package com.bytedance.crash.P;

import android.os.Process;
import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.monitor.h;
import com.bytedance.crash.monitor.l;
import com.bytedance.crash.runtime.b;
import com.bytedance.crash.u;
import com.bytedance.crash.upload.CrashUploader;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static boolean a;

    /* renamed from: com.bytedance.crash.P.a$a, reason: collision with other inner class name */
    static class RunnableC0197a implements Runnable {
        private final long a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<? extends String, ? extends String> f4468c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<String, String> f4469d;

        /* renamed from: e, reason: collision with root package name */
        private final u f4470e;

        /* renamed from: f, reason: collision with root package name */
        private final String f4471f;

        RunnableC0197a(String str, long j, String str2, Map<? extends String, ? extends String> map, Map<String, String> map2, u uVar) {
            this.a = j;
            this.b = str2;
            this.f4468c = map;
            this.f4469d = map2;
            this.f4470e = uVar;
            this.f4471f = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.crash.monitor.a e2 = l.e();
            if (e2 == null) {
                return;
            }
            boolean z = false;
            try {
                com.bytedance.crash.entity.a a = a.a(e2, this.f4471f, this.a, this.b, this.f4468c, this.f4469d);
                z = CrashUploader.q(CrashUploader.j(CrashType.DART, a.a().e()), a.c());
            } catch (Throwable unused) {
            }
            u uVar = this.f4470e;
            if (uVar != null) {
                try {
                    uVar.a(z);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    static com.bytedance.crash.entity.a a(@NonNull h hVar, String str, long j, String str2, Map<? extends String, ? extends String> map, Map<String, String> map2) {
        com.bytedance.crash.entity.a aVar = new com.bytedance.crash.entity.a();
        try {
            if (hVar.c() != null) {
                com.bytedance.android.input.k.b.a.j(aVar.c(), hVar.c().c(CrashType.DART));
            }
            aVar.d("is_dart", 1);
            aVar.d(RemoteMessageConst.DATA, str2);
            aVar.d("crash_time", Long.valueOf(j));
            aVar.d("crash_thread_name", str);
            aVar.d("process_name", com.bytedance.crash.util.a.i());
            aVar.d("app_start_time", Long.valueOf(C0652g.b()));
            aVar.d("upload_scene", "direct");
            com.bytedance.crash.dumper.a.t(aVar.c(), null);
            Scraps.pushTo(aVar.c());
            if (map != null) {
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.input.k.b.a.z0(jSONObject, map);
                if (map2 != null) {
                    com.bytedance.android.input.k.b.a.z0(jSONObject, map2);
                }
                aVar.d(MonitorConstants.CUSTOM, jSONObject);
            }
        } catch (Throwable unused) {
        }
        aVar.e(Header.b(hVar, j, CrashType.DART, Process.myPid()));
        return aVar;
    }

    public static void b(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, u uVar) {
        if (a) {
            return;
        }
        b.d(new RunnableC0197a(Thread.currentThread().getName(), System.currentTimeMillis(), str, map, map2, uVar));
    }

    public static void c(boolean z) {
        a = z;
    }
}
