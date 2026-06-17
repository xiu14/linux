package com.obric.oui.popover;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import e.a.a.a.a;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OMiddleArrowPopoverLayout extends LinearLayout {
    private static int n = a.e0("Resources.getSystem()", 1, 9);
    private static int o;
    private static int p;
    private static float q;
    private float a;
    private Paint b;

    /* renamed from: c, reason: collision with root package name */
    private Path f7930c;

    /* renamed from: d, reason: collision with root package name */
    private float f7931d;

    /* renamed from: e, reason: collision with root package name */
    private int f7932e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f7933f;

    /* renamed from: g, reason: collision with root package name */
    private Canvas f7934g;
    private Drawable h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private Paint m;

    static {
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        TypedValue.applyDimension(1, 18, system.getDisplayMetrics());
        float f2 = 42;
        o = a.e0("Resources.getSystem()", 1, f2);
        p = a.e0("Resources.getSystem()", 1, f2);
        q = Integer.min(r0, o) / 2.0f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OMiddleArrowPopoverLayout(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    @Override // android.widget.LinearLayout, android.view.View
    @SuppressLint({"CI_DrawAllocation"})
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        if (this.f7933f == null) {
            Context context = getContext();
            l.e(context, "context");
            Resources resources = context.getResources();
            l.e(resources, "context.resources");
            this.f7933f = Bitmap.createBitmap(resources.getDisplayMetrics(), getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.f7933f;
            l.c(bitmap);
            this.f7934g = new Canvas(bitmap);
        }
        Paint paint = this.b;
        if (paint == null) {
            l.l("mFillPaint");
            throw null;
        }
        paint.setColor(this.i);
        Drawable drawable = this.h;
        if (drawable != null) {
            int i = this.f7932e;
            float f2 = i != 0 ? i != 1 ? i != 3 ? 0.0f : 90.0f : 180.0f : 270.0f;
            int i2 = n;
            int i3 = ((int) this.a) + i2;
            int height = (getHeight() - ((int) ((drawable.getIntrinsicHeight() * ((getWidth() - i3) - i2)) / drawable.getIntrinsicWidth()))) / 2;
            drawable.setBounds(i3, height, getWidth() - i2, getHeight() - height);
            Canvas canvas2 = this.f7934g;
            if (canvas2 == null) {
                l.l("mCanvas");
                throw null;
            }
            canvas2.save();
            Canvas canvas3 = this.f7934g;
            if (canvas3 == null) {
                l.l("mCanvas");
                throw null;
            }
            canvas3.rotate(f2, getWidth() / 2.0f, getHeight() / 2.0f);
            Canvas canvas4 = this.f7934g;
            if (canvas4 == null) {
                l.l("mCanvas");
                throw null;
            }
            drawable.draw(canvas4);
            Canvas canvas5 = this.f7934g;
            if (canvas5 == null) {
                l.l("mCanvas");
                throw null;
            }
            canvas5.restore();
        }
        Bitmap bitmap2 = this.f7933f;
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
            measuredWidth = textView.getPaddingRight() + textView.getPaddingLeft() + (((int) textView.getPaint().measureText(textView.getText().toString())) > a.e0("Resources.getSystem()", 1, f2) ? a.e0("Resources.getSystem()", 1, f2) : (int) textView.getPaint().measureText(textView.getText().toString()));
        } else {
            measuredWidth = getMeasuredWidth();
        }
        if (this.j) {
            int i3 = o;
            if (measuredWidth > i3) {
                float f3 = this.a;
                Resources system = Resources.getSystem();
                l.e(system, "Resources.getSystem()");
                i3 = (kotlin.t.a.a(TypedValue.applyDimension(1, f3, system.getDisplayMetrics())) * 2) + measuredWidth;
            }
            int i4 = n;
            int i5 = (i4 * 2) + i3;
            int i6 = this.k;
            measuredWidth2 = (i6 * 2) + i5;
            measuredHeight = (i6 * 2) + (i4 * 2) + p;
        } else {
            PopupWindow popupWindow = new PopupWindow(getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            View contentView = popupWindow.getContentView();
            l.e(contentView, "pop.contentView");
            measuredWidth2 = (n * 2) + contentView.getMeasuredWidth();
            View contentView2 = popupWindow.getContentView();
            l.e(contentView2, "pop.contentView");
            measuredHeight = contentView2.getMeasuredHeight() + (n * 2);
        }
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(measuredWidth2, measuredHeight);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(measuredWidth2, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, measuredHeight);
        }
        getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        this.f7931d = measuredHeight2;
        float f4 = measuredHeight2 / 2.0f;
        float f5 = (n + f4) - (f4 / 1.63f);
        float f6 = f4 / 1.56f;
        Path path = this.f7930c;
        if (path == null) {
            l.l("mBubbleArrowPath");
            throw null;
        }
        path.reset();
        Path path2 = this.f7930c;
        if (path2 == null) {
            l.l("mBubbleArrowPath");
            throw null;
        }
        path2.moveTo(0.0f, 0.0f);
        Path path3 = this.f7930c;
        if (path3 == null) {
            l.l("mBubbleArrowPath");
            throw null;
        }
        path3.lineTo(f5, -f6);
        Path path4 = this.f7930c;
        if (path4 == null) {
            l.l("mBubbleArrowPath");
            throw null;
        }
        path4.lineTo(f5, f6);
        Path path5 = this.f7930c;
        if (path5 == null) {
            l.l("mBubbleArrowPath");
            throw null;
        }
        path5.lineTo(0.0f, 0.0f);
        Path path6 = this.f7930c;
        if (path6 != null) {
            path6.close();
        } else {
            l.l("mBubbleArrowPath");
            throw null;
        }
    }

    public final void setBorderColor(int i) {
        this.l = i;
    }

    public final void setBorderWidth(int i) {
        if (i <= 0) {
            return;
        }
        this.k = i;
        if (this.m == null) {
            this.m = new Paint();
        }
        Paint paint = this.m;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        Paint paint2 = this.m;
        if (paint2 != null) {
            paint2.setStrokeWidth(this.k);
        }
        Paint paint3 = this.m;
        if (paint3 != null) {
            paint3.setStrokeCap(Paint.Cap.BUTT);
        }
        Paint paint4 = this.m;
        if (paint4 != null) {
            paint4.setStrokeJoin(Paint.Join.MITER);
        }
        Paint paint5 = this.m;
        if (paint5 != null) {
            paint5.setAntiAlias(true);
        }
        Paint paint6 = this.m;
        if (paint6 != null) {
            paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        }
        Paint paint7 = this.m;
        if (paint7 != null) {
            paint7.setColor(this.l);
        }
        Paint paint8 = this.b;
        if (paint8 == null) {
            l.l("mFillPaint");
            throw null;
        }
        paint8.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint9 = this.b;
        if (paint9 != null) {
            paint9.setStrokeWidth(this.k);
        } else {
            l.l("mFillPaint");
            throw null;
        }
    }

    public final void setBubbleOrientation(int i) {
        this.f7932e = i;
    }

    public final void setBubbleParams(int i, float f2) {
        this.f7932e = i;
    }

    public final void setCornerRadius(@Px float f2) {
    }

    public final void setMAdjustHeight(int i) {
    }

    public final void setMBgColor(int i) {
        this.i = i;
    }

    public final void setMHeight(float f2) {
        this.f7931d = f2;
    }

    public final void setMNeedArrow(boolean z) {
    }

    public final void setMNeedShadow(boolean z) {
    }

    public final void setMPadding(float f2) {
        this.a = f2;
    }

    public final void setMWidth(float f2) {
    }

    public final void setTransparentBg(boolean z) {
        if (!z) {
            setLayerType(1, null);
        } else {
            this.i = 0;
            setLayerType(1, null);
        }
    }

    public final void setUseDefaultView(boolean z) {
        this.j = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OMiddleArrowPopoverLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OMiddleArrowPopoverLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = 12.0f;
        this.f7932e = 1;
        this.j = true;
        new Path();
        new Path();
        l.f(context, "context");
        this.b = new Paint();
        new Path();
        this.f7930c = new Path();
        Paint paint = this.b;
        if (paint != null) {
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = this.b;
            if (paint2 != null) {
                paint2.setStrokeCap(Paint.Cap.BUTT);
                Paint paint3 = this.b;
                if (paint3 != null) {
                    paint3.setAntiAlias(true);
                    Paint paint4 = this.b;
                    if (paint4 != null) {
                        paint4.setStrokeJoin(Paint.Join.MITER);
                        if (this.i == 0) {
                            this.i = ContextCompat.getColor(context, C0838R.color.SDPrimary);
                        }
                        Paint paint5 = this.b;
                        if (paint5 != null) {
                            paint5.setColor(this.i);
                            setLayerType(1, null);
                            setBackgroundColor(0);
                            setClipChildren(false);
                            this.h = context.getDrawable(C0838R.drawable.o_bg_middle_arrow_popover);
                            return;
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
