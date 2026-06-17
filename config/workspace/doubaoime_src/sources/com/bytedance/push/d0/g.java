package com.bytedance.push.d0;

import android.util.Pair;
import com.bytedance.common.utility.e;
import com.bytedance.push.C;
import com.bytedance.push.PushBody;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class g implements Runnable {
    private final PushBody a;
    private final int b;

    public g(int i, PushBody pushBody) {
        this.b = i;
        this.a = pushBody;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a;
        com.bytedance.push.g0.f.l("Show", "start to upload filter event");
        com.bytedance.common.push.e.a aVar = ((C) C.a()).d().v;
        String str = this.a.f5572f;
        com.bytedance.push.R.g c2 = d.c(com.ss.android.message.a.a(), this.b);
        String str2 = "";
        String str3 = c2 != null ? c2.f5589d : "";
        com.bytedance.push.g0.f.l("Show", "token info = " + c2);
        if (aVar != null && (a = aVar.a()) != null) {
            str2 = a;
        }
        String a2 = com.ss.android.g.a.a("/cloudpush/user_push_replace/");
        com.ss.android.message.f.a.c(a2, ((C) C.a()).c());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("ttpush_sec_target_uid", str));
        arrayList.add(new Pair("local_sec_uid", str2));
        arrayList.add(new Pair("send_sdk", String.valueOf(this.b)));
        arrayList.add(new Pair("token", str3));
        arrayList.add(new Pair("rid64", String.valueOf(this.a.f5569c)));
        try {
            e.a aVar2 = new e.a();
            aVar2.a = false;
            com.bytedance.push.g0.f.g("Show", "upload filter event. result = " + com.bytedance.common.utility.e.b().c(a2, arrayList, com.ss.android.message.f.a.a(null), aVar2));
        } catch (Throwable th) {
            com.bytedance.push.g0.f.e("Show", "upload filter event. result = " + th);
            th.printStackTrace();
        }
    }
}
