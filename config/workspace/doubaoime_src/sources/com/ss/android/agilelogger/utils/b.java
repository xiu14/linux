package com.ss.android.agilelogger.utils;

import java.io.StringWriter;

/* loaded from: classes2.dex */
class b extends StringWriter {
    private int a = 0;
    private boolean b = false;

    @Override // java.io.StringWriter, java.io.Writer
    public void write(String str, int i, int i2) {
        if (this.b) {
            return;
        }
        int i3 = this.a;
        if (i3 + i2 > 4000) {
            this.b = true;
        } else {
            this.a = i3 + i2;
            super.write(str, i, i2);
        }
    }
}
