package e.c.e.b.a.h;

import android.util.SparseIntArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;

/* loaded from: classes2.dex */
public class a {
    private static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        a = sparseIntArray;
        sparseIntArray.append(1, -7829368);
        sparseIntArray.append(2, SupportMenu.CATEGORY_MASK);
        sparseIntArray.append(3, InputDeviceCompat.SOURCE_ANY);
        sparseIntArray.append(4, InputDeviceCompat.SOURCE_ANY);
        sparseIntArray.append(5, -16711936);
        sparseIntArray.append(6, -16711936);
        sparseIntArray.append(7, -16711936);
    }

    public static int a(int i) {
        return a.get(i, -1);
    }
}
