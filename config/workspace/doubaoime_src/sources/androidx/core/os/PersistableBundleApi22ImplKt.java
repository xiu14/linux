package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.ss.android.message.log.PushLog;
import kotlin.s.c.l;

@RequiresApi(22)
/* loaded from: classes.dex */
final class PersistableBundleApi22ImplKt {
    public static final PersistableBundleApi22ImplKt INSTANCE = new PersistableBundleApi22ImplKt();

    private PersistableBundleApi22ImplKt() {
    }

    @DoNotInline
    public static final void putBoolean(PersistableBundle persistableBundle, String str, boolean z) {
        l.f(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z);
    }

    @DoNotInline
    public static final void putBooleanArray(PersistableBundle persistableBundle, String str, boolean[] zArr) {
        l.f(persistableBundle, "persistableBundle");
        l.f(zArr, PushLog.KEY_VALUE);
        persistableBundle.putBooleanArray(str, zArr);
    }
}
