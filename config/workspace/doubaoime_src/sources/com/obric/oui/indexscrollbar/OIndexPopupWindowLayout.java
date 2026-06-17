package com.obric.oui.indexscrollbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes2.dex */
public final class OIndexPopupWindowLayout extends LinearLayout {
    private PopupWindow a;
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f7799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OIndexPopupWindowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0838R.layout.o_index_scrollbar_popup_circle, (ViewGroup) null);
        this.b = (TextView) inflate.findViewById(C0838R.id.popup_text);
        this.f7799c = (ImageView) inflate.findViewById(C0838R.id.popup_img);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, false);
        this.a = popupWindow;
        if (popupWindow != null) {
            popupWindow.setBackgroundDrawable(getResources().getDrawable(C0838R.drawable.o_index_popup_background));
        }
    }

    public final void a() {
        PopupWindow popupWindow;
        PopupWindow popupWindow2 = this.a;
        if (popupWindow2 == null || !popupWindow2.isShowing() || (popupWindow = this.a) == null) {
            return;
        }
        popupWindow.dismiss();
    }

    public final void b(String str, Bitmap bitmap, int i, int i2) {
        kotlin.s.c.l.f(str, "letter");
        if (bitmap == null) {
            TextView textView = this.b;
            if (textView != null) {
                textView.setText(str);
            }
            ImageView imageView = this.f7799c;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView2 = this.b;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else {
            TextView textView3 = this.b;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            ImageView imageView2 = this.f7799c;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.f7799c;
            if (imageView3 != null) {
                imageView3.setImageBitmap(bitmap);
            }
        }
        PopupWindow popupWindow = this.a;
        if (popupWindow == null || popupWindow.isShowing()) {
            PopupWindow popupWindow2 = this.a;
            if (popupWindow2 != null) {
                popupWindow2.update(i, i2, -2, -2);
                return;
            }
            return;
        }
        PopupWindow popupWindow3 = this.a;
        if (popupWindow3 != null) {
            popupWindow3.showAtLocation(this, 0, i, i2);
        }
    }
}
