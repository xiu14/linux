package com.bytedance.android.input.keyboard.gif.list_layout;

import com.bytedance.android.input.keyboard.gif.list_layout.models.ImeImageState;

/* loaded from: classes.dex */
final class i extends kotlin.s.c.m implements kotlin.s.b.p<Throwable, Long, kotlin.o> {
    final /* synthetic */ GifViewHolder a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.bytedance.android.input.keyboard.gif.list_layout.models.b f2741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(GifViewHolder gifViewHolder, int i, com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar) {
        super(2);
        this.a = gifViewHolder;
        this.b = i;
        this.f2741c = bVar;
    }

    @Override // kotlin.s.b.p
    public kotlin.o invoke(Throwable th, Long l) {
        com.bytedance.android.input.r.j.r("ImeEmoticons-Adapter", "bindGifView onFailure loadTimeMs = " + l.longValue() + "---e = " + th);
        if (this.a.getAdapterPosition() == this.b) {
            this.f2741c.e(ImeImageState.FAILED);
        }
        return kotlin.o.a;
    }
}
