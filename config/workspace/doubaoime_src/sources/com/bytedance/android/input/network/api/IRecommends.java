package com.bytedance.android.input.network.api;

import androidx.core.app.NotificationCompat;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.network.api.IRecommends;
import com.bytedance.retrofit2.H;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.InterfaceC0705i;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.R.E;
import com.bytedance.retrofit2.R.G;
import com.bytedance.retrofit2.R.InterfaceC0690a;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.R.InterfaceC0694e;
import com.bytedance.retrofit2.R.InterfaceC0696g;
import com.bytedance.retrofit2.R.n;
import com.bytedance.retrofit2.R.q;
import com.bytedance.retrofit2.R.t;
import com.bytedance.retrofit2.R.v;
import com.bytedance.retrofit2.R.z;
import com.bytedance.retrofit2.S.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.google.gson.annotations.SerializedName;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.s.c.A;
import kotlin.s.c.o;
import okhttp3.w;

/* loaded from: classes.dex */
public interface IRecommends {
    public static final a a = a.a;

    public interface Api {
        @t("/api/v1/ai/process")
        @InterfaceC0696g
        InterfaceC0701e<String> request(@InterfaceC0694e("str_vars") String str, @InterfaceC0694e("streaming") boolean z, @InterfaceC0694e("chain_task") String str2);
    }

    public interface AsrFmtApi {
        @t("/api/v1/asr/fmt")
        @n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public interface AsrRecordApi {
        @t("/api/v1/asr/record")
        @n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public interface CheckAuthApi {
        @com.bytedance.retrofit2.R.h("/api/v1/user/check_auth")
        @n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0690a boolean z);
    }

