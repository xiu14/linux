package com.bytedance.android.input.common.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import e.i.a.b.b;

/* loaded from: classes.dex */
public class OProgressView extends View {
    private Paint a;
    private RectF b;

    /* renamed from: c, reason: collision with root package name */
    private RectF f2229c;

    /* renamed from: d, reason: collision with root package name */
    private RectF f2230d;

    /* renamed from: e, reason: collision with root package name */
    private float f2231e;

    /* renamed from: f, reason: collision with root package name */
    private float f2232f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f2233g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        int f2234c;

        /* renamed from: d, reason: collision with root package name */
        int f2235d;

        /* renamed from: e, reason: collision with root package name */
        int f2236e;

        /* renamed from: f, reason: collision with root package name */
        int f2237f;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.f2234c);
            parcel.writeInt(this.f2235d);
            parcel.writeInt(this.f2236e);
            parcel.writeInt(this.f2237f);
        }

        SavedState(Parcel parcel, a aVar) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.f2234c = parcel.readInt();
            this.f2235d = parcel.readInt();
            this.f2236e = parcel.readInt();
            this.f2237f = parcel.readInt();
        }
    }

    public OProgressView(Context context) {
        this(context, null);
    }

    private int a(float f2) {
        return (int) (f2 * Resources.getSystem().getDisplayMetrics().density);
    }

    private void b() {
        if (this.l != 0) {
            this.j = ContextCompat.getColor(getContext(), this.l);
        }
        if (this.m != 0) {
            this.k = ContextCompat.getColor(getContext(), this.m);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a == null) {
            this.a = new Paint();
        }
        this.a.reset();
        this.a.setStyle(Paint.Style.FILL);
        this.a.setAntiAlias(true);
        float height = getHeight();
        float f2 = (height - this.f2232f) / 2.0f;
        if (this.b == null) {
            this.b = new RectF();
        }
        float f3 = height - f2;
        this.b.set(0.0f, f2, getWidth(), f3);
        if (this.f2229c == null) {
            this.f2229c = new RectF();
        }
        this.f2229c.set(0.0f, f2, (getWidth() * this.i) / 100.0f, f3);
        if (this.f2230d == null) {
            this.f2230d = new RectF();
        }
        float width = getWidth() / 2;
        float height2 = getHeight() / 2;
        this.f2230d.set(width, height2, width, height2);
        this.a.setColor(this.k);
        RectF rectF = this.b;
        float f4 = this.f2231e;
        canvas.drawRoundRect(rectF, f4, f4, this.a);
        this.a.setColor(this.j);
        RectF rectF2 = this.f2229c;
        float f5 = this.f2231e;
        canvas.drawRoundRect(rectF2, f5, f5, this.a);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setSize(savedState.a);
        setProgress(savedState.b);
        this.l = savedState.f2234c;
        this.m = savedState.f2235d;
        this.j = savedState.f2236e;
        this.k = savedState.f2237f;
        b();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.h;
        savedState.b = this.i;
        savedState.f2234c = this.l;
        savedState.f2235d = this.m;
        savedState.f2236e = this.j;
        savedState.f2237f = this.k;
        return savedState;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.m = 0;
        this.k = i;
        invalidate();
    }

    public void setProgress(int i) {
        if (this.i == i) {
            return;
        }
        if (i <= 0) {
            i = 0;
        } else if (i >= 100) {
            i = 100;
        }
        this.i = i;
        invalidate();
    }

    public void setProgressColor(int i) {
        this.l = 0;
        this.j = i;
        invalidate();
    }

    public void setSize(int i) {
        if (i == 0) {
            this.f2232f = a(4.0f);
        } else if (i != 2) {
            this.f2232f = a(6.0f);
        } else {
            this.f2232f = a(8.0f);
        }
        this.f2231e = a(99.0f);
        a(40.0f);
        if (this.f2233g == null) {
            this.f2233g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        this.h = i;
        invalidate();
    }

    public OProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.l = 0;
        this.m = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.A, i, 0);
        int i2 = obtainStyledAttributes.getInt(3, 1);
        this.i = obtainStyledAttributes.getInt(1, 0);
        this.l = obtainStyledAttributes.getResourceId(2, C0838R.color.oui_fill_highlighted);
        this.m = obtainStyledAttributes.getResourceId(0, C0838R.color.oui_line_2);
        b();
        obtainStyledAttributes.recycle();
        setSize(i2);
    }
}
