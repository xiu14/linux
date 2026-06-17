package com.bytedance.crash.util;

import androidx.core.location.LocationRequestCompat;
import java.util.Arrays;

/* loaded from: classes.dex */
public class e {
    Long[] a;
    String b;

    public e(String str) {
        this.b = str;
    }

    public String a(long j) {
        long j2;
        Long[] lArr = this.a;
        if (lArr == null) {
            return "";
        }
        int length = lArr.length;
        int i = 0;
        long j3 = Long.MIN_VALUE;
        while (true) {
            if (i >= length) {
                j2 = Long.MAX_VALUE;
                break;
            }
            Long l = lArr[i];
            if (j < l.longValue()) {
                j2 = l.longValue() - 1;
                break;
            }
            j3 = l.longValue();
            i++;
        }
        String str = "[";
        if (j3 != Long.MIN_VALUE) {
            str = "[" + j3 + this.b;
        }
        String s = e.a.a.a.a.s(str, " - ");
        if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
            s = s + j2 + this.b;
        }
        return e.a.a.a.a.s(s, "]");
    }

    public void b(long j, long j2, long j3) {
        int i = ((int) ((j2 - j) / j3)) + 1;
        Long[] lArr = new Long[i];
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i2 >= i3) {
                lArr[i3] = Long.valueOf(j2);
                Arrays.sort(lArr);
                this.a = lArr;
                return;
            }
            lArr[i2] = Long.valueOf((i2 * j3) + j);
            i2++;
        }
    }

    public void c(Long[] lArr) {
        Arrays.sort(lArr);
        this.a = lArr;
    }
}
