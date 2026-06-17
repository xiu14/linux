package com.bumptech.glide.load.j;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.j.o;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class d implements o<File, ByteBuffer> {

    private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {
        private final File a;

        a(File file) {
            this.a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@NonNull Priority priority, @NonNull d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(com.bumptech.glide.util.a.a(this.a));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                aVar.c(e2);
            }
        }
    }

    public static class b implements p<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<File, ByteBuffer> d(@NonNull s sVar) {
            return new d();
        }
    }

    @Override // com.bumptech.glide.load.j.o
    public /* bridge */ /* synthetic */ boolean a(@NonNull File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a<ByteBuffer> b(@NonNull File file, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        File file2 = file;
        return new o.a<>(new com.bumptech.glide.q.b(file2), new a(file2));
    }
}
