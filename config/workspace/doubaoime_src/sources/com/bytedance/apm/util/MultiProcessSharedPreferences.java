package com.bytedance.apm.util;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiProcessSharedPreferences extends ContentProvider implements SharedPreferences {
    public static final /* synthetic */ int b = 0;
    private ContentResolver a;

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
                    MultiProcessSharedPreferences multiProcessSharedPreferences = MultiProcessSharedPreferences.this;
                    int i = MultiProcessSharedPreferences.b;
                    Objects.requireNonNull(multiProcessSharedPreferences);
                    throw null;
                } catch (Exception e2) {
                    e.b.b.n.g.b.c("MultiProcessSharedPref", "apply exception: ", e2);
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
            this.b.put(str, com.bytedance.android.input.k.b.a.K0(set));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.b.put(str, null);
            return this;
        }
    }

    private void a(SharedPreferences sharedPreferences, Bundle bundle) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bundle.getBoolean("clear")) {
            edit.clear();
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("edit");
        if (parcelableArrayList == null) {
            return;
        }
        Iterator it2 = parcelableArrayList.iterator();
        while (it2.hasNext()) {
            SpPair spPair = (SpPair) it2.next();
            Object obj = spPair.b;
            if (obj == null) {
                edit.remove(spPair.a);
            } else {
                String str = spPair.a;
                if (obj instanceof String) {
                    edit.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    edit.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    edit.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    edit.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String[]) {
                    edit.putStringSet(str, new HashSet(Arrays.asList((String[]) obj)));
                }
            }
        }
        edit.commit();
    }

    private ArrayList<SpPair> b(String str, Object obj) {
        Bundle bundle = new Bundle();
        if (obj != null) {
            bundle.putParcelable("sp", new SpPair(str, obj));
        }
        try {
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        Object obj;
        Pair pair;
        SpPair spPair;
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        Uri parse = Uri.parse(str);
        synchronized (this) {
            List<String> pathSegments = parse.getPathSegments();
            obj = null;
            pair = (pathSegments == null || pathSegments.size() < 2 || !"sp".equals(pathSegments.get(0))) ? null : new Pair(getContext().getSharedPreferences(pathSegments.get(1), 0), pathSegments.size() > 2 ? pathSegments.get(2) : null);
        }
        if (pair == null) {
            return null;
        }
        if (!"query".equals(str2)) {
            if ("contains".equals(str2)) {
                SharedPreferences sharedPreferences = (SharedPreferences) pair.first;
                String str3 = (String) pair.second;
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("contains", sharedPreferences.contains(str3));
                return bundle2;
            }
            if ("edit".equals(str2) && bundle != null) {
                try {
                    a((SharedPreferences) pair.first, bundle);
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    this.a.notifyChange(Uri.parse(str), null);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } catch (Throwable th) {
                    e.b.b.n.g.b.c("MultiProcessSharedPref", "edit", th);
                }
            }
            return null;
        }
        if (bundle != null && (spPair = (SpPair) bundle.getParcelable("sp")) != null) {
            obj = spPair.b;
        }
        SharedPreferences sharedPreferences2 = (SharedPreferences) pair.first;
        String str4 = (String) pair.second;
        Bundle bundle3 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (str4 == null) {
            for (Map.Entry<String, ?> entry : sharedPreferences2.getAll().entrySet()) {
                arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
            }
            bundle3.putParcelableArrayList("sp", arrayList);
        } else {
            Object obj2 = sharedPreferences2.getAll().get(str4);
            if (obj2 != null) {
                obj = obj2;
            }
            if (obj instanceof Set) {
                obj = com.bytedance.android.input.k.b.a.K0((Set) obj);
            }
            arrayList.add(new SpPair(str4, obj));
            bundle3.putParcelableArrayList("sp", arrayList);
        }
        return bundle3;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return false;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return -1;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(null);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        b(null, null);
        return null;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        b(str, String.valueOf(z));
        return z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        b(str, String.valueOf(f2));
        return f2;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        b(str, String.valueOf(i));
        return i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        b(str, String.valueOf(j));
        return j;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        b(str, str2);
        return null;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        b(str, set);
        return null;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.a = getContext().getContentResolver();
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return -1;
    }
}
