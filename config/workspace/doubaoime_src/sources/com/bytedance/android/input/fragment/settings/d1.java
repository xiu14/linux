package com.bytedance.android.input.fragment.settings;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;

/* loaded from: classes.dex */
final class d1 extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
    public static final d1 a = new d1();

    d1() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(View view) {
        kotlin.s.c.l.f(view, "it");
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("type", 0);
            bundle.putBoolean("isFromApp", true);
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            ContentResolver contentResolver = aVar.getContext().getContentResolver();
            Uri parse = Uri.parse("content://com.bytedance.android.doubaoime.provider");
            kotlin.s.c.l.e(parse, "parse(this)");
            contentResolver.call(parse, "showFeedbackActivity", "", bundle);
        } catch (Exception e2) {
            e.a.a.a.a.n0("showFeedbackActivity failed:", e2, "KeyboardImeComms");
        }
        return kotlin.o.a;
    }
}
