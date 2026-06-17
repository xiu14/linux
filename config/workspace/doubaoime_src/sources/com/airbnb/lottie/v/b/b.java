package com.airbnb.lottie.v.b;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {
    private List<s> a = new ArrayList();

    void a(s sVar) {
        this.a.add(sVar);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            s sVar = this.a.get(size);
            int i = com.airbnb.lottie.y.h.f1458g;
            if (sVar != null && !sVar.j()) {
                com.airbnb.lottie.y.h.a(path, ((com.airbnb.lottie.v.c.c) sVar.h()).n() / 100.0f, ((com.airbnb.lottie.v.c.c) sVar.e()).n() / 100.0f, ((com.airbnb.lottie.v.c.c) sVar.g()).n() / 360.0f);
            }
        }
    }
}
