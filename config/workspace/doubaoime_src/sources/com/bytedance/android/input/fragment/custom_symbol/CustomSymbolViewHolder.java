package com.bytedance.android.input.fragment.custom_symbol;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.fragment.custom_symbol.ui.CompatSymbolEditText;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class CustomSymbolViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2303g = 0;
    private LinearLayout a;
    private ImageView b;

    /* renamed from: c, reason: collision with root package name */
    private CompatSymbolEditText f2304c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f2305d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f2306e;

    /* renamed from: f, reason: collision with root package name */
    private final float f2307f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSymbolViewHolder(View view) {
        super(view);
        l.f(view, "itemView");
        this.f2307f = view.getContext().getResources().getDimension(C0838R.dimen.ime_dp_75);
        this.a = (LinearLayout) view.findViewById(C0838R.id.custom_symbol_item_layout);
        this.b = (ImageView) view.findViewById(C0838R.id.custom_symbol_item_iv_delete_tip);
        this.f2304c = (CompatSymbolEditText) view.findViewById(C0838R.id.custom_symbol_item_et);
        this.f2305d = (ImageView) view.findViewById(C0838R.id.custom_symbol_item_iv_drag);
        this.f2306e = (LinearLayout) view.findViewById(C0838R.id.custom_symbol_item_delete_layout);
    }

    public final void a(boolean z, boolean z2) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationX;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationX2;
        ViewPropertyAnimator duration2;
        float f2 = z ? -this.f2307f : 0.0f;
        float f3 = z ? 0.0f : this.f2307f;
        long j = z2 ? 0L : 300L;
        LinearLayout linearLayout = this.a;
        if (linearLayout != null && (animate2 = linearLayout.animate()) != null && (translationX2 = animate2.translationX(f2)) != null && (duration2 = translationX2.setDuration(j)) != null) {
            duration2.start();
        }
        LinearLayout linearLayout2 = this.f2306e;
        if (linearLayout2 == null || (animate = linearLayout2.animate()) == null || (translationX = animate.translationX(f3)) == null || (duration = translationX.setDuration(j)) == null) {
            return;
        }
        duration.start();
    }

    public final void b(final com.bytedance.android.input.fragment.custom_symbol.m.a aVar, int i) {
        l.f(aVar, "symbolItem");
        String str = "position = " + i + ", symbolText = " + aVar.c() + ", this = " + this;
        l.f(str, "msg");
        IAppGlobals.a.j("[custom_symbol]", str);
        CompatSymbolEditText compatSymbolEditText = this.f2304c;
        if (compatSymbolEditText != null) {
            compatSymbolEditText.setPrivateImeOptions("private_option_ime_symbol_keyboard");
        }
        final CompatSymbolEditText compatSymbolEditText2 = this.f2304c;
        if (compatSymbolEditText2 != null) {
            compatSymbolEditText2.post(new Runnable() { // from class: com.bytedance.android.input.fragment.custom_symbol.a
                @Override // java.lang.Runnable
                public final void run() {
                    CompatSymbolEditText compatSymbolEditText3 = CompatSymbolEditText.this;
                    com.bytedance.android.input.fragment.custom_symbol.m.a aVar2 = aVar;
                    CustomSymbolViewHolder customSymbolViewHolder = this;
                    int i2 = CustomSymbolViewHolder.f2303g;
                    l.f(compatSymbolEditText3, "$et");
                    l.f(aVar2, "$symbolItem");
                    l.f(customSymbolViewHolder, "this$0");
                    compatSymbolEditText3.setText(kotlin.text.a.U(aVar2.c()).toString());
                    customSymbolViewHolder.f(aVar2, compatSymbolEditText3, false);
                }
            });
            if (aVar.a()) {
                compatSymbolEditText2.setShowSoftInputOnFocus(true);
                compatSymbolEditText2.requestFocus();
                compatSymbolEditText2.requestFocusFromTouch();
                aVar.f(false);
                compatSymbolEditText2.postDelayed(new Runnable() { // from class: com.bytedance.android.input.fragment.custom_symbol.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputMethodManager inputMethodManager;
                        CompatSymbolEditText compatSymbolEditText3 = CompatSymbolEditText.this;
                        int i2 = CustomSymbolViewHolder.f2303g;
                        l.f(compatSymbolEditText3, "$et");
                        Context context = compatSymbolEditText3.getContext();
                        if (context == null || !(context instanceof Activity) || com.bytedance.android.input.basic.d.e.a((Activity) context) || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
                            return;
                        }
                        inputMethodManager.toggleSoftInput(2, 0);
                    }
                }, 100L);
            }
        }
        if (aVar.b()) {
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f2305d;
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.b;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f2305d;
        if (imageView4 == null) {
            return;
        }
        imageView4.setVisibility(0);
    }

    public final LinearLayout c() {
        return this.f2306e;
    }

    public final CompatSymbolEditText d() {
        return this.f2304c;
    }

    public final ImageView e() {
        return this.b;
    }

    public final void f(final com.bytedance.android.input.fragment.custom_symbol.m.a aVar, final AppCompatEditText appCompatEditText, boolean z) {
        Object J2;
        l.f(aVar, "symbolItem");
        if (appCompatEditText != null) {
            try {
                if (z) {
                    appCompatEditText.setCursorVisible(false);
                    J2 = Boolean.valueOf(appCompatEditText.postDelayed(new Runnable() { // from class: com.bytedance.android.input.fragment.custom_symbol.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppCompatEditText appCompatEditText2 = AppCompatEditText.this;
                            com.bytedance.android.input.fragment.custom_symbol.m.a aVar2 = aVar;
                            int i = CustomSymbolViewHolder.f2303g;
                            l.f(appCompatEditText2, "$et");
                            l.f(aVar2, "$symbolItem");
                            appCompatEditText2.setSelection(aVar2.c().length());
                            appCompatEditText2.setCursorVisible(true);
                        }
                    }, 150L));
                } else {
                    appCompatEditText.setSelection(aVar.c().length());
                    J2 = o.a;
                }
            } catch (Throwable th) {
                J2 = r.J(th);
            }
        } else {
            J2 = null;
        }
        if (kotlin.h.b(J2) != null) {
            l.f("tryChangeSelection error", "msg");
            IAppGlobals.a.e("[custom_symbol]", "tryChangeSelection error");
        }
    }
}
