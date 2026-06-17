package com.bytedance.android.input.fragment.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.common_biz.ui.widget.ImeStepSlider;
import java.util.Objects;

/* loaded from: classes.dex */
public final class KeyboardLayoutCandidateFontView extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2397c = 0;
    private ImeStepSlider a;
    private AppCompatTextView b;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.q<Integer, String, Boolean, kotlin.o> {
        a() {
            super(3);
        }

        @Override // kotlin.s.b.q
        public kotlin.o d(Integer num, String str, Boolean bool) {
            int intValue = num.intValue();
            bool.booleanValue();
            kotlin.s.c.l.f(str, "text");
            KeyboardLayoutCandidateFontView keyboardLayoutCandidateFontView = KeyboardLayoutCandidateFontView.this;
            String j = e.a.a.a.a.j("setOnStepChangedListener index: ", intValue);
            int i = KeyboardLayoutCandidateFontView.f2397c;
            Objects.requireNonNull(keyboardLayoutCandidateFontView);
            com.bytedance.android.input.r.j.i("KeyboardLayoutCandidateFontView", j);
            Objects.requireNonNull(KeyboardLayoutCandidateFontView.this);
            int i2 = 19;
            if (intValue == 0) {
                i2 = 13;
            } else if (intValue == 1) {
                i2 = 15;
            } else if (intValue == 2) {
                i2 = 17;
            } else if (intValue == 4) {
                i2 = 21;
            } else if (intValue == 5) {
                i2 = 23;
            } else if (intValue == 6) {
                i2 = 25;
            }
            KeyboardLayoutCandidateFontView.a(KeyboardLayoutCandidateFontView.this, i2);
            String string = KeyboardLayoutCandidateFontView.this.getContext().getString(C0838R.string.candidate_font_size);
            kotlin.s.c.l.e(string, "context.getString(R.string.candidate_font_size)");
            SettingsConfigNext.l(string, Integer.valueOf(i2));
            return kotlin.o.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardLayoutCandidateFontView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    public static final void a(KeyboardLayoutCandidateFontView keyboardLayoutCandidateFontView, int i) {
        AppCompatTextView appCompatTextView = keyboardLayoutCandidateFontView.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextSize(1, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.fragment.settings.KeyboardLayoutCandidateFontView.b():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImeStepSlider imeStepSlider = this.a;
        if (imeStepSlider != null) {
            imeStepSlider.setOnStepChangedListener(new a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardLayoutCandidateFontView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object J2;
        kotlin.s.c.l.f(context, "context");
        com.bytedance.android.input.r.j.i("KeyboardLayoutCandidateFontView", "initUiView start");
        try {
            LayoutInflater.from(context).inflate(C0838R.layout.layout_settings_candidate_font_change, this);
            b();
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.v0("initUiView onFailure exception = ", b, "KeyboardLayoutCandidateFontView");
        }
    }
}
