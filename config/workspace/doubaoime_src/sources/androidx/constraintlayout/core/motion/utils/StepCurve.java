package androidx.constraintlayout.core.motion.utils;

import e.a.a.a.a;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class StepCurve extends Easing {
    private static final boolean DEBUG = false;
    MonotonicCurveFit mCurveFit;

    StepCurve(String str) {
        this.str = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.mCurveFit = genSpline(Arrays.copyOf(dArr, i + 1));
    }

    private static MonotonicCurveFit genSpline(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.parseDouble(split[i]);
        }
        return genSpline(dArr);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d2) {
        return this.mCurveFit.getPos(d2, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d2) {
        return this.mCurveFit.getSlope(d2, 0);
    }

    private static MonotonicCurveFit genSpline(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d2 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d3 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d3;
            double d4 = i * d2;
            dArr3[i2] = d4;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d3 + 1.0d;
                dArr3[i3] = d4 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d3 - 1.0d) - d2;
                dArr3[i4] = (d4 - 1.0d) - d2;
            }
        }
        MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
        PrintStream printStream = System.out;
        StringBuilder M = a.M(" 0 ");
        M.append(monotonicCurveFit.getPos(0.0d, 0));
        printStream.println(M.toString());
        PrintStream printStream2 = System.out;
        StringBuilder M2 = a.M(" 1 ");
        M2.append(monotonicCurveFit.getPos(1.0d, 0));
        printStream2.println(M2.toString());
        return monotonicCurveFit;
    }
}
