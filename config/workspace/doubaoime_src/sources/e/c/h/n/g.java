package e.c.h.n;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class g implements c {
    private final boolean a;
    private final int b;

    public g(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    private static Bitmap.CompressFormat a(e.c.g.d dVar) {
        return dVar == null ? Bitmap.CompressFormat.JPEG : dVar == e.c.g.c.a ? Bitmap.CompressFormat.JPEG : dVar == e.c.g.c.b ? Bitmap.CompressFormat.PNG : e.c.g.c.c(dVar) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    @Override // e.c.h.n.c
    public String b() {
        return "SimpleImageTranscoder";
    }

    @Override // e.c.h.n.c
    public boolean c(com.facebook.imagepipeline.image.f fVar, com.facebook.imagepipeline.common.f fVar2, com.facebook.imagepipeline.common.e eVar) {
        if (fVar2 == null) {
            fVar2 = com.facebook.imagepipeline.common.f.a();
        }
        return this.a && a.a(fVar2, eVar, fVar, this.b) > 1;
    }

    @Override // e.c.h.n.c
    public b d(com.facebook.imagepipeline.image.f fVar, OutputStream outputStream, com.facebook.imagepipeline.common.f fVar2, com.facebook.imagepipeline.common.e eVar, e.c.g.d dVar, Integer num) {
        Matrix matrix;
        Bitmap bitmap;
        Throwable th;
        OutOfMemoryError e2;
        Integer num2 = num == null ? 85 : num;
        com.facebook.imagepipeline.common.f a = fVar2 == null ? com.facebook.imagepipeline.common.f.a() : fVar2;
        int a2 = !this.a ? 1 : a.a(a, eVar, fVar, this.b);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = a2;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(fVar.A(), null, options);
            if (decodeStream == null) {
                e.c.c.e.a.i("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new b(2);
            }
            if (e.a.contains(Integer.valueOf(fVar.r()))) {
                int a3 = e.a(a, fVar);
                matrix = new Matrix();
                if (a3 == 2) {
                    matrix.setScale(-1.0f, 1.0f);
                } else if (a3 == 7) {
                    matrix.setRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                } else if (a3 != 4) {
                    if (a3 == 5) {
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                    }
                    matrix = null;
                } else {
                    matrix.setRotate(180.0f);
                    matrix.postScale(-1.0f, 1.0f);
                }
            } else {
                int b = e.b(a, fVar);
                if (b != 0) {
                    matrix = new Matrix();
                    matrix.setRotate(b);
                }
                matrix = null;
            }
            Matrix matrix2 = matrix;
            if (matrix2 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix2, false);
                } catch (OutOfMemoryError e3) {
                    e2 = e3;
                    bitmap = decodeStream;
                    e.c.c.e.a.j("SimpleImageTranscoder", "Out-Of-Memory during transcode", e2);
                    b bVar = new b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                try {
                    bitmap.compress(a(null), num2.intValue(), outputStream);
                    b bVar2 = new b(a2 > 1 ? 0 : 1);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar2;
                } catch (OutOfMemoryError e4) {
                    e2 = e4;
                    e.c.c.e.a.j("SimpleImageTranscoder", "Out-Of-Memory during transcode", e2);
                    b bVar3 = new b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar3;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap.recycle();
                decodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e5) {
            e.c.c.e.a.j("SimpleImageTranscoder", "Out-Of-Memory during transcode", e5);
            return new b(2);
        }
    }

    @Override // e.c.h.n.c
    public boolean e(e.c.g.d dVar) {
        return dVar == e.c.g.c.k || dVar == e.c.g.c.a;
    }
}
