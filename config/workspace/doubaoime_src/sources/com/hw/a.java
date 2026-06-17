package com.hw;

import com.bytedance.common.push.b;
import com.bytedance.push.g0.f;
import com.hw.HWPushAdapter;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes2.dex */
class a implements Observer {
    final /* synthetic */ int a;
    final /* synthetic */ HWPushAdapter.b.C0354b b;

    a(HWPushAdapter.b.C0354b c0354b, int i) {
        this.b = c0354b;
        this.a = i;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            f.g(HWPushAdapter.TAG, "enable notification status failed because app to background");
            b.e().deleteObserver(this);
            HWPushAdapter.b bVar = HWPushAdapter.b.this;
            HWPushAdapter.this.onUserClickResult(false, bVar.f7508d, this.a, bVar.b);
        }
    }
}
