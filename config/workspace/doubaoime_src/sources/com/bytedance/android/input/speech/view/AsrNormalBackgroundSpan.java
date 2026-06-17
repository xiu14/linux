package com.bytedance.android.input.speech.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.text.Layout;
import android.text.style.BackgroundColorSpan;
import android.widget.TextView;

/* loaded from: classes.dex */
public class AsrNormalBackgroundSpan extends BackgroundColorSpan {
    private final TextView a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f3157c;

    /* renamed from: d, reason: collision with root package name */
    private int f3158d;

    public static final class a {
        private PointF a;
        private PointF b;

        /* renamed from: c, reason: collision with root package name */
        private int f3159c;

        public a(PointF pointF, PointF pointF2, int i) {
            kotlin.s.c.l.f(pointF, "start");
            kotlin.s.c.l.f(pointF2, "end");
            this.a = pointF;
            this.b = pointF2;
            this.f3159c = i;
        }

        public final int a() {
            return this.f3159c;
        }

        public final PointF b() {
            return this.b;
        }

        public final PointF c() {
            return this.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrNormalBackgroundSpan(TextView textView) {
        super(0);
        kotlin.s.c.l.f(textView, "viewText");
        this.a = textView;
    }

    private final String b(CharSequence charSequence, int i, int i2) {
        return charSequence.subSequence(i, i2).toString();
    }

    public final void a(Canvas canvas, CharSequence charSequence, Paint paint, int i) {
        a e2;
        kotlin.s.c.l.f(paint, "paint");
        if (canvas == null || charSequence == null || (e2 = e(charSequence, paint, i)) == null) {
            return;
        }
        canvas.drawText(charSequence, this.b, this.f3157c, e2.c().x, e2.a(), paint);
    }

    public final int c() {
        return this.f3157c;
    }

    public final a e(CharSequence charSequence, Paint paint, int i) {
        Layout layout;
        int i2;
        float f2;
        float f3;
        PointF pointF;
        kotlin.s.c.l.f(charSequence, "text");
        kotlin.s.c.l.f(paint, "paint");
        if (this.b >= this.f3157c || (layout = this.a.getLayout()) == null) {
            return null;
        }
        int lineForOffset = layout.getLineForOffset(this.b);
        PointF pointF2 = new PointF();
        PointF pointF3 = new PointF();
        if (this.f3158d == 0) {
            f3 = i;
            i2 = lineForOffset;
            pointF = pointF2;
        } else {
            float primaryHorizontal = layout.getPrimaryHorizontal(this.b);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(this.b + 1);
            int i3 = this.b;
            String b = b(charSequence, i3, i3 + 1);
            float measureText = paint.measureText(b);
            if (primaryHorizontal2 <= 0.0d) {
                float primaryHorizontal3 = layout.getPrimaryHorizontal(this.b - 1);
                int i4 = this.b;
                String b2 = b(charSequence, i4 - 1, i4);
                float measureText2 = paint.measureText(b2);
                float f4 = (primaryHorizontal - primaryHorizontal3) - measureText2;
                i2 = lineForOffset;
                com.bytedance.android.input.r.j.i("AsrNormalBackgroundSpan", "charBefore = " + b2 + ", " + measureText2 + ", charSpacing = " + f4 + ", startBefore = " + primaryHorizontal3 + ", start = " + primaryHorizontal);
                if (f4 > 0.0f) {
                    f3 = primaryHorizontal + i + f4;
                    pointF = pointF2;
                }
            } else {
                i2 = lineForOffset;
                f2 = ((primaryHorizontal2 - primaryHorizontal) - measureText) / 2;
                com.bytedance.android.input.r.j.i("AsrNormalBackgroundSpan", "charAt = " + b + ", " + measureText + ", charSpacing = " + f2 + ", startAfter = " + primaryHorizontal2 + ", start = " + primaryHorizontal);
                if (f2 > 0.0f) {
                    primaryHorizontal += i;
                    f3 = primaryHorizontal + f2;
                    pointF = pointF2;
                }
            }
            f2 = i;
            f3 = primaryHorizontal + f2;
            pointF = pointF2;
        }
        pointF.x = f3;
        int i5 = i2;
        pointF.y = layout.getLineTop(i5);
        float primaryHorizontal4 = layout.getPrimaryHorizontal(this.f3157c);
        pointF3.x = primaryHorizontal4;
        if (primaryHorizontal4 <= 0.0d) {
            int i6 = this.f3157c;
            pointF3.x = layout.getPrimaryHorizontal(this.f3157c - 1) + paint.measureText(b(charSequence, i6 - 1, i6));
        }
        pointF3.x += i;
        pointF3.y = layout.getLineBottom(i5);
        float lineSpacingExtra = this.a.getLineSpacingExtra() / 2;
        if (i5 != layout.getLineCount() - 1) {
            pointF3.y -= this.a.getLineSpacingExtra();
            pointF.y -= lineSpacingExtra;
            pointF3.y += lineSpacingExtra;
        } else if (i5 != 0) {
            pointF.y -= lineSpacingExtra;
            pointF3.y += lineSpacingExtra;
        }
        return new a(pointF, pointF3, layout.getLineBaseline(i5));
    }

    public final int f() {
        return this.b;
    }

    public final void g(int i) {
        this.f3157c = i;
    }

    public final void i(int i) {
        this.f3158d = i;
    }

    public final void j(int i) {
        this.b = i;
    }
}
