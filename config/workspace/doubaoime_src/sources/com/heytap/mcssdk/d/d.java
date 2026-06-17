package com.heytap.mcssdk.d;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.BaseMode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class d implements e {
    public static int a(Intent intent) {
        int i = 4096;
        if (intent == null) {
            return 4096;
        }
        try {
            i = Integer.parseInt(com.heytap.mcssdk.utils.b.d(intent.getStringExtra("type")));
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("parseMessageType e:");
            M.append(e2.getMessage());
            com.heytap.mcssdk.utils.e.e(M.toString());
        }
        com.heytap.mcssdk.utils.e.b("parseMessageType type:" + i);
        return i;
    }

    public static List<BaseMode> a(Context context, Intent intent, List<e> list) {
        BaseMode a;
        if (intent == null) {
            return null;
        }
        int a2 = a(intent);
        ArrayList arrayList = new ArrayList();
        for (e eVar : list) {
            if (eVar != null && (a = eVar.a(context, a2, intent)) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    protected abstract BaseMode a(Intent intent, int i);
}
