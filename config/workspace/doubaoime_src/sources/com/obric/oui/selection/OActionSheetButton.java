package com.obric.oui.selection;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.layout.OUIFrameLayout;
import com.obric.oui.text.OTextView;
import e.i.b.c.b.e;
import kotlin.s.c.l;

@RequiresApi(30)
/* loaded from: classes2.dex */
public final class OActionSheetButton extends OUIFrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public OTextView f7989g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OActionSheetButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, null, 12);
        l.f(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LayoutInflater.from(getContext()).inflate(C0838R.layout.o_listitem_button, this);
        ViewParent viewParent = (ViewGroup) findViewById(C0838R.id.ll_root);
        e eVar = (e) ((viewParent == null || !(viewParent instanceof e)) ? null : viewParent);
        if (eVar != null) {
            eVar.setChangeAlphaWhenPress(false);
        }
        View findViewById = findViewById(C0838R.id.tv_content_title);
        l.e(findViewById, "findViewById(R.id.tv_content_title)");
        this.f7989g = (OTextView) findViewById;
        setRadius((int) getResources().getDimension(C0838R.dimen.oui_r_l3_rect));
        setChangeAlphaWhenDisable(false);
    }

    public final void setText(String str) {
        l.f(str, "str");
        OTextView oTextView = this.f7989g;
        if (oTextView != null) {
            oTextView.setText(str);
        } else {
            l.l("tvTitle");
            throw null;
        }
    }

    public final void setTextColor(@ColorInt int i) {
        OTextView oTextView = this.f7989g;
        if (oTextView != null) {
            oTextView.setTextColor(i);
        } else {
            l.l("tvTitle");
            throw null;
        }
    }

    public final void setTvTitle(OTextView oTextView) {
        l.f(oTextView, "<set-?>");
        this.f7989g = oTextView;
    }
}
