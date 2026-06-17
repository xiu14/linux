package com.bytedance.apm.impl;

import androidx.annotation.Nullable;
import com.bytedance.retrofit2.mime.g;
import com.bytedance.retrofit2.mime.i;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class b implements i {
    private final g a;
    private final Map<String, String> b;

    public b(@Nullable Map<String, String> map, g gVar) {
        this.b = map;
        this.a = gVar;
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String a() {
        return this.a.a();
    }

    @Override // com.bytedance.retrofit2.mime.i
    public void b(OutputStream outputStream) throws IOException {
        this.a.b(outputStream);
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String c() {
        StringBuilder sb = new StringBuilder(this.a.c());
        sb.append("\"");
        for (Map.Entry<String, String> entry : this.b.entrySet()) {
            e.a.a.a.a.M0(sb, "; ", entry.getKey(), "=\"", entry.getValue());
            sb.append("\"");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String e() {
        Objects.requireNonNull(this.a);
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.i
    public long length() {
        return this.a.length();
    }
}
