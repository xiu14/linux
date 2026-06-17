package com.airbnb.lottie.x;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
class j {
    private static final JsonReader.a a = JsonReader.a.a("ch", MonitorConstants.SIZE, DownloadFileUtils.MODE_WRITE, "style", "fFamily", RemoteMessageConst.DATA);
    private static final JsonReader.a b = JsonReader.a.a("shapes");

    static com.airbnb.lottie.model.c a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.h();
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        double d3 = 0.0d;
        char c2 = 0;
        while (jsonReader.r()) {
            int I = jsonReader.I(a);
            if (I == 0) {
                c2 = jsonReader.A().charAt(0);
            } else if (I == 1) {
                d2 = jsonReader.w();
            } else if (I == 2) {
                d3 = jsonReader.w();
            } else if (I == 3) {
                str = jsonReader.A();
            } else if (I == 4) {
                str2 = jsonReader.A();
            } else if (I != 5) {
                jsonReader.M();
                jsonReader.N();
            } else {
                jsonReader.h();
                while (jsonReader.r()) {
                    if (jsonReader.I(b) != 0) {
                        jsonReader.M();
                        jsonReader.N();
                    } else {
                        jsonReader.d();
                        while (jsonReader.r()) {
                            arrayList.add((com.airbnb.lottie.model.content.j) C0497g.a(jsonReader, gVar));
                        }
                        jsonReader.l();
                    }
                }
                jsonReader.o();
            }
        }
        jsonReader.o();
        return new com.airbnb.lottie.model.c(arrayList, c2, d2, d3, str, str2);
    }
}
