package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.w;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    class a implements h {
        final /* synthetic */ InputStream a;

        a(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.c.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.a);
            } finally {
                this.a.reset();
            }
        }
    }

    class b implements h {
        final /* synthetic */ ByteBuffer a;

        b(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.c.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.a);
            } finally {
                com.bumptech.glide.util.a.c(this.a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.c$c, reason: collision with other inner class name */
    class C0021c implements h {
        final /* synthetic */ ParcelFileDescriptorRewinder a;
        final /* synthetic */ com.bumptech.glide.load.engine.B.b b;

        C0021c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.B.b bVar) {
            this.a = parcelFileDescriptorRewinder;
            this.b = bVar;
        }

        @Override // com.bumptech.glide.load.c.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            w wVar = null;
            try {
                w wVar2 = new w(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
                try {
                    ImageHeaderParser.ImageType c2 = imageHeaderParser.c(wVar2);
                    wVar2.h();
                    this.a.a();
                    return c2;
                } catch (Throwable th) {
                    th = th;
                    wVar = wVar2;
                    if (wVar != null) {
                        wVar.h();
                    }
                    this.a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    class d implements g {
        final /* synthetic */ ByteBuffer a;
        final /* synthetic */ com.bumptech.glide.load.engine.B.b b;

        d(ByteBuffer byteBuffer, com.bumptech.glide.load.engine.B.b bVar) {
            this.a = byteBuffer;
            this.b = bVar;
        }

        @Override // com.bumptech.glide.load.c.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.a, this.b);
            } finally {
                com.bumptech.glide.util.a.c(this.a);
            }
        }
    }

    class e implements g {
        final /* synthetic */ InputStream a;
        final /* synthetic */ com.bumptech.glide.load.engine.B.b b;

        e(InputStream inputStream, com.bumptech.glide.load.engine.B.b bVar) {
            this.a = inputStream;
            this.b = bVar;
        }

        @Override // com.bumptech.glide.load.c.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.a, this.b);
            } finally {
                this.a.reset();
            }
        }
    }

    class f implements g {
        final /* synthetic */ ParcelFileDescriptorRewinder a;
        final /* synthetic */ com.bumptech.glide.load.engine.B.b b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.B.b bVar) {
            this.a = parcelFileDescriptorRewinder;
            this.b = bVar;
        }

        @Override // com.bumptech.glide.load.c.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            w wVar = null;
            try {
                w wVar2 = new w(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
                try {
                    int d2 = imageHeaderParser.d(wVar2, this.b);
                    wVar2.h();
                    this.a.a();
                    return d2;
                } catch (Throwable th) {
                    th = th;
                    wVar = wVar2;
                    if (wVar != null) {
                        wVar.h();
                    }
                    this.a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    @RequiresApi(21)
    public static int a(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull com.bumptech.glide.load.engine.B.b bVar) throws IOException {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull com.bumptech.glide.load.engine.B.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.engine.B.b bVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(@NonNull List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a2 = gVar.a(list.get(i));
            if (a2 != -1) {
                return a2;
            }
        }
        return -1;
    }

    @NonNull
    @RequiresApi(21)
    public static ImageHeaderParser.ImageType e(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull com.bumptech.glide.load.engine.B.b bVar) throws IOException {
        return h(list, new C0021c(parcelFileDescriptorRewinder, bVar));
    }

    @NonNull
    public static ImageHeaderParser.ImageType f(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull com.bumptech.glide.load.engine.B.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new a(inputStream));
    }

    @NonNull
    public static ImageHeaderParser.ImageType g(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    @NonNull
    private static ImageHeaderParser.ImageType h(@NonNull List<ImageHeaderParser> list, h hVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a2 = hVar.a(list.get(i));
            if (a2 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
