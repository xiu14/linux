package com.bytedance.praisedialoglib.manager;

import android.app.Activity;
import com.bytedance.praisedialoglib.googleplay.IGooglePlayPraiseCallback;

/* loaded from: classes.dex */
class c implements IGooglePlayPraiseCallback {
    final /* synthetic */ Activity a;
    final /* synthetic */ d b;

    c(d dVar, Activity activity) {
        this.b = dVar;
        this.a = activity;
    }

    @Override // com.bytedance.praisedialoglib.googleplay.IGooglePlayPraiseCallback
    public void statusCallback(boolean z) {
        if (z) {
            return;
        }
        this.b.n(this.a);
    }
}
