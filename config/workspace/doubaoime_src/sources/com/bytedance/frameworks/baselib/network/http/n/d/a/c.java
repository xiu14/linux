package com.bytedance.frameworks.baselib.network.http.n.d.a;

import com.bytedance.retrofit2.InterfaceC0705i;
import com.bytedance.retrofit2.mime.d;
import com.bytedance.retrofit2.mime.h;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
final class c<T> implements InterfaceC0705i<h, T> {
    private final Gson a;
    private final TypeAdapter<T> b;

    c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // com.bytedance.retrofit2.InterfaceC0705i
    public Object a(h hVar) throws IOException {
        h hVar2 = hVar;
        InputStreamReader inputStreamReader = new InputStreamReader(hVar2.d(), hVar2.a() != null ? d.a(hVar2.a(), "UTF-8") : "UTF-8");
        try {
            return this.b.b(this.a.g(inputStreamReader));
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }
}
