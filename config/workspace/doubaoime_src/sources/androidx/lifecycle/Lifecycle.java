package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import com.bytedance.common.wschannel.WsConstants;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public abstract class Lifecycle {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>();

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    State.values();
                    int[] iArr = new int[5];
                    try {
                        State state = State.CREATED;
                        iArr[2] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        State state2 = State.STARTED;
                        iArr[3] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        State state3 = State.RESUMED;
                        iArr[4] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        State state4 = State.DESTROYED;
                        iArr[0] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        State state5 = State.INITIALIZED;
                        iArr[1] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final Event downFrom(State state) {
                l.f(state, WsConstants.KEY_CONNECTION_STATE);
                int ordinal = state.ordinal();
                if (ordinal == 2) {
                    return Event.ON_DESTROY;
                }
                if (ordinal == 3) {
                    return Event.ON_STOP;
                }
                if (ordinal != 4) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            public final Event downTo(State state) {
                l.f(state, WsConstants.KEY_CONNECTION_STATE);
                int ordinal = state.ordinal();
                if (ordinal == 0) {
                    return Event.ON_DESTROY;
                }
                if (ordinal == 2) {
                    return Event.ON_STOP;
                }
                if (ordinal != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            public final Event upFrom(State state) {
                l.f(state, WsConstants.KEY_CONNECTION_STATE);
                int ordinal = state.ordinal();
                if (ordinal == 1) {
                    return Event.ON_CREATE;
                }
                if (ordinal == 2) {
                    return Event.ON_START;
                }
                if (ordinal != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }

            public final Event upTo(State state) {
                l.f(state, WsConstants.KEY_CONNECTION_STATE);
                int ordinal = state.ordinal();
                if (ordinal == 2) {
                    return Event.ON_CREATE;
                }
                if (ordinal == 3) {
                    return Event.ON_START;
                }
                if (ordinal != 4) {
                    return null;
                }
                return Event.ON_RESUME;
            }
        }

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                Event.values();
                int[] iArr = new int[7];
                try {
                    Event event = Event.ON_CREATE;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Event event2 = Event.ON_STOP;
                    iArr[4] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Event event3 = Event.ON_START;
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    Event event4 = Event.ON_PAUSE;
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    Event event5 = Event.ON_RESUME;
                    iArr[2] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    Event event6 = Event.ON_DESTROY;
                    iArr[5] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    Event event7 = Event.ON_ANY;
                    iArr[6] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static final Event downFrom(State state) {
            return Companion.downFrom(state);
        }

        public static final Event downTo(State state) {
            return Companion.downTo(state);
        }

        public static final Event upFrom(State state) {
            return Companion.upFrom(state);
        }

        public static final Event upTo(State state) {
            return Companion.upTo(state);
        }

        public final State getTargetState() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return State.RESUMED;
                    }
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return State.DESTROYED;
                            }
                            throw new IllegalArgumentException(this + " has no target state");
                        }
                    }
                }
                return State.STARTED;
            }
            return State.CREATED;
        }
    }

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(State state) {
            l.f(state, WsConstants.KEY_CONNECTION_STATE);
            return compareTo(state) >= 0;
        }
    }

    @MainThread
    public abstract void addObserver(LifecycleObserver lifecycleObserver);

    @MainThread
    public abstract State getCurrentState();

    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    @MainThread
    public abstract void removeObserver(LifecycleObserver lifecycleObserver);

    public final void setInternalScopeRef(AtomicReference<Object> atomicReference) {
        l.f(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
