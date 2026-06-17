package com.airbnb.lottie.w;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.model.h;
import com.airbnb.lottie.y.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f1437d;
    private final h<String> a = new h<>();
    private final Map<h<String>, Typeface> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f1436c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private String f1438e = ".ttf";

    public a(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.f1437d = ((View) callback).getContext().getAssets();
        } else {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f1437d = null;
        }
    }

    public Typeface a(String str, String str2) {
        this.a.a(str, str2);
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = this.f1436c.get(str);
        if (typeface2 == null) {
            StringBuilder S = e.a.a.a.a.S("fonts/", str);
            S.append(this.f1438e);
            typeface2 = Typeface.createFromAsset(this.f1437d, S.toString());
            this.f1436c.put(str, typeface2);
        }
        boolean contains = str2.contains("Italic");
        boolean contains2 = str2.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        if (typeface2.getStyle() != i) {
            typeface2 = Typeface.create(typeface2, i);
        }
        this.b.put(this.a, typeface2);
        return typeface2;
    }
}
