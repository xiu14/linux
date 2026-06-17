package com.bytedance.android.input.q.C;

import com.bytedance.android.input.basic.settings.api.IInputSettings;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j extends g {
    public static final j h = new j();
    private static final boolean i = true;

    private j() {
    }

    @Override // com.bytedance.android.input.q.C.v
    protected com.bytedance.android.input.basic.settings.api.c.b b() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.b().a();
    }

    @Override // com.bytedance.android.input.q.C.g, com.bytedance.android.input.q.C.v
    public boolean g() {
        return i;
    }
}
