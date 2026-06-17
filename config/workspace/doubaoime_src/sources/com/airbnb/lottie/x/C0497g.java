package com.airbnb.lottie.x;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0497g {
    private static JsonReader.a a = JsonReader.a.a("ty", "d");

    @Nullable
    static com.airbnb.lottie.model.content.b a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        String str;
        String str2;
        com.airbnb.lottie.model.content.b a2;
        jsonReader.h();
        int i = 2;
        while (true) {
            str = null;
            a2 = null;
            if (!jsonReader.r()) {
                str2 = null;
                break;
            }
            int I = jsonReader.I(a);
            if (I == 0) {
                str2 = jsonReader.A();
                break;
            }
            if (I != 1) {
                jsonReader.M();
                jsonReader.N();
            } else {
                i = jsonReader.x();
            }
        }
        if (str2 == null) {
            return null;
        }
        switch (str2) {
            case "el":
                a2 = C0495e.a(jsonReader, gVar, i);
                break;
            case "fl":
                a2 = C.a(jsonReader, gVar);
                break;
            case "gf":
                a2 = m.a(jsonReader, gVar);
                break;
            case "gr":
                a2 = D.a(jsonReader, gVar);
                break;
            case "gs":
                a2 = n.a(jsonReader, gVar);
                break;
            case "mm":
                a2 = u.a(jsonReader);
                gVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case "rc":
                a2 = y.a(jsonReader, gVar);
                break;
            case "rp":
                a2 = z.a(jsonReader, gVar);
                break;
            case "sh":
                JsonReader.a aVar = E.a;
                com.airbnb.lottie.model.i.h hVar = null;
                int i2 = 0;
                boolean z = false;
                while (jsonReader.r()) {
                    int I2 = jsonReader.I(E.a);
                    if (I2 == 0) {
                        str = jsonReader.A();
                    } else if (I2 == 1) {
                        i2 = jsonReader.x();
                    } else if (I2 == 2) {
                        hVar = new com.airbnb.lottie.model.i.h(r.a(jsonReader, gVar, com.airbnb.lottie.y.h.c(), B.a, false));
                    } else if (I2 != 3) {
                        jsonReader.N();
                    } else {
                        z = jsonReader.s();
                    }
                }
                a2 = new com.airbnb.lottie.model.content.k(str, i2, hVar, z);
                break;
            case "sr":
                a2 = x.a(jsonReader, gVar);
                break;
            case "st":
                a2 = F.a(jsonReader, gVar);
                break;
            case "tm":
                a2 = G.a(jsonReader, gVar);
                break;
            case "tr":
                a2 = C0493c.a(jsonReader, gVar);
                break;
            default:
                com.airbnb.lottie.y.d.c("Unknown shape type " + str2);
                break;
        }
        while (jsonReader.r()) {
            jsonReader.N();
        }
        jsonReader.o();
        return a2;
    }
}
