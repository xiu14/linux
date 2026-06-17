package com.obric.oui.progress;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import e.i.a.b.b;

/* loaded from: classes2.dex */
public class OProgressView extends View {
    private Paint a;
    private RectF b;

    /* renamed from: c, reason: collision with root package name */
    private RectF f7949c;

    /* renamed from: d, reason: collision with root package name */
    private RectF f7950d;

    /* renamed from: e, reason: collision with root package name */
    private float f7951e;

    /* renamed from: f, reason: collision with root package name */
    private float f7952f;

    /* renamed from: g, reason: collision with root package name */
    private float f7953g;
    private float[] h;
    private float[] i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        int f7954c;

        /* renamed from: d, reason: collision with root package name */
        int f7955d;

        /* renamed from: e, reason: collision with root package name */
        int f7956e;

        /* renamed from: f, reason: collision with root package name */
        int f7957f;

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
            parcel.writeInt(this.f7954c);
            parcel.writeInt(this.f7955d);
            parcel.writeInt(this.f7956e);
            parcel.writeInt(this.f7957f);
        }

        SavedState(Parcel parcel, a aVar) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.f7954c = parcel.readInt();
            this.f7955d = parcel.readInt();
            this.f7956e = parcel.readInt();
            this.f7957f = parcel.readInt();
        }
    }

    public OProgressView(Context context) {
        this(context, null);
    }

    private int a(float f2) {
        return (int) (f2 * Resources.getSystem().getDisplayMetrics().density);
    }

    private void b() {
        if (this.n != 0) {
            this.l = ContextCompat.getColor(getContext(), this.n);
        }
        if (this.o != 0) {
            this.m = ContextCompat.getColor(getContext(), this.o);
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
        float[] fArr;
        float[] fArr2;
        super.onDraw(canvas);
        if (this.a == null) {
            this.a = new Paint();
        }
        this.a.reset();
        this.a.setStyle(Paint.Style.FILL);
        this.a.setAntiAlias(true);
        float height = getHeight();
        float f2 = (height - this.f7953g) / 2.0f;
        if (this.b == null) {
            this.b = new RectF();
        }
        float f3 = height - f2;
        this.b.set(0.0f, f2, getWidth(), f3);
        if (this.f7949c == null) {
            this.f7949c = new RectF();
        }
        this.f7949c.set(0.0f, f2, (getWidth() * this.k) / 100.0f, f3);
        if (this.f7950d == null) {
            this.f7950d = new RectF();
        }
        float width = getWidth() / 2;
        float height2 = getHeight() / 2;
        this.f7950d.set(width, height2, width, height2);
        this.a.setColor(this.m);
        RectF rectF = this.b;
        float f4 = this.f7951e;
        canvas.drawRoundRect(rectF, f4, f4, this.a);
        this.a.setColor(this.l);
        if (this.k == 100) {
            RectF rectF2 = this.f7949c;
            float f5 = this.f7951e;
            canvas.drawRoundRect(rectF2, f5, f5, this.a);
        } else {
            if (Build.VERSION.SDK_INT < 29 || (fArr = this.h) == null || (fArr2 = this.i) == null) {
                return;
            }
            canvas.drawDoubleRoundRect(this.f7949c, fArr, this.f7950d, fArr2, this.a);
        }
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
        this.n = savedState.f7954c;
        this.o = savedState.f7955d;
        this.l = savedState.f7956e;
        this.m = savedState.f7957f;
        b();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.j;
        savedState.b = this.k;
        savedState.f7954c = this.n;
        savedState.f7955d = this.o;
        savedState.f7956e = this.l;
        savedState.f7957f = this.m;
        return savedState;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.o = 0;
        this.m = i;
        invalidate();
    }

    public void setProgress(int i) {
        if (this.k == i) {
            return;
        }
        if (i <= 0) {
            i = 0;
        } else if (i >= 100) {
            i = 100;
        }
        this.k = i;
        invalidate();
    }

    public void setProgressColor(int i) {
        this.n = 0;
        this.l = i;
        invalidate();
    }

    public void setSize(int i) {
        if (i == 0) {
            this.f7953g = a(4.0f);
        } else if (i != 2) {
            this.f7953g = a(6.0f);
        } else {
            this.f7953g = a(8.0f);
        }
        this.f7951e = a(99.0f);
        float a2 = a(40.0f);
        this.f7952f = a2;
        float f2 = this.f7951e;
        this.h = new float[]{f2, f2, a2, a2, a2, a2, f2, f2};
        if (this.i == null) {
            this.i = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        this.j = i;
        invalidate();
    }

    public OProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.n = 0;
        this.o = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.A, i, 0);
        int i2 = obtainStyledAttributes.getInt(3, 1);
        this.k = obtainStyledAttributes.getInt(1, 0);
        this.n = obtainStyledAttributes.getResourceId(2, C0838R.color.oui_fill_highlighted);
        this.o = obtainStyledAttributes.getResourceId(0, C0838R.color.oui_line_2);
        b();
        obtainStyledAttributes.recycle();
        setSize(i2);
    }
}
