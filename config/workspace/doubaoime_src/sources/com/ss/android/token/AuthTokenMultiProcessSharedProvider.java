package com.ss.android.token;

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
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AuthTokenMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: e, reason: collision with root package name */
    public static String f8373e;

    /* renamed from: f, reason: collision with root package name */
    public static Uri f8374f;

    /* renamed from: g, reason: collision with root package name */
    private static UriMatcher f8375g;
    private SharedPreferences a;
    private Map<String, Object> b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f8376c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Object f8377d = new Object();

    private void a() {
        if (this.f8376c) {
            return;
        }
        synchronized (this.f8377d) {
            if (!this.f8376c) {
                f();
                this.f8376c = true;
            }
        }
    }

    public static final synchronized Uri b(Context context, String str, String str2) {
        Uri build;
        synchronized (AuthTokenMultiProcessSharedProvider.class) {
            if (f8374f == null) {
                try {
                    int i = b.b;
                    d(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    c.a(e2);
                    return null;
                }
            }
            build = f8374f.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    private synchronized SharedPreferences c() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = getContext().getApplicationContext().getSharedPreferences("token_shared_preference", 4);
        this.a = sharedPreferences2;
        return sharedPreferences2;
    }

    private static void d(Context context) throws IllegalStateException {
        String str;
        if (TextUtils.isEmpty(f8373e)) {
            String name = AuthTokenMultiProcessSharedProvider.class.getName();
            if (context == null || TextUtils.isEmpty(name)) {
                str = null;
            } else {
                try {
                    for (ProviderInfo providerInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers) {
                        if (name.equals(providerInfo.name)) {
                            str = providerInfo.authority;
                            break;
                        }
                    }
                } catch (Exception e2) {
                    c.a(e2);
                }
                str = e.a.a.a.a.c(context, new StringBuilder(), ".auth_token.SHARE_PROVIDER_AUTHORITY");
            }
            f8373e = str;
        }
        if (TextUtils.isEmpty(f8373e)) {
            throw new IllegalStateException("Must Set AuthTokenMultiProcessSharedProvider Authority");
        }
        int i = b.b;
        UriMatcher uriMatcher = new UriMatcher(-1);
        f8375g = uriMatcher;
        uriMatcher.addURI(f8373e, "*/*", 65536);
        f8374f = Uri.parse("content://" + f8373e);
    }

    private static boolean e() {
        return TextUtils.isEmpty(f8373e) || f8375g == null;
    }

    private void f() {
        SharedPreferences c2 = c();
        if (c2 == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : c2.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || key == null) {
                try {
                    String str = "MultiProcessShareProvider loadValues key_ = " + key + " value_ = " + value;
                    int i = b.b;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key_", key);
                    jSONObject.put("value_", value);
                    c.b("token_sp_error", jSONObject);
                } catch (Exception e2) {
                    c.a(e2);
                }
            } else {
                this.b.put(key, value);
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f8373e = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        a();
        if (e()) {
            return 0;
        }
        if (f8375g.match(uri) != 65536) {
            throw new IllegalArgumentException(e.a.a.a.a.o("Unsupported uri ", uri));
        }
        try {
            this.b.clear();
            c().edit().clear().commit();
            getContext().getContentResolver().notifyChange(b(getContext(), "key", "type"), null);
        } catch (Exception e2) {
            c.a(e2);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        a();
        return e.a.a.a.a.J(e.a.a.a.a.M("vnd.android.cursor.item/vnd."), f8373e, ".item");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0023 A[SYNTHETIC] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.net.Uri insert(android.net.Uri r9, android.content.ContentValues r10) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.token.AuthTokenMultiProcessSharedProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        int i = b.b;
        if (f8375g != null) {
            return true;
        }
        try {
            d(getContext());
            return true;
        } catch (Exception e2) {
            c.a(e2);
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        a();
        Cursor cursor = null;
        if (e()) {
            return null;
        }
        if (f8375g.match(uri) != 65536) {
            throw new IllegalArgumentException(e.a.a.a.a.o("Unsupported uri ", uri));
        }
        try {
            int i = 1;
            ?? equals = "all".equals(uri.getPathSegments().get(1));
            try {
                if (equals != 0) {
                    Map<String, ?> all = c().getAll();
                    matrixCursor = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                    Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it2.hasNext();
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
                    if (!this.b.containsKey(str4)) {
                        return null;
                    }
                    matrixCursor = new MatrixCursor(new String[]{str4});
                    Object obj = this.b.get(str4);
                    MatrixCursor.RowBuilder newRow2 = matrixCursor.newRow();
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i = 0;
                        }
                        obj = Integer.valueOf(i);
                    }
                    d.a(obj);
                    Log.getStackTraceString(new Exception());
                    int i2 = b.b;
                    newRow2.add(obj);
                    cursor = newRow2;
                }
                return matrixCursor;
            } catch (Exception e2) {
                e = e2;
                cursor = equals;
                c.a(e);
                return cursor;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
