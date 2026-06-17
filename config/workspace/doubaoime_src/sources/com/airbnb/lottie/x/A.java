package com.airbnb.lottie.x;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class A implements H<com.airbnb.lottie.z.d> {
    public static final A a = new A();

    private A() {
    }

    @Override // com.airbnb.lottie.x.H
    public com.airbnb.lottie.z.d a(JsonReader jsonReader, float f2) throws IOException {
        boolean z = jsonReader.G() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.d();
        }
        float w = (float) jsonReader.w();
        float w2 = (float) jsonReader.w();
        while (jsonReader.r()) {
            jsonReader.N();
        }
        if (z) {
            jsonReader.l();
        }
        return new com.airbnb.lottie.z.d((w / 100.0f) * f2, (w2 / 100.0f) * f2);
    }
}
