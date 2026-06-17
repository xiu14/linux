package com.bytedance.android.input.q;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.recognition.api.IRecognizer;
import com.bytedance.android.input.basic.recognition.api.a;
import com.bytedance.android.input.network.api.IQuickReply;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    private static InterfaceC0817m0 f3001e;
    private static boolean n;
    public static final v a = new v();
    private static final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.e f2999c = kotlin.a.c(a.a);

    /* renamed from: d, reason: collision with root package name */
    private static String f3000d = "";

    /* renamed from: f, reason: collision with root package name */
    private static String f3002f = "";

    /* renamed from: g, reason: collision with root package name */
    private static String f3003g = "";
    private static final ConcurrentHashMap<String, List<String>> h = new ConcurrentHashMap<>();
    private static ArrayList<String> i = new ArrayList<>();
    private static boolean j = true;
    private static String k = "";
    private static String l = "";
    private static String m = "";
    private static String o = "";
    private static boolean p = true;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<IQuickReply> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public IQuickReply invoke() {
            return (IQuickReply) RetrofitUtils.e("https://ime.doubao.com", IQuickReply.class);
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            if (bool.booleanValue()) {
                IAppGlobals.a.o().edit().putInt("RECOMMEND_CHAT_ASSISTANT_ALLOW", 100309006).apply();
                com.bytedance.android.input.r.j.m("QuickReply", "openReplySetting tryRequestQuickReply");
                v.a.p();
            }
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.p<String, IRecognizer.e, kotlin.o> {
        public static final c a = new c();

        c() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public kotlin.o invoke(String str, IRecognizer.e eVar) {
            String str2 = str;
            IRecognizer.e eVar2 = eVar;
            kotlin.s.c.l.f(str2, "id");
            kotlin.s.c.l.f(eVar2, "result");
            v vVar = v.a;
            com.bytedance.android.input.r.j.i("QuickReply", "tryRequestQuickReply begin");
            v vVar2 = v.a;
            v.f3002f = str2;
            Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
            if (eVar2.a() != IRecognizer.Scene.CHAT) {
                com.bytedance.android.input.r.j.j("QuickReply", "recognize scene is not chat");
                v.i(vVar2);
            } else if (eVar2 instanceof IRecognizer.f) {
                IRecognizer.f fVar = (IRecognizer.f) eVar2;
                if (fVar.b().g()) {
                    StringBuilder M = e.a.a.a.a.M("result cvs is group. cvsid: ");
                    M.append(fVar.b().c());
                    com.bytedance.android.input.r.j.j("QuickReply", M.toString());
                    v.i(vVar2);
                } else {
                    com.bytedance.android.input.basic.recognition.api.a b = fVar.b();
                    StringBuilder U = e.a.a.a.a.U("recognize id: ", str2, ", cvsid: ");
                    U.append(b.c());
                    U.append(", lastid: ");
                    U.append(v.f3003g);
                    com.bytedance.android.input.r.j.i("QuickReply", U.toString());
                    if (kotlin.s.c.l.a(v.f3003g, b.c())) {
                        com.bytedance.android.input.r.j.j("QuickReply", "last cvsid equals cvsid");
                    } else {
                        v.f3003g = b.c();
                        if (b.f()) {
                            StringBuilder M2 = e.a.a.a.a.M("conversation isEmpty. cvsid: ");
                            M2.append(b.c());
                            com.bytedance.android.input.r.j.j("QuickReply", M2.toString());
                            v.i(vVar2);
                        } else {
                            if (!b.d().isEmpty()) {
                                Objects.requireNonNull((a.b) kotlin.collections.g.D(b.d()));
                            }
                            List list = (List) v.h.get(b.c());
                            if (list == null) {
                                List<a.b> d2 = b.d();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : d2) {
                                    Objects.requireNonNull((a.b) obj);
                                    arrayList.add(obj);
                                }
                                if (arrayList.isEmpty()) {
                                    v vVar3 = v.a;
                                    StringBuilder M3 = e.a.a.a.a.M("cvs messages list is empty, cvsid: ");
                                    M3.append(b.c());
                                    com.bytedance.android.input.r.j.j("QuickReply", M3.toString());
                                    v.i(v.a);
                                } else {
                                    v.d(v.a, arrayList, new y(b));
                                }
                            } else if (!list.isEmpty()) {
                                StringBuilder M4 = e.a.a.a.a.M("reply history. tryShowReply. cvsid: ");
                                M4.append(b.c());
                                com.bytedance.android.input.r.j.m("QuickReply", M4.toString());
                                v.h(vVar2, b.c(), list);
                            }
                        }
                    }
                }
            } else {
                com.bytedance.android.input.r.j.j("QuickReply", "recognize result is not success");
                v.i(vVar2);
            }
            return kotlin.o.a;
        }
    }

    private v() {
    }

    public static final IQuickReply a(v vVar) {
        return (IQuickReply) f2999c.getValue();
    }

    public static final void d(v vVar, List list, kotlin.s.b.l lVar) {
        LifecycleCoroutineScope lifecycleScope;
        ImeService service = KeyboardJni.getService();
        if (service == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(service)) == null) {
            return;
        }
        InterfaceC0817m0 interfaceC0817m0 = f3001e;
        if (interfaceC0817m0 != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
        f3001e = kotlinx.coroutines.flow.h.l(new w(kotlinx.coroutines.flow.h.k(kotlinx.coroutines.flow.h.e(kotlinx.coroutines.flow.h.j(new x(list, null))), S.b()), lVar), lifecycleScope);
    }

    public static final void h(v vVar, final String str, final List list) {
        b.post(new Runnable() { // from class: com.bytedance.android.input.q.a
            @Override // java.lang.Runnable
            public final void run() {
                v.l(str, list);
            }
        });
    }

    public static final void i(v vVar) {
        j = true;
        i.clear();
        vVar.j();
    }

    private final void j() {
        StringBuilder M = e.a.a.a.a.M("chatAndQuickShow chatRequestBack: ");
        M.append(p);
        M.append(", replyRequestBack: ");
        e.a.a.a.a.N0(M, j, "QuickReply");
        if (p && j) {
            StringBuilder M2 = e.a.a.a.a.M("chatAndQuickShow called.replytoshow:");
            M2.append(i);
            M2.append(",content:");
            M2.append(l);
            M2.append(",request:");
            M2.append(m);
            M2.append(",issmartreply:");
            e.a.a.a.a.N0(M2, n, "QuickReply");
            if (i.isEmpty()) {
                if ((l.length() == 0) && !n) {
                    com.bytedance.android.input.r.j.j("QuickReply", "quickreply topic smartreply all empty");
                    return;
                }
            }
            KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
            Object[] array = i.toArray(new String[0]);
            kotlin.s.c.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            boolean tryShowReply = keyboardJni.tryShowReply((String[]) array, l, m, n);
            com.bytedance.android.input.r.j.m("QuickReply", "chatAndQuickShow tryShowReply result: " + tryShowReply);
            if (tryShowReply && (!i.isEmpty())) {
                h.put(k, kotlin.collections.l.a);
                i.clear();
                j = false;
                k = "";
                com.bytedance.android.input.r.j.i("QuickReply", "clearData end");
            }
            if (tryShowReply) {
                if ((l.length() > 0) || n) {
                    q.a.a(o);
                    k();
                }
            }
        }
    }

    public static void l(String str, List list) {
        kotlin.s.c.l.f(str, "$conversationId");
        kotlin.s.c.l.f(list, "$reply");
        com.bytedance.android.input.r.j.i("QuickReply", "tryShowReply called. cvsid:" + str);
        v vVar = a;
        j = true;
        k = str;
        i = (ArrayList) list;
        vVar.j();
    }

    public static final void o() {
        z.a.E(b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        if (!kotlin.text.a.s(f3002f)) {
            IRecognizer.a.b(f3002f);
        }
        Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
        z.a.B(c.a);
    }

    public final void k() {
        l = "";
        m = "";
        p = false;
        n = false;
        o = "";
        com.bytedance.android.input.r.j.i("QuickReply", "clearChatData end");
    }

    public final void m() {
        InterfaceC0817m0 interfaceC0817m0 = f3001e;
        if (interfaceC0817m0 != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
        f3001e = null;
        IRecognizer.a.b(f3002f);
        f3002f = "";
    }

    public final void n(String str) {
        kotlin.s.c.l.f(str, DBDefinition.PACKAGE_NAME);
        InterfaceC0817m0 interfaceC0817m0 = f3001e;
        if (interfaceC0817m0 != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
        f3001e = null;
        IRecognizer.a.b(f3002f);
        f3002f = "";
        if (kotlin.s.c.l.a(f3000d, str)) {
            return;
        }
        f3000d = str;
        f3003g = "";
        h.clear();
    }

    public final void q() {
        b.post(new Runnable() { // from class: com.bytedance.android.input.q.b
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0116, code lost:
            
                if (((java.lang.Boolean) r2).booleanValue() != false) goto L52;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 340
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.q.RunnableC0605b.run():void");
            }
        });
    }
}
