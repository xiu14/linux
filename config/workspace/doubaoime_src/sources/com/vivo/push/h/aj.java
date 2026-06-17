package com.vivo.push.h;

import android.content.Context;
import com.heytap.msp.push.callback.INotificationPermissionCallback;

/* loaded from: classes2.dex */
final class aj extends com.vivo.push.s {
    aj(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        Context context = this.a;
        if (context == null) {
            com.vivo.push.util.t.d("SendCommandTask", "SendCommandTask " + vVar + " ; mContext is Null");
            return;
        }
        if (vVar == null) {
            com.vivo.push.util.t.d("SendCommandTask", "SendCommandTask pushCommand is Null");
            return;
        }
        com.vivo.push.model.a a = com.vivo.push.util.aa.a(context, com.vivo.push.restructure.a.a().f());
        int b = vVar.b();
        if (b != 2009) {
            if (b != 2011) {
                switch (b) {
                    case INotificationPermissionCallback.CODE_HAD_PERMISSION /* 2002 */:
                    case INotificationPermissionCallback.CODE_SHOWING /* 2003 */:
                    case INotificationPermissionCallback.CODE_FREQUENT /* 2004 */:
                    case INotificationPermissionCallback.CODE_UNSUPPORT /* 2005 */:
                        if (a == null || a.c()) {
                            com.vivo.push.m.a().a(((com.vivo.push.b.c) vVar).g(), 1005);
                            break;
                        } else {
                            com.vivo.push.b.c cVar = (com.vivo.push.b.c) vVar;
                            int a2 = com.vivo.push.util.y.a(cVar);
                            if (a2 != 0) {
                                com.vivo.push.m.a().a(cVar.g(), a2);
                                return;
                            }
                        }
                        break;
                }
            } else {
                com.vivo.push.util.t.d("SendCommandTask", "SendCommandTask pushCommand is " + ((com.vivo.push.b.x) vVar).e());
            }
        } else if (com.vivo.push.util.t.b()) {
            com.vivo.push.m.a();
            com.vivo.push.restructure.a.a().e().e();
            com.vivo.push.util.c cVar2 = new com.vivo.push.util.c();
            cVar2.a(this.a, "com.vivo.push_preferences.hybridapptoken_v1");
            cVar2.b();
            new com.vivo.push.util.z(this.a).b();
        }
        if (a == null) {
            com.vivo.push.util.t.d("SendCommandTask", "SendCommandTask " + vVar + " ; pushPkgInfo is Null");
            return;
        }
        String a3 = a.a();
        if (a.c()) {
            try {
                com.vivo.push.m.a().a(((com.vivo.push.b.c) vVar).g(), 1004);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            vVar = new com.vivo.push.b.e();
            com.vivo.push.util.t.d("SendCommandTask", "SendCommandTask " + vVar + " ; pkgName is InBlackList ");
        }
        com.vivo.push.a.a.a(this.a, a3, vVar);
    }
}
