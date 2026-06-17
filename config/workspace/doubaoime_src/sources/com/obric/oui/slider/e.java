package com.obric.oui.slider;

import android.content.Context;
import android.view.View;
import android.widget.SeekBar;
import androidx.annotation.RequiresApi;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class e {
    private Integer a;
    private int b = Integer.MAX_VALUE;

    private final void b(Context context, int i, String str, boolean z, View view) {
        if (this.b < 2) {
            e.i.b.f.e.b.a("SeekBarVibrateHelper", "vibrateIfNeeded: " + str);
            if (z) {
                e.i.b.d.a.a(context, i);
            } else if (view != null) {
                try {
                    view.performHapticFeedback(i);
                } catch (Exception e2) {
                    e.i.b.f.e.b.b("VibratorSmt", "performHapticFeedbackAOSP error: " + e2);
                }
            }
            this.b++;
        }
    }

    static /* synthetic */ void c(e eVar, Context context, int i, String str, boolean z, View view, int i2) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        int i3 = i2 & 16;
        eVar.b(context, i, str, z2, null);
    }

    @RequiresApi(26)
    public final void a(Context context, SeekBar seekBar, int i, boolean z, int i2, boolean z2) {
        l.f(context, "context");
        l.f(seekBar, "seekBar");
        if (z) {
            this.b = 0;
        }
        int min = seekBar.getMin();
        int max = seekBar.getMax();
        if (i == min) {
            c(this, context, 5, "hit minProgress", false, null, 24);
            return;
        }
        if (i == max) {
            c(this, context, 4, "hit maxProgress", false, null, 24);
            return;
        }
        int i3 = i2 - 1;
        if (z2) {
            if (i3 > 1) {
                if (this.a != null) {
                    float f2 = (max - min) / i3;
                    for (int i4 = 1; i4 < i3; i4++) {
                        int a = kotlin.t.a.a(i4 * f2) + min;
                        Integer num = this.a;
                        l.c(num);
                        if (num.intValue() >= a || i < a) {
                            Integer num2 = this.a;
                            l.c(num2);
                            if (num2.intValue() <= a || i > a) {
                            }
                        }
                        b(context, 26, "passed boundary: " + i4 + '/' + i3 + ", progress: " + i, false, seekBar);
                        break;
                    }
                }
                this.a = Integer.valueOf(i);
            }
        }
    }
}
