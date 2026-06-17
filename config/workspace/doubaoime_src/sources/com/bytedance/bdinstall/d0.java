package com.bytedance.bdinstall;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
class d0 extends ContentObserver {
    final /* synthetic */ c0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(c0 c0Var, Handler handler) {
        super(handler);
        this.a = c0Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        onChange(z);
        c0.b(this.a, uri);
    }
}
