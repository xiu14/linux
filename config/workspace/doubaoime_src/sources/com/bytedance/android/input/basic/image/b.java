package com.bytedance.android.input.basic.image;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.prolificinteractive.materialcalendarview.r;
import java.util.Locale;
import java.util.Objects;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b implements com.bumptech.glide.request.g<Drawable> {
    final /* synthetic */ long a;
    final /* synthetic */ i b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f2064c;

    b(long j, i iVar, c cVar) {
        this.a = j;
        this.b = iVar;
        this.f2064c = cVar;
    }

    @Override // com.bumptech.glide.request.g
    public boolean d(q qVar, Object obj, com.bumptech.glide.request.k.h<Drawable> hVar, boolean z) {
        l.f(hVar, TypedValues.AttributesType.S_TARGET);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.a;
        p<Throwable, Long, o> e2 = this.b.e();
        if (e2 == null) {
            return false;
        }
        e2.invoke(qVar, Long.valueOf(elapsedRealtime));
        return false;
    }

    @Override // com.bumptech.glide.request.g
    public boolean g(Drawable drawable, Object obj, com.bumptech.glide.request.k.h<Drawable> hVar, DataSource dataSource, boolean z) {
        ImageFormatGuess imageFormatGuess;
        Drawable drawable2 = drawable;
        l.f(drawable2, "resource");
        l.f(obj, "model");
        l.f(hVar, TypedValues.AttributesType.S_TARGET);
        l.f(dataSource, "dataSource");
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.a;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 28 ? !((drawable2 instanceof GifDrawable) || (drawable2 instanceof AnimationDrawable)) : !((drawable2 instanceof AnimationDrawable) || (drawable2 instanceof GifDrawable) || (drawable2 instanceof AnimatedImageDrawable))) {
            z2 = false;
        }
        kotlin.s.b.l<g, o> f2 = this.b.f();
        if (f2 != null) {
            DecodedImageType decodedImageType = z2 ? DecodedImageType.GIF : DecodedImageType.STATIC;
            c cVar = this.f2064c;
            String i = this.b.i();
            Objects.requireNonNull(cVar);
            try {
                String lowerCase = kotlin.text.a.N(kotlin.text.a.P(i, '?', null, 2, null), '.', "").toLowerCase(Locale.ROOT);
                l.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                switch (lowerCase.hashCode()) {
                    case 102340:
                        if (!lowerCase.equals("gif")) {
                            imageFormatGuess = ImageFormatGuess.UNKNOWN;
                            break;
                        } else {
                            imageFormatGuess = ImageFormatGuess.GIF;
                            break;
                        }
                    case 105441:
                        if (!lowerCase.equals("jpg")) {
                            imageFormatGuess = ImageFormatGuess.UNKNOWN;
                            break;
                        }
                        imageFormatGuess = ImageFormatGuess.JPEG;
                        break;
                    case 111145:
                        if (!lowerCase.equals("png")) {
                            imageFormatGuess = ImageFormatGuess.UNKNOWN;
                            break;
                        } else {
                            imageFormatGuess = ImageFormatGuess.PNG;
                            break;
                        }
                    case 3268712:
                        if (!lowerCase.equals("jpeg")) {
                            imageFormatGuess = ImageFormatGuess.UNKNOWN;
                            break;
                        }
                        imageFormatGuess = ImageFormatGuess.JPEG;
                        break;
                    case 3645340:
                        if (!lowerCase.equals("webp")) {
                            imageFormatGuess = ImageFormatGuess.UNKNOWN;
                            break;
                        }
                        imageFormatGuess = ImageFormatGuess.WEBP;
                        break;
                    case 93226877:
                        if (!lowerCase.equals("awebp")) {
                            imageFormatGuess = ImageFormatGuess.UNKNOWN;
                            break;
                        }
                        imageFormatGuess = ImageFormatGuess.WEBP;
                        break;
                    default:
                        imageFormatGuess = ImageFormatGuess.UNKNOWN;
                        break;
                }
            } catch (Throwable th) {
                r.J(th);
                imageFormatGuess = ImageFormatGuess.UNKNOWN;
            }
            f2.invoke(new g(decodedImageType, imageFormatGuess, elapsedRealtime));
        }
        return false;
    }
}
