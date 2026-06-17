package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class ae implements e {
    private static String a = "SpCache";
    private static String b = "com.vivo.push.cache";

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f8898c;

    @Override // com.vivo.push.util.e
    public final boolean a(Context context) {
        if (this.f8898c != null) {
            return true;
        }
        this.f8898c = context.getSharedPreferences(b, 0);
        return true;
    }

    @Override // com.vivo.push.util.e
    public final String a(String str, String str2) {
        String string = this.f8898c.getString(str, str2);
        t.d(a, "getString " + str + " is " + string);
        return string;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.f8898c.edit();
        if (edit != null) {
            edit.clear();
            c.a(edit);
        }
        t.d(a, "system cache is cleared");
    }
}
