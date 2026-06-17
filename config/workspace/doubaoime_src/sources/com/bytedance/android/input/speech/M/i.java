package com.bytedance.android.input.speech.M;

import com.google.gson.Gson;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public class i implements com.ss.ugc.effectplatform.d.b.a {
    private final Gson a = new Gson();

    @Override // com.ss.ugc.effectplatform.d.b.a
    public <T> T a(String str, Class<T> cls) {
        l.f(str, "json");
        l.f(cls, "cls");
        com.bytedance.android.input.r.j.i("Effect-GSONConverter", "convertJsonToObj json = " + str);
        return (T) this.a.c(str, cls);
    }
}
