package com.bytedance.android.input.fragment.message;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common_biz.ui.widget.ImeCustomSwipeLayout;

/* loaded from: classes.dex */
public final class i implements ImeCustomSwipeLayout.b {
    final /* synthetic */ MessageCenterViewHolder a;
    final /* synthetic */ MessageCenterAdapter b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ImageView f2355c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ LinearLayout f2356d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ImeCustomSwipeLayout f2357e;

    i(MessageCenterViewHolder messageCenterViewHolder, MessageCenterAdapter messageCenterAdapter, ImageView imageView, LinearLayout linearLayout, ImeCustomSwipeLayout imeCustomSwipeLayout) {
        this.a = messageCenterViewHolder;
        this.b = messageCenterAdapter;
        this.f2355c = imageView;
        this.f2356d = linearLayout;
        this.f2357e = imeCustomSwipeLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r0 = r4.b.e(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.common_biz.ui.widget.ImeCustomSwipeLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.bytedance.common_biz.ui.widget.ImeCustomSwipeLayout r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "layout"
            kotlin.s.c.l.f(r5, r0)
            com.bytedance.android.input.fragment.message.MessageCenterViewHolder r5 = r4.a
            com.bytedance.android.doubaoime.databinding.ItemMessageCenterBinding r5 = r5.a()
            com.bytedance.common_biz.ui.widget.ImeCustomSwipeLayout r5 = r5.a()
            java.lang.Object r5 = r5.getTag()
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L1a
            java.lang.String r5 = (java.lang.String) r5
            goto L1b
        L1a:
            r5 = 0
        L1b:
            if (r5 != 0) goto L1e
            return
        L1e:
            com.bytedance.android.input.fragment.message.MessageCenterAdapter r0 = r4.b
            int r0 = com.bytedance.android.input.fragment.message.MessageCenterAdapter.a(r0, r5)
            r1 = -1
            if (r0 == r1) goto L7c
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L39
            com.bytedance.android.input.fragment.message.MessageCenterAdapter r3 = r4.b
            java.util.List r3 = com.bytedance.android.input.fragment.message.MessageCenterAdapter.b(r3)
            int r3 = r3.size()
            if (r0 >= r3) goto L39
            r3 = r1
            goto L3a
        L39:
            r3 = r2
        L3a:
            if (r3 != 0) goto L3d
            goto L7c
        L3d:
            com.bytedance.android.input.fragment.message.MessageCenterAdapter r3 = r4.b
            java.util.List r3 = com.bytedance.android.input.fragment.message.MessageCenterAdapter.b(r3)
            java.lang.Object r0 = r3.get(r0)
            com.bytedance.android.input.fragment.message.entity.c r0 = (com.bytedance.android.input.fragment.message.entity.c) r0
            r0.j(r6)
            if (r6 == 0) goto L54
            com.bytedance.android.input.fragment.message.MessageCenterAdapter r6 = r4.b
            r6.c(r1, r5)
            goto L7c
        L54:
            android.widget.ImageView r5 = r4.f2355c
            android.widget.LinearLayout r6 = r4.f2356d
            android.view.ViewPropertyAnimator r0 = r5.animate()
            r0.cancel()
            android.view.ViewPropertyAnimator r0 = r6.animate()
            r0.cancel()
            r6.clearAnimation()
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setScaleX(r0)
            r6.setAlpha(r0)
            r5.setVisibility(r2)
            r5.setAlpha(r0)
            r5 = 8
            r6.setVisibility(r5)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.fragment.message.i.a(com.bytedance.common_biz.ui.widget.ImeCustomSwipeLayout, boolean):void");
    }
}
