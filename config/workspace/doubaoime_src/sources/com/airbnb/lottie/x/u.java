package com.airbnb.lottie.x;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class u {
    private static final JsonReader.a a = JsonReader.a.a("nm", "mm", "hd");

    static MergePaths a(JsonReader jsonReader) throws IOException {
        String str = null;
        boolean z = false;
        MergePaths.MergePathsMode mergePathsMode = null;
        while (jsonReader.r()) {
            int I = jsonReader.I(a);
            if (I == 0) {
                str = jsonReader.A();
            } else if (I == 1) {
                mergePathsMode = MergePaths.MergePathsMode.forId(jsonReader.x());
            } else if (I != 2) {
                jsonReader.M();
                jsonReader.N();
            } else {
                z = jsonReader.s();
            }
        }
        return new MergePaths(str, mergePathsMode, z);
    }
}
