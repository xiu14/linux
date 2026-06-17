package androidx.lifecycle;

import android.view.View;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ViewKt {
    public static final /* synthetic */ LifecycleOwner findViewTreeLifecycleOwner(View view) {
        l.f(view, "<this>");
        return ViewTreeLifecycleOwner.get(view);
    }
}
