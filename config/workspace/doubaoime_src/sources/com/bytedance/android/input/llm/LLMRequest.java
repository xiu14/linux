package com.bytedance.android.input.llm;

import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.network.api.IRecommends;
import com.bytedance.android.input.r.j;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.retrofit2.N;
import com.google.gson.Gson;
import com.huawei.hms.push.AttributionReporter;
import com.prolificinteractive.materialcalendarview.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.e;
import kotlin.h;
import kotlin.o;
import kotlin.r.d;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;
import kotlinx.coroutines.G;
import kotlinx.coroutines.S;
import okhttp3.A;
import okhttp3.v;
import okhttp3.w;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class LLMRequest {
    private static a b = null;

    /* renamed from: c, reason: collision with root package name */
    private static int f2840c = 200;
    public static final LLMRequest a = new LLMRequest();

    /* renamed from: d, reason: collision with root package name */
    private static final e f2841d = kotlin.a.c(c.a);

    /* renamed from: e, reason: collision with root package name */
    private static String f2842e = "";

    /* renamed from: f, reason: collision with root package name */
    private static String f2843f = "";

    /* renamed from: g, reason: collision with root package name */
    private static String f2844g = "";
    private static String h = "";
    private static final Map<String, String> i = g.J(new kotlin.g("noWeb", "当前无网络"), new kotlin.g("initFailed", "网络初始化失败"), new kotlin.g("10101", "SDK未初始化动态库"), new kotlin.g("10102", "SDK连接建立中"), new kotlin.g("10103", "SDK建连失败"), new kotlin.g("10104", "SDK连接异常重连中"), new kotlin.g("90100", "SDK请求超时"), new kotlin.g("90101", "SDK获取连接失败"), new kotlin.g("90102", "SDK连接为空"), new kotlin.g("90103", "异常超时"), new kotlin.g("90110", "SDK打开发送信道失败"), new kotlin.g("90111", "无网或者网络质量差"), new kotlin.g("90120", "SDK发送请求失败"), new kotlin.g("90130", "SDK刷新缓冲区失败"), new kotlin.g("90140", "SDK接收消息失败"), new kotlin.g("90900", "SDK未初始化"), new kotlin.g("400", "错误请求"), new kotlin.g("500", "服务响应失败"));

    public enum ErrorCode {
        SUCCESS,
        Timeout,
        NetworkError,
        NoResult,
        ParseError
    }

    private static final class a {
        private final String a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2845c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2846d;

        /* renamed from: e, reason: collision with root package name */
        private final String f2847e;

        public a(String str, String str2, String str3, String str4, String str5) {
            l.f(str, WsConstants.KEY_APP_ID);
            l.f(str2, "did");
            l.f(str3, AttributionReporter.APP_VERSION);
            l.f(str4, "appId");
            l.f(str5, "osType");
            this.a = str;
            this.b = str2;
            this.f2845c = str3;
            this.f2846d = str4;
            this.f2847e = str5;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.f2846d;
        }

        public final String c() {
            return this.f2845c;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.f2847e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.a, aVar.a) && l.a(this.b, aVar.b) && l.a(this.f2845c, aVar.f2845c) && l.a(this.f2846d, aVar.f2846d) && l.a(this.f2847e, aVar.f2847e);
        }

        public int hashCode() {
            return this.f2847e.hashCode() + e.a.a.a.a.p0(this.f2846d, e.a.a.a.a.p0(this.f2845c, e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("DeviceInfo(aid=");
            M.append(this.a);
            M.append(", did=");
            M.append(this.b);
            M.append(", appVersion=");
            M.append(this.f2845c);
            M.append(", appId=");
            M.append(this.f2846d);
            M.append(", osType=");
            return e.a.a.a.a.G(M, this.f2847e, ')');
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.llm.LLMRequest$asyncReportLlmEvent$1", f = "LLMRequest.kt", l = {}, m = "invokeSuspend")
    static final class b extends i implements p<G, d<? super o>, Object> {
        final /* synthetic */ long a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ErrorCode f2848c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2849d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2850e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j, int i, ErrorCode errorCode, int i2, String str, d<? super b> dVar) {
            super(2, dVar);
            this.a = j;
            this.b = i;
            this.f2848c = errorCode;
            this.f2849d = i2;
            this.f2850e = str;
        }

        @Override // kotlin.r.h.a.a
        public final d<o> create(Object obj, d<?> dVar) {
            return new b(this.a, this.b, this.f2848c, this.f2849d, this.f2850e, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, d<? super o> dVar) {
            b bVar = new b(this.a, this.b, this.f2848c, this.f2849d, this.f2850e, dVar);
            o oVar = o.a;
            bVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            r.k0(obj);
            try {
                LLMRequest lLMRequest = LLMRequest.a;
                long j = this.a;
                int i = this.b;
                ErrorCode errorCode = this.f2848c;
                int i2 = this.f2849d;
                String str = this.f2850e;
                if (str == null) {
                    str = "";
                }
                LLMRequest.a(lLMRequest, j, i, errorCode, i2, str);
            } catch (Exception e2) {
                e.a.a.a.a.o0("asyncReportLlmEvent error: ", e2, "LLMRequest");
            }
            return o.a;
        }
    }

    static final class c extends m implements kotlin.s.b.a<Gson> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Gson invoke() {
            return new Gson();
        }
    }

    private LLMRequest() {
    }

    public static final void a(LLMRequest lLMRequest, long j, int i2, ErrorCode errorCode, int i3, String str) {
        IAppLog.a aVar = IAppLog.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("err_code", errorCode.ordinal());
        jSONObject.put("llm_timeout", f2840c);
        jSONObject.put("cost_ms", j);
        jSONObject.put("server_use_time", i2);
        jSONObject.put("net_use_time", j - i2);
        jSONObject.put("err_msg", str);
        jSONObject.put("subdivisions", f2842e);
        jSONObject.put("city", f2843f);
        jSONObject.put("district", f2844g);
        jSONObject.put("isp", h);
        jSONObject.put("token_length", i3);
        jSONObject.put("keyboard_type", KeyboardJni.getKeyboardJni().getKeyboardType());
        aVar.t("llm_perf", jSONObject);
    }

    private final void b(long j, int i2, ErrorCode errorCode, int i3, String str) {
        C0795d.l(C0800f0.a, S.b(), null, new b(j, i2, errorCode, i3, str, null), 2, null);
    }

    static /* synthetic */ void c(LLMRequest lLMRequest, long j, int i2, ErrorCode errorCode, int i3, String str, int i4) {
        int i5 = i4 & 16;
        lLMRequest.b(j, i2, errorCode, i3, null);
    }

    private final kotlin.g<String, ArrayList<String>> d(String str) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        return new kotlin.g<>("", arrayList);
    }

    public final boolean e(String str, String str2) {
        l.f(str, "bugDesc");
        j.i("LLMRequest", "doFeedback, bugDesc = " + str);
        if (str.length() == 0) {
            return false;
        }
        try {
            N<String> execute = IRecommends.a.l().request(new IRecommends.b(str, "", g.c(""), str2)).execute();
            j.i("LLMRequest", "doFeedback, response is " + execute.a());
            if (execute.f()) {
                try {
                    return new JSONObject(execute.a()).getInt("code") == 0;
                } catch (Throwable th) {
                    r.J(th);
                }
            }
        } catch (Exception e2) {
            e.a.a.a.a.o0("doFeedback, e = ", e2, "LLMRequest");
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ba A[LOOP:0: B:26:0x01b2->B:28:0x01ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02fc A[Catch: Exception -> 0x0482, TryCatch #3 {Exception -> 0x0482, blocks: (B:40:0x02ec, B:45:0x02fc, B:47:0x0335, B:48:0x033b, B:50:0x0354, B:52:0x036a, B:53:0x0377, B:57:0x0380, B:59:0x03af, B:73:0x03f6), top: B:39:0x02ec }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x042c A[Catch: Exception -> 0x04a8, TryCatch #1 {Exception -> 0x04a8, blocks: (B:75:0x03fd, B:76:0x040c, B:78:0x042c, B:80:0x043e, B:82:0x046e, B:84:0x0478, B:94:0x0486), top: B:43:0x02fa }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x043e A[Catch: Exception -> 0x04a8, TryCatch #1 {Exception -> 0x04a8, blocks: (B:75:0x03fd, B:76:0x040c, B:78:0x042c, B:80:0x043e, B:82:0x046e, B:84:0x0478, B:94:0x0486), top: B:43:0x02fa }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0486 A[Catch: Exception -> 0x04a8, TRY_LEAVE, TryCatch #1 {Exception -> 0x04a8, blocks: (B:75:0x03fd, B:76:0x040c, B:78:0x042c, B:80:0x043e, B:82:0x046e, B:84:0x0478, B:94:0x0486), top: B:43:0x02fa }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f9  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.g<java.lang.String, java.util.ArrayList<java.lang.String>> f(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.llm.LLMRequest.f(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):kotlin.g");
    }

    public final String g(String str) {
        l.f(str, "postData");
        if (str.length() == 0) {
            return "";
        }
        try {
            IRecommends.TranslateApi o = IRecommends.a.o();
            Object c2 = new Gson().c(str, com.google.gson.l.class);
            l.e(c2, "Gson().fromJson(postData, JsonObject::class.java)");
            return o.request((com.google.gson.l) c2, false).execute().a();
        } catch (Exception e2) {
            e.a.a.a.a.o0("doTranslate, e = ", e2, "LLMRequest");
            return "";
        }
    }

    public final com.google.gson.l h() {
        com.google.gson.l lVar = new com.google.gson.l();
        lVar.g("subdivisions", f2842e);
        lVar.g("city", f2843f);
        lVar.g("district", f2844g);
        lVar.g("isp", h);
        return lVar;
    }

    public final String i(String str) {
        l.f(str, "errorCode");
        String str2 = i.get(str);
        if (str2 != null) {
            return str2;
        }
        return "未知错误[" + str + ']';
    }

    public final void j(String str, String str2, String str3, String str4) {
        l.f(str, "subdivisions");
        l.f(str2, "city");
        l.f(str3, "district");
        l.f(str4, "isp");
        f2842e = str;
        f2843f = str2;
        f2844g = str3;
        h = str4;
    }

    public final boolean k(String str, String str2) {
        File file;
        Object J2;
        int i2;
        l.f(str, "filePath");
        l.f(str2, "recordId");
        j.i("LLMRequest", "uploadFeedbackVoiceFile, filePath = " + str);
        if (str.length() == 0) {
            j.j("LLMRequest", "uploadFeedbackVoiceFile, file path or token is empty.");
            return false;
        }
        try {
            file = new File(str);
        } catch (Exception e2) {
            e.a.a.a.a.o0("uploadFeedbackVoiceFile, exception occurred: ", e2, "LLMRequest");
        }
        if (!file.exists()) {
            j.j("LLMRequest", "uploadFeedbackVoiceFile, file does not exist: " + str);
            return false;
        }
        byte[] a2 = com.bytedance.android.input.common.b.a(kotlin.io.b.d(file), 16000, 1, 16);
        if (a2 == null) {
            j.j("LLMRequest", "uploadFeedbackVoiceFile, failed to convert PCM to WAV.");
            return false;
        }
        w.b b2 = w.b.b(str2, str2, A.d(v.d("audio/wav"), a2));
        IRecommends.FileUploadApi j = IRecommends.a.j();
        l.e(b2, "body");
        N<String> execute = j.upload(b2).execute();
        j.i("LLMRequest", "uploadFeedbackVoiceFile, response: " + execute.a());
        if (!execute.f() || execute.a() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("uploadFeedbackVoiceFile, request not successful: ");
            sb.append(execute.b());
            sb.append(" - ");
            execute.g();
            sb.append((String) null);
            j.j("LLMRequest", sb.toString());
        } else {
            JSONObject jSONObject = new JSONObject(execute.a());
            try {
                i2 = jSONObject.getInt("code");
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            if (i2 == 0) {
                j.m("LLMRequest", "uploadFeedbackVoiceFile success.");
                return true;
            }
            j.j("LLMRequest", "uploadFeedbackVoiceFile failed with code: " + i2 + ", message: " + jSONObject.optString("message", "unknown error from server"));
            J2 = o.a;
            Throwable b3 = h.b(J2);
            if (b3 != null) {
                j.j("LLMRequest", "uploadFeedbackVoiceFile, failed to parse response JSON: " + b3);
            }
        }
        return false;
    }
}
