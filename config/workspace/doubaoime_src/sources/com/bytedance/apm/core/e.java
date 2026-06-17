package com.bytedance.apm.core;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class e implements SharedPreferences {

    /* renamed from: d, reason: collision with root package name */
    private static int f3419d = -1;
    private Application a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f3420c;

    private class b implements SharedPreferences.Editor {
        private boolean a = false;
        private HashMap<String, Object> b = new HashMap<>();

        b(a aVar) {
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            if (this.a || !this.b.isEmpty()) {
                Bundle bundle = new Bundle();
                if (this.a) {
                    bundle.putBoolean("clear", true);
                }
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.b.size());
                for (Map.Entry<String, Object> entry : this.b.entrySet()) {
                    arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
                }
                bundle.putParcelableArrayList("edit", arrayList);
                try {
                    e.this.a.getContentResolver().call(e.this.f3420c, e.this.b, "edit", bundle);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.b.clear();
            this.a = true;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            apply();
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.b.put(str, Boolean.valueOf(z));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f2) {
            this.b.put(str, Float.valueOf(f2));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            this.b.put(str, Integer.valueOf(i));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            this.b.put(str, Long.valueOf(j));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.b.put(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.b.put(str, com.bytedance.android.input.k.b.a.J0(set));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.b.put(str, null);
            return this;
        }
    }

    private e(Application application, String str) {
        this.a = application;
        StringBuilder M = e.a.a.a.a.M("content://");
        M.append(application.getPackageName());
        M.append(".apm");
        M.append("/sp/");
        M.append(str);
        String sb = M.toString();
        this.b = sb;
        this.f3420c = Uri.parse(sb);
    }

    private ArrayList<SpPair> d(String str, Object obj) {
        Bundle bundle;
        String str2;
        Bundle bundle2 = new Bundle();
        if (obj != null) {
            bundle2.putParcelable("sp", new SpPair(str, obj));
        }
        try {
            ContentResolver contentResolver = this.a.getContentResolver();
            Uri uri = this.f3420c;
            if (str != null) {
                str2 = this.b + "/" + str;
            } else {
                str2 = this.b;
            }
            if (obj == null) {
                bundle2 = null;
            }
            bundle = contentResolver.call(uri, str2, "query", bundle2);
        } catch (Exception unused) {
            bundle = null;
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(e.class.getClassLoader());
        return bundle.getParcelableArrayList("sp");
    }

    public static SharedPreferences e(Context context, String str) {
        int i = -1;
        if (f3419d == -1) {
            try {
                Bundle call = context.getContentResolver().call(Uri.parse("content://" + context.getPackageName() + ".apm"), "getPid", (String) null, (Bundle) null);
                if (call != null) {
                    i = call.getInt("Pid", -1);
                }
            } catch (Exception unused) {
            }
            f3419d = i;
        }
        if (f3419d == Process.myPid()) {
            return context.getSharedPreferences(str, 0);
        }
        return new e(context instanceof Application ? (Application) context : (Application) context.getApplicationContext(), str);
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        String str2;
        Bundle bundle = null;
        try {
            ContentResolver contentResolver = this.a.getContentResolver();
            Uri uri = this.f3420c;
            if (str != null) {
                str2 = this.b + "/" + str;
            } else {
                str2 = this.b;
            }
            bundle = contentResolver.call(uri, str2, "contains", (Bundle) null);
        } catch (Exception unused) {
        }
        return bundle != null && bundle.getBoolean("contains");
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(null);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        ArrayList<SpPair> d2 = d(null, null);
        if (d2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<SpPair> it2 = d2.iterator();
        while (it2.hasNext()) {
            SpPair next = it2.next();
            hashMap.put(next.a, next.b);
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        ArrayList<SpPair> d2 = d(str, String.valueOf(z));
        if (d2 == null) {
            return z;
        }
        Object obj = d2.get(0).b;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof String ? Boolean.valueOf((String) obj).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        ArrayList<SpPair> d2 = d(str, String.valueOf(f2));
        if (d2 == null) {
            return f2;
        }
        Object obj = d2.get(0).b;
        return obj instanceof Float ? ((Float) obj).floatValue() : obj instanceof String ? Float.valueOf((String) obj).floatValue() : f2;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        ArrayList<SpPair> d2 = d(str, String.valueOf(i));
        if (d2 == null) {
            return i;
        }
        Object obj = d2.get(0).b;
        return obj instanceof Integer ? ((Integer) obj).intValue() : obj instanceof String ? Integer.decode((String) obj).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        ArrayList<SpPair> d2 = d(str, String.valueOf(j));
        if (d2 == null) {
            return j;
        }
        Object obj = d2.get(0).b;
        return obj instanceof Long ? ((Long) obj).longValue() : obj instanceof String ? Long.decode((String) obj).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        ArrayList<SpPair> d2 = d(str, str2);
        if (d2 == null) {
            return null;
        }
        return (String) d2.get(0).b;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        ArrayList<SpPair> d2 = d(str, set);
        if (d2 == null || d2.get(0).b == null) {
            return null;
        }
        String[] strArr = (String[]) d2.get(0).b;
        HashSet hashSet = new HashSet(strArr.length);
        hashSet.addAll(Arrays.asList(strArr));
        return hashSet;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
