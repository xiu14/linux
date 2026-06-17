package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: com.facebook.imagepipeline.producers.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0733m extends E {
    public C0733m(com.facebook.common.memory.h hVar) {
        super(e.c.c.b.b.a(), hVar);
    }

    @Override // com.facebook.imagepipeline.producers.E
    protected com.facebook.imagepipeline.image.f d(ImageRequest imageRequest) throws IOException {
        boolean equals;
        String uri = imageRequest.v().toString();
        e.c.c.d.h.a(uri.substring(0, 5).equals("data:"));
        int indexOf = uri.indexOf(44);
        String substring = uri.substring(indexOf + 1, uri.length());
        String substring2 = uri.substring(0, indexOf);
        if (substring2.contains(";")) {
            equals = substring2.split(";")[r5.length - 1].equals("base64");
        } else {
            equals = false;
        }
        byte[] decode = equals ? Base64.decode(substring, 0) : Uri.decode(substring).getBytes();
        return c(new ByteArrayInputStream(decode), decode.length);
    }

    @Override // com.facebook.imagepipeline.producers.E
    protected String e() {
        return "DataFetchProducer";
    }
}
