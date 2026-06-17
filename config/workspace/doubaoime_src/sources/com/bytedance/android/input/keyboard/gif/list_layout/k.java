package com.bytedance.android.input.keyboard.gif.list_layout;

import com.bytedance.android.input.keyboard.gif.list_layout.models.ImeImageState;

/* loaded from: classes.dex */
final class k extends kotlin.s.c.m implements kotlin.s.b.p<Throwable, Long, kotlin.o> {
    final /* synthetic */ ImageViewHolder a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.bytedance.android.input.keyboard.gif.list_layout.models.b f2743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(ImageViewHolder imageViewHolder, int i, com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar) {
        super(2);
        this.a = imageViewHolder;
        this.b = i;
        this.f2743c = bVar;
    }

    @Override // kotlin.s.b.p
    public kotlin.o invoke(Throwable th, Long l) {
        com.bytedance.android.input.r.j.r("ImeEmoticons-Adapter", "bindImageView onFailure loadTimeMs = " + l.longValue() + "---e = " + th);
        if (this.a.getAdapterPosition() == this.b) {
            this.f2743c.e(ImeImageState.FAILED);
        }
        return kotlin.o.a;
    }
}
