package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements LifecycleEventObserver {
    private final DefaultLifecycleObserver defaultLifecycleObserver;
    private final LifecycleEventObserver lifecycleEventObserver;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Lifecycle.Event.values();
            int[] iArr = new int[7];
            try {
                Lifecycle.Event event = Lifecycle.Event.ON_CREATE;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Lifecycle.Event event3 = Lifecycle.Event.ON_RESUME;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Lifecycle.Event event4 = Lifecycle.Event.ON_PAUSE;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Lifecycle.Event event5 = Lifecycle.Event.ON_STOP;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Lifecycle.Event event6 = Lifecycle.Event.ON_DESTROY;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Lifecycle.Event event7 = Lifecycle.Event.ON_ANY;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, LifecycleEventObserver lifecycleEventObserver) {
        l.f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.defaultLifecycleObserver = defaultLifecycleObserver;
        this.lifecycleEventObserver = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        l.f(lifecycleOwner, "source");
        l.f(event, NotificationCompat.CATEGORY_EVENT);
        switch (event) {
            case ON_CREATE:
                this.defaultLifecycleObserver.onCreate(lifecycleOwner);
                break;
            case ON_START:
                this.defaultLifecycleObserver.onStart(lifecycleOwner);
                break;
            case ON_RESUME:
                this.defaultLifecycleObserver.onResume(lifecycleOwner);
                break;
            case ON_PAUSE:
                this.defaultLifecycleObserver.onPause(lifecycleOwner);
                break;
            case ON_STOP:
                this.defaultLifecycleObserver.onStop(lifecycleOwner);
                break;
            case ON_DESTROY:
                this.defaultLifecycleObserver.onDestroy(lifecycleOwner);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        LifecycleEventObserver lifecycleEventObserver = this.lifecycleEventObserver;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
        }
    }
}
