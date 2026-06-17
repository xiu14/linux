package com.obric.oui.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OAvatarQueueViewV2WithClip extends View {
    private final Paint a;
    private List<Bitmap> b;

    public OAvatarQueueViewV2WithClip(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
    }

    public OAvatarQueueViewV2WithClip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAvatarQueueViewV2WithClip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "ctx");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.a = paint;
        this.b = new ArrayList();
    }
}
