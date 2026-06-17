package com.airbnb.lottie.x;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* renamed from: com.airbnb.lottie.x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0494d {
    private static <T> List<com.airbnb.lottie.z.a<T>> a(JsonReader jsonReader, com.airbnb.lottie.g gVar, H<T> h) throws IOException {
        return r.a(jsonReader, gVar, 1.0f, h, false);
    }

    static com.airbnb.lottie.model.i.a b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.i.a(a(jsonReader, gVar, C0496f.a));
    }

    static com.airbnb.lottie.model.i.j c(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.i.j(a(jsonReader, gVar, C0498h.a));
    }

    public static com.airbnb.lottie.model.i.b d(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return e(jsonReader, gVar, true);
    }

    public static com.airbnb.lottie.model.i.b e(JsonReader jsonReader, com.airbnb.lottie.g gVar, boolean z) throws IOException {
        return new com.airbnb.lottie.model.i.b(r.a(jsonReader, gVar, z ? com.airbnb.lottie.y.h.c() : 1.0f, i.a, false));
    }

    static com.airbnb.lottie.model.i.c f(JsonReader jsonReader, com.airbnb.lottie.g gVar, int i) throws IOException {
        return new com.airbnb.lottie.model.i.c(a(jsonReader, gVar, new l(i)));
    }

    static com.airbnb.lottie.model.i.d g(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.i.d(a(jsonReader, gVar, o.a));
    }

    static com.airbnb.lottie.model.i.f h(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.i.f(r.a(jsonReader, gVar, com.airbnb.lottie.y.h.c(), w.a, true));
    }

    static com.airbnb.lottie.model.i.g i(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.i.g(a(jsonReader, gVar, A.a));
    }
}
