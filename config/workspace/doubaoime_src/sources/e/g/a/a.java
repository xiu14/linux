package e.g.a;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import org.threeten.bp.zone.g;

/* loaded from: classes2.dex */
public final class a {
    private static final AtomicBoolean a = new AtomicBoolean();

    public static void a(Context context) {
        if (a.getAndSet(true)) {
            return;
        }
        g.c(new b(context));
    }
}
