package com.bytedance.frameworks.baselib.network.http.n.d.a;

import com.bytedance.retrofit2.InterfaceC0705i;
import com.bytedance.retrofit2.mime.f;
import com.bytedance.retrofit2.mime.i;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class b<T> implements InterfaceC0705i<T, i> {

    /* renamed from: c, reason: collision with root package name */
    private static final Charset f5149c = Charset.forName("UTF-8");
    private final Gson a;
    private final TypeAdapter<T> b;

    b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // com.bytedance.retrofit2.InterfaceC0705i
    public i a(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        com.google.gson.stream.b h = this.a.h(new OutputStreamWriter(byteArrayOutputStream, f5149c));
        this.b.c(h, obj);
        h.close();
        return new f("application/json; charset=UTF-8", byteArrayOutputStream.toByteArray(), new String[0]);
    }
}
