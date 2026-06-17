package com.bytedance.android.input.q.C;

import com.bytedance.android.input.basic.settings.api.IInputSettings;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o extends g {
    public static final o h = new o();
    private static final boolean i = true;

    private o() {
    }

    @Override // com.bytedance.android.input.q.C.v
    protected com.bytedance.android.input.basic.settings.api.c.b b() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.b().d();
    }

    @Override // com.bytedance.android.input.q.C.g, com.bytedance.android.input.q.C.v
    public boolean g() {
        return i;
    }
}
