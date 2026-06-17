package com.bytedance.push.settings.storage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class e implements k {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f5837d;
    private final Context a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private Map<com.bytedance.push.settings.a, ContentObserver> f5838c = new ConcurrentHashMap();

    class a implements l {
        a(e eVar) {
        }
    }

    class b extends ContentObserver {
        final /* synthetic */ com.bytedance.push.settings.a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e eVar, Handler handler, com.bytedance.push.settings.a aVar) {
            super(handler);
            this.a = aVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            super.onChange(z, uri);
            this.a.a();
        }
    }

    private static final class c implements SharedPreferences.Editor {
        private final l a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private Context f5839c;

        /* renamed from: d, reason: collision with root package name */
        private ContentValues f5840d = new ContentValues();

        c(Context context, String str, l lVar) {
            this.f5839c = context.getApplicationContext();
            this.a = lVar;
            this.b = str;
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized void apply() {
            com.bytedance.push.settings.storage.b bVar = new com.bytedance.push.settings.storage.b(this.b, "key", "val", "type");
            try {
                l lVar = this.a;
                Context context = this.f5839c;
                Objects.requireNonNull((a) lVar);
                Uri g2 = e.g(context, bVar);
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentProviderClient acquireUnstableContentProviderClient = this.f5839c.getContentResolver().acquireUnstableContentProviderClient(g2);
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            acquireUnstableContentProviderClient.insert(g2, this.f5840d);
                            acquireUnstableContentProviderClient.close();
                        } catch (Throwable th) {
                            acquireUnstableContentProviderClient.close();
                            throw th;
                        }
                    }
                } else {
                    this.f5839c.getContentResolver().insert(g2, this.f5840d);
                }
            } catch (Throwable th2) {
                Log.e("SettingsManager", "[apply]exception:" + th2.getLocalizedMessage());
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            throw new UnsupportedOperationException("no support clear");
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return false;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f5840d.put(str, Boolean.valueOf(z));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f2) {
            this.f5840d.put(str, Float.valueOf(f2));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            this.f5840d.put(str, Integer.valueOf(i));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            this.f5840d.put(str, Long.valueOf(j));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.f5840d.put(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            throw new UnsupportedOperationException("putStringSet not support");
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.f5840d.putNull(str);
            return this;
        }
    }

    e(Context context, String str, boolean z) {
        Log.d("SettingsManager", "create MultiProcessSpStorage with storageKey:" + str + " isSmp: " + z);
        this.a = context;
        this.b = str;
        f5837d = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized Uri g(Context context, com.bytedance.push.settings.storage.b bVar) {
        synchronized (e.class) {
            if (f5837d) {
                return SmpProcessSettingsProvider.a(context, bVar);
            }
            return MainProcessSettingsProvider.a(context, bVar);
        }
    }

    private Uri h(Context context, String str, String str2, String str3, String str4) {
        return g(context, new com.bytedance.push.settings.storage.b(str, str2, str3, str4));
    }

    private Cursor i(Uri uri) {
        Cursor cursor = null;
        try {
            ContentProviderClient acquireUnstableContentProviderClient = this.a.getContentResolver().acquireUnstableContentProviderClient(uri);
            if (acquireUnstableContentProviderClient != null) {
                try {
                    cursor = acquireUnstableContentProviderClient.query(uri, null, null, null, null);
                    acquireUnstableContentProviderClient.close();
                } catch (Throwable th) {
                    acquireUnstableContentProviderClient.close();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            StringBuilder M = e.a.a.a.a.M("[getSpCursor]exception:");
            M.append(th2.getLocalizedMessage());
            Log.e("SettingsManager", M.toString());
        }
        return cursor;
    }

    @Override // com.bytedance.push.settings.storage.k
    public String a(String str) {
        return getString(str, null);
    }

    @Override // com.bytedance.push.settings.storage.k
    public boolean b(String str) {
        return getBoolean(str, false);
    }

    @Override // com.bytedance.push.settings.storage.k
    public long c(String str) {
        return getLong(str, 0L);
    }

    @Override // com.bytedance.push.settings.storage.k
    public boolean contains(String str) {
        Bundle bundle;
        try {
            bundle = null;
            Uri g2 = g(this.a, null);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentProviderClient acquireUnstableContentProviderClient = this.a.getContentResolver().acquireUnstableContentProviderClient(g2);
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            String authority = g2.getAuthority();
                            String str2 = this.b;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("_storage_key", str2);
                            bundle2.putString("_key", str);
                            bundle = acquireUnstableContentProviderClient.call(authority, "_contains", null, bundle2);
                            acquireUnstableContentProviderClient.close();
                        } catch (Throwable th) {
                            acquireUnstableContentProviderClient.close();
                            throw th;
                        }
                    }
                } else {
                    ContentResolver contentResolver = this.a.getContentResolver();
                    String str3 = this.b;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("_storage_key", str3);
                    bundle3.putString("_key", str);
                    bundle = contentResolver.call(g2, "_contains", (String) null, bundle3);
                }
            } catch (Throwable th2) {
                Log.e("SettingsManager", "[contains]exception:" + th2.getLocalizedMessage());
            }
        } catch (Throwable unused) {
        }
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("_result");
    }

    @Override // com.bytedance.push.settings.storage.k
    public int d(String str) {
        return getInt(str, 0);
    }

    @Override // com.bytedance.push.settings.storage.k
    public float e(String str) {
        return getFloat(str, 0.0f);
    }

    @Override // com.bytedance.push.settings.storage.k
    public SharedPreferences.Editor edit() {
        return new c(this.a, this.b, new a(this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:4|5)|(6:7|(1:9)|10|11|12|13)|18|10|11|12|13) */
    @Override // com.bytedance.push.settings.storage.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean getBoolean(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r1 = r6.a     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r6.b     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = "boolean"
            r0 = r6
            r3 = r7
            android.net.Uri r7 = r0.h(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L35
            android.database.Cursor r7 = r6.i(r7)     // Catch: java.lang.Throwable -> L35
            if (r7 != 0) goto L17
            goto L2f
        L17:
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L2a
            r0 = 0
            int r1 = r7.getInt(r0)     // Catch: java.lang.Throwable -> L26
            if (r1 <= 0) goto L2b
            r0 = 1
            goto L2b
        L26:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L30
        L2a:
            r0 = r8
        L2b:
            r7.close()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L35
        L2e:
            r8 = r0
        L2f:
            return r8
        L30:
            r0 = move-exception
            r7.close()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L35
        L34:
            throw r0     // Catch: java.lang.Throwable -> L35
        L35:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.settings.storage.e.getBoolean(java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:4|5|(5:7|9|10|11|12)|16|9|10|11|12) */
    @Override // com.bytedance.push.settings.storage.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getFloat(java.lang.String r7, float r8) {
        /*
            r6 = this;
            android.content.Context r1 = r6.a     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r6.b     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = "float"
            r0 = r6
            r3 = r7
            android.net.Uri r7 = r0.h(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L28
            android.database.Cursor r7 = r6.i(r7)     // Catch: java.lang.Throwable -> L28
            if (r7 != 0) goto L17
            goto L28
        L17:
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L23
            r0 = 0
            float r0 = r7.getFloat(r0)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r0 = r8
        L24:
            r7.close()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L28
        L27:
            r8 = r0
        L28:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.settings.storage.e.getFloat(java.lang.String, float):float");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:4|5|(5:7|9|10|11|12)|16|9|10|11|12) */
    @Override // com.bytedance.push.settings.storage.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getInt(java.lang.String r7, int r8) {
        /*
            r6 = this;
            android.content.Context r1 = r6.a     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r6.b     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = "integer"
            r0 = r6
            r3 = r7
            android.net.Uri r7 = r0.h(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L28
            android.database.Cursor r7 = r6.i(r7)     // Catch: java.lang.Throwable -> L28
            if (r7 != 0) goto L17
            goto L28
        L17:
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L23
            r0 = 0
            int r0 = r7.getInt(r0)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r0 = r8
        L24:
            r7.close()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L28
        L27:
            r8 = r0
        L28:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.settings.storage.e.getInt(java.lang.String, int):int");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:4|5|(5:7|9|10|11|12)|16|9|10|11|12) */
    @Override // com.bytedance.push.settings.storage.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long getLong(java.lang.String r7, long r8) {
        /*
            r6 = this;
            android.content.Context r1 = r6.a     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r6.b     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = "long"
            r0 = r6
            r3 = r7
            android.net.Uri r7 = r0.h(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L28
            android.database.Cursor r7 = r6.i(r7)     // Catch: java.lang.Throwable -> L28
            if (r7 != 0) goto L17
            goto L28
        L17:
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L23
            r0 = 0
            long r0 = r7.getLong(r0)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r0 = r8
        L24:
            r7.close()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L28
        L27:
            r8 = r0
        L28:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.settings.storage.e.getLong(java.lang.String, long):long");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:4|5|(5:7|9|10|11|12)|16|9|10|11|12) */
    @Override // com.bytedance.push.settings.storage.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getString(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            android.content.Context r1 = r6.a     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r6.b     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "string"
            r0 = r6
            r3 = r7
            r4 = r8
            android.net.Uri r7 = r0.h(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L25
            android.database.Cursor r7 = r6.i(r7)     // Catch: java.lang.Throwable -> L25
            if (r7 != 0) goto L14
            goto L25
        L14:
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L20
            r0 = 0
            java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L20
            goto L21
        L20:
            r0 = r8
        L21:
            r7.close()     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L25
        L24:
            r8 = r0
        L25:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.settings.storage.e.getString(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.bytedance.push.settings.storage.k
    public void registerValChanged(Context context, String str, String str2, com.bytedance.push.settings.a aVar) {
        Uri b2;
        if (aVar == null || (b2 = MainProcessSettingsProvider.b(context, this.b, str, str2)) == null) {
            return;
        }
        b bVar = new b(this, new Handler(Looper.getMainLooper()), aVar);
        try {
            context.getContentResolver().registerContentObserver(b2, true, bVar);
            this.f5838c.put(aVar, bVar);
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("error when  registerContentObserver:");
            M.append(th.getLocalizedMessage());
            Log.e("SettingsManager", M.toString());
        }
    }

    @Override // com.bytedance.push.settings.storage.k
    public void unregisterValChanged(com.bytedance.push.settings.a aVar) {
        ContentObserver remove;
        if (aVar == null || (remove = this.f5838c.remove(aVar)) == null) {
            return;
        }
        this.a.getContentResolver().unregisterContentObserver(remove);
    }

    e(Context context, String str) {
        Log.d("SettingsManager", "create MultiProcessSpStorage with storageKey:" + str + " isSmp will be set to false");
        this.a = context;
        this.b = str;
        f5837d = false;
    }
}
