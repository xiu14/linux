package ms.bd.c;

import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class t0 implements l0 {
    public static volatile t0 G;
    public static final HashMap H;
    public static final AtomicInteger I;

    /* renamed from: J, reason: collision with root package name */
    public static final HashMap f10449J;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10452e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f10453f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f10454g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final AtomicInteger o;
    public static final AtomicInteger p;
    public static final AtomicInteger q;
    public static final AtomicInteger r;
    public static final AtomicInteger s;
    public static final AtomicInteger t;
    public volatile Object a;
    public static final String u = (String) y2.a(16777217, 0, 0, "c2188c", new byte[]{100, 53, 80});
    public static final String v = (String) y2.a(16777217, 0, 0, "397dff", new byte[]{55, 46, 64});
    public static final String w = (String) y2.a(16777217, 0, 0, "ba315c", new byte[]{112, 110, 68});
    public static final String x = (String) y2.a(16777217, 0, 0, "33a395", new byte[]{49, 60, 22});
    public static final String y = (String) y2.a(16777217, 0, 0, "a44eac", new byte[]{118, 36, 66});
    public static final String z = (String) y2.a(16777217, 0, 0, "4e0a75", new byte[]{54, 100, 70});
    public static final String A = (String) y2.a(16777217, 0, 0, "9e8b8b", new byte[]{59, 110, 79});
    public static final String B = (String) y2.a(16777217, 0, 0, "36a154", new byte[]{38, 36, 22});
    public static final String C = (String) y2.a(16777217, 0, 0, "fe42bb", new byte[]{115, 116, 68});
    public static final String D = (String) y2.a(16777217, 0, 0, "81cd55", new byte[]{42, 59, 27});
    public static final String E = (String) y2.a(16777217, 0, 0, "e02fd8", new byte[]{100, 51, 83, 31});
    public static final String F = (String) y2.a(16777217, 0, 0, "efa40b", new byte[]{121, 124, 0});
    public static final int b = 257;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10450c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f10451d = new AtomicBoolean(false);

    static {
        new AtomicBoolean(true);
        f10452e = 2;
        f10453f = 255;
        f10454g = 5;
        h = 5;
        i = 5;
        j = 5;
        k = 3;
        l = 20;
        m = 50;
        n = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
        o = new AtomicInteger(0);
        p = new AtomicInteger(0);
        q = new AtomicInteger(0);
        r = new AtomicInteger(0);
        s = new AtomicInteger(0);
        t = new AtomicInteger(0);
        H = new HashMap();
        I = new AtomicInteger(q0.b.a);
        f10449J = new HashMap();
    }

    public t0() {
        m0.a().b = this;
    }

    public static t0 a() {
        if (G == null) {
            synchronized (t0.class) {
                if (G == null) {
                    G = new t0();
                }
            }
        }
        return G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0283, code lost:
    
        if (r4 != ms.bd.c.q0.o.a) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x026a, code lost:
    
        if (r4 != ms.bd.c.q0.r.a) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0377, code lost:
    
        if (((java.lang.Integer) ms.bd.c.y2.a(134217729, r7, r6, r0.h, r0.j)).intValue() == 0) goto L226;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x013c A[Catch: Exception -> 0x01fb, TryCatch #1 {Exception -> 0x01fb, blocks: (B:190:0x0064, B:191:0x0069, B:193:0x0083, B:198:0x0134, B:200:0x013c, B:203:0x0146, B:255:0x009a, B:257:0x00a0, B:260:0x00e9, B:262:0x00f9, B:265:0x0100, B:268:0x010d, B:270:0x0113, B:272:0x011b, B:275:0x0123, B:279:0x00ab, B:281:0x00b1, B:284:0x00bc, B:286:0x00c2, B:290:0x00cf, B:293:0x00d8, B:295:0x00de), top: B:188:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r26, int r27) {
        /*
            Method dump skipped, instructions count: 1156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.t0.b(java.lang.String, int):void");
    }
}
