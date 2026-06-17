package com.obric.oui.indicator;

import android.util.Log;
import java.util.Iterator;
import kotlin.collections.o;
import kotlin.s.c.l;
import kotlin.w.d;
import kotlin.w.h;

/* loaded from: classes2.dex */
public abstract class c {
    private int a = -1;
    private int b = -1;

    public abstract boolean a();

    public abstract int b();

    public final void c(int i, float f2) {
        float f3 = i + f2;
        float b = b() - 1;
        if (f3 == b) {
            f3 = b - 1.0E-4f;
        }
        int i2 = (int) f3;
        int i3 = i2 + 1;
        float f4 = i3;
        if (f4 > b && a()) {
            i3 = 0;
        } else if (f4 > b || i2 == -1) {
            return;
        }
        try {
            d(i2, i3, f3 % 1);
        } catch (Exception e2) {
            if (e2 instanceof IndexOutOfBoundsException) {
                StringBuilder M = e.a.a.a.a.M("OIndicator: ");
                M.append(e2.getMessage());
                String sb = M.toString();
                l.f("OnPageChangeHelper", "tag");
                l.f(sb, "msg");
                Log.i("OnPageChangeHelper", sb);
            } else {
                l.f("OnPageChangeHelper", "tag");
                l.f("抓住了一个Exception并ignore", "msg");
                Log.e("OnPageChangeHelper", "抓住了一个Exception并ignore", e2);
            }
        }
        int i4 = this.a;
        if (i4 != -1) {
            if (i2 > i4) {
                Iterator<Integer> it2 = h.i(i4, i2).iterator();
                while (it2.hasNext()) {
                    int nextInt = ((o) it2).nextInt();
                    if (nextInt != i3) {
                        try {
                            e(nextInt);
                        } catch (Exception e3) {
                            if (e3 instanceof IndexOutOfBoundsException) {
                                StringBuilder M2 = e.a.a.a.a.M("OIndicator: ");
                                M2.append(e3.getMessage());
                                String sb2 = M2.toString();
                                l.f("OnPageChangeHelper", "tag");
                                l.f(sb2, "msg");
                                Log.i("OnPageChangeHelper", sb2);
                            } else {
                                l.f("OnPageChangeHelper", "tag");
                                l.f("抓住了一个Exception并ignore", "msg");
                                Log.e("OnPageChangeHelper", "抓住了一个Exception并ignore", e3);
                            }
                        }
                    }
                }
            }
            int i5 = this.b;
            if (i3 < i5 && i5 <= b) {
                Iterator<Integer> it3 = new d(i3 + 1, this.b).iterator();
                while (it3.hasNext()) {
                    int nextInt2 = ((o) it3).nextInt();
                    if (nextInt2 != i2) {
                        try {
                            e(nextInt2);
                        } catch (Exception e4) {
                            if (e4 instanceof IndexOutOfBoundsException) {
                                StringBuilder M3 = e.a.a.a.a.M("OIndicator: ");
                                M3.append(e4.getMessage());
                                String sb3 = M3.toString();
                                l.f("OnPageChangeHelper", "tag");
                                l.f(sb3, "msg");
                                Log.i("OnPageChangeHelper", sb3);
                            } else {
                                l.f("OnPageChangeHelper", "tag");
                                l.f("抓住了一个Exception并ignore", "msg");
                                Log.e("OnPageChangeHelper", "抓住了一个Exception并ignore", e4);
                            }
                        }
                    }
                }
            }
        }
        this.a = i2;
        this.b = i3;
    }

    public abstract void d(int i, int i2, float f2);

    public abstract void e(int i);
}
