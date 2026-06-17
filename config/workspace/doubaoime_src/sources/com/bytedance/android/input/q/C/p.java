package com.bytedance.android.input.q.C;

import com.bytedance.android.input.basic.settings.api.IInputSettings;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p extends g {
    public static final p h = new p();

    private p() {
    }

    @Override // com.bytedance.android.input.q.C.v
    protected com.bytedance.android.input.basic.settings.api.c.b b() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.b().e();
    }
}
