package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class F extends E {
    public F(Executor executor, com.facebook.common.memory.h hVar) {
        super(executor, hVar);
    }

    @Override // com.facebook.imagepipeline.producers.E
    protected com.facebook.imagepipeline.image.f d(ImageRequest imageRequest) throws IOException {
        return c(new FileInputStream(imageRequest.u().toString()), (int) imageRequest.u().length());
    }

    @Override // com.facebook.imagepipeline.producers.E
    protected String e() {
        return "LocalFileFetchProducer";
    }
}
