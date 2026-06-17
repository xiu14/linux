package com.bytedance.push.settings.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class h implements k {
    private SharedPreferences a;
    private Map<com.bytedance.push.settings.a, SharedPreferences.OnSharedPreferenceChangeListener> b = new ConcurrentHashMap();

    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        final /* synthetic */ String a;
        final /* synthetic */ com.bytedance.push.settings.a b;

        a(h hVar, String str, com.bytedance.push.settings.a aVar) {
            this.a = str;
            this.b = aVar;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (TextUtils.equals(this.a, str)) {
                this.b.a();
            }
        }
    }

    public h(Context context, String str) {
        this.a = context.getSharedPreferences(str, 0);
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
        return this.a.contains(str);
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
        return this.a.edit();
    }

    @Override // com.bytedance.push.settings.storage.k
    public boolean getBoolean(String str, boolean z) {
        try {
            return this.a.getBoolean(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    @Override // com.bytedance.push.settings.storage.k
    public float getFloat(String str, float f2) {
        try {
            return this.a.getFloat(str, f2);
        } catch (Exception unused) {
            return f2;
        }
    }

    @Override // com.bytedance.push.settings.storage.k
    public int getInt(String str, int i) {
        try {
            return this.a.getInt(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    @Override // com.bytedance.push.settings.storage.k
    public long getLong(String str, long j) {
        try {
            return this.a.getLong(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    @Override // com.bytedance.push.settings.storage.k
    public String getString(String str, String str2) {
        try {
            return this.a.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    @Override // com.bytedance.push.settings.storage.k
    public void registerValChanged(Context context, String str, String str2, com.bytedance.push.settings.a aVar) {
        if (aVar == null) {
            return;
        }
        a aVar2 = new a(this, str, aVar);
        this.b.put(aVar, aVar2);
        this.a.registerOnSharedPreferenceChangeListener(aVar2);
    }

    @Override // com.bytedance.push.settings.storage.k
    public void unregisterValChanged(com.bytedance.push.settings.a aVar) {
        SharedPreferences.OnSharedPreferenceChangeListener remove;
        if (aVar == null || (remove = this.b.remove(aVar)) == null) {
            return;
        }
        this.a.unregisterOnSharedPreferenceChangeListener(remove);
    }
}
