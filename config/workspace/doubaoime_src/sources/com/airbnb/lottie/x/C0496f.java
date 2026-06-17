package com.airbnb.lottie.x;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0496f implements H<Integer> {
    public static final C0496f a = new C0496f();

    private C0496f() {
    }

    @Override // com.airbnb.lottie.x.H
    public Integer a(JsonReader jsonReader, float f2) throws IOException {
        boolean z = jsonReader.G() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.d();
        }
        double w = jsonReader.w();
        double w2 = jsonReader.w();
        double w3 = jsonReader.w();
        double w4 = jsonReader.G() == JsonReader.Token.NUMBER ? jsonReader.w() : 1.0d;
        if (z) {
            jsonReader.l();
        }
        if (w <= 1.0d && w2 <= 1.0d && w3 <= 1.0d) {
            w *= 255.0d;
            w2 *= 255.0d;
            w3 *= 255.0d;
            if (w4 <= 1.0d) {
                w4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) w4, (int) w, (int) w2, (int) w3));
    }
}
