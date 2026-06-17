package com.bytedance.android.input.speech.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.speech.view.AsrNormalBackgroundSpan;

/* loaded from: classes.dex */
public class AsrSelectBackgroundSpan extends AsrNormalBackgroundSpan {

    /* renamed from: e, reason: collision with root package name */
    private float f3160e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f3161f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f3162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrSelectBackgroundSpan(TextView textView) {
        super(textView);
        kotlin.s.c.l.f(textView, "viewText");
        IAppGlobals.a aVar = IAppGlobals.a;
        this.f3160e = aVar.getContext().getResources().getDimension(C0838R.dimen.dp_2);
        aVar.getContext().getResources().getDimension(C0838R.dimen.dp_30);
        this.f3161f = new int[]{Color.argb(255, 255, 93, 223), Color.argb(255, 255, 169, 72)};
        this.f3162g = new int[]{Color.argb(51, 255, 93, 223), Color.argb(51, 255, 169, 72)};
    }

    public final void k(Canvas canvas, CharSequence charSequence, Paint paint, int i, float f2, float f3) {
        AsrNormalBackgroundSpan.a e2;
        kotlin.s.c.l.f(paint, "paint");
        if (canvas == null || charSequence == null || (e2 = e(charSequence, paint, i)) == null) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(f2, e2.c().y, f3, e2.c().y, this.f3161f, (float[]) null, Shader.TileMode.CLAMP);
        LinearGradient linearGradient2 = new LinearGradient(f2, e2.c().y, f3, e2.c().y, this.f3162g, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint2 = new Paint(paint);
        paint2.setShader(linearGradient2);
        canvas.drawRect(e2.c().x, e2.c().y, e2.b().x, e2.b().y, paint2);
        paint2.setShader(linearGradient);
        canvas.drawText(charSequence, f(), c(), e2.c().x, e2.a(), paint2);
    }

    public final void m(Canvas canvas, CharSequence charSequence, Paint paint, int i) {
        AsrNormalBackgroundSpan.a e2;
        kotlin.s.c.l.f(paint, "paint");
        if (canvas == null || charSequence == null || (e2 = e(charSequence, paint, i)) == null) {
            return;
        }
        Paint paint2 = new Paint(paint);
        paint2.setShader(null);
        paint2.setColor(IAppGlobals.a.getContext().getResources().getColor(C0838R.color.asr_text_select_start_bar));
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawRect(e2.c().x - this.f3160e, e2.c().y, e2.c().x, e2.b().y, paint2);
    }

    public final void n(Canvas canvas, CharSequence charSequence, Paint paint, int i) {
        AsrNormalBackgroundSpan.a e2;
        kotlin.s.c.l.f(paint, "paint");
        if (canvas == null || charSequence == null || (e2 = e(charSequence, paint, i)) == null) {
            return;
        }
        Paint paint2 = new Paint(paint);
        paint2.setShader(null);
        paint2.setColor(IAppGlobals.a.getContext().getResources().getColor(C0838R.color.asr_text_select_end_bar));
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawRect(e2.b().x, e2.c().y, e2.b().x + this.f3160e, e2.b().y, paint2);
    }
}
