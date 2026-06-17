package com.bytedance.crash.O;

import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.C0652g;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public class b {
    private static String a = "none";
    private static String b = "0";

    /* renamed from: c, reason: collision with root package name */
    private static String f4463c = "disable";

    /* renamed from: d, reason: collision with root package name */
    private static String f4464d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f4465e = null;

    /* renamed from: f, reason: collision with root package name */
    private static String f4466f = null;

    /* renamed from: g, reason: collision with root package name */
    private static String f4467g = null;
    private static boolean h = false;
    private static File i;
    private static File j;
    private static a k;

    public static void a() {
        File file = i;
        if (file != null) {
            com.bytedance.crash.util.a.b(file);
        }
    }

    public static String b() {
        return a;
    }

    public static String c() {
        try {
            Long valueOf = Long.valueOf(Long.parseLong(b.trim()));
            if (valueOf.longValue() < 1048576) {
                return valueOf.toString() + "KB";
            }
            return Long.valueOf(valueOf.longValue() / 1048576).toString() + "MB";
        } catch (Throwable unused) {
            return "0";
        }
    }

    private static String d(Map<String, String> map, String str) {
        String str2;
        return (map == null || (str2 = map.get(str)) == null || str2.isEmpty()) ? "none" : str2;
    }

    private static String e(String str) {
        try {
            long parseLong = Long.parseLong(str);
            return parseLong <= 50 ? "0~50ms" : parseLong <= 100 ? "50~100ms" : parseLong <= 150 ? "100~150ms" : parseLong <= 200 ? "150~200ms" : parseLong <= 300 ? "200~300ms" : parseLong <= 400 ? "300~400ms" : parseLong <= 500 ? "400~500ms" : parseLong <= 700 ? "500~700ms" : parseLong <= 1000 ? "700~1000ms" : parseLong <= 1500 ? "1000~1500ms" : parseLong <= 2000 ? "1500~2000ms" : parseLong <= WsConstants.EXIT_DELAY_TIME ? "2000~3000ms" : parseLong <= 4000 ? "3000~4000ms" : parseLong <= com.heytap.mcssdk.constant.a.r ? "4000~5000ms" : parseLong <= 7000 ? "5000~7000ms" : parseLong <= com.heytap.mcssdk.constant.a.q ? "7000~10000ms" : "> 10000ms";
        } catch (Throwable unused) {
            return "none";
        }
    }

    public static boolean f() {
        File[] listFiles;
        if (i == null || "0".equals(b) || (listFiles = i.listFiles()) == null) {
            return false;
        }
        for (File file : listFiles) {
            try {
                if (file.getName().startsWith("core-") && file.length() > 0 && Long.valueOf(Long.parseLong(b.trim())).longValue() == file.length()) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[Catch: Exception -> 0x0061, TryCatch #1 {Exception -> 0x0061, blocks: (B:3:0x0009, B:12:0x003b, B:14:0x0047, B:15:0x004a, B:25:0x0034, B:27:0x0031, B:7:0x000f, B:9:0x0015, B:20:0x001b, B:22:0x001f, B:24:0x0025), top: B:2:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(com.bytedance.crash.O.a r2) {
        /*
            com.bytedance.crash.O.b.k = r2
            java.lang.String r2 = "NPTH_CORE"
            java.lang.String r0 = "updateConfig init"
            com.bytedance.android.input.k.b.a.X(r2, r0)
            boolean r2 = com.bytedance.crash.O.b.h     // Catch: java.lang.Exception -> L61
            if (r2 == 0) goto Le
            goto L61
        Le:
            r2 = 1
            boolean r0 = com.bytedance.crash.N.h.g()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L1b
            java.lang.String r0 = "1#all#all#null#lib#SIG#0#0#7#"
            i(r0)     // Catch: java.lang.Throwable -> L30
            goto L2e
        L1b:
            com.bytedance.crash.O.a r0 = com.bytedance.crash.O.b.k     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L34
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L34
            com.bytedance.crash.O.a r0 = com.bytedance.crash.O.b.k     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r0.a()     // Catch: java.lang.Throwable -> L30
            i(r0)     // Catch: java.lang.Throwable -> L30
        L2e:
            r0 = r2
            goto L39
        L30:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Exception -> L61
        L34:
            java.lang.String r0 = "config init exception"
            com.bytedance.crash.O.b.f4463c = r0     // Catch: java.lang.Exception -> L61
            r0 = 0
        L39:
            if (r0 == 0) goto L61
            com.bytedance.crash.O.b.h = r2     // Catch: java.lang.Exception -> L61
            java.io.File r2 = com.bytedance.crash.N.f.a()     // Catch: java.lang.Exception -> L61
            boolean r0 = r2.exists()     // Catch: java.lang.Exception -> L61
            if (r0 != 0) goto L4a
            r2.mkdirs()     // Catch: java.lang.Exception -> L61
        L4a:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L61
            java.lang.String r1 = com.bytedance.crash.crash.c.b()     // Catch: java.lang.Exception -> L61
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L61
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Exception -> L61
            com.bytedance.crash.jni.NativeBridge.i(r2)     // Catch: java.lang.Exception -> L61
            java.lang.String r2 = "NPTH_COREDUMP"
            java.lang.String r0 = "Coredump Init ok"
            com.bytedance.android.input.k.b.a.X(r2, r0)     // Catch: java.lang.Exception -> L61
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.O.b.g(com.bytedance.crash.O.a):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(67:5|(2:7|(3:9|10|(70:12|13|14|(67:15|(3:16|17|(4:(2:20|(4:26|27|28|25)(1:22))(3:29|30|(1:1)(2:32|(1:34)(2:35|(2:(1:41)|42))))|23|24|25)(1:45))|47|48|(5:50|51|52|54|55)|57|58|59|60|61|62|63|(1:65)(2:374|(1:376)(2:377|(1:379)(2:380|(1:382)(2:383|(1:385)(2:386|(1:388)(2:389|(1:391)(2:392|(1:394)(2:395|(1:397)(2:398|(1:400)(2:401|(1:403)(2:404|(1:406))))))))))))|66|67|68|69|70|71|72|73|(1:75)(2:347|(1:349)(2:350|(1:352)(2:353|(1:355)(2:356|(1:358)(2:359|(1:361)(2:362|(1:364)(2:365|(1:367))))))))|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|(2:329|330)|97|98|99|100|101|102|103|104|105|106|(1:322)|112|113|114|(1:116)(1:320)|117|118|119|120|(2:126|(3:128|129|130)(5:133|(4:310|311|312|313)|136|137|(5:139|(1:141)|142|143|144)(4:147|(6:159|160|(16:196|197|198|199|200|201|202|203|204|205|206|207|208|209|(23:211|212|213|214|(2:280|281)|216|217|218|(1:220)(2:256|(1:258)(2:259|(1:261)(2:262|(1:264)(2:265|(1:267)(2:268|(1:270)(2:271|(1:273)(2:274|(1:276)(1:277))))))))|221|222|223|(2:250|251)|225|(2:246|247)|227|(2:242|243)|229|(2:238|239)|231|232|233|234)(1:286)|235)(4:162|163|164|165)|166|167|(3:169|170|171))(1:149)|(4:151|(1:153)|154|155)|158)))|316|137|(0)(0)|44)|46|47|48|(0)|57|58|59|60|61|62|63|(0)(0)|66|67|68|69|70|71|72|73|(0)(0)|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|(0)|97|98|99|100|101|102|103|104|105|106|(1:108)|322|112|113|114|(0)(0)|117|118|119|120|(3:123|126|(0)(0))|316|137|(0)(0))))|430|48|(0)|57|58|59|60|61|62|63|(0)(0)|66|67|68|69|70|71|72|73|(0)(0)|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|(0)|97|98|99|100|101|102|103|104|105|106|(0)|322|112|113|114|(0)(0)|117|118|119|120|(0)|316|137|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0461, code lost:
    
        if (r13 == null) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x02d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x02d7, code lost:
    
        com.bytedance.crash.O.b.f4463c = "check coredump upload error";
        r0.printStackTrace();
        com.bytedance.android.input.k.b.a.O0("corefile upload failed:" + r0);
        com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0272, code lost:
    
        com.bytedance.crash.O.b.f4466f = "none";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x01c1, code lost:
    
        r9 = "none";
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0168, code lost:
    
        r9 = "none";
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02be A[Catch: all -> 0x02d6, TRY_ENTER, TryCatch #17 {all -> 0x02d6, blocks: (B:120:0x0276, B:123:0x027c, B:126:0x0283, B:130:0x02ba, B:133:0x02be, B:308:0x02c5, B:310:0x02c9, B:312:0x02cb, B:313:0x02ce), top: B:119:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0185  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(com.bytedance.crash.monitor.a r31, com.bytedance.crash.crash.CrashSummary r32, java.io.File r33, org.json.JSONObject r34) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.O.b.h(com.bytedance.crash.monitor.a, com.bytedance.crash.crash.CrashSummary, java.io.File, org.json.JSONObject):boolean");
    }

    private static void i(String str) {
        if (str == null) {
            return;
        }
        try {
            File file = new File(C0652g.f(), "core.config");
            j = file;
            if (file != null && !file.exists()) {
                j.createNewFile();
            }
            com.bytedance.android.input.k.b.a.X("NPTH_COREDUMP", "Core Init enable");
            com.bytedance.crash.util.a.x(j, str, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
