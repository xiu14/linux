package com.obric.oui.indexscrollbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.doubaoime.C0838R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class LettersBar extends View {
    private Context a;
    private List<com.obric.oui.indexscrollbar.b> b;

    /* renamed from: c, reason: collision with root package name */
    private int f7794c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7795d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap[] f7796e;

    /* renamed from: f, reason: collision with root package name */
    private int f7797f;

    /* renamed from: g, reason: collision with root package name */
    private int f7798g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private final Paint m;
    private int n;
    private int o;
    private Bitmap p;
    private int q;
    private a r;
    private boolean s;
    private b t;
    private final OIndexPopupWindowLayout u;
    private int v;
    private String w;

    public interface a {
        boolean a(String str);
    }

    public interface b {
        void a(boolean z);
    }

    public LettersBar(Context context) {
        this(context, null, 0);
    }

    private final ArrayList<Integer> a() {
        int i;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i2 = this.k;
        List<com.obric.oui.indexscrollbar.b> list = this.b;
        kotlin.s.c.l.c(list);
        if (i2 / list.size() < this.f7798g) {
            kotlin.s.c.l.c(this.b);
            i = (int) Math.max(2.0d, ((int) Math.ceil(r4.size() / ((this.k / this.f7798g) - 2))) * 2);
        } else {
            i = 1;
        }
        arrayList.add(0);
        List<com.obric.oui.indexscrollbar.b> list2 = this.b;
        kotlin.s.c.l.c(list2);
        if (i < list2.size() / 2) {
            int i3 = i;
            while (true) {
                List<com.obric.oui.indexscrollbar.b> list3 = this.b;
                kotlin.s.c.l.c(list3);
                if (i3 >= list3.size() - 1) {
                    break;
                }
                arrayList.add(Integer.valueOf(i3));
                i3 += i;
            }
        }
        List<com.obric.oui.indexscrollbar.b> list4 = this.b;
        kotlin.s.c.l.c(list4);
        if (i < list4.size()) {
            List<com.obric.oui.indexscrollbar.b> list5 = this.b;
            kotlin.s.c.l.c(list5);
            arrayList.add(Integer.valueOf(list5.size() - 1));
        }
        return arrayList;
    }

    private final float b(int i, ArrayList<Integer> arrayList) {
        return (float) Math.max(i / arrayList.size(), this.f7798g);
    }

    private final void c(String str, int i) {
        float b2 = b(this.k, a());
        List<com.obric.oui.indexscrollbar.b> list = this.b;
        kotlin.s.c.l.c(list);
        String c2 = list.get(i).c();
        if (kotlin.s.c.l.a(c2, this.w)) {
            return;
        }
        StringBuilder V = e.a.a.a.a.V("showPopupWindow, scene: ", str, ", c = ", i, ", letter = ");
        V.append(c2);
        V.append(", lastPopupLetter = ");
        V.append(this.w);
        e.i.b.f.e.b.a("LettersBar", V.toString());
        Bitmap[] bitmapArr = this.f7796e;
        Bitmap bitmap = null;
        Integer valueOf = bitmapArr != null ? Integer.valueOf(bitmapArr.length) : null;
        List<com.obric.oui.indexscrollbar.b> list2 = this.b;
        kotlin.s.c.l.c(list2);
        if (list2.get(i).e() == 2 && valueOf != null && Integer.parseInt(c2) <= valueOf.intValue()) {
            Bitmap[] bitmapArr2 = this.f7796e;
            kotlin.s.c.l.c(bitmapArr2);
            bitmap = bitmapArr2[Integer.parseInt(c2) - 1];
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0838R.dimen.oui_h_title_bar_window);
        int width = ((this.v - getWidth()) - e.i.a.b.a.c(24)) - e.i.a.b.a.c(18);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            dimensionPixelSize += getResources().getDimensionPixelSize(identifier);
        }
        getLocationInWindow(new int[2]);
        this.u.b(c2, bitmap, width, Math.max((int) ((b2 * (i - 1)) + r4[1]), dimensionPixelSize));
        this.w = c2;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kotlin.s.c.l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.f7794c;
        kotlin.s.c.l.c(this.b);
        int paddingTop = (int) (((y - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom())) * r2.size());
        if (action == 0) {
            this.w = null;
            if (i != paddingTop && paddingTop >= 0) {
                List<com.obric.oui.indexscrollbar.b> list = this.b;
                kotlin.s.c.l.c(list);
                if (paddingTop < list.size()) {
                    c("ACTION_DOWN", paddingTop);
                    this.f7794c = paddingTop;
                    invalidate();
                }
            }
            setShowBg(false);
        } else if (action == 1) {
            if (this.f7795d) {
                if (this.r != null && paddingTop >= 0) {
                    List<com.obric.oui.indexscrollbar.b> list2 = this.b;
                    kotlin.s.c.l.c(list2);
                    if (paddingTop < list2.size()) {
                        a aVar = this.r;
                        kotlin.s.c.l.c(aVar);
                        List<com.obric.oui.indexscrollbar.b> list3 = this.b;
                        kotlin.s.c.l.c(list3);
                        if (aVar.a(list3.get(paddingTop).c())) {
                            this.f7794c = paddingTop;
                            invalidate();
                        }
                    }
                }
                this.u.a();
                this.f7794c = -1;
                invalidate();
                setShowBg(false);
            }
            this.u.a();
            invalidate();
        } else if (action == 2) {
            if (this.f7795d && i != paddingTop && this.r != null && paddingTop >= 0) {
                List<com.obric.oui.indexscrollbar.b> list4 = this.b;
                kotlin.s.c.l.c(list4);
                if (paddingTop < list4.size()) {
                    c("ACTION_MOVE", paddingTop);
                    a aVar2 = this.r;
                    kotlin.s.c.l.c(aVar2);
                    List<com.obric.oui.indexscrollbar.b> list5 = this.b;
                    kotlin.s.c.l.c(list5);
                    if (aVar2.a(list5.get(paddingTop).c())) {
                        this.f7794c = paddingTop;
                        invalidate();
                    }
                }
            }
            setShowBg(false);
        } else if (action == 3) {
            this.u.a();
            this.f7794c = -1;
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        boolean z;
        kotlin.s.c.l.f(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(0.0f, getPaddingTop());
        ArrayList<Integer> a2 = a();
        float b2 = b(this.k, a2);
        Iterator<Integer> it2 = a2.iterator();
        boolean z2 = false;
        int i = 0;
        while (it2.hasNext()) {
            Integer next = it2.next();
            kotlin.s.c.l.e(next, "index");
            int intValue = next.intValue();
            int i2 = this.f7794c;
            if ((i2 == intValue ? true : z2) && this.f7795d) {
                this.m.setColor(this.n);
                this.m.setFakeBoldText(z2);
                Paint paint = this.m;
                Resources system = Resources.getSystem();
                kotlin.s.c.l.e(system, "Resources.getSystem()");
                paint.setTextSize(TypedValue.applyDimension(1, 10, system.getDisplayMetrics()));
            } else {
                this.m.setColor(((i2 != -1 ? true : z2) || !this.f7795d) ? this.n : this.o);
                this.m.setFakeBoldText(z2);
                Paint paint2 = this.m;
                Resources system2 = Resources.getSystem();
                kotlin.s.c.l.e(system2, "Resources.getSystem()");
                paint2.setTextSize(TypedValue.applyDimension(1, 10, system2.getDisplayMetrics()));
            }
            List<com.obric.oui.indexscrollbar.b> list = this.b;
            kotlin.s.c.l.c(list);
            if (!kotlin.text.a.K(list.get(intValue).c(), ".", z2, 2, null)) {
                List<com.obric.oui.indexscrollbar.b> list2 = this.b;
                kotlin.s.c.l.c(list2);
                if (list2.get(intValue).e() == 1) {
                    this.m.setTextSize(this.i);
                    this.m.setFakeBoldText(true);
                } else {
                    this.m.setTextSize(this.h);
                }
            }
            float f2 = this.j;
            Paint paint3 = this.m;
            List<com.obric.oui.indexscrollbar.b> list3 = this.b;
            kotlin.s.c.l.c(list3);
            float measureText = paint3.measureText(list3.get(next.intValue()).c());
            float f3 = 2;
            float f4 = f2 - (measureText / f3);
            float f5 = (b2 / f3) + (i * b2) + this.l;
            if ((this.f7794c == next.intValue() ? true : z2) && this.f7795d) {
                Paint paint4 = new Paint();
                Context context = getContext();
                kotlin.s.c.l.e(context, "context");
                paint4.setColor(context.getResources().getColor(C0838R.color.Transparent));
                int c2 = e.i.a.b.a.c(14);
                e.i.a.b.a.c(14);
                float f6 = c2 / 2.0f;
                float f7 = this.j;
                canvas.drawRoundRect(new RectF(f7 - f6, f5 - f6, f7 + f6, f5 + f6), f6, f6, paint4);
            }
            List<com.obric.oui.indexscrollbar.b> list4 = this.b;
            kotlin.s.c.l.c(list4);
            if (list4.get(next.intValue()).e() == 2) {
                int intValue2 = next.intValue();
                List<com.obric.oui.indexscrollbar.b> list5 = this.b;
                kotlin.s.c.l.c(list5);
                Bitmap[] d2 = list5.get(intValue2).d();
                kotlin.s.c.l.c(d2);
                int i3 = this.f7794c;
                boolean z3 = (i3 == intValue2) && this.f7795d;
                boolean z4 = (i3 != -1) || !this.f7795d;
                if (z3) {
                    Bitmap bitmap = d2[2];
                    kotlin.s.c.l.c(bitmap);
                    int height = bitmap.getHeight();
                    Bitmap bitmap2 = d2[2];
                    kotlin.s.c.l.c(bitmap2);
                    float width = this.j - (bitmap2.getWidth() / 2);
                    Bitmap bitmap3 = d2[2];
                    kotlin.s.c.l.c(bitmap3);
                    canvas.drawBitmap(bitmap3, width, f5 - (height / 2), (Paint) null);
                } else if (z4) {
                    Bitmap bitmap4 = d2[1];
                    kotlin.s.c.l.c(bitmap4);
                    int height2 = bitmap4.getHeight();
                    Bitmap bitmap5 = d2[1];
                    kotlin.s.c.l.c(bitmap5);
                    float width2 = this.j - (bitmap5.getWidth() / 2);
                    Bitmap bitmap6 = d2[1];
                    kotlin.s.c.l.c(bitmap6);
                    canvas.drawBitmap(bitmap6, width2, f5 - (height2 / 2), (Paint) null);
                } else {
                    Bitmap bitmap7 = d2[0];
                    kotlin.s.c.l.c(bitmap7);
                    int height3 = bitmap7.getHeight();
                    Bitmap bitmap8 = d2[0];
                    kotlin.s.c.l.c(bitmap8);
                    float width3 = this.j - (bitmap8.getWidth() / 2);
                    Bitmap bitmap9 = d2[0];
                    kotlin.s.c.l.c(bitmap9);
                    canvas.drawBitmap(bitmap9, width3, f5 - (height3 / 2), (Paint) null);
                }
                z = false;
            } else {
                int intValue3 = next.intValue();
                List<com.obric.oui.indexscrollbar.b> list6 = this.b;
                kotlin.s.c.l.c(list6);
                String c3 = list6.get(intValue3).c();
                z = false;
                if (kotlin.text.a.K(c3, ".", false, 2, null)) {
                    kotlin.s.c.l.c(this.p);
                    float height4 = f5 - (r4.getHeight() / 2);
                    Bitmap bitmap10 = this.p;
                    kotlin.s.c.l.c(bitmap10);
                    canvas.drawBitmap(bitmap10, this.q, height4, (Paint) null);
                } else {
                    Paint.FontMetricsInt fontMetricsInt = this.m.getFontMetricsInt();
                    int i4 = fontMetricsInt.bottom;
                    canvas.drawText(c3, f4, (f5 - ((i4 - r6) / 2)) - fontMetricsInt.top, this.m);
                }
            }
            i++;
            z2 = z;
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            size = 0;
        }
        this.k = ((size - (this.l * 2)) - getPaddingTop()) - getPaddingBottom();
    }

    public final void setBitmapsSelected(Bitmap[] bitmapArr) {
        this.f7796e = bitmapArr;
    }

    public final void setLetters(List<com.obric.oui.indexscrollbar.b> list) {
        this.b = list;
    }

    public final void setListener(a aVar) {
        this.r = aVar;
    }

    public final void setMHasChosenLetterFontColor(int i) {
        this.n = i;
    }

    public final void setMNoChosenLetterFontColor(int i) {
        this.o = i;
    }

    public final void setOnBackgroundVisibleChangedListener(b bVar) {
        this.t = bVar;
    }

    public final void setSettled(boolean z) {
        this.f7795d = z;
        if (z) {
            this.f7794c = -1;
            invalidate();
        }
        invalidate();
    }

    public final void setShowBg(boolean z) {
        if (this.s != z) {
            this.s = z;
            setBackground(z ? getResources().getDrawable(C0838R.drawable.letters_bar_background) : null);
            b bVar = this.t;
            if (bVar != null) {
                kotlin.s.c.l.c(bVar);
                bVar.a(this.s);
            }
        }
    }

    public LettersBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LettersBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        this.f7794c = -1;
        this.f7795d = true;
        Paint paint = new Paint();
        this.m = paint;
        this.u = new OIndexPopupWindowLayout(context, null);
        this.a = context;
        kotlin.s.c.l.c(context);
        Resources resources = context.getResources();
        this.f7798g = resources.getDimensionPixelSize(C0838R.dimen.letters_bar_single_letter_min_height);
        this.f7797f = e.i.a.b.a.c(24);
        this.h = resources.getDimensionPixelOffset(C0838R.dimen.letters_bar_letter_font_size);
        this.i = resources.getDimensionPixelOffset(C0838R.dimen.letters_bar_letter_locale_font_size);
        this.j = this.f7797f / 2;
        BitmapFactory.decodeResource(resources, C0838R.drawable.letters_bar_highlight_icon);
        Drawable drawable = resources.getDrawable(C0838R.drawable.letters_bar_highlight_icon);
        kotlin.s.c.l.e(drawable, "iconDrawable");
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.getIntrinsicHeight();
        this.l = (int) resources.getDimension(C0838R.dimen.smartisan_quickbar_letterbar_margin);
        this.n = resources.getColor(C0838R.color.oui_text_3b);
        this.o = resources.getColor(C0838R.color.oui_text_3b);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, C0838R.drawable.letters_bar_dot);
        this.p = decodeResource;
        int i2 = this.j;
        kotlin.s.c.l.c(decodeResource);
        this.q = i2 - (decodeResource.getWidth() / 2);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setTextSize(this.h);
        paint.setAntiAlias(true);
        Resources resources2 = context.getResources();
        kotlin.s.c.l.e(resources2, "context.resources");
        this.v = resources2.getDisplayMetrics().widthPixels;
    }
}
