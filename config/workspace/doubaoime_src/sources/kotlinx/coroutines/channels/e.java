package kotlinx.coroutines.channels;

/* loaded from: classes2.dex */
public interface e<E> extends w<E>, s<E> {
    public static final a I = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final int b = kotlinx.coroutines.N0.r.d("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private a() {
        }

        public final int a() {
            return b;
        }
    }
}
