package com.bytedance.crash.crash;

import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.N.h;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static c f4572d;
    private final File a;
    private final f b;

    /* renamed from: c, reason: collision with root package name */
    private final File f4573c;

    class a implements Runnable {
        final /* synthetic */ com.bytedance.crash.monitor.a a;

        a(c cVar, com.bytedance.crash.monitor.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.crash.monitor.a aVar = this.a;
            com.bytedance.crash.resource.e.a.h(aVar);
            com.bytedance.crash.resource.f.a.r(aVar);
            com.bytedance.crash.resource.j.c.w(aVar);
            com.bytedance.crash.resource.d.a.l(aVar);
            com.bytedance.crash.resource.g.a.f(aVar);
        }
    }

    c(@NonNull Context context, @NonNull File file) {
        File n = com.bytedance.android.input.k.b.a.n(file, CrashHianalyticsData.EVENT_ID_CRASH);
        this.a = n;
        File file2 = new File(n, b());
        this.f4573c = file2;
        com.bytedance.crash.crash.a aVar = new com.bytedance.crash.crash.a(file2);
        new d(aVar);
        com.bytedance.crash.Q.a.c("JavaCrash_Init");
        this.b = new f(context, aVar);
        com.bytedance.crash.Q.a.c("NativeCrash_Init");
    }

    public static String b() {
        return C0652g.b() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Process.myPid();
    }

    @Nullable
    public static File c() {
        c cVar = f4572d;
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    public static void d(long j, int i) {
        C0652g.t(true);
        c cVar = f4572d;
        if (cVar != null) {
            cVar.b.a(j, i);
        }
    }

    public static synchronized void e(@NonNull Context context, @NonNull File file) {
        synchronized (c.class) {
            com.bytedance.android.input.k.b.a.W("CrashManager startMonitor");
            if (f4572d == null) {
                f4572d = new c(context, file);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(CrashSummary crashSummary, com.bytedance.crash.monitor.a aVar, File file) {
        com.bytedance.android.input.k.b.a.W("uploadAll create summary");
        JSONObject jSONObject = new JSONObject();
        com.bytedance.crash.O.b.h(aVar, crashSummary, file, jSONObject);
        CrashType crashType = crashSummary.mCrashType;
        if (crashType == CrashType.JAVA || crashType == CrashType.LAUNCH) {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "from_custom", Boolean.FALSE);
        }
        crashSummary.upload(aVar, jSONObject);
    }

    public static void g(@NonNull com.bytedance.crash.monitor.a aVar, long j) {
        try {
            if (f4572d != null) {
                com.bytedance.android.input.k.b.a.W("uploadAll");
                f4572d.h(aVar, j);
            }
        } catch (Exception e2) {
            com.bytedance.crash.Q.b.e("NPTH_ANR_ERROR_AppMonitor", e2);
        }
    }

    private void h(@NonNull com.bytedance.crash.monitor.a aVar, long j) {
        String str;
        int i;
        File[] listFiles = this.a.listFiles();
        if (listFiles != null) {
            StringBuilder M = e.a.a.a.a.M("uploadAll:crashDumpDir:");
            M.append(this.f4573c.getName());
            com.bytedance.android.input.k.b.a.W(M.toString());
            String str2 = "uploadAll ";
            int i2 = 0;
            if (j > 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int length = listFiles.length;
                while (i2 < length) {
                    File file = listFiles[i2];
                    if (file.getName().equals(this.f4573c.getName())) {
                        str = str2;
                        i = length;
                    } else {
                        StringBuilder M2 = e.a.a.a.a.M(str2);
                        M2.append(file.getAbsolutePath());
                        com.bytedance.android.input.k.b.a.W(M2.toString());
                        CrashSummary loadFromDirectory = CrashSummary.loadFromDirectory(file);
                        if (loadFromDirectory != null) {
                            i = length;
                            str = str2;
                            com.bytedance.crash.Z.d.g(loadFromDirectory.mCrashType, loadFromDirectory.getProcessName(), loadFromDirectory.getPid(), loadFromDirectory.getCrashTime());
                            if (loadFromDirectory.getCrashTime() - loadFromDirectory.getStartTime() > h.c()) {
                                arrayList.add(loadFromDirectory);
                                arrayList2.add(file);
                            } else {
                                f(loadFromDirectory, aVar, file);
                            }
                        } else {
                            str = str2;
                            i = length;
                            StringBuilder M3 = e.a.a.a.a.M("uploadAll delete dir");
                            M3.append(file.getAbsolutePath());
                            com.bytedance.android.input.k.b.a.W(M3.toString());
                            com.bytedance.android.input.k.b.a.s(file);
                            StringBuilder M4 = e.a.a.a.a.M("uploadCrash() summary is null:");
                            M4.append(file.getAbsolutePath());
                            com.bytedance.crash.Q.b.f("NPTH_CRASH_ERROR", new Exception(M4.toString()));
                        }
                    }
                    i2++;
                    length = i;
                    str2 = str;
                }
                if (!arrayList.isEmpty()) {
                    com.bytedance.crash.runtime.b.f(new b(this, arrayList, aVar, arrayList2), j);
                }
            } else {
                int length2 = listFiles.length;
                while (i2 < length2) {
                    File file2 = listFiles[i2];
                    if (!file2.getName().equals(this.f4573c.getName())) {
                        StringBuilder M5 = e.a.a.a.a.M("uploadAll ");
                        M5.append(file2.getAbsolutePath());
                        com.bytedance.android.input.k.b.a.W(M5.toString());
                        CrashSummary loadFromDirectory2 = CrashSummary.loadFromDirectory(file2);
                        if (loadFromDirectory2 != null) {
                            com.bytedance.crash.Z.d.g(loadFromDirectory2.mCrashType, loadFromDirectory2.getProcessName(), loadFromDirectory2.getPid(), loadFromDirectory2.getCrashTime());
                            com.bytedance.android.input.k.b.a.W("uploadAll create summary");
                            JSONObject jSONObject = new JSONObject();
                            com.bytedance.crash.O.b.h(aVar, loadFromDirectory2, file2, jSONObject);
                            loadFromDirectory2.upload(aVar, jSONObject);
                        } else {
                            StringBuilder M6 = e.a.a.a.a.M("uploadAll delete dir");
                            M6.append(file2.getAbsolutePath());
                            com.bytedance.android.input.k.b.a.W(M6.toString());
                            com.bytedance.android.input.k.b.a.s(file2);
                            StringBuilder M7 = e.a.a.a.a.M("uploadCrash() summary is null:");
                            M7.append(file2.getAbsolutePath());
                            com.bytedance.crash.Q.b.f("NPTH_CRASH_ERROR", new Exception(M7.toString()));
                        }
                    }
                    i2++;
                }
            }
        }
        com.bytedance.crash.runtime.b.f(new a(this, aVar), j);
    }
}
