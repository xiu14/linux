package com.bytedance.crash.upload;

import android.os.FileObserver;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.L.q;
import com.bytedance.crash.crash.NativeCrashSummary;
import com.bytedance.crash.general.RomInfo;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.upload.CrashUploader;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: g, reason: collision with root package name */
    private static h f4696g = null;
    private static boolean h = false;
    private final ConcurrentHashMap<String, g> a;
    private final File b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4697c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f4698d;

    /* renamed from: e, reason: collision with root package name */
    private FileObserver f4699e;

    /* renamed from: f, reason: collision with root package name */
    private File f4700f;

    class a extends FileObserver {

        /* renamed from: com.bytedance.crash.upload.h$a$a, reason: collision with other inner class name */
        class RunnableC0219a implements Runnable {
            RunnableC0219a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.c(h.this);
            }
        }

        a(String str, int i) {
            super(str, i);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, @Nullable String str) {
            com.bytedance.android.input.k.b.a.W("disaster: FileObserver event=" + i);
            if ((i & 8) == 0 && (i & 1024) == 0) {
                return;
            }
            if (!h.this.f4698d) {
                com.bytedance.crash.runtime.b.f(new RunnableC0219a(), 100L);
            } else {
                com.bytedance.android.input.k.b.a.W("disaster: current process updating file");
                h.this.f4698d = false;
            }
        }
    }

    static class b implements FilenameFilter {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(this.a);
        }
    }

    private h() {
        com.bytedance.android.input.k.b.a.W("Disaster:init");
        File file = new File(C0652g.k(), "network_disaster");
        com.bytedance.android.input.k.b.a.m(file);
        File file2 = new File(file, "networkStatef");
        this.b = file2;
        this.a = new ConcurrentHashMap<>();
        this.f4697c = false;
        this.f4698d = false;
        try {
            this.f4699e = new a(file2.getAbsolutePath(), DownloadErrorCode.ERROR_CHUNK_COUNT_ERROR);
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.F(th);
        }
        this.f4700f = new File(file, "disasterLock");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7 A[Catch: all -> 0x0145, TryCatch #0 {all -> 0x0145, blocks: (B:6:0x0011, B:8:0x001b, B:11:0x0023, B:15:0x0038, B:18:0x0081, B:20:0x008e, B:22:0x00ae, B:25:0x00b5, B:28:0x00bd, B:31:0x00c6, B:34:0x00ee, B:36:0x00f7, B:43:0x0117, B:45:0x011f, B:47:0x012d, B:51:0x00ce, B:55:0x00d7, B:58:0x00e1), top: B:5:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A(java.lang.String r18, java.lang.String r19, com.bytedance.crash.upload.j r20) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.h.A(java.lang.String, java.lang.String, com.bytedance.crash.upload.j):int");
    }

    private void B(JSONArray jSONArray) {
        int q;
        com.bytedance.android.input.k.b.a.W("disaster: writeToFile");
        boolean z = true;
        int i = 0;
        while (z && i < 20) {
            i++;
            try {
                q = q();
            } catch (Throwable unused) {
            }
            if (q == -1) {
                com.bytedance.android.input.k.b.a.W("disaster:write did not got flock, sleep 50ms and retry");
                Thread.sleep(50L);
                z = true;
            } else {
                com.bytedance.android.input.k.b.a.W("disaster:write got flock");
                this.f4698d = true;
                com.bytedance.crash.util.a.u(this.b, jSONArray, false);
                if (q > 0) {
                    NativeBridge.e0(q);
                }
                com.bytedance.android.input.k.b.a.W("disaster:write unlock flock");
                boolean z2 = true;
                int i2 = 0;
                do {
                    if (this.f4698d) {
                        com.bytedance.android.input.k.b.a.W("disaster:waiting 20ms");
                        Thread.sleep(20L);
                        i2++;
                    } else {
                        com.bytedance.android.input.k.b.a.W("disaster: breakout");
                        z2 = false;
                    }
                    if (!z2) {
                        break;
                    }
                } while (i2 < 50);
                z = false;
            }
        }
        this.f4698d = false;
    }

    static void c(h hVar) {
        hVar.x();
    }

    static void d(h hVar) {
        g value;
        Objects.requireNonNull(hVar);
        com.bytedance.android.input.k.b.a.W("disaster:checkNetworkRestore");
        try {
            if (hVar.a.size() <= 0) {
                return;
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, g> entry : hVar.a.entrySet()) {
                if (entry != null && (value = entry.getValue()) != null && hVar.m(value) <= 0) {
                    hashMap.put(value.a(), value.c());
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                hVar.w((String) entry2.getKey(), (String) entry2.getValue());
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean e(String str, String str2) {
        h i = i();
        if (i == null || !i.n() || h) {
            return false;
        }
        try {
            int k = i.k(j(TextUtils.isEmpty(null) ? com.bytedance.crash.monitor.l.e().b() : null, str2));
            return k == 4 || k == 5;
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.F(th);
            return false;
        }
    }

    public static long f(String str, URL url) {
        String l;
        h i = i();
        long j = 0;
        if (i == null || !i.n() || h) {
            return 0L;
        }
        com.bytedance.android.input.k.b.a.W("Disaster:checkPermission url=" + url);
        try {
            l = TextUtils.isEmpty(null) ? l(url, WsConstants.KEY_APP_ID) : null;
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.F(th);
        }
        if (TextUtils.isEmpty(l)) {
            com.bytedance.android.input.k.b.a.W("Disaster:checkPermission aid==null");
            return -1L;
        }
        g gVar = i.a.get(j(l, url.getPath()));
        if (gVar == null) {
            com.bytedance.android.input.k.b.a.W("Disaster:checkPermission normal");
            return 0L;
        }
        j = i.m(gVar);
        com.bytedance.android.input.k.b.a.W("Disaster:checkPermission return timeout=" + j);
        return j;
    }

    public static void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.bytedance.android.input.k.b.a.O0("deleteCrashLog:" + str);
            if (new URL(com.bytedance.crash.N.g.j()).getPath().equals(str)) {
                h(CrashType.JAVA);
                h(CrashType.ANR);
                return;
            }
            if (!new URL(com.bytedance.crash.N.g.k()).getPath().equals(str)) {
                if (new URL(com.bytedance.crash.N.g.l()).getPath().equals(str)) {
                    h(CrashType.NATIVE);
                    return;
                }
                return;
            }
            try {
                com.bytedance.crash.util.a.b(com.bytedance.crash.resource.i.b.g());
                com.bytedance.crash.util.a.b(com.bytedance.crash.resource.i.b.b());
                com.bytedance.crash.util.a.b(com.bytedance.crash.resource.i.b.a());
                com.bytedance.crash.util.a.b(com.bytedance.crash.resource.i.b.c());
                com.bytedance.crash.util.a.b(com.bytedance.crash.resource.i.b.e());
                com.bytedance.crash.util.a.b(com.bytedance.crash.resource.i.b.f());
                com.bytedance.crash.util.a.b(com.bytedance.crash.resource.i.b.d());
            } catch (Throwable unused) {
            }
            File a2 = com.bytedance.crash.N.f.a();
            if (a2 != null) {
                com.bytedance.crash.util.a.b(a2);
            }
            h(CrashType.LAUNCH);
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.F(th);
        }
    }

    public static void h(CrashType crashType) {
        List<File> p;
        ArrayList arrayList;
        if (crashType == CrashType.JAVA) {
            p = p(com.bytedance.crash.crash.e.f4579c);
            if (p != null) {
                arrayList = new ArrayList();
                for (File file : p) {
                    if (!e.a.a.a.a.Q0(file, "launch")) {
                        arrayList.add(file);
                    }
                }
                p = arrayList;
            }
            if (p != null || p.size() <= 0) {
            }
            for (File file2 : p) {
                if (!file2.isFile()) {
                    com.bytedance.crash.util.a.b(file2);
                }
            }
            return;
        }
        if (crashType == CrashType.LAUNCH) {
            p = p(com.bytedance.crash.crash.e.f4579c);
            if (p != null) {
                arrayList = new ArrayList();
                for (File file3 : p) {
                    if (e.a.a.a.a.Q0(file3, "launch")) {
                        arrayList.add(file3);
                    }
                }
                p = arrayList;
            }
        } else if (crashType == CrashType.NATIVE) {
            p = p(NativeCrashSummary.FILE_NAME);
        } else if (crashType != CrashType.ANR) {
            return;
        } else {
            p = p(q.f4432f);
        }
        if (p != null) {
        }
    }

    private static h i() {
        synchronized (h.class) {
            if (f4696g == null) {
                f4696g = new h();
            }
        }
        return f4696g;
    }

    public static String j(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? "" : e.a.a.a.a.t(str, BundleUtil.UNDERLINE_TAG, str2);
    }

    private int k(String str) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            g gVar = this.a.get(str);
            if (gVar == null) {
                return 0;
            }
            return gVar.e();
        }
    }

    private static String l(URL url, String str) {
        String str2 = "";
        try {
            String query = url.getQuery();
            if (query != null && query.contains(ContainerUtils.FIELD_DELIMITER) && query.contains(ContainerUtils.KEY_VALUE_DELIMITER)) {
                for (String str3 : query.split(ContainerUtils.FIELD_DELIMITER)) {
                    String[] split = str3.split(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (split != null && split.length >= 2) {
                        try {
                            if (URLDecoder.decode(split[0], "UTF-8").equals(str)) {
                                str2 = URLDecoder.decode(split[1], "UTF-8");
                                com.bytedance.android.input.k.b.a.W("getQueryParams value = " + str2);
                                break;
                            }
                            continue;
                        } catch (UnsupportedEncodingException e2) {
                            com.bytedance.android.input.k.b.a.F(e2);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.F(th);
        }
        return str2;
    }

    private long m(g gVar) {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        long f2 = gVar.f();
        int e2 = gVar.e();
        if (e2 == 1) {
            j = gVar.b();
        } else if (e2 == 3 || e2 == 4 || e2 == 5) {
            int d2 = gVar.d();
            if (d2 <= 0) {
                d2 = 0;
            }
            j = d2 <= 6 ? d2 * 5 * 60 * 1000 : 1800000L;
        } else {
            j = 0;
        }
        if (j == 0) {
            return 0L;
        }
        if (currentTimeMillis < f2) {
            synchronized (this) {
                for (Map.Entry<String, g> entry : this.a.entrySet()) {
                    if (entry != null) {
                        entry.getValue().j(currentTimeMillis);
                    }
                }
            }
            y();
            f2 = currentTimeMillis;
        }
        long j2 = currentTimeMillis - f2;
        if (j2 < j) {
            return j - j2;
        }
        return 0L;
    }

    private boolean n() {
        return this.a.size() > 0;
    }

    public static void o() {
        h i = i();
        if (i != null) {
            i.x();
            if (i.n()) {
                if (h) {
                    com.bytedance.android.input.k.b.a.W("Disaster:disable network disaster!!!");
                    i.t();
                }
                if (com.bytedance.crash.util.a.l(C0652g.g())) {
                    com.bytedance.crash.runtime.b.d(new i(i));
                } else {
                    com.bytedance.android.input.k.b.a.W("disaster:not main process");
                }
            }
            File file = i.b;
            if (file != null && !file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
            FileObserver fileObserver = i.f4699e;
            if (fileObserver != null) {
                fileObserver.startWatching();
            }
        }
    }

    private static List<File> p(String str) {
        File[] listFiles;
        File c2 = com.bytedance.crash.crash.c.c();
        if (c2 == null || (listFiles = c2.listFiles()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            if (file.listFiles(new b(str)) == null) {
                return null;
            }
            arrayList.add(file);
        }
        return arrayList;
    }

    private int q() {
        try {
            this.f4700f.createNewFile();
            return NativeBridge.p(this.f4700f.getAbsolutePath());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private void r() {
        if (e(null, "/monitor/collect/c/crash")) {
            com.bytedance.crash.L.j.o(true);
            com.bytedance.crash.crash.d.c(true);
            com.bytedance.crash.S.a.e(true);
            com.bytedance.crash.P.a.c(true);
        } else {
            com.bytedance.crash.L.j.o(false);
            com.bytedance.crash.S.a.e(false);
            com.bytedance.crash.P.a.c(false);
            com.bytedance.crash.crash.d.c(false);
        }
        com.bytedance.crash.R.d.p(e(null, "/monitor/collect/c/exception"));
        NativeBridge.T(e(null, "/monitor/collect/c/native_bin_crash") ? 1 : 0);
    }

    private static void s(String str, String str2, boolean z, int i) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals("2010")) {
                String j = j(str, str2);
                C0652g.g();
                String f2 = com.bytedance.crash.util.a.f();
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.input.k.b.a.y0(jSONObject, DownloadConstants.PATH_KEY, j);
                if (z) {
                    com.bytedance.android.input.k.b.a.y0(jSONObject, WsConstants.KEY_CONNECTION_STATE, "exit");
                } else {
                    com.bytedance.android.input.k.b.a.y0(jSONObject, WsConstants.KEY_CONNECTION_STATE, "enter");
                }
                com.bytedance.android.input.k.b.a.y0(jSONObject, "strategy", String.valueOf(i));
                com.bytedance.android.input.k.b.a.y0(jSONObject, "pname", f2);
                com.bytedance.android.input.k.b.a.W("disaster:reportEvent aid=" + str + " path=" + str2 + " isRestore" + z + " strategy=" + i);
            }
        } catch (Throwable unused) {
        }
    }

    private void t() {
        try {
            synchronized (this) {
                if (this.a.size() > 0) {
                    this.a.clear();
                    r();
                    y();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void u(boolean z) {
        h = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083 A[EDGE_INSN: B:51:0x0083->B:56:0x0083 BREAK  A[LOOP:0: B:38:0x005b->B:50:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v(java.lang.String r5, java.lang.String r6, int r7, long r8, int r10) {
        /*
            r4 = this;
            java.lang.String r0 = j(r5, r6)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lb
            return
        Lb:
            monitor-enter(r4)
            r1 = 1
            if (r7 != 0) goto L34
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.crash.upload.g> r7 = r4.a     // Catch: java.lang.Throwable -> L97
            boolean r7 = r7.containsKey(r0)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L95
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L97
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.crash.upload.g> r7 = r4.a     // Catch: java.lang.Throwable -> L2b
            boolean r7 = r7.containsKey(r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 == 0) goto L2b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.crash.upload.g> r7 = r4.a     // Catch: java.lang.Throwable -> L2b
            r7.remove(r0)     // Catch: java.lang.Throwable -> L2b
            r4.r()     // Catch: java.lang.Throwable -> L2b
            r4.y()     // Catch: java.lang.Throwable -> L2b
        L2b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            r7 = -1
            s(r5, r6, r1, r7)     // Catch: java.lang.Throwable -> L97
            goto L95
        L31:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            throw r5     // Catch: java.lang.Throwable -> L97
        L34:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.crash.upload.g> r2 = r4.a     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L97
            com.bytedance.crash.upload.g r2 = (com.bytedance.crash.upload.g) r2     // Catch: java.lang.Throwable -> L97
            r3 = 0
            if (r2 != 0) goto L47
            s(r5, r6, r3, r7)     // Catch: java.lang.Throwable -> L97
            com.bytedance.crash.upload.g r2 = new com.bytedance.crash.upload.g     // Catch: java.lang.Throwable -> L97
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L97
        L47:
            r2.i(r7)     // Catch: java.lang.Throwable -> L97
            r2.g(r10)     // Catch: java.lang.Throwable -> L97
            if (r7 != r1) goto L52
            r2.h(r8)     // Catch: java.lang.Throwable -> L97
        L52:
            r5 = 5
            if (r7 != r5) goto L83
            java.lang.String r5 = "disaster: clearCacheLog"
            com.bytedance.android.input.k.b.a.W(r5)     // Catch: java.lang.Throwable -> L97
            r5 = r3
        L5b:
            int r5 = r5 + r1
            int r7 = r4.q()     // Catch: java.lang.Throwable -> L7c
            if (r7 <= 0) goto L70
            java.lang.String r8 = "disaster: got flock"
            com.bytedance.android.input.k.b.a.W(r8)     // Catch: java.lang.Throwable -> L7c
            g(r6)     // Catch: java.lang.Throwable -> L7c
            if (r7 <= 0) goto L7c
            com.bytedance.crash.jni.NativeBridge.e0(r7)     // Catch: java.lang.Throwable -> L7c
            goto L7c
        L70:
            java.lang.String r7 = "disaster: did not got flock, sleep 500ms and retry"
            com.bytedance.android.input.k.b.a.W(r7)     // Catch: java.lang.Throwable -> L7c
            r7 = 50
            java.lang.Thread.sleep(r7)     // Catch: java.lang.Throwable -> L7c
            r7 = r1
            goto L7d
        L7c:
            r7 = r3
        L7d:
            if (r7 == 0) goto L83
            r7 = 10
            if (r5 < r7) goto L5b
        L83:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L97
            r2.j(r5)     // Catch: java.lang.Throwable -> L97
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.crash.upload.g> r5 = r4.a     // Catch: java.lang.Throwable -> L97
            r5.put(r0, r2)     // Catch: java.lang.Throwable -> L97
            r4.r()     // Catch: java.lang.Throwable -> L97
            r4.y()     // Catch: java.lang.Throwable -> L97
        L95:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L97
            return
        L97:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L97
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.h.v(java.lang.String, java.lang.String, int, long, int):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0070 -> B:15:0x007b). Please report as a decompilation issue!!! */
    private void w(String str, String str2) {
        j jVar;
        String jSONObject;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.bytedance.android.input.k.b.a.O0("Disaster:syncNetworkStateByNet aid or path is null");
            return;
        }
        com.bytedance.android.input.k.b.a.W("Disaster:syncNetworkStateByNet path=" + str2);
        String m = com.bytedance.crash.N.g.m();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(WsConstants.KEY_APP_ID, Integer.valueOf(str));
            jSONObject2.put(RomInfo.KEY_OS_TYPE, "Android");
            jSONObject2.put(DownloadConstants.PATH_KEY, str2);
            jSONObject = jSONObject2.toString();
            try {
            } catch (Throwable th) {
                com.bytedance.android.input.k.b.a.P0(th);
                jVar = new j(207, th);
            }
        } catch (JSONException e2) {
            com.bytedance.android.input.k.b.a.F(e2);
            jVar = new j(207);
        }
        if (!TextUtils.isEmpty(jSONObject) && !TextUtils.isEmpty(m)) {
            jVar = CrashUploader.g(m, jSONObject.getBytes(), CrashUploader.CompressType.GZIP, false);
            StringBuilder M = e.a.a.a.a.M("Disaster:syncNetworkStateByNet rsp=");
            M.append(jVar.toString());
            com.bytedance.android.input.k.b.a.W(M.toString());
            A(str, str2, jVar);
            if (this.f4697c && jVar.a() == 0) {
                return;
            }
            this.f4697c = false;
            t();
            com.bytedance.android.input.k.b.a.W("disaster:syncNetworkStateByNet, quota path error");
        }
        jVar = new j(201);
        StringBuilder M2 = e.a.a.a.a.M("Disaster:syncNetworkStateByNet rsp=");
        M2.append(jVar.toString());
        com.bytedance.android.input.k.b.a.W(M2.toString());
        A(str, str2, jVar);
        if (this.f4697c) {
        }
        this.f4697c = false;
        t();
        com.bytedance.android.input.k.b.a.W("disaster:syncNetworkStateByNet, quota path error");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f A[EDGE_INSN: B:30:0x004f->B:22:0x004f BREAK  A[LOOP:0: B:9:0x001f->B:29:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void x() {
        /*
            r6 = this;
            java.io.File r0 = r6.b     // Catch: java.lang.Throwable -> L9d
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L94
            java.io.File r0 = r6.b     // Catch: java.lang.Throwable -> L9d
            long r0 = r0.length()     // Catch: java.lang.Throwable -> L9d
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L16
            goto L94
        L16:
            java.lang.String r0 = "disaster: readFromFile"
            com.bytedance.android.input.k.b.a.W(r0)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = ""
            r1 = 0
            r2 = r1
        L1f:
            r3 = 1
            int r2 = r2 + r3
            int r4 = r6.q()     // Catch: java.lang.Throwable -> L48
            if (r4 <= 0) goto L3d
            java.lang.String r3 = "disaster: read got flock"
            com.bytedance.android.input.k.b.a.W(r3)     // Catch: java.lang.Throwable -> L48
            java.io.File r3 = r6.b     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = com.bytedance.crash.util.a.p(r3)     // Catch: java.lang.Throwable -> L48
            if (r4 <= 0) goto L37
            com.bytedance.crash.jni.NativeBridge.e0(r4)     // Catch: java.lang.Throwable -> L48
        L37:
            java.lang.String r3 = "disaster: read unlock flock"
            com.bytedance.android.input.k.b.a.W(r3)     // Catch: java.lang.Throwable -> L48
            goto L48
        L3d:
            java.lang.String r4 = "disaster:read did not got flock, sleep 500ms and retry"
            com.bytedance.android.input.k.b.a.W(r4)     // Catch: java.lang.Throwable -> L48
            r4 = 50
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L48
            goto L49
        L48:
            r3 = r1
        L49:
            if (r3 == 0) goto L4f
            r3 = 10
            if (r2 < r3) goto L1f
        L4f:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L9d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r0.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "Disaster:syncNetworkStateFromFile mJsonArray="
            r0.append(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L9d
            r0.append(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9d
            com.bytedance.android.input.k.b.a.W(r0)     // Catch: java.lang.Throwable -> L9d
        L6c:
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L9d
            if (r1 >= r0) goto Lad
            org.json.JSONObject r0 = r2.getJSONObject(r1)     // Catch: java.lang.Throwable -> L9d
            java.util.Iterator r3 = r0.keys()     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r3 = r3.next()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L9d
            com.bytedance.crash.upload.g r4 = new com.bytedance.crash.upload.g     // Catch: java.lang.Throwable -> L9d
            org.json.JSONObject r0 = r0.getJSONObject(r3)     // Catch: java.lang.Throwable -> L9d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L9d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.crash.upload.g> r0 = r6.a     // Catch: java.lang.Throwable -> L9d
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L9d
            r6.r()     // Catch: java.lang.Throwable -> L9d
            int r1 = r1 + 1
            goto L6c
        L94:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.crash.upload.g> r0 = r6.a     // Catch: java.lang.Throwable -> L9d
            r0.clear()     // Catch: java.lang.Throwable -> L9d
            r6.r()     // Catch: java.lang.Throwable -> L9d
            return
        L9d:
            r0 = move-exception
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.crash.upload.g> r1 = r6.a
            r1.clear()
            r6.r()
            r1 = 0
            r6.B(r1)
            com.bytedance.android.input.k.b.a.F(r0)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.h.x():void");
    }

    private void y() {
        synchronized (this.a) {
            JSONArray jSONArray = new JSONArray();
            try {
                for (Map.Entry<String, g> entry : this.a.entrySet()) {
                    if (entry != null) {
                        jSONArray.put(entry.getValue().k());
                    }
                }
                if (jSONArray.length() <= 0) {
                    this.a.clear();
                    r();
                    B(null);
                    com.bytedance.android.input.k.b.a.W("Disaster:syncNetworkStateToFile delete strategy file");
                } else {
                    B(jSONArray);
                    com.bytedance.android.input.k.b.a.W("Disaster:syncNetworkStateToFile mJsonArray=" + jSONArray.toString());
                }
            } catch (Throwable unused) {
                this.a.clear();
                r();
                B(null);
            }
        }
    }

    public static int z(URL url, j jVar) {
        h i = i();
        if (i == null || h) {
            return 0;
        }
        if (url == null) {
            com.bytedance.android.input.k.b.a.O0("Disaster:updateNetworkState param is invalid");
            return -1;
        }
        com.bytedance.android.input.k.b.a.O0("Disaster:updateNetworkState url=" + url);
        try {
            String l = l(url, WsConstants.KEY_APP_ID);
            String path = url.getPath();
            if (TextUtils.isEmpty(l)) {
                return -1;
            }
            return i.A(l, path, jVar);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
