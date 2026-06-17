package com.airbnb.lottie.x;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class o implements H<Integer> {
    public static final o a = new o();

    private o() {
    }

    @Override // com.airbnb.lottie.x.H
    public Integer a(JsonReader jsonReader, float f2) throws IOException {
        return Integer.valueOf(Math.round(p.d(jsonReader) * f2));
    }
}
