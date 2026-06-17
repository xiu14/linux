package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class d {
    private static int a;
    private static volatile com.airbnb.lottie.network.e b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.d f1259c;

    public static float a(String str) {
        int i = a;
        if (i > 0) {
            a = i - 1;
        }
        return 0.0f;
    }

    @NonNull
    public static com.airbnb.lottie.network.e b(@NonNull Context context) {
        com.airbnb.lottie.network.d dVar;
        com.airbnb.lottie.network.e eVar = b;
        if (eVar == null) {
            synchronized (com.airbnb.lottie.network.e.class) {
                eVar = b;
                if (eVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    com.airbnb.lottie.network.d dVar2 = f1259c;
                    if (dVar2 == null) {
                        synchronized (com.airbnb.lottie.network.d.class) {
                            dVar = f1259c;
                            if (dVar == null) {
                                dVar = new com.airbnb.lottie.network.d(new c(applicationContext));
                                f1259c = dVar;
                            }
                        }
                        dVar2 = dVar;
                    }
                    eVar = new com.airbnb.lottie.network.e(dVar2, new com.airbnb.lottie.network.b());
                    b = eVar;
                }
            }
        }
        return eVar;
    }
}
