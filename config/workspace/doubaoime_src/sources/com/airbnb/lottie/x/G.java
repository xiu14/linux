package com.airbnb.lottie.x;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class G {
    private static JsonReader.a a = JsonReader.a.a("s", "e", "o", "nm", "m", "hd");

    static ShapeTrimPath a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        boolean z = false;
        String str = null;
        ShapeTrimPath.Type type = null;
        com.airbnb.lottie.model.i.b bVar = null;
        com.airbnb.lottie.model.i.b bVar2 = null;
        com.airbnb.lottie.model.i.b bVar3 = null;
        while (jsonReader.r()) {
            int I = jsonReader.I(a);
            if (I == 0) {
                bVar = C0494d.e(jsonReader, gVar, false);
            } else if (I == 1) {
                bVar2 = C0494d.e(jsonReader, gVar, false);
            } else if (I == 2) {
                bVar3 = C0494d.e(jsonReader, gVar, false);
            } else if (I == 3) {
                str = jsonReader.A();
            } else if (I == 4) {
                type = ShapeTrimPath.Type.forId(jsonReader.x());
            } else if (I != 5) {
                jsonReader.N();
            } else {
                z = jsonReader.s();
            }
        }
        return new ShapeTrimPath(str, type, bVar, bVar2, bVar3, z);
    }
}
