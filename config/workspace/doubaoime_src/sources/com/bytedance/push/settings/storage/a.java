package com.bytedance.push.settings.storage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes2.dex */
final class a implements f {
    a() {
    }

    @Override // com.bytedance.push.settings.storage.f
    public Bundle a(Context context, String str, Bundle bundle, String str2) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("_storage_key");
        String string2 = bundle.getString("_key");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        Log.d("SettingsManager", "process for " + string);
        bundle2.putBoolean("_result", ((i) com.bytedance.push.settings.h.a()).a(context, true, string, str2).contains(string2));
        return bundle2;
    }
}
