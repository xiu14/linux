package com.obric.oui.slider;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
final class b implements View.OnTouchListener {
    final /* synthetic */ OSlider a;

    b(OSlider oSlider) {
        this.a = oSlider;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SeekBarFloatCompat seekBarFloatCompat;
        SeekBarFloatCompat seekBarFloatCompat2;
        SeekBarFloatCompat seekBarFloatCompat3;
        SeekBarFloatCompat seekBarFloatCompat4;
        SeekBarFloatCompat seekBarFloatCompat5;
        l.e(motionEvent, NotificationCompat.CATEGORY_EVENT);
        int action = motionEvent.getAction();
        if (action == 0) {
            seekBarFloatCompat = this.a.a;
            Drawable thumb = seekBarFloatCompat.getThumb();
            Objects.requireNonNull(thumb, "null cannot be cast to non-null type com.obric.oui.slider.ThumbDrawable");
            ((f) thumb).c(true);
            seekBarFloatCompat2 = this.a.a;
            seekBarFloatCompat2.invalidate();
        } else if (action == 1 || action == 3) {
            seekBarFloatCompat4 = this.a.a;
            Drawable thumb2 = seekBarFloatCompat4.getThumb();
            Objects.requireNonNull(thumb2, "null cannot be cast to non-null type com.obric.oui.slider.ThumbDrawable");
            ((f) thumb2).c(false);
            seekBarFloatCompat5 = this.a.a;
            seekBarFloatCompat5.invalidate();
        }
        seekBarFloatCompat3 = this.a.a;
        seekBarFloatCompat3.invalidate();
        return false;
    }
}
