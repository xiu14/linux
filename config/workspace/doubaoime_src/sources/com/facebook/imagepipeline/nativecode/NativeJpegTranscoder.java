package com.facebook.imagepipeline.nativecode;

import com.facebook.imagepipeline.common.e;
import com.facebook.imagepipeline.image.f;
import e.c.c.d.h;
import e.c.g.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class NativeJpegTranscoder implements e.c.h.n.c {
    private boolean a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6517c;

    public NativeJpegTranscoder(boolean z, int i, boolean z2, boolean z3) {
        this.a = z;
        this.b = i;
        this.f6517c = z2;
        if (z3) {
            b.a();
        }
    }

    @e.c.c.d.c
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @e.c.c.d.c
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @Override // e.c.h.n.c
    public String b() {
        return "NativeJpegTranscoder";
    }

    @Override // e.c.h.n.c
    public boolean c(f fVar, com.facebook.imagepipeline.common.f fVar2, e eVar) {
        if (fVar2 == null) {
            fVar2 = com.facebook.imagepipeline.common.f.a();
        }
        return e.c.h.n.e.c(fVar2, eVar, fVar, this.a) < 8;
    }

    @Override // e.c.h.n.c
    public e.c.h.n.b d(f fVar, OutputStream outputStream, com.facebook.imagepipeline.common.f fVar2, e eVar, d dVar, Integer num) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        if (num == null) {
            num = 85;
        }
        if (fVar2 == null) {
            fVar2 = com.facebook.imagepipeline.common.f.a();
        }
        int a = e.c.h.n.a.a(fVar2, eVar, fVar, this.b);
        try {
            int c2 = e.c.h.n.e.c(fVar2, eVar, fVar, this.a);
            int max = Math.max(1, 8 / a);
            if (this.f6517c) {
                c2 = max;
            }
            InputStream A = fVar.A();
            if (e.c.h.n.e.a.contains(Integer.valueOf(fVar.r()))) {
                int a2 = e.c.h.n.e.a(fVar2, fVar);
                int intValue = num.intValue();
                b.a();
                h.a(c2 >= 1);
                h.a(c2 <= 16);
                h.a(intValue >= 0);
                h.a(intValue <= 100);
                e.c.c.d.e<Integer> eVar2 = e.c.h.n.e.a;
                switch (a2) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        z2 = true;
                        break;
                    default:
                        z2 = false;
                        break;
                }
                h.a(z2);
                if (c2 == 8 && a2 == 1) {
                    z3 = false;
                    h.b(z3, "no transformation requested");
                    Objects.requireNonNull(A);
                    Objects.requireNonNull(outputStream);
                    nativeTranscodeJpegWithExifOrientation(A, outputStream, a2, c2, intValue);
                }
                z3 = true;
                h.b(z3, "no transformation requested");
                Objects.requireNonNull(A);
                Objects.requireNonNull(outputStream);
                nativeTranscodeJpegWithExifOrientation(A, outputStream, a2, c2, intValue);
            } else {
                int b = e.c.h.n.e.b(fVar2, fVar);
                int intValue2 = num.intValue();
                b.a();
                h.a(c2 >= 1);
                h.a(c2 <= 16);
                h.a(intValue2 >= 0);
                h.a(intValue2 <= 100);
                e.c.c.d.e<Integer> eVar3 = e.c.h.n.e.a;
                h.a(b >= 0 && b <= 270 && b % 90 == 0);
                if (c2 == 8 && b == 0) {
                    z = false;
                    h.b(z, "no transformation requested");
                    Objects.requireNonNull(A);
                    Objects.requireNonNull(outputStream);
                    nativeTranscodeJpeg(A, outputStream, b, c2, intValue2);
                }
                z = true;
                h.b(z, "no transformation requested");
                Objects.requireNonNull(A);
                Objects.requireNonNull(outputStream);
                nativeTranscodeJpeg(A, outputStream, b, c2, intValue2);
            }
            e.c.c.d.a.b(A);
            return new e.c.h.n.b(a != 1 ? 0 : 1);
        } catch (Throwable th) {
            e.c.c.d.a.b(null);
            throw th;
        }
    }

    @Override // e.c.h.n.c
    public boolean e(d dVar) {
        return dVar == e.c.g.c.a;
    }
}
