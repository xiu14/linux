package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.framework.common.BundleUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public class SoLoader {
    static n b;

    /* renamed from: f, reason: collision with root package name */
    private static q[] f6696f;

    /* renamed from: g, reason: collision with root package name */
    private static com.facebook.soloader.b f6697g;
    private static int l;

    /* renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f6693c = new ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    private static volatile o[] f6694d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicInteger f6695e = new AtomicInteger(0);
    private static final HashSet<String> h = new HashSet<>();
    private static final Map<String, Object> i = new HashMap();
    private static final Set<String> j = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final String[] k = {System.mapLibraryName("breakpad")};
    private static int m = 0;
    static final boolean a = true;

    class a implements n {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6698c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runtime f6699d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Method f6700e;

        a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.a = z;
            this.b = str;
            this.f6698c = str2;
            this.f6699d = runtime;
            this.f6700e = method;
        }

        private String a(String str) {
            try {
                File file = new File(str);
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            String format = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                            fileInputStream.close();
                            return format;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | SecurityException | NoSuchAlgorithmException e2) {
                return e2.toString();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(java.lang.String r9, int r10) {
            /*
                r8 = this;
                boolean r0 = r8.a
                if (r0 == 0) goto Lb5
                r0 = 4
                r10 = r10 & r0
                r1 = 1
                r2 = 0
                if (r10 != r0) goto Lc
                r10 = r1
                goto Ld
            Lc:
                r10 = r2
            Ld:
                if (r10 == 0) goto L12
                java.lang.String r10 = r8.b
                goto L14
            L12:
                java.lang.String r10 = r8.f6698c
            L14:
                r0 = 0
                java.lang.Runtime r3 = r8.f6699d     // Catch: java.lang.Throwable -> L71 java.lang.reflect.InvocationTargetException -> L74 java.lang.IllegalArgumentException -> L76 java.lang.IllegalAccessException -> L78
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L71 java.lang.reflect.InvocationTargetException -> L74 java.lang.IllegalArgumentException -> L76 java.lang.IllegalAccessException -> L78
                java.lang.reflect.Method r4 = r8.f6700e     // Catch: java.lang.Throwable -> L65
                java.lang.Runtime r5 = r8.f6699d     // Catch: java.lang.Throwable -> L65
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L65
                r6[r2] = r9     // Catch: java.lang.Throwable -> L65
                java.lang.Class<com.facebook.soloader.SoLoader> r2 = com.facebook.soloader.SoLoader.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L65
                r6[r1] = r2     // Catch: java.lang.Throwable -> L65
                r1 = 2
                r6[r1] = r10     // Catch: java.lang.Throwable -> L65
                java.lang.Object r1 = r4.invoke(r5, r6)     // Catch: java.lang.Throwable -> L65
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L65
                if (r1 != 0) goto L59
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5f
                if (r1 == 0) goto Lb8
                java.lang.String r0 = "SoLoader"
                java.lang.String r2 = "Error when loading lib: "
                java.lang.String r3 = " lib hash: "
                java.lang.StringBuilder r1 = e.a.a.a.a.U(r2, r1, r3)
                java.lang.String r9 = r8.a(r9)
                r1.append(r9)
                java.lang.String r9 = " search path is "
                r1.append(r9)
                r1.append(r10)
                java.lang.String r9 = r1.toString()
                android.util.Log.e(r0, r9)
                goto Lb8
            L59:
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L5f
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L5f
                throw r0     // Catch: java.lang.Throwable -> L5f
            L5f:
                r0 = move-exception
                r2 = r8
                r7 = r1
                r1 = r0
                r0 = r7
                goto L67
            L65:
                r1 = move-exception
                r2 = r8
            L67:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L6f
                throw r1     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.IllegalArgumentException -> L6b java.lang.IllegalAccessException -> L6d java.lang.Throwable -> L91
            L69:
                r1 = move-exception
                goto L7a
            L6b:
                r1 = move-exception
                goto L7a
            L6d:
                r1 = move-exception
                goto L7a
            L6f:
                r1 = move-exception
                goto L67
            L71:
                r1 = move-exception
                r2 = r8
                goto L92
            L74:
                r1 = move-exception
                goto L79
            L76:
                r1 = move-exception
                goto L79
            L78:
                r1 = move-exception
            L79:
                r2 = r8
            L7a:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
                r3.<init>()     // Catch: java.lang.Throwable -> L91
                java.lang.String r4 = "Error: Cannot load "
                r3.append(r4)     // Catch: java.lang.Throwable -> L91
                r3.append(r9)     // Catch: java.lang.Throwable -> L91
                java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L91
                java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L91
                r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L91
                throw r3     // Catch: java.lang.Throwable -> L91
            L91:
                r1 = move-exception
            L92:
                if (r0 == 0) goto Lb4
                java.lang.String r3 = "SoLoader"
                java.lang.String r4 = "Error when loading lib: "
                java.lang.String r5 = " lib hash: "
                java.lang.StringBuilder r0 = e.a.a.a.a.U(r4, r0, r5)
                java.lang.String r9 = r2.a(r9)
                r0.append(r9)
                java.lang.String r9 = " search path is "
                r0.append(r9)
                r0.append(r10)
                java.lang.String r9 = r0.toString()
                android.util.Log.e(r3, r9)
            Lb4:
                throw r1
            Lb5:
                java.lang.System.load(r9)
            Lb8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.a.b(java.lang.String, int):void");
        }
    }

    public static final class b extends UnsatisfiedLinkError {
        b(Throwable th, String str) {
            super(e.a.a.a.a.K(e.a.a.a.a.M("APK was built for a different platform. Supported ABIs: "), Arrays.toString(SysUtil$MarshmallowSysdeps.getSupportedAbis()), " error: ", str));
            initCause(th);
        }
    }

    private static void a(Context context, ArrayList<o> arrayList, int i2) throws IOException {
        if ((l & 8) != 0) {
            f6696f = null;
            File l2 = q.l(context, "lib-main");
            try {
                MinElf.a(l2);
                return;
            } catch (IOException e2) {
                StringBuilder M = e.a.a.a.a.M("Failed to delete ");
                M.append(l2.getCanonicalPath());
                Log.w("SoLoader", M.toString(), e2);
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        com.facebook.soloader.a aVar = new com.facebook.soloader.a(context, file, "lib-main", i2);
        arrayList2.add(aVar);
        if (Log.isLoggable("SoLoader", 3)) {
            StringBuilder M2 = e.a.a.a.a.M("adding backup source from : ");
            M2.append(aVar.toString());
            Log.d("SoLoader", M2.toString());
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding backup sources from split apks");
            }
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                File file2 = new File(strArr[i3]);
                StringBuilder M3 = e.a.a.a.a.M("lib-");
                int i5 = i4 + 1;
                M3.append(i4);
                com.facebook.soloader.a aVar2 = new com.facebook.soloader.a(context, file2, M3.toString(), i2);
                if (Log.isLoggable("SoLoader", 3)) {
                    StringBuilder M4 = e.a.a.a.a.M("adding backup source: ");
                    M4.append(aVar2.toString());
                    Log.d("SoLoader", M4.toString());
                }
                arrayList2.add(aVar2);
                i3++;
                i4 = i5;
            }
        }
        f6696f = (q[]) arrayList2.toArray(new q[arrayList2.size()]);
        arrayList.addAll(0, arrayList2);
    }

    private static void b(ArrayList<o> arrayList, String[] strArr) {
        String str = SysUtil$MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = e.a.a.a.a.t(str, Constants.COLON_SEPARATOR, str2);
        }
        Iterator it2 = new HashSet(Arrays.asList(str.split(Constants.COLON_SEPARATOR))).iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding system library source: " + str3);
            }
            arrayList.add(new d(new File(str3), 2, strArr));
        }
    }

    private static void c(Context context, ArrayList<o> arrayList, int i2) {
        f6697g = new com.facebook.soloader.b(context, i2);
        if (Log.isLoggable("SoLoader", 3)) {
            StringBuilder M = e.a.a.a.a.M("adding application source: ");
            M.append(f6697g.toString());
            Log.d("SoLoader", M.toString());
        }
        arrayList.add(0, f6697g);
    }

    private static void d(Context context, ArrayList<o> arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding directApk sources from split apks");
            }
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                c cVar = new c(new File(str));
                if (Log.isLoggable("SoLoader", 3)) {
                    StringBuilder M = e.a.a.a.a.M("adding directApk source: ");
                    M.append(cVar.toString());
                    Log.d("SoLoader", M.toString());
                }
                arrayList.add(0, cVar);
            }
        }
        c cVar2 = new c(context);
        if (Log.isLoggable("SoLoader", 3)) {
            StringBuilder M2 = e.a.a.a.a.M("adding directApk source: ");
            M2.append(cVar2.toString());
            Log.d("SoLoader", M2.toString());
        }
        arrayList.add(0, cVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(java.lang.String r12, int r13, android.os.StrictMode.ThreadPolicy r14) throws java.lang.UnsatisfiedLinkError {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.e(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    private static int f(Context context, int i2) {
        int i3 = m;
        if (i3 != 0) {
            return i3;
        }
        if ((i2 & 32) == 0 && context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i4 = applicationInfo.flags;
            r0 = (i4 & 1) != 0 ? (i4 & 128) != 0 ? 3 : 2 : 1;
            if (Log.isLoggable("SoLoader", 3)) {
                StringBuilder M = e.a.a.a.a.M("ApplicationInfo.flags is: ");
                M.append(applicationInfo.flags);
                M.append(" appType is: ");
                M.append(r0);
                Log.d("SoLoader", M.toString());
            }
        }
        return r0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[Catch: all -> 0x000b, TryCatch #1 {, blocks: (B:41:0x0005, B:5:0x0010, B:9:0x0014, B:16:0x004f, B:19:0x007f, B:22:0x005a, B:24:0x0069, B:28:0x0077, B:29:0x0074, B:32:0x007a, B:36:0x0025, B:39:0x0040), top: B:40:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x000b, TryCatch #1 {, blocks: (B:41:0x0005, B:5:0x0010, B:9:0x0014, B:16:0x004f, B:19:0x007f, B:22:0x005a, B:24:0x0069, B:28:0x0077, B:29:0x0074, B:32:0x007a, B:36:0x0025, B:39:0x0040), top: B:40:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized void g(com.facebook.soloader.n r11) {
        /*
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            monitor-enter(r0)
            if (r11 != 0) goto Le
            com.facebook.soloader.n r1 = com.facebook.soloader.SoLoader.b     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Le
            monitor-exit(r0)
            return
        Lb:
            r11 = move-exception
            goto L8a
        Le:
            if (r11 == 0) goto L14
            com.facebook.soloader.SoLoader.b = r11     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        L14:
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> Lb
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb
            r2 = 27
            r3 = 1
            r4 = 0
            r6 = 0
            if (r1 <= r2) goto L25
        L23:
            r11 = r6
            goto L48
        L25:
            java.lang.Class<java.lang.Runtime> r1 = java.lang.Runtime.class
            java.lang.String r2 = "nativeLoad"
            r7 = 3
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb java.lang.SecurityException -> L3d java.lang.NoSuchMethodException -> L3f
            r7[r4] = r11     // Catch: java.lang.Throwable -> Lb java.lang.SecurityException -> L3d java.lang.NoSuchMethodException -> L3f
            java.lang.Class<java.lang.ClassLoader> r8 = java.lang.ClassLoader.class
            r7[r3] = r8     // Catch: java.lang.Throwable -> Lb java.lang.SecurityException -> L3d java.lang.NoSuchMethodException -> L3f
            r8 = 2
            r7[r8] = r11     // Catch: java.lang.Throwable -> Lb java.lang.SecurityException -> L3d java.lang.NoSuchMethodException -> L3f
            java.lang.reflect.Method r11 = r1.getDeclaredMethod(r2, r7)     // Catch: java.lang.Throwable -> Lb java.lang.SecurityException -> L3d java.lang.NoSuchMethodException -> L3f
            r11.setAccessible(r3)     // Catch: java.lang.Throwable -> Lb java.lang.SecurityException -> L3d java.lang.NoSuchMethodException -> L3f
            goto L48
        L3d:
            r11 = move-exception
            goto L40
        L3f:
            r11 = move-exception
        L40:
            java.lang.String r1 = "SoLoader"
            java.lang.String r2 = "Cannot get nativeLoad method"
            android.util.Log.w(r1, r2, r11)     // Catch: java.lang.Throwable -> Lb
            goto L23
        L48:
            if (r11 == 0) goto L4c
            r2 = r3
            goto L4d
        L4c:
            r2 = r4
        L4d:
            if (r2 == 0) goto L55
            java.lang.String r1 = com.facebook.soloader.SysUtil$Api14Utils.a()     // Catch: java.lang.Throwable -> Lb
            r3 = r1
            goto L56
        L55:
            r3 = r6
        L56:
            if (r3 != 0) goto L5a
            r4 = r6
            goto L7f
        L5a:
            java.lang.String r1 = ":"
            java.lang.String[] r6 = r3.split(r1)     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lb
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lb
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lb
        L67:
            if (r4 >= r8) goto L7a
            r9 = r6[r4]     // Catch: java.lang.Throwable -> Lb
            java.lang.String r10 = "!"
            boolean r10 = r9.contains(r10)     // Catch: java.lang.Throwable -> Lb
            if (r10 == 0) goto L74
            goto L77
        L74:
            r7.add(r9)     // Catch: java.lang.Throwable -> Lb
        L77:
            int r4 = r4 + 1
            goto L67
        L7a:
            java.lang.String r1 = android.text.TextUtils.join(r1, r7)     // Catch: java.lang.Throwable -> Lb
            r4 = r1
        L7f:
            com.facebook.soloader.SoLoader$a r7 = new com.facebook.soloader.SoLoader$a     // Catch: java.lang.Throwable -> Lb
            r1 = r7
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb
            com.facebook.soloader.SoLoader.b = r7     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        L8a:
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.g(com.facebook.soloader.n):void");
    }

    private static void h(Context context, int i2, String[] strArr) throws IOException {
        int i3;
        if (f6694d != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f6693c;
        reentrantReadWriteLock.writeLock().lock();
        if (f6694d != null) {
            reentrantReadWriteLock.writeLock().unlock();
            return;
        }
        try {
            l = i2;
            ArrayList arrayList = new ArrayList();
            b(arrayList, strArr);
            if (context != null) {
                if ((i2 & 1) != 0) {
                    f6696f = null;
                    if (Log.isLoggable("SoLoader", 3)) {
                        Log.d("SoLoader", "adding exo package source: lib-main");
                    }
                    arrayList.add(0, new i(context, "lib-main"));
                } else {
                    if ((i2 & 64) != 0) {
                        d(context, arrayList);
                    }
                    int i4 = m;
                    if (i4 != 1) {
                        if (i4 != 2 && i4 != 3) {
                            throw new RuntimeException("Unsupported app type, we should not reach here");
                        }
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    c(context, arrayList, i3);
                    a(context, arrayList, 1);
                }
            }
            o[] oVarArr = (o[]) arrayList.toArray(new o[arrayList.size()]);
            reentrantReadWriteLock.writeLock().lock();
            int i5 = (l & 2) != 0 ? 1 : 0;
            reentrantReadWriteLock.writeLock().unlock();
            int length = oVarArr.length;
            while (true) {
                int i6 = length - 1;
                if (length <= 0) {
                    break;
                }
                if (Log.isLoggable("SoLoader", 3)) {
                    Log.d("SoLoader", "Preparing SO source: " + oVarArr[i6]);
                }
                boolean z = a;
                if (z) {
                    Api18TraceUtils.a("SoLoader", BundleUtil.UNDERLINE_TAG, oVarArr[i6].getClass().getSimpleName());
                }
                oVarArr[i6].b(i5);
                if (z) {
                    Trace.endSection();
                }
                length = i6;
            }
            f6694d = oVarArr;
            f6695e.getAndIncrement();
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "init finish: " + f6694d.length + " SO sources prepared");
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            f6693c.writeLock().unlock();
        }
    }

    public static boolean i() {
        if (f6694d != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f6693c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z = f6694d != null;
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            f6693c.readLock().unlock();
            throw th;
        }
    }

    public static void init(Context context, int i2) throws IOException {
        String[] strArr = k;
        if (i()) {
            return;
        }
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            int f2 = f(context, i2);
            m = f2;
            if ((i2 & 128) == 0 && MinElf.g(context, f2)) {
                i2 |= 72;
            }
            g(null);
            h(context, i2, strArr);
            m mVar = new m();
            synchronized (com.facebook.soloader.r.a.class) {
                if (!com.facebook.soloader.r.a.b()) {
                    com.facebook.soloader.r.a.a(mVar);
                }
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(java.lang.String r10, int r11) throws java.lang.UnsatisfiedLinkError {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.j(java.lang.String, int):boolean");
    }

    static void k(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        l(str, null, null, i2, threadPolicy);
    }

    private static boolean l(String str, String str2, String str3, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        Object obj;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str2) && j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            HashSet<String> hashSet = h;
            if (!hashSet.contains(str)) {
                z = false;
            } else {
                if (str3 == null) {
                    return false;
                }
                z = true;
            }
            Map<String, Object> map = i;
            if (map.containsKey(str)) {
                obj = map.get(str);
            } else {
                Object obj2 = new Object();
                map.put(str, obj2);
                obj = obj2;
            }
            ReentrantReadWriteLock reentrantReadWriteLock = f6693c;
            reentrantReadWriteLock.readLock().lock();
            try {
                synchronized (obj) {
                    if (!z) {
                        synchronized (SoLoader.class) {
                            if (hashSet.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z = true;
                            }
                            if (!z) {
                                try {
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        Log.d("SoLoader", "About to load: " + str);
                                    }
                                    e(str, i2, threadPolicy);
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        Log.d("SoLoader", "Loaded: " + str);
                                    }
                                    synchronized (SoLoader.class) {
                                        hashSet.add(str);
                                    }
                                } catch (UnsatisfiedLinkError e2) {
                                    String message = e2.getMessage();
                                    if (message == null || !message.contains("unexpected e_machine:")) {
                                        throw e2;
                                    }
                                    throw new b(e2, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                }
                            }
                        }
                    }
                    if ((i2 & 16) == 0) {
                        if (!TextUtils.isEmpty(str2) && j.contains(str2)) {
                            z2 = true;
                        }
                        if (str3 != null && !z2) {
                            if (a) {
                                Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                            }
                            try {
                                try {
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        Log.d("SoLoader", "About to merge: " + str2 + " / " + str);
                                    }
                                    MinElf.f(str2);
                                    throw null;
                                } catch (UnsatisfiedLinkError e3) {
                                    throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e3);
                                }
                            } catch (Throwable th) {
                                if (a) {
                                    Trace.endSection();
                                }
                                throw th;
                            }
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return !z;
                }
            } catch (Throwable th2) {
                f6693c.readLock().unlock();
                throw th2;
            }
        }
    }
}
