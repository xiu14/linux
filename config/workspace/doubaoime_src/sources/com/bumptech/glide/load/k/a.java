package com.bumptech.glide.load.k;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.r;

@RequiresApi(api = 28)
/* loaded from: classes.dex */
public final class a implements ImageDecoder.OnHeaderDecodedListener {
    private final r a = r.a();
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1726c;

    /* renamed from: d, reason: collision with root package name */
    private final DecodeFormat f1727d;

    /* renamed from: e, reason: collision with root package name */
    private final DownsampleStrategy f1728e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1729f;

    /* renamed from: g, reason: collision with root package name */
    private final PreferredColorSpace f1730g;

    /* renamed from: com.bumptech.glide.load.k.a$a, reason: collision with other inner class name */
    class C0036a implements ImageDecoder.OnPartialImageListener {
        C0036a(a aVar) {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i, int i2, @NonNull f fVar) {
        this.b = i;
        this.f1726c = i2;
        this.f1727d = (DecodeFormat) fVar.c(m.f1748f);
        this.f1728e = (DownsampleStrategy) fVar.c(DownsampleStrategy.f1745f);
        e<Boolean> eVar = m.i;
        this.f1729f = fVar.c(eVar) != null && ((Boolean) fVar.c(eVar)).booleanValue();
        this.f1730g = (PreferredColorSpace) fVar.c(m.f1749g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        boolean z = false;
        if (this.a.c(this.b, this.f1726c, this.f1729f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f1727d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0036a(this));
        Size size = imageInfo.getSize();
        int i = this.b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.f1726c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.f1728e.b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * b);
        int round2 = Math.round(size.getHeight() * b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            StringBuilder M = e.a.a.a.a.M("Resizing from [");
            M.append(size.getWidth());
            M.append("x");
            M.append(size.getHeight());
            M.append("] to [");
            M.append(round);
            M.append("x");
            M.append(round2);
            M.append("] scaleFactor: ");
            M.append(b);
            Log.v("ImageDecoder", M.toString());
        }
        imageDecoder.setTargetSize(round, round2);
        PreferredColorSpace preferredColorSpace = this.f1730g;
        if (preferredColorSpace != null) {
            if (Build.VERSION.SDK_INT < 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                return;
            }
            if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
