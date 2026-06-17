package com.bytedance.android.input.q.C;

import androidx.core.app.NotificationCompat;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;
import com.bytedance.android.input.keyboard.aiwrite.C0601v;
import com.bytedance.android.input.network.api.IRecommends;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.s.c.z;
import kotlin.x.d;
import kotlinx.coroutines.AbstractC0796d0;
import kotlinx.coroutines.C0798e0;
import kotlinx.coroutines.InterfaceC0817m0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class v {
    private final AbstractC0796d0 a;
    private InterfaceC0817m0 b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<String> f2976c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList<String> f2977d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.e f2978e;

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.Request$polish$1", f = "Request.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<IRecommends.Data, kotlin.r.d<? super kotlin.o>, Object> {
        /* synthetic */ Object a;
        final /* synthetic */ kotlin.s.c.v b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.s.c.v f2979c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z<String> f2980d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ IRecommends.Data.Source f2981e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f2982f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ v f2983g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.s.c.v vVar, kotlin.s.c.v vVar2, z<String> zVar, IRecommends.Data.Source source, long j, v vVar3, kotlin.r.d<? super a> dVar) {
            super(2, dVar);
            this.b = vVar;
            this.f2979c = vVar2;
            this.f2980d = zVar;
            this.f2981e = source;
            this.f2982f = j;
            this.f2983g = vVar3;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            a aVar = new a(this.b, this.f2979c, this.f2980d, this.f2981e, this.f2982f, this.f2983g, dVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.s.b.p
        public Object invoke(IRecommends.Data data, kotlin.r.d<? super kotlin.o> dVar) {
            a aVar = (a) create(data, dVar);
            kotlin.o oVar = kotlin.o.a;
            aVar.invokeSuspend(oVar);
            return oVar;
        }

        /* JADX WARN: Type inference failed for: r2v13, types: [T, java.lang.String] */
        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            IRecommends.Data data = (IRecommends.Data) this.a;
            if (!this.b.a && data.f() != IRecommends.Data.Type.ERROR) {
                IAppLog.a aVar = IAppLog.a;
                Objects.requireNonNull(aVar);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ai_polish_first_reply_time", System.currentTimeMillis() - this.f2982f);
                aVar.t("ai_polish_first_reply_report", jSONObject);
                this.b.a = true;
            }
            if (data.f() == IRecommends.Data.Type.ERROR) {
                this.f2979c.a = true;
            }
            if (data.f() == IRecommends.Data.Type.TEXT) {
                this.f2980d.a = this.f2980d.a + data.d();
            }
            if (data.f() == IRecommends.Data.Type.STREAM_END) {
                IAppLog.a aVar2 = IAppLog.a;
                Objects.requireNonNull(aVar2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ai_polish_finish_reply_time", System.currentTimeMillis() - this.f2982f);
                aVar2.t("ai_polish_finish_reply_report", jSONObject2);
                Objects.requireNonNull(aVar2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("tabname", this.f2983g.f(data.c()));
                aVar2.t("AI_tabcontentshow", jSONObject3);
            }
            if (this.f2981e == IRecommends.Data.Source.BAIKE) {
                StringBuilder M = e.a.a.a.a.M("updateRecommend polish result,messageType=");
                M.append(data.f());
                M.append(",text=");
                M.append(data.d());
                com.bytedance.android.input.r.j.i("Request", M.toString());
                if (data.d().length() > 0) {
                    AiChatMenuViewModel aiChatMenuViewModel = AiChatMenuViewModel.a;
                    boolean a = data.a();
                    String d2 = data.d();
                    IRecommends.Data.Type f2 = data.f();
                    data.c().ordinal();
                    aiChatMenuViewModel.g(a, d2, f2);
                }
            } else {
                C0601v c0601v = C0601v.a;
                boolean a2 = data.a();
                String d3 = data.d();
                IRecommends.Data.Type f3 = data.f();
                data.c().ordinal();
                c0601v.z(a2, d3, f3);
            }
            return kotlin.o.a;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.Request$polish$2", f = "Request.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.r.h.a.i implements kotlin.s.b.q<kotlinx.coroutines.flow.g<? super IRecommends.Data>, Throwable, kotlin.r.d<? super kotlin.o>, Object> {
        /* synthetic */ Object a;
        final /* synthetic */ kotlin.s.c.v b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z<String> f2984c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f2985d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.s.c.v vVar, z<String> zVar, v vVar2, kotlin.r.d<? super b> dVar) {
            super(3, dVar);
            this.b = vVar;
            this.f2984c = zVar;
            this.f2985d = vVar2;
        }

        @Override // kotlin.s.b.q
        public Object d(kotlinx.coroutines.flow.g<? super IRecommends.Data> gVar, Throwable th, kotlin.r.d<? super kotlin.o> dVar) {
            b bVar = new b(this.b, this.f2984c, this.f2985d, dVar);
            bVar.a = th;
            return bVar.invokeSuspend(kotlin.o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            if (((Throwable) this.a) != null || this.b.a || kotlin.text.a.s(this.f2984c.a)) {
                return kotlin.o.a;
            }
            this.f2985d.f2976c.add(this.f2984c.a);
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.a<Boolean> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Boolean invoke() {
            return Boolean.valueOf(IInputSettings.a.b().h());
        }
    }

    public v() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.bytedance.android.input.q.C.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                v vVar = v.this;
                kotlin.s.c.l.f(vVar, "this$0");
                return new Thread(runnable, vVar.getClass().getName());
            }
        });
        kotlin.s.c.l.e(newSingleThreadExecutor, "newSingleThreadExecutor …ead(it, javaClass.name) }");
        this.a = new C0798e0(newSingleThreadExecutor);
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.bytedance.android.input.q.C.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                v vVar = v.this;
                kotlin.s.c.l.f(vVar, "this$0");
                return new Thread(runnable, vVar.getClass().getName());
            }
        });
        kotlin.s.c.l.e(newSingleThreadExecutor2, "newSingleThreadExecutor …ead(it, javaClass.name) }");
        new C0798e0(newSingleThreadExecutor2);
        this.f2976c = new CopyOnWriteArrayList<>();
        this.f2977d = new CopyOnWriteArrayList<>();
        this.f2978e = kotlin.a.c(c.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String d(v vVar, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        String str8 = (i & 32) != 0 ? "" : null;
        kotlin.s.c.l.f(str, "paramsSet");
        kotlin.s.c.l.f(str2, "userInput");
        kotlin.s.c.l.f(str3, "currentInput");
        kotlin.s.c.l.f(str4, "suggestHistory");
        kotlin.s.c.l.f(str5, "mandate");
        kotlin.s.c.l.f(str8, "message");
        kotlin.x.e c2 = kotlin.text.i.c(new kotlin.text.i("\\{\\{(.*?)\\}\\}"), str, 0, 2);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c2.iterator();
        while (true) {
            d.a aVar = (d.a) it2;
            if (!aVar.hasNext()) {
                break;
            }
            arrayList.add(((kotlin.text.e) aVar.next()).a().get(1));
        }
        Iterator it3 = arrayList.iterator();
        String str9 = str;
        while (it3.hasNext()) {
            String str10 = (String) it3.next();
            String t = e.a.a.a.a.t("{{", str10, "}}");
            switch (str10.hashCode()) {
                case -1718371964:
                    if (str10.equals("current_input")) {
                        str7 = str3;
                        break;
                    }
                    str7 = "";
                    break;
                case 355022553:
                    if (str10.equals("suggest_history")) {
                        str7 = str4;
                        break;
                    }
                    str7 = "";
                    break;
                case 835344392:
                    if (str10.equals("mandate")) {
                        str7 = str5;
                        break;
                    }
                    str7 = "";
                    break;
                case 954925063:
                    if (str10.equals("message")) {
                        str7 = str8;
                        break;
                    }
                    str7 = "";
                    break;
                case 1925407318:
                    if (str10.equals("user_input")) {
                        str7 = str2;
                        break;
                    }
                    str7 = "";
                    break;
                default:
                    str7 = "";
                    break;
            }
            str9 = kotlin.text.a.E(str9, t, str7, false, 4, null);
        }
        return str9;
    }

    public static /* synthetic */ void j(v vVar, com.bytedance.android.input.basic.recognition.api.a aVar, String str, String str2, boolean z, IRecommends.Data.Source source, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            source = IRecommends.Data.Source.POLISH;
        }
        vVar.i(aVar, str, str2, z2, source, (i & 32) != 0 ? "" : null);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.f l(v vVar, JSONObject jSONObject, String str, IRecommends.Data.Source source, IRecommends.Data.Type type, int i, Object obj) {
        int i2 = i & 8;
        return vVar.k(jSONObject, str, source, null);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.f n(v vVar, String str, String str2, IRecommends.Data.Source source, IRecommends.Data.Type type, int i, Object obj) {
        int i2 = i & 8;
        return vVar.m(str, str2, source, null);
    }

    protected com.bytedance.android.input.basic.settings.api.c.b b() {
        return new com.bytedance.android.input.basic.settings.api.c.b(null, null, null, 7);
    }

    protected String c() {
        return b().a().b();
    }

    protected final String e(IRecommends.Data.Source source) {
        kotlin.s.c.l.f(source, "source");
        return e.a.a.a.a.t("输入更多想法，生成内容更准确", "\r\n", IRecommends.Data.Source.POPULAR == source ? "例如 \"推荐一条超级显瘦的裤子\"" : IRecommends.Data.Source.CIRCLE == source ? "例如 \"去海边旅行啦\"" : IRecommends.Data.Source.MAIL == source ? "例如 \"邀请合作伙伴参加会议\"" : IRecommends.Data.Source.EVALUATE == source ? "例如 \"白色棒球帽好评\"" : IRecommends.Data.Source.BLESSING == source ? "例如 \"祝妈妈生日快乐\"" : IRecommends.Data.Source.INVITATION == source ? "例如 \"李雷和韩梅梅的婚礼邀请\"" : IRecommends.Data.Source.INTRODUCTION == source ? "例如 \"新人入职自我介绍\"" : IRecommends.Data.Source.OPTIMIZE == source ? "优化格式、精炼内容样样精通" : IRecommends.Data.Source.REWRITE == source ? "重写" : IRecommends.Data.Source.SUMMARY == source ? "总结" : IRecommends.Data.Source.KEYPOINTS == source ? "关键点" : IRecommends.Data.Source.LIST == source ? "列表" : "");
    }

    public final String f(IRecommends.Data.Source source) {
        kotlin.s.c.l.f(source, "source");
        switch (source) {
            case CHAT:
                return "smartreply";
            case POPULAR:
                return "popularcopywriting";
            case CIRCLE:
                return "highlylikedupdates";
            case MAIL:
                return NotificationCompat.CATEGORY_EMAIL;
            case EVALUATE:
                return "reviews";
            case BLESSING:
                return "blessings";
            case INVITATION:
                return "banquetinvitation";
            case INTRODUCTION:
                return "self-introduction";
            case OPTIMIZE:
                return "copywritingoptimization";
            case REWRITE:
                return "rewrite";
            case SUMMARY:
                return "summarize";
            case KEYPOINTS:
                return "keypoints";
            case LIST:
                return "list";
            default:
                return "";
        }
    }

    public abstract boolean g();

    protected String h() {
        return b().b().b();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(com.bytedance.android.input.basic.recognition.api.a r37, java.lang.String r38, java.lang.String r39, boolean r40, com.bytedance.android.input.network.api.IRecommends.Data.Source r41, java.lang.String r42) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.q.C.v.i(com.bytedance.android.input.basic.recognition.api.a, java.lang.String, java.lang.String, boolean, com.bytedance.android.input.network.api.IRecommends$Data$Source, java.lang.String):void");
    }

    protected abstract kotlinx.coroutines.flow.f<IRecommends.Data> k(JSONObject jSONObject, String str, IRecommends.Data.Source source, IRecommends.Data.Type type);

    protected abstract kotlinx.coroutines.flow.f<IRecommends.Data> m(String str, String str2, IRecommends.Data.Source source, IRecommends.Data.Type type);

    public void o() {
        if (this.b != null) {
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            aVar.i("recommend_polish_stop");
        }
        InterfaceC0817m0 interfaceC0817m0 = this.b;
        if (interfaceC0817m0 != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
        this.b = null;
        this.f2976c.clear();
        this.f2977d.clear();
    }
}
