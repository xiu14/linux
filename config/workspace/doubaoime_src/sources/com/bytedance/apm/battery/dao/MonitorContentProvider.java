package com.bytedance.apm.battery.dao;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.core.SpPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class MonitorContentProvider extends ContentProvider {
    private final Map<String, SQLiteOpenHelper> a = new HashMap();

    private synchronized Pair<SQLiteDatabase, String> a(Uri uri) {
        try {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments != null && pathSegments.size() >= 2) {
                String str = pathSegments.get(0);
                String str2 = pathSegments.get(1);
                if (str == null) {
                    return null;
                }
                SQLiteOpenHelper sQLiteOpenHelper = this.a.get(str);
                if (sQLiteOpenHelper == null) {
                    if (!str.contains("apm_monitor_t1.db")) {
                        return null;
                    }
                    sQLiteOpenHelper = new b(getContext(), str);
                    this.a.put(str, sQLiteOpenHelper);
                }
                return new Pair<>(sQLiteOpenHelper.getWritableDatabase(), str2);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        Object obj;
        Pair pair;
        SpPair spPair;
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        if ("getPid".equals(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("Pid", Process.myPid());
            return bundle2;
        }
        Uri.parse(str);
        Uri parse = Uri.parse(str);
        synchronized (this) {
            List<String> pathSegments = parse.getPathSegments();
            obj = null;
            pair = (pathSegments == null || pathSegments.size() < 2 || !"sp".equals(pathSegments.get(0))) ? null : new Pair(getContext().getSharedPreferences(pathSegments.get(1), 0), pathSegments.size() > 2 ? pathSegments.get(2) : null);
        }
        if (pair == null) {
            return null;
        }
        if ("query".equals(str2)) {
            if (bundle != null && (spPair = (SpPair) bundle.getParcelable("sp")) != null) {
                obj = spPair.b;
            }
            SharedPreferences sharedPreferences = (SharedPreferences) pair.first;
            String str3 = (String) pair.second;
            Bundle bundle3 = new Bundle();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (str3 == null) {
                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
                }
                bundle3.putParcelableArrayList("sp", arrayList);
            } else {
                Object obj2 = sharedPreferences.getAll().get(str3);
                if (obj2 != null) {
                    obj = obj2;
                }
                if (obj instanceof Set) {
                    obj = com.bytedance.android.input.k.b.a.J0((Set) obj);
                }
                arrayList.add(new SpPair(str3, obj));
                bundle3.putParcelableArrayList("sp", arrayList);
            }
            return bundle3;
        }
        if ("contains".equals(str2)) {
            SharedPreferences sharedPreferences2 = (SharedPreferences) pair.first;
            String str4 = (String) pair.second;
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean("contains", sharedPreferences2.contains(str4));
            return bundle4;
        }
        if ("edit".equals(str2) && bundle != null) {
            SharedPreferences.Editor edit = ((SharedPreferences) pair.first).edit();
            if (bundle.getBoolean("clear")) {
                edit.clear();
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("edit");
            if (parcelableArrayList != null) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    SpPair spPair2 = (SpPair) it2.next();
                    Object obj3 = spPair2.b;
                    if (obj3 == null) {
                        edit.remove(spPair2.a);
                    } else {
                        String str5 = spPair2.a;
                        if (obj3 instanceof String) {
                            edit.putString(str5, (String) obj3);
                        } else if (obj3 instanceof Integer) {
                            edit.putInt(str5, ((Integer) obj3).intValue());
                        } else if (obj3 instanceof Long) {
                            edit.putLong(str5, ((Long) obj3).longValue());
                        } else if (obj3 instanceof Float) {
                            edit.putFloat(str5, ((Float) obj3).floatValue());
                        } else if (obj3 instanceof Boolean) {
                            edit.putBoolean(str5, ((Boolean) obj3).booleanValue());
                        } else if (obj3 instanceof String[]) {
                            edit.putStringSet(str5, new HashSet(Arrays.asList((String[]) obj3)));
                        }
                    }
                }
                edit.apply();
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.delete((String) a.second, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return null;
        }
        try {
            long insert = sQLiteDatabase.insert((String) a.second, null, contentValues);
            if (insert >= 0) {
                return ContentUris.withAppendedId(uri, insert);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        getContext().getPackageName();
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return null;
        }
        if (TextUtils.equals(str2, "rawQuery")) {
            return sQLiteDatabase.rawQuery(str, strArr2);
        }
        if (!TextUtils.equals(str2, "execSQL")) {
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables((String) a.second);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, str2);
        }
        String[] split = str.split(";");
        for (String str3 : split) {
            if (!TextUtils.isEmpty(str3)) {
                sQLiteDatabase.execSQL(str3);
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.update((String) a.second, contentValues, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
