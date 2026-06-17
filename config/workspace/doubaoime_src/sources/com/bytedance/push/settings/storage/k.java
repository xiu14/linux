package com.bytedance.push.settings.storage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public interface k {
    String a(String str);

    boolean b(String str);

    long c(String str);

    boolean contains(String str);

    int d(String str);

    float e(String str);

    SharedPreferences.Editor edit();

    boolean getBoolean(String str, boolean z);

    float getFloat(String str, float f2);

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str, String str2);

    void registerValChanged(Context context, String str, String str2, com.bytedance.push.settings.a aVar);

    void unregisterValChanged(com.bytedance.push.settings.a aVar);
}
