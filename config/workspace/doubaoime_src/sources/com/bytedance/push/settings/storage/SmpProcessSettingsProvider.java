package com.bytedance.push.settings.storage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.service.manager.pull.PullConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class SmpProcessSettingsProvider extends ContentProvider {
    public static String a;
    public static Uri b;

    /* renamed from: c, reason: collision with root package name */
    private static UriMatcher f5828c;

    static synchronized Uri a(Context context, b bVar) {
        synchronized (SmpProcessSettingsProvider.class) {
            if (b == null) {
                try {
                    b(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
            if (bVar == null) {
                return b;
            }
            return bVar.b(b);
        }
    }

    private static void b(Context context) throws IllegalStateException {
        String c2;
        if (TextUtils.isEmpty(a)) {
            String name = SmpProcessSettingsProvider.class.getName();
            if (context == null) {
                c2 = null;
            } else {
                try {
                    if (!TextUtils.isEmpty(name)) {
                        for (ProviderInfo providerInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers) {
                            if (name.equals(providerInfo.name)) {
                                c2 = providerInfo.authority;
                                break;
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                c2 = e.a.a.a.a.c(context, new StringBuilder(), ".push.settings.smp");
            }
            a = c2;
        }
        if (TextUtils.isEmpty(a)) {
            throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
        }
        UriMatcher uriMatcher = new UriMatcher(-1);
        f5828c = uriMatcher;
        uriMatcher.addURI(a, "*/*/*/*", 65536);
        b = Uri.parse("content://" + a);
    }

    private static boolean c() {
        return TextUtils.isEmpty(a) || f5828c == null;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        f a2 = g.a(str);
        if (a2 == null) {
            return null;
        }
        return a2.a(getContext(), str2, bundle, PullConfiguration.PROCESS_NAME_SMP);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return e.a.a.a.a.J(e.a.a.a.a.M("vnd.android.cursor.item/vnd."), a, ".item");
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        SharedPreferences.Editor edit;
        ArrayList arrayList;
        String str;
        if (c()) {
            return null;
        }
        if (f5828c.match(uri) != 65536) {
            throw new IllegalArgumentException(e.a.a.a.a.o("Unsupported uri ", uri));
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null) {
            return null;
        }
        String str2 = pathSegments.get(0);
        try {
            k a2 = ((i) com.bytedance.push.settings.h.a()).a(getContext(), true, str2, PullConfiguration.PROCESS_NAME_SMP);
            Log.d("SettingsManager", "insert on SmpProcessSettingsProvider for " + str2 + " storage class name is " + a2.getClass().getName());
            edit = a2.edit();
            arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if (value == null) {
                    edit.remove(key);
                    str = null;
                } else if (value instanceof String) {
                    if (!TextUtils.equals(a2.a(key), (String) value)) {
                        edit.putString(key, (String) value);
                        str = TypedValues.Custom.S_STRING;
                    }
                } else if (value instanceof Boolean) {
                    if (a2.b(key) != ((Boolean) value).booleanValue()) {
                        edit.putBoolean(key, ((Boolean) value).booleanValue());
                        str = TypedValues.Custom.S_BOOLEAN;
                    }
                } else if (value instanceof Long) {
                    if (a2.c(key) != ((Long) value).longValue()) {
                        edit.putLong(key, ((Long) value).longValue());
                        str = "long";
                    }
                } else if (!(value instanceof Integer)) {
                    if (!(value instanceof Float)) {
                        throw new IllegalArgumentException("Unsupported type " + uri);
                    }
                    if (a2.e(key) != ((Float) value).floatValue()) {
                        edit.putFloat(key, ((Float) value).floatValue());
                        str = TypedValues.Custom.S_FLOAT;
                    }
                } else if (a2.d(key) != ((Integer) value).intValue()) {
                    edit.putInt(key, ((Integer) value).intValue());
                    str = TypedValues.Custom.S_INT;
                }
                if (str != null) {
                    arrayList.add(new j(str2, key, str, getContext()));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (edit == null) {
            return null;
        }
        edit.apply();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (f5828c != null) {
            return true;
        }
        try {
            b(getContext());
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        b a2;
        k a3;
        Object string;
        if (c() || f5828c.match(uri) != 65536 || (a2 = b.a(uri)) == null || TextUtils.isEmpty(a2.a) || TextUtils.isEmpty(a2.b) || TextUtils.isEmpty(a2.f5830d)) {
            return null;
        }
        a3 = ((i) com.bytedance.push.settings.h.a()).a(getContext(), true, a2.a, PullConfiguration.PROCESS_NAME_SMP);
        StringBuilder M = e.a.a.a.a.M("query on SmpProcessSettingsProvider for ");
        M.append(a2.a);
        M.append(" storage class name is ");
        M.append(a3.getClass().getName());
        Log.d("SettingsManager", M.toString());
        String str3 = a2.f5830d;
        str3.hashCode();
        str3.hashCode();
        switch (str3) {
            case "string":
                string = a3.getString(a2.b, a2.f5829c);
                break;
            case "long":
                string = Long.valueOf(a3.getLong(a2.b, Long.parseLong(a2.f5829c)));
                break;
            case "boolean":
                string = Integer.valueOf(a3.getBoolean(a2.b, Boolean.parseBoolean(a2.f5829c)) ? 1 : 0);
                break;
            case "float":
                string = Float.valueOf(a3.getFloat(a2.b, Float.parseFloat(a2.f5829c)));
                break;
            case "integer":
                string = Integer.valueOf(a3.getInt(a2.b, Integer.parseInt(a2.f5829c)));
                break;
            default:
                throw new IllegalArgumentException("unknown type");
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{a2.b});
        matrixCursor.newRow().add(string);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
