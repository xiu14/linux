package com.obric.oui.banner;

import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import java.util.Objects;

/* loaded from: classes2.dex */
final class a implements View.OnClickListener {
    final /* synthetic */ BannerAdapter a;

    a(BannerAdapter bannerAdapter) {
        this.a = bannerAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.obric.oui.banner.h.b bVar;
        Object tag = view.getTag(C0838R.id.banner_pos_key);
        Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        bVar = this.a.f7621c;
        if (bVar != null) {
            bVar.a(this.a.b().get(intValue), intValue);
        }
    }
}
