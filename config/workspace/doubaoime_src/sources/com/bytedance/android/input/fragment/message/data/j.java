package com.bytedance.android.input.fragment.message.data;

import android.text.TextUtils;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.speech.IRequests;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.retrofit2.N;
import com.prolificinteractive.materialcalendarview.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class j implements e {
    public static final j a = new j();

    public static final class a extends com.google.gson.u.a<com.bytedance.android.input.fragment.message.entity.a> {
    }

    private j() {
    }

    @Override // com.bytedance.android.input.fragment.message.data.e
    public void a(String str) {
        l.f(str, "messageId");
        com.bytedance.android.input.r.j.i("MessageCenter-Network", "deleteMessage: " + str + "--- no need for invoke");
    }

    @Override // com.bytedance.android.input.fragment.message.data.e
    public void b(String str) {
        Object J2;
        l.f(str, "messageId");
        com.bytedance.android.input.r.j.i("MessageCenter-Network", "messageReadReported: " + str);
        try {
            String deviceId = IAppLog.a.getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                com.bytedance.android.input.r.j.i("MessageCenter-Network", "messageReadReported: deviceId is null...");
            } else {
                com.google.gson.l lVar = new com.google.gson.l();
                lVar.g("msgid", str);
                lVar.g("did", deviceId);
                lVar.g(WsConstants.KEY_PLATFORM, "android");
                N<String> execute = IRequests.a.f().messageReadReported(lVar, true).execute();
                if (execute.f()) {
                    com.bytedance.android.input.r.j.i("MessageCenter-Network", "messageReadReported: " + str + ", success");
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("messageReadReported: code = ");
                    sb.append(execute.b());
                    sb.append("---message = ");
                    execute.g();
                    sb.append((String) null);
                    com.bytedance.android.input.r.j.j("MessageCenter-Network", sb.toString());
                }
            }
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.P0(b, e.a.a.a.a.M("messageReadReported: error: "), "MessageCenter-Network");
        }
    }

    @Override // com.bytedance.android.input.fragment.message.data.e
    public void c(String str, kotlin.s.b.l<? super com.bytedance.android.input.fragment.message.entity.a, o> lVar, p<? super Integer, ? super String, o> pVar) {
        Object J2;
        ArrayList<com.bytedance.android.input.fragment.message.entity.c> a2;
        l.f(lVar, "onSuccess");
        l.f(pVar, "onFailure");
        com.bytedance.android.input.r.j.i("MessageCenter-Network", "messageListMessage: lastTimestamp = " + str);
        try {
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        if (!NetworkUtils.h(IAppGlobals.a.getContext())) {
            pVar.invoke(-2, "network not available");
            return;
        }
        String deviceId = IAppLog.a.getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            pVar.invoke(-3, "deviceId is empty");
            return;
        }
        com.google.gson.l lVar2 = new com.google.gson.l();
        lVar2.g("last_timestamp", str);
        lVar2.g("did", deviceId);
        lVar2.g(WsConstants.KEY_PLATFORM, "android");
        N<String> execute = IRequests.a.f().messageList(lVar2, true).execute();
        com.bytedance.android.input.basic.network.d.b bVar = com.bytedance.android.input.basic.network.d.b.a;
        l.e(execute, "result");
        Type e2 = com.google.gson.u.a.c(com.bytedance.android.input.basic.network.b.a.class, new a().e()).e();
        l.e(e2, "responseType");
        com.bytedance.android.input.basic.network.b.a b = bVar.b(execute, e2);
        StringBuilder sb = new StringBuilder();
        sb.append("responseResult size = ");
        com.bytedance.android.input.fragment.message.entity.a aVar = (com.bytedance.android.input.fragment.message.entity.a) b.b();
        o oVar = null;
        sb.append((aVar == null || (a2 = aVar.a()) == null) ? null : Integer.valueOf(a2.size()));
        sb.append(" ---jsonData = ");
        com.bytedance.android.input.fragment.message.entity.a aVar2 = (com.bytedance.android.input.fragment.message.entity.a) b.b();
        sb.append(aVar2 != null ? aVar2.b() : null);
        com.bytedance.android.input.r.j.i("MessageCenter-Network", sb.toString());
        if (b.d()) {
            if (((com.bytedance.android.input.fragment.message.entity.a) b.b()) != null) {
                Object b2 = b.b();
                l.c(b2);
                lVar.invoke(b2);
                oVar = o.a;
            }
            if (oVar == null) {
                pVar.invoke(Integer.valueOf(b.a()), "data is null, raw message = " + b.c());
            }
        } else {
            pVar.invoke(Integer.valueOf(b.a()), b.c());
        }
        J2 = o.a;
        Throwable b3 = kotlin.h.b(J2);
        if (b3 != null) {
            StringBuilder M = e.a.a.a.a.M("messageListMessage, error: ");
            M.append(kotlin.a.d(b3));
            com.bytedance.android.input.r.j.j("MessageCenter-Network", M.toString());
            StringBuilder M2 = e.a.a.a.a.M("messageListMessage exception = ");
            M2.append(kotlin.a.d(b3));
            pVar.invoke(-1, M2.toString());
        }
    }
}
