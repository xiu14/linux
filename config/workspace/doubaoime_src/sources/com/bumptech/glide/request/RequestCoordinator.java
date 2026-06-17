package com.bumptech.glide.request;

/* loaded from: classes.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean z) {
            this.isComplete = z;
        }

        boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a();

    void b(e eVar);

    boolean e(e eVar);

    boolean f(e eVar);

    RequestCoordinator getRoot();

    void h(e eVar);

    boolean i(e eVar);
}
