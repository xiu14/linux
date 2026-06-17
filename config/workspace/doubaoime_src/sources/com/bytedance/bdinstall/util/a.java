package com.bytedance.bdinstall.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.bdinstall.AbstractC0622b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {
    private static final p<SharedPreferences> a = new C0168a();

    /* renamed from: com.bytedance.bdinstall.util.a$a, reason: collision with other inner class name */
    static class C0168a extends p<SharedPreferences> {
        C0168a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected SharedPreferences a(Object[] objArr) {
            return ((Context) objArr[0]).getSharedPreferences("ug_install_settings_pref", 0);
        }
    }

    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences("ug_install_settings_pref_" + str, 0);
    }

    public static SharedPreferences b(Context context) {
        return a.b(context);
    }

    public static String c(String str, AbstractC0622b abstractC0622b) {
        if (abstractC0622b.e()) {
            str = e.a.a.a.a.s(str, "_i18n");
        }
        if (abstractC0622b.c()) {
            str = e.a.a.a.a.s(str, "_boe");
        }
        return abstractC0622b.d() ? e.a.a.a.a.s(str, "_cm") : str;
    }
}
