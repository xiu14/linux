package com.bytedance.apm.t.l;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class c {
    public long[] a = new long[4];

    public void a(long j) {
        long[] jArr = this.a;
        if (jArr[0] == 0) {
            jArr[0] = SystemClock.uptimeMillis();
        }
        long[] jArr2 = this.a;
        jArr2[1] = jArr2[1] + 1;
        if (j < jArr2[2]) {
            jArr2[2] = j;
        }
        if (j > jArr2[3]) {
            jArr2[3] = j;
        }
    }

    public boolean b() {
        long[] jArr = this.a;
        return jArr[0] - jArr[2] > 100;
    }
}
