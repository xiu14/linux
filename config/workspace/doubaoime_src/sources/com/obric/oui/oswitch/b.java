package com.obric.oui.oswitch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.shapes.OvalShape;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b extends OvalShape {
    private Context a;

    public b(Context context) {
        this.a = context;
    }

    @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    public void draw(Canvas canvas, Paint paint) {
        if (paint != null) {
            Context context = this.a;
            l.c(context);
            paint.setColor(ContextCompat.getColor(context, C0838R.color.ConstTextInverse));
        }
        if (paint != null) {
            l.f("#40000000", "$this$color");
            paint.setShadowLayer(2.0f, 0.0f, 1.0f, Color.parseColor("#40000000"));
        }
        super.draw(canvas, paint);
    }
}
