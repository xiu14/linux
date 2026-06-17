package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import com.prolificinteractive.materialcalendarview.r;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d {
    private static volatile Choreographer choreographer;

    static {
        Object J2;
        try {
            J2 = new b(a(Looper.getMainLooper(), true), (String) null, 2);
        } catch (Throwable th) {
            J2 = r.J(th);
        }
    }

    @VisibleForTesting
    public static final Handler a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
