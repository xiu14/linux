package com.bytedance.crash.Z;

import android.app.ApplicationExitInfo;
import android.os.Build;
import android.os.Process;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.n;
import com.bytedance.crash.o;
import com.bytedance.crash.upload.CrashUploader;
import com.bytedance.services.apm.api.IApmAgent;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {
    private static String a = null;
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4543c = false;

    /* renamed from: d, reason: collision with root package name */
    private static File f4544d;

    /* renamed from: e, reason: collision with root package name */
    private static File f4545e;

    /* renamed from: f, reason: collision with root package name */
    public static File f4546f;

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentLinkedQueue<n> f4547g = new ConcurrentLinkedQueue<>();
    private static ConcurrentLinkedQueue<o> h = new ConcurrentLinkedQueue<>();
    private static boolean i = false;
    private static boolean j = false;

    static class a implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ com.bytedance.crash.monitor.a b;

        a(List list, com.bytedance.crash.monitor.a aVar) {
            this.a = list;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                for (ApplicationExitInfo applicationExitInfo : this.a) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        int importance = applicationExitInfo.getImportance();
                        if (!g.f4543c) {
                            if (!(importance >= 0 && importance < 300)) {
                            }
                        }
                    }
                    g.a(this.b, applicationExitInfo, true, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new File(g.f4546f, "custom_data").listFiles(new h());
            } catch (Throwable unused) {
            }
            g.e();
        }
    }

    static class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.split(BundleUtil.UNDERLINE_TAG).length == 2;
        }
    }

    static class d implements Comparator<File> {
        d() {
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            long lastModified = file.lastModified() - file2.lastModified();
            if (lastModified > 0) {
                return 1;
            }
            return lastModified == 0 ? 0 : -1;
        }
    }

    static void a(com.bytedance.crash.monitor.a aVar, ApplicationExitInfo applicationExitInfo, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        com.bytedance.crash.Z.a b2 = com.bytedance.crash.Z.a.b(applicationExitInfo);
        boolean z3 = true;
        long[] jArr = {0};
        try {
            new File(f4545e, b2.g().replace(".", BundleUtil.UNDERLINE_TAG).replace(Constants.COLON_SEPARATOR, Constants.ACCEPT_TIME_SEPARATOR_SERVER)).listFiles(new i(b2, jArr));
        } catch (Throwable unused) {
        }
        if (jArr[0] == 0) {
            return;
        }
        String e2 = b2.e(jArr[0]);
        hashMap.put("exit_reason", b2.j());
        hashMap.put("exit_sub_reason", b2.l());
        hashMap.put("exit_description", b2.c());
        hashMap.put("exit_status", String.valueOf(b2.k()));
        hashMap.put("exit_pss", com.bytedance.crash.Z.c.c(b2.h()));
        hashMap.put("exit_rss", com.bytedance.crash.Z.c.c(b2.i()));
        hashMap.put("importance", String.valueOf(b2.d()));
        hashMap.put("has_exit_info", "true");
        if (!((String) hashMap.get("exit_reason")).equals("not obtained") && !((String) hashMap.get("exit_reason")).equals("USER REQUESTED")) {
            z3 = false;
        }
        if (z3) {
            try {
                IApmAgent iApmAgent = (IApmAgent) com.bytedance.news.common.service.manager.c.a(IApmAgent.class);
                JSONObject jSONObject = new JSONObject();
                if (iApmAgent != null) {
                    jSONObject.put("reason", hashMap.get("exit_reason"));
                    iApmAgent.monitorEvent("app_exit", jSONObject, null, null);
                    return;
                }
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        JSONObject n = b2.n(jArr[0], e2);
        try {
            File file = new File(f4546f, "custom_data");
            file.mkdirs();
            File file2 = new File(file, b2.m() + BundleUtil.UNDERLINE_TAG + b2.f());
            if (!file2.exists()) {
                file2.mkdirs();
            }
            f(file2, hashMap, b2, jArr[0]);
            if (z2) {
                g(file2, hashMap);
            }
            h(file2, hashMap);
            if (z) {
                try {
                    com.bytedance.crash.K.a.d(applicationExitInfo.getProcessName(), 0L, applicationExitInfo.getTimestamp(), CrashType.NATIVE_CUSTOMIZE);
                    hashMap.put("has_alog", "true");
                } catch (Throwable th) {
                    com.bytedance.android.input.k.b.a.O0("KillInfo:" + th);
                }
            }
            b2.a(n, hashMap);
            boolean j2 = j(aVar, b2.m(), n, file2);
            if (j2) {
                com.bytedance.android.input.k.b.a.X("KillInfo ", "upload success:" + j2);
                com.bytedance.android.input.k.b.a.s(file2);
            }
            com.bytedance.android.input.k.b.a.s(file2);
        } catch (Throwable th2) {
            com.bytedance.android.input.k.b.a.O0("KillInfo:" + th2);
        }
    }

    static void c(List<ApplicationExitInfo> list) {
        try {
            Iterator<o> it2 = h.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().a(list);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    static void d(ApplicationExitInfo applicationExitInfo) {
        try {
            Iterator<n> it2 = f4547g.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().a(applicationExitInfo);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    static void e() {
        if (f4544d.exists() && !j) {
            j = true;
            File[] listFiles = f4544d.listFiles(new c());
            if (listFiles == null || listFiles.length <= 20) {
                return;
            }
            Arrays.sort(listFiles, new d());
            for (int i2 = 0; i2 < listFiles.length - 20; i2++) {
                com.bytedance.crash.util.a.b(listFiles[i2]);
            }
        }
    }

    private static void f(File file, Map<String, String> map, com.bytedance.crash.Z.a aVar, long j2) {
        Throwable th;
        String str;
        int indexOf;
        try {
            File d2 = com.bytedance.crash.a0.f.c().d(aVar.g(), j2);
            if (d2 == null || !d2.exists()) {
                map.put("has_process_track", "false");
                return;
            }
            File file2 = new File(file, "process_track.txt");
            BufferedReader bufferedReader = null;
            String str2 = null;
            try {
                com.bytedance.crash.util.a.a(d2, file2, Integer.MAX_VALUE, true);
                map.put("has_process_track", "true");
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        } else if (readLine.contains("onResume")) {
                            str2 = readLine;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader == null) {
                            throw th;
                        }
                        try {
                            bufferedReader.close();
                            throw th;
                        } catch (Throwable unused) {
                            throw th;
                        }
                    }
                }
                if (str2 != null) {
                    String[] split = str2.split(" ", 3);
                    if (split.length > 1 && (indexOf = (str = split[1]).indexOf(".onResume")) > 0) {
                        map.put("scene", str.substring(0, indexOf));
                    }
                }
                try {
                    bufferedReader2.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            com.bytedance.crash.Q.b.c("dumpActivityInfo", th4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r3.length() < 50) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean g(java.io.File r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            java.lang.String r0 = "logcat.txt"
            r1 = 1
            java.lang.String r2 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> La
            com.bytedance.crash.jni.NativeBridge.l(r2, r1, r1)     // Catch: java.lang.Throwable -> La
        La:
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L28
            r3.<init>(r7, r0)     // Catch: java.lang.Throwable -> L28
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L26
            boolean r4 = r3.isDirectory()     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L26
            long r3 = r3.length()     // Catch: java.lang.Throwable -> L28
            r5 = 50
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L28
        L26:
            r3 = r2
            goto L29
        L28:
            r3 = r1
        L29:
            if (r3 == 0) goto L63
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L4e
            r3.<init>(r7, r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = com.bytedance.crash.util.a.p(r3)     // Catch: java.lang.Throwable -> L4e
            com.bytedance.crash.Z.g.a = r7     // Catch: java.lang.Throwable -> L4e
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L4e
            if (r7 != 0) goto L63
            java.lang.String r7 = com.bytedance.crash.Z.g.a     // Catch: java.lang.Throwable -> L4e
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L4e
            r0 = 10
            if (r7 <= r0) goto L63
            java.lang.String r7 = "has_logcat"
            java.lang.String r0 = "true"
            r8.put(r7, r0)     // Catch: java.lang.Throwable -> L4e
            return r1
        L4e:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "KillInfo:"
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.bytedance.android.input.k.b.a.O0(r7)
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.Z.g.g(java.io.File, java.util.Map):boolean");
    }

    private static boolean h(File file, Map<String, String> map) {
        String p;
        try {
            NativeBridge.m(file.getAbsolutePath(), true);
            File file2 = new File(file, "os_memory.txt");
            if (!file2.exists() || file2.length() <= 10 || (p = com.bytedance.crash.util.a.p(file2)) == null || !p.contains("kB")) {
                map.put("has_os_memory", "false");
                return false;
            }
            map.put("has_os_memory", "true");
            return true;
        } catch (IOException e2) {
            com.bytedance.android.input.k.b.a.O0("KillInfo:" + e2);
            return false;
        }
    }

    public static void i() {
        File k;
        if (b || (k = C0652g.k()) == null) {
            return;
        }
        b = true;
        com.bytedance.android.input.k.b.a.X("KillInfo", "init");
        File n = com.bytedance.android.input.k.b.a.n(k, "killHistory");
        f4546f = n;
        com.bytedance.android.input.k.b.a.n(n, "kill_info");
        f4545e = com.bytedance.android.input.k.b.a.n(f4546f, "proc");
        C0652g.g();
        f4544d = com.bytedance.android.input.k.b.a.n(f4545e, com.bytedance.crash.util.a.f().replace(".", BundleUtil.UNDERLINE_TAG).replace(Constants.COLON_SEPARATOR, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
        try {
            new File(f4544d, Process.myPid() + BundleUtil.UNDERLINE_TAG + C0652g.b()).createNewFile();
        } catch (IOException e2) {
            com.bytedance.android.input.k.b.a.F(e2);
        } catch (Throwable unused) {
        }
    }

    private static boolean j(com.bytedance.crash.monitor.a aVar, long j2, JSONObject jSONObject, File file) {
        try {
            JSONObject e2 = Header.b(aVar, j2, CrashType.NATIVE_CUSTOMIZE, Process.myPid()).e();
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put(RemoteMessageConst.DATA, jSONArray);
            jSONObject2.put("header", e2);
            if (a != null) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(a);
                jSONObject2.put("logcat", jSONArray2);
            }
            return CrashUploader.r(CrashUploader.d(com.bytedance.crash.N.g.i(), e2), jSONObject2.toString(), file);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void k(boolean z, boolean z2) {
        f4543c = z;
    }

    public static void l(com.bytedance.crash.monitor.a aVar) {
        b bVar;
        b bVar2;
        if (aVar == null || !b) {
            return;
        }
        try {
        } catch (Throwable th) {
            try {
                com.bytedance.android.input.k.b.a.D("TerminateMonitor", "upload exception:" + th);
                bVar = new b();
            } catch (Throwable th2) {
                com.bytedance.crash.runtime.b.d(new b());
                throw th2;
            }
        }
        if (!com.bytedance.crash.util.a.k()) {
            bVar2 = new b();
        } else if (i) {
            bVar2 = new b();
        } else {
            i = true;
            List<ApplicationExitInfo> b2 = e.b();
            if (b2 != null && b2.size() != 0) {
                com.bytedance.crash.runtime.b.d(new a(b2, aVar));
                bVar = new b();
                com.bytedance.crash.runtime.b.d(bVar);
                return;
            }
            bVar2 = new b();
        }
        com.bytedance.crash.runtime.b.d(bVar2);
    }
}
