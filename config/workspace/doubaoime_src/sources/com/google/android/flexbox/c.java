package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.MarginLayoutParamsCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
class c {
    private final com.google.android.flexbox.a a;
    private boolean[] b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    int[] f6762c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    long[] f6763d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private long[] f6764e;

    static class b {
        List<com.google.android.flexbox.b> a;
        int b;

        b() {
        }

        void a() {
            this.a = null;
            this.b = 0;
        }
    }

    /* renamed from: com.google.android.flexbox.c$c, reason: collision with other inner class name */
    private static class C0332c implements Comparable<C0332c> {
        int a;
        int b;

        private C0332c() {
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull C0332c c0332c) {
            C0332c c0332c2 = c0332c;
            int i = this.b;
            int i2 = c0332c2.b;
            return i != i2 ? i - i2 : this.a - c0332c2.a;
        }

        @NonNull
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("Order{order=");
            M.append(this.b);
            M.append(", index=");
            return e.a.a.a.a.C(M, this.a, '}');
        }

        C0332c(a aVar) {
        }
    }

    c(com.google.android.flexbox.a aVar) {
        this.a = aVar;
    }

    private int[] A(int i, List<C0332c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C0332c c0332c : list) {
            int i3 = c0332c.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c0332c.b);
            i2++;
        }
        return iArr;
    }

    private void B(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.I()) - flexItem.Y()) - this.a.s(view), flexItem.z()), flexItem.l0());
        long[] jArr = this.f6764e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? o(jArr[i2]) : view.getMeasuredHeight(), BasicMeasure.EXACTLY);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, BasicMeasure.EXACTLY);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        E(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.a.k(i2, view);
    }

    private void C(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.M()) - flexItem.H()) - this.a.s(view), flexItem.a0()), flexItem.f0());
        long[] jArr = this.f6764e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), BasicMeasure.EXACTLY);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, BasicMeasure.EXACTLY);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        E(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.a.k(i2, view);
    }

    private void E(int i, int i2, int i3, View view) {
        long[] jArr = this.f6763d;
        if (jArr != null) {
            jArr[i] = (i2 & 4294967295L) | (i3 << 32);
        }
        long[] jArr2 = this.f6764e;
        if (jArr2 != null) {
            jArr2[i] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }

    private void a(List<com.google.android.flexbox.b> list, com.google.android.flexbox.b bVar, int i, int i2) {
        bVar.m = i2;
        this.a.g(bVar);
        bVar.p = i;
        list.add(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.z()
            r4 = 1
            if (r1 >= r3) goto L1a
            int r1 = r0.z()
            goto L24
        L1a:
            int r3 = r0.l0()
            if (r1 <= r3) goto L26
            int r1 = r0.l0()
        L24:
            r3 = r4
            goto L27
        L26:
            r3 = 0
        L27:
            int r5 = r0.a0()
            if (r2 >= r5) goto L32
            int r2 = r0.a0()
            goto L3e
        L32:
            int r5 = r0.f0()
            if (r2 <= r5) goto L3d
            int r2 = r0.f0()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.E(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.a
            r0.k(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.c.c(android.view.View, int):void");
    }

    private List<com.google.android.flexbox.b> e(List<com.google.android.flexbox.b> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
        bVar.f6761g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @NonNull
    private List<C0332c> f(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.a.m(i2).getLayoutParams();
            C0332c c0332c = new C0332c(null);
            c0332c.b = flexItem.getOrder();
            c0332c.a = i2;
            arrayList.add(c0332c);
        }
        return arrayList;
    }

    private void n(int i, int i2, com.google.android.flexbox.b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d2;
        int i8;
        double d3;
        float f2 = bVar.j;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 < (i5 = bVar.f6759e)) {
            return;
        }
        float f4 = (i3 - i5) / f2;
        bVar.f6759e = i4 + bVar.f6760f;
        if (!z) {
            bVar.f6761g = Integer.MIN_VALUE;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f5 = 0.0f;
        while (i9 < bVar.h) {
            int i11 = bVar.o + i9;
            View h = this.a.h(i11);
            if (h == null || h.getVisibility() == 8) {
                i6 = i5;
            } else {
                FlexItem flexItem = (FlexItem) h.getLayoutParams();
                int c2 = this.a.c();
                if (c2 == 0 || c2 == 1) {
                    int i12 = i5;
                    int measuredWidth = h.getMeasuredWidth();
                    long[] jArr = this.f6764e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i11];
                    }
                    int measuredHeight = h.getMeasuredHeight();
                    long[] jArr2 = this.f6764e;
                    i6 = i12;
                    if (jArr2 != null) {
                        measuredHeight = o(jArr2[i11]);
                    }
                    if (!this.b[i11] && flexItem.S() > 0.0f) {
                        float S = (flexItem.S() * f4) + measuredWidth;
                        if (i9 == bVar.h - 1) {
                            S += f5;
                            f5 = 0.0f;
                        }
                        int round = Math.round(S);
                        if (round > flexItem.l0()) {
                            round = flexItem.l0();
                            this.b[i11] = true;
                            bVar.j -= flexItem.S();
                            z2 = true;
                        } else {
                            float f6 = (S - round) + f5;
                            double d4 = f6;
                            if (d4 > 1.0d) {
                                round++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    round--;
                                    d2 = d4 + 1.0d;
                                }
                                f5 = f6;
                            }
                            f6 = (float) d2;
                            f5 = f6;
                        }
                        int p = p(i2, flexItem, bVar.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, BasicMeasure.EXACTLY);
                        h.measure(makeMeasureSpec, p);
                        int measuredWidth2 = h.getMeasuredWidth();
                        int measuredHeight2 = h.getMeasuredHeight();
                        E(i11, makeMeasureSpec, p, h);
                        this.a.k(i11, h);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i10, measuredHeight + flexItem.M() + flexItem.H() + this.a.s(h));
                    bVar.f6759e = measuredWidth + flexItem.I() + flexItem.Y() + bVar.f6759e;
                    i7 = max;
                } else {
                    int measuredHeight3 = h.getMeasuredHeight();
                    long[] jArr3 = this.f6764e;
                    if (jArr3 != null) {
                        measuredHeight3 = o(jArr3[i11]);
                    }
                    int measuredWidth3 = h.getMeasuredWidth();
                    long[] jArr4 = this.f6764e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i11];
                    }
                    if (this.b[i11] || flexItem.S() <= f3) {
                        i8 = i5;
                    } else {
                        float S2 = (flexItem.S() * f4) + measuredHeight3;
                        if (i9 == bVar.h - 1) {
                            S2 += f5;
                            f5 = f3;
                        }
                        int round2 = Math.round(S2);
                        if (round2 > flexItem.f0()) {
                            round2 = flexItem.f0();
                            this.b[i11] = true;
                            bVar.j -= flexItem.S();
                            i8 = i5;
                            z2 = true;
                        } else {
                            float f7 = (S2 - round2) + f5;
                            i8 = i5;
                            double d5 = f7;
                            if (d5 > 1.0d) {
                                round2++;
                                d3 = d5 - 1.0d;
                            } else if (d5 < -1.0d) {
                                round2--;
                                d3 = d5 + 1.0d;
                            } else {
                                f5 = f7;
                            }
                            f5 = (float) d3;
                        }
                        int q = q(i, flexItem, bVar.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, BasicMeasure.EXACTLY);
                        h.measure(q, makeMeasureSpec2);
                        measuredWidth3 = h.getMeasuredWidth();
                        int measuredHeight4 = h.getMeasuredHeight();
                        E(i11, q, makeMeasureSpec2, h);
                        this.a.k(i11, h);
                        measuredHeight3 = measuredHeight4;
                    }
                    i7 = Math.max(i10, measuredWidth3 + flexItem.I() + flexItem.Y() + this.a.s(h));
                    bVar.f6759e = measuredHeight3 + flexItem.M() + flexItem.H() + bVar.f6759e;
                    i6 = i8;
                }
                bVar.f6761g = Math.max(bVar.f6761g, i7);
                i10 = i7;
            }
            i9++;
            i5 = i6;
            f3 = 0.0f;
        }
        int i13 = i5;
        if (!z2 || i13 == bVar.f6759e) {
            return;
        }
        n(i, i2, bVar, i3, i4, true);
    }

    private int p(int i, FlexItem flexItem, int i2) {
        com.google.android.flexbox.a aVar = this.a;
        int p = aVar.p(i, aVar.getPaddingTop() + this.a.getPaddingBottom() + flexItem.M() + flexItem.H() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(p);
        return size > flexItem.f0() ? View.MeasureSpec.makeMeasureSpec(flexItem.f0(), View.MeasureSpec.getMode(p)) : size < flexItem.a0() ? View.MeasureSpec.makeMeasureSpec(flexItem.a0(), View.MeasureSpec.getMode(p)) : p;
    }

    private int q(int i, FlexItem flexItem, int i2) {
        com.google.android.flexbox.a aVar = this.a;
        int i3 = aVar.i(i, aVar.getPaddingLeft() + this.a.getPaddingRight() + flexItem.I() + flexItem.Y() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(i3);
        return size > flexItem.l0() ? View.MeasureSpec.makeMeasureSpec(flexItem.l0(), View.MeasureSpec.getMode(i3)) : size < flexItem.z() ? View.MeasureSpec.makeMeasureSpec(flexItem.z(), View.MeasureSpec.getMode(i3)) : i3;
    }

    private int r(FlexItem flexItem, boolean z) {
        return z ? flexItem.H() : flexItem.Y();
    }

    private int s(FlexItem flexItem, boolean z) {
        return z ? flexItem.Y() : flexItem.H();
    }

    private int t(FlexItem flexItem, boolean z) {
        return z ? flexItem.M() : flexItem.I();
    }

    private int u(FlexItem flexItem, boolean z) {
        return z ? flexItem.I() : flexItem.M();
    }

    private boolean v(int i, int i2, com.google.android.flexbox.b bVar) {
        return i == i2 - 1 && bVar.a() != 0;
    }

    private void z(int i, int i2, com.google.android.flexbox.b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = bVar.f6759e;
        float f2 = bVar.k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 > i9) {
            return;
        }
        float f4 = (i9 - i3) / f2;
        bVar.f6759e = i4 + bVar.f6760f;
        if (!z) {
            bVar.f6761g = Integer.MIN_VALUE;
        }
        int i10 = 0;
        boolean z2 = false;
        int i11 = 0;
        float f5 = 0.0f;
        while (i10 < bVar.h) {
            int i12 = bVar.o + i10;
            View h = this.a.h(i12);
            if (h == null || h.getVisibility() == 8) {
                i5 = i9;
                i6 = i10;
            } else {
                FlexItem flexItem = (FlexItem) h.getLayoutParams();
                int c2 = this.a.c();
                if (c2 == 0 || c2 == 1) {
                    i5 = i9;
                    int i13 = i10;
                    int measuredWidth = h.getMeasuredWidth();
                    long[] jArr = this.f6764e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i12];
                    }
                    int measuredHeight = h.getMeasuredHeight();
                    long[] jArr2 = this.f6764e;
                    if (jArr2 != null) {
                        measuredHeight = o(jArr2[i12]);
                    }
                    if (this.b[i12] || flexItem.w() <= 0.0f) {
                        i6 = i13;
                    } else {
                        float w = measuredWidth - (flexItem.w() * f4);
                        i6 = i13;
                        if (i6 == bVar.h - 1) {
                            w += f5;
                            f5 = 0.0f;
                        }
                        int round = Math.round(w);
                        if (round < flexItem.z()) {
                            i8 = flexItem.z();
                            this.b[i12] = true;
                            bVar.k -= flexItem.w();
                            z2 = true;
                        } else {
                            float f6 = (w - round) + f5;
                            double d2 = f6;
                            if (d2 > 1.0d) {
                                round++;
                                f6 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round--;
                                f6 += 1.0f;
                            }
                            f5 = f6;
                            i8 = round;
                        }
                        int p = p(i2, flexItem, bVar.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, BasicMeasure.EXACTLY);
                        h.measure(makeMeasureSpec, p);
                        int measuredWidth2 = h.getMeasuredWidth();
                        int measuredHeight2 = h.getMeasuredHeight();
                        E(i12, makeMeasureSpec, p, h);
                        this.a.k(i12, h);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i11, measuredHeight + flexItem.M() + flexItem.H() + this.a.s(h));
                    bVar.f6759e = measuredWidth + flexItem.I() + flexItem.Y() + bVar.f6759e;
                    i7 = max;
                } else {
                    int measuredHeight3 = h.getMeasuredHeight();
                    long[] jArr3 = this.f6764e;
                    if (jArr3 != null) {
                        measuredHeight3 = o(jArr3[i12]);
                    }
                    int measuredWidth3 = h.getMeasuredWidth();
                    long[] jArr4 = this.f6764e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i12];
                    }
                    if (this.b[i12] || flexItem.w() <= f3) {
                        i5 = i9;
                        i6 = i10;
                    } else {
                        float w2 = measuredHeight3 - (flexItem.w() * f4);
                        if (i10 == bVar.h - 1) {
                            w2 += f5;
                            f5 = f3;
                        }
                        int round2 = Math.round(w2);
                        if (round2 < flexItem.a0()) {
                            int a0 = flexItem.a0();
                            this.b[i12] = true;
                            bVar.k -= flexItem.w();
                            i6 = i10;
                            round2 = a0;
                            z2 = true;
                            i5 = i9;
                        } else {
                            float f7 = (w2 - round2) + f5;
                            i5 = i9;
                            i6 = i10;
                            double d3 = f7;
                            if (d3 > 1.0d) {
                                round2++;
                                f7 -= 1.0f;
                            } else if (d3 < -1.0d) {
                                round2--;
                                f7 += 1.0f;
                            }
                            f5 = f7;
                        }
                        int q = q(i, flexItem, bVar.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, BasicMeasure.EXACTLY);
                        h.measure(q, makeMeasureSpec2);
                        measuredWidth3 = h.getMeasuredWidth();
                        int measuredHeight4 = h.getMeasuredHeight();
                        E(i12, q, makeMeasureSpec2, h);
                        this.a.k(i12, h);
                        measuredHeight3 = measuredHeight4;
                    }
                    i7 = Math.max(i11, measuredWidth3 + flexItem.I() + flexItem.Y() + this.a.s(h));
                    bVar.f6759e = measuredHeight3 + flexItem.M() + flexItem.H() + bVar.f6759e;
                }
                bVar.f6761g = Math.max(bVar.f6761g, i7);
                i11 = i7;
            }
            i10 = i6 + 1;
            i9 = i5;
            f3 = 0.0f;
        }
        int i14 = i9;
        if (!z2 || i14 == bVar.f6759e) {
            return;
        }
        z(i, i2, bVar, i3, i4, true);
    }

    void D(int i) {
        View h;
        if (i >= this.a.a()) {
            return;
        }
        int c2 = this.a.c();
        if (this.a.j() != 4) {
            for (com.google.android.flexbox.b bVar : this.a.o()) {
                for (Integer num : bVar.n) {
                    View h2 = this.a.h(num.intValue());
                    if (c2 == 0 || c2 == 1) {
                        C(h2, bVar.f6761g, num.intValue());
                    } else {
                        if (c2 != 2 && c2 != 3) {
                            throw new IllegalArgumentException(e.a.a.a.a.j("Invalid flex direction: ", c2));
                        }
                        B(h2, bVar.f6761g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f6762c;
        List<com.google.android.flexbox.b> o = this.a.o();
        int size = o.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            com.google.android.flexbox.b bVar2 = o.get(i2);
            int i3 = bVar2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = bVar2.o + i4;
                if (i4 < this.a.a() && (h = this.a.h(i5)) != null && h.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) h.getLayoutParams();
                    if (flexItem.s() == -1 || flexItem.s() == 4) {
                        if (c2 == 0 || c2 == 1) {
                            C(h, bVar2.f6761g, i5);
                        } else {
                            if (c2 != 2 && c2 != 3) {
                                throw new IllegalArgumentException(e.a.a.a.a.j("Invalid flex direction: ", c2));
                            }
                            B(h, bVar2.f6761g, i5);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x022c, code lost:
    
        if (r2 < (r8 + r11)) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x038b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void b(com.google.android.flexbox.c.b r25, int r26, int r27, int r28, int r29, int r30, @androidx.annotation.Nullable java.util.List<com.google.android.flexbox.b> r31) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.c.b(com.google.android.flexbox.c$b, int, int, int, int, int, java.util.List):void");
    }

    void d(List<com.google.android.flexbox.b> list, int i) {
        int i2 = this.f6762c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f6762c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f6763d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    int[] g(SparseIntArray sparseIntArray) {
        int a2 = this.a.a();
        return A(a2, f(a2), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] h(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int a2 = this.a.a();
        List<C0332c> f2 = f(a2);
        C0332c c0332c = new C0332c(null);
        if (view == null || !(layoutParams instanceof FlexItem)) {
            c0332c.b = 1;
        } else {
            c0332c.b = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == a2) {
            c0332c.a = a2;
        } else if (i < this.a.a()) {
            c0332c.a = i;
            while (i < a2) {
                ((C0332c) ((ArrayList) f2).get(i)).a++;
                i++;
            }
        } else {
            c0332c.a = a2;
        }
        ((ArrayList) f2).add(c0332c);
        return A(a2 + 1, f2, sparseIntArray);
    }

    void i(int i, int i2, int i3) {
        int i4;
        int i5;
        int c2 = this.a.c();
        if (c2 == 0 || c2 == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else {
            if (c2 != 2 && c2 != 3) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Invalid flex direction: ", c2));
            }
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        }
        List<com.google.android.flexbox.b> o = this.a.o();
        if (i4 == 1073741824) {
            int l = this.a.l() + i3;
            int i6 = 0;
            if (o.size() == 1) {
                o.get(0).f6761g = i5 - i3;
                return;
            }
            if (o.size() >= 2) {
                int q = this.a.q();
                if (q == 1) {
                    int i7 = i5 - l;
                    com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
                    bVar.f6761g = i7;
                    o.add(0, bVar);
                    return;
                }
                if (q == 2) {
                    this.a.setFlexLines(e(o, i5, l));
                    return;
                }
                if (q == 3) {
                    if (l >= i5) {
                        return;
                    }
                    float size2 = (i5 - l) / (o.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = o.size();
                    float f2 = 0.0f;
                    while (i6 < size3) {
                        arrayList.add(o.get(i6));
                        if (i6 != o.size() - 1) {
                            com.google.android.flexbox.b bVar2 = new com.google.android.flexbox.b();
                            if (i6 == o.size() - 2) {
                                bVar2.f6761g = Math.round(f2 + size2);
                                f2 = 0.0f;
                            } else {
                                bVar2.f6761g = Math.round(size2);
                            }
                            int i8 = bVar2.f6761g;
                            float f3 = (size2 - i8) + f2;
                            if (f3 > 1.0f) {
                                bVar2.f6761g = i8 + 1;
                                f3 -= 1.0f;
                            } else if (f3 < -1.0f) {
                                bVar2.f6761g = i8 - 1;
                                f3 += 1.0f;
                            }
                            f2 = f3;
                            arrayList.add(bVar2);
                        }
                        i6++;
                    }
                    this.a.setFlexLines(arrayList);
                    return;
                }
                if (q == 4) {
                    if (l >= i5) {
                        this.a.setFlexLines(e(o, i5, l));
                        return;
                    }
                    int size4 = (i5 - l) / (o.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.b bVar3 = new com.google.android.flexbox.b();
                    bVar3.f6761g = size4;
                    for (com.google.android.flexbox.b bVar4 : o) {
                        arrayList2.add(bVar3);
                        arrayList2.add(bVar4);
                        arrayList2.add(bVar3);
                    }
                    this.a.setFlexLines(arrayList2);
                    return;
                }
                if (q == 5 && l < i5) {
                    float size5 = (i5 - l) / o.size();
                    int size6 = o.size();
                    float f4 = 0.0f;
                    while (i6 < size6) {
                        com.google.android.flexbox.b bVar5 = o.get(i6);
                        float f5 = bVar5.f6761g + size5;
                        if (i6 == o.size() - 1) {
                            f5 += f4;
                            f4 = 0.0f;
                        }
                        int round = Math.round(f5);
                        float f6 = (f5 - round) + f4;
                        if (f6 > 1.0f) {
                            round++;
                            f6 -= 1.0f;
                        } else if (f6 < -1.0f) {
                            round--;
                            f6 += 1.0f;
                        }
                        f4 = f6;
                        bVar5.f6761g = round;
                        i6++;
                    }
                }
            }
        }
    }

    void j(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int a2 = this.a.a();
        boolean[] zArr = this.b;
        if (zArr == null) {
            this.b = new boolean[Math.max(a2, 10)];
        } else if (zArr.length < a2) {
            this.b = new boolean[Math.max(zArr.length * 2, a2)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= this.a.a()) {
            return;
        }
        int c2 = this.a.c();
        int c3 = this.a.c();
        if (c3 == 0 || c3 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int e2 = this.a.e();
            if (mode != 1073741824) {
                size = Math.min(e2, size);
            }
            paddingLeft = this.a.getPaddingLeft();
            paddingRight = this.a.getPaddingRight();
        } else {
            if (c3 != 2 && c3 != 3) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Invalid flex direction: ", c2));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.a.e();
            }
            paddingLeft = this.a.getPaddingTop();
            paddingRight = this.a.getPaddingBottom();
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.f6762c;
        List<com.google.android.flexbox.b> o = this.a.o();
        int size2 = o.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            com.google.android.flexbox.b bVar = o.get(i5);
            int i6 = bVar.f6759e;
            if (i6 < size && bVar.q) {
                n(i, i2, bVar, size, i4, false);
            } else if (i6 > size && bVar.r) {
                z(i, i2, bVar, size, i4, false);
            }
        }
    }

    void k(int i) {
        int[] iArr = this.f6762c;
        if (iArr == null) {
            this.f6762c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f6762c = Arrays.copyOf(this.f6762c, Math.max(iArr.length * 2, i));
        }
    }

    void l(int i) {
        long[] jArr = this.f6763d;
        if (jArr == null) {
            this.f6763d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f6763d = Arrays.copyOf(this.f6763d, Math.max(jArr.length * 2, i));
        }
    }

    void m(int i) {
        long[] jArr = this.f6764e;
        if (jArr == null) {
            this.f6764e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f6764e = Arrays.copyOf(this.f6764e, Math.max(jArr.length * 2, i));
        }
    }

    int o(long j) {
        return (int) (j >> 32);
    }

    boolean w(SparseIntArray sparseIntArray) {
        int a2 = this.a.a();
        if (sparseIntArray.size() != a2) {
            return true;
        }
        for (int i = 0; i < a2; i++) {
            View m = this.a.m(i);
            if (m != null && ((FlexItem) m.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    void x(View view, com.google.android.flexbox.b bVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int j = this.a.j();
        if (flexItem.s() != -1) {
            j = flexItem.s();
        }
        int i5 = bVar.f6761g;
        if (j != 0) {
            if (j == 1) {
                if (this.a.f() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.H(), i3, i6 - flexItem.H());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.M(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.M());
                    return;
                }
            }
            if (j == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.M()) - flexItem.H()) / 2;
                if (this.a.f() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (j == 3) {
                if (this.a.f() != 2) {
                    int max = Math.max(bVar.l - view.getBaseline(), flexItem.M());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (bVar.l - view.getMeasuredHeight()), flexItem.H());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            }
            if (j != 4) {
                return;
            }
        }
        if (this.a.f() != 2) {
            view.layout(i, i2 + flexItem.M(), i3, i4 + flexItem.M());
        } else {
            view.layout(i, i2 - flexItem.H(), i3, i4 - flexItem.H());
        }
    }

    void y(View view, com.google.android.flexbox.b bVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int j = this.a.j();
        if (flexItem.s() != -1) {
            j = flexItem.s();
        }
        int i5 = bVar.f6761g;
        if (j != 0) {
            if (j == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.Y(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.Y(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.I(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.I(), i4);
                return;
            }
            if (j == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (j != 3 && j != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.Y(), i2, i3 - flexItem.Y(), i4);
        } else {
            view.layout(i + flexItem.I(), i2, i3 + flexItem.I(), i4);
        }
    }
}
