package com.airbnb.lottie.x;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.bytedance.crash.general.RomInfo;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.IOException;

/* loaded from: classes.dex */
class x {
    private static final JsonReader.a a = JsonReader.a.a("nm", "sy", "pt", "p", DownloadFileUtils.MODE_READ, "or", RomInfo.KEY_OS_TYPE, "ir", "is", "hd");

    static PolystarShape a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        boolean z = false;
        String str = null;
        PolystarShape.Type type = null;
        com.airbnb.lottie.model.i.b bVar = null;
        com.airbnb.lottie.model.i.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.i.b bVar2 = null;
        com.airbnb.lottie.model.i.b bVar3 = null;
        com.airbnb.lottie.model.i.b bVar4 = null;
        com.airbnb.lottie.model.i.b bVar5 = null;
        com.airbnb.lottie.model.i.b bVar6 = null;
        while (jsonReader.r()) {
            switch (jsonReader.I(a)) {
                case 0:
                    str = jsonReader.A();
                    break;
                case 1:
                    type = PolystarShape.Type.forValue(jsonReader.x());
                    break;
                case 2:
                    bVar = C0494d.e(jsonReader, gVar, false);
                    break;
                case 3:
                    mVar = C0491a.b(jsonReader, gVar);
                    break;
                case 4:
                    bVar2 = C0494d.e(jsonReader, gVar, false);
                    break;
                case 5:
                    bVar4 = C0494d.d(jsonReader, gVar);
                    break;
                case 6:
                    bVar6 = C0494d.e(jsonReader, gVar, false);
                    break;
                case 7:
                    bVar3 = C0494d.d(jsonReader, gVar);
                    break;
                case 8:
                    bVar5 = C0494d.e(jsonReader, gVar, false);
                    break;
                case 9:
                    z = jsonReader.s();
                    break;
                default:
                    jsonReader.M();
                    jsonReader.N();
                    break;
            }
        }
        return new PolystarShape(str, type, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z);
    }
}
