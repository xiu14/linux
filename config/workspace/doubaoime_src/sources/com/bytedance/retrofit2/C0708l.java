package com.bytedance.retrofit2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.S;

/* renamed from: com.bytedance.retrofit2.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0708l {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.retrofit2.l$a */
    static class a implements InterfaceC0707k {
        private final String a;

        a(String str, String str2) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }
    }

    public static final Object a(Exception exc, kotlin.r.d<?> dVar) {
        S.a().dispatch(dVar.getContext(), new y(dVar, exc));
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (coroutineSingletons == coroutineSingletons) {
            kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
        }
        return coroutineSingletons == coroutineSingletons ? coroutineSingletons : kotlin.o.a;
    }
}
