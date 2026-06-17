package com.airbnb.lottie.x;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
class n {
    private static JsonReader.a a = JsonReader.a.a("nm", "g", "o", "t", "s", "e", DownloadFileUtils.MODE_WRITE, "lc", "lj", "ml", "hd", "d");
    private static final JsonReader.a b = JsonReader.a.a("p", "k");

    /* renamed from: c, reason: collision with root package name */
    private static final JsonReader.a f1442c = JsonReader.a.a("n", "v");

    static com.airbnb.lottie.model.content.e a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        com.airbnb.lottie.model.i.c cVar;
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        String str = null;
        GradientType gradientType = null;
        com.airbnb.lottie.model.i.c cVar2 = null;
        com.airbnb.lottie.model.i.f fVar = null;
        com.airbnb.lottie.model.i.f fVar2 = null;
        com.airbnb.lottie.model.i.b bVar = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        com.airbnb.lottie.model.i.b bVar2 = null;
        boolean z = false;
        com.airbnb.lottie.model.i.d dVar = null;
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
                        if (I != 0) {
                            cVar = cVar2;
                            if (I != 1) {
                                jsonReader.M();
                                jsonReader.N();
                            } else {
                                cVar2 = C0494d.f(jsonReader, gVar, i);
                            }
                        } else {
                            cVar = cVar2;
                            i = jsonReader.x();
                        }
                        cVar2 = cVar;
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
                    bVar = C0494d.d(jsonReader, gVar);
                    break;
                case 7:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.x() - 1];
                    break;
                case 8:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.x() - 1];
                    break;
                case 9:
                    f2 = (float) jsonReader.w();
                    break;
                case 10:
                    z = jsonReader.s();
                    break;
                case 11:
                    jsonReader.d();
                    while (jsonReader.r()) {
                        jsonReader.h();
                        com.airbnb.lottie.model.i.b bVar3 = null;
                        String str2 = null;
                        while (jsonReader.r()) {
                            int I2 = jsonReader.I(f1442c);
                            if (I2 != 0) {
                                com.airbnb.lottie.model.i.b bVar4 = bVar2;
                                if (I2 != 1) {
                                    jsonReader.M();
                                    jsonReader.N();
                                } else {
                                    bVar3 = C0494d.d(jsonReader, gVar);
                                }
                                bVar2 = bVar4;
                            } else {
                                str2 = jsonReader.A();
                            }
                        }
                        com.airbnb.lottie.model.i.b bVar5 = bVar2;
                        jsonReader.o();
                        String str3 = str2;
                        if (str3.equals("o")) {
                            bVar2 = bVar3;
                        } else {
                            if (str3.equals("d") || str3.equals("g")) {
                                gVar.u(true);
                                arrayList.add(bVar3);
                            }
                            bVar2 = bVar5;
                        }
                    }
                    com.airbnb.lottie.model.i.b bVar6 = bVar2;
                    jsonReader.l();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    bVar2 = bVar6;
                    break;
                default:
                    jsonReader.M();
                    jsonReader.N();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.i.d(Collections.singletonList(new com.airbnb.lottie.z.a(100)));
        }
        return new com.airbnb.lottie.model.content.e(str, gradientType, cVar2, dVar, fVar, fVar2, bVar, lineCapType, lineJoinType, f2, arrayList, bVar2, z);
    }
}
