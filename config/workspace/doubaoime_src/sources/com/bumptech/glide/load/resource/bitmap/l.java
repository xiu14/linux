package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l implements ImageHeaderParser {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final class a implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.c
        public int a() throws c.a {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.c
        public int b(byte[] bArr, int i) {
            int min = Math.min(i, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.c
        public short c() throws c.a {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & 255);
            }
            throw new c.a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.c
        public long skip(long j) {
            int min = (int) Math.min(this.a.remaining(), j);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    private static final class b {
        private final ByteBuffer a;

        b(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        short a(int i) {
            if (this.a.remaining() - i >= 2) {
                return this.a.getShort(i);
            }
            return (short) -1;
        }

        int b(int i) {
            if (this.a.remaining() - i >= 4) {
                return this.a.getInt(i);
            }
            return -1;
        }

        int c() {
            return this.a.remaining();
        }

        void d(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    private interface c {

        public static final class a extends IOException {
            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(byte[] bArr, int i) throws IOException;

        short c() throws IOException;

        long skip(long j) throws IOException;
    }

    private static final class d implements c {
        private final InputStream a;

        d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.c
        public int a() throws IOException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.c
        public int b(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new c.a();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.c
        public short c() throws IOException {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.c
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    private int e(c cVar, com.bumptech.glide.load.engine.B.b bVar) throws IOException {
        try {
            int a2 = cVar.a();
            if (!((a2 & 65496) == 65496 || a2 == 19789 || a2 == 18761)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a2);
                }
                return -1;
            }
            int g2 = g(cVar);
            if (g2 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(g2, byte[].class);
            try {
                return h(cVar, bArr, g2);
            } finally {
                bVar.put(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    @NonNull
    private ImageHeaderParser.ImageType f(c cVar) throws IOException {
        try {
            int a2 = cVar.a();
            if (a2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c2 = (a2 << 8) | cVar.c();
            if (c2 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c3 = (c2 << 8) | cVar.c();
            if (c3 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (c3 == 1380533830) {
                cVar.skip(4L);
                if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a3 = (cVar.a() << 16) | cVar.a();
                if ((a3 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = a3 & 255;
                if (i == 88) {
                    cVar.skip(4L);
                    short c4 = cVar.c();
                    return (c4 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (c4 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                cVar.skip(4L);
                return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((cVar.a() << 16) | cVar.a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a4 = (cVar.a() << 16) | cVar.a();
            if (a4 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = a4 == 1635150182;
            cVar.skip(4L);
            int i3 = c3 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int a5 = (cVar.a() << 16) | cVar.a();
                    if (a5 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (a5 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private int g(c cVar) throws IOException {
        short c2;
        int a2;
        long j;
        long skip;
        do {
            short c3 = cVar.c();
            if (c3 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    e.a.a.a.a.i0("Unknown segmentId=", c3, "DfltImageHeaderParser");
                }
                return -1;
            }
            c2 = cVar.c();
            if (c2 == 218) {
                return -1;
            }
            if (c2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a2 = cVar.a() - 2;
            if (c2 == 225) {
                return a2;
            }
            j = a2;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder O = e.a.a.a.a.O("Unable to skip enough data, type: ", c2, ", wanted to skip: ", a2, ", but actually skipped: ");
            O.append(skip);
            Log.d("DfltImageHeaderParser", O.toString());
        }
        return -1;
    }

    private int h(c cVar, byte[] bArr, int i) throws IOException {
        ByteOrder byteOrder;
        int b2 = cVar.b(bArr, i);
        if (b2 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + b2);
            }
            return -1;
        }
        boolean z = bArr != null && i > a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
        }
        if (!z) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        b bVar = new b(bArr, i);
        short a2 = bVar.a(6);
        if (a2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a2 != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                e.a.a.a.a.i0("Unknown endianness = ", a2, "DfltImageHeaderParser");
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.d(byteOrder);
        int b3 = bVar.b(10) + 6;
        short a3 = bVar.a(b3);
        for (int i3 = 0; i3 < a3; i3++) {
            int i4 = (i3 * 12) + b3 + 2;
            short a4 = bVar.a(i4);
            if (a4 == 274) {
                short a5 = bVar.a(i4 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b4 = bVar.b(i4 + 4);
                    if (b4 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder O = e.a.a.a.a.O("Got tagIndex=", i3, " tagType=", a4, " formatCode=");
                            O.append((int) a5);
                            O.append(" componentCount=");
                            O.append(b4);
                            Log.d("DfltImageHeaderParser", O.toString());
                        }
                        int i5 = b4 + b[a5];
                        if (i5 <= 4) {
                            int i6 = i4 + 8;
                            if (i6 >= 0 && i6 <= bVar.c()) {
                                if (i5 >= 0 && i5 + i6 <= bVar.c()) {
                                    return bVar.a(i6);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    e.a.a.a.a.i0("Illegal number of bytes for TI tag data tagType=", a4, "DfltImageHeaderParser");
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i6 + " tagType=" + ((int) a4));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            e.a.a.a.a.i0("Got byte count > 4, not orientation, continuing, formatCode=", a5, "DfltImageHeaderParser");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    e.a.a.a.a.i0("Got invalid format code = ", a5, "DfltImageHeaderParser");
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType a(@NonNull ByteBuffer byteBuffer) throws IOException {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.engine.B.b bVar) throws IOException {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        Objects.requireNonNull(bVar, "Argument must not be null");
        return e(aVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType c(@NonNull InputStream inputStream) throws IOException {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return f(new d(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.engine.B.b bVar) throws IOException {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        d dVar = new d(inputStream);
        Objects.requireNonNull(bVar, "Argument must not be null");
        return e(dVar, bVar);
    }
}
