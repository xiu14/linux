package com.obric.oui.slider;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.SeekBar;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class SeekBarCompat extends TickMarkSeekBar {
    private int m;
    private SeekBar.OnSeekBarChangeListener n;

    public static final class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Log.i("SeekBarCompat", String.valueOf(i));
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = SeekBarCompat.this.n;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(seekBar, SeekBarCompat.o(SeekBarCompat.this, i), z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = SeekBarCompat.this.n;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = SeekBarCompat.this.n;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
        }
    }

    public SeekBarCompat(Context context) {
        this(context, null, 0);
    }

    public static final int o(SeekBarCompat seekBarCompat, int i) {
        return i + seekBarCompat.m;
    }

    @Override // android.widget.ProgressBar
    public int getProgress() {
        return super.getProgress() + this.m;
    }

    public final void setMaxValue(int i) {
        setMax(i - this.m);
    }

    public final void setMinValue(int i) {
        this.m = i;
        setMax(getMax() - this.m);
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.n = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(new a());
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        super.setProgress(i - this.m);
    }

    public SeekBarCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBarCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i, boolean z) {
        super.setProgress(i - this.m, z);
    }
}
