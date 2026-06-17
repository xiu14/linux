package com.bytedance.android.input.fragment.settings;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.popup.AlertPopupWindowType;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.common_biz.ui.widget.ImeTextProgressBar;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class VoiceInputOfflineDownloadFragment extends BaseSettingsFragment {
    private final String b = "VoiceInputOfflineDownloadFragment";

    /* renamed from: c, reason: collision with root package name */
    private View f2416c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f2417d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f2418e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f2419f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f2420g;
    private LinearLayout h;
    private TextView i;
    private ImeTextProgressBar j;
    private float k;
    private ValueAnimator l;

    public static final class a implements Animator.AnimatorListener {
        final /* synthetic */ ValueAnimator a;
        final /* synthetic */ VoiceInputOfflineDownloadFragment b;

        public a(ValueAnimator valueAnimator, VoiceInputOfflineDownloadFragment voiceInputOfflineDownloadFragment) {
            this.a = valueAnimator;
            this.b = voiceInputOfflineDownloadFragment;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            kotlin.s.c.l.f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            kotlin.s.c.l.f(animator, "animator");
            Object e2 = SettingsConfigNext.e(C0838R.string.asr_offline_model_download_status);
            if (!kotlin.s.c.l.a(SettingsConfigNext.e(C0838R.string.asr_offline_download_way), 0) && (kotlin.s.c.l.a(e2, 1) || kotlin.s.c.l.a(e2, 0))) {
                this.a.setFloatValues(this.b.k, 1.0f);
                this.a.start();
            }
            com.bytedance.android.input.r.j.i(this.b.b, "process onEnd current status = " + e2 + ", mDownloadsProgressStart = " + this.b.k);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            kotlin.s.c.l.f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            kotlin.s.c.l.f(animator, "animator");
        }
    }

    public VoiceInputOfflineDownloadFragment() {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k, 1.0f);
        ofFloat.setDuration(20000L);
        ofFloat.setRepeatCount(0);
        kotlin.s.c.l.e(ofFloat, "mProcessingAnimator$lambda$3");
        ofFloat.addListener(new a(ofFloat, this));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.fragment.settings.s0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoiceInputOfflineDownloadFragment.B(VoiceInputOfflineDownloadFragment.this, ofFloat, valueAnimator);
            }
        });
        this.l = ofFloat;
    }

    public static void A(VoiceInputOfflineDownloadFragment voiceInputOfflineDownloadFragment, View view) {
        kotlin.s.c.l.f(voiceInputOfflineDownloadFragment, "$this_runCatching");
        com.bytedance.android.input.r.j.i(voiceInputOfflineDownloadFragment.b, "OfflineModelTips click cancel download");
        SettingsConfigNext.k(C0838R.string.asr_offline_download_way, 0);
        SettingsConfigNext.k(C0838R.string.asr_offline_model_path, "");
        SettingsConfigNext.k(C0838R.string.asr_offline_model_download_status, 0);
        voiceInputOfflineDownloadFragment.F();
        voiceInputOfflineDownloadFragment.l.cancel();
    }

    public static void B(final VoiceInputOfflineDownloadFragment voiceInputOfflineDownloadFragment, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        kotlin.s.c.l.f(voiceInputOfflineDownloadFragment, "this$0");
        kotlin.s.c.l.f(valueAnimator2, "it");
        Object e2 = SettingsConfigNext.e(C0838R.string.asr_offline_model_download_status);
        if (kotlin.s.c.l.a(e2, 3)) {
            voiceInputOfflineDownloadFragment.D(100);
            valueAnimator.cancel();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.android.input.fragment.settings.o0
                @Override // java.lang.Runnable
                public final void run() {
                    VoiceInputOfflineDownloadFragment.x(VoiceInputOfflineDownloadFragment.this);
                }
            }, 1500L);
            com.bytedance.android.input.r.j.i(voiceInputOfflineDownloadFragment.b, "process onEnd current status = " + e2 + ", mDownloadsProgressStart = " + voiceInputOfflineDownloadFragment.k);
            return;
        }
        if (kotlin.s.c.l.a(e2, 2)) {
            valueAnimator.cancel();
            voiceInputOfflineDownloadFragment.F();
            com.bytedance.android.input.r.j.i(voiceInputOfflineDownloadFragment.b, "process onEnd current status = " + e2 + ", mDownloadsProgressStart = " + voiceInputOfflineDownloadFragment.k);
            return;
        }
        if (kotlin.s.c.l.a(e2, 1)) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            kotlin.s.c.l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            int floatValue = (int) (((Float) animatedValue).floatValue() * 100);
            TextView textView = voiceInputOfflineDownloadFragment.i;
            if (textView == null) {
                kotlin.s.c.l.l("mDownloadsTip");
                throw null;
            }
            textView.setVisibility(8);
            if (floatValue <= 90) {
                voiceInputOfflineDownloadFragment.D(floatValue);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                kotlin.s.c.l.d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                voiceInputOfflineDownloadFragment.k = ((Float) animatedValue2).floatValue();
            }
        }
    }

    public static void C(VoiceInputOfflineDownloadFragment voiceInputOfflineDownloadFragment, View view) {
        kotlin.s.c.l.f(voiceInputOfflineDownloadFragment, "$this_runCatching");
        com.bytedance.android.input.r.j.i(voiceInputOfflineDownloadFragment.b, "OfflineModelTips click cancel for wait wifi...");
        SettingsConfigNext.k(C0838R.string.asr_offline_download_way, 0);
        SettingsConfigNext.k(C0838R.string.asr_offline_model_path, "");
        SettingsConfigNext.k(C0838R.string.asr_offline_model_download_status, 0);
        voiceInputOfflineDownloadFragment.F();
        voiceInputOfflineDownloadFragment.l.cancel();
    }

    private final void D(int i) {
        Object J2;
        ImeTextProgressBar imeTextProgressBar;
        try {
            E();
            imeTextProgressBar = this.j;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        if (imeTextProgressBar == null) {
            kotlin.s.c.l.l("mDownloadTextProgressBar");
            throw null;
        }
        imeTextProgressBar.setVisibility(0);
        ImeTextProgressBar imeTextProgressBar2 = this.j;
        if (imeTextProgressBar2 == null) {
            kotlin.s.c.l.l("mDownloadTextProgressBar");
            throw null;
        }
        imeTextProgressBar2.setProgress(i);
        ImeTextProgressBar imeTextProgressBar3 = this.j;
        if (imeTextProgressBar3 == null) {
            kotlin.s.c.l.l("mDownloadTextProgressBar");
            throw null;
        }
        String string = IAppGlobals.a.getContext().getString(C0838R.string.offline_model_downloading_text);
        kotlin.s.c.l.e(string, "IAppGlobals.context.getS…e_model_downloading_text)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        kotlin.s.c.l.e(format, "format(format, *args)");
        imeTextProgressBar3.setText(format);
        J2 = kotlin.o.a;
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.P0(b, e.a.a.a.a.M("setDownloadingProgress it = "), this.b);
        }
    }

    private final void E() {
        Object obj;
        Context context;
        ImeTextProgressBar imeTextProgressBar;
        try {
            context = IAppGlobals.a.getContext();
            imeTextProgressBar = this.j;
        } catch (Throwable th) {
            obj = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        if (imeTextProgressBar == null) {
            kotlin.s.c.l.l("mDownloadTextProgressBar");
            throw null;
        }
        imeTextProgressBar.setVisibility(0);
        imeTextProgressBar.setText(context.getString(C0838R.string.asr_download_model_tip_cancel));
        imeTextProgressBar.setProgressColor(ContextCompat.getColor(context, C0838R.color.ime_color_primary));
        imeTextProgressBar.setTrackColor(ContextCompat.getColor(context, C0838R.color.asr_download_process_bg));
        imeTextProgressBar.setTextColors(ContextCompat.getColor(context, C0838R.color.ime_offline_download_progress_text_normal_color), ContextCompat.getColor(context, C0838R.color.ime_color_white));
        imeTextProgressBar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceInputOfflineDownloadFragment.A(VoiceInputOfflineDownloadFragment.this, view);
            }
        });
        obj = imeTextProgressBar;
        Throwable b = kotlin.h.b(obj);
        if (b != null) {
            e.a.a.a.a.P0(b, e.a.a.a.a.M("setDownloadingUIState it = "), this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        if (r3 == 0) goto L136;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.fragment.settings.VoiceInputOfflineDownloadFragment.F():void");
    }

    public static void v(VoiceInputOfflineDownloadFragment voiceInputOfflineDownloadFragment, View view) {
        kotlin.s.c.l.f(voiceInputOfflineDownloadFragment, "this$0");
        SettingsConfigNext.k(C0838R.string.asr_offline_download_way, 1);
        SettingsConfigNext.k(C0838R.string.asr_offline_model_download_status, 0);
        String string = voiceInputOfflineDownloadFragment.getString(C0838R.string.asr_offline_model_download_tip_show);
        kotlin.s.c.l.e(string, "getString(R.string.asr_o…_model_download_tip_show)");
        SettingsConfigNext.l(string, Boolean.FALSE);
        voiceInputOfflineDownloadFragment.F();
    }

    public static void w(VoiceInputOfflineDownloadFragment voiceInputOfflineDownloadFragment, String str, View view) {
        kotlin.s.c.l.f(voiceInputOfflineDownloadFragment, "$this_runCatching");
        kotlin.s.c.l.f(str, "$downloadPath");
        com.bytedance.android.input.r.j.i(voiceInputOfflineDownloadFragment.b, "OfflineModelTips click delete");
        kotlin.s.c.l.f("setting_offline_model_download", "pageName");
        kotlin.s.c.l.f("delete_offline_model_dialog", "dialogName");
        IAppLog.a.t("ime_dialog_show", e.a.a.a.a.a0("page_name", "setting_offline_model_download", "dialog_name", "delete_offline_model_dialog"));
        com.bytedance.android.input.n.d.a(com.bytedance.android.input.n.d.a, WindowId.OFFLINE_MODEL_DELETE_TIPS, C0838R.string.offline_model_delete_tips_title, C0838R.string.offline_model_delete_tips_content, C0838R.string.offline_model_delete_tips_cancel, C0838R.string.offline_model_delete_tips_confirm, 0, AlertPopupWindowType.TIP_CONFIRM_WIDTH_FULL, new k1(voiceInputOfflineDownloadFragment), new l1(voiceInputOfflineDownloadFragment, str), null, 544);
        com.bytedance.android.input.basic.d.a.a(new Runnable() { // from class: com.bytedance.android.input.s.c
            @Override // java.lang.Runnable
            public final void run() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                l.f("click_delete_offline_model", "eventName");
                com.bytedance.android.input.r.j.i("ImeEventAppLog", "reportEvent click_delete_offline_model ");
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                IAppLog.a.t("click_delete_offline_model", jSONObject);
            }
        });
    }

    public static void x(VoiceInputOfflineDownloadFragment voiceInputOfflineDownloadFragment) {
        kotlin.s.c.l.f(voiceInputOfflineDownloadFragment, "this$0");
        voiceInputOfflineDownloadFragment.F();
    }

    public static void y(VoiceInputOfflineDownloadFragment voiceInputOfflineDownloadFragment, View view) {
        kotlin.s.c.l.f(voiceInputOfflineDownloadFragment, "$this_runCatching");
        com.bytedance.android.input.r.j.i(voiceInputOfflineDownloadFragment.b, "OfflineModelTips click retry");
        SettingsConfigNext.k(C0838R.string.asr_offline_model_download_status, 0);
        voiceInputOfflineDownloadFragment.F();
        voiceInputOfflineDownloadFragment.l.setFloatValues(voiceInputOfflineDownloadFragment.k, 1.0f);
        voiceInputOfflineDownloadFragment.l.start();
        FragmentActivity activity = voiceInputOfflineDownloadFragment.getActivity();
        kotlin.s.c.l.d(activity, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
        ((SettingsActivityNext) activity).retryDownloadOfflineModel();
    }

    public static void z(VoiceInputOfflineDownloadFragment voiceInputOfflineDownloadFragment, View view) {
        kotlin.s.c.l.f(voiceInputOfflineDownloadFragment, "this$0");
        SettingsConfigNext.k(C0838R.string.asr_offline_download_way, 2);
        SettingsConfigNext.k(C0838R.string.asr_offline_model_download_status, 0);
        String string = voiceInputOfflineDownloadFragment.getString(C0838R.string.asr_offline_model_download_tip_show);
        kotlin.s.c.l.e(string, "getString(R.string.asr_o…_model_download_tip_show)");
        SettingsConfigNext.l(string, Boolean.FALSE);
        voiceInputOfflineDownloadFragment.F();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, com.bytedance.android.doubaoime.activity.Q
    public boolean j() {
        com.bytedance.android.input.popup.q f2 = com.bytedance.android.input.popup.q.f();
        WindowId windowId = WindowId.OFFLINE_MODEL_DELETE_TIPS;
        if (!f2.j(windowId)) {
            return false;
        }
        com.bytedance.android.input.r.j.i(this.b, "OfflineModelTips onBackPressed dismiss offline model delete tips");
        com.bytedance.android.input.popup.q.f().d(windowId);
        kotlin.s.c.l.f("setting_offline_model_download", "pageName");
        kotlin.s.c.l.f("delete_offline_model_dialog", "dialogName");
        kotlin.s.c.l.f("virtual_key", "buttonName");
        IAppLog.a aVar = IAppLog.a;
        JSONObject a0 = e.a.a.a.a.a0("page_name", "setting_offline_model_download", "dialog_name", "delete_offline_model_dialog");
        a0.put("button_name", "virtual_key");
        aVar.t("ime_dialog_click", a0);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object e2 = SettingsConfigNext.e(C0838R.string.asr_offline_download_way);
        Object e3 = SettingsConfigNext.e(C0838R.string.asr_offline_model_path);
        kotlin.s.c.l.d(e3, "null cannot be cast to non-null type kotlin.String");
        String str = (String) e3;
        if (!(str.length() > 0) || !e.a.a.a.a.R0(str)) {
            str = "";
        }
        Object e4 = SettingsConfigNext.e(C0838R.string.asr_offline_model_download_status);
        kotlin.s.c.l.d(e4, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) e4).intValue();
        com.bytedance.android.input.r.j.i(this.b, "onCreate, downloadWay = " + e2 + ", downloadPath = " + str + ", downloadStatus = " + intValue);
        if (kotlin.s.c.l.a(e2, 0)) {
            return;
        }
        if ((str.length() == 0) && intValue == 1) {
            if (this.k == 0.0f) {
                this.k = 0.89f;
            }
        }
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        if (this.f2416c == null) {
            View inflate = layoutInflater.inflate(C0838R.layout.fragment_voice_input_offline_download, viewGroup, false);
            kotlin.s.c.l.e(inflate, "inflater.inflate(R.layou…wnload, container, false)");
            this.f2416c = inflate;
            if (inflate == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            View findViewById = inflate.findViewById(C0838R.id.model_download_no);
            kotlin.s.c.l.e(findViewById, "root.findViewById(R.id.model_download_no)");
            this.f2417d = (ImageView) findViewById;
            View findViewById2 = inflate.findViewById(C0838R.id.model_download_ok);
            kotlin.s.c.l.e(findViewById2, "root.findViewById(R.id.model_download_ok)");
            this.f2418e = (ImageView) findViewById2;
            View findViewById3 = inflate.findViewById(C0838R.id.model_download_explain);
            kotlin.s.c.l.e(findViewById3, "root.findViewById(R.id.model_download_explain)");
            this.f2419f = (TextView) findViewById3;
            View findViewById4 = inflate.findViewById(C0838R.id.model_download_explain_row2);
            kotlin.s.c.l.e(findViewById4, "root.findViewById(R.id.m…el_download_explain_row2)");
            this.f2420g = (TextView) findViewById4;
            View findViewById5 = inflate.findViewById(C0838R.id.model_download_tow);
            kotlin.s.c.l.e(findViewById5, "root.findViewById(R.id.model_download_tow)");
            this.h = (LinearLayout) findViewById5;
            View findViewById6 = inflate.findViewById(C0838R.id.model_download_now);
            ((TextView) findViewById6).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceInputOfflineDownloadFragment.v(VoiceInputOfflineDownloadFragment.this, view);
                }
            });
            kotlin.s.c.l.e(findViewById6, "root.findViewById<TextVi…)\n            }\n        }");
            View findViewById7 = inflate.findViewById(C0838R.id.model_download_wifi);
            ((TextView) findViewById7).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceInputOfflineDownloadFragment.z(VoiceInputOfflineDownloadFragment.this, view);
                }
            });
            kotlin.s.c.l.e(findViewById7, "root.findViewById<TextVi…)\n            }\n        }");
            View findViewById8 = inflate.findViewById(C0838R.id.model_download_tip);
            kotlin.s.c.l.e(findViewById8, "root.findViewById(R.id.model_download_tip)");
            this.i = (TextView) findViewById8;
            View findViewById9 = inflate.findViewById(C0838R.id.model_download_text_progress_bar);
            kotlin.s.c.l.e(findViewById9, "root.findViewById(R.id.m…wnload_text_progress_bar)");
            this.j = (ImeTextProgressBar) findViewById9;
            F();
        }
        View view = this.f2416c;
        if (view != null) {
            return view;
        }
        kotlin.s.c.l.l("mRoot");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.android.input.r.j.i(this.b, "onDestroy");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.l.cancel();
        FragmentActivity activity = getActivity();
        kotlin.s.c.l.d(activity, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
        SettingsActivityNext.FragmentType fragmentType = SettingsActivityNext.FragmentType.OFFLINE_DOWNLOAD;
        ((SettingsActivityNext) activity).settingsFragmentActive(14, false);
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        r();
        com.bytedance.android.input.basic.d.a.a(new Runnable() { // from class: com.bytedance.android.input.s.b
            /* JADX WARN: Removed duplicated region for block: B:17:0x0091 A[LOOP:0: B:15:0x008b->B:17:0x0091, LOOP_END] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r7 = this;
                    java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                    r0.<init>()
                    r1 = 2131820660(0x7f110074, float:1.9274041E38)
                    java.lang.Object r1 = com.bytedance.android.input.common.SettingsConfigNext.e(r1)
                    r2 = 2131820664(0x7f110078, float:1.927405E38)
                    java.lang.Object r2 = com.bytedance.android.input.common.SettingsConfigNext.e(r2)
                    java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
                    kotlin.s.c.l.d(r2, r3)
                    java.lang.String r2 = (java.lang.String) r2
                    int r3 = r2.length()
                    r4 = 1
                    r5 = 0
                    if (r3 <= 0) goto L24
                    r3 = r4
                    goto L25
                L24:
                    r3 = r5
                L25:
                    if (r3 == 0) goto L2e
                    boolean r3 = e.a.a.a.a.R0(r2)
                    if (r3 == 0) goto L2e
                    goto L30
                L2e:
                    java.lang.String r2 = ""
                L30:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r6 = "updateCurrentStatus downloadWay = "
                    r3.append(r6)
                    r3.append(r1)
                    java.lang.String r6 = ", downloadPath = "
                    r3.append(r6)
                    r3.append(r2)
                    java.lang.String r3 = r3.toString()
                    java.lang.String r6 = "VoiceOfflineDictEventTracker"
                    com.bytedance.android.input.r.j.i(r6, r3)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                    boolean r1 = kotlin.s.c.l.a(r1, r3)
                    java.lang.String r3 = "is_offline_model_downloaded"
                    if (r1 != 0) goto L6b
                    int r1 = r2.length()
                    if (r1 != 0) goto L61
                    goto L62
                L61:
                    r4 = r5
                L62:
                    if (r4 == 0) goto L65
                    goto L6b
                L65:
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.put(r3, r1)
                    goto L70
                L6b:
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    r0.put(r3, r1)
                L70:
                    java.lang.String r1 = "offline_model_pageshow"
                    java.lang.String r2 = "eventName"
                    kotlin.s.c.l.f(r1, r2)
                    java.lang.String r2 = "ImeEventAppLog"
                    java.lang.String r3 = "reportEvent offline_model_pageshow "
                    com.bytedance.android.input.r.j.i(r2, r3)
                    org.json.JSONObject r2 = new org.json.JSONObject
                    r2.<init>()
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                L8b:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto La5
                    java.lang.Object r3 = r0.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r3 = r3.getValue()
                    r2.put(r4, r3)
                    goto L8b
                La5:
                    com.bytedance.android.input.basic.applog.api.IAppLog$a r0 = com.bytedance.android.input.basic.applog.api.IAppLog.a
                    r0.t(r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.s.b.run():void");
            }
        });
        com.bytedance.android.input.r.j.i(this.b, "onResume");
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        F();
        FragmentActivity activity = getActivity();
        kotlin.s.c.l.d(activity, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
        SettingsActivityNext.FragmentType fragmentType = SettingsActivityNext.FragmentType.OFFLINE_DOWNLOAD;
        ((SettingsActivityNext) activity).settingsFragmentActive(14, true);
    }
}
