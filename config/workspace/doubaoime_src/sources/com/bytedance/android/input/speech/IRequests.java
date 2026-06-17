package com.bytedance.android.input.speech;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.speech.IRequests;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.InterfaceC0705i;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.R.InterfaceC0690a;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.S.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.message.log.PushLog;
import com.vivo.push.PushClient;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public interface IRequests {
    public static final a a = a.a;

    public interface ImeEmoticons {
        @com.bytedance.retrofit2.R.t("/api/v2/emoticons/commit_record")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> commitRecord(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);

        @com.bytedance.retrofit2.R.h("/api/v2/emoticons/hot_list")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> hotList(@com.bytedance.retrofit2.R.A HashMap<String, Object> hashMap, @InterfaceC0690a boolean z);

        @com.bytedance.retrofit2.R.h("/api/v2/emoticons/query")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> queryByContext(@com.bytedance.retrofit2.R.A HashMap<String, Object> hashMap, @InterfaceC0690a boolean z);

        @com.bytedance.retrofit2.R.t("/api/v2/emoticons/query_hit")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> queryByHit(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);

        @com.bytedance.retrofit2.R.h("/api/v2/version/list")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> wordsVersion(@com.bytedance.retrofit2.R.A HashMap<String, Object> hashMap, @InterfaceC0690a boolean z);
    }

    public interface ImeMessageCenterApi {
        @com.bytedance.retrofit2.R.t("/api/v2/im/message/delete")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> deleteMessage(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);

        @com.bytedance.retrofit2.R.t("/api/v2/im/message/list")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> messageList(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);

        @com.bytedance.retrofit2.R.t("/api/v2/im/message/read_reported")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> messageReadReported(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public interface ImeNerApi {
        @com.bytedance.retrofit2.R.t("/api/v3/context/ime/ner")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public interface ImeTokenApi {
        @com.bytedance.retrofit2.R.t("/api/v1/user/get_config")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public interface ModifyPairApi {
        @com.bytedance.retrofit2.R.t("/api/v3/context/ime/modify_pair")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public interface ModifyPairApiV2 {
        @com.bytedance.retrofit2.R.t("/api/v3/context/ime/modify_pair/v2")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public interface UserWordsApi {
        @com.bytedance.retrofit2.R.t("/api/v3/context/ime/user_words")
        @com.bytedance.retrofit2.R.n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b com.google.gson.l lVar, @InterfaceC0690a boolean z);
    }

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final kotlin.e<ImeMessageCenterApi> b = kotlin.a.c(e.a);

        /* renamed from: c, reason: collision with root package name */
        private static final kotlin.e<ImeEmoticons> f3084c = kotlin.a.c(b.a);

        /* renamed from: d, reason: collision with root package name */
        private static final kotlin.e<ImeTokenApi> f3085d = kotlin.a.c(d.a);

        /* renamed from: e, reason: collision with root package name */
        private static final kotlin.e<ModifyPairApi> f3086e = kotlin.a.c(f.a);

        /* renamed from: f, reason: collision with root package name */
        private static final kotlin.e<ModifyPairApiV2> f3087f = kotlin.a.c(g.a);

        /* renamed from: g, reason: collision with root package name */
        private static final kotlin.e<UserWordsApi> f3088g = kotlin.a.c(i.a);
        private static final kotlin.e<ImeNerApi> h = kotlin.a.c(c.a);
        private static final kotlin.e<com.bytedance.retrofit2.S.a> i = kotlin.a.c(C0095a.a);
        private static final kotlin.e<com.bytedance.retrofit2.S.a> j = kotlin.a.c(h.a);

        /* renamed from: com.bytedance.android.input.speech.IRequests$a$a, reason: collision with other inner class name */
        static final class C0095a extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
            public static final C0095a a = new C0095a();

            C0095a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
                return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.speech.n
                    @Override // com.bytedance.retrofit2.S.a
                    public final N a(a.InterfaceC0308a interfaceC0308a) {
                        IRequests.a.C0095a c0095a = IRequests.a.C0095a.a;
                        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                        Request d2 = bVar.d();
                        com.bytedance.ttnet.i.d dVar = new com.bytedance.ttnet.i.d();
                        IRequests.a aVar = IRequests.a.a;
                        dVar.f5089e = com.heytap.mcssdk.constant.a.r;
                        d2.setExtraInfo(dVar);
                        ArrayList arrayList = new ArrayList();
                        List<com.bytedance.retrofit2.client.b> headers = d2.getHeaders();
                        kotlin.s.c.l.e(headers, "request.headers");
                        arrayList.addAll(headers);
                        arrayList.add(new com.bytedance.retrofit2.client.b("app_version", "1.3.9"));
                        IAppGlobals.a aVar2 = IAppGlobals.a;
                        Objects.requireNonNull(aVar2);
                        arrayList.add(new com.bytedance.retrofit2.client.b("app_id", "401734"));
                        arrayList.add(new com.bytedance.retrofit2.client.b("os_type", "Android"));
                        arrayList.add(new com.bytedance.retrofit2.client.b("X-Api-Resource-Id", "asr.user.context"));
                        arrayList.add(new com.bytedance.retrofit2.client.b("X-Api-App-Key", "SYlxZr6LnvBaIVmF"));
                        x xVar = x.a;
                        String d3 = x.d();
                        if (d3 == null) {
                            d3 = "";
                        }
                        boolean z = true;
                        if (d3.length() == 0) {
                            com.bytedance.android.input.r.j.j("AsrGlobalContext", "error!! because it is empty");
                        }
                        arrayList.add(new com.bytedance.retrofit2.client.b("X-Api-Token", d3));
                        arrayList.add(new com.bytedance.retrofit2.client.b("X-Api-Request-Id", UUID.randomUUID().toString()));
                        arrayList.add(new com.bytedance.retrofit2.client.b("X-Api-Sequence", "-1"));
                        String string = aVar2.u().getString("asr_ppe_set_v2", "");
                        if (string != null && string.length() != 0) {
                            z = false;
                        }
                        if (!z) {
                            arrayList.add(new com.bytedance.retrofit2.client.b("x-tt-env", string));
                            arrayList.add(new com.bytedance.retrofit2.client.b("x-use-ppe", PushClient.DEFAULT_REQUEST_ID));
                        }
                        Request.a newBuilder = d2.newBuilder();
                        newBuilder.b(arrayList);
                        return bVar.b(newBuilder.a());
                    }
                };
            }
        }

        static final class b extends kotlin.s.c.m implements kotlin.s.b.a<ImeEmoticons> {
            public static final b a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public ImeEmoticons invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                List G = kotlin.collections.g.G(a.a(a.a), com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a());
                com.bytedance.frameworks.baselib.network.http.n.d.a.a f2 = com.bytedance.frameworks.baselib.network.http.n.d.a.a.f();
                kotlin.s.c.l.e(f2, "create()");
                return (ImeEmoticons) RetrofitUtils.d("https://ime.doubao.com", G, new b(f2), null).e(ImeEmoticons.class);
            }
        }

        static final class c extends kotlin.s.c.m implements kotlin.s.b.a<ImeNerApi> {
            public static final c a = new c();

            c() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public ImeNerApi invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                List G = kotlin.collections.g.G(a.a(a.a), com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a());
                com.bytedance.frameworks.baselib.network.http.n.d.a.a f2 = com.bytedance.frameworks.baselib.network.http.n.d.a.a.f();
                kotlin.s.c.l.e(f2, "create()");
                return (ImeNerApi) RetrofitUtils.d("https://speech.bytedance.com", G, new b(f2), null).e(ImeNerApi.class);
            }
        }

        static final class d extends kotlin.s.c.m implements kotlin.s.b.a<ImeTokenApi> {
            public static final d a = new d();

            d() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public ImeTokenApi invoke() {
                List F = kotlin.collections.g.F(a.b(a.a));
                com.bytedance.frameworks.baselib.network.http.n.d.a.a f2 = com.bytedance.frameworks.baselib.network.http.n.d.a.a.f();
                kotlin.s.c.l.e(f2, "create()");
                return (ImeTokenApi) RetrofitUtils.d("https://ime.oceancloudapi.com", F, new b(f2), null).e(ImeTokenApi.class);
            }
        }

        static final class e extends kotlin.s.c.m implements kotlin.s.b.a<ImeMessageCenterApi> {
            public static final e a = new e();

            e() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public ImeMessageCenterApi invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                List G = kotlin.collections.g.G(a.a(a.a), com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a());
                com.bytedance.frameworks.baselib.network.http.n.d.a.a f2 = com.bytedance.frameworks.baselib.network.http.n.d.a.a.f();
                kotlin.s.c.l.e(f2, "create()");
                return (ImeMessageCenterApi) RetrofitUtils.d("https://ime.doubao.com", G, new b(f2), null).e(ImeMessageCenterApi.class);
            }
        }

        static final class f extends kotlin.s.c.m implements kotlin.s.b.a<ModifyPairApi> {
            public static final f a = new f();

            f() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public ModifyPairApi invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                List G = kotlin.collections.g.G(a.a(a.a), com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a());
                com.bytedance.frameworks.baselib.network.http.n.d.a.a f2 = com.bytedance.frameworks.baselib.network.http.n.d.a.a.f();
                kotlin.s.c.l.e(f2, "create()");
                return (ModifyPairApi) RetrofitUtils.d("https://speech.bytedance.com", G, new b(f2), null).e(ModifyPairApi.class);
            }
        }

        static final class g extends kotlin.s.c.m implements kotlin.s.b.a<ModifyPairApiV2> {
            public static final g a = new g();

            g() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public ModifyPairApiV2 invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                List G = kotlin.collections.g.G(a.a(a.a), com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a());
                com.bytedance.frameworks.baselib.network.http.n.d.a.a f2 = com.bytedance.frameworks.baselib.network.http.n.d.a.a.f();
                kotlin.s.c.l.e(f2, "create()");
                return (ModifyPairApiV2) RetrofitUtils.d("https://speech.bytedance.com", G, new b(f2), null).e(ModifyPairApiV2.class);
            }
        }

        static final class h extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
            public static final h a = new h();

            h() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
                return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.speech.o
                    @Override // com.bytedance.retrofit2.S.a
                    public final N a(a.InterfaceC0308a interfaceC0308a) {
                        IRequests.a.h hVar = IRequests.a.h.a;
                        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                        Request d2 = bVar.d();
                        com.bytedance.ttnet.i.d dVar = new com.bytedance.ttnet.i.d();
                        IRequests.a aVar = IRequests.a.a;
                        dVar.f5089e = com.heytap.mcssdk.constant.a.r;
                        d2.setExtraInfo(dVar);
                        ArrayList arrayList = new ArrayList();
                        List<com.bytedance.retrofit2.client.b> headers = d2.getHeaders();
                        kotlin.s.c.l.e(headers, "request.headers");
                        arrayList.addAll(headers);
                        arrayList.add(new com.bytedance.retrofit2.client.b("app_version", "1.3.9"));
                        IAppGlobals.a aVar2 = IAppGlobals.a;
                        Objects.requireNonNull(aVar2);
                        arrayList.add(new com.bytedance.retrofit2.client.b("app_id", "401734"));
                        arrayList.add(new com.bytedance.retrofit2.client.b("os_type", "Android"));
                        IAppLog.a aVar3 = IAppLog.a;
                        Objects.requireNonNull(aVar3);
                        arrayList.add(new com.bytedance.retrofit2.client.b("did", aVar3.getDeviceId()));
                        String string = aVar2.u().getString("asr_ppe_set_v2", "");
                        if (!(string == null || string.length() == 0)) {
                            arrayList.add(new com.bytedance.retrofit2.client.b("x-tt-env", string));
                            arrayList.add(new com.bytedance.retrofit2.client.b("x-use-ppe", PushClient.DEFAULT_REQUEST_ID));
                        }
                        Request.a newBuilder = d2.newBuilder();
                        newBuilder.b(arrayList);
                        return bVar.b(newBuilder.a());
                    }
                };
            }
        }

        static final class i extends kotlin.s.c.m implements kotlin.s.b.a<UserWordsApi> {
            public static final i a = new i();

            i() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public UserWordsApi invoke() {
                com.bytedance.android.input.network.api.m mVar = com.bytedance.android.input.network.api.m.a;
                List G = kotlin.collections.g.G(a.a(a.a), com.bytedance.android.input.network.api.m.b(), com.bytedance.android.input.network.api.m.a());
                com.bytedance.frameworks.baselib.network.http.n.d.a.a f2 = com.bytedance.frameworks.baselib.network.http.n.d.a.a.f();
                kotlin.s.c.l.e(f2, "create()");
                return (UserWordsApi) RetrofitUtils.d("https://speech.bytedance.com", G, new b(f2), null).e(UserWordsApi.class);
            }
        }

        private a() {
        }

        public static final com.bytedance.retrofit2.S.a a(a aVar) {
            return i.getValue();
        }

        public static final com.bytedance.retrofit2.S.a b(a aVar) {
            return j.getValue();
        }

        public final ImeEmoticons c() {
            ImeEmoticons value = f3084c.getValue();
            kotlin.s.c.l.e(value, "<get-emoticonsApi>(...)");
            return value;
        }

        public final ImeNerApi d() {
            ImeNerApi value = h.getValue();
            kotlin.s.c.l.e(value, "<get-imeNerApi>(...)");
            return value;
        }

        public final ImeTokenApi e() {
            ImeTokenApi value = f3085d.getValue();
            kotlin.s.c.l.e(value, "<get-imeTokenApi>(...)");
            return value;
        }

        public final ImeMessageCenterApi f() {
            ImeMessageCenterApi value = b.getValue();
            kotlin.s.c.l.e(value, "<get-messageCenterApi>(...)");
            return value;
        }

        public final ModifyPairApiV2 g() {
            ModifyPairApiV2 value = f3087f.getValue();
            kotlin.s.c.l.e(value, "<get-modifyPairApiV2>(...)");
            return value;
        }

        public final UserWordsApi h() {
            UserWordsApi value = f3088g.getValue();
            kotlin.s.c.l.e(value, "<get-userWordsApi>(...)");
            return value;
        }
    }

    private static final class b extends InterfaceC0705i.a {
        private final InterfaceC0705i.a a;

        public b(InterfaceC0705i.a aVar) {
            kotlin.s.c.l.f(aVar, "wrapper");
            this.a = aVar;
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i.a
        public InterfaceC0705i<?, com.bytedance.retrofit2.mime.i> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, com.bytedance.retrofit2.H h) {
            kotlin.s.c.l.f(type, "type");
            kotlin.s.c.l.f(annotationArr, "parameterAnnotations");
            kotlin.s.c.l.f(annotationArr2, "methodAnnotations");
            kotlin.s.c.l.f(h, "retrofit");
            return this.a.c(type, annotationArr, annotationArr2, h);
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i.a
        public InterfaceC0705i<com.bytedance.retrofit2.mime.h, ?> d(Type type, Annotation[] annotationArr, com.bytedance.retrofit2.H h) {
            kotlin.s.c.l.f(type, "type");
            kotlin.s.c.l.f(annotationArr, "annotations");
            kotlin.s.c.l.f(h, "retrofit");
            return new c();
        }
    }

    private static final class c implements InterfaceC0705i<com.bytedance.retrofit2.mime.h, BufferedReader> {
        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public BufferedReader a(com.bytedance.retrofit2.mime.h hVar) {
            com.bytedance.retrofit2.mime.h hVar2 = hVar;
            kotlin.s.c.l.f(hVar2, PushLog.KEY_VALUE);
            return new BufferedReader(new InputStreamReader(hVar2.d(), hVar2.a() != null ? com.bytedance.retrofit2.mime.d.a(hVar2.a(), "UTF-8") : "UTF-8"));
        }
    }
}
