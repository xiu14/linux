package com.bytedance.push.settings.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class c extends h {

    /* renamed from: c, reason: collision with root package name */
    private final Context f5831c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5832d;

    private final class a implements SharedPreferences.Editor {
        private final Context a;
        private Map<String, String> b = new ConcurrentHashMap();

        /* renamed from: c, reason: collision with root package name */
        private final SharedPreferences.Editor f5833c;

        a(Context context, SharedPreferences.Editor editor) {
            this.a = context;
            this.f5833c = editor;
        }

        private void a() {
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (com.bytedance.push.settings.D.a.b(this.a)) {
                    Context context = this.a;
                    String str = c.this.f5832d;
                    String str2 = MainProcessSettingsProvider.a;
                    new d(str, key, value, context).run();
                } else {
                    Context context2 = this.a;
                    String str3 = c.this.f5832d;
                    String str4 = SmpProcessSettingsProvider.a;
                    new j(str3, key, value, context2).run();
                }
            }
            this.b.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            this.f5833c.apply();
            a();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            throw new UnsupportedOperationException("clear not support");
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            boolean commit = this.f5833c.commit();
            a();
            return commit;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f5833c.putBoolean(str, z);
            if (z == c.this.getBoolean(str, false)) {
                this.b.remove(str);
            } else {
                this.b.put(str, TypedValues.Custom.S_BOOLEAN);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f2) {
            this.f5833c.putFloat(str, f2);
            if (f2 == c.this.getFloat(str, 0.0f)) {
                this.b.remove(str);
            } else {
                this.b.put(str, TypedValues.Custom.S_FLOAT);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            this.f5833c.putInt(str, i);
            if (i == c.this.getInt(str, 0)) {
                this.b.remove(str);
            } else {
                this.b.put(str, TypedValues.Custom.S_INT);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            this.f5833c.putLong(str, j);
            if (j == c.this.getLong(str, 0L)) {
                this.b.remove(str);
            } else {
                this.b.put(str, "long");
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.f5833c.putString(str, str2);
            if (TextUtils.equals(c.this.getString(str, null), str2)) {
                this.b.remove(str);
            } else {
                this.b.put(str, TypedValues.Custom.S_STRING);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            throw new UnsupportedOperationException("not support putStringSet");
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.f5833c.remove(str);
            this.b.remove(str);
            return this;
        }
    }

    c(Context context, String str) {
        super(context, str);
        this.f5832d = str;
        this.f5831c = context;
    }

    @Override // com.bytedance.push.settings.storage.h, com.bytedance.push.settings.storage.k
    public SharedPreferences.Editor edit() {
        return new a(this.f5831c, super.edit());
    }
}
