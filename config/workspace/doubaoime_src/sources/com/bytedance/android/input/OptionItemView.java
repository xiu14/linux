package com.bytedance.android.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.t;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class OptionItemView extends FrameLayout {
    private final ImageView a;
    private final ImageView b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f2019c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f2020d;

    /* renamed from: e, reason: collision with root package name */
    private float f2021e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2022f;

    /* renamed from: g, reason: collision with root package name */
    private String f2023g;
    private p<? super String, ? super Boolean, o> h;
    private kotlin.s.b.a<o> i;

    private static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        private boolean a;
        private String b;

        public static final class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                l.f(parcel, "source");
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.a;
        }

        public final void c(boolean z) {
            this.a = z;
        }

        public final void e(String str) {
            this.b = str;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            l.f(parcel, "out");
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
            parcel.writeString(this.b);
        }

        public SavedState(Parcel parcel, kotlin.s.c.g gVar) {
            super(parcel);
            this.a = parcel.readInt() == 1;
            this.b = parcel.readString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionItemView(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    public static void b(OptionItemView optionItemView, View view) {
        l.f(optionItemView, "this$0");
        optionItemView.f2022f = !optionItemView.f2022f;
        optionItemView.d();
        p<? super String, ? super Boolean, o> pVar = optionItemView.h;
        if (pVar != null) {
            pVar.invoke(optionItemView.f2023g, Boolean.valueOf(optionItemView.f2022f));
        }
    }

    public static void c(OptionItemView optionItemView, View view) {
        l.f(optionItemView, "this$0");
        kotlin.s.b.a<o> aVar = optionItemView.i;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final void d() {
        if (this.f2022f) {
            this.b.setImageResource(C0838R.drawable.ic_remove_circle_grey);
            this.b.setSelected(true);
        } else {
            this.b.setImageResource(C0838R.drawable.ic_add_circle);
            this.b.setSelected(false);
        }
    }

    public final boolean a() {
        return this.f2022f;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.f2020d;
        if (linearLayout == null) {
            l.l("column");
            throw null;
        }
        float width = linearLayout.getWidth();
        LinearLayout linearLayout2 = this.f2020d;
        if (linearLayout2 == null) {
            l.l("column");
            throw null;
        }
        float f2 = this.f2021e;
        float f3 = 0.0f;
        if (!(f2 == 1.0f) && width > 0.0f) {
            f3 = ((1.0f - f2) * width) / 2.0f;
        }
        linearLayout2.setTranslationX(f3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = (int) (getMeasuredHeight() * this.f2021e);
        if (measuredHeight < 1) {
            measuredHeight = 1;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2022f = savedState.b();
        String a = savedState.a();
        if (a == null) {
            a = "";
        }
        this.f2023g = a;
        d();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c(this.f2022f);
        savedState.e(this.f2023g);
        return savedState;
    }

    public final void setAdded(boolean z) {
        this.f2022f = z;
        d();
    }

    public final void setCompactScale(float f2) {
        this.f2021e = f2;
        LinearLayout linearLayout = this.f2020d;
        if (linearLayout == null) {
            l.l("column");
            throw null;
        }
        linearLayout.setPivotX(0.0f);
        LinearLayout linearLayout2 = this.f2020d;
        if (linearLayout2 == null) {
            l.l("column");
            throw null;
        }
        linearLayout2.setPivotY(0.0f);
        LinearLayout linearLayout3 = this.f2020d;
        if (linearLayout3 == null) {
            l.l("column");
            throw null;
        }
        linearLayout3.setScaleX(this.f2021e);
        LinearLayout linearLayout4 = this.f2020d;
        if (linearLayout4 == null) {
            l.l("column");
            throw null;
        }
        linearLayout4.setScaleY(this.f2021e);
        requestLayout();
    }

    public final void setIcon(int i) {
        this.a.setImageResource(i);
    }

    public final void setIdKey(String str) {
        l.f(str, "<set-?>");
        this.f2023g = str;
    }

    public final void setLabel(String str) {
        l.f(str, "text");
        this.f2019c.setText(str);
    }

    public final void setOnAddRemoveToggle(p<? super String, ? super Boolean, o> pVar) {
        this.h = pVar;
    }

    public final void setOnItemClick(kotlin.s.b.a<o> aVar) {
        this.i = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.f2021e = 1.0f;
        String str = "";
        this.f2023g = "";
        LayoutInflater.from(context).inflate(C0838R.layout.option_item_view, (ViewGroup) this, true);
        View findViewById = findViewById(C0838R.id.iconImage);
        l.e(findViewById, "findViewById(R.id.iconImage)");
        ImageView imageView = (ImageView) findViewById;
        this.a = imageView;
        View findViewById2 = findViewById(C0838R.id.actionButton);
        l.e(findViewById2, "findViewById(R.id.actionButton)");
        ImageView imageView2 = (ImageView) findViewById2;
        this.b = imageView2;
        View findViewById3 = findViewById(C0838R.id.labelText);
        l.e(findViewById3, "findViewById(R.id.labelText)");
        this.f2019c = (TextView) findViewById3;
        View findViewById4 = findViewById(C0838R.id.column);
        l.e(findViewById4, "findViewById(R.id.column)");
        this.f2020d = (LinearLayout) findViewById4;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f2018c, 0, 0);
            l.e(obtainStyledAttributes, "context.obtainStyledAttr…ble.OptionItemView, 0, 0)");
            try {
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    l.e(string, "typedArray.getString(R.s…tionItemView_idKey) ?: \"\"");
                    str = string;
                }
                this.f2023g = str;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.android.input.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionItemView.b(OptionItemView.this, view);
            }
        };
        imageView.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        findViewById(C0838R.id.root).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionItemView.c(OptionItemView.this, view);
            }
        });
        d();
    }
}
