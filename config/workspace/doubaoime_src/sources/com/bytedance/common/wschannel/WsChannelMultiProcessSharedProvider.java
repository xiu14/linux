package com.bytedance.common.wschannel;

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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.j;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class WsChannelMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static String f4183d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Uri f4184e = null;

    /* renamed from: f, reason: collision with root package name */
    private static UriMatcher f4185f = null;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f4186g = false;
    private static volatile boolean h = false;
    private static b i;
    private SharedPreferences a;
    private Map<String, Object> b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f4187c = new Object();

    public static class a {
        Context a;
        private ContentValues b = new ContentValues();

        a(Context context, g gVar) {
            this.a = context.getApplicationContext();
        }

        public synchronized void a() {
            synchronized (this) {
                try {
                    this.a.getContentResolver().insert(WsChannelMultiProcessSharedProvider.b(this.a, "key", "type"), this.b);
                } catch (Throwable unused) {
                }
            }
        }

        public a b(String str, boolean z) {
            this.b.put(str, Boolean.valueOf(z));
            return this;
        }

        public a c(String str, String str2) {
            this.b.put(str, str2);
            return this;
        }
    }

    public static class b {
        private Context a;
        private boolean b;

        /* renamed from: c, reason: collision with root package name */
        private SharedPreferences f4188c;

        b(Context context, g gVar) {
            boolean z = false;
            this.b = false;
            if (com.bytedance.common.wschannel.o.a.c(context) && WsChannelMultiProcessSharedProvider.f4186g) {
                z = true;
            }
            this.b = z;
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            this.f4188c = applicationContext.getApplicationContext().getSharedPreferences("wschannel_multi_process_config", 4);
            if (Logger.debug()) {
                Logger.v("PushService", "MultiProcessShared create");
            }
        }

        public a a() {
            return new a(this.a, null);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:9|10|(6:12|(1:14)|15|16|17|18)|22|15|16|17|18) */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(java.lang.String r8, boolean r9) {
            /*
                r7 = this;
                boolean r0 = r7.b     // Catch: java.lang.Throwable -> L38
                if (r0 == 0) goto Lb
                android.content.SharedPreferences r0 = r7.f4188c     // Catch: java.lang.Throwable -> L38
                boolean r8 = r0.getBoolean(r8, r9)     // Catch: java.lang.Throwable -> L38
                return r8
            Lb:
                android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L38
                android.content.ContentResolver r1 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L38
                android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L38
                java.lang.String r2 = "boolean"
                android.net.Uri r2 = com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.b(r0, r8, r2)     // Catch: java.lang.Throwable -> L38
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L38
                if (r8 != 0) goto L24
                goto L38
            L24:
                boolean r0 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L33
                if (r0 == 0) goto L33
                r0 = 0
                int r1 = r8.getInt(r0)     // Catch: java.lang.Throwable -> L33
                if (r1 <= 0) goto L34
                r0 = 1
                goto L34
            L33:
                r0 = r9
            L34:
                r8.close()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L38
            L37:
                r9 = r0
            L38:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.b.b(java.lang.String, boolean):boolean");
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:9|10|(5:12|14|15|16|17)|20|14|15|16|17) */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long c(java.lang.String r8, long r9) {
            /*
                r7 = this;
                boolean r0 = r7.b     // Catch: java.lang.Throwable -> L35
                if (r0 == 0) goto Lb
                android.content.SharedPreferences r0 = r7.f4188c     // Catch: java.lang.Throwable -> L35
                long r8 = r0.getLong(r8, r9)     // Catch: java.lang.Throwable -> L35
                return r8
            Lb:
                android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L35
                android.content.ContentResolver r1 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L35
                android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L35
                java.lang.String r2 = "long"
                android.net.Uri r2 = com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.b(r0, r8, r2)     // Catch: java.lang.Throwable -> L35
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L35
                if (r8 != 0) goto L24
                goto L35
            L24:
                boolean r0 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L30
                r0 = 0
                long r0 = r8.getLong(r0)     // Catch: java.lang.Throwable -> L30
                goto L31
            L30:
                r0 = r9
            L31:
                r8.close()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L35
            L34:
                r9 = r0
            L35:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.b.c(java.lang.String, long):long");
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:9|10|(5:12|14|15|16|17)|20|14|15|16|17) */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String d(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                boolean r0 = r7.b     // Catch: java.lang.Throwable -> L35
                if (r0 == 0) goto Lb
                android.content.SharedPreferences r0 = r7.f4188c     // Catch: java.lang.Throwable -> L35
                java.lang.String r8 = r0.getString(r8, r9)     // Catch: java.lang.Throwable -> L35
                return r8
            Lb:
                android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L35
                android.content.ContentResolver r1 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L35
                android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L35
                java.lang.String r2 = "string"
                android.net.Uri r2 = com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.b(r0, r8, r2)     // Catch: java.lang.Throwable -> L35
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L35
                if (r8 != 0) goto L24
                goto L35
            L24:
                boolean r0 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L30
                r0 = 0
                java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Throwable -> L30
                goto L31
            L30:
                r0 = r9
            L31:
                r8.close()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L35
            L34:
                r9 = r0
            L35:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.b.d(java.lang.String, java.lang.String):java.lang.String");
        }
    }

    public static final synchronized Uri b(Context context, String str, String str2) {
        Uri build;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            if (f4184e == null) {
                try {
                    if (Logger.debug()) {
                        Logger.d("MultiProcessSharedProvider", "init form getContentUri");
                    }
                    e(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
            build = f4184e.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    private synchronized SharedPreferences c() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = getContext().getApplicationContext().getSharedPreferences("wschannel_multi_process_config", 4);
        this.a = sharedPreferences2;
        return sharedPreferences2;
    }

    public static synchronized b d(Context context) {
        b bVar;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            if (i == null) {
                i = new b(context, null);
            }
            bVar = i;
        }
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r1 = r4.authority;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(android.content.Context r6) throws java.lang.IllegalStateException {
        /*
            java.lang.String r0 = com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.f4183d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3e
            java.lang.Class<com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider> r0 = com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.class
            java.lang.String r0 = r0.getName()
            r1 = 0
            if (r6 == 0) goto L3c
            boolean r2 = com.bytedance.android.input.k.b.a.Y(r0)
            if (r2 == 0) goto L18
            goto L3c
        L18:
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: java.lang.Exception -> L3c
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Exception -> L3c
            r3 = 8
            android.content.pm.PackageInfo r6 = r2.getPackageInfo(r6, r3)     // Catch: java.lang.Exception -> L3c
            android.content.pm.ProviderInfo[] r6 = r6.providers     // Catch: java.lang.Exception -> L3c
            int r2 = r6.length     // Catch: java.lang.Exception -> L3c
            r3 = 0
        L2a:
            if (r3 >= r2) goto L3c
            r4 = r6[r3]     // Catch: java.lang.Exception -> L3c
            java.lang.String r5 = r4.name     // Catch: java.lang.Exception -> L3c
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Exception -> L3c
            if (r5 == 0) goto L39
            java.lang.String r1 = r4.authority     // Catch: java.lang.Exception -> L3c
            goto L3c
        L39:
            int r3 = r3 + 1
            goto L2a
        L3c:
            com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.f4183d = r1
        L3e:
            java.lang.String r6 = com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.f4183d
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L7e
            boolean r6 = com.bytedance.common.utility.Logger.debug()
            if (r6 == 0) goto L53
            java.lang.String r6 = com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.f4183d
            java.lang.String r0 = "MultiProcessSharedProvider"
            com.bytedance.common.utility.Logger.v(r0, r6)
        L53:
            android.content.UriMatcher r6 = new android.content.UriMatcher
            r0 = -1
            r6.<init>(r0)
            com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.f4185f = r6
            java.lang.String r0 = com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.f4183d
            r1 = 65536(0x10000, float:9.18355E-41)
        */
        //  java.lang.String r2 = "*/*"
        /*
            r6.addURI(r0, r2, r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "content://"
            r6.append(r0)
            java.lang.String r0 = com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.f4183d
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.f4184e = r6
            return
        L7e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must Set MultiProcessSharedProvider Authority"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.e(android.content.Context):void");
    }

    private void f() {
        if (h) {
            return;
        }
        synchronized (this.f4187c) {
            if (!h) {
                SharedPreferences c2 = c();
                if (c2 == null) {
                    h = true;
                    return;
                }
                for (Map.Entry<String, ?> entry : c2.getAll().entrySet()) {
                    this.b.put(entry.getKey(), entry.getValue());
                }
                h = true;
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f4183d = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        if (f4185f.match(uri) != 65536) {
            throw new IllegalArgumentException(e.a.a.a.a.o("Unsupported uri ", uri));
        }
        try {
            c().edit().clear().commit();
            this.b.clear();
            getContext().getContentResolver().notifyChange(b(getContext(), "key", "type"), null);
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return e.a.a.a.a.J(e.a.a.a.a.M("vnd.android.cursor.item/vnd."), f4183d, ".item");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x001c A[SYNTHETIC] */
    @Override // android.content.ContentProvider
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.net.Uri insert(android.net.Uri r11, android.content.ContentValues r12) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (com.bytedance.common.wschannel.o.a.c(getContext())) {
            f4186g = true;
        }
        Context context = getContext();
        int i2 = j.f4260d;
        Application application = (Application) context.getApplicationContext();
        c cVar = new c();
        cVar.d(new j.a(application));
        application.registerActivityLifecycleCallbacks(cVar);
        if (f4185f == null) {
            try {
                if (Logger.debug()) {
                    Logger.v("MultiProcessSharedProvider", "init form onCreate");
                }
                e(getContext());
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        ?? equals;
        MatrixCursor matrixCursor;
        if (f4185f.match(uri) != 65536) {
            throw new IllegalArgumentException(e.a.a.a.a.o("Unsupported uri ", uri));
        }
        Cursor cursor = null;
        try {
            i2 = 1;
            equals = "all".equals(uri.getPathSegments().get(1));
        } catch (Exception unused) {
        }
        try {
            if (equals != 0) {
                Map<String, ?> all = c().getAll();
                matrixCursor = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                while (true) {
                    ?? hasNext = it2.hasNext();
                    cursor = hasNext;
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
            } else {
                String str4 = uri.getPathSegments().get(0);
                f();
                if (!this.b.containsKey(str4)) {
                    return null;
                }
                matrixCursor = new MatrixCursor(new String[]{str4});
                ?? r6 = this.b.get(str4);
                MatrixCursor.RowBuilder newRow2 = matrixCursor.newRow();
                boolean z2 = r6 instanceof Boolean;
                Cursor cursor2 = r6;
                if (z2) {
                    if (!((Boolean) r6).booleanValue()) {
                        i2 = 0;
                    }
                    cursor2 = Integer.valueOf(i2);
                }
                if (Logger.debug()) {
                    Logger.v("PushService", "MultiProcessShareProvider reallly get key = " + str4 + " value = " + cursor2.toString());
                }
                newRow2.add(cursor2);
                cursor = cursor2;
            }
            return matrixCursor;
        } catch (Exception unused2) {
            cursor = equals;
            return cursor;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
