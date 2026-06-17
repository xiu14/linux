package com.bytedance.lighten.loader;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.facebook.drawee.drawable.q;
import com.facebook.drawee.generic.RoundingParams;

/* loaded from: classes.dex */
public class SmartCircleImageView extends SmartImageView {
    private Paint p;
    private volatile boolean q;

    public SmartCircleImageView(Context context) {
        super(context);
        this.p = new Paint();
        this.q = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // com.facebook.drawee.view.DraweeView
    public void setController(@Nullable e.c.e.e.a aVar) {
        super.setController(aVar);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView
    protected void u() {
        RoundingParams q = j().q();
        if (q == null) {
            q = new RoundingParams();
        }
        q.n(true);
        j().z(q);
        j().t(q.f6392g);
    }

    public SmartCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new Paint();
        this.q = true;
    }

    public SmartCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new Paint();
        this.q = true;
    }
}
