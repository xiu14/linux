package com.airbnb.lottie.w;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.j;
import com.airbnb.lottie.y.d;
import com.airbnb.lottie.y.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f1439e = new Object();
    private final Context a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.b f1440c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, j> f1441d;

    public b(Drawable.Callback callback, String str, com.airbnb.lottie.b bVar, Map<String, j> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = e.a.a.a.a.i(str, '/');
        }
        if (callback instanceof View) {
            this.a = ((View) callback).getContext();
            this.f1441d = map;
            this.f1440c = bVar;
        } else {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f1441d = new HashMap();
            this.a = null;
        }
    }

    private Bitmap c(String str, @Nullable Bitmap bitmap) {
        synchronized (f1439e) {
            this.f1441d.get(str).f(bitmap);
        }
        return bitmap;
    }

    @Nullable
    public Bitmap a(String str) {
        j jVar = this.f1441d.get(str);
        if (jVar == null) {
            return null;
        }
        Bitmap a = jVar.a();
        if (a != null) {
            return a;
        }
        com.airbnb.lottie.b bVar = this.f1440c;
        if (bVar != null) {
            Bitmap a2 = bVar.a(jVar);
            if (a2 != null) {
                c(str, a2);
            }
            return a2;
        }
        String b = jVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (b.startsWith("data:") && b.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                c(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e2) {
                d.d("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap f2 = h.f(BitmapFactory.decodeStream(this.a.getAssets().open(this.b + b), null, options), jVar.e(), jVar.c());
                c(str, f2);
                return f2;
            } catch (IllegalArgumentException e3) {
                d.d("Unable to decode image.", e3);
                return null;
            }
        } catch (IOException e4) {
            d.d("Unable to open asset.", e4);
            return null;
        }
    }

    public boolean b(Context context) {
        return (context == null && this.a == null) || this.a.equals(context);
    }

    public void d(@Nullable com.airbnb.lottie.b bVar) {
        this.f1440c = bVar;
    }
}
