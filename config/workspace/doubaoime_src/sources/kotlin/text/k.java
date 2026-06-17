package kotlin.text;

import kotlin.s.b.p;

/* loaded from: classes2.dex */
final class k extends kotlin.s.c.m implements p<CharSequence, Integer, kotlin.g<? extends Integer, ? extends Integer>> {
    final /* synthetic */ char[] a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(char[] cArr, boolean z) {
        super(2);
        this.a = cArr;
        this.b = z;
    }

    @Override // kotlin.s.b.p
    public kotlin.g<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        kotlin.s.c.l.f(charSequence2, "$this$$receiver");
        int r = a.r(charSequence2, this.a, intValue, this.b);
        if (r < 0) {
            return null;
        }
        return new kotlin.g<>(Integer.valueOf(r), 1);
    }
}
