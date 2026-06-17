package com.bumptech.glide.load.j;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.j.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class g<Data> implements o<File, Data> {
    private final d<Data> a;

    public static class a<Data> implements p<File, Data> {
        private final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public final o<File, Data> d(@NonNull s sVar) {
            return new g(this.a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // com.bumptech.glide.load.j.g.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.j.g.d
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.bumptech.glide.load.j.g.d
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {
        private final File a;
        private final d<Data> b;

        /* renamed from: c, reason: collision with root package name */
        private Data f1704c;

        c(File file, d<Data> dVar) {
            this.a = file;
            this.b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f1704c;
            if (data != null) {
                try {
                    this.b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource d() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            try {
                Data c2 = this.b.c(this.a);
                this.f1704c = c2;
                aVar.f(c2);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                aVar.c(e2);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    public static class e extends a<InputStream> {

        class a implements d<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.j.g.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.j.g.d
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.j.g.d
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // com.bumptech.glide.load.j.o
    public /* bridge */ /* synthetic */ boolean a(@NonNull File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a b(@NonNull File file, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        File file2 = file;
        return new o.a(new com.bumptech.glide.q.b(file2), new c(file2, this.a));
    }
}
