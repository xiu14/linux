package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class Z extends E {

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f6580c;

    public Z(Executor executor, com.facebook.common.memory.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f6580c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.E
    protected com.facebook.imagepipeline.image.f d(ImageRequest imageRequest) throws IOException {
        return c(this.f6580c.openInputStream(imageRequest.v()), -1);
    }

    @Override // com.facebook.imagepipeline.producers.E
    protected String e() {
        return "QualifiedResourceFetchProducer";
    }
}
