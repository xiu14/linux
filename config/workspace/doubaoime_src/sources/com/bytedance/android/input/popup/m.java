package com.bytedance.android.input.popup;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;

/* loaded from: classes.dex */
public class m extends o {
    private Context i;
    private View j;
    private LinearLayout k;
    private ImageView l;
    private TextView m;
    private Button n;
    private ImageButton o;

    public m(Context context, WindowId windowId, int i) {
        super(context, windowId, i);
        this.i = context;
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        View E = aVar.E(context, C0838R.layout.popup_tip);
        this.j = E;
        this.k = (LinearLayout) E.findViewById(C0838R.id.layout_popup_container);
        if (aVar.K() && !KeyboardJni.isFloatingMode()) {
            this.k.setBackgroundResource(C0838R.drawable.input_popup_tip_bg_transparent);
            com.bytedance.common_biz.ui.utils.b bVar = com.bytedance.common_biz.ui.utils.b.a;
            com.bytedance.common_biz.ui.utils.b.d(this.k, 24);
        }
        this.l = (ImageView) this.j.findViewById(C0838R.id.popup_left_btn);
        this.m = (TextView) this.j.findViewById(C0838R.id.popup_content_text);
        this.n = (Button) this.j.findViewById(C0838R.id.popup_action_btn);
        this.o = (ImageButton) this.j.findViewById(C0838R.id.popup_right_btn);
        setContentView(this.j);
        setBackgroundDrawable(null);
        h(0, ((int) this.i.getResources().getDimension(C0838R.dimen.guide_popup_window_height)) * (-1));
    }

    public void k(View.OnClickListener onClickListener) {
        this.n.setOnClickListener(onClickListener);
    }

    public void l(String str) {
        this.n.setText(str);
    }

    public void m(String str) {
        this.m.setText(str);
        this.m.setGravity(17);
    }

    public void n(boolean z) {
        if (z) {
            this.n.setVisibility(8);
        } else {
            this.n.setVisibility(0);
        }
    }

    public void o(boolean z) {
        if (z) {
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(0);
        }
    }

    public void p(int i) {
        this.l.setImageResource(i);
    }

    public void q(View.OnClickListener onClickListener) {
        this.o.setOnClickListener(onClickListener);
    }
}
