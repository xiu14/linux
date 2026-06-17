package com.obric.oui.slider;

import android.widget.SeekBar;
import com.obric.oui.slider.TickMarkSeekBar;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c implements TickMarkSeekBar.a {
    final /* synthetic */ OSlider a;

    c(OSlider oSlider) {
        this.a = oSlider;
    }

    @Override // com.obric.oui.slider.TickMarkSeekBar.a
    public void a(SeekBar seekBar, float f2, boolean z) {
        TickMarkSeekBar.a aVar;
        float k;
        OSlider.g(this.a, f2);
        this.a.k(f2);
        Objects.requireNonNull(this.a);
        aVar = this.a.f8027g;
        if (aVar != null) {
            k = this.a.k(f2);
            aVar.a(seekBar, k, z);
        }
    }

    @Override // com.obric.oui.slider.TickMarkSeekBar.a
    public void b(int i) {
        TickMarkSeekBar.a aVar;
        aVar = this.a.f8027g;
        if (aVar != null) {
            aVar.b(i);
        }
    }

    @Override // com.obric.oui.slider.TickMarkSeekBar.a
    public void onStartTrackingTouch(SeekBar seekBar) {
        TickMarkSeekBar.a aVar;
        OSlider oSlider = this.a;
        int i = OSlider.p;
        Objects.requireNonNull(oSlider);
        aVar = this.a.f8027g;
        if (aVar != null) {
            aVar.onStartTrackingTouch(seekBar);
        }
    }

    @Override // com.obric.oui.slider.TickMarkSeekBar.a
    public void onStopTrackingTouch(SeekBar seekBar) {
        TickMarkSeekBar.a aVar;
        OSlider oSlider = this.a;
        int i = OSlider.p;
        Objects.requireNonNull(oSlider);
        aVar = this.a.f8027g;
        if (aVar != null) {
            aVar.onStopTrackingTouch(seekBar);
        }
    }
}
