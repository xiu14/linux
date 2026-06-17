package com.bytedance.android.input.keyboard.s.b.c;

import com.bytedance.android.input.keyboard.gif.send.models.MediaSendResultState;
import com.bytedance.android.input.r.j;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class b implements com.bytedance.android.input.keyboard.s.b.b.a {
    public static final b a = new b();

    private b() {
    }

    @Override // com.bytedance.android.input.keyboard.s.b.b.a
    public void a(com.bytedance.android.input.keyboard.gif.send.models.a aVar, l<? super com.bytedance.android.input.keyboard.gif.send.models.b, o> lVar) {
        kotlin.s.c.l.f(aVar, "request");
        kotlin.s.c.l.f(lVar, "callback");
        j.i("ImeEmoticons-ShareMediaSendImpl", "send request: " + aVar);
        lVar.invoke(new com.bytedance.android.input.keyboard.gif.send.models.b(MediaSendResultState.UN_SUPPORT, aVar.c()));
    }

    @Override // com.bytedance.android.input.keyboard.s.b.b.a
    public boolean b(com.bytedance.android.input.keyboard.gif.send.models.a aVar) {
        kotlin.s.c.l.f(aVar, "request");
        return false;
    }
}
