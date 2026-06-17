package com.obric.oui.popover;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import e.i.b.c.b.p;
import e.i.b.f.e.b;
import java.util.Iterator;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OPopoverLayout extends LinearLayout {
    private static int A;
    private static int B;
    private static int C;
    private static int x = e.a.a.a.a.e0("Resources.getSystem()", 1, 7);
    private static float y = e.a.a.a.a.m("Resources.getSystem()", 1, 16);
    private static float z;
    private String a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private a f7935c;

    /* renamed from: d, reason: collision with root package name */
    private float f7936d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f7937e;

    /* renamed from: f, reason: collision with root package name */
    private Path f7938f;

    /* renamed from: g, reason: collision with root package name */
    private Path f7939g;
    private RectF h;
    private float i;
    private float j;
    private float k;
    private int l;
    private Bitmap m;
    private Canvas n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private Paint u;
    private final Path v;
    private final Path w;

    public static final class a {
        private float a;
        private float b;

        /* renamed from: c, reason: collision with root package name */
        private float f7940c;

        /* renamed from: d, reason: collision with root package name */
        private int f7941d;

        public a() {
            this(0.0f, 0.0f, 0.0f, 0, 15);
        }

        public a(float f2, float f3, float f4, int i, int i2) {
            f2 = (i2 & 1) != 0 ? 2.0f : f2;
            f3 = (i2 & 2) != 0 ? 2.0f : f3;
            f4 = (i2 & 4) != 0 ? 5.0f : f4;
            i = (i2 & 8) != 0 ? ViewCompat.MEASURED_STATE_MASK : i;
            this.a = f2;
            this.b = f3;
            this.f7940c = f4;
            this.f7941d = i;
        }

        public final int a() {
            return this.f7941d;
        }

        public final float b() {
            return this.b;
        }

        public final float c() {
            return this.f7940c;
        }

        public final float d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.f7940c, aVar.f7940c) == 0 && this.f7941d == aVar.f7941d;
        }

        public int hashCode() {
            return Integer.hashCode(this.f7941d) + e.a.a.a.a.x(this.f7940c, e.a.a.a.a.x(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("ShadowConfig(radius=");
            M.append(this.a);
            M.append(", dx=");
            M.append(this.b);
            M.append(", dy=");
            M.append(this.f7940c);
            M.append(", color=");
            return e.a.a.a.a.D(M, this.f7941d, ")");
        }
    }

    static {
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        TypedValue.applyDimension(1, 99, system.getDisplayMetrics());
        Resources system2 = Resources.getSystem();
        l.e(system2, "Resources.getSystem()");
        TypedValue.applyDimension(1, 12, system2.getDisplayMetrics());
        z = e.a.a.a.a.m("Resources.getSystem()", 1, 18);
        A = e.a.a.a.a.e0("Resources.getSystem()", 1, 40);
        B = e.a.a.a.a.e0("Resources.getSystem()", 1, 36);
        C = e.a.a.a.a.e0("Resources.getSystem()", 1, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OPopoverLayout(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    private final int a(TextView textView) {
        String obj = textView.getText().toString();
        TextPaint paint = textView.getPaint();
        Objects.requireNonNull(paint, "null cannot be cast to non-null type android.text.TextPaint");
        int i = 0;
        if (!kotlin.text.a.d(obj, "\n", false, 2, null)) {
            return (int) paint.measureText(obj);
        }
        Iterator it2 = kotlin.text.a.J(obj, new String[]{"\n"}, false, 0, 6, null).iterator();
        while (it2.hasNext()) {
            int measureText = (int) paint.measureText((String) it2.next());
            if (measureText > i) {
                i = measureText;
            }
        }
        return i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    @SuppressLint({"CI_DrawAllocation"})
    protected void onDraw(Canvas canvas) {
        float min;
        float f2;
        l.f(canvas, "canvas");
        if (this.m == null) {
            Context context = getContext();
            l.e(context, "context");
            Resources resources = context.getResources();
            l.e(resources, "context.resources");
            this.m = Bitmap.createBitmap(resources.getDisplayMetrics(), getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.m;
            l.c(bitmap);
            this.n = new Canvas(bitmap);
        }
        Paint paint = this.f7937e;
        if (paint == null) {
            l.l("mFillPaint");
            throw null;
        }
        paint.setColor(this.o);
        float f3 = this.i;
        float f4 = this.j;
        float max = Math.max(this.k, z + x);
        Matrix matrix = new Matrix();
        int i = this.s;
        int i2 = i / 2;
        int i3 = this.l;
        if (i3 == 0) {
            min = Math.min(max, (f3 - x) - z);
            f2 = this.s;
            matrix.postRotate(90.0f);
            setPadding(0, i2, 0, 0);
        } else if (i3 == 1) {
            min = i;
            f2 = Math.min(max, (f4 - x) - z);
            setPadding(i2, 0, 0, 0);
        } else if (i3 == 2) {
            min = f3 - i;
            f2 = Math.min(max, (f4 - x) - z);
            matrix.postRotate(180.0f);
            setPadding(0, 0, i2, 0);
        } else if (i3 != 3) {
            min = 0.0f;
            f2 = 0.0f;
        } else {
            min = Math.min(max, (f3 - x) - z);
            f2 = f4 - this.s;
            matrix.postRotate(270.0f);
            setPadding(0, 0, 0, i2);
        }
        setGravity(17);
        float f5 = x;
        float f6 = (r7 / 2) + f5;
        float f7 = this.s;
        this.h = new RectF(f6, f6, (this.i - f5) - f7, (this.j - f5) - f7);
        matrix.postTranslate(min, f2);
        Path path = this.f7938f;
        if (path == null) {
            l.l("mPath");
            throw null;
        }
        path.reset();
        this.v.reset();
        p pVar = p.f10030e;
        Path path2 = this.v;
        RectF rectF = this.h;
        if (rectF == null) {
            l.l("mRoundRect");
            throw null;
        }
        float f8 = this.b;
        l.f(path2, DownloadConstants.PATH_KEY);
        l.f(rectF, "rect");
        path2.addPath(p.c(rectF, f8));
        if (this.q) {
            this.w.reset();
            Path path3 = this.w;
            Path path4 = this.f7939g;
            if (path4 == null) {
                l.l("mBubbleArrowPath");
                throw null;
            }
            path3.addPath(path4, matrix);
            this.v.op(this.w, Path.Op.UNION);
        }
        Path path5 = this.f7938f;
        if (path5 == null) {
            l.l("mPath");
            throw null;
        }
        path5.addPath(this.v);
        if (this.p) {
            Paint paint2 = this.f7937e;
            if (paint2 == null) {
                l.l("mFillPaint");
                throw null;
            }
            paint2.setShadowLayer(this.f7935c.d(), this.f7935c.b(), this.f7935c.c(), this.f7935c.a());
        }
        Canvas canvas2 = this.n;
        if (canvas2 == null) {
            l.l("mCanvas");
            throw null;
        }
        Path path6 = this.f7938f;
        if (path6 == null) {
            l.l("mPath");
            throw null;
        }
        Paint paint3 = this.f7937e;
        if (paint3 == null) {
            l.l("mFillPaint");
            throw null;
        }
        canvas2.drawPath(path6, paint3);
        Paint paint4 = this.u;
        if (paint4 != null && this.s > 0) {
            Canvas canvas3 = this.n;
            if (canvas3 == null) {
                l.l("mCanvas");
                throw null;
            }
            Path path7 = this.f7938f;
            if (path7 == null) {
                l.l("mPath");
                throw null;
            }
            l.c(paint4);
            canvas3.drawPath(path7, paint4);
        }
        Bitmap bitmap2 = this.m;
        l.c(bitmap2);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.widget.LinearLayout, android.view.View
    @SuppressLint({"CI_DrawAllocation"})
    protected void onMeasure(int i, int i2) {
        TextView textView;
        int measuredWidth;
        int measuredWidth2;
        int measuredHeight;
        super.onMeasure(i, i2);
        if (getChildAt(0) instanceof TextView) {
            View childAt = getChildAt(0);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) childAt;
        } else {
            textView = null;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (textView != null) {
            float f2 = 276;
            measuredWidth = textView.getPaddingRight() + textView.getPaddingLeft() + (a(textView) > e.a.a.a.a.e0("Resources.getSystem()", 1, f2) ? e.a.a.a.a.e0("Resources.getSystem()", 1, f2) : a(textView));
        } else {
            measuredWidth = getMeasuredWidth();
        }
        if (this.r) {
            int i3 = A;
            if (measuredWidth > i3) {
                float f3 = this.f7936d;
                Resources system = Resources.getSystem();
                l.e(system, "Resources.getSystem()");
                i3 = (kotlin.t.a.a(TypedValue.applyDimension(1, f3, system.getDisplayMetrics())) * 2) + measuredWidth;
            }
            int i4 = x;
            int i5 = this.s;
            measuredWidth2 = (i5 * 2) + (i4 * 2) + i3;
            measuredHeight = (i5 * 2) + (i4 * 2) + B + (l.a(this.a, "") ? 0 : C);
        } else {
            PopupWindow popupWindow = new PopupWindow(getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            View contentView = popupWindow.getContentView();
            l.e(contentView, "pop.contentView");
            measuredWidth2 = (x * 2) + contentView.getMeasuredWidth();
            View contentView2 = popupWindow.getContentView();
            l.e(contentView2, "pop.contentView");
            measuredHeight = (x * 2) + contentView2.getMeasuredHeight();
        }
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(measuredWidth2, measuredHeight);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(measuredWidth2, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, measuredHeight);
        } else {
            setMeasuredDimension(size, size2);
        }
        this.i = getMeasuredWidth();
        this.j = getMeasuredHeight();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        Bitmap bitmap;
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0 || (bitmap = this.m) == null || getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
            return;
        }
        if (bitmap.getHeight() == getMeasuredHeight() && bitmap.getWidth() == getMeasuredWidth()) {
            return;
        }
        Context context = getContext();
        l.e(context, "context");
        Resources resources = context.getResources();
        l.e(resources, "context.resources");
        Bitmap createBitmap = Bitmap.createBitmap(resources.getDisplayMetrics(), getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        this.n = new Canvas(createBitmap);
        this.m = createBitmap;
        StringBuilder O = e.a.a.a.a.O("onSizeChanged, init new bg, w: ", i, ", h: ", i2, ", oldw: ");
        O.append(i3);
        O.append(", oldh: ");
        O.append(i4);
        b.f("OPopoverLayout", O.toString());
    }

    public final void setBorderColor(int i) {
        this.t = i;
    }

    public final void setBorderWidth(int i) {
        if (i <= 0) {
            return;
        }
        this.s = i;
        if (this.u == null) {
            this.u = new Paint();
        }
        Paint paint = this.u;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        Paint paint2 = this.u;
        if (paint2 != null) {
            paint2.setStrokeWidth(this.s);
        }
        Paint paint3 = this.u;
        if (paint3 != null) {
            paint3.setStrokeCap(Paint.Cap.BUTT);
        }
        Paint paint4 = this.u;
        if (paint4 != null) {
            paint4.setStrokeJoin(Paint.Join.MITER);
        }
        Paint paint5 = this.u;
        if (paint5 != null) {
            paint5.setAntiAlias(true);
        }
        Paint paint6 = this.u;
        if (paint6 != null) {
            paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        }
        Paint paint7 = this.u;
        if (paint7 != null) {
            paint7.setColor(this.t);
        }
        Paint paint8 = this.f7937e;
        if (paint8 == null) {
            l.l("mFillPaint");
            throw null;
        }
        paint8.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint9 = this.f7937e;
        if (paint9 != null) {
            paint9.setStrokeWidth(this.s);
        } else {
            l.l("mFillPaint");
            throw null;
        }
    }

    public final void setBubbleOrientation(int i) {
        this.l = i;
    }

    public final void setBubbleParams(int i, float f2) {
        this.k = f2;
        this.l = i;
    }

    public final void setCornerRadius(@Px float f2) {
        this.b = f2;
    }

    public final void setMAdjustHeight(int i) {
    }

    public final void setMBgColor(int i) {
        this.o = i;
    }

    public final void setMHeight(float f2) {
        this.j = f2;
    }

    public final void setMNeedArrow(boolean z2) {
        this.q = z2;
    }

    public final void setMNeedShadow(boolean z2) {
        this.p = z2;
    }

    public final void setMPadding(float f2) {
        this.f7936d = f2;
    }

    public final void setMSubTitle(String str) {
        l.f(str, "<set-?>");
        this.a = str;
    }

    public final void setMWidth(float f2) {
        this.i = f2;
    }

    public final void setSubText(String str) {
        l.f(str, "str");
        this.a = str;
    }

    public final void setTransparentBg(boolean z2) {
        if (!z2) {
            setLayerType(1, null);
        } else {
            this.o = 0;
            setLayerType(1, null);
        }
    }

    public final void setUseDefaultView(boolean z2) {
        this.r = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OPopoverLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OPopoverLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = "";
        this.b = y;
        this.f7935c = new a(0.0f, 0.0f, 0.0f, 0, 15);
        this.f7936d = 12.0f;
        this.k = 0.75f;
        this.l = 1;
        this.q = true;
        this.r = true;
        this.v = new Path();
        this.w = new Path();
        l.f(context, "context");
        this.f7937e = new Paint();
        this.f7938f = new Path();
        this.f7939g = new Path();
        Paint paint = this.f7937e;
        if (paint != null) {
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f7937e;
            if (paint2 != null) {
                paint2.setStrokeCap(Paint.Cap.BUTT);
                Paint paint3 = this.f7937e;
                if (paint3 != null) {
                    paint3.setAntiAlias(true);
                    Paint paint4 = this.f7937e;
                    if (paint4 != null) {
                        paint4.setStrokeJoin(Paint.Join.MITER);
                        if (this.o == 0) {
                            this.o = ContextCompat.getColor(context, C0838R.color.SDPrimary);
                        }
                        Paint paint5 = this.f7937e;
                        if (paint5 != null) {
                            paint5.setColor(this.o);
                            setLayerType(1, null);
                            Path path = this.f7939g;
                            if (path != null) {
                                path.moveTo(0.0f, 0.0f);
                                float f2 = x / 7.0f;
                                Path path2 = this.f7939g;
                                if (path2 != null) {
                                    float f3 = f2 * 0.0f;
                                    float f4 = f2 * 7.0f;
                                    path2.cubicTo(f3, f2 * (-2.5f), f4, f2 * (-4.0f), f4, f2 * (-10.0f));
                                    Path path3 = this.f7939g;
                                    if (path3 != null) {
                                        path3.lineTo(f4, 10.0f * f2);
                                        Path path4 = this.f7939g;
                                        if (path4 != null) {
                                            path4.cubicTo(f4, f2 * 4.0f, f3, f2 * 2.5f, f3, f3);
                                            Path path5 = this.f7939g;
                                            if (path5 != null) {
                                                path5.close();
                                                setBackgroundColor(0);
                                                setClipChildren(false);
                                                return;
                                            }
                                            l.l("mBubbleArrowPath");
                                            throw null;
                                        }
                                        l.l("mBubbleArrowPath");
                                        throw null;
                                    }
                                    l.l("mBubbleArrowPath");
                                    throw null;
                                }
                                l.l("mBubbleArrowPath");
                                throw null;
                            }
                            l.l("mBubbleArrowPath");
                            throw null;
                        }
                        l.l("mFillPaint");
                        throw null;
                    }
                    l.l("mFillPaint");
                    throw null;
                }
                l.l("mFillPaint");
                throw null;
            }
            l.l("mFillPaint");
            throw null;
        }
        l.l("mFillPaint");
        throw null;
    }
}
