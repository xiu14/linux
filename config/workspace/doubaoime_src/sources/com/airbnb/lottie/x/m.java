package com.airbnb.lottie.x;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
class m {
    private static final JsonReader.a a = JsonReader.a.a("nm", "g", "o", "t", "s", "e", DownloadFileUtils.MODE_READ, "hd");
    private static final JsonReader.a b = JsonReader.a.a("p", "k");

    static com.airbnb.lottie.model.content.d a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        com.airbnb.lottie.model.i.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType = null;
        com.airbnb.lottie.model.i.c cVar = null;
        com.airbnb.lottie.model.i.f fVar = null;
        com.airbnb.lottie.model.i.f fVar2 = null;
        boolean z = false;
        while (jsonReader.r()) {
            switch (jsonReader.I(a)) {
                case 0:
                    str = jsonReader.A();
                    break;
                case 1:
                    int i = -1;
                    jsonReader.h();
                    while (jsonReader.r()) {
                        int I = jsonReader.I(b);
                        if (I == 0) {
                            i = jsonReader.x();
                        } else if (I != 1) {
                            jsonReader.M();
                            jsonReader.N();
                        } else {
                            cVar = C0494d.f(jsonReader, gVar, i);
                        }
                    }
                    jsonReader.o();
                    break;
                case 2:
                    dVar = C0494d.g(jsonReader, gVar);
                    break;
                case 3:
                    gradientType = jsonReader.x() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    fVar = C0494d.h(jsonReader, gVar);
                    break;
                case 5:
                    fVar2 = C0494d.h(jsonReader, gVar);
                    break;
                case 6:
                    fillType = jsonReader.x() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = jsonReader.s();
                    break;
                default:
                    jsonReader.M();
                    jsonReader.N();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.d(str, gradientType, fillType, cVar, dVar == null ? new com.airbnb.lottie.model.i.d(Collections.singletonList(new com.airbnb.lottie.z.a(100))) : dVar, fVar, fVar2, null, null, z);
    }
}
