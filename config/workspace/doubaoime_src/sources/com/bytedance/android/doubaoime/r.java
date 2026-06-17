package com.bytedance.android.doubaoime;

import android.provider.Settings;

/* loaded from: classes.dex */
final /* synthetic */ class r extends kotlin.s.c.k implements kotlin.s.b.a<Boolean> {
    r(Object obj) {
        super(0, obj, ImeService.class, "isDefaultInputMethod", "isDefaultInputMethod()Z", 0);
    }

    @Override // kotlin.s.b.a
    public Boolean invoke() {
        ImeService imeService = (ImeService) this.receiver;
        int i = ImeService.C;
        String string = Settings.Secure.getString(imeService.getContentResolver(), "default_input_method");
        kotlin.s.c.l.e(string, "defaultInputMethod");
        boolean a = kotlin.s.c.l.a(kotlin.text.a.P(string, '/', null, 2, null), imeService.getPackageName());
        com.bytedance.android.input.r.j.i("ImeService", "default input method: " + string);
        com.bytedance.android.input.r.j.m("ImeService", "is default input method? " + a);
        return Boolean.valueOf(a);
    }
}
