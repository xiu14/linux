package e.c.c.d;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: classes2.dex */
public class k {
    public static final j<Boolean> a = new b();

    /* JADX INFO: Add missing generic type declarations: [T] */
    static class a<T> implements j<T> {
        final /* synthetic */ Object a;

        a(Object obj) {
            this.a = obj;
        }

        @Override // e.c.c.d.j
        public T get() {
            return (T) this.a;
        }
    }

    static class b implements j<Boolean> {
        b() {
        }

        @Override // e.c.c.d.j
        public /* bridge */ /* synthetic */ Boolean get() {
            return Boolean.FALSE;
        }
    }

    public static <T> j<T> a(T t) {
        return new a(t);
    }
}
