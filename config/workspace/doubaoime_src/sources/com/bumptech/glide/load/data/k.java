package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.w;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e<InputStream> {
    private final w a;

    public static final class a implements e.a<InputStream> {
        private final com.bumptech.glide.load.engine.B.b a;

        public a(com.bumptech.glide.load.engine.B.b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.a);
        }
    }

    public k(InputStream inputStream, com.bumptech.glide.load.engine.B.b bVar) {
        w wVar = new w(inputStream, bVar);
        this.a = wVar;
        wVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.a.h();
    }

    public void c() {
        this.a.d();
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() throws IOException {
        this.a.reset();
        return this.a;
    }
}
