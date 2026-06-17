package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.m;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public class z implements com.bumptech.glide.load.g<InputStream, Bitmap> {
    private final m a;
    private final com.bumptech.glide.load.engine.B.b b;

    static class a implements m.b {
        private final w a;
        private final com.bumptech.glide.util.c b;

        a(w wVar, com.bumptech.glide.util.c cVar) {
            this.a = wVar;
            this.b = cVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m.b
        public void a(com.bumptech.glide.load.engine.B.d dVar, Bitmap bitmap) throws IOException {
            IOException a = this.b.a();
            if (a != null) {
                if (bitmap == null) {
                    throw a;
                }
                dVar.c(bitmap);
                throw a;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m.b
        public void b() {
            this.a.d();
        }
    }

    public z(m mVar, com.bumptech.glide.load.engine.B.b bVar) {
        this.a = mVar;
        this.b = bVar;
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        Objects.requireNonNull(this.a);
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull InputStream inputStream, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        boolean z;
        w wVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof w) {
            wVar = (w) inputStream2;
            z = false;
        } else {
            z = true;
            wVar = new w(inputStream2, this.b);
        }
        com.bumptech.glide.util.c d2 = com.bumptech.glide.util.c.d(wVar);
        try {
            return this.a.c(new com.bumptech.glide.util.h(d2), i, i2, fVar, new a(wVar, d2));
        } finally {
            d2.h();
            if (z) {
                wVar.h();
            }
        }
    }
}
