package androidx.profileinstaller;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
