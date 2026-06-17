package kotlin.text;

/* loaded from: classes2.dex */
final class m extends kotlin.s.c.m implements kotlin.s.b.l<kotlin.w.d, String> {
    final /* synthetic */ CharSequence a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(CharSequence charSequence) {
        super(1);
        this.a = charSequence;
    }

    @Override // kotlin.s.b.l
    public String invoke(kotlin.w.d dVar) {
        kotlin.w.d dVar2 = dVar;
        kotlin.s.c.l.f(dVar2, "it");
        return a.L(this.a, dVar2);
    }
}
