package com.obric.oui.dialog.alert;

import java.util.Objects;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* compiled from: kotlin-style lambda group */
/* loaded from: classes2.dex */
public final class a extends m implements l<CharSequence, o> {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, Object obj, Object obj2) {
        super(1);
        this.a = i;
        this.b = obj;
        this.f7710c = obj2;
    }

    @Override // kotlin.s.b.l
    public final o invoke(CharSequence charSequence) {
        boolean z;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw null;
            }
            CharSequence charSequence2 = charSequence;
            kotlin.s.c.l.f(charSequence2, "it");
            b.x((b) this.f7710c, charSequence2, false, 2, null);
            Objects.requireNonNull((e) this.b);
            return o.a;
        }
        CharSequence charSequence3 = charSequence;
        kotlin.s.c.l.f(charSequence3, "it");
        z = ((e) this.b).h;
        if (z) {
            ((b) this.f7710c).y(charSequence3);
        } else {
            ((b) this.f7710c).z(charSequence3);
        }
        return o.a;
    }
}
