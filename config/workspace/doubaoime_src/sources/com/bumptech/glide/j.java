package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<com.bumptech.glide.j<TranscodeType>>] */
/* loaded from: classes.dex */
public class j<TranscodeType> extends com.bumptech.glide.request.a<j<TranscodeType>> implements Cloneable {
    private final Context A;
    private final k B;
    private final Class<TranscodeType> C;
    private final e D;

    @NonNull
    private l<?, ? super TranscodeType> E;

    /* renamed from: J, reason: collision with root package name */
    @Nullable
    private Object f1555J;

    @Nullable
    private List<com.bumptech.glide.request.g<TranscodeType>> K;

    @Nullable
    private j<TranscodeType> L;

    @Nullable
    private j<TranscodeType> M;
    private boolean N = true;
    private boolean O;
    private boolean P;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            Priority.values();
            int[] iArr = new int[4];
            b = iArr;
            try {
                Priority priority = Priority.LOW;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = b;
                Priority priority2 = Priority.NORMAL;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = b;
                Priority priority3 = Priority.HIGH;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = b;
                Priority priority4 = Priority.IMMEDIATE;
                iArr4[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr5 = new int[ImageView.ScaleType.values().length];
            a = iArr5;
            try {
                iArr5[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new com.bumptech.glide.request.h().e(com.bumptech.glide.load.engine.j.b).S(Priority.LOW).W(true);
    }

    @SuppressLint({"CheckResult"})
    protected j(@NonNull c cVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.B = kVar;
        this.C = cls;
        this.A = context;
        this.E = kVar.a.g().e(cls);
        this.D = cVar.g();
        Iterator<com.bumptech.glide.request.g<Object>> it2 = kVar.p().iterator();
        while (it2.hasNext()) {
            c0((com.bumptech.glide.request.g) it2.next());
        }
        a(kVar.q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.bumptech.glide.request.e e0(Object obj, com.bumptech.glide.request.k.h<TranscodeType> hVar, @Nullable com.bumptech.glide.request.g<TranscodeType> gVar, @Nullable RequestCoordinator requestCoordinator, l<?, ? super TranscodeType> lVar, Priority priority, int i, int i2, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        com.bumptech.glide.request.b bVar;
        RequestCoordinator requestCoordinator2;
        com.bumptech.glide.request.e o0;
        if (this.M != null) {
            requestCoordinator2 = new com.bumptech.glide.request.b(obj, requestCoordinator);
            bVar = requestCoordinator2;
        } else {
            bVar = 0;
            requestCoordinator2 = requestCoordinator;
        }
        j<TranscodeType> jVar = this.L;
        if (jVar == null) {
            o0 = o0(obj, hVar, gVar, aVar, requestCoordinator2, lVar, priority, i, i2, executor);
        } else {
            if (this.P) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            l<?, ? super TranscodeType> lVar2 = jVar.N ? lVar : jVar.E;
            Priority s = jVar.D() ? this.L.s() : g0(priority);
            int p = this.L.p();
            int o = this.L.o();
            if (com.bumptech.glide.util.j.j(i, i2) && !this.L.J()) {
                p = aVar.p();
                o = aVar.o();
            }
            com.bumptech.glide.request.j jVar2 = new com.bumptech.glide.request.j(obj, requestCoordinator2);
            com.bumptech.glide.request.e o02 = o0(obj, hVar, gVar, aVar, jVar2, lVar, priority, i, i2, executor);
            this.P = true;
            j<TranscodeType> jVar3 = this.L;
            com.bumptech.glide.request.e e0 = jVar3.e0(obj, hVar, gVar, jVar2, lVar2, s, p, o, jVar3, executor);
            this.P = false;
            jVar2.j(o02, e0);
            o0 = jVar2;
        }
        if (bVar == 0) {
            return o0;
        }
        int p2 = this.M.p();
        int o2 = this.M.o();
        if (com.bumptech.glide.util.j.j(i, i2) && !this.M.J()) {
            p2 = aVar.p();
            o2 = aVar.o();
        }
        j<TranscodeType> jVar4 = this.M;
        bVar.j(o0, jVar4.e0(obj, hVar, gVar, bVar, jVar4.E, jVar4.s(), p2, o2, this.M, executor));
        return bVar;
    }

    @NonNull
    private Priority g0(@NonNull Priority priority) {
        int ordinal = priority.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return Priority.IMMEDIATE;
        }
        if (ordinal == 2) {
            return Priority.HIGH;
        }
        if (ordinal == 3) {
            return Priority.NORMAL;
        }
        StringBuilder M = e.a.a.a.a.M("unknown priority: ");
        M.append(s());
        throw new IllegalArgumentException(M.toString());
    }

    private <Y extends com.bumptech.glide.request.k.h<TranscodeType>> Y i0(@NonNull Y y, @Nullable com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        Objects.requireNonNull(y, "Argument must not be null");
        if (!this.O) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        com.bumptech.glide.request.e e0 = e0(new Object(), y, gVar, null, this.E, aVar.s(), aVar.p(), aVar.o(), aVar, executor);
        com.bumptech.glide.request.e i = y.i();
        if (e0.c(i)) {
            if (!(!aVar.C() && i.isComplete())) {
                Objects.requireNonNull(i, "Argument must not be null");
                if (!i.isRunning()) {
                    i.g();
                }
                return y;
            }
        }
        this.B.n(y);
        y.c(e0);
        this.B.v(y, e0);
        return y;
    }

    @NonNull
    private j<TranscodeType> n0(@Nullable Object obj) {
        if (A()) {
            return clone().n0(obj);
        }
        this.f1555J = obj;
        this.O = true;
        T();
        return this;
    }

    private com.bumptech.glide.request.e o0(Object obj, com.bumptech.glide.request.k.h<TranscodeType> hVar, com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, RequestCoordinator requestCoordinator, l<?, ? super TranscodeType> lVar, Priority priority, int i, int i2, Executor executor) {
        Context context = this.A;
        e eVar = this.D;
        return SingleRequest.m(context, eVar, obj, this.f1555J, this.C, aVar, i, i2, priority, hVar, gVar, this.K, requestCoordinator, eVar.f(), lVar.b(), executor);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> c0(@Nullable com.bumptech.glide.request.g<TranscodeType> gVar) {
        if (A()) {
            return clone().c0(gVar);
        }
        if (gVar != null) {
            if (this.K == null) {
                this.K = new ArrayList();
            }
            this.K.add(gVar);
        }
        T();
        return this;
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public j<TranscodeType> a(@NonNull com.bumptech.glide.request.a<?> aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        return (j) super.a(aVar);
    }

    @Override // com.bumptech.glide.request.a
    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return super.equals(jVar) && Objects.equals(this.C, jVar.C) && this.E.equals(jVar.E) && Objects.equals(this.f1555J, jVar.f1555J) && Objects.equals(this.K, jVar.K) && Objects.equals(this.L, jVar.L) && Objects.equals(this.M, jVar.M) && Objects.equals(null, null) && this.N == jVar.N && this.O == jVar.O;
    }

    @Override // com.bumptech.glide.request.a
    @CheckResult
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public j<TranscodeType> clone() {
        j<TranscodeType> jVar = (j) super.clone();
        jVar.E = (l<?, ? super TranscodeType>) jVar.E.a();
        if (jVar.K != null) {
            jVar.K = new ArrayList(jVar.K);
        }
        j<TranscodeType> jVar2 = jVar.L;
        if (jVar2 != null) {
            jVar.L = jVar2.clone();
        }
        j<TranscodeType> jVar3 = jVar.M;
        if (jVar3 != null) {
            jVar.M = jVar3.clone();
        }
        return jVar;
    }

    @NonNull
    public <Y extends com.bumptech.glide.request.k.h<TranscodeType>> Y h0(@NonNull Y y) {
        i0(y, null, this, com.bumptech.glide.util.d.b());
        return y;
    }

    @Override // com.bumptech.glide.request.a
    public int hashCode() {
        return (((com.bumptech.glide.util.j.g(null, com.bumptech.glide.util.j.g(this.M, com.bumptech.glide.util.j.g(this.L, com.bumptech.glide.util.j.g(this.K, com.bumptech.glide.util.j.g(this.f1555J, com.bumptech.glide.util.j.g(this.E, com.bumptech.glide.util.j.g(this.C, super.hashCode()))))))) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0);
    }

    @NonNull
    public com.bumptech.glide.request.k.i<ImageView, TranscodeType> j0(@NonNull ImageView imageView) {
        com.bumptech.glide.request.a<?> aVar;
        com.bumptech.glide.util.j.a();
        Objects.requireNonNull(imageView, "Argument must not be null");
        if (!I() && G() && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().L();
                    break;
                case 2:
                    aVar = clone().M();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().N();
                    break;
                case 6:
                    aVar = clone().M();
                    break;
            }
            com.bumptech.glide.request.k.i<ImageView, TranscodeType> a2 = this.D.a(imageView, this.C);
            i0(a2, null, aVar, com.bumptech.glide.util.d.b());
            return a2;
        }
        aVar = this;
        com.bumptech.glide.request.k.i<ImageView, TranscodeType> a22 = this.D.a(imageView, this.C);
        i0(a22, null, aVar, com.bumptech.glide.util.d.b());
        return a22;
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> k0(@Nullable com.bumptech.glide.request.g<TranscodeType> gVar) {
        if (A()) {
            return clone().k0(gVar);
        }
        this.K = null;
        return c0(gVar);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> l0(@Nullable Object obj) {
        return n0(obj);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> m0(@Nullable String str) {
        return n0(str);
    }

    @NonNull
    public com.bumptech.glide.request.d<TranscodeType> p0() {
        com.bumptech.glide.request.f fVar = new com.bumptech.glide.request.f(Integer.MIN_VALUE, Integer.MIN_VALUE);
        i0(fVar, fVar, this, com.bumptech.glide.util.d.a());
        return fVar;
    }
}
