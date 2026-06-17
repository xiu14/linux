package com.obric.oui.progress;

import android.animation.ValueAnimator;
import com.obric.oui.progress.ODownloadProgressView;

/* loaded from: classes2.dex */
class a implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ODownloadProgressView.a a;

    a(ODownloadProgressView.a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ODownloadProgressView.this.invalidate();
    }
}
