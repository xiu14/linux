package com.bytedance.android.input.common;

import android.content.Context;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;

/* loaded from: classes.dex */
public final class h {
    public static final h a = new h();
    private static boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f2193c;

    /* renamed from: d, reason: collision with root package name */
    private static Integer f2194d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f2195e;

    private h() {
    }

    public static void g(h hVar, Context context, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        kotlin.s.c.l.f(context, "context");
        com.bytedance.android.input.r.j.i("KeyboardLayoutSettings", "saveKeyboardInputLocation " + i);
        f2194d = Integer.valueOf(i);
        String string = context.getString(C0838R.string.pinyin_location_style);
        kotlin.s.c.l.e(string, "context.getString(R.string.pinyin_location_style)");
        hVar.l(string, i, z);
    }

    public static void h(h hVar, Context context, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        kotlin.s.c.l.f(context, "context");
        String string = context.getString(C0838R.string.key26_number_symbol_key_style);
        kotlin.s.c.l.e(string, "context.getString(R.stri…_number_symbol_key_style)");
        hVar.l(string, i, z);
    }

    public static void i(h hVar, Context context, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        kotlin.s.c.l.f(context, "context");
        String string = context.getString(C0838R.string.lang_switch_key_position);
        kotlin.s.c.l.e(string, "context.getString(R.stri…lang_switch_key_position)");
        hVar.l(string, i, z);
    }

    private final void l(String str, int i, boolean z) {
        if (z) {
            KeyboardJni.updateSettingsValueForce(str, i);
        } else {
            KeyboardJni.updateSettingsValue(str, i);
        }
    }

    public final int a(Context context) {
        kotlin.s.c.l.f(context, "context");
        Integer num = f2194d;
        if (num != null) {
            return num.intValue();
        }
        String string = context.getString(C0838R.string.pinyin_location_style);
        kotlin.s.c.l.e(string, "context.getString(R.string.pinyin_location_style)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) f2).intValue();
        f2194d = Integer.valueOf(intValue);
        return intValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common.h.b(android.content.Context, boolean):void");
    }

    public final boolean c() {
        return a(IAppGlobals.a.getContext()) == 1 && KeyboardJni.isSupportPinyinInEditor() && !f2195e;
    }

    public final boolean d(Context context) {
        kotlin.s.c.l.f(context, "context");
        Boolean bool = f2193c;
        if (bool != null) {
            return bool.booleanValue();
        }
        String string = context.getString(C0838R.string.enable_key_fusiyin);
        kotlin.s.c.l.e(string, "context.getString(R.string.enable_key_fusiyin)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) f2).booleanValue();
        f2193c = Boolean.valueOf(booleanValue);
        return booleanValue;
    }

    public final void e(int i) {
        f2194d = Integer.valueOf(i);
    }

    public final void f(boolean z) {
        com.bytedance.android.input.r.j.m("KeyboardLayoutSettings", "markLaunchMode " + z);
        b = z;
    }

    public final void j(Context context, boolean z, boolean z2) {
        kotlin.s.c.l.f(context, "context");
        f2193c = Boolean.valueOf(z);
        String string = context.getString(C0838R.string.enable_key_fusiyin);
        kotlin.s.c.l.e(string, "context.getString(R.string.enable_key_fusiyin)");
        KeyboardJni.updateSettingsBooleanValue(string, z);
    }

    public final void k(boolean z) {
        f2195e = z;
    }
}
