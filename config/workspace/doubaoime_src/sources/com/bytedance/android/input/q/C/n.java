package com.bytedance.android.input.q.C;

import com.bytedance.android.input.basic.settings.api.IInputSettings;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n extends g {
    public static final n h = new n();
    private static final boolean i = true;

    private n() {
    }

    @Override // com.bytedance.android.input.q.C.v
    protected com.bytedance.android.input.basic.settings.api.c.b b() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.b().c();
    }

    @Override // com.bytedance.android.input.q.C.g, com.bytedance.android.input.q.C.v
    public boolean g() {
        return i;
    }
}
