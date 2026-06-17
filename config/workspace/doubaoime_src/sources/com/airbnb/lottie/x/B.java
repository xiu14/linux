package com.airbnb.lottie.x;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class B implements H<com.airbnb.lottie.model.content.h> {
    public static final B a = new B();
    private static final JsonReader.a b = JsonReader.a.a("c", "v", "i", "o");

    private B() {
    }

    @Override // com.airbnb.lottie.x.H
    public com.airbnb.lottie.model.content.h a(JsonReader jsonReader, float f2) throws IOException {
        if (jsonReader.G() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.d();
        }
        jsonReader.h();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.r()) {
            int I = jsonReader.I(b);
            if (I == 0) {
                z = jsonReader.s();
            } else if (I == 1) {
                list = p.c(jsonReader, f2);
            } else if (I == 2) {
                list2 = p.c(jsonReader, f2);
            } else if (I != 3) {
                jsonReader.M();
                jsonReader.N();
            } else {
                list3 = p.c(jsonReader, f2);
            }
        }
        jsonReader.o();
        if (jsonReader.G() == JsonReader.Token.END_ARRAY) {
            jsonReader.l();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new com.airbnb.lottie.model.content.h(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = list.get(i);
            int i2 = i - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.y.g.a(list.get(i2), list3.get(i2)), com.airbnb.lottie.y.g.a(pointF2, list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = list.get(0);
            int i3 = size - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.y.g.a(list.get(i3), list3.get(i3)), com.airbnb.lottie.y.g.a(pointF3, list2.get(0)), pointF3));
        }
        return new com.airbnb.lottie.model.content.h(pointF, z, arrayList);
    }
}
