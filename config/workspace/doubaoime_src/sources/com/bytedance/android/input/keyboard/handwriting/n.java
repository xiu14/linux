package com.bytedance.android.input.keyboard.handwriting;

/* loaded from: classes.dex */
public final class n implements com.bytedance.android.input.keyboard.areacontrol.p {
    final /* synthetic */ HandWritingBoardView a;

    n(HandWritingBoardView handWritingBoardView) {
        this.a = handWritingBoardView;
    }

    @Override // com.bytedance.android.input.keyboard.areacontrol.p
    public void a(int i, int i2, int i3, int i4, boolean z) {
        this.a.w("onKeyboardAdjustChanged isHandWriteMode = " + z);
        if (z) {
            this.a.x();
        }
    }
}
