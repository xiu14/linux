package kotlin.r;

import kotlin.r.f;

/* loaded from: classes2.dex */
public interface e extends f.b {
    public static final a F = a.a;

    public static final class a implements f.c<e> {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    <T> d<T> interceptContinuation(d<? super T> dVar);

    void releaseInterceptedContinuation(d<?> dVar);
}
