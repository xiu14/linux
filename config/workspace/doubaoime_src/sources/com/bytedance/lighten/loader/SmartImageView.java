package com.bytedance.lighten.loader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.ScaleType;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class SmartImageView extends SimpleDraweeView {
    private WeakReference<com.bytedance.lighten.core.m.a> l;
    private d m;
    private boolean n;
    private boolean o;

    public SmartImageView(Context context) {
        super(context);
        u();
    }

    public void setActualImageScaleType(ScaleType scaleType) {
        if (scaleType != null) {
            j().t(o.a(scaleType));
        }
    }

    public void setAnimationListener(com.bytedance.lighten.core.m.a aVar) {
        this.l = new WeakReference<>(aVar);
    }

    public void setAttached(boolean z) {
        this.n = z;
    }

    public void setCircleOptions(CircleOptions circleOptions) {
        if (circleOptions == null) {
            return;
        }
        RoundingParams q = j().q() != null ? j().q() : new RoundingParams();
        q.n(false);
        q.k(circleOptions.a());
        q.i(0.0f);
        q.h(0);
        q.l(0);
        q.m(0.0f);
        q.o(circleOptions.b() == CircleOptions.RoundingMethod.OVERLAY_COLOR ? RoundingParams.RoundingMethod.OVERLAY_COLOR : RoundingParams.RoundingMethod.BITMAP_ONLY);
        j().z(q);
    }

    public void setImageDisplayListener(com.bytedance.lighten.core.m.b bVar) {
        d dVar = this.m;
        if (dVar != null) {
            dVar.n(bVar);
        }
    }

    public void setPlaceholderImage(int i) {
        if (i > 0) {
            j().v(i);
        }
    }

    public void setUserVisibleHint(boolean z) {
        this.o = z;
    }

    protected void u() {
    }

    public void setPlaceholderImage(@Nullable Drawable drawable) {
        j().w(drawable);
    }

    public SmartImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u();
    }

    public SmartImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u();
    }
}
