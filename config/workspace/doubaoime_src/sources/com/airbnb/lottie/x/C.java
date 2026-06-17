package com.airbnb.lottie.x;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
class C {
    private static final JsonReader.a a = JsonReader.a.a("nm", "c", "o", "fillEnabled", DownloadFileUtils.MODE_READ, "hd");

    static com.airbnb.lottie.model.content.i a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        com.airbnb.lottie.model.i.d dVar = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        String str = null;
        com.airbnb.lottie.model.i.a aVar = null;
        while (jsonReader.r()) {
            int I = jsonReader.I(a);
            if (I == 0) {
                str = jsonReader.A();
            } else if (I == 1) {
                aVar = C0494d.b(jsonReader, gVar);
            } else if (I == 2) {
                dVar = C0494d.g(jsonReader, gVar);
            } else if (I == 3) {
                z = jsonReader.s();
            } else if (I == 4) {
                i = jsonReader.x();
            } else if (I != 5) {
                jsonReader.M();
                jsonReader.N();
            } else {
                z2 = jsonReader.s();
            }
        }
        return new com.airbnb.lottie.model.content.i(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar == null ? new com.airbnb.lottie.model.i.d(Collections.singletonList(new com.airbnb.lottie.z.a(100))) : dVar, z2);
    }
}
