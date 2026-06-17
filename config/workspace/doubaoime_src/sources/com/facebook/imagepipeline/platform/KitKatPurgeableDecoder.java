package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.g;
import com.facebook.imagepipeline.memory.p;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import e.c.c.d.h;

@e.c.c.d.c
@TargetApi(19)
/* loaded from: classes2.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c, reason: collision with root package name */
    private final p f6521c;

    @e.c.c.d.c
    public KitKatPurgeableDecoder(p pVar) {
        this.f6521c = pVar;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(e.c.c.g.a<g> aVar, BitmapFactory.Options options) {
        g r = aVar.r();
        int size = r.size();
        e.c.c.g.a<byte[]> a = this.f6521c.a(size);
        try {
            byte[] r2 = a.r();
            r.f(0, r2, 0, size);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(r2, 0, size, options);
            h.e(decodeByteArray, "BitmapFactory returned null");
            a.close();
            return decodeByteArray;
        } catch (Throwable th) {
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(e.c.c.g.a<g> aVar, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(aVar, i) ? null : DalvikPurgeableDecoder.b;
        g r = aVar.r();
        h.a(i <= r.size());
        int i2 = i + 2;
        e.c.c.g.a<byte[]> a = this.f6521c.a(i2);
        try {
            byte[] r2 = a.r();
            r.f(0, r2, 0, i);
            if (bArr != null) {
                r2[i] = -1;
                r2[i + 1] = -39;
                i = i2;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(r2, 0, i, options);
            h.e(decodeByteArray, "BitmapFactory returned null");
            a.close();
            return decodeByteArray;
        } catch (Throwable th) {
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }
}
