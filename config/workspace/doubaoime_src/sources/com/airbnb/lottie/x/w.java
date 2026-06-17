package com.airbnb.lottie.x;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class w implements H<PointF> {
    public static final w a = new w();

    private w() {
    }

    @Override // com.airbnb.lottie.x.H
    public PointF a(JsonReader jsonReader, float f2) throws IOException {
        JsonReader.Token G = jsonReader.G();
        if (G == JsonReader.Token.BEGIN_ARRAY) {
            return p.b(jsonReader, f2);
        }
        if (G == JsonReader.Token.BEGIN_OBJECT) {
            return p.b(jsonReader, f2);
        }
        if (G == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.w()) * f2, ((float) jsonReader.w()) * f2);
            while (jsonReader.r()) {
                jsonReader.N();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + G);
    }
}
