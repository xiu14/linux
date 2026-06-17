package com.airbnb.lottie;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
class e implements Callable<o<g>> {
    final /* synthetic */ int a;
    final /* synthetic */ LottieAnimationView b;

    e(LottieAnimationView lottieAnimationView, int i) {
        this.b = lottieAnimationView;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public o<g> call() throws Exception {
        boolean z;
        z = this.b.n;
        return z ? h.k(this.b.getContext(), this.a) : h.l(this.b.getContext(), this.a, null);
    }
}
