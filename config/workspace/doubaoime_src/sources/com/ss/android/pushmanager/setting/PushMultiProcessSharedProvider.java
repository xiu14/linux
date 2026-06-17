package com.ss.android.pushmanager.setting;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.push.g0.f;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class PushMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: e, reason: collision with root package name */
    public static String f8364e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Uri f8365f = null;

    /* renamed from: g, reason: collision with root package name */
    private static UriMatcher f8366g = null;
    public static boolean h = false;

    @SuppressLint({"CI_StaticFieldLeak"})
    private static b i;
    private SharedPreferences a;
    private Map<String, Object> b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f8367c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Object f8368d = new Object();

    public static class a {
        Context a;
        private ContentValues b = new ContentValues();

        /* renamed from: c, reason: collision with root package name */
        private SharedPreferences f8369c;

        a(Context context, com.ss.android.pushmanager.setting.b bVar) {
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            this.f8369c = applicationContext.getApplicationContext().getSharedPreferences("push_multi_process_config", 4);
        }

        public synchronized void a() {
            if (PushMultiProcessSharedProvider.a(this.a)) {
                try {
                    this.a.getContentResolver().insert(PushMultiProcessSharedProvider.c(this.a, "key", "type"), this.b);
                } catch (Throwable unused) {
                }
            } else {
                SharedPreferences.Editor edit = this.f8369c.edit();
                Set<String> keySet = this.b.keySet();
                if (keySet != null) {
                    Object[] array = keySet.toArray();
                    if (array == null) {
                        return;
                    }
                    for (Object obj : array) {
                        String str = (String) obj;
                        Object obj2 = this.b.get(str);
                        if (obj2 instanceof String) {
                            edit.putString(str, (String) obj2);
                        } else if (obj2 instanceof Long) {
                            edit.putLong(str, ((Long) obj2).longValue());
                        } else if (obj2 instanceof Boolean) {
                            edit.putBoolean(str, ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof Integer) {
                            edit.putInt(str, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Float) {
                            edit.putFloat(str, ((Float) obj2).floatValue());
                        }
                    }
                    edit.apply();
                }
            }
        }

        public a b(String str, String str2) {
            this.b.put(str, str2);
            return this;
        }
    }

    public static class b {
        private Context a;
        private SharedPreferences b;

        b(Context context, com.ss.android.pushmanager.setting.b bVar) {
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            this.b = applicationContext.getApplicationContext().getSharedPreferences("push_multi_process_config", 4);
            if (f.d()) {
                f.c("PushService", "MultiProcessShared create");
            }
        }

        public a a() {
            return new a(this.a, null);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:9|10|(5:12|14|15|16|17)|21|14|15|16|17) */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String b(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                boolean r0 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.h     // Catch: java.lang.Throwable -> L3f
                if (r0 != 0) goto L38
                android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L3f
                boolean r0 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(r0)     // Catch: java.lang.Throwable -> L3f
                if (r0 != 0) goto Ld
                goto L38
            Ld:
                android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L3f
                android.content.ContentResolver r1 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L3f
                android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L3f
                java.lang.String r2 = "string"
                android.net.Uri r2 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.c(r0, r8, r2)     // Catch: java.lang.Throwable -> L3f
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3f
                if (r8 != 0) goto L26
                goto L37
            L26:
                boolean r0 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L32
                if (r0 == 0) goto L32
                r0 = 0
                java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Throwable -> L32
                goto L33
            L32:
                r0 = r9
            L33:
                r8.close()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L3f
            L36:
                r9 = r0
            L37:
                return r9
            L38:
                android.content.SharedPreferences r0 = r7.b     // Catch: java.lang.Throwable -> L3f
                java.lang.String r8 = r0.getString(r8, r9)     // Catch: java.lang.Throwable -> L3f
                return r8
            L3f:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.b.b(java.lang.String, java.lang.String):java.lang.String");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        
            if (r0.getInt(0) > 0) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean c() {
            /*
                r10 = this;
                boolean r0 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.h
                r1 = 1
                if (r0 != 0) goto L51
                android.content.Context r0 = r10.a
                boolean r0 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(r0)
                if (r0 != 0) goto Le
                goto L51
            Le:
                java.lang.String r0 = "current_app_foreground"
                r2 = 0
                boolean r3 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.h     // Catch: java.lang.Throwable -> L50
                if (r3 != 0) goto L4a
                android.content.Context r3 = r10.a     // Catch: java.lang.Throwable -> L50
                boolean r3 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(r3)     // Catch: java.lang.Throwable -> L50
                if (r3 != 0) goto L1e
                goto L4a
            L1e:
                android.content.Context r3 = r10.a     // Catch: java.lang.Throwable -> L50
                android.content.ContentResolver r4 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L50
                android.content.Context r3 = r10.a     // Catch: java.lang.Throwable -> L50
                java.lang.String r5 = "boolean"
                android.net.Uri r5 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.c(r3, r0, r5)     // Catch: java.lang.Throwable -> L50
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L50
                if (r0 != 0) goto L37
                goto L50
            L37:
                boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L44
                if (r3 == 0) goto L44
                int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L44
                if (r3 <= 0) goto L44
                goto L45
            L44:
                r1 = r2
            L45:
                r0.close()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L50
            L48:
                r2 = r1
                goto L50
            L4a:
                android.content.SharedPreferences r1 = r10.b     // Catch: java.lang.Throwable -> L50
                boolean r2 = r1.getBoolean(r0, r2)     // Catch: java.lang.Throwable -> L50
            L50:
                return r2
            L51:
                com.bytedance.common.push.b r0 = com.bytedance.common.push.b.e()
                boolean r0 = r0.j()
                r0 = r0 ^ r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.b.c():boolean");
        }
    }

    public static boolean a(Context context) {
        boolean z = com.ss.android.message.f.a.z(context);
        f.c("PushMultiProcessSP", "mAllowStartOthersProcess  is false isSmpProcess is " + z);
        if (!z) {
            return true;
        }
        Boolean u = com.ss.android.message.f.a.u(context);
        f.c("PushMultiProcessSP", "isMainProcessStartEd is " + u);
        return u != null && u.booleanValue();
    }

    private void b() {
        if (this.f8367c) {
            return;
        }
        synchronized (this.f8368d) {
            if (!this.f8367c) {
                SharedPreferences d2 = d();
                if (d2 != null) {
                    for (Map.Entry<String, ?> entry : d2.getAll().entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (key != null && value != null) {
                            this.b.put(key, value);
                        }
                    }
                }
                this.f8367c = true;
            }
        }
    }

    public static final synchronized Uri c(Context context, String str, String str2) {
        Uri build;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (f8365f == null) {
                try {
                    if (f.d()) {
                        f.c("MultiProcessSharedProvider", "init form getContentUri");
                    }
                    f(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
            build = f8365f.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    private synchronized SharedPreferences d() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = getContext().getApplicationContext().getSharedPreferences("push_multi_process_config", 4);
        this.a = sharedPreferences2;
        return sharedPreferences2;
    }

    public static synchronized b e(Context context) {
        b bVar;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (i == null) {
                i = new b(context, null);
            }
            bVar = i;
        }
        return bVar;
    }

    private static void f(Context context) throws IllegalStateException {
        String str;
        if (TextUtils.isEmpty(f8364e)) {
            String name = PushMultiProcessSharedProvider.class.getName();
            f.c("MultiProcessSharedProvider", "getProviderAuthority:" + name);
            if (context == null || com.bytedance.android.input.k.b.a.Y(name)) {
                str = null;
            } else {
                try {
                    for (ProviderInfo providerInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers) {
                        if (name.equals(providerInfo.name)) {
                            str = providerInfo.authority;
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
                str = e.a.a.a.a.c(context, new StringBuilder(), ".push.SHARE_PROVIDER_AUTHORITY");
            }
            f8364e = str;
        }
        if (TextUtils.isEmpty(f8364e)) {
            throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
        }
        if (f.d()) {
            f.c("MultiProcessSharedProvider", f8364e);
        }
        UriMatcher uriMatcher = new UriMatcher(-1);
        f8366g = uriMatcher;
        uriMatcher.addURI(f8364e, "*/*", 65536);
        f8365f = Uri.parse("content://" + f8364e);
    }

    private static boolean g() {
        return TextUtils.isEmpty(f8364e) || f8366g == null;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f8364e = providerInfo.authority;
        }
        h = true;
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        StringBuilder M = e.a.a.a.a.M("delete:");
        M.append(uri.toString());
        M.append(" ");
        M.append(str);
        f.c("MultiProcessSharedProvider", M.toString());
        h = true;
        b();
        if (g() || f8366g.match(uri) == 65536) {
            return 0;
        }
        throw new IllegalArgumentException(e.a.a.a.a.o("Unsupported uri ", uri));
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        StringBuilder M = e.a.a.a.a.M("getType:");
        M.append(uri.toString());
        f.c("MultiProcessSharedProvider", M.toString());
        h = true;
        b();
        return e.a.a.a.a.J(e.a.a.a.a.M("vnd.android.cursor.item/vnd."), f8364e, ".item");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003c A[SYNTHETIC] */
    @Override // android.content.ContentProvider
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.net.Uri insert(android.net.Uri r11, android.content.ContentValues r12) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        h = true;
        Context context = getContext();
        if (context != null) {
            com.ss.android.message.a.b((Application) context.getApplicationContext());
        }
        if (f8366g != null) {
            return true;
        }
        try {
            if (f.d()) {
                f.c("MultiProcessSharedProvider", "init form onCreate");
            }
            f(context);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Object obj;
        MatrixCursor matrixCursor;
        StringBuilder M = e.a.a.a.a.M("query:");
        M.append(uri.toString());
        f.c("MultiProcessSharedProvider", M.toString());
        int i2 = 1;
        h = true;
        b();
        MatrixCursor matrixCursor2 = null;
        if (g()) {
            return null;
        }
        if (f8366g.match(uri) != 65536) {
            throw new IllegalArgumentException(e.a.a.a.a.o("Unsupported uri ", uri));
        }
        try {
            if ("all".equals(uri.getPathSegments().get(1))) {
                Map<String, ?> all = d().getAll();
                matrixCursor = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                try {
                    Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        matrixCursor2 = hasNext;
                        if (hasNext != 0) {
                            Map.Entry<String, ?> next = it2.next();
                            String key = next.getKey();
                            Object value = next.getValue();
                            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
                            boolean z = value instanceof String;
                            String str3 = TypedValues.Custom.S_STRING;
                            if (!z) {
                                if (value instanceof Boolean) {
                                    str3 = TypedValues.Custom.S_BOOLEAN;
                                    value = Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0);
                                } else if (value instanceof Integer) {
                                    str3 = TypedValues.Custom.S_INT;
                                } else if (value instanceof Long) {
                                    str3 = "long";
                                } else if (value instanceof Float) {
                                    str3 = TypedValues.Custom.S_FLOAT;
                                }
                            }
                            newRow.add(key);
                            newRow.add(value);
                            newRow.add(str3);
                        }
                    }
                } catch (Exception unused) {
                    matrixCursor2 = matrixCursor;
                    return matrixCursor2;
                }
            } else {
                String str4 = uri.getPathSegments().get(0);
                boolean G = com.bytedance.android.input.k.b.a.G(str4, "current_app_state");
                boolean G2 = com.bytedance.android.input.k.b.a.G(str4, "current_app_foreground");
                if (!this.b.containsKey(str4) && !G && !G2) {
                    return null;
                }
                MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                try {
                    if (G) {
                        obj = Boolean.valueOf(com.bytedance.common.push.b.e().i());
                    } else if (G2) {
                        obj = Boolean.valueOf(!com.bytedance.common.push.b.e().j());
                    } else {
                        obj = this.b.get(str4);
                    }
                    MatrixCursor.RowBuilder newRow2 = matrixCursor3.newRow();
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i2 = 0;
                        }
                        obj = Integer.valueOf(i2);
                    }
                    if (f.d()) {
                        f.c("PushService", "MultiProcessShareProvider reallly get key = " + str4 + " value = " + obj.toString());
                    }
                    newRow2.add(obj);
                    matrixCursor = matrixCursor3;
                    matrixCursor2 = newRow2;
                } catch (Exception unused2) {
                    matrixCursor2 = matrixCursor3;
                    return matrixCursor2;
                }
            }
            return matrixCursor;
        } catch (Exception unused3) {
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        h = true;
        throw new UnsupportedOperationException();
    }
}
