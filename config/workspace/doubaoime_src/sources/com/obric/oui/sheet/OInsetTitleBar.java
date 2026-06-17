package com.obric.oui.sheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.titlebar.OTitleBar;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OInsetTitleBar extends OTitleBar {
    private ImageView b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f8019c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f8020d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f8021e;

    /* renamed from: f, reason: collision with root package name */
    private View f8022f;

    public OInsetTitleBar(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageView imageView = this.b;
        if (imageView != null) {
            com.obric.oui.common.util.b.c(imageView, e.i.a.b.a.c(40), e.i.a.b.a.c(44), false, 4);
        }
        ImageView imageView2 = this.f8019c;
        if (imageView2 != null) {
            com.obric.oui.common.util.b.c(imageView2, e.i.a.b.a.c(40), e.i.a.b.a.c(44), false, 4);
        }
        ImageView imageView3 = this.f8021e;
        if (imageView3 != null) {
            com.obric.oui.common.util.b.c(imageView3, e.i.a.b.a.c(40), e.i.a.b.a.c(44), false, 4);
        }
        ImageView imageView4 = this.f8020d;
        if (imageView4 != null) {
            com.obric.oui.common.util.b.c(imageView4, e.i.a.b.a.c(40), e.i.a.b.a.c(44), false, 4);
        }
    }

    @Override // com.obric.oui.titlebar.OTitleBar
    public void setDividerLineBackground(int i) {
        View view = this.f8022f;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public final void setDrawables(int i, int i2, int i3, int i4) {
        setDrawables(i != 0 ? ContextCompat.getDrawable(getContext(), i) : null, i2 != 0 ? ContextCompat.getDrawable(getContext(), i2) : null, i3 != 0 ? ContextCompat.getDrawable(getContext(), i3) : null, i4 != 0 ? ContextCompat.getDrawable(getContext(), i4) : null);
    }

    public final void setMEnd0Color(int i) {
    }

    public final void setMEnd1Color(int i) {
    }

    public final void setMRightAction(FrameLayout frameLayout) {
        l.f(frameLayout, "<set-?>");
    }

    public final void setMStart0Color(int i) {
    }

    public final void setMStart1Color(int i) {
    }

    public final void setTint(int i, int i2, int i3, int i4) {
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setColorFilter(i);
        }
        ImageView imageView2 = this.f8019c;
        if (imageView2 != null) {
            imageView2.setColorFilter(i2);
        }
        ImageView imageView3 = this.f8021e;
        if (imageView3 != null) {
            imageView3.setColorFilter(i3);
        }
        ImageView imageView4 = this.f8020d;
        if (imageView4 != null) {
            imageView4.setColorFilter(i4);
        }
    }

    public OInsetTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OInsetTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        FrameLayout.inflate(context, C0838R.layout.o_view_inset_title_bar, this);
        this.b = (ImageView) findViewById(C0838R.id.iv_start_0);
        this.f8019c = (ImageView) findViewById(C0838R.id.iv_start_1);
        this.f8021e = (ImageView) findViewById(C0838R.id.iv_end_0);
        this.f8020d = (ImageView) findViewById(C0838R.id.iv_end_1);
        this.a = (TextView) findViewById(C0838R.id.title);
        View findViewById = findViewById(C0838R.id.fl_right_container);
        l.e(findViewById, "findViewById(R.id.fl_right_container)");
        this.f8022f = findViewById(C0838R.id.line);
        if (attributeSet != null) {
            Context context2 = getContext();
            l.e(context2, "context");
            int i2 = 0;
            TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, e.i.a.b.b.o, 0, 0);
            try {
                setTitle(obtainStyledAttributes.getString(0));
                setTitleColor(obtainStyledAttributes.getColor(1, ContextCompat.getColor(getContext(), C0838R.color.TextPrimary)));
                setTitleSizePixel(obtainStyledAttributes.getDimension(2, e.i.a.b.a.c(17)));
                int color = obtainStyledAttributes.getColor(3, ContextCompat.getColor(getContext(), C0838R.color.LinePrimary));
                boolean z = obtainStyledAttributes.getBoolean(4, false);
                View view = this.f8022f;
                if (view != null) {
                    if (!z) {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                }
                setDividerLineBackground(color);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void setDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            ImageView imageView2 = this.b;
            if (imageView2 != null) {
                imageView2.setOnClickListener(null);
            }
        } else {
            ImageView imageView3 = this.b;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
        }
        ImageView imageView4 = this.b;
        if (imageView4 != null) {
            imageView4.setImageDrawable(drawable);
        }
        if (drawable2 == null) {
            ImageView imageView5 = this.f8019c;
            if (imageView5 != null) {
                imageView5.setVisibility(4);
            }
            ImageView imageView6 = this.f8019c;
            if (imageView6 != null) {
                imageView6.setOnClickListener(null);
            }
        } else {
            ImageView imageView7 = this.f8019c;
            if (imageView7 != null) {
                imageView7.setVisibility(0);
            }
        }
        ImageView imageView8 = this.f8019c;
        if (imageView8 != null) {
            imageView8.setImageDrawable(drawable2);
        }
        if (drawable3 == null) {
            ImageView imageView9 = this.f8021e;
            if (imageView9 != null) {
                imageView9.setVisibility(4);
            }
            ImageView imageView10 = this.f8021e;
            if (imageView10 != null) {
                imageView10.setOnClickListener(null);
            }
        } else {
            ImageView imageView11 = this.f8021e;
            if (imageView11 != null) {
                imageView11.setVisibility(0);
            }
        }
        ImageView imageView12 = this.f8021e;
        if (imageView12 != null) {
            imageView12.setImageDrawable(drawable3);
        }
        if (drawable4 == null) {
            ImageView imageView13 = this.f8020d;
            if (imageView13 != null) {
                imageView13.setVisibility(4);
            }
            ImageView imageView14 = this.f8020d;
            if (imageView14 != null) {
                imageView14.setOnClickListener(null);
            }
        } else {
            ImageView imageView15 = this.f8020d;
            if (imageView15 != null) {
                imageView15.setVisibility(0);
            }
        }
        ImageView imageView16 = this.f8020d;
        if (imageView16 != null) {
            imageView16.setImageDrawable(drawable4);
        }
    }
}
