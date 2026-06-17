package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import com.xiaomi.push.cr;
import com.xiaomi.push.ee;
import com.xiaomi.push.gd;
import com.xiaomi.push.ge;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class af {

    /* renamed from: a, reason: collision with other field name */
    private static final Pattern f1015a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");
    private static long a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static ThreadPoolExecutor f1014a = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            com.xiaomi.channel.commonutils.logger.c.m15a("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(cr.m174a(str, 5222), DownloadSettingValues.SYNC_INTERVAL_MS_FG);
            socket.setTcpNoDelay(true);
            com.xiaomi.channel.commonutils.logger.c.m15a("ConnectivityTest: connect to " + str + " in " + (System.currentTimeMillis() - currentTimeMillis));
            socket.close();
            return true;
        } catch (Throwable th) {
            StringBuilder U = e.a.a.a.a.U("ConnectivityTest: could not connect to:", str, " exception: ");
            U.append(th.getClass().getSimpleName());
            U.append(" description: ");
            U.append(th.getMessage());
            com.xiaomi.channel.commonutils.logger.c.d(U.toString());
            return false;
        }
    }

    public static void a() {
        ee.a m784a;
        long currentTimeMillis = System.currentTimeMillis();
        if ((f1014a.getActiveCount() <= 0 || currentTimeMillis - a >= 1800000) && gd.m406a().m411a() && (m784a = bi.a().m784a()) != null && m784a.e() > 0) {
            a = currentTimeMillis;
            a(m784a.m266a(), true);
        }
    }

    public static void a(final List<String> list, final boolean z) {
        f1014a.execute(new Runnable() { // from class: com.xiaomi.push.service.af.1
            @Override // java.lang.Runnable
            public void run() {
                boolean b = af.b("www.baidu.com:80");
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    b = b || af.b((String) it2.next());
                    if (b && !z) {
                        break;
                    }
                }
                ge.a(b ? 1 : 2);
            }
        });
    }

    private static String a(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append("\n");
                        sb.append(readLine);
                    } else {
                        String sb2 = sb.toString();
                        com.xiaomi.push.y.a(bufferedReader);
                        return sb2;
                    }
                }
            } catch (Exception unused) {
                com.xiaomi.push.y.a(bufferedReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                com.xiaomi.push.y.a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static void b() {
        String a2 = a("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(a2)) {
            StringBuilder M = e.a.a.a.a.M("dump tcp for uid = ");
            M.append(Process.myUid());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            com.xiaomi.channel.commonutils.logger.c.m15a(a2);
        }
        String a3 = a("/proc/self/net/tcp6");
        if (TextUtils.isEmpty(a3)) {
            return;
        }
        StringBuilder M2 = e.a.a.a.a.M("dump tcp6 for uid = ");
        M2.append(Process.myUid());
        com.xiaomi.channel.commonutils.logger.c.m15a(M2.toString());
        com.xiaomi.channel.commonutils.logger.c.m15a(a3);
    }
}
