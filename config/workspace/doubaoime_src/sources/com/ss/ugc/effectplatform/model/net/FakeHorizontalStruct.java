package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class FakeHorizontalStruct {
    public Double Bottom;
    public Double Left;
    public Double Right;
    public Double Top;

    public FakeHorizontalStruct() {
        this(null, null, null, null, 15, null);
    }

    public FakeHorizontalStruct(Double d2, Double d3, Double d4, Double d5) {
        this.Top = d2;
        this.Bottom = d3;
        this.Left = d4;
        this.Right = d5;
    }

    public /* synthetic */ FakeHorizontalStruct(Double d2, Double d3, Double d4, Double d5, int i, g gVar) {
        this((i & 1) != 0 ? null : d2, (i & 2) != 0 ? null : d3, (i & 4) != 0 ? null : d4, (i & 8) != 0 ? null : d5);
    }
}
