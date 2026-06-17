package com.bytedance.android.doubaoime.contentProvider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.android.doubaoime.ImeApplication;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.ss.android.message.log.PushLog;

/* loaded from: classes.dex */
public class SettingsContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        if (!(ImeApplication.f1883e != null)) {
            return super.call(str, str2, bundle);
        }
        str.hashCode();
        switch (str) {
            case "updateLongValues":
                Long valueOf = Long.valueOf(bundle.getLong(str2, 0L));
                SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
                SettingsConfigNext.l(str2, valueOf);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("result", true);
                break;
            case "getIntValue":
                int i = bundle != null ? bundle.getInt("defaultValue", 0) : 0;
                SettingsConfigNext settingsConfigNext2 = SettingsConfigNext.a;
                Object f2 = SettingsConfigNext.f(str2);
                if (f2 instanceof Integer) {
                    i = ((Integer) f2).intValue();
                }
                Bundle bundle3 = new Bundle();
                bundle3.putInt(PushLog.KEY_VALUE, i);
                bundle3.putBoolean("result", true);
                break;
            case "updateValues":
                int i2 = bundle.getInt(str2, 0);
                if (bundle.getBoolean("forceUpdate", false)) {
                    SettingsConfigNext settingsConfigNext3 = SettingsConfigNext.a;
                    SettingsConfigNext.o(str2, Integer.valueOf(i2));
                } else {
                    SettingsConfigNext settingsConfigNext4 = SettingsConfigNext.a;
                    SettingsConfigNext.l(str2, Integer.valueOf(i2));
                }
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("result", true);
                break;
            case "updateStringValues":
                String string = bundle.getString(str2, "");
                if (bundle.getBoolean("forceUpdate", false)) {
                    SettingsConfigNext settingsConfigNext5 = SettingsConfigNext.a;
                    SettingsConfigNext.o(str2, string);
                } else {
                    SettingsConfigNext.a.m(str2, string);
                }
                Bundle bundle5 = new Bundle();
                bundle5.putBoolean("result", true);
                break;
            case "updateBoolValues":
                boolean z = bundle.getBoolean(str2, false);
                SettingsConfigNext settingsConfigNext6 = SettingsConfigNext.a;
                SettingsConfigNext.l(str2, Boolean.valueOf(z));
                Bundle bundle6 = new Bundle();
                bundle6.putBoolean("result", true);
                break;
        }
        return super.call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
