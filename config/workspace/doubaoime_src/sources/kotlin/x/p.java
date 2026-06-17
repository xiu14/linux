package kotlin.x;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
final class p<T> extends kotlin.s.c.m implements kotlin.s.b.l<T, Boolean> {
    public static final p a = new p();

    p() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public Boolean invoke(Object obj) {
        return Boolean.valueOf(obj == null);
    }
}
