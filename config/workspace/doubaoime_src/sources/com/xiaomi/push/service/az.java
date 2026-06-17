package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.bytedance.android.service.manager.pull.PullConfiguration;
import com.bytedance.crash.general.RomInfo;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.cp;
import com.xiaomi.push.cs;
import com.xiaomi.push.ct;
import com.xiaomi.push.ee;
import com.xiaomi.push.ef;
import com.xiaomi.push.fx;
import com.xiaomi.push.gd;
import com.xiaomi.push.ge;
import com.xiaomi.push.gp;
import com.xiaomi.push.hm;
import com.xiaomi.push.service.bi;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class az extends bi.a implements ct.a {
    private long a;

    /* renamed from: a, reason: collision with other field name */
    private XMPushService f1071a;

    static class a implements ct.b {
        a() {
        }

        @Override // com.xiaomi.push.ct.b
        public String a(String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("sdkver", String.valueOf(f.a()));
            buildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            buildUpon.appendQueryParameter(RomInfo.KEY_OS_TYPE, hm.a(com.xiaomi.push.k.e()));
            buildUpon.appendQueryParameter("mi", String.valueOf(com.xiaomi.push.t.a()));
            String builder = buildUpon.toString();
            com.xiaomi.channel.commonutils.logger.c.c("fetch bucket from : " + builder);
            URL url = new URL(builder);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String a = com.xiaomi.push.ax.a(com.xiaomi.push.t.m841a(), url);
                ge.a(url.getHost() + Constants.COLON_SEPARATOR + port, (int) (System.currentTimeMillis() - currentTimeMillis), null);
                return a;
            } catch (IOException e2) {
                ge.a(url.getHost() + Constants.COLON_SEPARATOR + port, -1, e2);
                throw e2;
            }
        }
    }

    static class b extends ct {
        protected b(Context context, cs csVar, ct.b bVar, String str) {
            super(context, csVar, bVar, str);
        }

        @Override // com.xiaomi.push.ct
        protected String a(ArrayList<String> arrayList, String str, String str2, boolean z) {
            try {
                if (gd.m406a().m411a()) {
                    str2 = bi.m780a();
                }
                return super.a(arrayList, str, str2, z);
            } catch (IOException e2) {
                ge.a(0, fx.GSLB_ERR.a(), 1, null, com.xiaomi.push.ax.b(ct.a) ? 1 : 0);
                throw e2;
            }
        }
    }

    az(XMPushService xMPushService) {
        this.f1071a = xMPushService;
    }

    public static void a(XMPushService xMPushService) {
        az azVar = new az(xMPushService);
        bi.a().a(azVar);
        synchronized (ct.class) {
            ct.a(azVar);
            ct.a(xMPushService, null, new a(), "0", PullConfiguration.PROCESS_NAME_PUSH, "2.2");
        }
    }

    @Override // com.xiaomi.push.service.bi.a
    public void a(ee.a aVar) {
    }

    @Override // com.xiaomi.push.service.bi.a
    public void a(ef.b bVar) {
        cp b2;
        if (bVar.m289b() && bVar.m288a() && System.currentTimeMillis() - this.a > 3600000) {
            StringBuilder M = e.a.a.a.a.M("fetch bucket :");
            M.append(bVar.m288a());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            this.a = System.currentTimeMillis();
            ct a2 = ct.a();
            a2.m180a();
            a2.m183b();
            gp m690a = this.f1071a.m690a();
            if (m690a == null || (b2 = a2.b(m690a.m437a().c())) == null) {
                return;
            }
            ArrayList<String> m167a = b2.m167a();
            boolean z = true;
            Iterator<String> it2 = m167a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next().equals(m690a.mo438a())) {
                    z = false;
                    break;
                }
            }
            if (!z || m167a.isEmpty()) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("bucket changed, force reconnect");
            this.f1071a.a(0, (Exception) null);
            this.f1071a.a(false);
        }
    }

    @Override // com.xiaomi.push.ct.a
    public ct a(Context context, cs csVar, ct.b bVar, String str) {
        return new b(context, csVar, bVar, str);
    }
}
