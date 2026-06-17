package com.bumptech.glide.load.j;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.j.o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b<Data> implements o<byte[], Data> {
    private final InterfaceC0034b<Data> a;

    public static class a implements p<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.j.b$a$a, reason: collision with other inner class name */
        class C0033a implements InterfaceC0034b<ByteBuffer> {
            C0033a(a aVar) {
            }

            @Override // com.bumptech.glide.load.j.b.InterfaceC0034b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.j.b.InterfaceC0034b
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<byte[], ByteBuffer> d(@NonNull s sVar) {
            return new b(new C0033a(this));
        }
    }

    /* renamed from: com.bumptech.glide.load.j.b$b, reason: collision with other inner class name */
    public interface InterfaceC0034b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {
        private final byte[] a;
        private final InterfaceC0034b<Data> b;

        c(byte[] bArr, InterfaceC0034b<Data> interfaceC0034b) {
            this.a = bArr;
            this.b = interfaceC0034b;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.b.a();
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
        public void e(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            aVar.f(this.b.b(this.a));
        }
    }

    public static class d implements p<byte[], InputStream> {

        class a implements InterfaceC0034b<InputStream> {
            a(d dVar) {
            }

            @Override // com.bumptech.glide.load.j.b.InterfaceC0034b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.j.b.InterfaceC0034b
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<byte[], InputStream> d(@NonNull s sVar) {
            return new b(new a(this));
        }
    }

    public b(InterfaceC0034b<Data> interfaceC0034b) {
        this.a = interfaceC0034b;
    }

    @Override // com.bumptech.glide.load.j.o
    public /* bridge */ /* synthetic */ boolean a(@NonNull byte[] bArr) {
        return true;
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a b(@NonNull byte[] bArr, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        byte[] bArr2 = bArr;
        return new o.a(new com.bumptech.glide.q.b(bArr2), new c(bArr2, this.a));
    }
}
