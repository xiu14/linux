package com.airbnb.lottie;

import androidx.collection.ArraySet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class r {
    private boolean a = false;
    private final Set<a> b = new ArraySet();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, com.airbnb.lottie.y.f> f1371c = new HashMap();

    public interface a {
        void a(float f2);
    }

    public void a(String str, float f2) {
        if (this.a) {
            com.airbnb.lottie.y.f fVar = this.f1371c.get(str);
            if (fVar == null) {
                fVar = new com.airbnb.lottie.y.f();
                this.f1371c.put(str, fVar);
            }
            fVar.a(f2);
            if (str.equals("__container")) {
                Iterator<a> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next().a(f2);
                }
            }
        }
    }

    void b(boolean z) {
        this.a = z;
    }
}
