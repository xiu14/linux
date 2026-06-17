package com.bytedance.android.input.q;

import com.bytedance.android.input.basic.recognition.api.a;
import com.bytedance.android.input.network.api.IQuickReply;
import com.bytedance.retrofit2.N;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONArray;
import org.json.JSONObject;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.QuickReply$request$1", f = "QuickReply.kt", l = {338}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class x extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.flow.g<?>, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    private /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<a.b> f3005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(List<a.b> list, kotlin.r.d<? super x> dVar) {
        super(2, dVar);
        this.f3005c = list;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        x xVar = new x(this.f3005c, dVar);
        xVar.b = obj;
        return xVar;
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.flow.g<?> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        x xVar = new x(this.f3005c, dVar);
        xVar.b = gVar;
        return xVar.invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        try {
            if (i == 0) {
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                kotlinx.coroutines.flow.g gVar = (kotlinx.coroutines.flow.g) this.b;
                List<a.b> list2 = this.f3005c;
                v vVar = v.a;
                com.bytedance.android.input.r.j.m("QuickReply", "request begin");
                IQuickReply a = v.a(v.a);
                ArrayList arrayList = new ArrayList(kotlin.collections.g.e(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    Objects.requireNonNull((a.b) it2.next());
                    arrayList.add(null);
                }
                N<String> execute = a.request(arrayList).execute();
                if (!execute.f()) {
                    v vVar2 = v.a;
                    execute.g();
                    com.bytedance.android.input.r.j.j("QuickReply", "request failed. err: null");
                    execute.g();
                    throw new IllegalStateException((String) null);
                }
                JSONObject optJSONObject = new JSONObject(execute.a()).optJSONObject(RemoteMessageConst.DATA);
                if (optJSONObject != null) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("reply");
                    if (optJSONArray != null) {
                        kotlin.w.d i2 = kotlin.w.h.i(0, optJSONArray.length());
                        list = new ArrayList(optJSONArray.length());
                        Iterator<Integer> it3 = i2.iterator();
                        while (it3.hasNext()) {
                            Object opt = optJSONArray.opt(((kotlin.collections.o) it3).nextInt());
                            if (!(opt instanceof String)) {
                                opt = null;
                            }
                            String str = (String) opt;
                            if (str != null) {
                                list.add(str);
                            }
                        }
                    } else {
                        list = kotlin.collections.l.a;
                    }
                } else {
                    list = kotlin.collections.l.a;
                }
                v vVar3 = v.a;
                com.bytedance.android.input.r.j.m("QuickReply", "request end. size: " + list.size());
                this.a = 1;
                if (gVar.emit(list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.prolificinteractive.materialcalendarview.r.k0(obj);
            }
        } catch (Throwable th) {
            com.prolificinteractive.materialcalendarview.r.J(th);
        }
        return kotlin.o.a;
    }
}
