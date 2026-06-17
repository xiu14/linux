package com.bumptech.glide.load.j;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.j.o;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f<DataT> implements o<Integer, DataT> {
    private final Context a;
    private final e<DataT> b;

    private static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {
        private final Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // com.bumptech.glide.load.j.f.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.j.f.e
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // com.bumptech.glide.load.j.f.e
        public AssetFileDescriptor c(@Nullable Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Integer, AssetFileDescriptor> d(@NonNull s sVar) {
            return new f(this.a, this);
        }
    }

    private static final class b implements p<Integer, Drawable>, e<Drawable> {
        private final Context a;

        b(Context context) {
            this.a = context;
        }

        @Override // com.bumptech.glide.load.j.f.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.j.f.e
        public void b(Drawable drawable) throws IOException {
        }

        @Override // com.bumptech.glide.load.j.f.e
        public Drawable c(@Nullable Resources.Theme theme, Resources resources, int i) {
            return com.bumptech.glide.load.k.e.b.a(this.a, i, theme);
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Integer, Drawable> d(@NonNull s sVar) {
            return new f(this.a, this);
        }
    }

    private static final class c implements p<Integer, InputStream>, e<InputStream> {
        private final Context a;

        c(Context context) {
            this.a = context;
        }

        @Override // com.bumptech.glide.load.j.f.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.j.f.e
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // com.bumptech.glide.load.j.f.e
        public InputStream c(@Nullable Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResource(i);
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Integer, InputStream> d(@NonNull s sVar) {
            return new f(this.a, this);
        }
    }

    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        @Nullable
        private final Resources.Theme a;
        private final Resources b;

        /* renamed from: c, reason: collision with root package name */
        private final e<DataT> f1701c;

        /* renamed from: d, reason: collision with root package name */
        private final int f1702d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private DataT f1703e;

        d(@Nullable Resources.Theme theme, Resources resources, e<DataT> eVar, int i) {
            this.a = theme;
            this.b = resources;
            this.f1701c = eVar;
            this.f1702d = i;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<DataT> a() {
            return this.f1701c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            DataT datat = this.f1703e;
            if (datat != null) {
                try {
                    this.f1701c.b(datat);
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

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(@NonNull Priority priority, @NonNull d.a<? super DataT> aVar) {
            try {
                DataT c2 = this.f1701c.c(this.a, this.b, this.f1702d);
                this.f1703e = c2;
                aVar.f(c2);
            } catch (Resources.NotFoundException e2) {
                aVar.c(e2);
            }
        }
    }

    private interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat) throws IOException;

        DataT c(@Nullable Resources.Theme theme, Resources resources, int i);
    }

    f(Context context, e<DataT> eVar) {
        this.a = context.getApplicationContext();
        this.b = eVar;
    }

    public static p<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static p<Integer, Drawable> d(Context context) {
        return new b(context);
    }

    public static p<Integer, InputStream> e(Context context) {
        return new c(context);
    }

    @Override // com.bumptech.glide.load.j.o
    public /* bridge */ /* synthetic */ boolean a(@NonNull Integer num) {
        return true;
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a b(@NonNull Integer num, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) fVar.c(com.bumptech.glide.load.k.e.e.b);
        return new o.a(new com.bumptech.glide.q.b(num2), new d(theme, theme != null ? theme.getResources() : this.a.getResources(), this.b, num2.intValue()));
    }
}
