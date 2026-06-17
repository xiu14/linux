package com.bytedance.feedbackerlib.model.j;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import java.util.Map;

/* loaded from: classes.dex */
public class d {
    public final Map<String, String> a;

    private d(Map<String, String> map, int i) {
        this.a = map;
    }

    @NonNull
    public static d a(@NonNull com.bytedance.feedbackerlib.model.i.b bVar) throws RuntimeException {
        return new d(bVar.a, bVar.b);
    }

    @NonNull
    public static d b(@NonNull String str) throws RuntimeException {
        com.bytedance.feedbackerlib.model.i.b bVar = (com.bytedance.feedbackerlib.model.i.b) new Gson().c(str, com.bytedance.feedbackerlib.model.i.b.class);
        return new d(bVar.a, bVar.b);
    }
}
