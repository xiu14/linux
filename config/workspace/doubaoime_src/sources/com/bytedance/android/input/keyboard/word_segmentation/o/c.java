package com.bytedance.android.input.keyboard.word_segmentation.o;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import java.util.List;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class c implements a {
    private a a;

    private final void b() {
        if (this.a != null) {
            return;
        }
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        List<String> u = aVar.a().u();
        this.a = u != null && u.contains(IAppGlobals.a.H()) ? new d() : new b();
    }

    @Override // com.bytedance.android.input.keyboard.word_segmentation.o.a
    public void a(String str) {
        l.f(str, "text");
        b();
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.bytedance.android.input.keyboard.word_segmentation.o.a
    public void init() {
        b();
        a aVar = this.a;
        if (aVar != null) {
            aVar.init();
        }
    }
}
