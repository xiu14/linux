package kotlin.text;

/* loaded from: classes2.dex */
final class g extends kotlin.s.c.m implements kotlin.s.b.a<e> {
    final /* synthetic */ i a;
    final /* synthetic */ CharSequence b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f10133c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(i iVar, CharSequence charSequence, int i) {
        super(0);
        this.a = iVar;
        this.b = charSequence;
        this.f10133c = i;
    }

    @Override // kotlin.s.b.a
    public e invoke() {
        return this.a.b(this.b, this.f10133c);
    }
}
