package com.airbnb.lottie.x;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
class D {
    private static JsonReader.a a = JsonReader.a.a("nm", "hd", "it");

    static com.airbnb.lottie.model.content.j a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.r()) {
            int I = jsonReader.I(a);
            if (I == 0) {
                str = jsonReader.A();
            } else if (I == 1) {
                z = jsonReader.s();
            } else if (I != 2) {
                jsonReader.N();
            } else {
                jsonReader.d();
                while (jsonReader.r()) {
                    com.airbnb.lottie.model.content.b a2 = C0497g.a(jsonReader, gVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                jsonReader.l();
            }
        }
        return new com.airbnb.lottie.model.content.j(str, arrayList, z);
    }
}
