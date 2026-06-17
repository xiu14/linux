package com.bytedance.common.utility.i;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class a {
    static final InterfaceC0177a a = new b();

    /* renamed from: com.bytedance.common.utility.i.a$a, reason: collision with other inner class name */
    interface InterfaceC0177a {
    }

    static class b implements InterfaceC0177a {
        b() {
        }
    }

    public static void a(SharedPreferences.Editor editor) {
        editor.apply();
    }
}
