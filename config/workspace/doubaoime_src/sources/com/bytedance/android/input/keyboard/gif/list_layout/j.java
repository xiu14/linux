package com.bytedance.android.input.keyboard.gif.list_layout;

import com.bytedance.android.input.keyboard.gif.list_layout.models.ImeImageState;
import com.ss.android.socialbase.downloader.constants.DBDefinition;

/* loaded from: classes.dex */
final class j extends kotlin.s.c.m implements kotlin.s.b.l<com.bytedance.android.input.basic.image.g, kotlin.o> {
    final /* synthetic */ ImageViewHolder a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.bytedance.android.input.keyboard.gif.list_layout.models.b f2742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(ImageViewHolder imageViewHolder, int i, com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar) {
        super(1);
        this.a = imageViewHolder;
        this.b = i;
        this.f2742c = bVar;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(com.bytedance.android.input.basic.image.g gVar) {
        com.bytedance.android.input.basic.image.g gVar2 = gVar;
        kotlin.s.c.l.f(gVar2, DBDefinition.SEGMENT_INFO);
        com.bytedance.android.input.r.j.i("ImeEmoticons-Adapter", "bindImageView onSuccess info = " + gVar2);
        if (this.a.getAdapterPosition() == this.b) {
            this.f2742c.e(ImeImageState.SUCCESS);
        }
        return kotlin.o.a;
    }
}
