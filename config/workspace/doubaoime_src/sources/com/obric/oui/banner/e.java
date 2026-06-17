package com.obric.oui.banner;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.obric.oui.banner.OBanner;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class e implements com.obric.oui.banner.h.b {
    final /* synthetic */ OBanner.a a;

    e(OBanner.a aVar) {
        this.a = aVar;
    }

    @Override // com.obric.oui.banner.h.b
    public void a(b bVar, int i) {
        BannerStyle bannerStyle;
        com.obric.oui.banner.h.b bVar2;
        l.f(bVar, RemoteMessageConst.DATA);
        bannerStyle = OBanner.this.u;
        if (bannerStyle.ordinal() == 2) {
            OBanner.e(OBanner.this, bVar, i);
            return;
        }
        bVar2 = OBanner.this.k;
        if (bVar2 != null) {
            bVar2.a(bVar, i);
        }
    }
}
