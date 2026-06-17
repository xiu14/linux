package com.huawei.hianalytics.f.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static a f7109e;
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private Context f7110c;

    /* renamed from: d, reason: collision with root package name */
    private String f7111d;

    private a(Context context) {
        this.f7110c = context;
        this.f7111d = context.getFilesDir().getPath();
    }

    public static a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f7109e == null) {
                f7109e = new a(context);
            }
            aVar = f7109e;
        }
        return aVar;
    }

    public static String b() {
        return i.a(i.a() + com.huawei.hianalytics.f.a.a.a() + e.c(), 4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x007b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private java.lang.String b(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            boolean r0 = r10.exists()
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "hianalytics_"
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.io.File r0 = new java.io.File
            java.lang.String r10 = r10.getPath()
            r0.<init>(r10, r11)
            java.lang.String r10 = "inputStream Not closed!"
            java.lang.String r11 = "HiAnalytics/event/aes128key"
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68 java.io.FileNotFoundException -> L70
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68 java.io.FileNotFoundException -> L70
            com.huawei.hianalytics.util.a r0 = new com.huawei.hianalytics.util.a     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62 java.io.FileNotFoundException -> L64
            r2 = 1024(0x400, float:1.435E-42)
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62 java.io.FileNotFoundException -> L64
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62 java.io.FileNotFoundException -> L64
        L33:
            int r4 = r3.read(r2)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62 java.io.FileNotFoundException -> L64
            long r5 = (long) r4     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62 java.io.FileNotFoundException -> L64
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L42
            r0.a(r2, r4)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62 java.io.FileNotFoundException -> L64
            goto L33
        L42:
            int r2 = r0.a()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62 java.io.FileNotFoundException -> L64
            if (r2 != 0) goto L4c
            r3.close()     // Catch: java.io.IOException -> L7b
            goto L7e
        L4c:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62 java.io.FileNotFoundException -> L64
            byte[] r0 = r0.b()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62 java.io.FileNotFoundException -> L64
            java.lang.String r4 = "UTF-8"
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62 java.io.FileNotFoundException -> L64
            r3.close()     // Catch: java.io.IOException -> L5b
            goto L5e
        L5b:
            com.huawei.hianalytics.g.b.c(r11, r10)
        L5e:
            r1 = r2
            goto L7e
        L60:
            r0 = move-exception
            goto L80
        L62:
            r2 = r3
            goto L68
        L64:
            r2 = r3
            goto L70
        L66:
            r0 = move-exception
            goto L7f
        L68:
            java.lang.String r0 = "getInfoFromFile(): stream.read or new string exception"
            com.huawei.hianalytics.g.b.c(r11, r0)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L7e
            goto L77
        L70:
            java.lang.String r0 = "getInfoFromFile(): No files need to be read"
            com.huawei.hianalytics.g.b.c(r11, r0)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L7e
        L77:
            r2.close()     // Catch: java.io.IOException -> L7b
            goto L7e
        L7b:
            com.huawei.hianalytics.g.b.c(r11, r10)
        L7e:
            return r1
        L7f:
            r3 = r2
        L80:
            if (r3 == 0) goto L89
            r3.close()     // Catch: java.io.IOException -> L86
            goto L89
        L86:
            com.huawei.hianalytics.g.b.c(r11, r10)
        L89:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hianalytics.f.g.a.b(java.io.File, java.lang.String):java.lang.String");
    }

    private String c(String str, String str2) {
        File file;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7111d);
        String str3 = File.separator;
        String b = b(new File(e.a.a.a.a.J(sb, str3, str)), str);
        if (TextUtils.isEmpty(b)) {
            StringBuilder sb2 = new StringBuilder();
            e.a.a.a.a.M0(sb2, this.f7111d, str3, "hianalytics", str3);
            sb2.append(str2);
            String b2 = b(new File(sb2.toString()), str2);
            if (!TextUtils.isEmpty(b2)) {
                return b2;
            }
            b = e.b();
            StringBuilder sb3 = new StringBuilder();
            e.a.a.a.a.M0(sb3, this.f7111d, str3, "hianalytics", str3);
            sb3.append(str2);
            File file2 = new File(sb3.toString());
            if (!file2.exists() && file2.mkdirs()) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", "The secret key file creates the OK!");
            }
            StringBuilder sb4 = new StringBuilder();
            e.a.a.a.a.M0(sb4, this.f7111d, str3, "hianalytics", str3);
            sb4.append(str2);
            file = new File(sb4.toString(), "hianalytics_" + str2);
        } else {
            File file3 = new File(e.a.a.a.a.K(new StringBuilder(), this.f7111d, str3, str));
            d.a(file3);
            if (file3.isDirectory() && file3.delete()) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", "The secret key file is Directory del! change new file");
            }
            StringBuilder sb5 = new StringBuilder();
            e.a.a.a.a.M0(sb5, this.f7111d, str3, "hianalytics", str3);
            sb5.append(str2);
            File file4 = new File(sb5.toString());
            if (!file4.exists() && file4.mkdirs()) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", "The secret key file creates the OK!");
            }
            StringBuilder sb6 = new StringBuilder();
            e.a.a.a.a.M0(sb6, this.f7111d, str3, "hianalytics", str3);
            sb6.append(str2);
            file = new File(sb6.toString(), "hianalytics_" + str2);
        }
        e(file, b);
        return b;
    }

    private void d(SharedPreferences sharedPreferences, String str) {
        byte[] a = c.a();
        long currentTimeMillis = System.currentTimeMillis();
        g.a(sharedPreferences, "PrivacyData", c.a(a, c.a(f(), a, str)));
        g.a(sharedPreferences, "flashKeyTime", Long.valueOf(currentTimeMillis));
    }

    private void e(File file, String str) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        }
        try {
            fileOutputStream.write(str.getBytes("UTF-8"));
            fileOutputStream.flush();
            try {
                fileOutputStream.close();
            } catch (IOException unused3) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event/aes128key", "OutputStream not closed");
            }
        } catch (FileNotFoundException unused4) {
            fileOutputStream2 = fileOutputStream;
            com.huawei.hianalytics.g.b.c("HiAnalytics/event/aes128key", "saveInfoToFile(): No files need to be read");
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused5) {
                    com.huawei.hianalytics.g.b.c("HiAnalytics/event/aes128key", "OutputStream not closed");
                }
            }
        } catch (IOException unused6) {
            fileOutputStream2 = fileOutputStream;
            com.huawei.hianalytics.g.b.c("HiAnalytics/event/aes128key", "saveInfoToFile(): io exc from write info to file!");
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused7) {
                    com.huawei.hianalytics.g.b.c("HiAnalytics/event/aes128key", "OutputStream not closed");
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused8) {
                    com.huawei.hianalytics.g.b.c("HiAnalytics/event/aes128key", "OutputStream not closed");
                }
            }
            throw th;
        }
    }

    private String f() {
        if (TextUtils.isEmpty(this.a)) {
            this.a = g();
        }
        return this.a;
    }

    private String g() {
        return i.a(b(), c("secondAssembly", "aprpap"), c("thirdAssembly", "febdoc"), c("fourthAssembly", "marfil"), c("fiveAssembly", "maywnj"));
    }

    public final String a() {
        String b;
        SharedPreferences d2;
        if (TextUtils.isEmpty(this.b)) {
            Context context = this.f7110c;
            String str = (String) g.b(g.d(context, "analytics_key"), "analytics_key", "");
            if (TextUtils.isEmpty(str)) {
                d2 = g.d(context, "Privacy_MY");
                String str2 = (String) g.b(d2, "PrivacyData", "");
                if (TextUtils.isEmpty(str2)) {
                    b = e.a();
                    d(d2, b);
                    this.b = b;
                } else {
                    Pair<byte[], String> a = c.a(str2);
                    b = c.b(f(), (byte[]) a.first, (String) a.second);
                    this.b = b;
                }
            } else {
                Pair<byte[], String> a2 = c.a(str);
                b = c.b(f(), (byte[]) a2.first, (String) a2.second);
                if (TextUtils.isEmpty(b)) {
                    b = e.a();
                    d2 = g.d(context, "Privacy_MY");
                    d(d2, b);
                }
                this.b = b;
            }
        }
        return this.b;
    }

    public final void a(String str, int i) {
        SharedPreferences d2;
        if (TextUtils.isEmpty(str) || i != 1) {
            return;
        }
        long longValue = ((Long) g.b(g.d(this.f7110c, "analytics_key"), "flashKeyTime", -1L)).longValue();
        if (longValue == -1) {
            d2 = g.d(this.f7110c, "Privacy_MY");
            longValue = ((Long) g.b(d2, "flashKeyTime", -1L)).longValue();
        } else {
            g.a(this.f7110c, "../shared_prefs/", "analytics_key");
            d2 = g.d(this.f7110c, "Privacy_MY");
            d(d2, str);
            this.b = str;
        }
        if (System.currentTimeMillis() - longValue > com.heytap.mcssdk.constant.a.f6889g) {
            this.b = str;
            long longValue2 = ((Long) g.b(d2, "assemblyFlash", -1L)).longValue();
            if (longValue2 == -1) {
                g.a(d2, "assemblyFlash", Long.valueOf(System.currentTimeMillis()));
            } else if (System.currentTimeMillis() - longValue2 > 31536000000L) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f7111d);
                String str2 = File.separator;
                sb.append(str2);
                sb.append("hianalytics");
                sb.append(str2);
                sb.append("aprpap");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                e.a.a.a.a.M0(sb3, this.f7111d, str2, "hianalytics", str2);
                sb3.append("febdoc");
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                e.a.a.a.a.M0(sb5, this.f7111d, str2, "hianalytics", str2);
                sb5.append("marfil");
                String sb6 = sb5.toString();
                StringBuilder sb7 = new StringBuilder();
                e.a.a.a.a.M0(sb7, this.f7111d, str2, "hianalytics", str2);
                sb7.append("maywnj");
                String sb8 = sb7.toString();
                e(new File(sb2, "hianalytics_aprpap"), e.b());
                e(new File(sb4, "hianalytics_febdoc"), e.b());
                e(new File(sb6, "hianalytics_marfil"), e.b());
                e(new File(sb8, "hianalytics_maywnj"), e.b());
                g.a(d2, "assemblyFlash", Long.valueOf(System.currentTimeMillis()));
                this.a = g();
            }
            d(d2, str);
        }
    }
}
