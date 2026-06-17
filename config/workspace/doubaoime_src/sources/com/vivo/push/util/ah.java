package com.vivo.push.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.vivo.push.PushClient;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ah {
    private static String[] b;
    private static String[] a = {"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};

    /* renamed from: c, reason: collision with root package name */
    private static String[] f8904c = {"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};

    /* renamed from: d, reason: collision with root package name */
    private static String[] f8905d = {"com.vivo.push.sdk.RegistrationReceiver"};

    /* renamed from: e, reason: collision with root package name */
    private static String[] f8906e = new String[0];

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, Bundle> f8907f = new ConcurrentHashMap();

    public static long a(Context context) {
        String a2 = aa.a(context);
        if (!TextUtils.isEmpty(a2)) {
            return a(context, a2);
        }
        t.a("Utility", "systemPushPkgName is null");
        return -1L;
    }

    public static String b(Context context, String str) {
        Object a2 = a(context, str, "verification_status");
        return a2 != null ? a2.toString() : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if (r1 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if (r1 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[Catch: Exception -> 0x009e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x009e, blocks: (B:53:0x0084, B:31:0x0089, B:28:0x0098), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[Catch: Exception -> 0x00ab, TRY_LEAVE, TryCatch #3 {Exception -> 0x00ab, blocks: (B:43:0x00a3, B:38:0x00a8), top: B:42:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.PublicKey c(android.content.Context r11) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
            android.net.Uri r8 = com.vivo.push.x.a     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
            android.content.ContentProviderClient r1 = r1.acquireUnstableContentProviderClient(r8)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
            java.lang.String r9 = "Utility"
            if (r1 == 0) goto L27
            java.lang.String r2 = "client is null"
            com.vivo.push.util.t.a(r9, r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r1
            r3 = r8
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r10 = r2
            goto L28
        L20:
            r11 = move-exception
            goto La1
        L23:
            r11 = move-exception
            r10 = r0
            goto L93
        L27:
            r10 = r0
        L28:
            if (r10 != 0) goto L3b
            android.content.ContentResolver r2 = r11.getContentResolver()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r8
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            r10 = r11
            goto L3b
        L39:
            r11 = move-exception
            goto L93
        L3b:
            if (r10 != 0) goto L48
            if (r10 == 0) goto L42
            r10.close()     // Catch: java.lang.Exception -> L47
        L42:
            if (r1 == 0) goto L47
            r1.close()     // Catch: java.lang.Exception -> L47
        L47:
            return r0
        L48:
            boolean r11 = r10.moveToNext()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            if (r11 == 0) goto L84
            java.lang.String r11 = "pushkey"
            java.lang.String r2 = "name"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            boolean r11 = r11.equals(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            if (r11 == 0) goto L48
            java.lang.String r11 = "value"
            int r11 = r10.getColumnIndex(r11)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            java.lang.String r11 = r10.getString(r11)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            java.lang.String r2 = "result key : "
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            com.vivo.push.util.t.d(r9, r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            java.security.PublicKey r11 = com.vivo.push.util.ab.a(r11)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L9f
            r10.close()     // Catch: java.lang.Exception -> L83
            if (r1 == 0) goto L83
            r1.close()     // Catch: java.lang.Exception -> L83
        L83:
            return r11
        L84:
            r10.close()     // Catch: java.lang.Exception -> L9e
            if (r1 == 0) goto L9e
        L89:
            r1.close()     // Catch: java.lang.Exception -> L9e
            goto L9e
        L8d:
            r11 = move-exception
            r1 = r0
            goto La1
        L90:
            r11 = move-exception
            r1 = r0
            r10 = r1
        L93:
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L9f
            if (r10 == 0) goto L9b
            r10.close()     // Catch: java.lang.Exception -> L9e
        L9b:
            if (r1 == 0) goto L9e
            goto L89
        L9e:
            return r0
        L9f:
            r11 = move-exception
            r0 = r10
        La1:
            if (r0 == 0) goto La6
            r0.close()     // Catch: java.lang.Exception -> Lab
        La6:
            if (r1 == 0) goto Lab
            r1.close()     // Catch: java.lang.Exception -> Lab
        Lab:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.c(android.content.Context):java.security.PublicKey");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: Exception -> 0x00dd, TRY_ENTER, TryCatch #2 {Exception -> 0x00dd, blocks: (B:39:0x00bf, B:41:0x00c4, B:46:0x00d9, B:48:0x00e1), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1 A[Catch: Exception -> 0x00dd, TRY_LEAVE, TryCatch #2 {Exception -> 0x00dd, blocks: (B:39:0x00bf, B:41:0x00c4, B:46:0x00d9, B:48:0x00e1), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5 A[Catch: Exception -> 0x00f1, TRY_LEAVE, TryCatch #9 {Exception -> 0x00f1, blocks: (B:68:0x00ed, B:59:0x00f5), top: B:67:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.d(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r15) throws com.vivo.push.util.VivoPushException {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.b(android.content.Context):void");
    }

    public static long a(Context context, String str) {
        Object a2 = a(context, str, "com.vivo.push.sdk_version");
        if (a2 == null) {
            a2 = a(context, str, "sdk_version");
        }
        if (a2 != null) {
            try {
                return Long.parseLong(a2.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
                t.a("Utility", "getSdkVersionCode error ", e2);
                return -1L;
            }
        }
        t.a("Utility", "getSdkVersionCode sdk version is null");
        return -1L;
    }

    public static Object a(Context context, String str, String str2) {
        Bundle bundle;
        if (context == null || str2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Map<String, Bundle> map = f8907f;
            Object obj = (map == null || map.size() <= 0 || (bundle = f8907f.get(str)) == null) ? null : bundle.get(str2);
            if (obj != null) {
                return obj;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                r0 = applicationInfo != null ? applicationInfo.metaData : null;
                Object obj2 = r0 != null ? r0.get(str2) : obj;
                try {
                    if (f8907f.size() > 300) {
                        return obj2;
                    }
                    f8907f.put(str, r0);
                    return obj2;
                } catch (Exception e2) {
                    r0 = obj2;
                    e = e2;
                    t.a("Utility", "getMetaValue::".concat(String.valueOf(e)));
                    return r0;
                }
            } catch (Exception e3) {
                e = e3;
                r0 = obj;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static int c(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            int a2 = (int) a(context, str);
            return a2 <= 0 ? d(context, str) : a2;
        }
        t.a("Utility", "getClientSdkVersionCode() error, context is null or pkgName is empty");
        return 0;
    }

    public static Object a(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    private static void a(String str, ComponentInfo[] componentInfoArr, String str2) throws VivoPushException {
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (str.equals(componentInfo.name)) {
                if (componentInfo.enabled) {
                    a(componentInfo, str2);
                    return;
                }
                throw new VivoPushException(e.a.a.a.a.J(new StringBuilder(), componentInfo.name, " module Push-SDK need is illegitmacy !"));
            }
        }
        throw new VivoPushException(e.a.a.a.a.s(str, " module Push-SDK need is not exist"));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int d(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "Utility"
            r1 = 0
            if (r3 == 0) goto L46
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto Lc
            goto L46
        Lc:
            java.lang.String r2 = "sdk_version_vivo"
            java.lang.Object r3 = a(r3, r4, r2)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L1b
            java.lang.String r3 = (java.lang.String) r3
        L18:
            r4 = r3
            r3 = r1
            goto L2f
        L1b:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L28
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r4 = ""
            goto L2f
        L28:
            if (r3 == 0) goto L45
            java.lang.String r3 = r3.toString()
            goto L18
        L2f:
            if (r3 <= 0) goto L32
            return r3
        L32:
            int r1 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L37
            goto L45
        L37:
            r3 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "getClientSdkVersion: "
            java.lang.String r3 = r4.concat(r3)
            com.vivo.push.util.t.a(r0, r3)
        L45:
            return r1
        L46:
            java.lang.String r3 = "getClientSdkVersion() error, context is null or pkgName is empty"
            com.vivo.push.util.t.a(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.d(android.content.Context, java.lang.String):int");
    }

    private static void a(ComponentInfo componentInfo, String str) throws VivoPushException {
        if (componentInfo.applicationInfo.packageName.equals(str)) {
            return;
        }
        for (String str2 : a) {
            if (str2.equals(componentInfo.name) && !componentInfo.processName.contains(":pushservice")) {
                StringBuilder sb = new StringBuilder("module : ");
                sb.append(componentInfo.name);
                sb.append(" process :");
                throw new VivoPushException(e.a.a.a.a.J(sb, componentInfo.processName, "  check process fail"));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7 A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #5 {Exception -> 0x00c3, blocks: (B:64:0x00bf, B:55:0x00c7), top: B:63:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r15, java.lang.String r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.a(android.content.Context, java.lang.String, java.lang.String, long):boolean");
    }

    public static boolean a(Context context, String str, boolean z) {
        Cursor a2;
        Cursor cursor = null;
        try {
            try {
                try {
                    Uri uri = com.vivo.push.x.f8938e;
                    String[] strArr = new String[2];
                    strArr[0] = str;
                    strArr[1] = z ? PushClient.DEFAULT_REQUEST_ID : "0";
                    a2 = a(uri, "appPkgName = ? and agreePrivacyStatement = ? ", strArr, context);
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            cursor.close();
                        } catch (Exception e2) {
                            t.a("Utility", "close", e2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                t.a("Utility", "syncAgreePrivacyStatement", e3);
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (Exception e4) {
            t.a("Utility", "close", e4);
        }
        if (a2 == null) {
            t.a("Utility", "cursor is null");
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception e5) {
                    t.a("Utility", "close", e5);
                }
            }
            return false;
        }
        if (a2.moveToFirst()) {
            boolean parseBoolean = Boolean.parseBoolean(a2.getString(a2.getColumnIndex("agreePrivacyStatement")));
            try {
                a2.close();
            } catch (Exception e6) {
                t.a("Utility", "close", e6);
            }
            return parseBoolean;
        }
        a2.close();
        return false;
    }

    public static String b(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(null, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.database.Cursor a(android.net.Uri r11, java.lang.String r12, java.lang.String[] r13, android.content.Context r14) {
        /*
            java.lang.String r0 = "close"
            r1 = 0
            java.lang.String r2 = "Utility"
            if (r14 != 0) goto L13
            java.lang.String r11 = "context is null"
            com.vivo.push.util.t.a(r2, r11)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L10
            return r1
        Ld:
            r11 = move-exception
            goto L6f
        L10:
            r11 = move-exception
            r3 = r1
            goto L5d
        L13:
            android.content.ContentResolver r3 = r14.getContentResolver()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L10
            android.content.ContentProviderClient r3 = r3.acquireUnstableContentProviderClient(r11)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L10
            if (r3 == 0) goto L2d
            java.lang.String r4 = "client is null"
            com.vivo.push.util.t.a(r2, r4)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L6d
            r6 = 0
            r9 = 0
            r4 = r3
            r5 = r11
            r7 = r12
            r8 = r13
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L6d
            goto L2e
        L2d:
            r4 = r1
        L2e:
            if (r4 != 0) goto L40
            android.content.ContentResolver r5 = r14.getContentResolver()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L6d
            r7 = 0
            r10 = 0
            r6 = r11
            r8 = r12
            r9 = r13
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L6d
            goto L40
        L3e:
            r11 = move-exception
            goto L5d
        L40:
            if (r4 != 0) goto L52
            java.lang.String r11 = "cursor is null"
            com.vivo.push.util.t.a(r2, r11)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L6d
            if (r3 == 0) goto L51
            r3.close()     // Catch: java.lang.Exception -> L4d
            goto L51
        L4d:
            r11 = move-exception
            com.vivo.push.util.t.a(r2, r0, r11)
        L51:
            return r1
        L52:
            if (r3 == 0) goto L5c
            r3.close()     // Catch: java.lang.Exception -> L58
            goto L5c
        L58:
            r11 = move-exception
            com.vivo.push.util.t.a(r2, r0, r11)
        L5c:
            return r4
        L5d:
            java.lang.String r12 = "queryContentResolver"
            com.vivo.push.util.t.a(r2, r12, r11)     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L6c
            r3.close()     // Catch: java.lang.Exception -> L68
            goto L6c
        L68:
            r11 = move-exception
            com.vivo.push.util.t.a(r2, r0, r11)
        L6c:
            return r1
        L6d:
            r11 = move-exception
            r1 = r3
        L6f:
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.lang.Exception -> L75
            goto L79
        L75:
            r12 = move-exception
            com.vivo.push.util.t.a(r2, r0, r12)
        L79:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.a(android.net.Uri, java.lang.String, java.lang.String[], android.content.Context):android.database.Cursor");
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.size() <= 0;
    }
}
