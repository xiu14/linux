package com.bytedance.android.input.fragment.message.data;

import android.text.TextUtils;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.data_storage.api.ImeKv;
import com.bytedance.android.input.basic.data_storage.api.KvRepoStrategy;
import com.bytedance.android.input.fragment.message.entity.MessageState;
import com.prolificinteractive.materialcalendarview.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.b.p;
import kotlin.s.c.D;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class f {
    public static final f a = new f();
    private static final kotlin.e b = kotlin.a.c(c.a);

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.e f2344c = kotlin.a.c(d.a);

    /* renamed from: d, reason: collision with root package name */
    private static volatile MessageCenterLoadState f2345d = MessageCenterLoadState.LOADING;

    /* renamed from: e, reason: collision with root package name */
    private static com.bytedance.android.input.fragment.message.entity.a f2346e = new com.bytedance.android.input.fragment.message.entity.a();

    /* renamed from: f, reason: collision with root package name */
    private static final CopyOnWriteArrayList<l<com.bytedance.android.input.fragment.message.entity.a, o>> f2347f = new CopyOnWriteArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private static final CopyOnWriteArrayList<p<Integer, String, o>> f2348g = new CopyOnWriteArrayList<>();
    private static volatile String h;

    static final class a extends m implements l<com.bytedance.android.input.fragment.message.entity.a, o> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(com.bytedance.android.input.fragment.message.entity.a aVar) {
            String str;
            com.bytedance.android.input.fragment.message.entity.a aVar2 = aVar;
            kotlin.s.c.l.f(aVar2, "fileDataResult");
            f fVar = f.a;
            com.bytedance.android.input.fragment.message.entity.c d2 = fVar.g().d();
            if (aVar2.a().isEmpty() && d2 == null) {
                String a2 = f.a(fVar);
                IAppGlobals.a.j("MessageCenter-DataManager", "fileListData is null prepare load loadNetworkMessageList firstInstallTime = " + a2);
                f.d(fVar, a2, aVar2);
            } else {
                if (d2 == null || (str = d2.f()) == null) {
                    str = "";
                }
                if (TextUtils.isEmpty(str)) {
                    String a3 = f.a(fVar);
                    IAppGlobals.a.j("MessageCenter-DataManager", "fileFirstDataTimestamp is null prepare load loadNetworkMessageList firstInstallTime = " + a3);
                    f.d(fVar, a3, aVar2);
                } else {
                    IAppGlobals.a.j("MessageCenter-DataManager", "fileFirstDataTimestamp  = " + str + "---prepare load loadNetworkMessageList");
                    f.d(fVar, str, aVar2);
                }
            }
            return o.a;
        }
    }

    static final class b extends m implements p<Integer, String, o> {
        public static final b a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public o invoke(Integer num, String str) {
            int intValue = num.intValue();
            String str2 = str;
            kotlin.s.c.l.f(str2, "fileMsg");
            IAppGlobals.a.j("MessageCenter-DataManager", "fetchMessageList file onFailure---fileCode = " + intValue + "---fileMsg---" + str2 + "---prepare load loadNetworkMessageList");
            f fVar = f.a;
            f.d(fVar, f.a(fVar), null);
            return o.a;
        }
    }

    static final class c extends m implements kotlin.s.b.a<i> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ i invoke() {
            return i.a;
        }
    }

    static final class d extends m implements kotlin.s.b.a<j> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ j invoke() {
            return j.a;
        }
    }

    private f() {
    }

    public static final String a(f fVar) {
        long longValue = ((Number) ImeKv.a.c(KvRepoStrategy.DEFAULT_MULTI_PROCESS, "first_install_time", -1L)).longValue();
        IAppGlobals.a.j("ImePackageService", "getFirstInstallTime() = " + longValue);
        return String.valueOf(longValue);
    }

    public static final void c(f fVar, com.bytedance.android.input.fragment.message.entity.a aVar, com.bytedance.android.input.fragment.message.entity.a aVar2) {
        ArrayList<com.bytedance.android.input.fragment.message.entity.c> a2;
        ArrayList<com.bytedance.android.input.fragment.message.entity.c> a3;
        ArrayList<com.bytedance.android.input.fragment.message.entity.c> a4;
        final com.bytedance.android.input.fragment.message.entity.a aVar3 = new com.bytedance.android.input.fragment.message.entity.a();
        if (aVar != null) {
            aVar3.a().addAll(aVar.a());
        }
        if (aVar2 != null) {
            aVar3.a().addAll(aVar2.a());
        }
        IAppGlobals.a aVar4 = IAppGlobals.a;
        StringBuilder M = e.a.a.a.a.M("handleDataCombine combineData.size = ");
        M.append(aVar3.a().size());
        M.append("---netDataResult.size = ");
        M.append((aVar == null || (a4 = aVar.a()) == null) ? 0 : a4.size());
        M.append("---fileListData.size = ");
        M.append((aVar2 == null || (a3 = aVar2.a()) == null) ? 0 : a3.size());
        aVar4.j("MessageCenter-DataManager", M.toString());
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (com.bytedance.android.input.fragment.message.entity.c cVar : aVar3.a()) {
            if (!hashSet.add(cVar.d())) {
                arrayList.add(cVar);
            }
        }
        ArrayList<com.bytedance.android.input.fragment.message.entity.c> a5 = aVar3.a();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : a5) {
            if (hashSet2.add(((com.bytedance.android.input.fragment.message.entity.c) obj).d())) {
                arrayList2.add(obj);
            }
        }
        boolean z = true;
        if (!arrayList.isEmpty()) {
            IAppGlobals.a aVar5 = IAppGlobals.a;
            StringBuilder M2 = e.a.a.a.a.M("handleDataCombine deduplicate list by id, originalSize = ");
            M2.append(aVar3.a().size());
            M2.append("---distinctSize = ");
            M2.append(arrayList2.size());
            M2.append("---duplicateItems = ");
            M2.append(arrayList);
            aVar5.j("MessageCenter-DataManager", M2.toString());
            aVar3.a().clear();
            aVar3.a().addAll(arrayList2);
        }
        synchronized (f2346e) {
            f2346e = aVar3;
        }
        if ((aVar == null || (a2 = aVar.a()) == null || !(a2.isEmpty() ^ true)) ? false : true) {
            fVar.o(true);
            fVar.g().g(aVar3);
            Iterator<T> it2 = aVar.a().iterator();
            while (it2.hasNext()) {
                String d2 = ((com.bytedance.android.input.fragment.message.entity.c) it2.next()).d();
                kotlin.s.c.l.f(d2, "messageId");
                e.a.a.a.a.q0("message_id", d2, IAppLog.a, "message_receive");
            }
        }
        String str = h;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (!z) {
            String str2 = h;
            kotlin.s.c.l.c(str2);
            fVar.p(str2);
            h = null;
            fVar.o(false);
        }
        com.bytedance.android.input.basic.thread.a.b(new Runnable() { // from class: com.bytedance.android.input.fragment.message.data.d
            @Override // java.lang.Runnable
            public final void run() {
                f.m(com.bytedance.android.input.fragment.message.entity.a.this);
            }
        }, 0L, 2);
    }

    public static final void d(f fVar, String str, com.bytedance.android.input.fragment.message.entity.a aVar) {
        fVar.h().c(str, new g(aVar), new h(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i g() {
        return (i) b.getValue();
    }

    private final e h() {
        return (e) f2344c.getValue();
    }

    public static void j(String str) {
        Object J2;
        Object obj;
        kotlin.s.c.l.f(str, "$messageId");
        f fVar = a;
        try {
            synchronized (f2346e) {
                Iterator<T> it2 = f2346e.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (kotlin.s.c.l.a(((com.bytedance.android.input.fragment.message.entity.c) obj).d(), str)) {
                            break;
                        }
                    }
                }
                com.bytedance.android.input.fragment.message.entity.c cVar = (com.bytedance.android.input.fragment.message.entity.c) obj;
                if (cVar != null) {
                    cVar.k(MessageState.DELETED.getCode());
                }
                D.a(f2346e.a()).remove(cVar);
            }
            fVar.g().a(str);
            fVar.h().a(str);
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.O0(b2, e.a.a.a.a.M("deleteMessage failed e = "), IAppGlobals.a, "MessageCenter-DataManager");
        }
    }

    public static void k(int i, String str) {
        kotlin.s.c.l.f(str, "$netMsg");
        Iterator<T> it2 = f2348g.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).invoke(Integer.valueOf(i), str);
        }
        f2345d = MessageCenterLoadState.FAILED;
    }

    public static void l() {
        f fVar = a;
        f2345d = MessageCenterLoadState.LOADING;
        fVar.g().c(null, a.a, b.a);
    }

    public static void m(com.bytedance.android.input.fragment.message.entity.a aVar) {
        kotlin.s.c.l.f(aVar, "$messageListData");
        Iterator<T> it2 = f2347f.iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).invoke(aVar);
        }
        f2345d = MessageCenterLoadState.FINISH;
    }

    public final void e(String str) {
        kotlin.s.c.l.f(str, "pageFrom");
        IAppGlobals.a aVar = IAppGlobals.a;
        StringBuilder U = e.a.a.a.a.U("fetchMessageList pageFrom = ", str, "---currentLoadState = ");
        U.append(f2345d);
        aVar.j("MessageCenter-DataManager", U.toString());
        com.bytedance.android.input.basic.thread.a.a().execute(new Runnable() { // from class: com.bytedance.android.input.fragment.message.data.c
            @Override // java.lang.Runnable
            public final void run() {
                f.l();
            }
        });
    }

    public final int f() {
        ArrayList<com.bytedance.android.input.fragment.message.entity.c> a2 = f2346e.a();
        if ((a2 instanceof Collection) && a2.isEmpty()) {
            return 0;
        }
        Iterator<T> it2 = a2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if ((((com.bytedance.android.input.fragment.message.entity.c) it2.next()).e() == MessageState.UNREAD) && (i = i + 1) < 0) {
                kotlin.collections.g.a0();
                throw null;
            }
        }
        return i;
    }

    public final void i(l<? super com.bytedance.android.input.fragment.message.entity.a, o> lVar, p<? super Integer, ? super String, o> pVar) {
        kotlin.s.c.l.f(lVar, "onSuccess");
        kotlin.s.c.l.f(pVar, "onFailure");
        int ordinal = f2345d.ordinal();
        if (ordinal == 0) {
            f2347f.add(lVar);
            f2348g.add(pVar);
        } else if (ordinal == 1) {
            lVar.invoke(f2346e);
        } else {
            if (ordinal != 2) {
                return;
            }
            f2347f.add(lVar);
            f2348g.add(pVar);
            e("reload");
        }
    }

    public final void n(String str) {
        kotlin.s.c.l.f(str, "messageId");
        IAppGlobals.a.j("MessageCenter-DataManager", "markMessageRead messageId = " + str);
        h = str;
    }

    public final void o(boolean z) {
        ImeKv.a.a(KvRepoStrategy.DEFAULT_SINGLE_PROCESS, "entrance_has_un_read", Boolean.valueOf(z));
    }

    public final void p(String str) {
        Object J2;
        Object obj;
        kotlin.s.c.l.f(str, "messageId");
        try {
            synchronized (f2346e) {
                Iterator<T> it2 = f2346e.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (kotlin.s.c.l.a(((com.bytedance.android.input.fragment.message.entity.c) obj).d(), str)) {
                            break;
                        }
                    }
                }
                com.bytedance.android.input.fragment.message.entity.c cVar = (com.bytedance.android.input.fragment.message.entity.c) obj;
                if (cVar != null) {
                    cVar.k(MessageState.READ.getCode());
                }
                J2 = o.a;
            }
            g().b(str);
            h().b(str);
            IAppGlobals.a.j("MessageCenter-DataManager", "messageReadReported finish messageId = " + str);
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.O0(b2, e.a.a.a.a.M("messageReadReported failed e = "), IAppGlobals.a, "MessageCenter-DataManager");
        }
    }

    public final void q(l<? super com.bytedance.android.input.fragment.message.entity.a, o> lVar, p<? super Integer, ? super String, o> pVar) {
        Object J2;
        kotlin.s.c.l.f(lVar, "onSuccess");
        kotlin.s.c.l.f(pVar, "onFailure");
        try {
            f2347f.remove(lVar);
            J2 = Boolean.valueOf(f2348g.remove(pVar));
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.O0(b2, e.a.a.a.a.M("removeListener failed e = "), IAppGlobals.a, "MessageCenter-DataManager");
        }
    }

    public final boolean r() {
        return ((Boolean) ImeKv.a.c(KvRepoStrategy.DEFAULT_SINGLE_PROCESS, "entrance_has_un_read", Boolean.FALSE)).booleanValue();
    }
}
