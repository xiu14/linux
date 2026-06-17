package com.bytedance.android.input.speech;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.common.asr.api.IAsr;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.aiwrite.C0603x;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import com.bytedance.android.input.llm.LLMRequest;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.android.input.speech.AsrManager;
import com.bytedance.common.utility.NetworkUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;
import kotlinx.coroutines.S;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AsrManager {
    private static Runnable A;
    private static boolean D;
    private static com.bytedance.android.input.popup.i F;
    private static boolean j;
    private static long k;
    private static boolean l;
    private static long m;
    private static JSONObject o;
    private static boolean q;
    private static int r;
    private static boolean s;
    private static com.bytedance.android.input.speech.L.a z;
    public static final AsrManager a = new AsrManager();
    private static final z b = new z();

    /* renamed from: c, reason: collision with root package name */
    private static final K f3059c = new K();

    /* renamed from: d, reason: collision with root package name */
    private static boolean f3060d = true;

    /* renamed from: e, reason: collision with root package name */
    private static G f3061e = new G();

    /* renamed from: f, reason: collision with root package name */
    private static F f3062f = new F();

    /* renamed from: g, reason: collision with root package name */
    private static I f3063g = new I();
    private static String h = "";
    private static SpeechStatus i = SpeechStatus.KStop;
    private static JSONObject n = new JSONObject();
    private static boolean p = true;
    private static final Map<String, String> t = new LinkedHashMap();
    private static final Map<String, String> u = new LinkedHashMap();
    private static final Map<String, String> v = new LinkedHashMap();
    private static final d w = new d();
    private static final kotlin.e x = kotlin.a.c(c.a);
    private static final Handler y = new Handler(Looper.getMainLooper());
    private static final Runnable B = new Runnable() { // from class: com.bytedance.android.input.speech.a
        @Override // java.lang.Runnable
        public final void run() {
            AsrManager.I();
        }
    };
    private static final Runnable C = new Runnable() { // from class: com.bytedance.android.input.speech.i
        @Override // java.lang.Runnable
        public final void run() {
            AsrManager.K();
        }
    };
    private static Runnable E = new Runnable() { // from class: com.bytedance.android.input.speech.d
        @Override // java.lang.Runnable
        public final void run() {
            AsrManager asrManager = AsrManager.a;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("mOnFinishInputHandle = ");
                IAsr.b bVar = IAsr.a;
                IAsr.Type type = IAsr.Type.SDK;
                sb.append(bVar.a(type));
                com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", sb.toString());
                IAsr a2 = bVar.a(type);
                if (a2 != null) {
                    a2.disconnect();
                }
            } catch (Exception e2) {
                StringBuilder M = e.a.a.a.a.M("mOnFinishInputHandle error=");
                M.append(e2.getMessage());
                com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", M.toString());
            }
        }
    };
    private static final Handler G = new Handler(Looper.getMainLooper());

    public enum SpeechStatus {
        KStart,
        KStop,
        KInAsr,
        KNoVoice,
        KNetErr,
        KTryStart,
        KRecorderErr,
        KResultModifying,
        KStoping,
        KNoVoiceClose,
        KErrorShowState
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrManager$autoFeedbackLog$1", f = "AsrManager.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.h<? extends kotlin.o>>, Object> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, kotlin.r.d<? super a> dVar) {
            super(2, dVar);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new a(this.a, this.b, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.h<? extends kotlin.o>> dVar) {
            return new a(this.a, this.b, dVar).invokeSuspend(kotlin.o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            Object J2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            String str = this.a;
            String str2 = this.b;
            try {
                LLMRequest lLMRequest = LLMRequest.a;
                kotlin.s.c.l.e(str, "bugDesc");
                lLMRequest.e(str, null);
                com.bytedance.android.input.r.j.f3013f.q(str2, 2);
                J2 = kotlin.o.a;
            } catch (Throwable th) {
                J2 = com.prolificinteractive.materialcalendarview.r.J(th);
            }
            return kotlin.h.a(J2);
        }
    }

    public static final class b implements com.bytedance.android.input.speech.L.a {
        final /* synthetic */ kotlin.s.c.z<s> a;
        final /* synthetic */ long b;

        b(kotlin.s.c.z<s> zVar, long j) {
            this.a = zVar;
            this.b = j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.android.input.speech.L.a
        public void a(s sVar) {
            kotlin.s.c.l.f(sVar, "asrCallBackInfo");
            this.a.a = sVar;
            if (sVar.g()) {
                Handler handler = AsrManager.G;
                final long j = this.b;
                handler.post(new Runnable() { // from class: com.bytedance.android.input.speech.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        long j2 = j;
                        AsrManager asrManager = AsrManager.a;
                        StringBuilder M = e.a.a.a.a.M("DoAsrSend IAllAsrBackListener onBack cost-time = ");
                        M.append(System.currentTimeMillis() - j2);
                        asrManager.L(M.toString());
                        AsrManager.b.A();
                        Runnable y = asrManager.y();
                        if (y != null) {
                            AsrManager.G.removeCallbacks(y);
                            y.run();
                        }
                    }
                });
            }
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.android.input.popup.r> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public com.bytedance.android.input.popup.r invoke() {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            return new com.bytedance.android.input.popup.r(aVar.getContext(), WindowId.CONFIRM_SPEECH_PERMISSION, 1);
        }
    }

    public static final class d extends SettingsConfigNext.b {
        d() {
        }

        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public void onReset() {
        }

        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public <T> void onSettingsConfigChanged(String str, T t) {
            kotlin.s.c.l.f(str, "key");
            com.bytedance.android.input.r.j.i("Asr-Flow-AsrManager", "onSettingsConfigChanged key = " + str + ", value = " + t);
            IAppGlobals.a aVar = IAppGlobals.a;
            String e2 = e.a.a.a.a.e(aVar, C0838R.string.asr_offline_download_way, "IAppGlobals.context.getS…asr_offline_download_way)");
            if (kotlin.s.c.l.a(str, e2)) {
                Object f2 = SettingsConfigNext.f(e2);
                if (kotlin.s.c.l.a(f2, 0)) {
                    com.bytedance.android.input.speech.M.k.a.l();
                    return;
                }
                if (kotlin.s.c.l.a(f2, 1)) {
                    com.bytedance.android.input.speech.M.k.a.p();
                    return;
                }
                if (kotlin.s.c.l.a(f2, 2)) {
                    com.bytedance.android.input.speech.M.k.a.o();
                } else if (kotlin.s.c.l.a(f2, 3)) {
                    AsrManager asrManager = AsrManager.a;
                    AsrManager.r++;
                    aVar.o().edit().putInt(aVar.getContext().getString(C0838R.string.asr_offline_model_download_error_time), AsrManager.r).apply();
                }
            }
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrManager$setCacheFastModifyPairsString$1", f = "AsrManager.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, kotlin.r.d<? super e> dVar) {
            super(2, dVar);
            this.a = str;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new e(this.a, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
            e eVar = new e(this.a, dVar);
            kotlin.o oVar = kotlin.o.a;
            eVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            try {
                JSONArray jSONArray = new JSONArray(this.a);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String optString = jSONObject.optString("src", "");
                    String optString2 = jSONObject.optString("dst", "");
                    kotlin.s.c.l.e(optString, "src");
                    boolean z = true;
                    if (optString.length() > 0) {
                        kotlin.s.c.l.e(optString2, "dst");
                        if (optString2.length() > 0) {
                            linkedHashMap.put(optString, optString2);
                            linkedHashMap2.put(optString2, optString);
                            String GetHansOrHant = KeyboardJni.GetHansOrHant(2, optString);
                            String GetHansOrHant2 = KeyboardJni.GetHansOrHant(2, optString2);
                            kotlin.s.c.l.e(GetHansOrHant, "traditionalSrc");
                            if (GetHansOrHant.length() > 0) {
                                kotlin.s.c.l.e(GetHansOrHant2, "traditionalDst");
                                if (GetHansOrHant2.length() <= 0) {
                                    z = false;
                                }
                                if (z) {
                                    linkedHashMap3.put(GetHansOrHant, GetHansOrHant2);
                                }
                            }
                        }
                    }
                }
                AsrManager.t.clear();
                AsrManager.t.putAll(linkedHashMap);
                AsrManager.u.clear();
                AsrManager.u.putAll(linkedHashMap2);
                AsrManager.v.clear();
                AsrManager.v.putAll(linkedHashMap3);
            } catch (Exception e2) {
                e.a.a.a.a.f0(e2, e.a.a.a.a.M("[DeleteAssociate] setCacheFastModifyPairsString error: "), "Asr-Flow-AsrManager");
            }
            return kotlin.o.a;
        }
    }

    static final class f extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            AsrManager.b.x();
            return kotlin.o.a;
        }
    }

    static final class g extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        public static final g a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            AsrManager.a.M("StopAsr stopNotWait callbackInfo is null");
            return kotlin.o.a;
        }
    }

    private AsrManager() {
    }

    public static final boolean C() {
        e.a.a.a.a.N0(e.a.a.a.a.M("[reportPairNew] getTextAsrStateForModifyPair isAsrForModifyPair = "), s, "Asr-Flow-AsrManager");
        return s;
    }

    public static void I() {
        AsrManager asrManager = a;
        asrManager.p0(true, "stopOneOutTime");
        asrManager.c0(12);
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "mOnStopWaitHandle StopAsr updateUiState kStoping to KStop");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J(long j2, kotlin.s.c.z zVar, int i2) {
        kotlin.s.c.l.f(zVar, "$currentAsrInfo");
        AsrManager asrManager = a;
        StringBuilder M = e.a.a.a.a.M("DoAsrSend action#invoke currentAllAsrBack: ");
        AsrContext asrContext = AsrContext.a;
        M.append(asrContext.m());
        M.append(", mHaveVoiceText = ");
        M.append(l);
        M.append(", currentThread = ");
        M.append(Thread.currentThread().getName());
        M.append(", cost-time = ");
        M.append(System.currentTimeMillis() - j2);
        M.append(", currentAsrInfo  is null ? ");
        M.append(zVar.a == 0);
        asrManager.M(M.toString());
        InputView inputView = ImeService.x;
        if ((inputView == null || inputView.B()) ? false : true) {
            asrManager.L("DoAsrSend isShowingAsrLongPressView = false");
            s sVar = (s) zVar.a;
            if (sVar != null) {
                H.a.a(sVar, true, null);
                zVar.a = null;
            }
            asrManager.p0(true, "send");
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sendtype", KeyboardJni.getActionTypeName(i2));
            jSONObject.put("threepass", asrContext.m());
            if (com.bytedance.android.input.speech.view.o.f3179f == null) {
                e.a.a.a.a.b0();
            }
            com.bytedance.android.input.speech.view.o oVar = com.bytedance.android.input.speech.view.o.f3179f;
            kotlin.s.c.l.d(oVar, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
            jSONObject.put("pagename", oVar.c());
            if (com.bytedance.android.input.speech.view.o.f3179f == null) {
                e.a.a.a.a.b0();
            }
            com.bytedance.android.input.speech.view.o oVar2 = com.bytedance.android.input.speech.view.o.f3179f;
            kotlin.s.c.l.d(oVar2, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
            if (oVar2.f().length() > 0) {
                if (com.bytedance.android.input.speech.view.o.f3179f == null) {
                    e.a.a.a.a.b0();
                }
                com.bytedance.android.input.speech.view.o oVar3 = com.bytedance.android.input.speech.view.o.f3179f;
                kotlin.s.c.l.d(oVar3, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
                jSONObject.put("third_package_name", oVar3.h());
                if (com.bytedance.android.input.speech.view.o.f3179f == null) {
                    e.a.a.a.a.b0();
                }
                com.bytedance.android.input.speech.view.o oVar4 = com.bytedance.android.input.speech.view.o.f3179f;
                kotlin.s.c.l.d(oVar4, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
                jSONObject.put("third_scene", oVar4.f());
                if (com.bytedance.android.input.speech.view.o.f3179f == null) {
                    e.a.a.a.a.b0();
                }
                com.bytedance.android.input.speech.view.o oVar5 = com.bytedance.android.input.speech.view.o.f3179f;
                kotlin.s.c.l.d(oVar5, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
                jSONObject.put("third_extra", oVar5.g());
            }
            int ordinal = asrContext.D().ordinal();
            if (ordinal == 1) {
                jSONObject.put("texttype", "offline");
            } else if (ordinal == 2) {
                jSONObject.put("texttype", "online");
            } else if (ordinal == 3) {
                jSONObject.put("texttype", "on_off");
            }
            aVar.t("voiceinput_space_action", jSONObject);
            asrManager.a0(i2, j2);
        }
        b.A();
        z = null;
        A = null;
    }

    public static void K() {
        AsrManager asrManager = a;
        asrManager.p0(true, "stopTwoOutTime");
        asrManager.c0(13);
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "mOnStopWaitFinishHandle StopAsr updateUiState kStoping to KStop");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(String str) {
        IAppGlobals.a.j("Asr-Flow-AsrManager", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(String str) {
        IAppGlobals.a.x("Asr-Flow-AsrManager", str);
    }

    private final void a0(int i2, long j2) {
        KeyboardJni.EnterActionType enterActionType = KeyboardJni.EnterActionType.kIME_ACTION_SEND_EXPRESSION;
        if (i2 != 8) {
            KeyboardJni.EnterActionType enterActionType2 = KeyboardJni.EnterActionType.kIME_ACTION_SEND;
            if (i2 != 4) {
                KeyboardJni.doSendAction();
                StringBuilder M = e.a.a.a.a.M("DoAsrSend sendFinish costTime = ");
                M.append(System.currentTimeMillis() - j2);
                M(M.toString());
            }
        }
        com.bytedance.android.input.editor.a q2 = KeyboardJni.getService().q();
        if (q2 != null) {
            q2.performEditorAction(4);
        }
        StringBuilder M2 = e.a.a.a.a.M("DoAsrSend sendFinish costTime = ");
        M2.append(System.currentTimeMillis() - j2);
        M(M2.toString());
    }

    private final void b0(String str, long j2) {
        if (l) {
            i0(this, null, 0L, true, null, 11);
            if (!kotlin.s.c.l.a(str, "send_clicked")) {
                if (com.bytedance.android.input.common.g.a().length() == 0) {
                    if (kotlin.s.c.l.a(str, "next_asr_start")) {
                        return;
                    }
                    AsrContext.a.C(null);
                    return;
                }
            }
            if (!kotlin.s.c.l.a(str, "next_asr_start")) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    AsrContext.a.C(jSONObject);
                    jSONObject.put("app_name", IAppGlobals.a.H());
                    jSONObject.put("reason", str);
                    jSONObject.put("commit", com.bytedance.android.input.speech.view.l.a.k().length());
                    jSONObject.put("final_lens", com.bytedance.android.input.common.o.e());
                    jSONObject.put("radio", f3059c.i);
                    IAppLog.a.t("Input_voiceinputedit_new", jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(CrashHianalyticsData.TIME, j2);
                jSONObject2.put("app_name", IAppGlobals.a.H());
                jSONObject2.put("reason", str);
                jSONObject2.put("commit", f3063g.f());
                jSONObject2.put("final_lens", com.bytedance.android.input.common.o.e());
                jSONObject2.put("radio", f3059c.i);
                IAppLog.a.t("Input_voiceinputedit", jSONObject2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            l = false;
        }
    }

    private final void c0(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("err_code", i2);
            jSONObject.put("app_name", IAppGlobals.a.H());
            IAppLog.a.t("asr_error", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private final void d0(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", IAppGlobals.a.H());
            IAppLog.a.t(str, jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private final void h0(String str, boolean z2) {
        if (kotlin.s.c.l.a(com.bytedance.android.input.speech.view.l.a.r().getValue(), Boolean.FALSE)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", str);
            jSONObject.put("is_error", z2);
            jSONObject.put("is_key", false);
            jSONObject.put("app_name", IAppGlobals.a.H());
            IAppLog.a.t("input_voiceinput_stopfrom", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void i0(AsrManager asrManager, String str, long j2, boolean z2, String str2, int i2) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        long j3 = 0;
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        kotlin.s.c.l.f(str, "timeKey");
        kotlin.s.c.l.f(str2, "from");
        try {
            if (o == null) {
                return;
            }
            com.bytedance.android.input.r.j.i("Asr-Flow-AsrManager", "reportStopTime key = " + str + ", time = " + j2);
            boolean z3 = true;
            if (str.length() > 0) {
                if (kotlin.s.c.l.a(str, "AsrStopTime")) {
                    com.bytedance.android.input.common.u.e.a("AsrStopTime");
                } else if (kotlin.s.c.l.a(str, "StartSessionFinish")) {
                    long c2 = com.bytedance.android.input.common.u.e.c("AsrStopTime");
                    JSONObject jSONObject = o;
                    if (jSONObject != null) {
                        jSONObject.remove(str);
                    }
                    JSONObject jSONObject2 = o;
                    if (jSONObject2 != null) {
                        if (((int) c2) != -1) {
                            j3 = c2;
                        }
                        jSONObject2.put(str, j3);
                    }
                    com.bytedance.android.input.common.u.e.a("StartSessionFinish");
                } else {
                    if (!kotlin.s.c.l.a(str, "ForceStop")) {
                        z3 = kotlin.s.c.l.a(str, "LongPressStop");
                    }
                    if (z3) {
                        JSONObject jSONObject3 = o;
                        if (jSONObject3 != null) {
                            jSONObject3.remove(str);
                        }
                        JSONObject jSONObject4 = o;
                        if (jSONObject4 != null) {
                            jSONObject4.put(str, j2);
                        }
                    } else if (kotlin.s.c.l.a(str, "ForceStopFrom")) {
                        JSONObject jSONObject5 = o;
                        if (jSONObject5 != null) {
                            jSONObject5.remove("ForceStopFrom");
                        }
                        JSONObject jSONObject6 = o;
                        if (jSONObject6 != null) {
                            jSONObject6.put(str, str2);
                        }
                    } else {
                        long d2 = com.bytedance.android.input.common.u.e.d("StartSessionFinish");
                        JSONObject jSONObject7 = o;
                        if (jSONObject7 != null) {
                            jSONObject7.remove(str);
                        }
                        JSONObject jSONObject8 = o;
                        if (jSONObject8 != null) {
                            jSONObject8.put(str, d2);
                        }
                    }
                }
            }
            if (z2) {
                IAppLog.a aVar = IAppLog.a;
                JSONObject jSONObject9 = o;
                kotlin.s.c.l.c(jSONObject9);
                aVar.t("input_voiceinput_stop_time", jSONObject9);
                o = null;
            }
        } catch (Exception e2) {
            com.bytedance.android.input.r.j.j("Asr-Flow-AsrManager", e2.getMessage());
        }
    }

    public static final void m0(boolean z2) {
        s = z2;
        e.a.a.a.a.y0("[reportPairNew] setTextAsrStateForModifyPair isAsrForModifyPair = ", z2, "Asr-Flow-AsrManager");
    }

    private final void n(String str, String str2) {
        IAppGlobals.a aVar = IAppGlobals.a;
        if (TextUtils.equals(d.a.b.a.c(aVar), "local_test")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str3 = "voice_input_android_error_" + str;
        jSONObject.put(PushLog.KEY_CATEGORY, str3);
        IAppLog.a aVar2 = IAppLog.a;
        Objects.requireNonNull(aVar2);
        jSONObject.put("did", aVar2.getDeviceId());
        jSONObject.put("versionName", "1.3.9.6");
        jSONObject.put("buildTime", "20260528.1605");
        jSONObject.put("report_time", LocalDateTime.now());
        jSONObject.put(DBDefinition.TASK_ID, str2);
        jSONObject.put("errorType", "voice");
        String jSONObject2 = jSONObject.toString();
        kotlin.s.c.l.e(jSONObject2, "extra.toString()");
        String encodeEncrpty = KeyboardJni.getKeyboardJni().encodeEncrpty(jSONObject.toString());
        StringBuilder U = e.a.a.a.a.U("feedback report bugDesc = ", jSONObject2, ", ");
        U.append(d.a.b.a.c(aVar));
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrManager", U.toString());
        C0795d.b(C0800f0.a, S.b(), null, new a(encodeEncrpty, str3, null), 2, null);
    }

    private final void p() {
        JSONObject jSONObject = new JSONObject();
        o = jSONObject;
        if (jSONObject != null) {
            jSONObject.put("StartSessionFinish", 0);
        }
        JSONObject jSONObject2 = o;
        if (jSONObject2 != null) {
            jSONObject2.put("ReceiveStreamResult", 0);
        }
        JSONObject jSONObject3 = o;
        if (jSONObject3 != null) {
            jSONObject3.put("ReceiveSecondResult", 0);
        }
        JSONObject jSONObject4 = o;
        if (jSONObject4 != null) {
            jSONObject4.put("ReceiveSessionResult", 0);
        }
        JSONObject jSONObject5 = o;
        if (jSONObject5 != null) {
            jSONObject5.put("StopCommit", 0);
        }
        JSONObject jSONObject6 = o;
        if (jSONObject6 != null) {
            jSONObject6.put("ForceStop", 0);
        }
        JSONObject jSONObject7 = o;
        if (jSONObject7 != null) {
            jSONObject7.put("LongPressStop", 0);
        }
        com.bytedance.android.input.common.u.e.b("AsrStopTime");
    }

    private final void r0() {
        M("StopAsr stopNotWait");
        b.o();
        if (!KeyboardJni.getKeyboardJni().onAsrCommitPreeditText() && !f3060d) {
            if (j) {
                d0("Input_voiceinputshow");
            }
            f3063g.e(p);
        }
        v0(this, SpeechStatus.KStop, null, false, 6);
        f3060d = true;
        f3063g.n(false);
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "clearAllDelayMessage");
        y.removeCallbacksAndMessages(null);
        AsrContext asrContext = AsrContext.a;
        String str = h;
        String p2 = f3059c.p();
        kotlin.s.c.l.e(p2, "mRecorder.getmFileOutputName()");
        asrContext.d0(str, p2);
    }

    private final void u0(SpeechStatus speechStatus, String str, boolean z2) {
        InputView inputView;
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrManager", "updateUiState status=" + speechStatus + " from = " + str + "---mCurrentUIStatus = " + i + "---forceUpdateState = " + z2);
        SpeechStatus speechStatus2 = i;
        SpeechStatus speechStatus3 = SpeechStatus.KErrorShowState;
        if (speechStatus2 == speechStatus3 && speechStatus == SpeechStatus.KStop && q && !z2) {
            if (IInputSettings.a.d().c()) {
                return;
            }
            KeyboardJni.updateEnterOkTextForSpeech(false, str);
            return;
        }
        i = speechStatus;
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrManager", "updateUiState status=" + speechStatus + " start");
        if (speechStatus == SpeechStatus.KStop) {
            InputView inputView2 = ImeService.x;
            if (inputView2 != null) {
                inputView2.R(false);
            }
            KeyboardJni.updateEnterOkTextForSpeech(false, str);
        } else if (speechStatus == SpeechStatus.KTryStart) {
            IAppGlobals.a.j("Asr-Flow-OfflineHint", "dismissHint");
            InputView inputView3 = ImeService.x;
            if (inputView3 != null) {
                com.bytedance.android.input.k.b.a.v(inputView3, ToolbarType.HINTS, null, 2, null);
            }
            String string = IAppGlobals.a.getContext().getString(C0838R.string.asr_start);
            kotlin.s.c.l.e(string, "IAppGlobals.context.getString(R.string.asr_start)");
            t0(string, false, false);
            KeyboardJni.updateEnterOkTextForSpeech(true, str);
        } else if (speechStatus == SpeechStatus.KStoping) {
            IAppGlobals.a.j("Asr-Flow-OfflineHint", "dismissHint");
            InputView inputView4 = ImeService.x;
            if (inputView4 != null) {
                com.bytedance.android.input.k.b.a.v(inputView4, ToolbarType.HINTS, null, 2, null);
            }
            if (!q && (inputView = ImeService.x) != null) {
                inputView.R(true);
            }
            String string2 = IAppGlobals.a.getContext().getString(C0838R.string.asr_recognize);
            kotlin.s.c.l.e(string2, "IAppGlobals.context.getS…g(R.string.asr_recognize)");
            t0(string2, true, false);
            KeyboardJni.updateEnterOkTextForSpeech(false, str);
        } else if (speechStatus == speechStatus3 && IInputSettings.a.d().c()) {
            KeyboardJni.updateEnterOkTextForSpeech(true, str);
        }
        KeyboardJni.getKeyboardJni().updateSpeechTip(i.ordinal(), str);
    }

    static /* synthetic */ void v0(AsrManager asrManager, SpeechStatus speechStatus, String str, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        asrManager.u0(speechStatus, str, z2);
    }

    private final com.bytedance.android.input.popup.r z() {
        return (com.bytedance.android.input.popup.r) x.getValue();
    }

    public final boolean A() {
        return q;
    }

    public final String B(String str) {
        kotlin.s.c.l.f(str, "text");
        String str2 = t.get(str);
        return str2 == null ? v.get(str) : str2;
    }

    public final void D() {
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "init");
        AsrContext asrContext = AsrContext.a;
        C0795d.l(C0800f0.a, S.b(), null, new t(null), 2, null);
        SettingsConfigNext.a.j(w);
        com.bytedance.android.input.speech.M.k.a.r();
    }

    public final boolean E() {
        StringBuilder M = e.a.a.a.a.M("[hand_write] isAsrSpeechingStatus mCurrentUIStatus = ");
        M.append(i);
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", M.toString());
        return i == SpeechStatus.KTryStart || i == SpeechStatus.KStart;
    }

    public final boolean F() {
        return i == SpeechStatus.KStoping;
    }

    public final boolean G() {
        return f3060d;
    }

    public final boolean H() {
        return kotlin.s.c.l.a(com.bytedance.android.input.speech.view.l.a.r().getValue(), Boolean.TRUE);
    }

    public final void N(String str, String str2, boolean z2) {
        kotlin.s.c.l.f(str, "errorName");
        kotlin.s.c.l.f(str2, DBDefinition.TASK_ID);
        if (kotlin.s.c.l.a(com.bytedance.android.input.speech.view.l.a.r().getValue(), Boolean.TRUE) || z2) {
            e.a.a.a.a.N0(e.a.a.a.a.W("AsrState-netErrorProcess errorName = ", str, ", taskId = ", str2, ", beforeStart = "), z2, "Asr-Flow-AsrManager");
            v0(this, SpeechStatus.KErrorShowState, null, false, 6);
            IAppGlobals.a aVar = IAppGlobals.a;
            String string = aVar.getContext().getString(C0838R.string.asr_net_error_tip);
            kotlin.s.c.l.e(string, "IAppGlobals.context.getS…string.asr_net_error_tip)");
            t0(string, true, true);
            UserInteractiveManagerNext.a.b();
            p0(true, "netError");
            String string2 = aVar.getContext().getString(C0838R.string.asr_offline_model_download_tip_show);
            kotlin.s.c.l.e(string2, "IAppGlobals.context.getS…_model_download_tip_show)");
            Object f2 = SettingsConfigNext.f(string2);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) f2).booleanValue();
            com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "popDownloadOfflineTip canShow = " + booleanValue);
            if (!booleanValue) {
                int intValue = ((Integer) e.a.a.a.a.L0(aVar, C0838R.string.asr_offline_download_way, "IAppGlobals.context.getS…asr_offline_download_way)", "null cannot be cast to non-null type kotlin.Int")).intValue();
                int i2 = aVar.o().getInt(aVar.getContext().getString(C0838R.string.asr_offline_model_download_error_time), 0);
                r = i2;
                if (intValue == 3) {
                    int i3 = i2 + 1;
                    r = i3;
                    if (i3 == 3) {
                        com.bytedance.android.input.speech.M.k.a.o();
                    }
                    aVar.o().edit().putInt(aVar.getContext().getString(C0838R.string.asr_offline_model_download_error_time), r).apply();
                }
                e.a.a.a.a.C0(e.a.a.a.a.N("popDownloadOfflineTip downloadWay = ", intValue, ", mDownloadErrorThree = "), r, "Asr-Flow-AsrManager");
            } else if (com.bytedance.android.input.speech.M.k.a.x()) {
                com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "popDownloadOfflineTip OfflineModelManager.modelExist");
            } else {
                if (F == null) {
                    final com.bytedance.android.input.popup.i iVar = new com.bytedance.android.input.popup.i(aVar.getApplication(), WindowId.CONFIRM_DOWNLOAD_MODEL_TIPS_UI, 2, C0838R.layout.layout_asr_download_model_tip, true);
                    iVar.y(new View.OnClickListener() { // from class: com.bytedance.android.input.speech.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            com.bytedance.android.input.popup.i iVar2 = com.bytedance.android.input.popup.i.this;
                            kotlin.s.c.l.f(iVar2, "$this_apply");
                            StringBuilder sb = new StringBuilder();
                            sb.append("click right isWifi = ");
                            IAppGlobals.a aVar2 = IAppGlobals.a;
                            sb.append(NetworkUtils.j(aVar2.getApplication()));
                            com.bytedance.android.input.r.j.i("Asr-Flow-AsrManager", sb.toString());
                            String string3 = aVar2.getContext().getString(C0838R.string.asr_offline_download_way);
                            kotlin.s.c.l.e(string3, "IAppGlobals.context.getS…asr_offline_download_way)");
                            SettingsConfigNext.l(string3, 2);
                            Intent intent = new Intent();
                            intent.setAction(SettingsActivityNext.MAIN_PROCESS_UPDATE_PREFERENCE);
                            intent.putExtra("download_way", 2);
                            aVar2.getContext().sendBroadcast(intent);
                            String string4 = aVar2.getContext().getString(C0838R.string.asr_offline_model_download_tip_show);
                            kotlin.s.c.l.e(string4, "IAppGlobals.context.getS…_model_download_tip_show)");
                            SettingsConfigNext.l(string4, Boolean.FALSE);
                            if (!NetworkUtils.j(aVar2.getApplication())) {
                                C0603x.f2629e.e(C0838R.string.asr_download_model_tip_wifi_choose);
                            }
                            iVar2.dismiss();
                        }
                    });
                    iVar.v(new View.OnClickListener() { // from class: com.bytedance.android.input.speech.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            com.bytedance.android.input.popup.i iVar2 = com.bytedance.android.input.popup.i.this;
                            kotlin.s.c.l.f(iVar2, "$this_apply");
                            IAppGlobals.a aVar2 = IAppGlobals.a;
                            SettingsConfigNext.l(e.a.a.a.a.e(aVar2, C0838R.string.asr_offline_download_way, "IAppGlobals.context.getS…asr_offline_download_way)"), 1);
                            Intent intent = new Intent(aVar2.getContext(), (Class<?>) SettingsActivityNext.class);
                            intent.addFlags(268468224);
                            intent.putExtra(SettingsActivityNext.EXTRA_OFFLINE_MODEL_DOWNLOAD_WAY, 1);
                            SettingsActivityNext.FragmentType[] values = SettingsActivityNext.FragmentType.values();
                            SettingsActivityNext.FragmentType fragmentType = SettingsActivityNext.FragmentType.OFFLINE_DOWNLOAD;
                            intent.putExtra(SettingsActivityNext.EXTRA_FRAGMENT_TYPE, values[14].name());
                            intent.putExtra(SettingsActivityNext.EXTRA_SETTINGS_SOURCE, SettingsActivityNext.SETTINGS_SOURCE_KEYBOARD);
                            aVar2.getContext().startActivity(intent);
                            String string3 = aVar2.getContext().getString(C0838R.string.asr_offline_model_download_tip_show);
                            kotlin.s.c.l.e(string3, "IAppGlobals.context.getS…_model_download_tip_show)");
                            SettingsConfigNext.l(string3, Boolean.FALSE);
                            iVar2.dismiss();
                        }
                    });
                    iVar.q(new View.OnClickListener() { // from class: com.bytedance.android.input.speech.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            com.bytedance.android.input.popup.i iVar2 = com.bytedance.android.input.popup.i.this;
                            kotlin.s.c.l.f(iVar2, "$this_apply");
                            IAppGlobals.a aVar2 = IAppGlobals.a;
                            SettingsConfigNext.l(e.a.a.a.a.e(aVar2, C0838R.string.asr_offline_download_way, "IAppGlobals.context.getS…asr_offline_download_way)"), 3);
                            Intent intent = new Intent();
                            intent.setAction(SettingsActivityNext.MAIN_PROCESS_UPDATE_PREFERENCE);
                            intent.putExtra("download_way", 3);
                            aVar2.getContext().sendBroadcast(intent);
                            C0603x.f2629e.e(C0838R.string.asr_download_model_tip_close);
                            String string3 = aVar2.getContext().getString(C0838R.string.asr_offline_model_download_tip_show);
                            kotlin.s.c.l.e(string3, "IAppGlobals.context.getS…_model_download_tip_show)");
                            SettingsConfigNext.l(string3, Boolean.FALSE);
                            iVar2.dismiss();
                        }
                    });
                    F = iVar;
                }
                com.bytedance.android.input.popup.q.f().m(F, 0);
            }
            if (str.length() > 0) {
                n(str, str2);
            }
        }
    }

    public final void O(String str) {
        kotlin.s.c.l.f(str, DBDefinition.TASK_ID);
        if (kotlin.s.c.l.a(com.bytedance.android.input.speech.view.l.a.r().getValue(), Boolean.TRUE)) {
            com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "mNoVoiceToLong ");
            h0("10s_no_voice", false);
            v0(this, SpeechStatus.KErrorShowState, null, false, 6);
            String string = IAppGlobals.a.getContext().getString(C0838R.string.asr_no_voice_error_tip);
            kotlin.s.c.l.e(string, "IAppGlobals.context.getS…g.asr_no_voice_error_tip)");
            t0(string, true, true);
            UserInteractiveManagerNext.a.b();
            p0(true, "noResponseToLong");
        }
    }

    public final void P(int i2) {
        L(e.a.a.a.a.j("notifyAsrInterrupt interruptType = ", i2));
        IAsr a2 = IAsr.a.a(IAsr.Type.SDK);
        if (a2 != null) {
            a2.f(i2);
        }
    }

    public final void Q() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        if (aVar.d().k()) {
            M("onFinishInput asr has stopped");
        } else {
            p0(true, "onFinishInput");
        }
    }

    public final void R() {
        com.bytedance.android.input.popup.i iVar;
        try {
            com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "onFinishInputView mHaveVoiceText = " + l + ", mModifyCount = " + m);
            boolean z2 = false;
            h0("input_window_hide", false);
            p = false;
            p0(true, "onFinishInputView");
            b0("deactive", m);
            y.postDelayed(E, com.heytap.mcssdk.constant.a.q);
            com.bytedance.android.input.popup.i iVar2 = F;
            if (iVar2 != null && iVar2.isShowing()) {
                z2 = true;
            }
            if (z2 && (iVar = F) != null) {
                iVar.dismiss();
            }
            y yVar = y.a;
            com.bytedance.android.input.basic.d.a.a(RunnableC0616k.a);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("onFinishInputView error=");
            M.append(e2.getMessage());
            com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", M.toString());
        }
    }

    public final void S() {
        Object J2;
        com.bytedance.android.input.basic.settings.api.c.a d2;
        List<String> m2;
        kotlin.g gVar;
        Long l2;
        StringBuilder M = e.a.a.a.a.M("onReStartInputView mHaveVoiceText = ");
        M.append(l);
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", M.toString());
        boolean z2 = false;
        h0("send_action", false);
        p = false;
        try {
            IInputSettings.a aVar = IInputSettings.a;
            Objects.requireNonNull(aVar);
            d2 = aVar.d();
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        if (d2.k() && ((m2 = d2.m()) == null || !m2.contains(IAppGlobals.a.H()))) {
            if (d2.n()) {
                IAppGlobals.a aVar2 = IAppGlobals.a;
                if (TextUtils.equals("com.xingin.xhs", aVar2.H())) {
                    Context context = aVar2.getContext();
                    kotlin.s.c.l.f(context, "context");
                    kotlin.s.c.l.f("com.xingin.xhs", DBDefinition.PACKAGE_NAME);
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        int i2 = Build.VERSION.SDK_INT;
                        PackageInfo packageInfo = i2 >= 28 ? packageManager.getPackageInfo("com.xingin.xhs", 128) : packageManager.getPackageInfo("com.xingin.xhs", 0);
                        gVar = new kotlin.g(packageInfo.versionName, Long.valueOf(i2 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
                    } catch (PackageManager.NameNotFoundException unused) {
                        gVar = null;
                    }
                    if (gVar != null && (l2 = (Long) gVar.d()) != null && l2.longValue() >= 9120801) {
                    }
                }
            }
            J2 = kotlin.o.a;
            Throwable b2 = kotlin.h.b(J2);
            if (b2 != null) {
                IAppGlobals.a.e("AppAudioCompat", "onFailure = " + b2);
            }
            z2 = true;
        }
        if (z2) {
            p0(true, "send");
        } else {
            M("not stop Asr");
        }
        f3063g.k();
        b0("send_clicked", m);
        com.bytedance.android.input.speech.view.l.a.b();
    }

    public final void T() {
        StringBuilder M = e.a.a.a.a.M("onStartInputView = ");
        IAsr.b bVar = IAsr.a;
        IAsr.Type type = IAsr.Type.SDK;
        M.append(bVar.a(type));
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", M.toString());
        D();
        y.removeCallbacks(E);
        boolean z2 = !com.bytedance.apm.util.j.b(IAppGlobals.a.getContext()) && f3063g.h();
        IAsr a2 = bVar.a(type);
        if (a2 != null) {
            a2.d(z2);
        }
        l = false;
        com.bytedance.android.input.speech.view.l.a.b();
        com.bytedance.android.input.speech.M.k.a.C();
    }

    public final void U(String str) {
        kotlin.s.c.l.f(str, DBDefinition.TASK_ID);
        y yVar = y.a;
        y.b("[Android][asr] start success");
        d0("Input_voiceinput");
        v0(this, SpeechStatus.KStart, null, false, 6);
        k = SystemClock.uptimeMillis();
        com.bytedance.android.input.speech.view.l.a.C();
        f3059c.r(str);
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "onStartSuccess");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(boolean r16, int r17, int r18, int r19, int r20, com.bytedance.android.input.editor.SelectionTracker.ActionType r21) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.AsrManager.V(boolean, int, int, int, int, com.bytedance.android.input.editor.SelectionTracker$ActionType):void");
    }

    public final void W() {
        M("onWindowShown");
        if (H()) {
            IInputSettings.a aVar = IInputSettings.a;
            Objects.requireNonNull(aVar);
            List<String> w2 = aVar.d().w();
            if (w2 != null && w2.contains(IAppGlobals.a.H())) {
                M("onWindowShown stop asr");
                p0(true, "onWindowShown");
                InputView inputView = ImeService.x;
                if (inputView != null) {
                    inputView.Q(false);
                }
            }
        }
    }

    public final void X() {
        if (z().isShowing()) {
            z().dismiss();
        }
    }

    public final void Y(IAsr.ErrorType errorType, int i2, String str) {
        kotlin.s.c.l.f(errorType, "errorType");
        kotlin.s.c.l.f(str, DBDefinition.TASK_ID);
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "processAsrError type = " + errorType + ", code = " + i2);
        switch (errorType) {
            case CREATE_HANDLE_ERROR:
                h0("error_create_handle", true);
                p0(true, "");
                c0(9);
                break;
            case CREATE_HANDLE_ERROR_DID_OFFLINE_MODE_NULL:
                h0("error_create_handle", true);
                kotlin.s.c.l.f("did_offline_mode_null", "errorName");
                kotlin.s.c.l.f(str, DBDefinition.TASK_ID);
                if (kotlin.s.c.l.a(com.bytedance.android.input.speech.view.l.a.r().getValue(), Boolean.TRUE)) {
                    M("AsrState- did or offline model is null, prompt user");
                    v0(this, SpeechStatus.KErrorShowState, null, false, 6);
                    String string = IAppGlobals.a.getContext().getString(C0838R.string.asr_net_error_tip);
                    kotlin.s.c.l.e(string, "IAppGlobals.context.getS…string.asr_net_error_tip)");
                    t0(string, true, true);
                    UserInteractiveManagerNext.a.b();
                    p0(true, "netError");
                    if ("did_offline_mode_null".length() > 0) {
                        n("did_offline_mode_null", str);
                    }
                }
                c0(9);
                break;
            case NET_ERROR:
                h0("error_net_error", true);
                N("net_error", str, false);
                c0(i2);
                break;
            case ODIN_AUTH_FAILED:
                h0("odin_auth_failed", true);
                N("odin_auth", str, false);
                c0(15);
                break;
            case OFFLINE_RESPONSE_ERROR:
                h0("error_offline_response", true);
                p0(true, "");
                c0(10);
                break;
            case SERVER_ERROR:
                h0("error_server_error", true);
                if (kotlin.s.c.l.a(com.bytedance.android.input.speech.view.l.a.r().getValue(), Boolean.TRUE)) {
                    v0(this, SpeechStatus.KErrorShowState, null, false, 6);
                    String string2 = IAppGlobals.a.getContext().getString(C0838R.string.asr_service_error_tip);
                    kotlin.s.c.l.e(string2, "IAppGlobals.context.getS…ng.asr_service_error_tip)");
                    t0(string2, true, true);
                    UserInteractiveManagerNext.a.b();
                    p0(true, "serviceError");
                    n("service", str);
                }
                c0(14);
                break;
            case NET_SWITCH:
                IAppGlobals.a aVar = IAppGlobals.a;
                String string3 = aVar.getContext().getString(C0838R.string.asr_switch_cell_tips_is_shown);
                kotlin.s.c.l.e(string3, "IAppGlobals.context.getS…witch_cell_tips_is_shown)");
                Object f2 = SettingsConfigNext.f(string3);
                Boolean bool = f2 instanceof Boolean ? (Boolean) f2 : null;
                Boolean bool2 = Boolean.TRUE;
                boolean a2 = kotlin.s.c.l.a(bool, bool2);
                com.bytedance.android.input.r.j.m("AsrPunctSettingsGuide", "AsrPunctSettingsGuide begin show --switchCellTipsIsShown = " + a2);
                if (!a2) {
                    KeyboardJni.showGuideTips(aVar.getContext().getString(C0838R.string.asr_switch_cell_setting_guide_text), "", WindowId.ASR_SWITCH_CELL_SETTINGS_TIPS_UI);
                    com.bytedance.android.input.r.j.m("AsrPunctSettingsGuide", "setSwitchCellTipsIsShown");
                    String string4 = aVar.getContext().getString(C0838R.string.asr_switch_cell_tips_is_shown);
                    kotlin.s.c.l.e(string4, "IAppGlobals.context.getS…witch_cell_tips_is_shown)");
                    SettingsConfigNext.l(string4, bool2);
                    break;
                }
                break;
        }
    }

    public final void Z(String str, boolean z2) {
        kotlin.s.c.l.f(str, "textOriginal");
        M("processAsrResult isFinish = " + z2 + ", don't Commit = " + f3060d + " text = " + str.length());
        if (z2) {
            M(e.a.a.a.a.n("************  asr_vad = ", com.bytedance.android.input.common.u.e.c("asr_vad")));
        } else {
            com.bytedance.android.input.common.u.e.a("asr_vad");
            m = 0L;
        }
        if (f3060d) {
            return;
        }
        if (((Boolean) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.is_hant_enabled, "IAppGlobals.context.getS…R.string.is_hant_enabled)", "null cannot be cast to non-null type kotlin.Boolean")).booleanValue()) {
            str = KeyboardJni.GetHansOrHant(2, str);
            kotlin.s.c.l.e(str, "GetHansOrHant(KeyboardJn…ANS_2_HANT, textOriginal)");
        }
        String str2 = h;
        h = str;
        L("processAsrResult isFinish = " + z2 + ", lastText = " + str2);
        StringBuilder X = e.a.a.a.a.X("processAsrResult isFinish = ", z2, ", mAsrText = ");
        X.append(h);
        L(X.toString());
        if (z2) {
            String str3 = h;
            StringBuilder M = e.a.a.a.a.M("processFinishAsrResult don't commit ");
            M.append(f3060d);
            M(M.toString());
            if (!f3060d) {
                if (KeyboardJni.getKeyboardJni().onAsrSetPreedit(str3)) {
                    L(e.a.a.a.a.s("processFinishAsrResult onAsrSetPreedit asrText = ", str3));
                    KeyboardJni.getKeyboardJni().onAsrCommitPreeditText();
                    f3063g.n(true);
                } else {
                    L(e.a.a.a.a.s("processFinishAsrResult updateAndFinishVoiceComposingText asrText = ", str3));
                    f3063g.p(str3);
                    d0("Input_voiceinputshow");
                }
            }
            AsrContext.a.f0(h, b.s(), z2);
            com.bytedance.android.input.speech.modifypair.d.a.v(h, "asr", true);
        } else if (!TextUtils.equals(str2, h)) {
            L("processAsrResult lastText != mAsrText");
            AsrContext.a.f0(h, b.s(), z2);
            String str4 = h;
            StringBuilder M2 = e.a.a.a.a.M("processPartialAsrResult mDontCommit = ");
            M2.append(f3060d);
            M2.append(", asrText = ");
            M2.append(str4);
            L(M2.toString());
            if (!f3060d) {
                if (kotlin.s.c.l.a(com.bytedance.android.input.speech.view.l.a.r().getValue(), Boolean.FALSE)) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        Handler handler = y;
                        Runnable runnable = B;
                        if (handler.hasCallbacks(runnable)) {
                            handler.removeCallbacks(runnable);
                            handler.postDelayed(runnable, com.heytap.mcssdk.constant.a.r);
                        }
                    }
                    Handler handler2 = y;
                    Runnable runnable2 = B;
                    handler2.removeCallbacks(runnable2);
                    handler2.postDelayed(runnable2, com.heytap.mcssdk.constant.a.r);
                }
                if (KeyboardJni.getKeyboardJni().onAsrSetPreedit(str4)) {
                    f3063g.n(true);
                } else {
                    f3063g.q(str4);
                }
            }
        }
        com.bytedance.android.input.speech.view.l.a.A(h, z2);
    }

    public final void e0(String str, long j2) {
        kotlin.s.c.l.f(str, NotificationCompat.CATEGORY_EVENT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CrashHianalyticsData.TIME, j2);
            jSONObject.put("app_name", IAppGlobals.a.H());
            IAppLog.a.t(str, jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void f0(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (k > 0) {
                jSONObject.put(CrashHianalyticsData.TIME, SystemClock.uptimeMillis() - k);
                jSONObject.put("commit", i2);
                jSONObject.put("app_name", IAppGlobals.a.H());
                IAppLog.a.t("input_voiceinputuseduration", jSONObject);
            }
            k = 0L;
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void g0(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("voice_wordcount", i2);
            jSONObject.put("app_name", IAppGlobals.a.H());
            IAppLog.a.t("Input_voicedone", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void j(com.bytedance.android.input.speech.L.b bVar) {
        kotlin.s.c.l.f(bVar, "audioRecordListener");
        f3059c.m(bVar);
    }

    public final void j0(String str) {
        kotlin.s.c.l.f(str, "jsonString");
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrManager", "[DeleteAssociate] jsonString = " + str);
        t.clear();
        u.clear();
        v.clear();
        C0795d.b(C0800f0.a, S.b(), null, new e(str, null), 2, null);
    }

    public final void k() {
        if (f3061e.c()) {
            com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "audioFocusChange");
            h0("audio_focus_change", false);
            p0(false, "");
        }
    }

    public final void k0(boolean z2) {
        l = z2;
    }

    public final void l() {
        StringBuilder M = e.a.a.a.a.M("flow[main]: asrStreamFinished start = ");
        com.bytedance.android.input.speech.view.l lVar = com.bytedance.android.input.speech.view.l.a;
        M.append(lVar.r().getValue());
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", M.toString());
        if (kotlin.s.c.l.a(lVar.r().getValue(), Boolean.FALSE)) {
            if (Build.VERSION.SDK_INT >= 29) {
                Handler handler = y;
                Runnable runnable = B;
                if (handler.hasCallbacks(runnable)) {
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(C, 6000L);
                    return;
                }
            }
            Handler handler2 = y;
            handler2.removeCallbacks(B);
            handler2.postDelayed(C, 6000L);
        }
    }

    public final void l0(boolean z2) {
        D = z2;
    }

    public final void m(boolean z2) {
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "StopAsr from AudioStop isSilence " + z2);
        if (z2) {
            h0("audio_silence", false);
            c0(8);
        } else {
            h0("error_audio_open", true);
            c0(7);
        }
        y.post(new Runnable() { // from class: com.bytedance.android.input.speech.g
            @Override // java.lang.Runnable
            public final void run() {
                AsrManager asrManager = AsrManager.a;
                AsrManager.v0(asrManager, AsrManager.SpeechStatus.KErrorShowState, null, false, 6);
                String string = IAppGlobals.a.getContext().getString(C0838R.string.asr_start_record_error_tip);
                kotlin.s.c.l.e(string, "IAppGlobals.context.getS…r_start_record_error_tip)");
                asrManager.t0(string, true, true);
                UserInteractiveManagerNext.a.b();
                asrManager.p0(true, "");
            }
        });
    }

    public final boolean n0(String str) {
        kotlin.s.c.l.f(str, "from");
        y yVar = y.a;
        y.b("[Android][asr] start asr: from = " + str);
        boolean z2 = true;
        p0(true, "nextStart");
        if (f3062f.a(true)) {
            K k2 = f3059c;
            if (!k2.q()) {
                p();
            }
            if (k2.a()) {
                q = TextUtils.equals(str, "tool");
                StringBuilder M = e.a.a.a.a.M("StartAsr: start mHaveVoiceText = ");
                M.append(l);
                com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", M.toString());
                AsrContext asrContext = AsrContext.a;
                asrContext.p();
                b0("next_asr_start", m);
                p = true;
                h = "";
                if (k2.n()) {
                    m0(true);
                    com.bytedance.android.input.speech.view.l.a.w(true);
                    v0(this, SpeechStatus.KTryStart, str, false, 4);
                    f3063g.l();
                    asrContext.i0();
                    asrContext.Q();
                    asrContext.U(true);
                    n.put("from", str);
                    f3061e.e();
                    f3060d = false;
                    b.y(asrContext.t(), str);
                    e.a.a.a.a.q0("reason", str, IAppLog.a, "input_voiceinput_startfrom");
                    d0("asr_start");
                    y.b("[Android][asr] start asr end");
                    return z2;
                }
                com.bytedance.android.input.r.j.j("Asr-Flow-AsrManager", "startAsr: check audio not available.");
                C0603x.a.c(C0603x.f2629e, C0838R.string.asr_start_record_error_tip, 0L, 2);
                UserInteractiveManagerNext.a.b();
            } else {
                m(false);
            }
        }
        z2 = false;
        y.b("[Android][asr] start asr end");
        return z2;
    }

    public final kotlin.g<String, String> o(String str) {
        kotlin.s.c.l.f(str, "text");
        Map<String, String> map = t;
        if (!map.isEmpty()) {
            if (!(str.length() == 0)) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (kotlin.text.a.g(str, key, false, 2, null)) {
                        return new kotlin.g<>(key, value);
                    }
                }
                for (Map.Entry<String, String> entry2 : v.entrySet()) {
                    String key2 = entry2.getKey();
                    String value2 = entry2.getValue();
                    if (kotlin.text.a.g(str, key2, false, 2, null)) {
                        return new kotlin.g<>(key2, value2);
                    }
                }
            }
        }
        return null;
    }

    public final void o0() {
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "startRecordFirst");
        if (f3062f.a(false)) {
            p();
            if (!f3059c.a()) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a9, code lost:
    
        if ((com.bytedance.android.input.speech.AsrManager.f3063g.g().length() > 0) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(boolean r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.AsrManager.p0(boolean, java.lang.String):void");
    }

    public final void q(String str) {
        kotlin.s.c.l.f(str, DBDefinition.TASK_ID);
        h0("error_start_timeout", true);
        N("create_handle_outTime", str, false);
        c0(11);
    }

    public final void q0() {
        i0(this, "AsrStopTime", 0L, false, null, 14);
        i0(this, "LongPressStop", 1L, false, null, 12);
        b.u();
        y.postDelayed(new Runnable() { // from class: com.bytedance.android.input.speech.f
            @Override // java.lang.Runnable
            public final void run() {
                AsrManager asrManager = AsrManager.a;
                com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "stopAsrDelay");
                AsrManager.a.p0(false, "");
            }
        }, 150L);
    }

    public final void r() {
        IAppGlobals.a.j("Asr-Flow-OfflineHint", "dismissHint");
        InputView inputView = ImeService.x;
        if (inputView != null) {
            com.bytedance.android.input.k.b.a.v(inputView, ToolbarType.HINTS, null, 2, null);
        }
    }

    public final boolean s() {
        long currentTimeMillis = System.currentTimeMillis();
        r();
        L("dispatchKeyboardActionDown cost time = " + (System.currentTimeMillis() - currentTimeMillis));
        return false;
    }

    public final void s0() {
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "stopRecordFirst");
        if (H()) {
            return;
        }
        f3059c.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r6 == 4) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(final int r6, final long r7) {
        /*
            r5 = this;
            com.bytedance.android.doubaoime.KeyboardJni$EnterActionType r0 = com.bytedance.android.doubaoime.KeyboardJni.EnterActionType.kIME_ACTION_SEND_EXPRESSION
            r0 = 8
            if (r6 == r0) goto Lb
            com.bytedance.android.doubaoime.KeyboardJni$EnterActionType r0 = com.bytedance.android.doubaoime.KeyboardJni.EnterActionType.kIME_ACTION_SEND
            r0 = 4
            if (r6 != r0) goto L11
        Lb:
            com.bytedance.android.input.speech.AsrContext r0 = com.bytedance.android.input.speech.AsrContext.a
            r1 = 0
            r0.U(r1)
        L11:
            com.bytedance.android.input.basic.settings.api.IInputSettings$a r0 = com.bytedance.android.input.basic.settings.api.IInputSettings.a
            com.bytedance.android.input.basic.settings.api.c.a r1 = r0.d()
            boolean r1 = r1.u()
            if (r1 != 0) goto L2e
            java.lang.String r0 = "Asr-Flow-AsrManager"
            java.lang.String r1 = "DoAsrSend waitAllAsrBackEnable = false"
            com.bytedance.android.input.r.j.i(r0, r1)
            r0 = 1
            java.lang.String r1 = "send"
            r5.p0(r0, r1)
            r5.a0(r6, r7)
            return
        L2e:
            com.bytedance.android.input.basic.settings.api.c.a r0 = r0.d()
            long r0 = r0.v()
            com.bytedance.android.input.speech.AsrContext r2 = com.bytedance.android.input.speech.AsrContext.a
            boolean r2 = r2.m()
            kotlin.s.c.z r3 = new kotlin.s.c.z
            r3.<init>()
            com.bytedance.android.input.speech.AsrManager$b r4 = new com.bytedance.android.input.speech.AsrManager$b
            r4.<init>(r3, r7)
            com.bytedance.android.input.speech.AsrManager.z = r4
            com.bytedance.android.input.speech.b r4 = new com.bytedance.android.input.speech.b
            r4.<init>()
            com.bytedance.android.input.speech.AsrManager.A = r4
            if (r2 != 0) goto L78
            boolean r6 = com.bytedance.android.input.speech.AsrManager.l
            if (r6 != 0) goto L56
            goto L78
        L56:
            com.bytedance.android.input.speech.z r6 = com.bytedance.android.input.speech.AsrManager.b
            r6.A()
            com.bytedance.android.input.speech.L.a r7 = com.bytedance.android.input.speech.AsrManager.z
            r6.w(r7)
            java.lang.Runnable r6 = com.bytedance.android.input.speech.AsrManager.A
            if (r6 == 0) goto L96
            com.bytedance.android.input.speech.AsrManager r7 = com.bytedance.android.input.speech.AsrManager.a
            java.lang.String r8 = "DoAsrSend currentAllAsrBack false, waiting timeout maxTime = "
            java.lang.String r8 = e.a.a.a.a.n(r8, r0)
            r7.L(r8)
            android.os.Handler r7 = com.bytedance.android.input.speech.AsrManager.G
            r7.removeCallbacks(r6)
            r7.postDelayed(r6, r0)
            goto L96
        L78:
            java.lang.String r6 = "DoAsrSend currentAllAsrBack true mHaveVoiceText = "
            java.lang.StringBuilder r6 = e.a.a.a.a.M(r6)
            boolean r7 = com.bytedance.android.input.speech.AsrManager.l
            r6.append(r7)
            java.lang.String r7 = ", prepare doSendAction "
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.L(r6)
            java.lang.Runnable r6 = com.bytedance.android.input.speech.AsrManager.A
            if (r6 == 0) goto L96
            r6.run()
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.AsrManager.t(int, long):void");
    }

    public final void t0(String str, boolean z2, boolean z3) {
        kotlin.s.c.l.f(str, "text");
        if (q) {
            InputView inputView = ImeService.x;
            if (inputView != null) {
                inputView.h0(str, Boolean.valueOf(z2), Boolean.TRUE, Boolean.valueOf(z3));
                return;
            }
            return;
        }
        InputView inputView2 = ImeService.x;
        if (inputView2 != null) {
            inputView2.h0(str, Boolean.valueOf(z2), Boolean.TRUE, Boolean.valueOf(z3));
        }
        InputView inputView3 = ImeService.x;
        if (inputView3 != null) {
            inputView3.h0(str, Boolean.valueOf(z2), Boolean.valueOf(q), Boolean.valueOf(z3));
        }
    }

    public final void u() {
        f3060d = true;
        StringBuilder M = e.a.a.a.a.M("doUndo mHavePreEdit = ");
        M.append(j);
        M.append(", asrIsStart = ");
        com.bytedance.android.input.speech.view.l lVar = com.bytedance.android.input.speech.view.l.a;
        M.append(lVar.r().getValue());
        M.append(", mDontCommit = ");
        M.append(f3060d);
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrManager", M.toString());
        if (kotlin.s.c.l.a(lVar.r().getValue(), Boolean.TRUE)) {
            if (j) {
                StringBuilder M2 = e.a.a.a.a.M("doUndo mPreCommitWordCount = ");
                M2.append(f3063g.j());
                com.bytedance.android.input.r.j.i("Asr-Flow-AsrManager", M2.toString());
                f3063g.p("");
            }
            p0(true, "undo");
            lVar.A("", false);
        }
    }

    public final void v() {
        if (kotlin.s.c.l.a(com.bytedance.android.input.speech.view.l.a.r().getValue(), Boolean.TRUE)) {
            e.a.a.a.a.q0("stoptype", "cursor", IAppLog.a, "voiceinput_panel_stop");
            com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "Asr: onUpdateSelection curse_move, editIsClick");
            p0(true, "cursorMove");
            InputView inputView = ImeService.x;
            if (inputView != null) {
                inputView.Q(false);
            }
            h0("cursor_move", false);
        }
    }

    public final void w(byte[] bArr, int i2) {
        kotlin.s.c.l.f(bArr, "buffer");
        b.p(bArr, i2);
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.i0(bArr);
        }
    }

    public final void x() {
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "forceVad");
        b.q();
    }

    public final Runnable y() {
        return A;
    }
}
