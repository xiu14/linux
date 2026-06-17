package com.airbnb.lottie.x;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class l implements H<com.airbnb.lottie.model.content.c> {
    private int a;

    public l(int i) {
        this.a = i;
    }

    @Override // com.airbnb.lottie.x.H
    public com.airbnb.lottie.model.content.c a(JsonReader jsonReader, float f2) throws IOException {
        int i;
        com.airbnb.lottie.model.content.c cVar;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 1;
        boolean z = jsonReader.G() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.d();
        }
        while (jsonReader.r()) {
            arrayList.add(Float.valueOf((float) jsonReader.w()));
        }
        if (z) {
            jsonReader.l();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i5 = this.a;
        float[] fArr = new float[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = this.a * 4;
            if (i6 >= i) {
                break;
            }
            int i9 = i6 / 4;
            double floatValue = ((Float) arrayList.get(i6)).floatValue();
            int i10 = i6 % 4;
            if (i10 == 0) {
                if (i9 > 0) {
                    float f3 = (float) floatValue;
                    if (fArr[i9 - 1] >= f3) {
                        fArr[i9] = f3 + 0.01f;
                    }
                }
                fArr[i9] = (float) floatValue;
            } else if (i10 == 1) {
                i7 = (int) (floatValue * 255.0d);
            } else if (i10 == 2) {
                i8 = (int) (floatValue * 255.0d);
            } else if (i10 == 3) {
                iArr[i9] = Color.argb(255, i7, i8, (int) (floatValue * 255.0d));
            }
            i6++;
        }
        com.airbnb.lottie.model.content.c cVar2 = new com.airbnb.lottie.model.content.c(fArr, iArr);
        if (arrayList.size() > i) {
            int size = (arrayList.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i11 = 0;
            while (i < arrayList.size()) {
                if (i % 2 == 0) {
                    dArr[i11] = ((Float) arrayList.get(i)).floatValue();
                } else {
                    dArr2[i11] = ((Float) arrayList.get(i)).floatValue();
                    i11++;
                }
                i++;
            }
            while (i3 < cVar2.c()) {
                int i12 = cVar2.a()[i3];
                double d2 = cVar2.b()[i3];
                int i13 = i4;
                while (true) {
                    if (i13 >= size) {
                        cVar = cVar2;
                        i2 = (int) (dArr2[size - 1] * 255.0d);
                        break;
                    }
                    int i14 = i13 - 1;
                    double d3 = dArr[i14];
                    double d4 = dArr[i13];
                    if (dArr[i13] >= d2) {
                        double d5 = (d2 - d3) / (d4 - d3);
                        cVar = cVar2;
                        int i15 = com.airbnb.lottie.y.g.b;
                        double max = Math.max(0.0d, Math.min(1.0d, d5));
                        double d6 = dArr2[i14];
                        i2 = (int) ((((dArr2[i13] - d6) * max) + d6) * 255.0d);
                        break;
                    }
                    i13++;
                }
                cVar.a()[i3] = Color.argb(i2, Color.red(i12), Color.green(i12), Color.blue(i12));
                i3++;
                cVar2 = cVar;
                i4 = 1;
            }
        }
        return cVar2;
    }
}
