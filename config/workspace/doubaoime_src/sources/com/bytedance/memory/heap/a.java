package com.bytedance.memory.heap;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.bytedance.apm.core.e;
import com.bytedance.apm.g;
import com.bytedance.memory.b.c;
import com.bytedance.memory.b.d;
import com.bytedance.memory.c.b;
import com.bytedance.memory.heap.HeapDump;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static volatile a f5392f;
    private Context a;
    private volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private volatile HeapDump f5393c;

    /* renamed from: d, reason: collision with root package name */
    private volatile SharedPreferences f5394d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5395e;

    /* renamed from: com.bytedance.memory.heap.a$a, reason: collision with other inner class name */
    class RunnableC0274a implements Runnable {
        RunnableC0274a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.a(a.this, null);
            d.a(b.c().h());
            a.this.g().edit().putString("filePath", "").commit();
            a.e().l("");
            a.e().n("");
            a.e().k(0);
        }
    }

    private a(@NonNull Context context) {
        this.a = context.getApplicationContext();
    }

    static /* synthetic */ HeapDump a(a aVar, HeapDump heapDump) {
        aVar.f5393c = null;
        return null;
    }

    public static a e() {
        if (f5392f == null) {
            synchronized (a.class) {
                if (f5392f == null) {
                    f5392f = new a(com.bytedance.memory.a.a.j().h());
                }
            }
        }
        return f5392f;
    }

    private void p(@NonNull HeapDump heapDump, JSONObject jSONObject) throws JSONException {
        jSONObject.put("heapDumpFilePath", heapDump.heapDumpFile.getPath());
        jSONObject.put("shrinkFilePath", heapDump.shrinkFilePath);
        jSONObject.put("heapDumpFileSize", heapDump.heapDumpFile.length());
        jSONObject.put("referenceName", heapDump.referenceName);
        jSONObject.put("isDebug", heapDump.isDebug);
        jSONObject.put("gcDurationMs", heapDump.gcDurationMs);
        jSONObject.put("watchDurationMs", heapDump.watchDurationMs);
        jSONObject.put("dumpDurationMs", heapDump.heapDumpDurationMs);
        jSONObject.put("currentTime", heapDump.currentTime);
    }

    @NonNull
    private HeapDump q(JSONObject jSONObject, File file) {
        HeapDump.b newBuilder = HeapDump.newBuilder();
        newBuilder.f(file);
        newBuilder.j = jSONObject.optLong("currentTime");
        jSONObject.optLong("heapDumpFileSize");
        String optString = jSONObject.optString("referenceName");
        com.bytedance.feedbackerlib.a.j(optString, "referenceName");
        newBuilder.f5389e = optString;
        newBuilder.a = jSONObject.optBoolean("isDebug");
        newBuilder.f5391g = jSONObject.optLong("gcDurationMs");
        newBuilder.f5390f = jSONObject.optLong("watchDurationMs");
        newBuilder.h = jSONObject.optLong("dumpDurationMs");
        newBuilder.f5387c = jSONObject.optString("shrinkFilePath");
        com.bytedance.feedbackerlib.a.j(newBuilder.b, "heapDumpFile");
        return new HeapDump(newBuilder);
    }

    @WorkerThread
    public void b() {
        FileInputStream fileInputStream;
        if (this.f5393c != null) {
            return;
        }
        String string = g().getString("filePath", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        File file = new File(string);
        FileInputStream fileInputStream2 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        HeapDump heapDump = null;
        if (file.exists()) {
            StringBuilder sb = new StringBuilder();
            try {
                fileInputStream = new FileInputStream(file);
                while (true) {
                    try {
                        try {
                            int read = fileInputStream.read();
                            if (read == -1) {
                                break;
                            } else {
                                sb.append((char) read);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            if (file.delete()) {
                                c.a(e, "Could not read result file %s, deleted it.", file);
                            } else {
                                c.a(e, "Could not read result file %s, could not delete it either.", file);
                            }
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            c.b("cache heapdump %s", heapDump);
                            this.f5393c = heapDump;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                JSONObject jSONObject = new JSONObject(sb.toString());
                HeapDump q = q(jSONObject, new File(jSONObject.optString("heapDumpFilePath")));
                this.f5393c = q;
                try {
                    fileInputStream.close();
                } catch (IOException unused3) {
                }
                heapDump = q;
            } catch (Exception e3) {
                e = e3;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            g().edit().putString("filePath", "").commit();
        }
        c.b("cache heapdump %s", heapDump);
        this.f5393c = heapDump;
    }

    public void c() {
        com.bytedance.memory.b.b.a.a(new RunnableC0274a(), "HeapSaver-deleteCache");
    }

    public long d() {
        return e().f5393c != null ? e().f5393c.currentTime : System.currentTimeMillis();
    }

    public String f() {
        return g().getString("latestFilePath", "");
    }

    @NonNull
    public SharedPreferences g() {
        if (this.f5394d == null) {
            synchronized (this) {
                if (this.f5394d == null) {
                    this.f5394d = e.e(this.a, "MemoryWidgetSp" + g.i());
                }
            }
        }
        return this.f5394d;
    }

    public String h() {
        return g().getString("updateVersionCode", "");
    }

    public boolean i() {
        return this.f5395e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.File j(@androidx.annotation.NonNull com.bytedance.memory.heap.HeapDump r6) {
        /*
            r5 = this;
            r5.f5393c = r6
            com.bytedance.memory.c.b r0 = com.bytedance.memory.c.b.c()
            java.io.File r0 = r0.f()
            boolean r1 = r0.exists()
            if (r1 == 0) goto L13
            r0.delete()
        L13:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.getPath()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "analyzedHeapFile.getHeapDumpFilePath() %s"
            com.bytedance.memory.b.c.b(r2, r1)
            java.lang.String r1 = r0.getPath()
            android.content.SharedPreferences r2 = r5.g()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "filePath"
            android.content.SharedPreferences$Editor r1 = r2.putString(r4, r1)
            r1.commit()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2 = 0
            r5.p(r6, r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L68
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L68
            r6.write(r1)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L68
            r6.close()     // Catch: java.io.IOException -> L53
        L53:
            return r0
        L54:
            r0 = move-exception
            goto L5b
        L56:
            r6 = move-exception
            goto L6b
        L58:
            r6 = move-exception
            r0 = r6
            r6 = r2
        L5b:
            java.lang.String r1 = "Could not save leak analysis result to disk."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L68
            com.bytedance.memory.b.c.a(r0, r1, r3)     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L67
            r6.close()     // Catch: java.io.IOException -> L67
        L67:
            return r2
        L68:
            r0 = move-exception
            r2 = r6
            r6 = r0
        L6b:
            if (r2 == 0) goto L70
            r2.close()     // Catch: java.io.IOException -> L70
        L70:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.memory.heap.a.j(com.bytedance.memory.heap.HeapDump):java.io.File");
    }

    @SuppressLint({"ApplySharedPref"})
    public void k(int i) {
        g().edit().putInt("hprof_type", i).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void l(String str) {
        g().edit().putString("latestFilePath", str).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void m(boolean z) {
        g().edit().putBoolean("hasShrink", z).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void n(String str) {
        g().edit().putString("updateVersionCode", str).commit();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @SuppressLint({"SimpleDateFormat"})
    @WorkerThread
    public void o() {
        File file;
        if (this.b) {
            return;
        }
        ?? r3 = 0;
        if (e().g().getBoolean("hasShrink", false)) {
            c.b("HeapSaver shrink hasShrinked", new Object[0]);
            com.bytedance.memory.f.a.b();
            return;
        }
        if (b.c().j()) {
            String h = e().h();
            if (b.c().e().length() <= 31457280 || TextUtils.isEmpty(h)) {
                c.b(e.a.a.a.a.s("HeapSaver shrink return deleteCache. updateVersionCode:", h), new Object[0]);
                e().c();
                return;
            }
            this.b = true;
            Process.setThreadPriority(10);
            String optString = g.k().optString("device_id");
            long currentTimeMillis = e().f5393c != null ? e().f5393c.currentTime : System.currentTimeMillis();
            File e2 = b.c().e();
            String substring = e2.getName().substring(0, e2.getName().lastIndexOf("."));
            if (com.bytedance.feedbackerlib.a.G("memory_upload_origin")) {
                File file2 = new File(b.c().h(), "dump.hprof");
                if (e2.getPath().contains("jpg")) {
                    e2.renameTo(file2);
                }
                File b = b.c().b();
                StringBuilder sb = new StringBuilder();
                e.a.a.a.a.M0(sb, substring.replace("dump", new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date(currentTimeMillis))), BundleUtil.UNDERLINE_TAG, optString, BundleUtil.UNDERLINE_TAG);
                File file3 = new File(b, e.a.a.a.a.J(sb, h, "_origin.zip"));
                com.bytedance.feedbackerlib.a.P0("origin_compress_begin");
                long currentTimeMillis2 = System.currentTimeMillis();
                com.bytedance.memory.b.g.b(file2, file3);
                c.b("compress origin file succeed", new Object[0]);
                com.bytedance.feedbackerlib.a.S0("origin_compress_time", System.currentTimeMillis() - currentTimeMillis2);
                com.bytedance.feedbackerlib.a.P0("origin_compress_end");
                com.bytedance.feedbackerlib.a.S0("origin_compress_size", file3.length() / DownloadConstants.KB);
                if (file2.exists()) {
                    file2.delete();
                }
                e().k(1);
                e().m(true);
                e().l(file3.getAbsolutePath());
            } else {
                c.b("shrink begin with path %s, length %s ", e2.getPath(), Long.valueOf(e2.length()));
                try {
                } catch (Throwable th) {
                    com.bytedance.services.apm.api.a.e(th, "realShrink failed");
                    th.printStackTrace();
                }
                if (e2.exists()) {
                    file = com.bytedance.feedbackerlib.a.L0(e2, new File(b.c().g(), "dump.hprof"));
                    if (file != null || (file.length() < 31457280 && e().g().getInt("hprof_type", 1) == 2)) {
                        r3 = 0;
                        c.b("shrink failed deleteCache", new Object[0]);
                        e().c();
                    } else {
                        c.b("shrink succeed", new Object[0]);
                        com.bytedance.feedbackerlib.a.P0("shrink_compress_begin");
                        long currentTimeMillis3 = System.currentTimeMillis();
                        File file4 = new File(file.getParentFile(), file.getName().substring(0, file.getName().lastIndexOf(".")) + ".zip");
                        com.bytedance.memory.b.g.b(file, file4);
                        if (file4.exists()) {
                            file.delete();
                        }
                        com.bytedance.feedbackerlib.a.S0("shrink_compress_time", System.currentTimeMillis() - currentTimeMillis3);
                        com.bytedance.feedbackerlib.a.P0("shrink_compress_end");
                        com.bytedance.feedbackerlib.a.S0("shrink_compress_size", file4.length() / DownloadConstants.KB);
                        File file5 = new File(file4.getParent(), new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date(currentTimeMillis)) + BundleUtil.UNDERLINE_TAG + optString + BundleUtil.UNDERLINE_TAG + h + "_shrink.zip");
                        if (file4.exists()) {
                            file4.renameTo(file5);
                        }
                        e().m(true);
                        e().l(file5.getAbsolutePath());
                        r3 = 0;
                    }
                }
                file = null;
                if (file != null) {
                }
                r3 = 0;
                c.b("shrink failed deleteCache", new Object[0]);
                e().c();
            }
            b.c().a();
            this.b = r3;
            Process.setThreadPriority(r3);
            com.bytedance.memory.f.a.b();
        }
    }

    public void r(long j) {
        this.f5395e = true;
        g().edit().putLong("lastDumpTime", j).commit();
    }
}
