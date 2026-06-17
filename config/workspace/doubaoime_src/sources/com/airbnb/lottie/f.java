package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
class f implements Callable<o<g>> {
    final /* synthetic */ String a;
    final /* synthetic */ LottieAnimationView b;

    f(LottieAnimationView lottieAnimationView, String str) {
        this.b = lottieAnimationView;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public o<g> call() throws Exception {
        boolean z;
        z = this.b.n;
        if (!z) {
            return h.e(this.b.getContext(), this.a, null);
        }
        Context context = this.b.getContext();
        String str = this.a;
        int i = h.f1265c;
        return h.e(context, str, "asset_" + str);
    }
}
