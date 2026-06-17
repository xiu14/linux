package com.bytedance.android.input.fragment.message.data;

import com.bytedance.android.input.basic.IAppGlobals;
import java.util.ArrayList;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class h extends m implements p<Integer, String, o> {
    final /* synthetic */ com.bytedance.android.input.fragment.message.entity.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(com.bytedance.android.input.fragment.message.entity.a aVar) {
        super(2);
        this.a = aVar;
    }

    @Override // kotlin.s.b.p
    public o invoke(Integer num, String str) {
        ArrayList<com.bytedance.android.input.fragment.message.entity.c> a;
        final int intValue = num.intValue();
        final String str2 = str;
        l.f(str2, "netMsg");
        IAppGlobals.a aVar = IAppGlobals.a;
        StringBuilder P = e.a.a.a.a.P("loadNetworkMessageList onFailure---netCode = ", intValue, "---netMsg---", str2, "---prepare handleNetworkFailed--fileListData isNotEmpty ? ");
        com.bytedance.android.input.fragment.message.entity.a aVar2 = this.a;
        P.append((aVar2 == null || (a = aVar2.a()) == null) ? null : Boolean.valueOf(!a.isEmpty()));
        aVar.j("MessageCenter-DataManager", P.toString());
        if (this.a == null || !(!r0.a().isEmpty())) {
            f fVar = f.a;
            com.bytedance.android.input.basic.thread.a.b(new Runnable() { // from class: com.bytedance.android.input.fragment.message.data.b
                @Override // java.lang.Runnable
                public final void run() {
                    f.k(intValue, str2);
                }
            }, 0L, 2);
        } else {
            f.c(f.a, null, this.a);
        }
        return o.a;
    }
}
