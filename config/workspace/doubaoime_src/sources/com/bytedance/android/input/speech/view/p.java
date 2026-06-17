package com.bytedance.android.input.speech.view;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Shader;
import android.text.style.ReplacementSpan;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class p extends ReplacementSpan {

    public static final class a {
        private PointF a;
        private PointF b;

        /* renamed from: c, reason: collision with root package name */
        private int f3183c;

        /* renamed from: d, reason: collision with root package name */
        private int f3184d;

        /* renamed from: e, reason: collision with root package name */
        private int f3185e;

        public final int a() {
            return this.f3185e;
        }

        public final PointF b() {
            return this.b;
        }

        public final int c() {
            return this.f3184d;
        }

        public final PointF d() {
            return this.a;
        }

        public final int e() {
            return this.f3183c;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        kotlin.s.c.l.f(canvas, "canvas");
        kotlin.s.c.l.f(paint, "paint");
        if (charSequence != null) {
            ArrayList arrayList = new ArrayList();
            if (i < i2) {
                throw null;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                StringBuilder M = e.a.a.a.a.M("draw ");
                M.append(aVar.d());
                M.append(", ");
                M.append(aVar.b());
                M.append(", ");
                M.append(aVar.e());
                M.append(", ");
                M.append(aVar.c());
                com.bytedance.android.input.r.j.i("select-asr", M.toString());
                LinearGradient linearGradient = new LinearGradient(aVar.d().x, aVar.d().y, aVar.b().x, aVar.d().y, (int[]) null, (float[]) null, Shader.TileMode.CLAMP);
                LinearGradient linearGradient2 = new LinearGradient(aVar.d().x, aVar.d().y, aVar.b().x, aVar.d().y, (int[]) null, (float[]) null, Shader.TileMode.CLAMP);
                Paint paint2 = new Paint(paint);
                paint2.setShader(linearGradient2);
                canvas.drawRect(aVar.d().x, aVar.d().y, aVar.b().x, aVar.b().y, paint2);
                paint2.setShader(linearGradient);
                canvas.drawText(charSequence, aVar.e(), aVar.c(), aVar.d().x, aVar.a(), paint2);
            }
        }
    }
}
