package com.airbnb.lottie.x;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class p {
    private static final JsonReader.a a = JsonReader.a.a("x", "y");

    @ColorInt
    static int a(JsonReader jsonReader) throws IOException {
        jsonReader.d();
        int w = (int) (jsonReader.w() * 255.0d);
        int w2 = (int) (jsonReader.w() * 255.0d);
        int w3 = (int) (jsonReader.w() * 255.0d);
        while (jsonReader.r()) {
            jsonReader.N();
        }
        jsonReader.l();
        return Color.argb(255, w, w2, w3);
    }

    static PointF b(JsonReader jsonReader, float f2) throws IOException {
        int ordinal = jsonReader.G().ordinal();
        if (ordinal == 0) {
            jsonReader.d();
            float w = (float) jsonReader.w();
            float w2 = (float) jsonReader.w();
            while (jsonReader.G() != JsonReader.Token.END_ARRAY) {
                jsonReader.N();
            }
            jsonReader.l();
            return new PointF(w * f2, w2 * f2);
        }
        if (ordinal != 2) {
            if (ordinal != 6) {
                StringBuilder M = e.a.a.a.a.M("Unknown point starts with ");
                M.append(jsonReader.G());
                throw new IllegalArgumentException(M.toString());
            }
            float w3 = (float) jsonReader.w();
            float w4 = (float) jsonReader.w();
            while (jsonReader.r()) {
                jsonReader.N();
            }
            return new PointF(w3 * f2, w4 * f2);
        }
        jsonReader.h();
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (jsonReader.r()) {
            int I = jsonReader.I(a);
            if (I == 0) {
                f3 = d(jsonReader);
            } else if (I != 1) {
                jsonReader.M();
                jsonReader.N();
            } else {
                f4 = d(jsonReader);
            }
        }
        jsonReader.o();
        return new PointF(f3 * f2, f4 * f2);
    }

    static List<PointF> c(JsonReader jsonReader, float f2) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.d();
        while (jsonReader.G() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.d();
            arrayList.add(b(jsonReader, f2));
            jsonReader.l();
        }
        jsonReader.l();
        return arrayList;
    }

    static float d(JsonReader jsonReader) throws IOException {
        JsonReader.Token G = jsonReader.G();
        int ordinal = G.ordinal();
        if (ordinal != 0) {
            if (ordinal == 6) {
                return (float) jsonReader.w();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + G);
        }
        jsonReader.d();
        float w = (float) jsonReader.w();
        while (jsonReader.r()) {
            jsonReader.N();
        }
        jsonReader.l();
        return w;
    }
}
