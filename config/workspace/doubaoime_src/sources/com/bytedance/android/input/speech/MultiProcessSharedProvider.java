package com.bytedance.android.input.speech;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.common.utility.Logger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class MultiProcessSharedProvider extends ContentProvider {

    /* renamed from: c, reason: collision with root package name */
    public static String f3104c;

    /* renamed from: d, reason: collision with root package name */
    public static Uri f3105d;

    /* renamed from: e, reason: collision with root package name */
    private static UriMatcher f3106e;
    private SharedPreferences a;
    private Map<String, Object> b = new ConcurrentHashMap();

    public static final synchronized Uri a(Context context, String str, String str2) {
        Uri build;
        synchronized (MultiProcessSharedProvider.class) {
            if (f3105d == null) {
                try {
                    if (Logger.debug()) {
                        Logger.d("MultiProcessSharedProvider", "init form getContentUri");
                    }
                    c(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
            build = f3105d.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    private synchronized SharedPreferences b() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = getContext().getApplicationContext().getSharedPreferences("multi_process_config", 4);
        this.a = sharedPreferences2;
        return sharedPreferences2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1 = r4.authority;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(android.content.Context r6) throws java.lang.IllegalStateException {
        /*
            java.lang.Class<com.bytedance.android.input.speech.MultiProcessSharedProvider> r0 = com.bytedance.android.input.speech.MultiProcessSharedProvider.class
            java.lang.String r0 = r0.getName()
            r1 = 0
            if (r6 == 0) goto L34
            boolean r2 = com.bytedance.android.input.k.b.a.Y(r0)
            if (r2 == 0) goto L10
            goto L34
        L10:
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: java.lang.Exception -> L34
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Exception -> L34
            r3 = 8
            android.content.pm.PackageInfo r6 = r2.getPackageInfo(r6, r3)     // Catch: java.lang.Exception -> L34
            android.content.pm.ProviderInfo[] r6 = r6.providers     // Catch: java.lang.Exception -> L34
            int r2 = r6.length     // Catch: java.lang.Exception -> L34
            r3 = 0
        L22:
            if (r3 >= r2) goto L34
            r4 = r6[r3]     // Catch: java.lang.Exception -> L34
            java.lang.String r5 = r4.name     // Catch: java.lang.Exception -> L34
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Exception -> L34
            if (r5 == 0) goto L31
            java.lang.String r1 = r4.authority     // Catch: java.lang.Exception -> L34
            goto L34
        L31:
            int r3 = r3 + 1
            goto L22
        L34:
            com.bytedance.android.input.speech.MultiProcessSharedProvider.f3104c = r1
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 != 0) goto L74
            boolean r6 = com.bytedance.common.utility.Logger.debug()
            if (r6 == 0) goto L49
            java.lang.String r6 = com.bytedance.android.input.speech.MultiProcessSharedProvider.f3104c
            java.lang.String r0 = "MultiProcessSharedProvider"
            com.bytedance.common.utility.Logger.d(r0, r6)
        L49:
            android.content.UriMatcher r6 = new android.content.UriMatcher
            r0 = -1
            r6.<init>(r0)
            com.bytedance.android.input.speech.MultiProcessSharedProvider.f3106e = r6
            java.lang.String r0 = com.bytedance.android.input.speech.MultiProcessSharedProvider.f3104c
            r1 = 65536(0x10000, float:9.18355E-41)
        */
        //  java.lang.String r2 = "*/*"
        /*
            r6.addURI(r0, r2, r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "content://"
            r6.append(r0)
            java.lang.String r0 = com.bytedance.android.input.speech.MultiProcessSharedProvider.f3104c
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            com.bytedance.android.input.speech.MultiProcessSharedProvider.f3105d = r6
            return
        L74:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must Set MultiProcessSharedProvider Authority"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.MultiProcessSharedProvider.c(android.content.Context):void");
    }

    private void d(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        if (f3106e.match(uri) != 65536) {
            throw new IllegalArgumentException(e.a.a.a.a.o("Unsupported uri ", uri));
        }
        try {
            b().edit().clear().commit();
            this.b.clear();
            d(a(getContext(), "key", "type"));
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return e.a.a.a.a.J(e.a.a.a.a.M("vnd.android.cursor.item/vnd."), f3104c, ".item");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0014 A[SYNTHETIC] */
    @Override // android.content.ContentProvider
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.net.Uri insert(android.net.Uri r10, android.content.ContentValues r11) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.MultiProcessSharedProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (f3106e != null) {
            return true;
        }
        try {
            if (Logger.debug()) {
                Logger.d("MultiProcessSharedProvider", "init form onCreate");
            }
            c(getContext());
            SharedPreferences b = b();
            if (b == null) {
                return true;
            }
            for (Map.Entry<String, ?> entry : b.getAll().entrySet()) {
                this.b.put(entry.getKey(), entry.getValue());
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        ?? equals;
        MatrixCursor matrixCursor;
        if (f3106e.match(uri) != 65536) {
            throw new IllegalArgumentException(e.a.a.a.a.o("Unsupported uri ", uri));
        }
        Cursor cursor = null;
        try {
            i = 1;
            equals = "all".equals(uri.getPathSegments().get(1));
        } catch (Exception unused) {
        }
        try {
            if (equals != 0) {
                Map<String, ?> all = b().getAll();
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
                        i = 0;
                    }
                    cursor2 = Integer.valueOf(i);
                }
                if (Logger.debug()) {
                    Logger.d("PushService", "MultiProcessShareProvider reallly get key = " + str4 + " value = " + cursor2.toString());
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
