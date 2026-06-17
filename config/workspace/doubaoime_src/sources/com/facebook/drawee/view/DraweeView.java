package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.facebook.imagepipeline.request.ImageRequest;
import e.c.c.b.h;
import e.c.c.d.h;
import e.c.e.e.b;
import java.util.Objects;

/* loaded from: classes2.dex */
public class DraweeView<DH extends e.c.e.e.b> extends AppCompatImageView {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f6411g = false;
    private final com.facebook.drawee.view.a a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private b<DH> f6412c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6413d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6414e;

    /* renamed from: f, reason: collision with root package name */
    private e.c.h.a f6415f;

    class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ int b;

        a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            DraweeView.super.onVisibilityChanged(this.a, this.b);
            DraweeView.this.m();
        }
    }

    public DraweeView(Context context) {
        super(context);
        this.a = new com.facebook.drawee.view.a();
        this.b = 0.0f;
        this.f6413d = false;
        this.f6414e = false;
        l(context);
    }

    private void l(Context context) {
        try {
            e.c.h.m.b.b();
            if (this.f6413d) {
                return;
            }
            boolean z = true;
            this.f6413d = true;
            this.f6412c = new b<>(null);
            this.f6415f = new e.c.h.a(this);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f6411g || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.f6414e = z;
        } finally {
            e.c.h.m.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Drawable drawable;
        if (!this.f6414e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f6411g = z;
    }

    public e.c.e.e.a i() {
        return this.f6412c.d();
    }

    public DH j() {
        return this.f6412c.e();
    }

    public Drawable k() {
        return this.f6412c.f();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
        this.f6412c.h();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
        this.f6415f.b();
        this.f6412c.i();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m();
        this.f6412c.h();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        com.facebook.drawee.view.a aVar = this.a;
        aVar.a = i;
        aVar.b = i2;
        float f2 = this.b;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f2 > 0.0f && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 == 0 || i3 == -2) {
                aVar.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.a) - paddingRight) / f2) + paddingBottom), aVar.b), BasicMeasure.EXACTLY);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    aVar.a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.b) - paddingBottom) * f2) + paddingRight), aVar.a), BasicMeasure.EXACTLY);
                }
            }
        }
        com.facebook.drawee.view.a aVar2 = this.a;
        super.onMeasure(aVar2.a, aVar2.b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m();
        this.f6412c.i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6412c.k(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        h.b().execute(new a(view, i));
    }

    public void setAspectRatio(float f2) {
        if (f2 == this.b) {
            return;
        }
        this.b = f2;
        requestLayout();
    }

    public void setController(e.c.e.e.a aVar) {
        if (aVar instanceof com.facebook.drawee.controller.a) {
            com.facebook.drawee.controller.a aVar2 = (com.facebook.drawee.controller.a) aVar;
            ImageRequest t = aVar2.t();
            if (t instanceof ImageRequest) {
                Objects.requireNonNull(t);
            }
            Object[] n = aVar2.n();
            if (n != null && n.length > 0) {
                for (Object obj : n) {
                    if (obj instanceof ImageRequest) {
                        Objects.requireNonNull((ImageRequest) obj);
                    }
                }
            }
            Object u = aVar2.u();
            if (u instanceof ImageRequest) {
                Objects.requireNonNull((ImageRequest) u);
            }
        }
        this.f6412c.m(aVar);
        super.setImageDrawable(this.f6412c.f());
    }

    public void setHierarchy(DH dh) {
        this.f6412c.n(dh);
        super.setImageDrawable(this.f6412c.f());
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        l(getContext());
        this.f6412c.m(null);
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        l(getContext());
        this.f6412c.m(null);
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        l(getContext());
        this.f6412c.m(null);
        super.setImageResource(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        l(getContext());
        this.f6412c.m(null);
        super.setImageURI(uri);
    }

    public void setLazySizeAttach(c cVar) {
        this.f6415f.c(cVar);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f6414e = z;
    }

    @Override // android.view.View
    public String toString() {
        h.b k = e.c.c.d.h.k(this);
        b<DH> bVar = this.f6412c;
        k.b("holder", bVar != null ? bVar.toString() : "<no holder set>");
        return k.toString();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new com.facebook.drawee.view.a();
        this.b = 0.0f;
        this.f6413d = false;
        this.f6414e = false;
        l(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new com.facebook.drawee.view.a();
        this.b = 0.0f;
        this.f6413d = false;
        this.f6414e = false;
        l(context);
    }
}
