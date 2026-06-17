package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import kotlin.o;
import kotlin.s.b.q;
import kotlin.s.c.l;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class ImageDecoderKt {
    @RequiresApi(28)
    public static final Bitmap decodeBitmap(ImageDecoder.Source source, final q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, o> qVar) {
        l.f(source, "<this>");
        l.f(qVar, "action");
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeBitmap$1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                l.f(imageDecoder, "decoder");
                l.f(imageInfo, DBDefinition.SEGMENT_INFO);
                l.f(source2, "source");
                qVar.d(imageDecoder, imageInfo, source2);
            }
        });
        l.e(decodeBitmap, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeBitmap;
    }

    @RequiresApi(28)
    public static final Drawable decodeDrawable(ImageDecoder.Source source, final q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, o> qVar) {
        l.f(source, "<this>");
        l.f(qVar, "action");
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeDrawable$1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                l.f(imageDecoder, "decoder");
                l.f(imageInfo, DBDefinition.SEGMENT_INFO);
                l.f(source2, "source");
                qVar.d(imageDecoder, imageInfo, source2);
            }
        });
        l.e(decodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeDrawable;
    }
}
