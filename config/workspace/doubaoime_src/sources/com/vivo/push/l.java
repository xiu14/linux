package com.vivo.push;

import android.content.Intent;
import com.vivo.push.h.ai;

/* loaded from: classes2.dex */
public final class l implements IPushClientFactory {
    private ai a = new ai();

    @Override // com.vivo.push.IPushClientFactory
    public final com.vivo.push.h.ab createReceiveTask(v vVar) {
        return ai.b(vVar);
    }

    @Override // com.vivo.push.IPushClientFactory
    public final v createReceiverCommand(Intent intent) {
        v vVar;
        v uVar;
        int intExtra = intent.getIntExtra(com.heytap.mcssdk.constant.b.y, -1);
        if (intExtra < 0) {
            intExtra = intent.getIntExtra("method", -1);
        }
        if (intExtra == 20) {
            vVar = new com.vivo.push.b.v();
        } else if (intExtra == 2016) {
            vVar = new com.vivo.push.b.l();
        } else if (intExtra != 2023) {
            switch (intExtra) {
                case 1:
                case 2:
                    uVar = new com.vivo.push.b.u(intExtra);
                    vVar = uVar;
                    break;
                case 3:
                    vVar = new com.vivo.push.b.o();
                    break;
                case 4:
                    vVar = new com.vivo.push.b.q();
                    break;
                case 5:
                    vVar = new com.vivo.push.b.p();
                    break;
                case 6:
                    vVar = new com.vivo.push.b.s();
                    break;
                case 7:
                    vVar = new com.vivo.push.b.n();
                    break;
                case 8:
                    vVar = new com.vivo.push.b.m();
                    break;
                case 9:
                    vVar = new com.vivo.push.b.k();
                    break;
                case 10:
                case 11:
                    uVar = new com.vivo.push.b.i(intExtra);
                    vVar = uVar;
                    break;
                case 12:
                    vVar = new com.vivo.push.b.j();
                    break;
                default:
                    vVar = null;
                    break;
            }
        } else {
            vVar = new com.vivo.push.b.r();
        }
        if (vVar != null) {
            d a = d.a(intent);
            if (a == null) {
                com.vivo.push.util.t.b("PushCommand", "bundleWapper is null");
            } else {
                vVar.b(a);
            }
        }
        return vVar;
    }

    @Override // com.vivo.push.IPushClientFactory
    public final s createTask(v vVar) {
        return ai.a(vVar);
    }
}
