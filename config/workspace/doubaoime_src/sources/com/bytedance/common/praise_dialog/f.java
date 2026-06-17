package com.bytedance.common.praise_dialog;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class f implements e.b.k.b.b {

    /* renamed from: c, reason: collision with root package name */
    private static final f f4159c = new f();
    private e.b.k.b.c a;
    private Activity b;

    @Override // e.b.k.b.b
    public void a(e.b.k.b.c cVar) {
        f4159c.a = cVar;
        Intent intent = new Intent(this.b, (Class<?>) CustomDialog.class);
        Activity activity = this.b;
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    public final e.b.k.b.c c() {
        return this.a;
    }

    public final void d(Activity activity) {
        this.b = activity;
    }
}
