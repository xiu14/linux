package com.bytedance.android.input.keyboard.u;

import android.view.View;
import com.bytedance.android.input.keyboard.u.d.b;
import com.bytedance.android.input.keyboard.u.d.c;
import com.bytedance.android.input.keyboard.u.d.d;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateKeyType;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a implements com.bytedance.android.input.keyboard.u.c.a {
    public static final a a = new a();
    private static final List<com.bytedance.android.input.keyboard.u.c.a> b = g.G(new c(), new d(), new com.bytedance.android.input.keyboard.u.d.a(), new b());

    private a() {
    }

    @Override // com.bytedance.android.input.keyboard.u.c.a
    public boolean b(VibrateKeyType vibrateKeyType, com.bytedance.android.input.keyboard.vibrate.entity.a aVar, View view) {
        l.f(vibrateKeyType, "vibrateKeyType");
        l.f(aVar, "vibrateParams");
        Iterator<T> it2 = b.iterator();
        while (it2.hasNext()) {
            if (((com.bytedance.android.input.keyboard.u.c.a) it2.next()).b(vibrateKeyType, aVar, view)) {
                return true;
            }
        }
        return false;
    }
}
