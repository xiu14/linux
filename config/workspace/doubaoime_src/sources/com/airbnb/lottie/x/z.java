package com.airbnb.lottie.x;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class z {
    private static JsonReader.a a = JsonReader.a.a("nm", "c", "o", "tr", "hd");

    static com.airbnb.lottie.model.content.g a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        boolean z = false;
        String str = null;
        com.airbnb.lottie.model.i.b bVar = null;
        com.airbnb.lottie.model.i.b bVar2 = null;
        com.airbnb.lottie.model.i.l lVar = null;
        while (jsonReader.r()) {
            int I = jsonReader.I(a);
            if (I == 0) {
                str = jsonReader.A();
            } else if (I == 1) {
                bVar = C0494d.e(jsonReader, gVar, false);
            } else if (I == 2) {
                bVar2 = C0494d.e(jsonReader, gVar, false);
            } else if (I == 3) {
                lVar = C0493c.a(jsonReader, gVar);
            } else if (I != 4) {
                jsonReader.N();
            } else {
                z = jsonReader.s();
            }
        }
        return new com.airbnb.lottie.model.content.g(str, bVar, bVar2, lVar, z);
    }
}
