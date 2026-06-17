package com.bytedance.feedbackerlib.activity;

import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.feedbackerlib.service.FloatWindowService;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
class J implements View.OnClickListener {
    final /* synthetic */ LarkSSOLaunchTransitionActivity a;

    class a implements Runnable {
        final /* synthetic */ String a;

        a(J j, String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            HashMap hashMap;
            String str;
            List<String> c2 = com.bytedance.feedbackerlib.model.j.b.d().c();
            String str2 = this.a;
            com.bytedance.framwork.core.sdkmonitor.f b = com.bytedance.feedbackerlib.manager.z.b();
            if (b != null) {
                try {
                    hashMap = new HashMap();
                    hashMap.put("sso_retry_log_id", str2);
                } catch (Throwable th) {
                    th.printStackTrace();
                    jSONObject = null;
                }
                if (c2 != null && c2.size() > 0) {
                    Object[] array = c2.toArray();
                    int size = c2.size();
                    if (array == null) {
                        str = null;
                    } else {
                        int i = size + 0;
                        if (i > 0) {
                            StringBuilder sb = new StringBuilder(i * 16);
                            for (int i2 = 0; i2 < size; i2++) {
                                if (i2 > 0) {
                                    sb.append(',');
                                }
                                if (array[i2] != null) {
                                    sb.append(array[i2]);
                                }
                            }
                            str = sb.toString();
                        }
                    }
                    hashMap.put("error_infos", str);
                    jSONObject = new JSONObject(new Gson().j(hashMap));
                    b.T("sso_retry_click_failed", 0, new JSONObject(), null, jSONObject);
                    b.y();
                }
                str = "";
                hashMap.put("error_infos", str);
                jSONObject = new JSONObject(new Gson().j(hashMap));
                b.T("sso_retry_click_failed", 0, new JSONObject(), null, jSONObject);
                b.y();
            }
            com.bytedance.feedbackerlib.manager.z.a();
            com.bytedance.feedbackerlib.model.j.b.d().b();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            TextView textView2;
            String f2 = J.this.a.a.f("sso_network_request_failed");
            if (com.bytedance.android.input.k.b.a.G(f2, "no translation")) {
                textView = J.this.a.j;
                textView.setText("网络较差，努力加载中");
            } else {
                textView2 = J.this.a.j;
                textView2.setText(f2);
            }
        }
    }

    J(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity) {
        this.a = larkSSOLaunchTransitionActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TextView textView;
        LinearLayout linearLayout;
        textView = this.a.j;
        textView.setText(this.a.a.f("sso_retrying"));
        linearLayout = this.a.i;
        linearLayout.setVisibility(0);
        StringBuilder sb = new StringBuilder();
        sb.append("sso_retry_on_click->");
        String B = e.a.a.a.a.B(sb);
        com.bytedance.feedbackerlib.a.j0(B, "mSSORetryTV.onClick", new String[0]);
        if (LarkSSOLaunchTransitionActivity.y(this.a)) {
            com.bytedance.feedbackerlib.a.j0(B, "finishSelfAfter2SecondsIfSSOVerified", new String[0]);
            return;
        }
        FloatWindowService.t(false);
        FloatWindowService.g(this.a.getApplicationContext(), B);
        Message obtain = Message.obtain(LarkSSOLaunchTransitionActivity.o, new a(this, B));
        obtain.what = 1;
        LarkSSOLaunchTransitionActivity.o.sendMessageDelayed(obtain, 2000L);
        Message obtain2 = Message.obtain(LarkSSOLaunchTransitionActivity.o, new b());
        obtain2.what = 2;
        LarkSSOLaunchTransitionActivity.o.sendMessageDelayed(obtain2, 1000L);
        LarkSSOLaunchTransitionActivity.l(this.a);
    }
}
