package com.airbnb.lottie.x;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0498h implements H<DocumentData> {
    public static final C0498h a = new C0498h();
    private static final JsonReader.a b = JsonReader.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C0498h() {
    }

    @Override // com.airbnb.lottie.x.H
    public DocumentData a(JsonReader jsonReader, float f2) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.h();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        boolean z = true;
        while (jsonReader.r()) {
            switch (jsonReader.I(b)) {
                case 0:
                    str = jsonReader.A();
                    break;
                case 1:
                    str2 = jsonReader.A();
                    break;
                case 2:
                    f3 = (float) jsonReader.w();
                    break;
                case 3:
                    int x = jsonReader.x();
                    justification2 = DocumentData.Justification.CENTER;
                    if (x <= 2 && x >= 0) {
                        justification2 = DocumentData.Justification.values()[x];
                        break;
                    }
                    break;
                case 4:
                    i = jsonReader.x();
                    break;
                case 5:
                    f4 = (float) jsonReader.w();
                    break;
                case 6:
                    f5 = (float) jsonReader.w();
                    break;
                case 7:
                    i2 = p.a(jsonReader);
                    break;
                case 8:
                    i3 = p.a(jsonReader);
                    break;
                case 9:
                    f6 = (float) jsonReader.w();
                    break;
                case 10:
                    z = jsonReader.s();
                    break;
                default:
                    jsonReader.M();
                    jsonReader.N();
                    break;
            }
        }
        jsonReader.o();
        return new DocumentData(str, str2, f3, justification2, i, f4, f5, i2, i3, f6, z);
    }
}
