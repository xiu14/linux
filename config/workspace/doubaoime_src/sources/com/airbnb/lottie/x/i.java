package com.airbnb.lottie.x;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class i implements H<Float> {
    public static final i a = new i();

    private i() {
    }

    @Override // com.airbnb.lottie.x.H
    public Float a(JsonReader jsonReader, float f2) throws IOException {
        return Float.valueOf(p.d(jsonReader) * f2);
    }
}
