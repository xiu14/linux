package com.bytedance.android.input.fragment.settings;

/* renamed from: com.bytedance.android.input.fragment.settings.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576x0 implements com.obric.common.upgrade.o.a {
    final /* synthetic */ kotlin.s.b.l<Boolean, kotlin.o> a;

    /* JADX WARN: Multi-variable type inference failed */
    C0576x0(kotlin.s.b.l<? super Boolean, kotlin.o> lVar) {
        this.a = lVar;
    }

    @Override // com.obric.common.upgrade.o.a
    public void a() {
        this.a.invoke(Boolean.TRUE);
    }

    @Override // com.obric.common.upgrade.o.a
    public void b() {
        com.bytedance.android.input.r.j.i("OAppUpgrade", "onPermissionDenied");
    }
}
