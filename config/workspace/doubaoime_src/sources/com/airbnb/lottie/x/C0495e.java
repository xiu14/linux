package com.airbnb.lottie.x;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0495e {
    private static JsonReader.a a = JsonReader.a.a("nm", "p", "s", "hd", "d");

    static com.airbnb.lottie.model.content.a a(JsonReader jsonReader, com.airbnb.lottie.g gVar, int i) throws IOException {
        boolean z = i == 3;
        boolean z2 = false;
        String str = null;
        com.airbnb.lottie.model.i.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.i.f fVar = null;
        while (jsonReader.r()) {
            int I = jsonReader.I(a);
            if (I == 0) {
                str = jsonReader.A();
            } else if (I == 1) {
                mVar = C0491a.b(jsonReader, gVar);
            } else if (I == 2) {
                fVar = C0494d.h(jsonReader, gVar);
            } else if (I == 3) {
                z2 = jsonReader.s();
            } else if (I != 4) {
                jsonReader.M();
                jsonReader.N();
            } else {
                z = jsonReader.x() == 3;
            }
        }
        return new com.airbnb.lottie.model.content.a(str, mVar, fVar, z, z2);
    }
}
