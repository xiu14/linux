package com.bytedance.android.input.speech;

/* loaded from: classes.dex */
public final class AsrConvertInfo {
    private String[] candliste;
    private int highFrequencyCount;

    public AsrConvertInfo(int i, String[] strArr) {
        kotlin.s.c.l.f(strArr, "result");
        this.candliste = new String[0];
        this.highFrequencyCount = i;
        this.candliste = strArr;
    }

    public final String[] getCandliste() {
        return this.candliste;
    }

    public final int getHighFrequencyCount() {
        return this.highFrequencyCount;
    }

    public final void setCandliste(String[] strArr) {
        kotlin.s.c.l.f(strArr, "<set-?>");
        this.candliste = strArr;
    }

    public final void setHighFrequencyCount(int i) {
        this.highFrequencyCount = i;
    }
}
