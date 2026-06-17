package com.airbnb.lottie.x;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class r {
    static JsonReader.a a = JsonReader.a.a("k");

    static <T> List<com.airbnb.lottie.z.a<T>> a(JsonReader jsonReader, com.airbnb.lottie.g gVar, float f2, H<T> h, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.G() == JsonReader.Token.STRING) {
            gVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.h();
        while (jsonReader.r()) {
            if (jsonReader.I(a) != 0) {
                jsonReader.N();
            } else if (jsonReader.G() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.d();
                if (jsonReader.G() == JsonReader.Token.NUMBER) {
                    arrayList.add(q.b(jsonReader, gVar, f2, h, false, z));
                } else {
                    while (jsonReader.r()) {
                        arrayList.add(q.b(jsonReader, gVar, f2, h, true, z));
                    }
                }
                jsonReader.l();
            } else {
                arrayList.add(q.b(jsonReader, gVar, f2, h, false, z));
            }
        }
        jsonReader.o();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends com.airbnb.lottie.z.a<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.airbnb.lottie.z.a<T> aVar = list.get(i2);
            i2++;
            com.airbnb.lottie.z.a<T> aVar2 = list.get(i2);
            aVar.h = Float.valueOf(aVar2.f1463g);
            if (aVar.f1459c == null && (t = aVar2.b) != null) {
                aVar.f1459c = t;
                if (aVar instanceof com.airbnb.lottie.v.c.h) {
                    ((com.airbnb.lottie.v.c.h) aVar).i();
                }
            }
        }
        com.airbnb.lottie.z.a<T> aVar3 = list.get(i);
        if ((aVar3.b == null || aVar3.f1459c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
