package com.bumptech.glide.load.k.d;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a implements e<ByteBuffer> {
    private final ByteBuffer a;

    /* renamed from: com.bumptech.glide.load.k.d.a$a, reason: collision with other inner class name */
    public static class C0037a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    public ByteBuffer a() throws IOException {
        this.a.position(0);
        return this.a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }
}
