package com.bytedance.android.input.q;

import com.bytedance.android.input.basic.recognition.api.a;
import java.util.List;
import java.util.Map;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.ChatIntentWithRequest$request$1", f = "ChatIntentWithRequest.kt", l = {193, 197}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class u extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.flow.g<? super Map<String, ? extends Object>>, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    private /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<a.b> f2998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(List<a.b> list, kotlin.r.d<? super u> dVar) {
        super(2, dVar);
        this.f2998c = list;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        u uVar = new u(this.f2998c, dVar);
        uVar.b = obj;
        return uVar;
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.flow.g<? super Map<String, ? extends Object>> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        u uVar = new u(this.f2998c, dVar);
        uVar.b = gVar;
        return uVar.invokeSuspend(kotlin.o.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x017c  */
    @Override // kotlin.r.h.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.q.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
