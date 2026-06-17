package com.airbnb.lottie.x;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class v implements H<PointF> {
    public static final v a = new v();

    private v() {
    }

    @Override // com.airbnb.lottie.x.H
    public PointF a(JsonReader jsonReader, float f2) throws IOException {
        return p.b(jsonReader, f2);
    }
}
