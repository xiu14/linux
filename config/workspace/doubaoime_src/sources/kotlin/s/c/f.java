package kotlin.s.c;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class f {
    private static final Object[] a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        l.f(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it2 = collection.iterator();
            if (it2.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it2.next();
                    if (i2 >= objArr.length) {
                        if (!it2.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i3 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        l.e(objArr, "copyOf(result, newSize)");
                    } else if (!it2.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        l.e(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return a;
    }

    public static final Object[] b(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        l.f(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it2 = collection.iterator();
        if (!it2.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            l.d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it2.next();
            if (i2 >= objArr2.length) {
                if (!it2.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i3 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                l.e(objArr2, "copyOf(result, newSize)");
            } else if (!it2.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                l.e(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }
}
