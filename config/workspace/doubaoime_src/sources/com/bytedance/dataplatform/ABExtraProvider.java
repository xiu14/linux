package com.bytedance.dataplatform;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.dataplatform.n;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ABExtraProvider extends ContentProvider {
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
        Context context = getContext();
        try {
            Bundle bundle = context.getPackageManager().getProviderInfo(new ComponentName(context.getPackageName(), ABExtraProvider.class.getName()), 128).metaData;
            if (bundle == null) {
                return true;
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle.keySet()) {
                if (!"____libra____ab____panel".equals(str)) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        hashMap.put(str, obj.toString());
                    }
                } else if (bundle.getBoolean(str, false)) {
                    n.e((n.a) Class.forName("com.bytedance.dataplatform.ExperimentPanelDataManager").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
                }
            }
            m.g(hashMap);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
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