    public interface CloudConvertAPi {
        @t
        @n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@G String str, @InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public static final class Data {

        /* renamed from: g, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.i<Object>[] f2874g;
        private final String a;
        private final boolean b;

        /* renamed from: c, reason: collision with root package name */
        private final Source f2875c;

        /* renamed from: d, reason: collision with root package name */
        private final com.bytedance.android.input.basic.b.a f2876d;

        /* renamed from: e, reason: collision with root package name */
        private final com.bytedance.android.input.basic.b.a f2877e;

        /* renamed from: f, reason: collision with root package name */
        private Type f2878f;

        public enum Source {
            CHAT,
            POPULAR,
            CIRCLE,
            MAIL,
            EVALUATE,
            BLESSING,
            INVITATION,
            INTRODUCTION,
            OPTIMIZE,
            REWRITE,
            SUMMARY,
            KEYPOINTS,
            LIST,
            INTENTRECOGNIZE,
            BAIKE,
            POLISH,
            EXPANSION
        }

        public enum Type {
            TEXT,
            URI,
            ERROR,
            STREAM_END,
            FINISH,
            OPTION,
            OUTPUT_ERROR,
            HTML
        }

        static {
            o oVar = new o(Data.class, "text", "getText()Ljava/lang/String;", 0);
            A.e(oVar);
            o oVar2 = new o(Data.class, "uris", "getUris()Ljava/util/List;", 0);
            A.e(oVar2);
            f2874g = new kotlin.reflect.i[]{oVar, oVar2};
        }

        public Data() {
            this(null, null, null, false, null, null, 63);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public Data(String str, String str2, List list, boolean z, Source source, Type type, int i) {
            str = (i & 1) != 0 ? "Data" : str;
            str2 = (i & 2) != 0 ? null : str2;
            int i2 = i & 4;
            z = (i & 8) != 0 ? true : z;
            source = (i & 16) != 0 ? Source.CHAT : source;
            type = (i & 32) != 0 ? null : type;
            kotlin.s.c.l.f(str, NotificationCompat.CATEGORY_EVENT);
            kotlin.s.c.l.f(source, "source");
            this.a = str;
            this.b = z;
            this.f2875c = source;
            com.bytedance.android.input.basic.b.a l = d.a.b.a.l("");
            this.f2876d = l;
            this.f2877e = d.a.b.a.l(kotlin.collections.l.a);
            Type type2 = Type.TEXT;
            this.f2878f = type2;
            switch (str.hashCode()) {
                case -1977401197:
                    if (str.equals("Format_End")) {
                        if (str2 != null) {
                            l.a(this, f2874g[0], str2);
                        }
                        this.f2878f = Type.HTML;
                        return;
                    }
                    break;
                case 69819:
                    if (str.equals("End")) {
                        l.a(this, f2874g[0], "加载中...");
                        this.f2878f = Type.STREAM_END;
                        return;
                    }
                    break;
                case 67232232:
                    if (str.equals("Error")) {
                        l.a(this, f2874g[0], str2 == null ? "加载失败" : str2);
                        this.f2878f = type == null ? Type.ERROR : type;
                        return;
                    }
                    break;
                case 2104391859:
                    if (str.equals("Finish")) {
                        l.a(this, f2874g[0], "- 没有更多了 -");
                        this.f2878f = Type.FINISH;
                        return;
                    }
                    break;
            }
            if (str2 != null) {
                l.a(this, f2874g[0], str2);
                this.f2878f = type == null ? type2 : type;
                return;
            }
            throw new IllegalArgumentException("IllegalArgument  text = " + str2 + " uri = " + ((Object) null));
        }

        public final boolean a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final Source c() {
            return this.f2875c;
        }

        public final String d() {
            return (String) this.f2876d.b(f2874g[0]);
        }

        public final List<String> e() {
            return (List) this.f2877e.b(f2874g[1]);
        }

        public final Type f() {
            return this.f2878f;
        }
    }

    public interface FileUploadApi {
        @t("/api/v1/bug/file_push")
        @q
        InterfaceC0701e<String> upload(@v w.b bVar);
    }

    public interface KeyboardRecordApi {
        @t("/api/v1/keyboard/record")
        @n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public interface LLMApi {
        @t("/api/v1/ailab/transform")
        @n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public interface LLMFeedbackApi {
        @t("/api/v1/bug_report")
        @n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b b bVar);
    }

    public interface ReportIPApi {
        @com.bytedance.retrofit2.R.h("/api/v1/ip/info")
        @n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@z("ip") String str, @InterfaceC0690a boolean z);
    }

    public interface StreamingApi {
        @t("/api/v1/ai/process")
        @InterfaceC0696g
        @E
        InterfaceC0701e<BufferedReader> request(@InterfaceC0694e("str_vars") String str, @InterfaceC0694e("streaming") boolean z, @InterfaceC0694e("chain_task") String str2);
    }

    public interface TranslateApi {
        @t("/api/v1/translate")
        @n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final kotlin.e<StreamingApi> b = kotlin.a.c(s.a);

        /* renamed from: c, reason: collision with root package name */
        private static final kotlin.e<Api> f2879c = kotlin.a.c(C0088a.a);

        /* renamed from: d, reason: collision with root package name */
        private static long f2880d = 500;

        /* renamed from: e, reason: collision with root package name */
        private static final kotlin.e<LLMApi> f2881e = kotlin.a.c(k.a);

        /* renamed from: f, reason: collision with root package name */
        private static final kotlin.e<LLMApi> f2882f = kotlin.a.c(p.a);

        /* renamed from: g, reason: collision with root package name */
        private static final kotlin.e<CloudConvertAPi> f2883g = kotlin.a.c(o.a);
        private static final kotlin.e<com.bytedance.retrofit2.S.a> h = kotlin.a.c(n.a);
        private static final kotlin.e<LLMFeedbackApi> i = kotlin.a.c(l.a);
        private static final kotlin.e<com.bytedance.retrofit2.S.a> j = kotlin.a.c(m.a);
        private static final kotlin.e<FileUploadApi> k = kotlin.a.c(h.a);
        private static final kotlin.e<com.bytedance.retrofit2.S.a> l = kotlin.a.c(i.a);
        private static final kotlin.e<AsrFmtApi> m = kotlin.a.c(b.a);
        private static final kotlin.e<com.bytedance.retrofit2.S.a> n = kotlin.a.c(c.a);
        private static final kotlin.e<com.bytedance.retrofit2.S.a> o = kotlin.a.c(e.a);
        private static final kotlin.e<AsrRecordApi> p = kotlin.a.c(d.a);
        private static final kotlin.e<KeyboardRecordApi> q = kotlin.a.c(j.a);
        private static final kotlin.e<CheckAuthApi> r = kotlin.a.c(f.a);
        private static final kotlin.e<com.bytedance.retrofit2.S.a> s = kotlin.a.c(g.a);
        private static final kotlin.e<ReportIPApi> t = kotlin.a.c(q.a);
        private static final kotlin.e<com.bytedance.retrofit2.S.a> u = kotlin.a.c(r.a);
        private static final kotlin.e<TranslateApi> v = kotlin.a.c(t.a);
        private static final kotlin.e<com.bytedance.retrofit2.S.a> w = kotlin.a.c(u.a);

        /* renamed from: com.bytedance.android.input.network.api.IRecommends$a$a, reason: collision with other inner class name */
        static final class C0088a extends kotlin.s.c.m implements kotlin.s.b.a<Api> {
            public static final C0088a a = new C0088a();

            C0088a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public Api invoke() {
                return (Api) RetrofitUtils.e("https://ime.doubao.com", Api.class);
            }
        }

        static final class b extends kotlin.s.c.m implements kotlin.s.b.a<AsrFmtApi> {
            public static final b a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public AsrFmtApi invoke() {
                return (AsrFmtApi) RetrofitUtils.d("https://ime.doubao.com", kotlin.collections.g.F(a.a(a.a)), null, null).e(AsrFmtApi.class);
            }
        }

        static final class c extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
            public static final c a = new c();

            c() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
                return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.network.api.b
                    @Override // com.bytedance.retrofit2.S.a
                    public final N a(a.InterfaceC0308a interfaceC0308a) {
                        IRecommends.a.c cVar = IRecommends.a.c.a;
                        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                        Request d2 = bVar.d();
                        com.bytedance.ttnet.i.d dVar = new com.bytedance.ttnet.i.d();
                        dVar.f5089e = 2000L;
                        d2.setExtraInfo(dVar);
                        return bVar.b(d2);
                    }
                };
            }
        }

