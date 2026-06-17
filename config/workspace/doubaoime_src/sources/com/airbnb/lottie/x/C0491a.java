package com.airbnb.lottie.x;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0491a {
    private static final JsonReader.a a = JsonReader.a.a("k", "x", "y");

    public static com.airbnb.lottie.model.i.e a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.G() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.d();
            while (jsonReader.r()) {
                arrayList.add(new com.airbnb.lottie.v.c.h(gVar, q.b(jsonReader, gVar, com.airbnb.lottie.y.h.c(), v.a, jsonReader.G() == JsonReader.Token.BEGIN_OBJECT, false)));
            }
            jsonReader.l();
            r.b(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.z.a(p.b(jsonReader, com.airbnb.lottie.y.h.c())));
        }
        return new com.airbnb.lottie.model.i.e(arrayList);
    }

    static com.airbnb.lottie.model.i.m<PointF, PointF> b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.h();
        com.airbnb.lottie.model.i.e eVar = null;
        com.airbnb.lottie.model.i.b bVar = null;
        boolean z = false;
        com.airbnb.lottie.model.i.b bVar2 = null;
        while (jsonReader.G() != JsonReader.Token.END_OBJECT) {
            int I = jsonReader.I(a);
            if (I == 0) {
                eVar = a(jsonReader, gVar);
            } else if (I != 1) {
                if (I != 2) {
                    jsonReader.M();
                    jsonReader.N();
                } else if (jsonReader.G() == JsonReader.Token.STRING) {
                    jsonReader.N();
                    z = true;
                } else {
                    bVar = C0494d.d(jsonReader, gVar);
                }
            } else if (jsonReader.G() == JsonReader.Token.STRING) {
                jsonReader.N();
                z = true;
            } else {
                bVar2 = C0494d.d(jsonReader, gVar);
            }
        }
        jsonReader.o();
        if (z) {
            gVar.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new com.airbnb.lottie.model.i.i(bVar2, bVar);
    }
}
