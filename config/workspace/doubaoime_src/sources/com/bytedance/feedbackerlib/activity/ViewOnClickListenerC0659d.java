package com.bytedance.feedbackerlib.activity;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.feedbackerlib.activity.FeedbackActivity;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.model.b;
import com.bytedance.feedbackerlib.view.CustomEditText;
import com.vivo.push.PushClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.feedbackerlib.activity.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class ViewOnClickListenerC0659d implements View.OnClickListener {
    final /* synthetic */ FeedbackActivity a;

    /* renamed from: com.bytedance.feedbackerlib.activity.d$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnClickListenerC0659d.this.a.b = true;
        }
    }

    /* renamed from: com.bytedance.feedbackerlib.activity.d$b */
    class b implements b.s {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* renamed from: com.bytedance.feedbackerlib.activity.d$b$a */
        class a implements Runnable {
            final /* synthetic */ String a;

            /* renamed from: com.bytedance.feedbackerlib.activity.d$b$a$a, reason: collision with other inner class name */
            class ViewOnClickListenerC0224a implements View.OnClickListener {
                ViewOnClickListenerC0224a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TextView textView;
                    textView = ViewOnClickListenerC0659d.this.a.o;
                    textView.performClick();
                }
            }

            a(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                FrameLayout frameLayout;
                frameLayout = ViewOnClickListenerC0659d.this.a.w;
                frameLayout.setVisibility(8);
                com.bytedance.feedbackerlib.a.R("FeedbackActivity", "onUploadFinished, failed: " + this.a);
                String str = b.this.a;
                StringBuilder M = e.a.a.a.a.M("onUploadFinished, failed: ");
                M.append(this.a);
                com.bytedance.feedbackerlib.a.l0(str, M.toString(), new String[0]);
                if (!"create native uploader fail".equals(this.a)) {
                    FeedbackActivity.B(ViewOnClickListenerC0659d.this.a, this.a, new ViewOnClickListenerC0224a());
                } else {
                    FeedbackActivity feedbackActivity = ViewOnClickListenerC0659d.this.a;
                    FeedbackActivity.b0(feedbackActivity, feedbackActivity.f4765d.f("sdk20"));
                }
            }
        }

        b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.bytedance.feedbackerlib.model.b.s
        @RequiresApi(api = 21)
        public void a(int i, @Nullable String str, List<String> list, List<String> list2) {
            boolean z;
            Handler handler;
            long j;
            if (i != 1) {
                FeedbackActivity.C(ViewOnClickListenerC0659d.this.a, list, list2, this.b, this.a);
                return;
            }
            a aVar = new a(str);
            z = ViewOnClickListenerC0659d.this.a.b;
            if (z) {
                aVar.run();
                return;
            }
            handler = FeedbackActivity.S;
            long currentTimeMillis = System.currentTimeMillis();
            j = ViewOnClickListenerC0659d.this.a.a;
            handler.postDelayed(aVar, 800 - (currentTimeMillis - j));
        }
    }

    ViewOnClickListenerC0659d(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // android.view.View.OnClickListener
    @RequiresApi(api = 21)
    public void onClick(View view) {
        FeedbackActivity.f fVar;
        FeedbackActivity.f fVar2;
        FeedbackActivity.f fVar3;
        FeedbackActivity.f fVar4;
        FeedbackActivity.f fVar5;
        FeedbackActivity.f fVar6;
        CustomEditText customEditText;
        CustomEditText customEditText2;
        String obj;
        TextView textView;
        FrameLayout frameLayout;
        Handler handler;
        com.bytedance.feedbackerlib.model.b bVar;
        FeedbackActivity.f fVar7;
        FeedbackActivity.f fVar8;
        FeedbackActivity.f fVar9;
        fVar = this.a.f4763J;
        if (fVar.e() == null) {
            FeedbackActivity feedbackActivity = this.a;
            FeedbackActivity.b0(feedbackActivity, feedbackActivity.f4765d.f("sdk15"));
            return;
        }
        fVar2 = this.a.f4763J;
        if (fVar2.e().equals("0")) {
            fVar7 = this.a.D;
            if (fVar7.e() == null) {
                FeedbackActivity feedbackActivity2 = this.a;
                FeedbackActivity.b0(feedbackActivity2, feedbackActivity2.f4765d.f("sdk16"));
                return;
            }
            fVar8 = this.a.E;
            if (fVar8.e() == null) {
                FeedbackActivity feedbackActivity3 = this.a;
                FeedbackActivity.b0(feedbackActivity3, feedbackActivity3.f4765d.f("sdk17"));
                return;
            } else {
                fVar9 = this.a.K;
                if (fVar9.e() == null) {
                    FeedbackActivity feedbackActivity4 = this.a;
                    FeedbackActivity.b0(feedbackActivity4, feedbackActivity4.f4765d.f("key_please_select_priori"));
                    return;
                }
            }
        } else {
            fVar3 = this.a.f4763J;
            if (fVar3.e().equals(PushClient.DEFAULT_REQUEST_ID)) {
                fVar6 = this.a.L;
                if (fVar6.e() == null) {
                    FeedbackActivity.b0(this.a, "请选择模块");
                    return;
                }
            } else {
                fVar4 = this.a.f4763J;
                if (fVar4.e().equals("7")) {
                    fVar5 = this.a.M;
                    if (fVar5.e() == null) {
                        FeedbackActivity.b0(this.a, "请选择模块");
                        return;
                    }
                }
            }
        }
        customEditText = this.a.k;
        if (customEditText.getText() == null) {
            obj = "";
        } else {
            customEditText2 = this.a.k;
            obj = customEditText2.getText().toString();
        }
        if (obj.length() < 5) {
            FeedbackActivity feedbackActivity5 = this.a;
            FeedbackActivity.b0(feedbackActivity5, feedbackActivity5.f4765d.f("sdk_feedback_character_number_limited"));
            return;
        }
        String B = e.a.a.a.a.B(e.a.a.a.a.M("submitFeedback->"));
        String p = FeedbackActivity.p(this.a);
        if (TextUtils.isEmpty(p)) {
            com.bytedance.feedbackerlib.a.l0(B, "ssoEmail is null", new String[0]);
            com.bytedance.feedbackerlib.a.R("FeedbackActivity", "ssoEmail is null");
            this.a.g0();
            return;
        }
        if (this.a.O == null || this.a.O.size() <= 0) {
            FeedbackActivity.C(this.a, new ArrayList(), new ArrayList(), p, B);
            return;
        }
        textView = this.a.x;
        textView.setText(this.a.f4765d.f("sdk19"));
        frameLayout = this.a.w;
        frameLayout.setVisibility(0);
        this.a.b = false;
        this.a.a = System.currentTimeMillis();
        handler = FeedbackActivity.S;
        handler.postDelayed(new a(), 800L);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.a.O.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Item) it2.next()).f4853c);
        }
        bVar = this.a.f4764c;
        bVar.Y(arrayList, new b(B, p), B);
    }
}
