package com.bytedance.android.doubaoime.activity;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.FeedbackAssociateContentShownInUi;
import com.bytedance.android.input.common.FeedbackContentShownInUi;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.llm.LLMRequest;
import com.bytedance.android.input.speech.AsrContext;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;
import com.obric.oui.button.OButton;
import com.obric.oui.forms.OFormItem;
import com.obric.oui.forms.OInputView;
import com.obric.oui.lisitem.OListItemGeneral;
import com.obric.oui.oswitch.OSwitch;
import com.obric.oui.sectiontitlebar.OSectionTitleBar;
import com.obric.oui.segmentedtab.OTabSegmentedLayout;
import com.obric.oui.text.OTextView;
import com.ss.android.message.log.PushLog;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;
import kotlinx.coroutines.InterfaceC0817m0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class FeedbackActivity extends BaseSettingActivity {
    public static final /* synthetic */ int k = 0;
    private final List<a> a = new ArrayList();
    private final List<b> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<c> f1893c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private OFormItem f1894d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f1895e;

    /* renamed from: f, reason: collision with root package name */
    private ScrollView f1896f;

    /* renamed from: g, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f1897g;
    private List<? extends FeedbackContentShownInUi> h;
    private List<? extends FeedbackAssociateContentShownInUi> i;
    private boolean j;

    public static final class a {
        private final View a;
        private final OListItemGeneral b;

        /* renamed from: c, reason: collision with root package name */
        private final OListItemGeneral f1898c;

        /* renamed from: d, reason: collision with root package name */
        private final OListItemGeneral f1899d;

        /* renamed from: e, reason: collision with root package name */
        private final OFormItem f1900e;

        /* renamed from: f, reason: collision with root package name */
        private TextView f1901f;

        public a(View view, OListItemGeneral oListItemGeneral, OListItemGeneral oListItemGeneral2, OListItemGeneral oListItemGeneral3, OFormItem oFormItem, TextView textView) {
            kotlin.s.c.l.f(view, "groupRoot");
            kotlin.s.c.l.f(oListItemGeneral, "contextBefore");
            kotlin.s.c.l.f(oListItemGeneral2, "contextAfter");
            kotlin.s.c.l.f(oListItemGeneral3, "candidateListItem");
            kotlin.s.c.l.f(oFormItem, "expectInputView");
            this.a = view;
            this.b = oListItemGeneral;
            this.f1898c = oListItemGeneral2;
            this.f1899d = oListItemGeneral3;
            this.f1900e = oFormItem;
            this.f1901f = textView;
        }

        public final OListItemGeneral a() {
            return this.f1898c;
        }

        public final OListItemGeneral b() {
            return this.b;
        }

        public final TextView c() {
            return this.f1901f;
        }

        public final OFormItem d() {
            return this.f1900e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.s.c.l.a(this.a, aVar.a) && kotlin.s.c.l.a(this.b, aVar.b) && kotlin.s.c.l.a(this.f1898c, aVar.f1898c) && kotlin.s.c.l.a(this.f1899d, aVar.f1899d) && kotlin.s.c.l.a(this.f1900e, aVar.f1900e) && kotlin.s.c.l.a(this.f1901f, aVar.f1901f);
        }

        public int hashCode() {
            int hashCode = (this.f1900e.hashCode() + ((this.f1899d.hashCode() + ((this.f1898c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
            TextView textView = this.f1901f;
            return hashCode + (textView == null ? 0 : textView.hashCode());
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("AssociateFeedbackGroupViews(groupRoot=");
            M.append(this.a);
            M.append(", contextBefore=");
            M.append(this.b);
            M.append(", contextAfter=");
            M.append(this.f1898c);
            M.append(", candidateListItem=");
            M.append(this.f1899d);
            M.append(", expectInputView=");
            M.append(this.f1900e);
            M.append(", expectEmptyTipsView=");
            M.append(this.f1901f);
            M.append(')');
            return M.toString();
        }
    }

    public static final class b {
        private final View a;
        private final OListItemGeneral b;

        /* renamed from: c, reason: collision with root package name */
        private final OListItemGeneral f1902c;

        /* renamed from: d, reason: collision with root package name */
        private final OListItemGeneral f1903d;

        /* renamed from: e, reason: collision with root package name */
        private final OFormItem f1904e;

        /* renamed from: f, reason: collision with root package name */
        private TextView f1905f;

        public b(View view, OListItemGeneral oListItemGeneral, OListItemGeneral oListItemGeneral2, OListItemGeneral oListItemGeneral3, OFormItem oFormItem, TextView textView) {
            kotlin.s.c.l.f(view, "groupRoot");
            kotlin.s.c.l.f(oListItemGeneral, "contextItem");
            kotlin.s.c.l.f(oListItemGeneral2, "userInputItem");
            kotlin.s.c.l.f(oListItemGeneral3, "candidateListItem");
            kotlin.s.c.l.f(oFormItem, "expectInputView");
            this.a = view;
            this.b = oListItemGeneral;
            this.f1902c = oListItemGeneral2;
            this.f1903d = oListItemGeneral3;
            this.f1904e = oFormItem;
            this.f1905f = textView;
        }

        public final OListItemGeneral a() {
            return this.b;
        }

        public final TextView b() {
            return this.f1905f;
        }

        public final OFormItem c() {
            return this.f1904e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.s.c.l.a(this.a, bVar.a) && kotlin.s.c.l.a(this.b, bVar.b) && kotlin.s.c.l.a(this.f1902c, bVar.f1902c) && kotlin.s.c.l.a(this.f1903d, bVar.f1903d) && kotlin.s.c.l.a(this.f1904e, bVar.f1904e) && kotlin.s.c.l.a(this.f1905f, bVar.f1905f);
        }

        public int hashCode() {
            int hashCode = (this.f1904e.hashCode() + ((this.f1903d.hashCode() + ((this.f1902c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
            TextView textView = this.f1905f;
            return hashCode + (textView == null ? 0 : textView.hashCode());
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("InputFeedbackGroupViews(groupRoot=");
            M.append(this.a);
            M.append(", contextItem=");
            M.append(this.b);
            M.append(", userInputItem=");
            M.append(this.f1902c);
            M.append(", candidateListItem=");
            M.append(this.f1903d);
            M.append(", expectInputView=");
            M.append(this.f1904e);
            M.append(", expectEmptyTipsView=");
            M.append(this.f1905f);
            M.append(')');
            return M.toString();
        }
    }

    public static final class c {
        private final View a;
        private final OListItemGeneral b;

        /* renamed from: c, reason: collision with root package name */
        private final OListItemGeneral f1906c;

        public c(View view, OListItemGeneral oListItemGeneral, OListItemGeneral oListItemGeneral2) {
            kotlin.s.c.l.f(view, "groupRoot");
            kotlin.s.c.l.f(oListItemGeneral, "voiceResultItem");
            kotlin.s.c.l.f(oListItemGeneral2, "voiceTimeItem");
            this.a = view;
            this.b = oListItemGeneral;
            this.f1906c = oListItemGeneral2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.s.c.l.a(this.a, cVar.a) && kotlin.s.c.l.a(this.b, cVar.b) && kotlin.s.c.l.a(this.f1906c, cVar.f1906c);
        }

        public int hashCode() {
            return this.f1906c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("VoiceFeedbackGroupViews(groupRoot=");
            M.append(this.a);
            M.append(", voiceResultItem=");
            M.append(this.b);
            M.append(", voiceTimeItem=");
            M.append(this.f1906c);
            M.append(')');
            return M.toString();
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.doubaoime.activity.FeedbackActivity$initView$2$1$1", f = "FeedbackActivity.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.h<? extends InterfaceC0817m0>>, Object> {
        final /* synthetic */ String a;
        final /* synthetic */ FeedbackActivity b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OButton f1907c;

        @kotlin.r.h.a.e(c = "com.bytedance.android.doubaoime.activity.FeedbackActivity$initView$2$1$1$1$1", f = "FeedbackActivity.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
            final /* synthetic */ boolean a;
            final /* synthetic */ FeedbackActivity b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ OButton f1908c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z, FeedbackActivity feedbackActivity, OButton oButton, kotlin.r.d<? super a> dVar) {
                super(2, dVar);
                this.a = z;
                this.b = feedbackActivity;
                this.f1908c = oButton;
            }

            @Override // kotlin.r.h.a.a
            public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
                return new a(this.a, this.b, this.f1908c, dVar);
            }

            @Override // kotlin.s.b.p
            public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
                a aVar = new a(this.a, this.b, this.f1908c, dVar);
                kotlin.o oVar = kotlin.o.a;
                aVar.invokeSuspend(oVar);
                return oVar;
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                if (this.a) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    final FeedbackActivity feedbackActivity = this.b;
                    handler.postDelayed(new Runnable() { // from class: com.bytedance.android.doubaoime.activity.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            FeedbackActivity.this.j();
                        }
                    }, 1500L);
                } else {
                    com.obric.oui.toast.a.p.a(this.b, "提交失败，请重试！", 80);
                    this.f1908c.setEnabled(true);
                    this.f1908c.setText(this.b.getString(C0838R.string.commit_and_upload_log));
                }
                return kotlin.o.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, FeedbackActivity feedbackActivity, OButton oButton, kotlin.r.d<? super d> dVar) {
            super(2, dVar);
            this.a = str;
            this.b = feedbackActivity;
            this.f1907c = oButton;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new d(this.a, this.b, this.f1907c, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.h<? extends InterfaceC0817m0>> dVar) {
            return new d(this.a, this.b, this.f1907c, dVar).invokeSuspend(kotlin.o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            Object J2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            String str = this.a;
            FeedbackActivity feedbackActivity = this.b;
            OButton oButton = this.f1907c;
            try {
                LLMRequest lLMRequest = LLMRequest.a;
                kotlin.s.c.l.e(str, "bugDesc");
                boolean e2 = lLMRequest.e(str, null);
                com.bytedance.android.input.r.j.f3013f.q("feedback_others", 2);
                C0800f0 c0800f0 = C0800f0.a;
                int i = kotlinx.coroutines.S.f10199c;
                J2 = C0795d.l(c0800f0, kotlinx.coroutines.N0.q.f10173c, null, new a(e2, feedbackActivity, oButton, null), 2, null);
            } catch (Throwable th) {
                J2 = com.prolificinteractive.materialcalendarview.r.J(th);
            }
            return kotlin.h.a(J2);
        }
    }

    static void n(FeedbackActivity feedbackActivity, View view, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        final OSwitch oSwitch = new OSwitch(feedbackActivity, null, 0, 6);
        final OListItemGeneral oListItemGeneral = (OListItemGeneral) view.findViewById(i);
        final CharSequence p = oListItemGeneral.p();
        if (TextUtils.isEmpty(p)) {
            oSwitch.setChecked(false);
        } else {
            oSwitch.setChecked(z);
        }
        oSwitch.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OListItemGeneral oListItemGeneral2 = OListItemGeneral.this;
                CharSequence charSequence = p;
                int i3 = FeedbackActivity.k;
                kotlin.s.c.l.d(view2, "null cannot be cast to non-null type com.obric.oui.oswitch.OSwitch");
                if (!((OSwitch) view2).isChecked()) {
                    charSequence = "";
                }
                oListItemGeneral2.setSubTitleString(charSequence);
            }
        });
        oListItemGeneral.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OSwitch oSwitch2 = OSwitch.this;
                OListItemGeneral oListItemGeneral2 = oListItemGeneral;
                CharSequence charSequence = p;
                int i3 = FeedbackActivity.k;
                kotlin.s.c.l.f(oSwitch2, "$switchView");
                boolean z2 = !oSwitch2.isChecked();
                oSwitch2.setChecked(z2);
                if (!z2) {
                    charSequence = "";
                }
                oListItemGeneral2.setSubTitleString(charSequence);
            }
        });
        oListItemGeneral.setTrailingView(oSwitch);
        kotlin.s.c.l.e(oListItemGeneral, "listItemView");
        com.obric.oui.common.util.b.i(oListItemGeneral, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    private final void o(boolean z) {
        OSectionTitleBar oSectionTitleBar;
        LinearLayout linearLayout = (LinearLayout) findViewById(C0838R.id.feedback_groups_container_voice);
        if (linearLayout == null) {
            com.bytedance.android.input.r.j.j("FeedbackActivity", "feedback_groups_container_voice not found!");
            return;
        }
        ?? r5 = 0;
        if (z && (oSectionTitleBar = (OSectionTitleBar) findViewById(C0838R.id.feedback_context_tip_voice)) != null) {
            oSectionTitleBar.a().setVisibility(8);
            oSectionTitleBar.b().setVisibility(8);
            TextView c2 = oSectionTitleBar.c();
            c2.setSingleLine(false);
            c2.setMaxLines(5);
            c2.setEllipsize(null);
            ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
            kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.weight = 0.0f;
            c2.setLayoutParams(layoutParams2);
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        kotlin.s.c.l.e(layoutInflater, "layoutInflater");
        AsrContext asrContext = AsrContext.a;
        CopyOnWriteArrayList<AsrContext.a> z2 = AsrContext.a.z();
        int i = 1;
        if (z2 == null || z2.isEmpty()) {
            com.bytedance.android.input.r.j.r("FeedbackActivity", "No feedback items to display.");
            return;
        }
        if (z2 != null) {
            Iterator<Integer> it2 = kotlin.collections.g.v(z2).iterator();
            while (it2.hasNext()) {
                final int nextInt = ((kotlin.collections.o) it2).nextInt();
                AsrContext.a aVar = z2.get(nextInt);
                View inflate = layoutInflater.inflate(C0838R.layout.item_voice_feedback_group, linearLayout, (boolean) r5);
                OListItemGeneral oListItemGeneral = (OListItemGeneral) inflate.findViewById(C0838R.id.voice_recognition_result);
                OListItemGeneral oListItemGeneral2 = (OListItemGeneral) inflate.findViewById(C0838R.id.voice_recognition_time);
                OButton oButton = (OButton) inflate.findViewById(C0838R.id.btn_voice_check_details);
                String l = aVar.l();
                try {
                    char[] cArr = new char[i];
                    cArr[r5] = '.';
                    String substring = ((String) kotlin.collections.g.t(kotlin.text.a.I(l, cArr, false, 0, 6, null))).substring(5);
                    kotlin.s.c.l.e(substring, "this as java.lang.String).substring(startIndex)");
                    l = kotlin.text.a.D(substring, 'T', ' ', false, 4, null);
                } catch (Exception e2) {
                    com.bytedance.android.input.r.j.r("FeedbackActivity", "Failed to format time string: " + l + ", error: " + e2);
                }
                if (aVar.k().length() == 0) {
                    oListItemGeneral.setTitleString(getString(C0838R.string.voice_recognition_result_empty));
                } else {
                    oListItemGeneral.setTitleString(aVar.k());
                }
                oListItemGeneral.setSubTitleString(l);
                kotlin.s.c.l.e(inflate, "groupView");
                kotlin.s.c.l.e(oListItemGeneral, "voiceResultItem");
                kotlin.s.c.l.e(oListItemGeneral2, "voiceRecognitionTime");
                c cVar = new c(inflate, oListItemGeneral, oListItemGeneral2);
                oButton.setText(aVar.q() ? getString(C0838R.string.recommit_feedback) : getString(C0838R.string.go_feedback));
                oButton.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FeedbackActivity feedbackActivity = FeedbackActivity.this;
                        int i2 = nextInt;
                        int i3 = FeedbackActivity.k;
                        kotlin.s.c.l.f(feedbackActivity, "this$0");
                        com.bytedance.android.input.r.j.m("FeedbackActivity", "voice check detail button clicked for group: " + i2);
                        Intent intent = new Intent(feedbackActivity, (Class<?>) FeedbackVoiceDetailsActivity.class);
                        intent.putExtra("voice_feedback_id", i2);
                        feedbackActivity.startActivity(intent);
                    }
                });
                this.f1893c.add(cVar);
                linearLayout.addView(inflate);
                r5 = 0;
                i = 1;
            }
        }
    }

    private final boolean p() {
        Object systemService = getSystemService("activity");
        kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        String packageName = getPackageName();
        for (ActivityManager.RunningTaskInfo runningTaskInfo : ((ActivityManager) systemService).getRunningTasks(Integer.MAX_VALUE)) {
            ComponentName componentName = runningTaskInfo.topActivity;
            if (componentName != null) {
                kotlin.s.c.l.c(componentName);
                if (kotlin.s.c.l.a(componentName.getPackageName(), packageName)) {
                    ComponentName componentName2 = runningTaskInfo.topActivity;
                    kotlin.s.c.l.c(componentName2);
                    if (kotlin.s.c.l.a(componentName2.getClassName(), FeedbackActivity.class.getName())) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public static void q(FeedbackActivity feedbackActivity) {
        kotlin.s.c.l.f(feedbackActivity, "this$0");
        Object systemService = feedbackActivity.getSystemService("input_method");
        kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        if (((InputMethodManager) systemService).isAcceptingText()) {
            ScrollView scrollView = feedbackActivity.f1896f;
            if (scrollView == null) {
                kotlin.s.c.l.l("scrollView");
                throw null;
            }
            scrollView.smoothScrollTo(0, scrollView.getBottom());
            ScrollView scrollView2 = feedbackActivity.f1896f;
            if (scrollView2 != null) {
                scrollView2.getViewTreeObserver().removeOnGlobalLayoutListener(feedbackActivity.f1897g);
            } else {
                kotlin.s.c.l.l("scrollView");
                throw null;
            }
        }
    }

    public static void r(FeedbackActivity feedbackActivity, View view) {
        OInputView a2;
        OInputView a3;
        kotlin.s.c.l.f(feedbackActivity, "this$0");
        OFormItem oFormItem = feedbackActivity.f1894d;
        String valueOf = String.valueOf((oFormItem == null || (a3 = oFormItem.a()) == null) ? null : a3.B());
        if (valueOf.length() == 0) {
            TextView textView = feedbackActivity.f1895e;
            if (textView != null) {
                textView.setVisibility(0);
            }
            OFormItem oFormItem2 = feedbackActivity.f1894d;
            if (oFormItem2 != null && (a2 = oFormItem2.a()) != null) {
                a2.requestFocus();
            }
            Object systemService = feedbackActivity.getSystemService("input_method");
            kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(feedbackActivity.f1894d, 1);
            return;
        }
        com.bytedance.android.input.basic.a.d dVar = com.bytedance.android.input.basic.a.d.a;
        Context applicationContext = feedbackActivity.getApplicationContext();
        kotlin.s.c.l.e(applicationContext, "applicationContext");
        com.bytedance.android.input.basic.a.d.a(dVar, applicationContext, false, 2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PushLog.KEY_CATEGORY, "voice_input_android");
        IAppLog.a aVar = IAppLog.a;
        Objects.requireNonNull(aVar);
        jSONObject.put("did", aVar.getDeviceId());
        jSONObject.put("content", valueOf);
        Objects.requireNonNull(IAppGlobals.a);
        jSONObject.put("versionName", "1.3.9.6");
        jSONObject.put("buildTime", "20260528.1605");
        jSONObject.put("report_time", LocalDateTime.now());
        String jSONObject2 = jSONObject.toString();
        kotlin.s.c.l.e(jSONObject2, "extra.toString()");
        String encodeEncrpty = KeyboardJni.getKeyboardJni().encodeEncrpty(jSONObject.toString());
        com.bytedance.android.input.r.j.i("FeedbackActivity", "feedback report bugDesc = " + jSONObject2);
        kotlin.s.c.l.d(view, "null cannot be cast to non-null type com.obric.oui.button.OButton");
        OButton oButton = (OButton) view;
        oButton.setEnabled(false);
        oButton.setText("提交中...");
        C0795d.b(C0800f0.a, kotlinx.coroutines.S.b(), null, new d(encodeEncrpty, feedbackActivity, oButton, null), 2, null);
    }

    public static void s(FeedbackActivity feedbackActivity, int i, a aVar, View view) {
        OSwitch oSwitch;
        OSwitch oSwitch2;
        kotlin.s.c.l.f(feedbackActivity, "this$0");
        kotlin.s.c.l.f(aVar, "$group");
        kotlin.s.c.l.d(view, "null cannot be cast to non-null type com.obric.oui.button.OButton");
        OButton oButton = (OButton) view;
        e.a.a.a.a.k0("handleAssociatetGroupCommitClick Commit button clicked for group: ", i, "FeedbackActivity");
        List<? extends FeedbackAssociateContentShownInUi> list = feedbackActivity.i;
        FeedbackAssociateContentShownInUi feedbackAssociateContentShownInUi = list != null ? (FeedbackAssociateContentShownInUi) kotlin.collections.g.z(list, i) : null;
        if (feedbackAssociateContentShownInUi == null) {
            com.obric.oui.toast.a.p.a(feedbackActivity, "找不到对应的反馈项", 80);
            return;
        }
        FrameLayout o = aVar.b().o();
        int childCount = o.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                oSwitch = null;
                break;
            }
            View childAt = o.getChildAt(i2);
            if (childAt instanceof OSwitch) {
                oSwitch = (OSwitch) childAt;
                break;
            }
            i2++;
        }
        boolean isChecked = oSwitch != null ? oSwitch.isChecked() : false;
        FrameLayout o2 = aVar.a().o();
        int childCount2 = o2.getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount2) {
                oSwitch2 = null;
                break;
            }
            View childAt2 = o2.getChildAt(i3);
            if (childAt2 instanceof OSwitch) {
                oSwitch2 = (OSwitch) childAt2;
                break;
            }
            i3++;
        }
        boolean isChecked2 = oSwitch2 != null ? oSwitch2.isChecked() : false;
        OInputView a2 = aVar.d().a();
        String valueOf = String.valueOf(a2 != null ? a2.B() : null);
        if (valueOf.length() == 0) {
            TextView c2 = aVar.c();
            if (c2 != null) {
                c2.setVisibility(0);
            }
            feedbackActivity.u(aVar.d());
            com.obric.oui.toast.a.p.a(feedbackActivity, "请填写期望内容", 80);
            return;
        }
        oButton.setText("提交中...");
        oButton.setEnabled(false);
        com.bytedance.android.input.r.j.i("FeedbackActivity", "用户期待内容: " + valueOf + "， 是否同意上传上文：" + isChecked + ", 是否同意上传下文：" + isChecked2);
        String associateFeedbackBugDescByIndex = KeyboardJni.getKeyboardJni().getAssociateFeedbackBugDescByIndex(i, valueOf, isChecked, isChecked2);
        e.a.a.a.a.r0("Generated bug description: ", associateFeedbackBugDescByIndex, "FeedbackActivity");
        C0795d.b(C0800f0.a, kotlinx.coroutines.S.b(), null, new J(associateFeedbackBugDescByIndex, feedbackActivity, feedbackAssociateContentShownInUi, oButton, null), 2, null);
    }

    public static void t(FeedbackActivity feedbackActivity, int i, b bVar, View view) {
        OSwitch oSwitch;
        kotlin.s.c.l.f(feedbackActivity, "this$0");
        kotlin.s.c.l.f(bVar, "$group");
        kotlin.s.c.l.d(view, "null cannot be cast to non-null type com.obric.oui.button.OButton");
        OButton oButton = (OButton) view;
        e.a.a.a.a.k0("Commit button clicked for group: ", i, "FeedbackActivity");
        List<? extends FeedbackContentShownInUi> list = feedbackActivity.h;
        FeedbackContentShownInUi feedbackContentShownInUi = list != null ? (FeedbackContentShownInUi) kotlin.collections.g.z(list, i) : null;
        if (feedbackContentShownInUi == null) {
            com.obric.oui.toast.a.p.a(feedbackActivity, "找不到对应的反馈项", 80);
            return;
        }
        String str = feedbackContentShownInUi.input;
        kotlin.s.c.l.e(str, "originalItem.input");
        if (str.length() == 0) {
            com.obric.oui.toast.a.p.a(feedbackActivity, "原始输入内容为空，无法反馈", 80);
            return;
        }
        FrameLayout o = bVar.a().o();
        int childCount = o.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                oSwitch = null;
                break;
            }
            View childAt = o.getChildAt(i2);
            if (childAt instanceof OSwitch) {
                oSwitch = (OSwitch) childAt;
                break;
            }
            i2++;
        }
        boolean isChecked = oSwitch != null ? oSwitch.isChecked() : false;
        OInputView a2 = bVar.c().a();
        String valueOf = String.valueOf(a2 != null ? a2.B() : null);
        if (valueOf.length() == 0) {
            TextView b2 = bVar.b();
            if (b2 != null) {
                b2.setVisibility(0);
            }
            feedbackActivity.u(bVar.c());
            com.obric.oui.toast.a.p.a(feedbackActivity, "请填写期望内容", 80);
            return;
        }
        oButton.setText("提交中...");
        oButton.setEnabled(false);
        com.bytedance.android.input.r.j.i("FeedbackActivity", "用户期待内容: " + valueOf + "， 是否同意上传上文：" + isChecked);
        String lLMFeedbackBugDescByIndex = KeyboardJni.getKeyboardJni().getLLMFeedbackBugDescByIndex(i, valueOf, isChecked);
        e.a.a.a.a.r0("Generated bug description: ", lLMFeedbackBugDescByIndex, "FeedbackActivity");
        C0795d.b(C0800f0.a, kotlinx.coroutines.S.b(), null, new K(lLMFeedbackBugDescByIndex, feedbackActivity, feedbackContentShownInUi, oButton, null), 2, null);
    }

    private final void u(OFormItem oFormItem) {
        OInputView a2;
        if (oFormItem != null && (a2 = oFormItem.a()) != null) {
            a2.requestFocus();
        }
        Object systemService = getSystemService("input_method");
        kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(oFormItem, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i) {
        com.bytedance.android.input.r.j.m("FeedbackActivity", "onSelect position = " + i);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0838R.id.pager_box);
        int childCount = relativeLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            relativeLayout.getChildAt(i2).setVisibility(i2 == i ? 0 : 8);
            i2++;
        }
    }

    @Override // com.bytedance.android.doubaoime.activity.BaseSettingActivity
    public void h() {
        setContentView(C0838R.layout.activity_feedback);
        this.j = getIntent().getBooleanExtra("isFromApp", false);
        Serializable serializableExtra = getIntent().getSerializableExtra("feedback_items");
        this.h = serializableExtra instanceof ArrayList ? (ArrayList) serializableExtra : null;
        Serializable serializableExtra2 = getIntent().getSerializableExtra("associate_feedback_items");
        this.i = serializableExtra2 instanceof ArrayList ? (ArrayList) serializableExtra2 : null;
        e.a.a.a.a.N0(e.a.a.a.a.M("[Feedback] initView, isFromApp = "), this.j, "FeedbackActivity");
    }

    @Override // com.bytedance.android.doubaoime.activity.BaseSettingActivity
    public void initView() {
        String str;
        OInputView a2;
        OInputView a3;
        super.initView();
        String str2 = "FeedbackActivity";
        com.bytedance.android.input.r.j.m("FeedbackActivity", "initView");
        KeyboardJni.getKeyboardJni().updateFeedbackActivityVisible(true);
        this.f1894d = (OFormItem) findViewById(C0838R.id.feedback_content_others);
        OFormItem oFormItem = this.f1894d;
        OTextView b2 = oFormItem != null ? oFormItem.b() : null;
        if (b2 != null) {
            b2.setText(getString(C0838R.string.upload_feedback_expect_feedback_title));
        }
        OFormItem oFormItem2 = this.f1894d;
        if (oFormItem2 != null && (a3 = oFormItem2.a()) != null) {
            a3.setHint(getString(C0838R.string.upload_feedback_expect_feedback_hint));
        }
        OFormItem oFormItem3 = this.f1894d;
        if (oFormItem3 != null && (a2 = oFormItem3.a()) != null) {
            a2.w(new M(this));
        }
        TextView textView = new TextView(this);
        this.f1895e = textView;
        textView.setText("请填写此内容");
        textView.setId(C0838R.id.feedback_expect_error_tips);
        textView.setTextColor(ContextCompat.getColor(this, C0838R.color.oui_functional_red_7));
        textView.setTextSize(12.0f);
        textView.setGravity(16);
        boolean z = false;
        textView.setPadding(16, 0, 0, 0);
        com.obric.oui.common.util.b.i(textView, false);
        OFormItem oFormItem4 = this.f1894d;
        if (oFormItem4 != null) {
            oFormItem4.addView(this.f1895e);
        }
        View findViewById = findViewById(C0838R.id.scrollView);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.scrollView)");
        ScrollView scrollView = (ScrollView) findViewById;
        this.f1896f = scrollView;
        this.f1897g = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.android.doubaoime.activity.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                FeedbackActivity.q(FeedbackActivity.this);
            }
        };
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(this.f1897g);
        String string = getString(C0838R.string.upload_feedback_enable_context_title);
        kotlin.s.c.l.e(string, "getString(R.string.uploa…ack_enable_context_title)");
        SettingsConfigNext.l(string, Boolean.TRUE);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0838R.id.feedback_groups_container);
        String str3 = "item.candidateList";
        String str4 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
        String str5 = "layoutInflater";
        if (linearLayout == null) {
            com.bytedance.android.input.r.j.j("FeedbackActivity", "feedback_groups_container not found!");
        } else {
            OSectionTitleBar oSectionTitleBar = (OSectionTitleBar) findViewById(C0838R.id.feedback_context_tip_input);
            if (oSectionTitleBar != null) {
                oSectionTitleBar.a().setVisibility(8);
                oSectionTitleBar.b().setVisibility(8);
                TextView c2 = oSectionTitleBar.c();
                c2.setSingleLine(false);
                c2.setMaxLines(5);
                c2.setEllipsize(null);
                ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
                kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = -1;
                layoutParams2.weight = 0.0f;
                c2.setLayoutParams(layoutParams2);
            }
            LayoutInflater layoutInflater = getLayoutInflater();
            kotlin.s.c.l.e(layoutInflater, "layoutInflater");
            List<? extends FeedbackContentShownInUi> list = this.h;
            if (list == null || list.isEmpty()) {
                com.bytedance.android.input.r.j.r("FeedbackActivity", "No feedback items to display.");
            } else {
                List<? extends FeedbackContentShownInUi> list2 = this.h;
                if (list2 != null) {
                    Iterator<Integer> it2 = kotlin.w.h.g(kotlin.collections.g.v(list2)).iterator();
                    while (((kotlin.w.c) it2).hasNext()) {
                        final int nextInt = ((kotlin.collections.o) it2).nextInt();
                        List<? extends FeedbackContentShownInUi> list3 = this.h;
                        kotlin.s.c.l.c(list3);
                        FeedbackContentShownInUi feedbackContentShownInUi = list3.get(nextInt);
                        View inflate = layoutInflater.inflate(C0838R.layout.item_input_feedback_group, linearLayout, z);
                        OListItemGeneral oListItemGeneral = (OListItemGeneral) inflate.findViewById(C0838R.id.feedback_context);
                        LayoutInflater layoutInflater2 = layoutInflater;
                        OListItemGeneral oListItemGeneral2 = (OListItemGeneral) inflate.findViewById(C0838R.id.feedback_user_input);
                        Iterator<Integer> it3 = it2;
                        OListItemGeneral oListItemGeneral3 = (OListItemGeneral) inflate.findViewById(C0838R.id.feedback_candidate_list);
                        String str6 = str5;
                        OFormItem oFormItem5 = (OFormItem) inflate.findViewById(C0838R.id.feedback_content);
                        String str7 = str4;
                        String str8 = feedbackContentShownInUi.context;
                        String str9 = str2;
                        kotlin.s.c.l.e(str8, "item.context");
                        if (str8.length() > 0) {
                            oListItemGeneral.setSubTitleString(feedbackContentShownInUi.context);
                        } else {
                            oListItemGeneral.setEnabled(false);
                        }
                        oListItemGeneral2.setSubTitleString(feedbackContentShownInUi.input);
                        String str10 = feedbackContentShownInUi.candidateList;
                        kotlin.s.c.l.e(str10, str3);
                        oListItemGeneral3.setSubTitleString(kotlin.text.a.E(str10, " ", "、", false, 4, null));
                        OTextView b3 = oFormItem5.b();
                        String str11 = str3;
                        if (b3 != null) {
                            b3.setText(getString(C0838R.string.upload_feedback_expect_title));
                        }
                        OInputView a4 = oFormItem5.a();
                        if (a4 != null) {
                            a4.setHint(getString(C0838R.string.upload_feedback_expect_hint));
                        }
                        TextView textView2 = new TextView(this);
                        textView2.setText("请填写此内容");
                        textView2.setId(View.generateViewId());
                        textView2.setTextColor(ContextCompat.getColor(this, C0838R.color.oui_functional_red_7));
                        textView2.setTextSize(12.0f);
                        textView2.setGravity(16);
                        textView2.setPadding(16, 0, 0, 0);
                        com.obric.oui.common.util.b.i(textView2, false);
                        oFormItem5.addView(textView2);
                        OInputView a5 = oFormItem5.a();
                        if (a5 != null) {
                            a5.w(new N(textView2));
                        }
                        kotlin.s.c.l.e(inflate, "groupView");
                        kotlin.s.c.l.e(oListItemGeneral, "contextItem");
                        kotlin.s.c.l.e(oListItemGeneral2, "userInputItem");
                        kotlin.s.c.l.e(oListItemGeneral3, "candidateListItem");
                        kotlin.s.c.l.e(oFormItem5, "expectInputView");
                        final b bVar = new b(inflate, oListItemGeneral, oListItemGeneral2, oListItemGeneral3, oFormItem5, textView2);
                        OButton oButton = (OButton) inflate.findViewById(C0838R.id.btn_feedback_commit);
                        oButton.setText(feedbackContentShownInUi.isFeedbackSubmitted ? getString(C0838R.string.recommit) : getString(C0838R.string.commit));
                        oButton.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                FeedbackActivity.t(FeedbackActivity.this, nextInt, bVar, view);
                            }
                        });
                        this.b.add(bVar);
                        linearLayout.addView(inflate);
                        final OSwitch oSwitch = new OSwitch(this, null, 0, 6);
                        final String string2 = getString(C0838R.string.upload_feedback_enable_context_title);
                        kotlin.s.c.l.e(string2, "getString(preferencesStringId)");
                        final OListItemGeneral oListItemGeneral4 = (OListItemGeneral) inflate.findViewById(C0838R.id.feedback_context);
                        final CharSequence p = oListItemGeneral4.p();
                        oSwitch.setChecked(false);
                        oSwitch.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.d
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String str12 = string2;
                                OListItemGeneral oListItemGeneral5 = oListItemGeneral4;
                                CharSequence charSequence = p;
                                int i = FeedbackActivity.k;
                                kotlin.s.c.l.f(str12, "$preferencesString");
                                kotlin.s.c.l.d(view, "null cannot be cast to non-null type com.obric.oui.oswitch.OSwitch");
                                boolean isChecked = ((OSwitch) view).isChecked();
                                SettingsConfigNext.l(str12, Boolean.valueOf(isChecked));
                                if (!isChecked) {
                                    charSequence = "";
                                }
                                oListItemGeneral5.setSubTitleString(charSequence);
                            }
                        });
                        oListItemGeneral4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                OSwitch oSwitch2 = OSwitch.this;
                                String str12 = string2;
                                OListItemGeneral oListItemGeneral5 = oListItemGeneral4;
                                CharSequence charSequence = p;
                                int i = FeedbackActivity.k;
                                kotlin.s.c.l.f(oSwitch2, "$switchView");
                                kotlin.s.c.l.f(str12, "$preferencesString");
                                boolean z2 = !oSwitch2.isChecked();
                                oSwitch2.setChecked(z2);
                                SettingsConfigNext.l(str12, Boolean.valueOf(z2));
                                if (!z2) {
                                    charSequence = "";
                                }
                                oListItemGeneral5.setSubTitleString(charSequence);
                            }
                        });
                        oListItemGeneral4.setTrailingView(oSwitch);
                        layoutInflater = layoutInflater2;
                        it2 = it3;
                        str5 = str6;
                        str4 = str7;
                        str2 = str9;
                        str3 = str11;
                        z = false;
                    }
                }
            }
        }
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        o(true);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C0838R.id.feedback_groups_associate_container);
        if (linearLayout2 == null) {
            str = str12;
            com.bytedance.android.input.r.j.j(str, "feedback_groups_container not found!");
        } else {
            str = str12;
            OSectionTitleBar oSectionTitleBar2 = (OSectionTitleBar) findViewById(C0838R.id.feedback_context_tip_associate);
            if (oSectionTitleBar2 != null) {
                oSectionTitleBar2.a().setVisibility(8);
                oSectionTitleBar2.b().setVisibility(8);
                TextView c3 = oSectionTitleBar2.c();
                c3.setSingleLine(false);
                c3.setMaxLines(5);
                c3.setEllipsize(null);
                ViewGroup.LayoutParams layoutParams3 = c3.getLayoutParams();
                kotlin.s.c.l.d(layoutParams3, str14);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.width = -1;
                layoutParams4.weight = 0.0f;
                c3.setLayoutParams(layoutParams4);
            }
            LayoutInflater layoutInflater3 = getLayoutInflater();
            kotlin.s.c.l.e(layoutInflater3, str15);
            List<? extends FeedbackAssociateContentShownInUi> list4 = this.i;
            if (list4 == null || list4.isEmpty()) {
                com.bytedance.android.input.r.j.r(str, "No feedback associate items to display.");
            } else {
                List<? extends FeedbackAssociateContentShownInUi> list5 = this.i;
                if (list5 != null) {
                    Iterator<Integer> it4 = kotlin.w.h.g(kotlin.collections.g.v(list5)).iterator();
                    while (((kotlin.w.c) it4).hasNext()) {
                        final int nextInt2 = ((kotlin.collections.o) it4).nextInt();
                        List<? extends FeedbackAssociateContentShownInUi> list6 = this.i;
                        kotlin.s.c.l.c(list6);
                        FeedbackAssociateContentShownInUi feedbackAssociateContentShownInUi = list6.get(nextInt2);
                        View inflate2 = layoutInflater3.inflate(C0838R.layout.item_input_feedback_associate_group, (ViewGroup) linearLayout2, false);
                        OListItemGeneral oListItemGeneral5 = (OListItemGeneral) inflate2.findViewById(C0838R.id.feedback_context_before);
                        OListItemGeneral oListItemGeneral6 = (OListItemGeneral) inflate2.findViewById(C0838R.id.feedback_context_after);
                        OListItemGeneral oListItemGeneral7 = (OListItemGeneral) inflate2.findViewById(C0838R.id.feedback_candidate_list);
                        OFormItem oFormItem6 = (OFormItem) inflate2.findViewById(C0838R.id.feedback_content);
                        String str16 = feedbackAssociateContentShownInUi.contextBefore;
                        LayoutInflater layoutInflater4 = layoutInflater3;
                        kotlin.s.c.l.e(str16, "item.contextBefore");
                        if (str16.length() > 0) {
                            oListItemGeneral5.setSubTitleString(feedbackAssociateContentShownInUi.contextBefore);
                        } else {
                            oListItemGeneral5.setEnabled(false);
                        }
                        String str17 = feedbackAssociateContentShownInUi.contextAfter;
                        kotlin.s.c.l.e(str17, "item.contextAfter");
                        if (str17.length() > 0) {
                            oListItemGeneral6.setSubTitleString(feedbackAssociateContentShownInUi.contextAfter);
                        } else {
                            oListItemGeneral6.setEnabled(false);
                        }
                        String str18 = feedbackAssociateContentShownInUi.candidateList;
                        kotlin.s.c.l.e(str18, str13);
                        oListItemGeneral7.setSubTitleString(kotlin.text.a.E(str18, " ", "  ", false, 4, null));
                        OTextView b4 = oFormItem6.b();
                        Iterator<Integer> it5 = it4;
                        if (b4 != null) {
                            b4.setText(getString(C0838R.string.upload_feedback_expect_title));
                        }
                        OInputView a6 = oFormItem6.a();
                        if (a6 != null) {
                            a6.setHint(getString(C0838R.string.upload_feedback_expect_hint));
                        }
                        TextView textView3 = new TextView(this);
                        textView3.setText("请填写此内容");
                        textView3.setId(View.generateViewId());
                        textView3.setTextColor(ContextCompat.getColor(this, C0838R.color.oui_functional_red_7));
                        textView3.setTextSize(12.0f);
                        textView3.setGravity(16);
                        textView3.setPadding(16, 0, 0, 0);
                        com.obric.oui.common.util.b.i(textView3, false);
                        oFormItem6.addView(textView3);
                        OInputView a7 = oFormItem6.a();
                        if (a7 != null) {
                            a7.w(new L(textView3));
                        }
                        kotlin.s.c.l.e(inflate2, "groupView");
                        kotlin.s.c.l.e(oListItemGeneral5, "contextBefore");
                        kotlin.s.c.l.e(oListItemGeneral6, "contextAfter");
                        kotlin.s.c.l.e(oListItemGeneral7, "candidateListItem");
                        kotlin.s.c.l.e(oFormItem6, "expectInputView");
                        final a aVar = new a(inflate2, oListItemGeneral5, oListItemGeneral6, oListItemGeneral7, oFormItem6, textView3);
                        OButton oButton2 = (OButton) inflate2.findViewById(C0838R.id.btn_associate_feedback_commit);
                        oButton2.setText(feedbackAssociateContentShownInUi.isFeedbackSubmitted ? getString(C0838R.string.recommit) : getString(C0838R.string.commit));
                        oButton2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.j
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                FeedbackActivity.s(FeedbackActivity.this, nextInt2, aVar, view);
                            }
                        });
                        this.a.add(aVar);
                        linearLayout2.addView(inflate2);
                        n(this, inflate2, C0838R.id.feedback_context_before, false, 4);
                        n(this, inflate2, C0838R.id.feedback_context_after, false, 4);
                        layoutInflater3 = layoutInflater4;
                        it4 = it5;
                    }
                }
            }
        }
        OTabSegmentedLayout oTabSegmentedLayout = (OTabSegmentedLayout) findViewById(C0838R.id.feedback_tab);
        oTabSegmentedLayout.setTabTextTypeface(null, false);
        oTabSegmentedLayout.setTabTitleAndDrawable(new String[]{"打字", "联想", "语音", "其他"}, null);
        oTabSegmentedLayout.setOnTabSelectListener(new O(this));
        ((ImeTitleBar) findViewById(C0838R.id.settings_title_bar)).setTextFont(null);
        int intExtra = getIntent().getIntExtra("selected", 0);
        com.bytedance.android.input.r.j.m(str, "initSelectedTab position = " + intExtra);
        ((OTabSegmentedLayout) findViewById(C0838R.id.feedback_tab)).setCurrentTab(intExtra);
        v(intExtra);
        ((OButton) findViewById(C0838R.id.btn_others_feedback_commit)).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackActivity.r(FeedbackActivity.this, view);
            }
        });
    }

    @Override // com.bytedance.android.doubaoime.activity.BaseSettingActivity
    public void j() {
        if (!this.j) {
            finish();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) SettingsActivityNext.class);
        intent.addFlags(268435456);
        startActivity(intent);
        overridePendingTransition(C0838R.anim.slide_in_left, C0838R.anim.slide_out);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.j) {
            Intent intent = new Intent(this, (Class<?>) SettingsActivityNext.class);
            intent.addFlags(268435456);
            startActivity(intent);
            overridePendingTransition(C0838R.anim.slide_in_left, C0838R.anim.slide_out);
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        StringBuilder M = e.a.a.a.a.M("onDestroy, isActivityVisible: ");
        M.append(p());
        com.bytedance.android.input.r.j.i("FeedbackActivity", M.toString());
        KeyboardJni.getKeyboardJni().updateFeedbackActivityVisible(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        StringBuilder M = e.a.a.a.a.M("onPause, isActivityVisible: ");
        M.append(p());
        com.bytedance.android.input.r.j.i("FeedbackActivity", M.toString());
        KeyboardJni.getKeyboardJni().updateFeedbackActivityVisible(false);
    }

    @Override // com.bytedance.android.doubaoime.activity.BaseSettingActivity, com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        StringBuilder M = e.a.a.a.a.M("onResume, isActivityVisible: ");
        M.append(p());
        com.bytedance.android.input.r.j.i("FeedbackActivity", M.toString());
        KeyboardJni.getKeyboardJni().updateFeedbackActivityVisible(true);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0838R.id.feedback_groups_container_voice);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.f1893c.clear();
        o(false);
    }
}
