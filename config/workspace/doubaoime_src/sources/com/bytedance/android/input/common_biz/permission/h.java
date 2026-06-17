package com.bytedance.android.input.common_biz.permission;

import kotlin.o;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class h extends m implements kotlin.s.b.a<o> {
    final /* synthetic */ f a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f2268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(f fVar, String str, String str2) {
        super(0);
        this.a = fVar;
        this.b = str;
        this.f2268c = str2;
    }

    @Override // kotlin.s.b.a
    public o invoke() {
        f fVar = this.a;
        if (fVar != null) {
            String str = this.b;
            if (str == null) {
                str = "";
            }
            String str2 = this.f2268c;
            fVar.a(str, str2 != null ? str2 : "");
        }
        return o.a;
    }
}
