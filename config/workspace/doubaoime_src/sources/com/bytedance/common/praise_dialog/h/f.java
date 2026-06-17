package com.bytedance.common.praise_dialog.h;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.input.basic.IAppGlobals;

/* loaded from: classes.dex */
public final class f implements e.b.k.c.f {
    @Override // e.b.k.c.f
    public void a(Activity activity, Intent intent, int i) {
        IAppGlobals.a.j("PraiseDialogStartActivityConfigImpl", "startActivityForResult: " + intent + ", " + i);
        if (activity != null) {
            activity.startActivityForResult(intent, i);
        }
    }

    @Override // e.b.k.c.f
    public void b(Context context, Intent intent) {
        IAppGlobals.a.j("PraiseDialogStartActivityConfigImpl", "startActivity: " + intent);
        if (context != null) {
            context.startActivity(intent);
        }
    }
}