        static final class d extends kotlin.s.c.m implements kotlin.s.b.a<AsrRecordApi> {
            public static final d a = new d();

            d() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public AsrRecordApi invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                return (AsrRecordApi) RetrofitUtils.d("https://ime.doubao.com", kotlin.collections.g.G(a.b(a.a), com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a()), null, null).e(AsrRecordApi.class);
            }
        }

        static final class e extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
            public static final e a = new e();

            e() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
                return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.network.api.c
                    @Override // com.bytedance.retrofit2.S.a
                    public final N a(a.InterfaceC0308a interfaceC0308a) {
                        IRecommends.a.e eVar = IRecommends.a.e.a;
                        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                        Request d2 = bVar.d();
                        ArrayList arrayList = new ArrayList();
                        List<com.bytedance.retrofit2.client.b> headers = d2.getHeaders();
                        kotlin.s.c.l.e(headers, "request.headers");
                        arrayList.addAll(headers);
                        IAppLog.a aVar = IAppLog.a;
                        Objects.requireNonNull(aVar);
                        arrayList.add(new com.bytedance.retrofit2.client.b("did", aVar.getDeviceId()));
                        Request.a newBuilder = d2.newBuilder();
                        newBuilder.b(arrayList);
                        return bVar.b(newBuilder.a());
                    }
                };
            }
        }

        static final class f extends kotlin.s.c.m implements kotlin.s.b.a<CheckAuthApi> {
            public static final f a = new f();

            f() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public CheckAuthApi invoke() {
                return (CheckAuthApi) RetrofitUtils.d("https://ime.doubao.com", kotlin.collections.g.F(a.c(a.a)), null, null).e(CheckAuthApi.class);
            }
        }

        static final class g extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
            public static final g a = new g();

            g() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
                return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.network.api.d
                    @Override // com.bytedance.retrofit2.S.a
                    public final N a(a.InterfaceC0308a interfaceC0308a) {
                        IRecommends.a.g gVar = IRecommends.a.g.a;
                        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                        Request d2 = bVar.d();
                        com.bytedance.ttnet.i.d dVar = new com.bytedance.ttnet.i.d();
                        dVar.f5089e = com.heytap.mcssdk.constant.a.q;
                        d2.setExtraInfo(dVar);
                        ArrayList arrayList = new ArrayList();
                        List<com.bytedance.retrofit2.client.b> headers = d2.getHeaders();
                        kotlin.s.c.l.e(headers, "request.headers");
                        arrayList.addAll(headers);
                        IAppLog.a aVar = IAppLog.a;
                        Objects.requireNonNull(aVar);
                        arrayList.add(new com.bytedance.retrofit2.client.b("did", aVar.getDeviceId()));
                        Request.a newBuilder = d2.newBuilder();
                        newBuilder.b(arrayList);
                        return bVar.b(newBuilder.a());
                    }
                };
            }
        }

        static final class h extends kotlin.s.c.m implements kotlin.s.b.a<FileUploadApi> {
            public static final h a = new h();

            h() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public FileUploadApi invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                return (FileUploadApi) RetrofitUtils.d("https://ime.doubao.com", kotlin.collections.g.G(a.d(a.a), com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a()), null, null).e(FileUploadApi.class);
            }
        }

        static final class i extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
            public static final i a = new i();

            i() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
                return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.network.api.e
                    @Override // com.bytedance.retrofit2.S.a
                    public final N a(a.InterfaceC0308a interfaceC0308a) {
                        IRecommends.a.i iVar = IRecommends.a.i.a;
                        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                        Request d2 = bVar.d();
                        ArrayList arrayList = new ArrayList();
                        List<com.bytedance.retrofit2.client.b> headers = d2.getHeaders();
                        kotlin.s.c.l.e(headers, "request.headers");
                        arrayList.addAll(headers);
                        arrayList.add(new com.bytedance.retrofit2.client.b("x-fb-asrt", "DHG5HY4H55J4JMN1H5T5GB1S1FGS"));
                        Request.a newBuilder = d2.newBuilder();
                        newBuilder.b(arrayList);
                        return bVar.b(newBuilder.a());
                    }
                };
            }
        }

        static final class j extends kotlin.s.c.m implements kotlin.s.b.a<KeyboardRecordApi> {
            public static final j a = new j();

            j() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public KeyboardRecordApi invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                return (KeyboardRecordApi) RetrofitUtils.d("https://ime.doubao.com", kotlin.collections.g.G(a.b(a.a), com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a()), null, null).e(KeyboardRecordApi.class);
            }
        }

        static final class k extends kotlin.s.c.m implements kotlin.s.b.a<LLMApi> {
            public static final k a = new k();

            k() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public LLMApi invoke() {
                return (LLMApi) RetrofitUtils.d("https://ime.doubao.com", kotlin.collections.g.F(a.f(a.a)), null, null).e(LLMApi.class);
            }
        }

        static final class l extends kotlin.s.c.m implements kotlin.s.b.a<LLMFeedbackApi> {
            public static final l a = new l();

            l() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public LLMFeedbackApi invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                return (LLMFeedbackApi) RetrofitUtils.d("https://ime.doubao.com", kotlin.collections.g.G(a.e(a.a), com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a()), null, null).e(LLMFeedbackApi.class);
            }
        }

        static final class m extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
            public static final m a = new m();

            m() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
                return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.network.api.f
                    @Override // com.bytedance.retrofit2.S.a
                    public final N a(a.InterfaceC0308a interfaceC0308a) {
                        IRecommends.a.m mVar = IRecommends.a.m.a;
                        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                        return bVar.b(bVar.d());
                    }
                };
            }
        }

        static final class n extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
            public static final n a = new n();

            n() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
                return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.network.api.g
                    @Override // com.bytedance.retrofit2.S.a
                    public final N a(a.InterfaceC0308a interfaceC0308a) {
                        IRecommends.a.n nVar = IRecommends.a.n.a;
                        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                        Request d2 = bVar.d();
                        com.bytedance.ttnet.i.d dVar = new com.bytedance.ttnet.i.d();
                        dVar.f5089e = IRecommends.a.a.m();
                        d2.setExtraInfo(dVar);
                        ArrayList arrayList = new ArrayList();
                        List<com.bytedance.retrofit2.client.b> headers = d2.getHeaders();
                        kotlin.s.c.l.e(headers, "request.headers");
                        arrayList.addAll(headers);
                        arrayList.add(new com.bytedance.retrofit2.client.b("app_version", "1.3.9"));
                        Objects.requireNonNull(IAppGlobals.a);
                        arrayList.add(new com.bytedance.retrofit2.client.b("app_id", "401734"));
                        arrayList.add(new com.bytedance.retrofit2.client.b("os_type", "Android"));
                        Request.a newBuilder = d2.newBuilder();
                        newBuilder.b(arrayList);
                        return bVar.b(newBuilder.a());
                    }
                };
            }
        }

        static final class o extends kotlin.s.c.m implements kotlin.s.b.a<CloudConvertAPi> {
            public static final o a = new o();

            o() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public CloudConvertAPi invoke() {
                return (CloudConvertAPi) RetrofitUtils.c("https://ime-gw.oceancloudapi.com", kotlin.collections.g.F(a.f(a.a)), null).e(CloudConvertAPi.class);
            }
        }

        static final class p extends kotlin.s.c.m implements kotlin.s.b.a<LLMApi> {
            public static final p a = new p();

            p() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public LLMApi invoke() {
                return (LLMApi) RetrofitUtils.d("https://ime-gw.oceancloudapi.com", kotlin.collections.g.F(a.f(a.a)), null, null).e(LLMApi.class);
            }
        }

        static final class q extends kotlin.s.c.m implements kotlin.s.b.a<ReportIPApi> {
            public static final q a = new q();

            q() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public ReportIPApi invoke() {
                return (ReportIPApi) RetrofitUtils.d("https://ime.doubao.com", kotlin.collections.g.F(a.g(a.a)), null, null).e(ReportIPApi.class);
            }
        }

        static final class r extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
            public static final r a = new r();

            r() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
                return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.network.api.h
                    @Override // com.bytedance.retrofit2.S.a
                    public final N a(a.InterfaceC0308a interfaceC0308a) {
                        IRecommends.a.r rVar = IRecommends.a.r.a;
                        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                        Request d2 = bVar.d();
                        ArrayList arrayList = new ArrayList();
                        List<com.bytedance.retrofit2.client.b> headers = d2.getHeaders();
                        kotlin.s.c.l.e(headers, "request.headers");
                        arrayList.addAll(headers);
                        IAppLog.a aVar = IAppLog.a;
                        Objects.requireNonNull(aVar);
                        arrayList.add(new com.bytedance.retrofit2.client.b("did", aVar.getDeviceId()));
                        Request.a newBuilder = d2.newBuilder();
                        newBuilder.b(arrayList);
                        return bVar.b(newBuilder.a());
                    }
                };
            }
        }

        static final class s extends kotlin.s.c.m implements kotlin.s.b.a<StreamingApi> {
            public static final s a = new s();

            s() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public StreamingApi invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                List G = kotlin.collections.g.G(com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a());
                com.bytedance.frameworks.baselib.network.http.n.d.a.a f2 = com.bytedance.frameworks.baselib.network.http.n.d.a.a.f();
                kotlin.s.c.l.e(f2, "create()");
                return (StreamingApi) RetrofitUtils.d("https://ime.doubao.com", G, new c(f2), null).e(StreamingApi.class);
            }
        }

        static final class t extends kotlin.s.c.m implements kotlin.s.b.a<TranslateApi> {
            public static final t a = new t();

            t() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public TranslateApi invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                return (TranslateApi) RetrofitUtils.d("https://ime.doubao.com", kotlin.collections.g.G(a.h(a.a), com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a()), null, null).e(TranslateApi.class);
            }
        }

        static final class u extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
            public static final u a = new u();

            u() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
                return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.network.api.i
                    @Override // com.bytedance.retrofit2.S.a
                    public final N a(a.InterfaceC0308a interfaceC0308a) {
                        IRecommends.a.u uVar = IRecommends.a.u.a;
                        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                        Request d2 = bVar.d();
                        ArrayList arrayList = new ArrayList(d2.getHeaders());
                        arrayList.add(new com.bytedance.retrofit2.client.b(DownloadHelper.ACCEPT_ENCODING, DownloadHelper.IDENTITY));
                        Request.a newBuilder = d2.newBuilder();
                        newBuilder.b(arrayList);
                        Request a2 = newBuilder.a();
                        com.bytedance.ttnet.i.d dVar = new com.bytedance.ttnet.i.d();
                        dVar.f5089e = com.heytap.mcssdk.constant.a.q;
                        a2.setExtraInfo(dVar);
                        return bVar.b(a2);
                    }
                };
            }
        }

        private a() {
        }

        public static final com.bytedance.retrofit2.S.a a(a aVar) {
            return n.getValue();
        }

        public static final com.bytedance.retrofit2.S.a b(a aVar) {
            return o.getValue();
        }

        public static final com.bytedance.retrofit2.S.a c(a aVar) {
            return s.getValue();
        }

        public static final com.bytedance.retrofit2.S.a d(a aVar) {
            return l.getValue();
        }

        public static final com.bytedance.retrofit2.S.a e(a aVar) {
            return j.getValue();
        }

        public static final com.bytedance.retrofit2.S.a f(a aVar) {
            return h.getValue();
        }

        public static final com.bytedance.retrofit2.S.a g(a aVar) {
            return u.getValue();
        }

        public static final com.bytedance.retrofit2.S.a h(a aVar) {
            return w.getValue();
        }

        public final AsrRecordApi i() {
            AsrRecordApi value = p.getValue();
            kotlin.s.c.l.e(value, "<get-asrRecordApi>(...)");
            return value;
        }

        public final FileUploadApi j() {
            FileUploadApi value = k.getValue();
            kotlin.s.c.l.e(value, "<get-fileUploadApi>(...)");
            return value;
        }

        public final KeyboardRecordApi k() {
            KeyboardRecordApi value = q.getValue();
            kotlin.s.c.l.e(value, "<get-keyboardRecordApi>(...)");
            return value;
        }

        public final LLMFeedbackApi l() {
            LLMFeedbackApi value = i.getValue();
            kotlin.s.c.l.e(value, "<get-llmFeedbackApi>(...)");
            return value;
        }

        public final long m() {
            return f2880d;
        }

        public final ReportIPApi n() {
            ReportIPApi value = t.getValue();
            kotlin.s.c.l.e(value, "<get-reportIPApi>(...)");
            return value;
        }

        public final TranslateApi o() {
            TranslateApi value = v.getValue();
            kotlin.s.c.l.e(value, "<get-translateApi>(...)");
            return value;
        }
    }

    public static final class b {

        @SerializedName("bug_desc")
        private final String a;

        @SerializedName("feedbacker")
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        @SerializedName("imgs")
        private final ArrayList<String> f2884c;

        /* renamed from: d, reason: collision with root package name */
        @SerializedName("record_id")
        private final String f2885d;

        public b(String str, String str2, ArrayList<String> arrayList, String str3) {
            kotlin.s.c.l.f(str, "bug_desc");
            kotlin.s.c.l.f(str2, "context");
            kotlin.s.c.l.f(arrayList, "task");
            this.a = str;
            this.b = str2;
            this.f2884c = arrayList;
            this.f2885d = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.s.c.l.a(this.a, bVar.a) && kotlin.s.c.l.a(this.b, bVar.b) && kotlin.s.c.l.a(this.f2884c, bVar.f2884c) && kotlin.s.c.l.a(this.f2885d, bVar.f2885d);
        }

        public int hashCode() {
            int hashCode = (this.f2884c.hashCode() + e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31)) * 31;
            String str = this.f2885d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("LLMFeedbackRequestInputs(bug_desc=");
            M.append(this.a);
            M.append(", context=");
            M.append(this.b);
            M.append(", task=");
            M.append(this.f2884c);
            M.append(", record_id=");
            return e.a.a.a.a.G(M, this.f2885d, ')');
        }
    }

    private static final class c extends InterfaceC0705i.a {
        private final InterfaceC0705i.a a;

        public c(InterfaceC0705i.a aVar) {
            kotlin.s.c.l.f(aVar, "wrapper");
            this.a = aVar;
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i.a
        public InterfaceC0705i<?, com.bytedance.retrofit2.mime.i> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, H h) {
            kotlin.s.c.l.f(type, "type");
            kotlin.s.c.l.f(annotationArr, "parameterAnnotations");
            kotlin.s.c.l.f(annotationArr2, "methodAnnotations");
            kotlin.s.c.l.f(h, "retrofit");
            return this.a.c(type, annotationArr, annotationArr2, h);
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i.a
        public InterfaceC0705i<com.bytedance.retrofit2.mime.h, ?> d(Type type, Annotation[] annotationArr, H h) {
            kotlin.s.c.l.f(type, "type");
            kotlin.s.c.l.f(annotationArr, "annotations");
            kotlin.s.c.l.f(h, "retrofit");
            return new d();
        }
    }

    private static final class d implements InterfaceC0705i<com.bytedance.retrofit2.mime.h, BufferedReader> {
        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public BufferedReader a(com.bytedance.retrofit2.mime.h hVar) {
            com.bytedance.retrofit2.mime.h hVar2 = hVar;
            kotlin.s.c.l.f(hVar2, PushLog.KEY_VALUE);
            return new BufferedReader(new InputStreamReader(hVar2.d(), hVar2.a() != null ? com.bytedance.retrofit2.mime.d.a(hVar2.a(), "UTF-8") : "UTF-8"));
        }
    }
}
