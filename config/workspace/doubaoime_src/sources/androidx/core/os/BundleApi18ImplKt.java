package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.s.c.l;

@RequiresApi(18)
/* loaded from: classes.dex */
final class BundleApi18ImplKt {
    public static final BundleApi18ImplKt INSTANCE = new BundleApi18ImplKt();

    private BundleApi18ImplKt() {
    }

    @DoNotInline
    public static final void putBinder(Bundle bundle, String str, IBinder iBinder) {
        l.f(bundle, "bundle");
        l.f(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
