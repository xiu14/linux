package com.bumptech.glide.load.j;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.j.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e<Model, Data> implements o<Model, Data> {
    private final a<Data> a;

    public interface a<Data> {
    }

    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {
        private final String a;
        private final a<Data> b;

        /* renamed from: c, reason: collision with root package name */
        private Data f1700c;

        b(String str, a<Data> aVar) {
            this.a = str;
            this.b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            Objects.requireNonNull((c.a) this.b);
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                a<Data> aVar = this.b;
                Data data = this.f1700c;
                Objects.requireNonNull((c.a) aVar);
                ((InputStream) data).close();
            } catch (IOException unused) {
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

        /* JADX WARN: Type inference failed for: r2v4, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            try {
                ?? r2 = (Data) ((c.a) this.b).a(this.a);
                this.f1700c = r2;
                aVar.f(r2);
            } catch (IllegalArgumentException e2) {
                aVar.c(e2);
            }
        }
    }

    public static final class c<Model> implements p<Model, InputStream> {
        private final a<InputStream> a = new a(this);

        class a implements a<InputStream> {
            a(c cVar) {
            }

            public Object a(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Model, InputStream> d(@NonNull s sVar) {
            return new e(this.a);
        }
    }

    public e(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // com.bumptech.glide.load.j.o
    public boolean a(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a<Data> b(@NonNull Model model, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        return new o.a<>(new com.bumptech.glide.q.b(model), new b(model.toString(), this.a));
    }
}
