package com.xiaomi.push;

import android.app.NotificationChannel;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.xiaomi.push.jl;
import com.xiaomi.push.jv;

/* loaded from: classes2.dex */
public class je {
    public static <T extends jf<T, ?>> byte[] a(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new jk(new jl.a()).a(t);
        } catch (jj e2) {
            com.xiaomi.channel.commonutils.logger.c.a("convertThriftObjectToBytes catch TException.", e2);
            return null;
        }
    }

    public static <T extends jf<T, ?>> void a(T t, byte[] bArr) {
        if (bArr != null) {
            new ji(new jv.a(true, true, bArr.length)).a(t, bArr);
            return;
        }
        throw new jj("the message byte is empty.");
    }

    public static short a(Context context, iq iqVar) {
        ih m558a = iqVar.m558a();
        return m632a(context, iqVar.f738b, (m558a == null || m558a.m525a() == null) ? null : m558a.m525a().get(WsConstants.KEY_CHANNEL_ID));
    }

    public static short a(Context context, String str) {
        return m632a(context, str, (String) null);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static short m632a(Context context, String str, String str2) {
        return (short) (h.a(context, str, false).a() + 0 + (ag.b(context) ? 4 : 0) + (ag.a(context) ? 8 : 0) + (com.xiaomi.push.service.an.m744a(context) ? 16 : 0) + a(context, str, str2));
    }

    private static int a(Context context, String str, String str2) {
        com.xiaomi.push.service.an a;
        NotificationChannel m747a;
        if (context == null || TextUtils.isEmpty(str) || (a = com.xiaomi.push.service.an.a(context, str)) == null || (m747a = a.m747a(a.m750a(str2))) == null) {
            return 0;
        }
        return m747a.getImportance() != 0 ? 32 : 64;
    }
}
