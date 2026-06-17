package com.bytedance.android.input.p;

import android.graphics.PointF;
import android.os.Build;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.llm.LLMRequest;
import com.bytedance.android.input.network.api.IRecommends;
import com.bytedance.android.input.r.j;
import com.bytedance.crash.general.RomInfo;
import com.google.gson.Gson;
import com.google.gson.f;
import com.prolificinteractive.materialcalendarview.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.d;
import kotlin.r.h.a.e;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;
import kotlinx.coroutines.G;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class a {
    public static final a a = null;
    private static final List<C0089a> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static C0089a f2889c;

    /* renamed from: com.bytedance.android.input.p.a$a, reason: collision with other inner class name */
    public static final class C0089a {
        private final List<List<PointF>> a;
        private String b;

        public C0089a() {
            this(null, null, 3);
        }

        public C0089a(List list, String str, int i) {
            ArrayList arrayList = (i & 1) != 0 ? new ArrayList() : null;
            String str2 = (i & 2) != 0 ? "" : null;
            l.f(arrayList, "strokes");
            l.f(str2, "chosen");
            this.a = arrayList;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final List<List<PointF>> b() {
            return this.a;
        }

        public final void c(String str) {
            l.f(str, "<set-?>");
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0089a)) {
                return false;
            }
            C0089a c0089a = (C0089a) obj;
            return l.a(this.a, c0089a.a) && l.a(this.b, c0089a.b);
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("CharRecord(strokes=");
            M.append(this.a);
            M.append(", chosen=");
            return e.a.a.a.a.G(M, this.b, ')');
        }
    }

    @e(c = "com.bytedance.android.input.handwriting.HandwritingHistoryStore$uploadAllAndClear$3", f = "HandwritingHistoryStore.kt", l = {}, m = "invokeSuspend")
    static final class b extends i implements p<G, d<? super o>, Object> {
        final /* synthetic */ com.google.gson.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.google.gson.l lVar, d<? super b> dVar) {
            super(2, dVar);
            this.a = lVar;
        }

        @Override // kotlin.r.h.a.a
        public final d<o> create(Object obj, d<?> dVar) {
            return new b(this.a, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, d<? super o> dVar) {
            b bVar = new b(this.a, dVar);
            o oVar = o.a;
            bVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            r.k0(obj);
            try {
                j.i("HandwritingHistoryStore", "reportHandwritingData, response is " + ((String) com.bytedance.android.input.k.b.a.E0(IRecommends.a.k(), this.a, false, 2, null).execute().a()));
            } catch (Exception e2) {
                e.a.a.a.a.o0("reportHandwritingData, e = ", e2, "HandwritingHistoryStore");
            }
            return o.a;
        }
    }

    public static final void a(PointF pointF) {
        l.f(pointF, "p");
        l.f(pointF, "p");
        C0089a c0089a = f2889c;
        if (c0089a == null || c0089a.b().isEmpty()) {
            return;
        }
        ((List) g.D(c0089a.b())).add(new PointF(pointF.x, pointF.y));
    }

    public static final void b(String str) {
        String str2;
        String sb;
        l.f(str, "preeditText");
        C0089a c0089a = f2889c;
        if (c0089a == null && (c0089a = (C0089a) g.E(b)) == null) {
            return;
        }
        String commitOriginalString = ((Boolean) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.is_hant_enabled, "IAppGlobals.context.getS…R.string.is_hant_enabled)", "null cannot be cast to non-null type kotlin.Boolean")).booleanValue() ? KeyboardJni.getKeyboardJni().getCommitOriginalString(0) : str;
        l.e(commitOriginalString, "commitStr");
        if (commitOriginalString.length() == 0) {
            str2 = "";
        } else {
            char[] chars = Character.toChars(Character.codePointAt(commitOriginalString, 0));
            l.e(chars, "toChars(cp)");
            str2 = new String(chars);
        }
        if (f2889c != null) {
            sb = "currentChar";
        } else {
            StringBuilder M = e.a.a.a.a.M("historyLast index=");
            M.append(b.size() - 1);
            sb = M.toString();
        }
        String a2 = c0089a.a();
        StringBuilder W = e.a.a.a.a.W("assignChosenForLast: source=", sb, ", preeditText='", str, "', first='");
        W.append(str2);
        W.append("', prevChosen='");
        W.append(a2);
        W.append('\'');
        j.i("HandwritingHistoryStore", W.toString());
        c0089a.c(str2);
    }

    public static final void c(PointF pointF) {
        l.f(pointF, "p");
        l.f(pointF, "p");
        C0089a c0089a = f2889c;
        if (c0089a == null) {
            c0089a = new C0089a(null, null, 3);
            f2889c = c0089a;
        }
        c0089a.b().add(g.K(new PointF(pointF.x, pointF.y)));
        StringBuilder sb = new StringBuilder();
        sb.append("startNewStroke: charCreated=");
        sb.append(f2889c == c0089a);
        sb.append(", charStrokes=");
        sb.append(c0089a.b().size());
        sb.append(", firstPoint=(");
        sb.append(pointF.x);
        sb.append(',');
        sb.append(pointF.y);
        sb.append(')');
        j.i("HandwritingHistoryStore", sb.toString());
    }

    public static final void d() {
        C0089a c0089a = f2889c;
        if (c0089a == null) {
            return;
        }
        b.add(c0089a);
        f2889c = null;
        List<List<PointF>> b2 = c0089a.b();
        ArrayList arrayList = new ArrayList(g.e(b2, 10));
        Iterator<T> it2 = b2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((List) it2.next()).size()));
        }
        StringBuilder M = e.a.a.a.a.M("finalizeCurrentChar: totalChars=");
        M.append(b.size());
        M.append(", strokes=");
        M.append(c0089a.b().size());
        M.append(", strokeSizes=");
        M.append(arrayList);
        j.i("HandwritingHistoryStore", M.toString());
    }

    public static final void e() {
        C0089a c0089a = f2889c;
        if (c0089a != null) {
            b.add(c0089a);
            f2889c = null;
        }
        List<C0089a> list = b;
        if (list.isEmpty()) {
            return;
        }
        try {
            try {
                com.google.gson.l lVar = new com.google.gson.l();
                IAppLog.a aVar = IAppLog.a;
                Objects.requireNonNull(aVar);
                lVar.g("did", aVar.getDeviceId());
                lVar.g("app_version", "1.3.9");
                lVar.f("report_time", Long.valueOf(System.currentTimeMillis()));
                lVar.g(RomInfo.KEY_OS_TYPE, "android");
                IAppGlobals.a aVar2 = IAppGlobals.a;
                Objects.requireNonNull(aVar2);
                lVar.g("app_channel", d.a.b.a.c(aVar2));
                lVar.g(RomInfo.KEY_ROM_OS_VERSION, Build.VERSION.RELEASE);
                lVar.f("sdk_int", Integer.valueOf(Build.VERSION.SDK_INT));
                lVar.g("manufacturer", Build.MANUFACTURER);
                lVar.g("model", Build.MODEL);
                lVar.g("user_app", aVar2.H());
                lVar.d("region", LLMRequest.a.h());
                Gson gson = new Gson();
                f fVar = new f();
                j.i("HandwritingHistoryStore", "uploadAllAndClear: totalChars=" + list.size());
                for (C0089a c0089a2 : list) {
                    List<List<PointF>> b2 = c0089a2.b();
                    ArrayList arrayList = new ArrayList(g.e(b2, 10));
                    Iterator<T> it2 = b2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((List) it2.next()).size()));
                    }
                    j.i("HandwritingHistoryStore", "upload item: chosen='" + c0089a2.a() + "', strokes=" + c0089a2.b().size() + ", strokeSizes=" + arrayList);
                    com.google.gson.l lVar2 = new com.google.gson.l();
                    lVar2.g("commit_char", c0089a2.a());
                    f fVar2 = new f();
                    Iterator<T> it3 = c0089a2.b().iterator();
                    while (it3.hasNext()) {
                        List<PointF> list2 = (List) it3.next();
                        f fVar3 = new f();
                        for (PointF pointF : list2) {
                            f fVar4 = new f();
                            fVar4.e(Integer.valueOf((int) pointF.x));
                            fVar4.e(Integer.valueOf((int) pointF.y));
                            fVar3.d(fVar4);
                        }
                        fVar2.d(fVar3);
                    }
                    lVar2.d("strokes", fVar2);
                    fVar.f(gson.i(lVar2));
                }
                lVar.g("input_type", "hdwt");
                lVar.e("upset", Boolean.TRUE);
                lVar.d("content_list", fVar);
                C0795d.b(C0800f0.a, S.b(), null, new b(lVar, null), 2, null);
                j.i("HandwritingHistoryStore", "uploadAllAndClear ok: count=" + fVar.size());
            } catch (Exception e2) {
                j.j("HandwritingHistoryStore", "uploadAllAndClear error: " + e2.getMessage());
            }
        } finally {
            b.clear();
        }
    }
}
