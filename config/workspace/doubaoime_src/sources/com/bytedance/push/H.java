package com.bytedance.push;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.third.PushManager;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public class H implements com.bytedance.push.interfaze.w {
    private final com.bytedance.push.interfaze.s a;
    private final com.bytedance.push.interfaze.l b;

    /* renamed from: c, reason: collision with root package name */
    private final C0679c f5553c;

    H(com.bytedance.push.interfaze.s sVar, com.bytedance.push.interfaze.l lVar, C0679c c0679c) {
        this.a = sVar;
        this.b = lVar;
        this.f5553c = c0679c;
    }

    public String a(int i, byte[] bArr, boolean z) throws DataFormatException, IOException {
        byte b = bArr[0];
        char c2 = (char) bArr[0];
        byte[] bytes = new String(bArr, 1, bArr.length - 1).getBytes();
        if (c2 == 'a') {
            return new String(bytes, 0, bytes.length);
        }
        String str = null;
        if (b == 0) {
            if (com.bytedance.push.g0.f.d()) {
                com.bytedance.push.g0.f.c("PushService getMessage", "uncopress message");
            }
            str = new String(bytes, 0, bytes.length);
        } else if (b == 2 || b == 3) {
            if (com.bytedance.push.g0.f.d()) {
                com.bytedance.push.g0.f.c("PushService getMessageV2", "encrypt message");
            }
            bytes = com.bytedance.feedbackerlib.a.p(bytes, 0);
            C.y().l(i, bytes == null ? 1 : 0);
            if (bytes != null) {
                str = new String(bytes, 0, bytes.length);
                if (b == 3) {
                    bytes = str.getBytes();
                }
            }
            return str;
        }
        if (b == 1 || b == 3) {
            Inflater inflater = new Inflater();
            if (z) {
                inflater.setInput(Base64.decode(bytes, 0, bytes.length, 0));
            } else {
                inflater.setInput(bytes, 0, bytes.length);
            }
            if (com.bytedance.push.g0.f.d()) {
                com.bytedance.push.g0.f.c("PushService getMessage", "copress message");
            }
            byte[] bArr2 = new byte[65536];
            synchronized (bArr2) {
                int inflate = inflater.inflate(bArr2);
                inflater.end();
                if (inflate > 0 && inflate < 65536) {
                    str = new String(bArr2, 0, inflate, "UTF-8");
                }
            }
        } else if (com.bytedance.push.g0.f.d()) {
            e.a.a.a.a.J0(e.a.a.a.a.M("onMessage : "), new String(bArr, 0, bArr.length), "PushService");
        }
        return str;
    }

    public Pair<String, String> b(int i) {
        StringBuilder N = e.a.a.a.a.N("[getPushConfig]pushType:", i, " mConfiguration:");
        N.append(this.f5553c);
        com.bytedance.push.g0.f.g("ThirdSupportService", N.toString());
        com.bytedance.push.third.g o = com.bytedance.push.third.g.o(com.ss.android.message.a.a());
        C0679c c0679c = this.f5553c;
        Objects.requireNonNull(o);
        StringBuilder sb = new StringBuilder();
        sb.append("[getPushConfig]pushType:");
        sb.append(i);
        sb.append(" configuration:");
        sb.append(c0679c);
        sb.append(" mKeyConfiguration:");
        sb.append(c0679c == null ? "null configuration" : c0679c.p);
        com.bytedance.push.g0.f.g("PushChannelHelper", sb.toString());
        if (i == 1) {
            Objects.requireNonNull((C0680d) c0679c.p);
            return new Pair<>("2882303761520472113", "5682047258113");
        }
        if (i == 8) {
            return ((C0680d) c0679c.p).b();
        }
        if (i == 10) {
            Objects.requireNonNull((C0680d) c0679c.p);
            return new Pair<>("0518ad9d502c4b53a8c95260a6673441", "da6c0873e02946a68699fc2eb2ee060c");
        }
        if (i == 26) {
            Objects.requireNonNull(c0679c.p);
        }
        return null;
    }

    public void c(Context context, String str, int i, String str2) {
        ((com.bytedance.push.notification.n) this.b).l(context, str, i, com.bytedance.push.g0.h.b(str));
    }

    public void d(int i, String str, String str2) {
        if (this.f5553c.c() != null) {
            this.f5553c.c().a(false, i);
        }
        com.bytedance.push.Q.b x = C.x();
        StringBuilder P = e.a.a.a.a.P("registerSenderFailed: pushType=", i, " ,errorId=", str, " ,msg=");
        P.append(str2);
        String sb = P.toString();
        Objects.requireNonNull((com.bytedance.push.Q.c) x);
        com.bytedance.push.g0.f.e("", sb);
    }

    public void e(Context context, int i, String str) {
        if (com.ss.android.message.f.a.t(context) || com.ss.android.message.f.a.z(context)) {
            G g2 = new G(this, str, i);
            Objects.requireNonNull((H) C.B());
            com.bytedance.push.d0.b.a(context, g2);
        }
        if (this.f5553c.c() != null) {
            this.f5553c.c().a(true, i);
        }
        if (((PushOnlineSettings) com.bytedance.push.settings.h.b(com.ss.android.message.a.a(), PushOnlineSettings.class)).Q() > 0) {
            com.bytedance.push.g0.f.c("", "forbid set alias. pushType = " + i + ", token = " + str);
            return;
        }
        Application a = com.ss.android.message.a.a();
        Objects.requireNonNull(com.ss.android.pushmanager.setting.c.c());
        com.ss.android.pushmanager.setting.a a2 = com.ss.android.pushmanager.setting.a.a();
        Objects.requireNonNull(a2);
        HashMap hashMap = new HashMap();
        a2.b(hashMap);
        String str2 = (String) hashMap.get("alias");
        if (TextUtils.isEmpty(str2)) {
            str2 = com.ss.android.pushmanager.setting.c.c().b();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.bytedance.push.interfaze.s sVar = this.a;
        Context applicationContext = a.getApplicationContext();
        Objects.requireNonNull((E) sVar);
        PushManager.inst().setAlias(applicationContext, str2, i);
    }
}
