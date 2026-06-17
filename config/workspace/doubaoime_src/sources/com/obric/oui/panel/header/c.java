package com.obric.oui.panel.header;

import android.content.Context;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class c {
    private Context a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f7908c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7909d;

    /* renamed from: e, reason: collision with root package name */
    private int f7910e;

    c(Context context, boolean z, int i, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        i = (i2 & 4) != 0 ? 0 : i;
        this.f7908c = context;
        this.f7909d = z;
        this.f7910e = i;
        this.b = true;
    }

    public static Context a(c cVar, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = cVar.f7909d;
        }
        l.f(context, "baseContext");
        if (cVar.f7910e != 0) {
            return new ContextThemeWrapper(context, cVar.f7910e);
        }
        ContextThemeWrapper contextThemeWrapper = z ? new ContextThemeWrapper(context, C0838R.style.OBasicPanelDayNightSwitch) : new ContextThemeWrapper(context, C0838R.style.OBasicPanelConstLight);
        cVar.a = contextThemeWrapper;
        return contextThemeWrapper;
    }

    public final boolean b() {
        return this.b;
    }

    public final Context c() {
        Context context = this.a;
        return context != null ? context : a(this, this.f7908c, false, 2, null);
    }

    public abstract View d();
}
