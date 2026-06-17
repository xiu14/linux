package com.bytedance.feedbackerlib.activity;

import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.feedbackerlib.service.FloatWindowService;

/* loaded from: classes.dex */
class K implements View.OnClickListener {
    final /* synthetic */ LarkSSOLaunchTransitionActivity a;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            TextView textView2;
            String f2 = K.this.a.a.f("sso_network_request_failed");
            if (com.bytedance.android.input.k.b.a.G(f2, "no translation")) {
                textView = K.this.a.j;
                textView.setText("网络较差，努力加载中");
            } else {
                textView2 = K.this.a.j;
                textView2.setText(f2);
            }
        }
    }

    K(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity) {
        this.a = larkSSOLaunchTransitionActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TextView textView;
        LinearLayout linearLayout;
        String B = e.a.a.a.a.B(e.a.a.a.a.M("sso_h5_on_click->"));
        com.bytedance.feedbackerlib.a.j0(B, "mSSOH5TV onClick", new String[0]);
        textView = this.a.j;
        textView.setText(this.a.a.f("sso_retrying"));
        linearLayout = this.a.i;
        linearLayout.setVisibility(0);
        FloatWindowService.t(false);
        FloatWindowService.h(this.a.getApplicationContext(), true, true, B);
        Message obtain = Message.obtain(LarkSSOLaunchTransitionActivity.o, new a());
        obtain.what = 2;
        LarkSSOLaunchTransitionActivity.o.sendMessageDelayed(obtain, 1000L);
        LarkSSOLaunchTransitionActivity.l(this.a);
    }
}
