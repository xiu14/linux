package com.bytedance.android.input.basic.network.d;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.retrofit2.N;
import com.google.gson.Gson;
import com.prolificinteractive.materialcalendarview.r;
import java.lang.reflect.Type;
import kotlin.h;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b {
    public static final b a = new b();

    private b() {
    }

    static com.bytedance.android.input.basic.network.b.a a(b bVar, int i, String str, int i2) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        com.bytedance.android.input.basic.network.b.a aVar = new com.bytedance.android.input.basic.network.b.a();
        aVar.f(str);
        aVar.e(i);
        return aVar;
    }

    public final <T> com.bytedance.android.input.basic.network.b.a<T> b(N<String> n, Type type) {
        l.f(n, "response");
        l.f(type, "responseType");
        try {
            if (!n.f()) {
                return a(this, 0, "parse response failure", 1);
            }
            com.bytedance.android.input.basic.network.b.a<T> aVar = (com.bytedance.android.input.basic.network.b.a) new Gson().d(String.valueOf(n.a()), type);
            if (!aVar.d()) {
                return a(this, 0, "code !=0 or data is null...", 1);
            }
            l.e(aVar, "{\n                    dataResult\n                }");
            return aVar;
        } catch (Throwable th) {
            Throwable b = h.b(r.J(th));
            if (b != null) {
                e.a.a.a.a.O0(b, e.a.a.a.a.M("failure it = "), IAppGlobals.a, "NetworkParseResponse");
            }
            return a(this, 0, "parse response failure", 1);
        }
    }
}
