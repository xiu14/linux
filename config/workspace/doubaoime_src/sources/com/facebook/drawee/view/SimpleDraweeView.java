package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.g;
import com.facebook.imagepipeline.request.ImageRequest;
import e.c.c.d.h;
import e.c.c.d.j;
import e.c.e.b.a.e;
import java.util.Objects;

/* loaded from: classes2.dex */
public class SimpleDraweeView extends GenericDraweeView {
    private static j<? extends AbstractDraweeControllerBuilder> i;
    private static g j;
    public static final /* synthetic */ int k = 0;
    private com.facebook.common.util.b<AbstractDraweeControllerBuilder> h;

    class a extends com.facebook.common.util.b<AbstractDraweeControllerBuilder> {
        a() {
        }

        @Override // com.facebook.common.util.b
        protected AbstractDraweeControllerBuilder b() {
            if (SimpleDraweeView.this.isInEditMode()) {
                return null;
            }
            if (SimpleDraweeView.i == null) {
                h.e(SimpleDraweeView.j, "SimpleDraweeView was not initialized!");
                h.e(SimpleDraweeView.j.a(), "SimpleDraweeView was not initialized!");
                j unused = SimpleDraweeView.i = SimpleDraweeView.j.a();
            }
            return (AbstractDraweeControllerBuilder) SimpleDraweeView.i.get();
        }
    }

    class b implements Runnable {
        final /* synthetic */ boolean a;

        b(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimpleDraweeView.super.onVisibilityAggregated(this.a);
            int i = SimpleDraweeView.k;
            Drawable drawable = SimpleDraweeView.this.getDrawable();
            if (drawable != null) {
                drawable.setVisible(true, false);
            }
        }
    }

    public SimpleDraweeView(Context context) {
        super(context);
        this.h = new a();
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            e.c.h.m.b.b();
            if (isInEditMode()) {
                k().setVisible(true, false);
                k().invalidateSelf();
            }
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.c.e.a.b);
                try {
                    if (obtainStyledAttributes.hasValue(2)) {
                        setImageURI(Uri.parse(obtainStyledAttributes.getString(2)), (Object) null);
                    } else if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    obtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            }
        } finally {
            e.c.h.m.b.b();
        }
    }

    public static void s(g gVar) {
        j = gVar;
    }

    private void t(String str) {
        if (TextUtils.isEmpty(str)) {
            e.c.c.e.a.c("SimpleDraweeView", "setBlurHashImage, blurHash is null!");
        } else {
            new e.c.h.e.a(str, new d(this));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onVisibilityAggregated(boolean z) {
        e.c.c.b.h.b().execute(new b(z));
    }

    public void setActualImageResource(@DrawableRes int i2, Object obj) {
        int i3 = com.facebook.common.util.c.b;
        setImageURI(new Uri.Builder().scheme("res").path(String.valueOf(i2)).build(), obj);
    }

    public void setController(e.c.e.e.a aVar, String str, e.c.h.e.b bVar) {
        if (!TextUtils.isEmpty(str)) {
            t(str);
            if (aVar instanceof com.facebook.drawee.controller.a) {
                Objects.requireNonNull((com.facebook.drawee.controller.a) aVar);
            }
        }
        setController(aVar);
    }

    public void setImageRequest(ImageRequest imageRequest) {
        AbstractDraweeControllerBuilder a2 = this.h.a();
        a2.r(imageRequest);
        a2.s(i());
        setController(a2.a());
    }

    @Override // com.facebook.drawee.view.DraweeView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        super.setImageResource(i2);
    }

    @Override // com.facebook.drawee.view.DraweeView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public void setImageURI(String str) {
        setImageURI(str, (Object) null);
    }

    public void setImageURI(String str, String str2, e.c.h.e.b bVar) {
        if (!TextUtils.isEmpty(str2)) {
            t(str2);
        }
        setImageURI(str, (Object) null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new a();
        init(context, attributeSet);
    }

    public void setActualImageResource(@DrawableRes int i2) {
        setActualImageResource(i2, null);
    }

    public void setImageURI(Uri uri, String str, e.c.h.e.b bVar) {
        if (!TextUtils.isEmpty(str)) {
            t(str);
        }
        setImageURI(uri, (Object) null, false);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = new a();
        init(context, attributeSet);
    }

    public void setImageURI(Uri uri, Object obj, boolean z) {
        AbstractDraweeControllerBuilder a2 = this.h.a();
        a2.m(obj);
        a2.o(z);
        e eVar = (e) a2;
        eVar.x(uri);
        eVar.t(i());
        setController(eVar.a());
    }

    public void setImageURI(Uri uri, Object obj) {
        AbstractDraweeControllerBuilder a2 = this.h.a();
        a2.m(obj);
        e eVar = (e) a2;
        eVar.x(uri);
        eVar.t(i());
        setController(eVar.a());
    }

    public void setImageURI(String str, Object obj) {
        setImageURI(str != null ? Uri.parse(str) : null, obj);
    }
}
