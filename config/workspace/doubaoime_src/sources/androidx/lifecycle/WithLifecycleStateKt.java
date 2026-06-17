package androidx.lifecycle;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.r.g;
import kotlin.s.c.l;
import kotlinx.coroutines.C0814l;
import kotlinx.coroutines.D;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;
import kotlinx.coroutines.v0;

@SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
/* loaded from: classes.dex */
public final class WithLifecycleStateKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z, D d2, final kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        final C0814l c0814l = new C0814l(kotlin.coroutines.intrinsics.a.d(dVar), 1);
        c0814l.v();
        final ?? r1 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Object J2;
                l.f(lifecycleOwner, "source");
                l.f(event, NotificationCompat.CATEGORY_EVENT);
                if (event != Lifecycle.Event.Companion.upTo(Lifecycle.State.this)) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        c0814l.resumeWith(r.J(new LifecycleDestroyedException()));
                        return;
                    }
                    return;
                }
                lifecycle.removeObserver(this);
                kotlin.r.d dVar2 = c0814l;
                try {
                    J2 = aVar.invoke();
                } catch (Throwable th) {
                    J2 = r.J(th);
                }
                dVar2.resumeWith(J2);
            }
        };
        if (z) {
            d2.dispatch(g.a, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    Lifecycle.this.addObserver(r1);
                }
            });
        } else {
            lifecycle.addObserver(r1);
        }
        c0814l.f(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(d2, lifecycle, r1));
        Object u = c0814l.u();
        if (u == CoroutineSingletons.COROUTINE_SUSPENDED) {
            l.f(dVar, TypedValues.AttributesType.S_FRAME);
        }
        return u;
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        int i = S.f10199c;
        v0 U = q.f10173c.U();
        boolean isDispatchNeeded = U.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, U, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        int i = S.f10199c;
        q.f10173c.U();
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        int i = S.f10199c;
        v0 U = q.f10173c.U();
        boolean isDispatchNeeded = U.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, U, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        int i = S.f10199c;
        q.f10173c.U();
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        int i = S.f10199c;
        v0 U = q.f10173c.U();
        boolean isDispatchNeeded = U.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, U, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        int i = S.f10199c;
        q.f10173c.U();
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        int i = S.f10199c;
        v0 U = q.f10173c.U();
        boolean isDispatchNeeded = U.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, U, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            int i = S.f10199c;
            q.f10173c.U();
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        int i = S.f10199c;
        v0 U = q.f10173c.U();
        boolean isDispatchNeeded = U.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, U, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        int i = S.f10199c;
        q.f10173c.U();
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        int i = S.f10199c;
        q.f10173c.U();
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        int i = S.f10199c;
        q.f10173c.U();
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        int i = S.f10199c;
        q.f10173c.U();
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        int i = S.f10199c;
        q.f10173c.U();
        throw null;
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        int i = S.f10199c;
        v0 U = q.f10173c.U();
        boolean isDispatchNeeded = U.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, U, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        int i = S.f10199c;
        v0 U = q.f10173c.U();
        boolean isDispatchNeeded = U.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, U, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        int i = S.f10199c;
        v0 U = q.f10173c.U();
        boolean isDispatchNeeded = U.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, U, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, kotlin.s.b.a<? extends R> aVar, kotlin.r.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            int i = S.f10199c;
            v0 U = q.f10173c.U();
            boolean isDispatchNeeded = U.isDispatchNeeded(dVar.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return aVar.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, U, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
