package com.bytedance.android.input.upgrade;

import com.bytedance.android.input.r.j;
import com.obric.common.upgrade.VersionCheckResponse;

/* loaded from: classes.dex */
public final class b implements com.obric.common.upgrade.o.a {
    final /* synthetic */ a a;
    final /* synthetic */ VersionCheckResponse b;

    b(a aVar, VersionCheckResponse versionCheckResponse) {
        this.a = aVar;
        this.b = versionCheckResponse;
    }

    @Override // com.obric.common.upgrade.o.a
    public void a() {
        a.d(this.a, this.b);
    }

    @Override // com.obric.common.upgrade.o.a
    public void b() {
        j.i("OAppUpgrade", "onPermissionDenied");
        this.a.n(true);
    }
}
