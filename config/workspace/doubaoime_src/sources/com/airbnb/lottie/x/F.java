package com.airbnb.lottie.x;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
class F {
    private static JsonReader.a a = JsonReader.a.a("nm", "c", DownloadFileUtils.MODE_WRITE, "o", "lc", "lj", "ml", "hd", "d");
    private static final JsonReader.a b = JsonReader.a.a("n", "v");

    static ShapeStroke a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        char c2;
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        String str = null;
        com.airbnb.lottie.model.i.b bVar = null;
        com.airbnb.lottie.model.i.a aVar = null;
        com.airbnb.lottie.model.i.b bVar2 = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        boolean z = false;
        com.airbnb.lottie.model.i.d dVar = null;
        while (true) {
            int i = 100;
            if (!jsonReader.r()) {
                if (dVar == null) {
                    dVar = new com.airbnb.lottie.model.i.d(Collections.singletonList(new com.airbnb.lottie.z.a(100)));
                }
                return new ShapeStroke(str, bVar, arrayList, aVar, dVar, bVar2, lineCapType, lineJoinType, f2, z);
            }
            switch (jsonReader.I(a)) {
                case 0:
                    str = jsonReader.A();
                    break;
                case 1:
                    aVar = C0494d.b(jsonReader, gVar);
                    break;
                case 2:
                    bVar2 = C0494d.d(jsonReader, gVar);
                    break;
                case 3:
                    dVar = C0494d.g(jsonReader, gVar);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.x() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.x() - 1];
                    break;
                case 6:
                    f2 = (float) jsonReader.w();
                    break;
                case 7:
                    z = jsonReader.s();
                    break;
                case 8:
                    jsonReader.d();
                    while (jsonReader.r()) {
                        jsonReader.h();
                        com.airbnb.lottie.model.i.b bVar3 = null;
                        String str2 = null;
                        while (jsonReader.r()) {
                            int I = jsonReader.I(b);
                            if (I == 0) {
                                str2 = jsonReader.A();
                            } else if (I != 1) {
                                jsonReader.M();
                                jsonReader.N();
                            } else {
                                bVar3 = C0494d.d(jsonReader, gVar);
                            }
                        }
                        jsonReader.o();
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        if (hashCode == i) {
                            if (str2.equals("d")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        } else if (hashCode != 103) {
                            if (hashCode == 111 && str2.equals("o")) {
                                c2 = 2;
                            }
                            c2 = 65535;
                        } else {
                            if (str2.equals("g")) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        }
                        if (c2 == 0 || c2 == 1) {
                            gVar.u(true);
                            arrayList.add(bVar3);
                        } else if (c2 == 2) {
                            bVar = bVar3;
                        }
                        i = 100;
                    }
                    jsonReader.l();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                default:
                    jsonReader.N();
                    break;
            }
        }
    }
}
