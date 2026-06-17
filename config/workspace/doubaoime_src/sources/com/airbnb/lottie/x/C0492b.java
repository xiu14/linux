package com.airbnb.lottie.x;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0492b {
    private static JsonReader.a a = JsonReader.a.a("a");
    private static JsonReader.a b = JsonReader.a.a("fc", "sc", "sw", "t");

    public static com.airbnb.lottie.model.i.k a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.h();
        com.airbnb.lottie.model.i.k kVar = null;
        while (jsonReader.r()) {
            if (jsonReader.I(a) != 0) {
                jsonReader.M();
                jsonReader.N();
            } else {
                jsonReader.h();
                com.airbnb.lottie.model.i.a aVar = null;
                com.airbnb.lottie.model.i.a aVar2 = null;
                com.airbnb.lottie.model.i.b bVar = null;
                com.airbnb.lottie.model.i.b bVar2 = null;
                while (jsonReader.r()) {
                    int I = jsonReader.I(b);
                    if (I == 0) {
                        aVar = C0494d.b(jsonReader, gVar);
                    } else if (I == 1) {
                        aVar2 = C0494d.b(jsonReader, gVar);
                    } else if (I == 2) {
                        bVar = C0494d.d(jsonReader, gVar);
                    } else if (I != 3) {
                        jsonReader.M();
                        jsonReader.N();
                    } else {
                        bVar2 = C0494d.d(jsonReader, gVar);
                    }
                }
                jsonReader.o();
                kVar = new com.airbnb.lottie.model.i.k(aVar, aVar2, bVar, bVar2);
            }
        }
        jsonReader.o();
        return kVar == null ? new com.airbnb.lottie.model.i.k(null, null, null, null) : kVar;
    }
}
