package e.c.h.e;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static List<Character> f9855c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f9856d;
    private final SparseArray<double[]> a = new SparseArray<>();
    private final SparseArray<double[]> b = new SparseArray<>();

    static {
        List<Character> asList = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '#', '$', '%', '*', '+', ',', '-', '.', ':', ';', '=', '?', '@', '[', ']', '^', '_', '{', '|', '}', '~');
        f9855c = asList;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < asList.size(); i++) {
            hashMap.put(asList.get(i), Integer.valueOf(i));
        }
        f9856d = hashMap;
    }

    private int b(String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            Integer num = (Integer) f9856d.get(Character.valueOf(str.charAt(i)));
            int intValue = num != null ? num.intValue() : -1;
            if (intValue != -1) {
                i3 = (i3 * 83) + intValue;
            }
            i++;
        }
        return i3;
    }

    private double c(double[] dArr, boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            dArr[(i2 * i3) + i] = Math.cos(((i3 * 3.141592653589793d) * i) / i4);
        }
        return dArr[(i2 * i3) + i];
    }

    private int d(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return f2 <= 0.0031308f ? (int) ((f2 * 12.92f * 255.0f) + 0.5f) : (int) ((((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d) * 255.0d) + 0.5d);
    }

    private static float e(float f2) {
        return Math.copySign((float) Math.pow(f2, 2.0d), f2);
    }

    private float f(int i) {
        float f2 = i / 255.0f;
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap a(@androidx.annotation.Nullable java.lang.String r30, int r31, int r32, float r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.h.e.c.a(java.lang.String, int, int, float, boolean):android.graphics.Bitmap");
    }
}
