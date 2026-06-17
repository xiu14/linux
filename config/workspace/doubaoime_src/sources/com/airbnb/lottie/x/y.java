package com.airbnb.lottie.x;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.IOException;

/* loaded from: classes.dex */
class y {
    private static JsonReader.a a = JsonReader.a.a("nm", "p", "s", DownloadFileUtils.MODE_READ, "hd");

    static com.airbnb.lottie.model.content.f a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        String str = null;
        com.airbnb.lottie.model.i.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.i.f fVar = null;
        com.airbnb.lottie.model.i.b bVar = null;
        boolean z = false;
        while (jsonReader.r()) {
            int I = jsonReader.I(a);
            if (I == 0) {
                str = jsonReader.A();
            } else if (I == 1) {
                mVar = C0491a.b(jsonReader, gVar);
            } else if (I == 2) {
                fVar = C0494d.h(jsonReader, gVar);
            } else if (I == 3) {
                bVar = C0494d.d(jsonReader, gVar);
            } else if (I != 4) {
                jsonReader.N();
            } else {
                z = jsonReader.s();
            }
        }
        return new com.airbnb.lottie.model.content.f(str, mVar, fVar, bVar, z);
    }
}
