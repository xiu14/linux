package com.bytedance.android.input.speech;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.retrofit2.N;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;
import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class x {
    public static final x a = null;
    private static final kotlinx.coroutines.G b = com.prolificinteractive.materialcalendarview.r.b(S.b().plus(C0795d.a(null, 1)));

    /* renamed from: c, reason: collision with root package name */
    private static InterfaceC0817m0 f3196c;

    /* renamed from: d, reason: collision with root package name */
    private static String f3197d;

    /* renamed from: e, reason: collision with root package name */
    private static long f3198e;

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrGlobalContext$reportPairNew$1", f = "AsrGlobalContext.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.h<? extends kotlin.o>>, Object> {
        final /* synthetic */ com.google.gson.l a;

        @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrGlobalContext$reportPairNew$1$1$1", f = "AsrGlobalContext.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.bytedance.android.input.speech.x$a$a, reason: collision with other inner class name */
        static final class C0098a extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
            final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0098a(String str, kotlin.r.d<? super C0098a> dVar) {
                super(2, dVar);
                this.a = str;
            }

            @Override // kotlin.r.h.a.a
            public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
                return new C0098a(this.a, dVar);
            }

            @Override // kotlin.s.b.p
            public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
                C0098a c0098a = new C0098a(this.a, dVar);
                kotlin.o oVar = kotlin.o.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                com.prolificinteractive.materialcalendarview.r.k0(oVar);
                KeyboardJni.getKeyboardJni().addModifyPairNerResponse(c0098a.a);
                return oVar;
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                KeyboardJni.getKeyboardJni().addModifyPairNerResponse(this.a);
                return kotlin.o.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.google.gson.l lVar, kotlin.r.d<? super a> dVar) {
            super(2, dVar);
            this.a = lVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new a(this.a, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.h<? extends kotlin.o>> dVar) {
            return new a(this.a, dVar).invokeSuspend(kotlin.o.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
        
            r6 = kotlinx.coroutines.C0800f0.a;
            r13 = kotlinx.coroutines.S.f10199c;
            kotlinx.coroutines.C0795d.l(r6, kotlinx.coroutines.N0.q.f10173c, null, new com.bytedance.android.input.speech.x.a.C0098a(r4, null), 2, null);
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
        @Override // kotlin.r.h.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrGlobalContext$reportUsrWords$4", f = "AsrGlobalContext.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.h<? extends kotlin.o>>, Object> {
        final /* synthetic */ com.google.gson.l a;
        final /* synthetic */ boolean b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f3199c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.google.gson.l lVar, boolean z, long j, kotlin.r.d<? super b> dVar) {
            super(2, dVar);
            this.a = lVar;
            this.b = z;
            this.f3199c = j;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new b(this.a, this.b, this.f3199c, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.h<? extends kotlin.o>> dVar) {
            return new b(this.a, this.b, this.f3199c, dVar).invokeSuspend(kotlin.o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            Object J2;
            Object obj2;
            Object obj3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            com.google.gson.l lVar = this.a;
            boolean z = this.b;
            long j = this.f3199c;
            try {
                N<String> execute = IRequests.a.h().request(lVar, true).execute();
                com.bytedance.android.input.r.j.i("AsrGlobalContext", "reportUsrWords, response = " + execute.a());
                com.bytedance.android.input.r.j.i("AsrGlobalContext", "reportUsrWords, response header = " + execute.e());
                if (z) {
                    IAppGlobals.a aVar = IAppGlobals.a;
                    Objects.requireNonNull(aVar);
                    aVar.o().edit().putLong("lastReportUsrWordsTimestamp", j).apply();
                }
                List<com.bytedance.retrofit2.client.b> e2 = execute.e();
                kotlin.s.c.l.e(e2, "response.headers()");
                Iterator<T> it2 = e2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (kotlin.text.a.i(((com.bytedance.retrofit2.client.b) obj2).a(), "x-api-status-code", true)) {
                        break;
                    }
                }
                com.bytedance.retrofit2.client.b bVar = (com.bytedance.retrofit2.client.b) obj2;
                String b = bVar != null ? bVar.b() : null;
                List<com.bytedance.retrofit2.client.b> e3 = execute.e();
                kotlin.s.c.l.e(e3, "response.headers()");
                Iterator<T> it3 = e3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (kotlin.text.a.i(((com.bytedance.retrofit2.client.b) obj3).a(), "x-tt-logid", true)) {
                        break;
                    }
                }
                com.bytedance.retrofit2.client.b bVar2 = (com.bytedance.retrofit2.client.b) obj3;
                com.bytedance.android.input.r.j.i("AsrGlobalContext", "reportUsrWords, x-api-status-code = " + b + ", x-tt-logid = " + (bVar2 != null ? bVar2.b() : null));
                J2 = kotlin.o.a;
            } catch (Throwable th) {
                J2 = com.prolificinteractive.materialcalendarview.r.J(th);
            }
            Throwable b2 = kotlin.h.b(J2);
            if (b2 != null) {
                e.a.a.a.a.v0("reportUsrWords, e = ", b2, "AsrGlobalContext");
            }
            return kotlin.h.a(J2);
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrGlobalContext$requestImeNer$1", f = "AsrGlobalContext.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.h<? extends kotlin.o>>, Object> {
        final /* synthetic */ com.google.gson.l a;

        @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrGlobalContext$requestImeNer$1$1$1", f = "AsrGlobalContext.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
            final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, kotlin.r.d<? super a> dVar) {
                super(2, dVar);
                this.a = str;
            }

            @Override // kotlin.r.h.a.a
            public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
                return new a(this.a, dVar);
            }

            @Override // kotlin.s.b.p
            public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
                a aVar = new a(this.a, dVar);
                kotlin.o oVar = kotlin.o.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                com.prolificinteractive.materialcalendarview.r.k0(oVar);
                KeyboardJni.getKeyboardJni().addNerResponse(aVar.a);
                return oVar;
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                KeyboardJni.getKeyboardJni().addNerResponse(this.a);
                return kotlin.o.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.google.gson.l lVar, kotlin.r.d<? super c> dVar) {
            super(2, dVar);
            this.a = lVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new c(this.a, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.h<? extends kotlin.o>> dVar) {
            return new c(this.a, dVar).invokeSuspend(kotlin.o.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
        
            r5 = kotlinx.coroutines.C0800f0.a;
            r12 = kotlinx.coroutines.S.f10199c;
            kotlinx.coroutines.C0795d.l(r5, kotlinx.coroutines.N0.q.f10173c, null, new com.bytedance.android.input.speech.x.c.a(r2, null), 2, null);
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
        @Override // kotlin.r.h.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.x.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void c() {
        InterfaceC0817m0 interfaceC0817m0 = f3196c;
        if (interfaceC0817m0 != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
    }

    public static final String d() {
        long currentTimeMillis = System.currentTimeMillis();
        String str = f3197d;
        boolean z = false;
        if ((str == null || str.length() == 0) || currentTimeMillis - f3198e > 36000000) {
            com.bytedance.android.input.r.j.m("AsrGlobalContext", "getContextToken Token is null or expired, fetching a new one.");
            InterfaceC0817m0 interfaceC0817m0 = f3196c;
            if (interfaceC0817m0 != null && interfaceC0817m0.a()) {
                z = true;
            }
            if (z) {
                com.bytedance.android.input.r.j.i("AsrGlobalContext", "getContextToken request is already in progress.");
            } else {
                com.google.gson.l lVar = new com.google.gson.l();
                lVar.g("sami_app_key", "SYlxZr6LnvBaIVmF");
                com.bytedance.android.input.r.j.i("AsrGlobalContext", "getContextToken, jsonObject = " + lVar);
                f3196c = C0795d.b(b, S.b(), null, new w(lVar, null), 2, null);
            }
        }
        return f3197d;
    }

    private static final com.google.gson.l e() {
        com.google.gson.l lVar = new com.google.gson.l();
        IAppLog.a aVar = IAppLog.a;
        lVar.g("uid", aVar.getUserID());
        lVar.g("did", aVar.getDeviceId());
        IAppGlobals.a aVar2 = IAppGlobals.a;
        lVar.g("app_name", aVar2.H());
        lVar.g("app_version", "1.3.9");
        lVar.g("sdk_version", "");
        lVar.g(WsConstants.KEY_PLATFORM, "android");
        String string = aVar2.getContext().getString(C0838R.string.enable_report_inputdata);
        kotlin.s.c.l.e(string, "IAppGlobals.context.getS….enable_report_inputdata)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
        lVar.e("experience_improve", Boolean.valueOf(((Boolean) f2).booleanValue()));
        return lVar;
    }

    public static final void f(String str, String str2, int i, int i2, String str3) {
        kotlin.s.c.l.f(str, "originalWord");
        kotlin.s.c.l.f(str2, "modifiedWord");
        kotlin.s.c.l.f(str3, "ptJsonString");
        com.bytedance.android.input.r.j.i("AsrGlobalContext", "[reportPairNew] reportPair start 01");
        IAppGlobals.a aVar = IAppGlobals.a;
        boolean booleanValue = ((Boolean) e.a.a.a.a.L0(aVar, C0838R.string.enable_global_context, "IAppGlobals.context.getS…ng.enable_global_context)", "null cannot be cast to non-null type kotlin.Boolean")).booleanValue();
        boolean z = ((Integer) e.a.a.a.a.L0(aVar, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 0;
        if (booleanValue && z) {
            com.bytedance.android.input.r.j.i("AsrGlobalContext", "[reportPairNew] reportPair start 02");
            com.google.gson.l lVar = new com.google.gson.l();
            lVar.d("user", e());
            String GetHansOrHant = KeyboardJni.GetHansOrHant(1, str);
            String GetHansOrHant2 = KeyboardJni.GetHansOrHant(1, str2);
            com.google.gson.l lVar2 = new com.google.gson.l();
            if (str3.length() > 0) {
                lVar2.g("pt", str3);
            }
            com.google.gson.l lVar3 = new com.google.gson.l();
            lVar3.g("src_text", GetHansOrHant);
            lVar3.g("dst_text", GetHansOrHant2);
            lVar3.f("src_position", Integer.valueOf(i));
            lVar3.f("dst_position", Integer.valueOf(i2));
            lVar3.d("additions", lVar2);
            lVar.d("modify_data", lVar3);
            com.bytedance.android.input.r.j.i("AsrGlobalContext", "[reportPairNew] reportPair, jsonObject = " + lVar);
            C0795d.b(C0800f0.a, S.b(), null, new a(lVar, null), 2, null);
        }
    }

    public static final void g(boolean z, boolean z2, ArrayList<kotlin.g<String, String>> arrayList, List<String> list) {
        com.google.gson.i i;
        com.google.gson.i i2;
        com.bytedance.android.input.r.j.m("AsrGlobalContext", "reportUsrWords, reportUsrWords =" + z + " reportCommonWords=" + z2);
        IAppGlobals.a aVar = IAppGlobals.a;
        boolean booleanValue = ((Boolean) e.a.a.a.a.L0(aVar, C0838R.string.enable_global_context, "IAppGlobals.context.getS…ng.enable_global_context)", "null cannot be cast to non-null type kotlin.Boolean")).booleanValue();
        boolean z3 = ((Integer) e.a.a.a.a.L0(aVar, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 0;
        if (booleanValue && z3) {
            if (((Integer) e.a.a.a.a.L0(aVar, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 1) {
                com.bytedance.android.input.r.j.m("AsrGlobalContext", "basic input mode, ignore reportUsrWords");
                return;
            }
            com.google.gson.l lVar = new com.google.gson.l();
            lVar.d("user", e());
            long currentTimeMillis = System.currentTimeMillis();
            if (z || z2) {
                try {
                    com.google.gson.l j = ((com.google.gson.l) new Gson().c(KeyboardJni.getKeyboardJni().getAsrGlobalContext(aVar.o().getLong("lastReportUsrWordsTimestamp", 0L), currentTimeMillis), com.google.gson.l.class)).j("hotwords");
                    if (j != null) {
                        if (z) {
                            kotlin.s.c.l.f("全局Context", "from");
                            String string = aVar.getContext().getString(C0838R.string.enable_cloud_use_personal_lexicon);
                            kotlin.s.c.l.e(string, "IAppGlobals.context.getS…oud_use_personal_lexicon)");
                            Object f2 = SettingsConfigNext.f(string);
                            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
                            Boolean bool = (Boolean) f2;
                            com.bytedance.android.input.r.j.i("CloudConfig", "isSupportCoundUsePersonalLexicon, from=全局Context state: " + bool.booleanValue());
                            if (bool.booleanValue() && (i2 = j.i("user_words")) != null) {
                                kotlin.s.c.l.e(i2, "get(\"user_words\")");
                                if (!(i2 instanceof com.google.gson.f) || i2.a().size() <= 0) {
                                    return;
                                } else {
                                    lVar.d("user_words", i2);
                                }
                            }
                        }
                        if (z2 && (i = j.i("common_words")) != null) {
                            kotlin.s.c.l.e(i, "get(\"common_words\")");
                            if (!(i instanceof com.google.gson.f) || i.a().size() <= 0) {
                                return;
                            } else {
                                lVar.d("common_words", i);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e.a.a.a.a.o0("reportUsrWords, e = ", e2, "AsrGlobalContext");
                }
            }
            if (arrayList != null && arrayList.size() > 0) {
                com.google.gson.f fVar = new com.google.gson.f();
                Iterator<T> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    kotlin.g gVar = (kotlin.g) it2.next();
                    com.google.gson.l lVar2 = new com.google.gson.l();
                    lVar2.g("name", (String) gVar.c());
                    lVar2.g("number", (String) gVar.d());
                    fVar.d(lVar2);
                }
                lVar.d("contact_list", fVar);
            }
            if (list != null) {
                if (!(!list.isEmpty())) {
                    return;
                }
                com.google.gson.f fVar2 = new com.google.gson.f();
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    fVar2.f(KeyboardJni.GetHansOrHant(1, (String) it3.next()));
                }
                lVar.d("at_words", fVar2);
            }
            lVar.d("additions", new com.google.gson.l());
            com.bytedance.android.input.r.j.i("AsrGlobalContext", "reportUsrWords, jsonObject = " + lVar);
            C0795d.b(C0800f0.a, S.b(), null, new b(lVar, z, currentTimeMillis, null), 2, null);
        }
    }

    public static final void h(String str) {
        kotlin.s.c.l.f(str, "text");
        if (str.length() > 500) {
            str = str.substring(str.length() - 500);
            kotlin.s.c.l.e(str, "this as java.lang.String).substring(startIndex)");
        }
        com.google.gson.l lVar = new com.google.gson.l();
        lVar.d("user", e());
        lVar.g("text", str);
        lVar.d("additions", new com.google.gson.l());
        com.bytedance.android.input.r.j.i("AsrGlobalContext", "[requestImeNer], jsonObject = " + lVar);
        C0795d.b(C0800f0.a, S.b(), null, new c(lVar, null), 2, null);
    }
}
