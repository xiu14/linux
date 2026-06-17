package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
final class c implements t {
    private final Class<?> a;
    private final t b;

    c(Class<?> cls, t tVar) {
        this.a = cls;
        this.b = tVar;
    }

    @Override // com.alibaba.fastjson.serializer.t
    public final void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        y yVar = mVar.b;
        if (obj == null) {
            if ((yVar.f1531c & SerializerFeature.WriteNullListAsEmpty.mask) != 0) {
                yVar.write("[]");
                return;
            } else {
                yVar.write("null");
                return;
            }
        }
        int i = 44;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            yVar.write(91);
            for (int i2 = 0; i2 < zArr.length; i2++) {
                if (i2 != 0) {
                    yVar.write(44);
                }
                yVar.write(zArr[i2] ? "true" : "false");
            }
            yVar.write(93);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Objects.requireNonNull(yVar);
            int length = bArr.length;
            boolean z = (yVar.f1531c & SerializerFeature.UseSingleQuotes.mask) != 0;
            char c2 = z ? '\'' : '\"';
            if (length == 0) {
                yVar.write(z ? "''" : "\"\"");
                return;
            }
            char[] cArr = com.alibaba.fastjson.parser.d.x;
            int i3 = (length / 3) * 3;
            int i4 = length - 1;
            int i5 = yVar.b;
            int i6 = (((i4 / 3) + 1) << 2) + i5 + 2;
            if (i6 > yVar.a.length) {
                if (yVar.f1532d != null) {
                    yVar.write(c2);
                    int i7 = 0;
                    while (i7 < i3) {
                        int i8 = i7 + 1;
                        int i9 = i8 + 1;
                        int i10 = ((bArr[i7] & 255) << 16) | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
                        yVar.write(cArr[(i10 >>> 18) & 63]);
                        yVar.write(cArr[(i10 >>> 12) & 63]);
                        yVar.write(cArr[(i10 >>> 6) & 63]);
                        yVar.write(cArr[i10 & 63]);
                        i7 = i9 + 1;
                    }
                    int i11 = length - i3;
                    if (i11 > 0) {
                        int i12 = ((bArr[i3] & 255) << 10) | (i11 == 2 ? (bArr[i4] & 255) << 2 : 0);
                        yVar.write(cArr[i12 >> 12]);
                        yVar.write(cArr[(i12 >>> 6) & 63]);
                        yVar.write(i11 == 2 ? cArr[i12 & 63] : '=');
                        yVar.write(61);
                    }
                    yVar.write(c2);
                    return;
                }
                yVar.h(i6);
            }
            yVar.b = i6;
            int i13 = i5 + 1;
            yVar.a[i5] = c2;
            int i14 = 0;
            while (i14 < i3) {
                int i15 = i14 + 1;
                int i16 = i15 + 1;
                int i17 = ((bArr[i14] & 255) << 16) | ((bArr[i15] & 255) << 8);
                int i18 = i16 + 1;
                int i19 = (bArr[i16] & 255) | i17;
                char[] cArr2 = yVar.a;
                int i20 = i13 + 1;
                cArr2[i13] = cArr[(i19 >>> 18) & 63];
                int i21 = i20 + 1;
                cArr2[i20] = cArr[(i19 >>> 12) & 63];
                int i22 = i21 + 1;
                cArr2[i21] = cArr[(i19 >>> 6) & 63];
                i13 = i22 + 1;
                cArr2[i22] = cArr[i19 & 63];
                i14 = i18;
            }
            int i23 = length - i3;
            if (i23 > 0) {
                int i24 = ((bArr[i3] & 255) << 10) | (i23 == 2 ? (bArr[i4] & 255) << 2 : 0);
                char[] cArr3 = yVar.a;
                cArr3[i6 - 5] = cArr[i24 >> 12];
                cArr3[i6 - 4] = cArr[(i24 >>> 6) & 63];
                cArr3[i6 - 3] = i23 == 2 ? cArr[i24 & 63] : '=';
                cArr3[i6 - 2] = '=';
            }
            yVar.a[i6 - 1] = c2;
            return;
        }
        if (obj instanceof char[]) {
            yVar.w(new String((char[]) obj));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length - 1;
            if (length2 == -1) {
                yVar.a("[]");
                return;
            }
            yVar.write(91);
            for (int i25 = 0; i25 < length2; i25++) {
                double d2 = dArr[i25];
                if (Double.isNaN(d2)) {
                    yVar.write("null");
                } else {
                    yVar.a(Double.toString(d2));
                }
                yVar.write(44);
            }
            double d3 = dArr[length2];
            if (Double.isNaN(d3)) {
                yVar.write("null");
            } else {
                yVar.a(Double.toString(d3));
            }
            yVar.write(93);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length3 = fArr.length - 1;
            if (length3 == -1) {
                yVar.a("[]");
                return;
            }
            yVar.write(91);
            for (int i26 = 0; i26 < length3; i26++) {
                float f2 = fArr[i26];
                if (Float.isNaN(f2)) {
                    yVar.write("null");
                } else {
                    yVar.a(Float.toString(f2));
                }
                yVar.write(44);
            }
            float f3 = fArr[length3];
            if (Float.isNaN(f3)) {
                yVar.write("null");
            } else {
                yVar.a(Float.toString(f3));
            }
            yVar.write(93);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            yVar.write(91);
            for (int i27 = 0; i27 < iArr.length; i27++) {
                if (i27 != 0) {
                    yVar.write(44);
                }
                yVar.p(iArr[i27]);
            }
            yVar.write(93);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            yVar.write(91);
            for (int i28 = 0; i28 < jArr.length; i28++) {
                if (i28 != 0) {
                    yVar.write(44);
                }
                yVar.r(jArr[i28]);
            }
            yVar.write(93);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            yVar.write(91);
            for (int i29 = 0; i29 < sArr.length; i29++) {
                if (i29 != 0) {
                    yVar.write(44);
                }
                yVar.p(sArr[i29]);
            }
            yVar.write(93);
            return;
        }
        Object[] objArr = (Object[]) obj;
        int length4 = objArr.length;
        w wVar = mVar.m;
        mVar.e(wVar, obj, obj2, 0);
        try {
            yVar.write(91);
            int i30 = 0;
            while (i30 < length4) {
                if (i30 != 0) {
                    yVar.write(i);
                }
                Object obj3 = objArr[i30];
                if (obj3 == null) {
                    if (((SerializerFeature.WriteNullStringAsEmpty.mask & yVar.f1531c) != 0) && (obj instanceof String[])) {
                        yVar.w("");
                    } else {
                        yVar.a("null");
                    }
                } else if (obj3.getClass() == this.a) {
                    this.b.b(mVar, obj3, Integer.valueOf(i30), null);
                } else {
                    mVar.a.a(obj3.getClass()).b(mVar, obj3, Integer.valueOf(i30), null);
                }
                i30++;
                i = 44;
            }
            yVar.write(93);
        } finally {
            mVar.m = wVar;
        }
    }
}
