package com.bytedance.android.input.popup;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.CustomToolbar.CustomToolbarPagerController;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k extends o {
    private View i;
    private int j;

    public k(Context context, WindowId windowId, int i, int i2) {
        super(context, windowId, i);
        this.j = 0;
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        this.i = aVar.E(context, i2);
        String toolbarConfig = KeyboardJni.getKeyboardJni().getToolbarConfig();
        e.a.a.a.a.r0("initViews, configJson: ", toolbarConfig, "CustomPopupWindow");
        if (toolbarConfig != null) {
            try {
                if (!toolbarConfig.isEmpty()) {
                    this.j = new JSONObject(toolbarConfig).optInt("alignment", 0) == 1 ? 1 : 0;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        new CustomToolbarPagerController(context, (ViewPager2) this.i.findViewById(C0838R.id.viewPager), (LinearLayout) this.i.findViewById(C0838R.id.indicatorLayout), toolbarConfig).b();
        TextView textView = (TextView) this.i.findViewById(C0838R.id.tabLeft);
        final TextView textView2 = (TextView) this.i.findViewById(C0838R.id.tabRight);
        m();
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.popup.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.this.k(textView2, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.popup.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.this.l(view);
            }
        });
        setContentView(this.i);
        setBackgroundDrawable(null);
        setWidth(-1);
        setHeight(-2);
    }

    private void m() {
        TextView textView = (TextView) this.i.findViewById(C0838R.id.tabLeft);
        TextView textView2 = (TextView) this.i.findViewById(C0838R.id.tabRight);
        if (this.j == 0) {
            textView.setBackgroundResource(C0838R.drawable.tab_left_selected);
            textView2.setBackground(null);
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            textView.setTextColor(aVar.l(this.h, C0838R.color.custom_toolbar_selected_text));
            Objects.requireNonNull(aVar);
            textView2.setTextColor(aVar.l(this.h, C0838R.color.custom_toolbar_text));
            return;
        }
        textView2.setBackgroundResource(C0838R.drawable.tab_left_selected);
        textView.setBackground(null);
        IAppGlobals.a aVar2 = IAppGlobals.a;
        Objects.requireNonNull(aVar2);
        textView.setTextColor(aVar2.l(this.h, C0838R.color.custom_toolbar_text));
        Objects.requireNonNull(aVar2);
        textView2.setTextColor(aVar2.l(this.h, C0838R.color.custom_toolbar_selected_text));
    }

    public /* synthetic */ void k(TextView textView, View view) {
        textView.setBackground(null);
        if (this.j != 0) {
            this.j = 0;
            KeyboardJni.getKeyboardJni().setToolbarAlignment(this.j);
            m();
        }
    }

    public /* synthetic */ void l(View view) {
        if (this.j != 1) {
            this.j = 1;
            KeyboardJni.getKeyboardJni().setToolbarAlignment(this.j);
            m();
        }
    }
}
