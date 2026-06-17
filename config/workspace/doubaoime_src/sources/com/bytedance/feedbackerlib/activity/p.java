package com.bytedance.feedbackerlib.activity;

import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.feedbackerlib.model.b;
import java.util.List;

/* loaded from: classes.dex */
class p implements b.r {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f4789c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f4790d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ FeedbackActivity f4791e;

    class a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ String b;

        /* renamed from: com.bytedance.feedbackerlib.activity.p$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0225a implements View.OnClickListener {
            ViewOnClickListenerC0225a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                p pVar = p.this;
                FeedbackActivity.C(pVar.f4791e, pVar.a, pVar.b, pVar.f4789c, pVar.f4790d);
                com.bytedance.feedbackerlib.a.l0(p.this.f4790d, "uploadFailed_and_retry", new String[0]);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FrameLayout frameLayout;
                frameLayout = p.this.f4791e.w;
                frameLayout.setVisibility(8);
                FeedbackActivity.G(p.this.f4791e);
                FeedbackActivity.R(p.this.f4791e);
                p.this.f4791e.d0();
                p.this.f4791e.finish();
            }
        }

        a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            FrameLayout frameLayout;
            Handler handler;
            FrameLayout frameLayout2;
            if (this.a == 1) {
                com.bytedance.feedbackerlib.a.e0("upload_fail", null);
                frameLayout2 = p.this.f4791e.w;
                frameLayout2.setVisibility(8);
                FeedbackActivity.B(p.this.f4791e, this.b, new ViewOnClickListenerC0225a());
                return;
            }
            textView = p.this.f4791e.x;
            textView.setText(p.this.f4791e.f4765d.f("sdk_submit_feedback_succeed"));
            frameLayout = p.this.f4791e.w;
            frameLayout.setVisibility(0);
            com.bytedance.feedbackerlib.a.R("FeedbackActivity", "upload succeed");
            com.bytedance.feedbackerlib.a.l0(p.this.f4790d, "upload succeed", new String[0]);
            handler = FeedbackActivity.S;
            handler.postDelayed(new b(), 500L);
        }
    }

    p(FeedbackActivity feedbackActivity, List list, List list2, String str, String str2) {
        this.f4791e = feedbackActivity;
        this.a = list;
        this.b = list2;
        this.f4789c = str;
        this.f4790d = str2;
    }

    @Override // com.bytedance.feedbackerlib.model.b.r
    public void a(int i, String str) {
        boolean z;
        Handler handler;
        long j;
        a aVar = new a(i, str);
        z = this.f4791e.b;
        if (z) {
            aVar.run();
            return;
        }
        handler = FeedbackActivity.S;
        long currentTimeMillis = System.currentTimeMillis();
        j = this.f4791e.a;
        handler.postDelayed(aVar, 500 - (currentTimeMillis - j));
    }
}
