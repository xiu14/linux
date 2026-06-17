package com.bytedance.android.input.q.C;

import com.bytedance.android.input.basic.settings.api.IInputSettings;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q extends g {
    public static final q h = new q();
    private static final boolean i = true;

    private q() {
    }

    @Override // com.bytedance.android.input.q.C.v
    protected com.bytedance.android.input.basic.settings.api.c.b b() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.b().f();
    }

    @Override // com.bytedance.android.input.q.C.g, com.bytedance.android.input.q.C.v
    public boolean g() {
        return i;
    }
}
