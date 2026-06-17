package com.bytedance.feedbackerlib.activity;

import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.model.b;
import com.bytedance.feedbackerlib.receiver.DynamicReceiver;

/* loaded from: classes.dex */
class G implements b.r {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LarkSSOLaunchTransitionActivity f4773c;

    class a implements b.q {

        /* renamed from: com.bytedance.feedbackerlib.activity.G$a$a, reason: collision with other inner class name */
        class C0222a implements b.r {
            C0222a() {
            }

            @Override // com.bytedance.feedbackerlib.model.b.r
            public void a(int i, String str) {
                TextView textView;
                com.bytedance.feedbackerlib.a.j0(G.this.a, "onRequestFinished invoked", e.a.a.a.a.j("resultCode=", i), e.a.a.a.a.s("msg=", str));
                com.bytedance.feedbackerlib.a.R("LarkSSOLaunchTransition", "request user profile from server, resultCode: " + i + ", msg: " + str);
                if (i == 1) {
                    G g2 = G.this;
                    LarkSSOLaunchTransitionActivity.p(g2.f4773c, g2.b, g2.a);
                    return;
                }
                com.bytedance.feedbackerlib.model.j.e J2 = com.bytedance.feedbackerlib.model.b.F().J();
                if (J2 == null) {
                    com.bytedance.feedbackerlib.a.j0(G.this.a, "userProfileInfo==null", new String[0]);
                    G g3 = G.this;
                    LarkSSOLaunchTransitionActivity.p(g3.f4773c, g3.b, g3.a);
                    com.bytedance.feedbackerlib.manager.z.a();
                    return;
                }
                if (TextUtils.isEmpty(J2.b)) {
                    com.bytedance.feedbackerlib.a.j0(G.this.a, "email is empty", new String[0]);
                    G g4 = G.this;
                    LarkSSOLaunchTransitionActivity.p(g4.f4773c, g4.b, g4.a);
                    com.bytedance.feedbackerlib.manager.z.a();
                    return;
                }
                G.this.f4773c.f4778f.setText(G.this.f4773c.a.f("authority_success"));
                G.this.f4773c.f4778f.setEnabled(false);
                G.this.f4773c.f4778f.setVisibility(0);
                G.this.f4773c.f4778f.setBackgroundDrawable(ContextCompat.getDrawable(G.this.f4773c.getApplicationContext(), C0838R.drawable.background_sso_retry_unavailable));
                textView = G.this.f4773c.f4779g;
                com.bytedance.feedbackerlib.a.K0(textView, 0);
                com.bytedance.feedbackerlib.a.j0(G.this.a, "callback lark sso success", new String[0]);
                DynamicReceiver.b(G.this.f4773c.getApplicationContext(), G.this.a);
                LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity = G.this.f4773c;
                Toast.makeText(larkSSOLaunchTransitionActivity, larkSSOLaunchTransitionActivity.a.f("sso_verify_success"), 1).show();
                G.this.f4773c.A();
                com.bytedance.feedbackerlib.manager.z.a();
            }
        }

        a() {
        }

        @Override // com.bytedance.feedbackerlib.model.b.q
        public void a(@NonNull Boolean bool) {
            com.bytedance.feedbackerlib.a.j0(G.this.a, "onNetworkStateRequestFinish invoked", "isInternalNetwork=" + bool);
            com.bytedance.feedbackerlib.a.j0(G.this.a, "start request user profile from server", new String[0]);
            com.bytedance.feedbackerlib.model.b.F().U(bool.booleanValue(), new C0222a());
        }
    }

    G(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity, String str, String str2) {
        this.f4773c = larkSSOLaunchTransitionActivity;
        this.a = str;
        this.b = str2;
    }

    @Override // com.bytedance.feedbackerlib.model.b.r
    public void a(int i, String str) {
        com.bytedance.feedbackerlib.a.j0(this.a, "onRequestFinished invoked", "msg: " + str + ", resultCode: " + i);
        com.bytedance.feedbackerlib.a.R("LarkSSOLaunchTransition", "onRequestFinished: msg: " + str + ", resultCode: " + i);
        if (i != 1) {
            com.bytedance.feedbackerlib.a.j0(this.a, "start request network state from server", new String[0]);
            com.bytedance.feedbackerlib.model.b.F().Q(new a());
        } else {
            StringBuilder M = e.a.a.a.a.M("requestAccessCredentialsFromServer failed, code: ");
            M.append(this.b);
            com.bytedance.feedbackerlib.a.s("LarkSSOLaunchTransition", M.toString(), new RuntimeException());
            LarkSSOLaunchTransitionActivity.p(this.f4773c, this.b, this.a);
        }
    }
}
