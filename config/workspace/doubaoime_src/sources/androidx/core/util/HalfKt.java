package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.RequiresApi;
import kotlin.s.c.l;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class HalfKt {
    @RequiresApi(26)
    public static final Half toHalf(short s) {
        Half valueOf = Half.valueOf(s);
        l.e(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(float f2) {
        Half valueOf = Half.valueOf(f2);
        l.e(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(String str) {
        l.f(str, "<this>");
        Half valueOf = Half.valueOf(str);
        l.e(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(double d2) {
        Half valueOf = Half.valueOf((float) d2);
        l.e(valueOf, "valueOf(this)");
        return valueOf;
    }
}
