package com.bytedance.android.input.t;

import android.content.Context;
import android.util.Log;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import java.util.UUID;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();
    private static volatile String b;

    private a() {
    }

    public final String a() {
        String str = b;
        if (str == null) {
            synchronized (this) {
                str = b;
                if (str == null) {
                    Context context = IAppGlobals.a.getContext();
                    String string = context.getString(C0838R.string.temporary_did);
                    l.e(string, "context.getString(R.string.temporary_did)");
                    Object f2 = SettingsConfigNext.f(string);
                    l.d(f2, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) f2;
                    Log.d("TrackUuidManager", "temporary_did from settings: " + str2);
                    if (str2.length() == 0) {
                        str2 = UUID.randomUUID().toString();
                        l.e(str2, "randomUUID().toString()");
                        Log.d("TrackUuidManager", "new uuid = " + str2);
                        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
                        String string2 = context.getString(C0838R.string.temporary_did);
                        l.e(string2, "context.getString(R.string.temporary_did)");
                        settingsConfigNext.n(string2, str2);
                    }
                    b = str2;
                    str = str2;
                }
            }
        }
        Log.d("TrackUuidManager", "return UUID = " + str);
        return str;
    }
}
