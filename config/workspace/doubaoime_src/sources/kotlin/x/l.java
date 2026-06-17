package kotlin.x;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
final class l<T> extends kotlin.s.c.m implements kotlin.s.b.a<T> {
    final /* synthetic */ T a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(T t) {
        super(0);
        this.a = t;
    }

    @Override // kotlin.s.b.a
    public final T invoke() {
        return this.a;
    }
}
