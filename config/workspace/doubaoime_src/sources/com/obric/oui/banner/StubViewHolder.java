package com.obric.oui.banner;

import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class StubViewHolder extends BannerViewHolder {

    /* renamed from: f, reason: collision with root package name */
    public static final a f7630f = new a(null);

    public static final class a implements d {
        public a(g gVar) {
        }

        @Override // com.obric.oui.banner.d
        public BannerViewHolder a(ViewGroup viewGroup) {
            l.f(viewGroup, "parent");
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return new StubViewHolder(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubViewHolder(View view) {
        super(view);
        l.f(view, "view");
    }

    @Override // com.obric.oui.banner.BannerViewHolder
    public void e(b bVar) {
        l.f(bVar, RemoteMessageConst.DATA);
    }
}
