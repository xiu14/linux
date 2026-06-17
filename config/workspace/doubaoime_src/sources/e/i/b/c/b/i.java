package e.i.b.c.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class i implements f {
    private Paint B;
    private PorterDuffXfermode C;
    private int D;
    private float[] E;
    private boolean N;
    private RectF O;
    private WeakReference<View> S;
    private float X;
    private Context a;
    private AttributeSet f0;
    private int g0;
    private int h0;
    private int i;
    private int n;
    private int s;
    private int x;
    private Paint z;
    private int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f10011c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f10012d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f10013e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f10014f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f10015g = 0;
    private int h = 0;
    private int j = 255;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private int o = 255;
    private int p = 0;
    private int q = 0;
    private int r = 0;
    private int t = 255;
    private int u = 0;
    private int v = 0;
    private int w = 0;
    private int y = 255;
    private float A = 1.0f;

    /* renamed from: J, reason: collision with root package name */
    private int f10010J = 0;
    private int K = 0;
    private int L = 0;
    private int M = 0;
    private int P = 0;
    private int Q = 1;
    private int R = 0;
    private boolean T = false;
    private Path U = new Path();
    private boolean V = true;
    private int W = 0;
    private int Y = ViewCompat.MEASURED_STATE_MASK;
    private int Z = 0;
    private int a0 = 0;
    private int b0 = 0;
    private int c0 = 0;
    private int d0 = 0;
    private int e0 = 0;
    private o i0 = new o(Color.parseColor("#00000000"), 0.0f, 0.0f, 0.0f, 0.0f);
    private o j0 = new o(Color.parseColor("#00000000"), 0.0f, 0.0f, 0.0f, 0.0f);
    private float k0 = 0.0f;

    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            int i;
            int i2;
            int i3;
            int width = view.getWidth();
            int height = view.getHeight();
            if (width == 0 || height == 0) {
                return;
            }
            float A = i.this.A();
            float f2 = A * 2.0f;
            float min = Math.min(width, height);
            if (f2 > min) {
                A = min / 2.0f;
            }
            float f3 = A;
            if (i.this.N) {
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, width, height), new float[]{i.this.f10010J, i.this.f10010J, i.this.K, i.this.K, i.this.M, i.this.M, i.this.L, i.this.L}, Path.Direction.CW);
                outline.setConvexPath(path);
                view.setClipToOutline(true);
                return;
            }
            int i4 = i.this.d0;
            int max = Math.max(i4 + 1, height - i.this.e0);
            int i5 = i.this.b0;
            int i6 = width - i.this.c0;
            if (i.this.T) {
                int paddingLeft = view.getPaddingLeft() + i5;
                int paddingTop = view.getPaddingTop() + i4;
                int max2 = Math.max(paddingLeft + 1, i6 - view.getPaddingRight());
                i2 = Math.max(paddingTop + 1, max - view.getPaddingBottom());
                i = max2;
                i3 = paddingTop;
                i5 = paddingLeft;
            } else {
                i = i6;
                i2 = max;
                i3 = i4;
            }
            float f4 = i.this.X;
            if (i.this.W == 0) {
                f4 = 1.0f;
            }
            outline.setAlpha(f4);
            if (f3 <= 0.0f) {
                outline.setRect(i5, i3, i, i2);
                return;
            }
            if (!p.f10029d) {
                outline.setRoundRect(i5, i3, i, i2, f3);
            } else if (Build.VERSION.SDK_INT < 30) {
                outline.setRoundRect(i5, i3, i, i2, f3);
            } else {
                p pVar = p.f10030e;
                outline.setPath(p.b(i5, i3, i, i2, f3));
            }
        }
    }

    public i(Context context, AttributeSet attributeSet, int i, int i2) {
        this.a = context;
        this.f0 = attributeSet;
        this.g0 = i;
        this.h0 = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A() {
        View view = this.S.get();
        if (view == null) {
            return this.D;
        }
        int i = this.D;
        return i == -1 ? view.getHeight() / 2 : i == -2 ? view.getWidth() / 2 : i;
    }

    private static void D(TypedArray typedArray, o oVar, int i, int i2, int i3, int i4, int i5) {
        if (oVar == null) {
            return;
        }
        oVar.h(typedArray.getColor(i, Color.parseColor("#00000000")));
        oVar.k(typedArray.getDimension(i2, 0.0f));
        oVar.i(typedArray.getDimension(i3, 0.0f));
        oVar.j(typedArray.getDimension(i4, 0.0f));
        oVar.l(typedArray.getDimension(i5, 0.0f));
    }

    private void F() {
        View view = this.S.get();
        if (view == null) {
            return;
        }
        view.invalidate();
    }

    private void G() {
        View view = this.S.get();
        if (view == null) {
            return;
        }
        int i = this.W;
        if (i == 0) {
            view.setElevation(0.0f);
        } else {
            view.setElevation(i);
        }
        view.invalidateOutline();
    }

    private void I(int i) {
        View view;
        if (Build.VERSION.SDK_INT < 28 || (view = this.S.get()) == null) {
            return;
        }
        view.setOutlineAmbientShadowColor(i);
        view.setOutlineSpotShadowColor(i);
    }

    private void s(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, e.i.a.b.b.S);
        D(obtainStyledAttributes, this.i0, 13, 12, 10, 11, 14);
        D(obtainStyledAttributes, this.j0, 35, 34, 32, 33, 36);
        obtainStyledAttributes.recycle();
    }

    @RequiresApi(26)
    private void w(Canvas canvas, o oVar) {
        if (oVar == null) {
            return;
        }
        float b = oVar.b() > 0.0f ? oVar.b() : this.k0;
        View view = this.S.get();
        Path path = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int i = this.Z;
        if (i != 0 || this.a0 != 0) {
            rectF.inset(i, this.a0);
        }
        p pVar = p.f10030e;
        kotlin.s.c.l.f(path, DownloadConstants.PATH_KEY);
        kotlin.s.c.l.f(rectF, "rect");
        path.addPath(p.c(rectF, b));
        int save = canvas.save();
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(oVar.c(), oVar.d());
        rectF2.inset(-oVar.g(), -oVar.g());
        canvas.clipOutPath(path);
        oVar.e().setColor(oVar.a());
        if (oVar.f() > 0.0f) {
            oVar.e().setMaskFilter(new BlurMaskFilter(oVar.f(), BlurMaskFilter.Blur.NORMAL));
        }
        p.g(canvas, rectF2, b, oVar.e());
        canvas.restoreToCount(save);
    }

    public static List<o> x(Context context, int i) {
        ArrayList arrayList = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, e.i.a.b.b.S);
        o oVar = new o(Color.parseColor("#00000000"), 0.0f, 0.0f, 0.0f, 0.0f);
        o oVar2 = new o(Color.parseColor("#00000000"), 0.0f, 0.0f, 0.0f, 0.0f);
        D(obtainStyledAttributes, oVar, 13, 12, 10, 11, 14);
        D(obtainStyledAttributes, oVar2, 35, 34, 32, 33, 36);
        obtainStyledAttributes.recycle();
        arrayList.add(oVar);
        arrayList.add(oVar2);
        return arrayList;
    }

    public int B(int i, int i2) {
        int i3;
        return (View.MeasureSpec.getMode(i) == 1073741824 || i2 >= (i3 = this.f10013e)) ? i : View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY);
    }

    public int C(int i, int i2) {
        int i3;
        return (View.MeasureSpec.getMode(i) == 1073741824 || i2 >= (i3 = this.f10012d)) ? i : View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY);
    }

    public void E(View view) {
        int i;
        boolean z;
        this.S = new WeakReference<>(view);
        int color = ContextCompat.getColor(this.a, C0838R.color.oui_line_2);
        this.i = color;
        this.n = color;
        int color2 = ContextCompat.getColor(this.a, C0838R.color.oui_line_2);
        this.x = color2;
        this.s = color2;
        this.C = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        Paint paint = new Paint();
        this.B = paint;
        paint.setAntiAlias(true);
        float b = j.b(this.a, C0838R.attr.oui_general_shadow_alpha);
        if (b > 0.0f) {
            this.X = b;
        }
        this.O = new RectF();
        AttributeSet attributeSet = this.f0;
        int i2 = 0;
        if (attributeSet == null && this.g0 == 0 && this.h0 == 0) {
            i = 0;
            z = false;
        } else {
            TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(attributeSet, e.i.a.b.b.S, this.g0, this.h0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i3 = 0;
            i = 0;
            z = false;
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 0) {
                    this.b = obtainStyledAttributes.getDimensionPixelSize(index, this.b);
                } else if (index == 1) {
                    this.f10011c = obtainStyledAttributes.getDimensionPixelSize(index, this.f10011c);
                } else if (index == 2) {
                    this.f10012d = obtainStyledAttributes.getDimensionPixelSize(index, this.f10012d);
                } else if (index == 3) {
                    this.f10013e = obtainStyledAttributes.getDimensionPixelSize(index, this.f10013e);
                } else if (index == 43) {
                    this.i = obtainStyledAttributes.getColor(index, this.i);
                } else if (index == 44) {
                    this.f10014f = obtainStyledAttributes.getDimensionPixelSize(index, this.f10014f);
                } else if (index == 45) {
                    this.f10015g = obtainStyledAttributes.getDimensionPixelSize(index, this.f10015g);
                } else if (index == 46) {
                    this.h = obtainStyledAttributes.getDimensionPixelSize(index, this.h);
                } else if (index == 4) {
                    this.n = obtainStyledAttributes.getColor(index, this.n);
                } else if (index == 5) {
                    this.k = obtainStyledAttributes.getDimensionPixelSize(index, this.k);
                } else if (index == 6) {
                    this.l = obtainStyledAttributes.getDimensionPixelSize(index, this.l);
                } else if (index == 7) {
                    this.m = obtainStyledAttributes.getDimensionPixelSize(index, this.m);
                } else if (index == 17) {
                    this.s = obtainStyledAttributes.getColor(index, this.s);
                } else if (index == 20) {
                    this.p = obtainStyledAttributes.getDimensionPixelSize(index, this.p);
                } else if (index == 19) {
                    this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                } else if (index == 18) {
                    this.r = obtainStyledAttributes.getDimensionPixelSize(index, this.r);
                } else if (index == 28) {
                    this.x = obtainStyledAttributes.getColor(index, this.x);
                } else if (index == 31) {
                    this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                } else if (index == 30) {
                    this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                } else if (index == 29) {
                    this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                } else if (index == 15) {
                    this.P = obtainStyledAttributes.getColor(index, this.P);
                } else if (index == 16) {
                    this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                } else if (index == 27) {
                    i = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 21) {
                    this.R = obtainStyledAttributes.getColor(index, this.R);
                } else if (index == 41) {
                    this.V = obtainStyledAttributes.getBoolean(index, this.V);
                } else if (index == 39) {
                    i3 = obtainStyledAttributes.getDimensionPixelSize(index, i3);
                } else if (index == 37) {
                    this.X = obtainStyledAttributes.getFloat(index, this.X);
                } else if (index == 49) {
                    z = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == 24) {
                    this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 25) {
                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 26) {
                    this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 23) {
                    this.e0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 22) {
                    this.T = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == 42) {
                    obtainStyledAttributes.getBoolean(index, false);
                } else if (index == 47) {
                    this.f10010J = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
                if (index == 8) {
                    this.L = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
                if (index == 9) {
                    this.M = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
                if (index == 48) {
                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            int resourceId = obtainStyledAttributes.getResourceId(40, 0);
            if (resourceId != 0) {
                s(this.a, resourceId);
            } else {
                D(obtainStyledAttributes, this.i0, 13, 12, 10, 11, 14);
                D(obtainStyledAttributes, this.j0, 35, 34, 32, 33, 36);
            }
            this.k0 = obtainStyledAttributes.getDimension(38, 0.0f);
            obtainStyledAttributes.recycle();
            i2 = i3;
        }
        if (i2 == 0 && z) {
            i2 = j.a(this.a, C0838R.attr.oui_general_shadow_elevation);
        }
        setRadiusAndShadow(i, i2, this.Y, this.X);
    }

    public void H() {
        View view = this.S.get();
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // e.i.b.c.b.f
    public boolean a() {
        return false;
    }

    @Override // e.i.b.c.b.f
    public void c(int i, int i2, int i3, int i4) {
        this.l = i;
        this.m = i2;
        this.n = i4;
        this.k = i3;
        H();
    }

    @Override // e.i.b.c.b.f
    public void d(int i) {
    }

    @Override // e.i.b.c.b.f
    public boolean e() {
        return false;
    }

    @Override // e.i.b.c.b.f
    public void f(float f2) {
        if (this.A != f2) {
            this.A = f2;
            F();
        }
    }

    @Override // e.i.b.c.b.f
    public int getShadowColor() {
        return this.Y;
    }

    @Override // e.i.b.c.b.f
    public void setBorderColor(@ColorInt int i) {
        this.P = i;
        H();
    }

    @Override // e.i.b.c.b.f
    public void setBorderWidth(int i) {
        this.Q = i;
        H();
    }

    @Override // e.i.b.c.b.f
    public void setBottomDividerAlpha(int i) {
        this.o = i;
        H();
    }

    @Override // e.i.b.c.b.f
    public void setLeftDividerAlpha(int i) {
        this.t = i;
        H();
    }

    @Override // e.i.b.c.b.f
    public void setOuterNormalColor(int i) {
        this.R = i;
        H();
    }

    @Override // e.i.b.c.b.f
    public void setOutlineExcludePadding(boolean z) {
        View view = this.S.get();
        if (view == null) {
            return;
        }
        this.T = z;
        view.invalidateOutline();
    }

    @Override // e.i.b.c.b.f
    public void setOutlineInset(int i, int i2, int i3, int i4) {
        View view = this.S.get();
        if (view == null) {
            return;
        }
        this.b0 = i;
        this.c0 = i3;
        this.d0 = i2;
        this.e0 = i4;
        view.invalidateOutline();
    }

    @Override // e.i.b.c.b.f
    public void setRadius(int i) {
        if (this.D != i) {
            setRadiusAndShadow(i, this.W, this.Y, this.X);
        }
    }

    @Override // e.i.b.c.b.f
    public void setRadiusAndShadow(int i, int i2, float f2) {
        setRadiusAndShadow(i, i2, this.Y, f2);
    }

    @Override // e.i.b.c.b.f
    public void setRightDividerAlpha(int i) {
        this.y = i;
        H();
    }

    @Override // e.i.b.c.b.f
    public void setShadow(@Nullable o oVar, @Nullable o oVar2) {
        this.i0 = oVar;
        this.j0 = oVar2;
        F();
    }

    @Override // e.i.b.c.b.f
    public void setShadowAlpha(float f2) {
        if (this.X == f2) {
            return;
        }
        this.X = f2;
        G();
    }

    @Override // e.i.b.c.b.f
    public void setShadowColor(int i) {
        if (this.Y == i) {
            return;
        }
        this.Y = i;
        I(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowCornerRadius(int i) {
        this.k0 = i;
    }

    @Override // e.i.b.c.b.f
    public void setShadowElevation(int i) {
        if (this.W == i) {
            return;
        }
        this.W = i;
        G();
    }

    @Override // e.i.b.c.b.f
    public void setShadowInsets(int i, int i2) {
        this.Z = i;
        this.a0 = i2;
    }

    @Override // e.i.b.c.b.f
    public void setShadowStyle(@StyleRes int i) {
        if (i == 0) {
            return;
        }
        s(this.a, i);
    }

    @Override // e.i.b.c.b.f
    public void setShowBorderOnlyBeforeL(boolean z) {
        this.V = z;
        F();
    }

    @Override // e.i.b.c.b.f
    public void setTopDividerAlpha(int i) {
        this.j = i;
        H();
    }

    @Override // e.i.b.c.b.f
    public void setUseThemeGeneralShadowElevation() {
        int a2 = j.a(this.a, C0838R.attr.oui_general_shadow_elevation);
        this.W = a2;
        setRadiusAndShadow(this.D, a2, this.Y, this.X);
    }

    public void t(Canvas canvas) {
        if (this.S.get() == null) {
            return;
        }
        int A = A();
        boolean z = this.Q > 0 && this.P != 0;
        if (z) {
            if (!this.V || this.W == 0) {
                int width = canvas.getWidth();
                int height = canvas.getHeight();
                canvas.save();
                canvas.translate(r0.getScrollX(), r0.getScrollY());
                float f2 = this.Q / 2.0f;
                if (this.T) {
                    this.O.set(r0.getPaddingLeft() + f2, r0.getPaddingTop() + f2, (width - r0.getPaddingRight()) - f2, (height - r0.getPaddingBottom()) - f2);
                } else {
                    this.O.set(f2, f2, width - f2, height - f2);
                }
                if (this.N) {
                    if (this.E == null) {
                        this.E = new float[8];
                    }
                    float[] fArr = this.E;
                    float f3 = this.f10010J;
                    fArr[0] = f3;
                    fArr[1] = f3;
                    float f4 = this.K;
                    fArr[2] = f4;
                    fArr[3] = f4;
                    float f5 = this.L;
                    fArr[4] = f5;
                    fArr[5] = f5;
                    float f6 = this.M;
                    fArr[6] = f6;
                    fArr[7] = f6;
                }
                if (z) {
                    this.B.setColor(this.P);
                    this.B.setStrokeWidth(this.Q);
                    this.B.setStyle(Paint.Style.STROKE);
                    if (this.N) {
                        RectF rectF = this.O;
                        float[] fArr2 = this.E;
                        Paint paint = this.B;
                        this.U.reset();
                        this.U.addRoundRect(rectF, fArr2, Path.Direction.CW);
                        canvas.drawPath(this.U, paint);
                    } else if (A <= 0) {
                        canvas.drawRect(this.O, this.B);
                    } else {
                        RectF rectF2 = this.O;
                        Paint paint2 = this.B;
                        p pVar = p.f10030e;
                        p.g(canvas, rectF2, A * 1.0f, paint2);
                    }
                }
                canvas.restore();
            }
        }
    }

    @RequiresApi(api = 26)
    public void u(Canvas canvas) {
        View view = this.S.get();
        if (view == null) {
            return;
        }
        o oVar = this.i0;
        boolean z = oVar != null && oVar.m();
        o oVar2 = this.j0;
        boolean z2 = oVar2 != null && oVar2.m();
        if (z || z2) {
            if (this.D != 0 || this.N) {
                Log.e("OUILayoutHelper", " 阴影和圆角同时存在阴影不生效");
            } else {
                w(canvas, this.i0);
                w(canvas, this.j0);
            }
        }
        if (view.isHardwareAccelerated() || this.N) {
            return;
        }
        Drawable background = view.getBackground();
        if (background != null && !(background instanceof n)) {
            n nVar = new n(background, this.a.getResources().getDisplayMetrics());
            nVar.a(this.D);
            view.setBackground(nVar);
        }
        Drawable foreground = view.getForeground();
        if (foreground == null || (foreground instanceof n)) {
            return;
        }
        n nVar2 = new n(foreground, this.a.getResources().getDisplayMetrics());
        nVar2.a(this.D);
        view.setForeground(nVar2);
    }

    public void v(Canvas canvas, int i, int i2) {
        if (this.S.get() == null) {
            return;
        }
        if (this.z == null && (this.f10014f > 0 || this.k > 0 || this.p > 0 || this.u > 0)) {
            this.z = new Paint();
        }
        canvas.save();
        canvas.translate(r0.getScrollX(), r0.getScrollY());
        int i3 = this.f10014f;
        if (i3 > 0) {
            this.z.setStrokeWidth(i3);
            this.z.setColor(e.i.b.f.d.a(this.i, this.A));
            int i4 = this.j;
            if (i4 < 255) {
                this.z.setAlpha(i4);
            }
            float f2 = this.f10014f / 2.0f;
            canvas.drawLine(this.f10015g, f2, i - this.h, f2, this.z);
        }
        int i5 = this.k;
        if (i5 > 0) {
            this.z.setStrokeWidth(i5);
            this.z.setColor(e.i.b.f.d.a(this.n, this.A));
            int i6 = this.o;
            if (i6 < 255) {
                this.z.setAlpha(i6);
            }
            float floor = (float) Math.floor(i2 - (this.k / 2.0f));
            canvas.drawLine(this.l, floor, i - this.m, floor, this.z);
        }
        int i7 = this.p;
        if (i7 > 0) {
            this.z.setStrokeWidth(i7);
            this.z.setColor(e.i.b.f.d.a(this.s, this.A));
            int i8 = this.t;
            if (i8 < 255) {
                this.z.setAlpha(i8);
            }
            float f3 = this.p / 2.0f;
            canvas.drawLine(f3, this.q, f3, i2 - this.r, this.z);
        }
        int i9 = this.u;
        if (i9 > 0) {
            this.z.setStrokeWidth(i9);
            this.z.setColor(e.i.b.f.d.a(this.x, this.A));
            int i10 = this.y;
            if (i10 < 255) {
                this.z.setAlpha(i10);
            }
            float floor2 = (float) Math.floor(i - (this.u / 2.0f));
            canvas.drawLine(floor2, this.v, floor2, i2 - this.w, this.z);
        }
        canvas.restore();
    }

    public int y(int i) {
        return (this.f10011c <= 0 || View.MeasureSpec.getSize(i) <= this.f10011c) ? i : View.MeasureSpec.getMode(i) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(this.f10011c, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(this.f10011c, BasicMeasure.EXACTLY);
    }

    public int z(int i) {
        return (this.b <= 0 || View.MeasureSpec.getSize(i) <= this.b) ? i : View.MeasureSpec.getMode(i) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(this.b, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(this.b, BasicMeasure.EXACTLY);
    }

    @Override // e.i.b.c.b.f
    public void setRadiusAndShadow(int i, int i2, int i3, float f2) {
        View view = this.S.get();
        if (view == null) {
            return;
        }
        this.D = i;
        if (this.k0 == 0.0f) {
            this.k0 = i;
        }
        boolean z = this.L > 0 || this.K > 0 || this.f10010J > 0 || this.M > 0;
        this.N = z;
        this.W = i2;
        this.X = f2;
        this.Y = i3;
        if (i2 == 0 || z) {
            view.setElevation(0.0f);
        } else {
            view.setElevation(i2);
        }
        I(this.Y);
        view.setOutlineProvider(new a());
        int i4 = this.D;
        view.setClipToOutline(i4 == -2 || i4 == -1 || i4 > 0);
        view.invalidate();
    }

    @Override // e.i.b.c.b.f
    public void setRadius(int i, int i2, int i3, int i4) {
        this.f10010J = i;
        this.K = i2;
        this.L = i3;
        this.M = i4;
        setRadiusAndShadow(this.D, this.W, this.Y, this.X);
    }
}
