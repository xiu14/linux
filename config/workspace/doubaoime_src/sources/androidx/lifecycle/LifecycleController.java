package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.s.c.l;
import kotlinx.coroutines.InterfaceC0817m0;

@MainThread
@SourceDebugExtension({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
/* loaded from: classes.dex */
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue dispatchQueue, final InterfaceC0817m0 interfaceC0817m0) {
        l.f(lifecycle, "lifecycle");
        l.f(state, "minState");
        l.f(dispatchQueue, "dispatchQueue");
        l.f(interfaceC0817m0, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.d
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(LifecycleController.this, interfaceC0817m0, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            r.z(interfaceC0817m0, null, 1, null);
            finish();
        }
    }

    private final void handleDestroy(InterfaceC0817m0 interfaceC0817m0) {
        r.z(interfaceC0817m0, null, 1, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController lifecycleController, InterfaceC0817m0 interfaceC0817m0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        l.f(lifecycleController, "this$0");
        l.f(interfaceC0817m0, "$parentJob");
        l.f(lifecycleOwner, "source");
        l.f(event, "<anonymous parameter 1>");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            r.z(interfaceC0817m0, null, 1, null);
            lifecycleController.finish();
        } else if (lifecycleOwner.getLifecycle().getCurrentState().compareTo(lifecycleController.minState) < 0) {
            lifecycleController.dispatchQueue.pause();
        } else {
            lifecycleController.dispatchQueue.resume();
        }
    }

    @MainThread
    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
