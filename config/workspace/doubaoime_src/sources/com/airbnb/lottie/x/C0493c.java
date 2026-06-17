package com.airbnb.lottie.x;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0493c {
    private static final JsonReader.a a = JsonReader.a.a("a", "p", "s", "rz", DownloadFileUtils.MODE_READ, "o", "so", "eo", "sk", "sa");
    private static final JsonReader.a b = JsonReader.a.a("k");

    /* JADX WARN: Multi-variable type inference failed */
    public static com.airbnb.lottie.model.i.l a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        boolean z = jsonReader.G() == JsonReader.Token.BEGIN_OBJECT;
        if (z) {
            jsonReader.h();
        }
        com.airbnb.lottie.model.i.b bVar = null;
        com.airbnb.lottie.model.i.e eVar = null;
        com.airbnb.lottie.model.i.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.i.g gVar2 = null;
        com.airbnb.lottie.model.i.b bVar2 = null;
        com.airbnb.lottie.model.i.b bVar3 = null;
        com.airbnb.lottie.model.i.d dVar = null;
        com.airbnb.lottie.model.i.b bVar4 = null;
        com.airbnb.lottie.model.i.b bVar5 = null;
        while (jsonReader.r()) {
            switch (jsonReader.I(a)) {
                case 0:
                    jsonReader.h();
                    while (jsonReader.r()) {
                        if (jsonReader.I(b) != 0) {
                            jsonReader.M();
                            jsonReader.N();
                        } else {
                            eVar = C0491a.a(jsonReader, gVar);
                        }
                    }
                    jsonReader.o();
                    continue;
                case 1:
                    mVar = C0491a.b(jsonReader, gVar);
                    continue;
                case 2:
                    gVar2 = C0494d.i(jsonReader, gVar);
                    continue;
                case 3:
                    gVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = C0494d.g(jsonReader, gVar);
                    continue;
                case 6:
                    bVar4 = C0494d.e(jsonReader, gVar, false);
                    continue;
                case 7:
                    bVar5 = C0494d.e(jsonReader, gVar, false);
                    continue;
                case 8:
                    bVar2 = C0494d.e(jsonReader, gVar, false);
                    continue;
                case 9:
                    bVar3 = C0494d.e(jsonReader, gVar, false);
                    continue;
                default:
                    jsonReader.M();
                    jsonReader.N();
                    continue;
            }
            com.airbnb.lottie.model.i.b e2 = C0494d.e(jsonReader, gVar, false);
            if (e2.b().isEmpty()) {
                e2.b().add(new com.airbnb.lottie.z.a(gVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(gVar.f())));
            } else if (((com.airbnb.lottie.z.a) e2.b().get(0)).b == 0) {
                e2.b().set(0, new com.airbnb.lottie.z.a(gVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(gVar.f())));
            }
            bVar = e2;
        }
        if (z) {
            jsonReader.o();
        }
        if (eVar == null || (eVar.c() && eVar.b().get(0).b.equals(0.0f, 0.0f))) {
            eVar = null;
        }
        if (mVar == null || (!(mVar instanceof com.airbnb.lottie.model.i.i) && mVar.c() && mVar.b().get(0).b.equals(0.0f, 0.0f))) {
            mVar = null;
        }
        return new com.airbnb.lottie.model.i.l(eVar, mVar, gVar2 == null || (gVar2.c() && ((com.airbnb.lottie.z.d) ((com.airbnb.lottie.z.a) gVar2.b().get(0)).b).a(1.0f, 1.0f)) ? null : gVar2, bVar == null || (bVar.c() && (((Float) ((com.airbnb.lottie.z.a) bVar.b().get(0)).b).floatValue() > 0.0f ? 1 : (((Float) ((com.airbnb.lottie.z.a) bVar.b().get(0)).b).floatValue() == 0.0f ? 0 : -1)) == 0) ? null : bVar, dVar, bVar4, bVar5, bVar2 == null || (bVar2.c() && (((Float) ((com.airbnb.lottie.z.a) bVar2.b().get(0)).b).floatValue() > 0.0f ? 1 : (((Float) ((com.airbnb.lottie.z.a) bVar2.b().get(0)).b).floatValue() == 0.0f ? 0 : -1)) == 0) ? null : bVar2, bVar3 == null || (bVar3.c() && (((Float) ((com.airbnb.lottie.z.a) bVar3.b().get(0)).b).floatValue() > 0.0f ? 1 : (((Float) ((com.airbnb.lottie.z.a) bVar3.b().get(0)).b).floatValue() == 0.0f ? 0 : -1)) == 0) ? null : bVar3);
    }
}
