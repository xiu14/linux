package com.bytedance.praisedialoglib.ui;

import android.view.View;
import com.bytedance.praisedialoglib.manager.d;

/* loaded from: classes.dex */
class c implements View.OnClickListener {
    final /* synthetic */ PraiseDialogActivity a;

    c(PraiseDialogActivity praiseDialogActivity) {
        this.a = praiseDialogActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        str = this.a.h;
        com.bytedance.feedbackerlib.a.q0("evaluate_pop_bad", str);
        this.a.i = true;
        this.a.finish();
        d.h().j();
    }
}
