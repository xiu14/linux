package com.airbnb.lottie.x;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class k {
    private static final JsonReader.a a = JsonReader.a.a("fFamily", "fName", "fStyle", "ascent");

    static com.airbnb.lottie.model.b a(JsonReader jsonReader) throws IOException {
        jsonReader.h();
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        String str3 = null;
        while (jsonReader.r()) {
            int I = jsonReader.I(a);
            if (I == 0) {
                str = jsonReader.A();
            } else if (I == 1) {
                str3 = jsonReader.A();
            } else if (I == 2) {
                str2 = jsonReader.A();
            } else if (I != 3) {
                jsonReader.M();
                jsonReader.N();
            } else {
                f2 = (float) jsonReader.w();
            }
        }
        jsonReader.o();
        return new com.airbnb.lottie.model.b(str, str3, str2, f2);
    }
}
