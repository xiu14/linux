package com.ss.ugc.effectplatform.task.h;

import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.FetchModelType;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.util.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.collections.g;
import kotlin.o;
import kotlin.s.c.A;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class d extends com.ss.ugc.effectplatform.task.b {

    /* renamed from: d, reason: collision with root package name */
    private d.a.b.b<Long> f8524d;

    /* renamed from: e, reason: collision with root package name */
    private d.a.b.b<Long> f8525e;

    /* renamed from: f, reason: collision with root package name */
    private d.a.b.b<Integer> f8526f;

    /* renamed from: g, reason: collision with root package name */
    private d.a.b.b<Integer> f8527g;
    private final d.a.b.d.b h;
    private final d.a.b.d.b i;
    private final d.a.a.a<a> j;
    private final EffectConfig k;
    private final com.ss.ugc.effectplatform.task.e l;
    private final com.ss.ugc.effectplatform.algorithm.e m;
    private final com.ss.ugc.effectplatform.e.a n;
    private final String[] o;
    private final int p;
    private final String q;
    private final com.ss.ugc.effectplatform.a r;
    private final com.ss.ugc.effectplatform.task.h.c s;
    private final d.a.b.c.b t;
    private final Effect u;

    public static final class a {
        public a(ModelInfo modelInfo, com.ss.ugc.effectplatform.download.a aVar) {
            l.g(modelInfo, "modelInfo");
            l.g(aVar, DBDefinition.DOWNLOAD_TABLE_NAME);
        }
    }

    static final class b extends m implements kotlin.s.b.a<o> {
        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public o invoke() {
            d.a.c.b bVar = d.a.c.b.b;
            StringBuilder M = e.a.a.a.a.M("[模型][释放锁][无需下载][");
            M.append(d.this.q);
            M.append(']');
            bVar.a("JKL", M.toString());
            return o.a;
        }
    }

    public static final class c implements Runnable {
        final /* synthetic */ ModelInfo b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Effect f8528c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f8529d;

        c(ModelInfo modelInfo, Effect effect, long j) {
            this.b = modelInfo;
            this.f8528c = effect;
            this.f8529d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            ModelInfo modelInfo = this.b;
            l.b(modelInfo, "modelInfo");
            dVar.j(modelInfo, this.f8528c, this.f8529d);
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.h.d$d, reason: collision with other inner class name */
    static final class C0395d extends m implements kotlin.s.b.a<o> {
        C0395d() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public o invoke() {
            d.a.c.b bVar = d.a.c.b.b;
            StringBuilder M = e.a.a.a.a.M("[模型][释放锁][下载完成][");
            M.append(d.this.q);
            M.append(']');
            bVar.e("JKL", M.toString());
            return o.a;
        }
    }

    static final class e extends m implements kotlin.s.b.a<o> {
        e() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public o invoke() {
            d.a.c.b bVar = d.a.c.b.b;
            StringBuilder M = e.a.a.a.a.M("[模型][释放锁][下载报错][");
            M.append(d.this.q);
            M.append(']');
            bVar.b("JKL", M.toString(), null);
            return o.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EffectConfig effectConfig, com.ss.ugc.effectplatform.task.e eVar, com.ss.ugc.effectplatform.algorithm.e eVar2, com.ss.ugc.effectplatform.e.a aVar, String[] strArr, int i, String str, com.ss.ugc.effectplatform.a aVar2, com.ss.ugc.effectplatform.task.h.c cVar, d.a.b.c.b bVar, Effect effect, int i2) {
        super(null, effectConfig.e());
        strArr = (i2 & 16) != 0 ? null : strArr;
        i = (i2 & 32) != 0 ? 0 : i;
        int i3 = i2 & 64;
        aVar2 = (i2 & 128) != 0 ? null : aVar2;
        int i4 = i2 & 256;
        int i5 = i2 & 512;
        int i6 = i2 & 1024;
        l.g(effectConfig, "config");
        l.g(eVar2, "buildInAssetsManager");
        l.g(aVar, "algorithmModelCache");
        this.k = effectConfig;
        this.l = eVar;
        this.m = eVar2;
        this.n = aVar;
        this.o = strArr;
        this.p = i;
        this.q = null;
        this.r = aVar2;
        this.s = null;
        this.t = null;
        this.u = null;
        this.f8524d = new d.a.b.b<>(0L);
        this.f8525e = new d.a.b.b<>(0L);
        this.f8526f = new d.a.b.b<>(0);
        this.f8527g = new d.a.b.b<>(0);
        this.h = new d.a.b.d.b(0);
        this.i = new d.a.b.d.b(0);
        this.j = new d.a.a.a<>(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0233 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList<com.ss.ugc.effectplatform.model.algorithm.ModelInfo> f(int r27, java.lang.String[] r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.h.d.f(int, java.lang.String[], boolean):java.util.ArrayList");
    }

    private final long g(ModelInfo modelInfo, FetchModelType fetchModelType) {
        com.ss.ugc.effectplatform.bridge.network.d a2 = this.k.i().a();
        if (a2 == null) {
            return -4L;
        }
        com.ss.ugc.effectplatform.download.a aVar = new com.ss.ugc.effectplatform.download.a(this.n, a2);
        com.ss.ugc.effectplatform.a aVar2 = this.r;
        if (aVar2 == null || !aVar2.b(this.u)) {
            return aVar.d(modelInfo, fetchModelType);
        }
        this.j.add(new a(modelInfo, aVar));
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder M = e.a.a.a.a.M("[请求下载][模型][");
        M.append(this.q);
        M.append("][");
        M.append(r.Q(modelInfo));
        M.append("][");
        M.append(modelInfo.getName());
        M.append(']');
        bVar.a("JKL", M.toString());
        return aVar.e(modelInfo, fetchModelType, this.q + '-' + modelInfo.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0184, code lost:
    
        if (r3 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c1, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c3, code lost:
    
        r2.append(r3);
        r2.append(r15.getName());
        r1.a(r0, r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01be, code lost:
    
        if (r3 == null) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01df  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(com.ss.ugc.effectplatform.model.Effect r21, java.util.ArrayList<com.ss.ugc.effectplatform.model.algorithm.ModelInfo> r22) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.h.d.h(com.ss.ugc.effectplatform.model.Effect, java.util.ArrayList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i(com.ss.ugc.effectplatform.model.Effect r18, java.util.ArrayList<com.ss.ugc.effectplatform.model.algorithm.ModelInfo> r19) {
        /*
            r17 = this;
            r6 = r17
            long r7 = java.lang.System.currentTimeMillis()
            com.ss.ugc.effectplatform.EffectConfig r0 = r6.k
            java.lang.Object r0 = r0.b()
            if (r0 == 0) goto L34
            boolean r1 = r0 instanceof android.content.Context
            if (r1 == 0) goto L34
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L2c
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L34
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = "networkInfo"
            kotlin.s.c.l.b(r0, r1)     // Catch: java.lang.Exception -> L34
            boolean r0 = r0.isConnected()     // Catch: java.lang.Exception -> L34
            goto L35
        L2c:
            kotlin.l r0 = new kotlin.l     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L34
            throw r0     // Catch: java.lang.Exception -> L34
        L34:
            r0 = 0
        L35:
            r9 = 1
            if (r0 != 0) goto L68
            boolean r0 = r19.isEmpty()
            r0 = r0 ^ r9
            if (r0 != 0) goto L40
            goto L68
        L40:
            d.a.c.b r0 = d.a.c.b.b
            java.lang.String r1 = "download "
            java.lang.StringBuilder r1 = e.a.a.a.a.M(r1)
            java.util.List r2 = kotlin.collections.g.e0(r19)
            r1.append(r2)
            java.lang.String r2 = " failed!, network unavailable!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r3 = "effect_platform"
            r0.b(r3, r1, r2)
            com.ss.ugc.effectplatform.f.c r0 = new com.ss.ugc.effectplatform.f.c
            r1 = 10011(0x271b, float:1.4028E-41)
            java.lang.String r2 = "network unavailable"
            r0.<init>(r1, r2)
            throw r0
        L68:
            int r0 = r19.size()
            if (r0 != 0) goto L7b
            com.ss.ugc.effectplatform.task.h.c r0 = r6.s
            if (r0 == 0) goto L7a
            com.ss.ugc.effectplatform.task.h.d$b r1 = new com.ss.ugc.effectplatform.task.h.d$b
            r1.<init>()
            r0.a(r1)
        L7a:
            return
        L7b:
            d.a.b.d.b r0 = r6.i
            int r1 = r19.size()
            r0.e(r1)
            d.a.b.c.b r0 = r6.t
            if (r0 == 0) goto L8a
            r10 = r0
            goto La4
        L8a:
            r12 = 5
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r16 = new java.util.concurrent.LinkedBlockingQueue
            r16.<init>()
            r13 = 15000(0x3a98, double:7.411E-320)
            r10 = r0
            r11 = r12
            r10.<init>(r11, r12, r13, r15, r16)
            r0.allowCoreThreadTimeOut(r9)
            com.ss.ugc.effectplatform.c r1 = new com.ss.ugc.effectplatform.c
            r1.<init>(r0)
            r10 = r1
        La4:
            java.util.Iterator r11 = r19.iterator()
        La8:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Ldb
            java.lang.Object r0 = r11.next()
            r2 = r0
            com.ss.ugc.effectplatform.model.algorithm.ModelInfo r2 = (com.ss.ugc.effectplatform.model.algorithm.ModelInfo) r2
            com.ss.ugc.effectplatform.a r0 = r6.r
            if (r0 == 0) goto Lca
            boolean r0 = r0.a()
            if (r0 != r9) goto Lca
            java.lang.String r0 = "modelInfo"
            kotlin.s.c.l.b(r2, r0)
            r12 = r18
            r6.j(r2, r12, r7)
            goto La8
        Lca:
            r12 = r18
            com.ss.ugc.effectplatform.task.h.d$c r13 = new com.ss.ugc.effectplatform.task.h.d$c
            r0 = r13
            r1 = r17
            r3 = r18
            r4 = r7
            r0.<init>(r2, r3, r4)
            r10.execute(r13)
            goto La8
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.h.d.i(com.ss.ugc.effectplatform.model.Effect, java.util.ArrayList):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.ss.ugc.effectplatform.model.algorithm.ModelInfo r23, com.ss.ugc.effectplatform.model.Effect r24, long r25) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.h.d.j(com.ss.ugc.effectplatform.model.algorithm.ModelInfo, com.ss.ugc.effectplatform.model.Effect, long):void");
    }

    private final void k(String[] strArr) {
        boolean z = true;
        try {
            ArrayList<ModelInfo> f2 = f(this.p, strArr, true);
            if (!f2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<ModelInfo> it2 = f2.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next().getName() + ", ");
                }
                this.f8527g.b(Integer.valueOf(f2.size()));
                d.a.c.b bVar = d.a.c.b.b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[模型][下载][Effect_ID:");
                Effect effect = this.u;
                sb2.append(effect != null ? effect.getEffect_id() : null);
                sb2.append("][");
                sb2.append(this.q);
                sb2.append("][");
                sb2.append((Object) sb);
                sb2.append("][数量:");
                sb2.append(f2.size());
                sb2.append(']');
                bVar.e("JKL", sb2.toString());
            } else {
                d.a.c.b bVar2 = d.a.c.b.b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("[模型][下载][Effect_ID:");
                Effect effect2 = this.u;
                sb3.append(effect2 != null ? effect2.getEffect_id() : null);
                sb3.append("][");
                sb3.append(this.q);
                sb3.append("][均下载完毕]");
                bVar2.e("JKL", sb3.toString());
            }
            com.ss.ugc.effectplatform.a aVar = this.r;
            if (aVar != null && aVar.b(this.u)) {
                i(this.u, f2);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            h(this.u, f2);
            this.f8524d.b(Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e2) {
            d.a.c.b bVar3 = d.a.c.b.b;
            StringBuilder M = e.a.a.a.a.M("[Model][Error]");
            M.append(g.f0(strArr));
            M.append(" exception happens!");
            bVar3.b("JKL", M.toString(), e2);
            com.ss.ugc.effectplatform.task.h.c cVar = this.s;
            if (cVar != null) {
                cVar.a(new e());
            }
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!l(strArr[i])) {
                    z = false;
                    break;
                }
                i++;
            }
            if (!z) {
                throw e2;
            }
        }
    }

    private final boolean l(String str) {
        boolean c2 = this.m.c(str);
        if (c2) {
            d.a.c.b.b.a("effect_platform", "model: " + str + " is built in resource");
        }
        return c2;
    }

    private final void m(Effect effect, ModelInfo modelInfo, Exception exc) {
        List<String> url_list;
        com.ss.ugc.effectplatform.model.b bVar = new com.ss.ugc.effectplatform.model.b(exc);
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        String str = null;
        boolean z = true;
        if (file_url != null && (url_list = file_url.getUrl_list()) != null) {
            if (!(!url_list.isEmpty())) {
                url_list = null;
            }
            if (url_list != null) {
                str = url_list.get(0);
            }
        }
        com.ss.ugc.effectplatform.i.a a2 = this.k.s().a();
        if (a2 != null) {
            EffectConfig effectConfig = this.k;
            String name = modelInfo.getName();
            String version = modelInfo.getVersion();
            String str2 = this.k.r().toString();
            kotlin.g[] gVarArr = new kotlin.g[2];
            gVarArr[0] = new kotlin.g("error_code", Integer.valueOf(bVar.a()));
            if (str == null) {
                str = "";
            }
            gVarArr[1] = new kotlin.g("download_url", str);
            Map J2 = g.J(gVarArr);
            String message = exc.getMessage();
            if (message != null && !kotlin.text.a.s(message)) {
                z = false;
            }
            r.a0(a2, false, effectConfig, effect, name, version, str2, J2, z ? ((kotlin.s.c.e) A.b(exc.getClass())).d() : exc.getMessage());
        }
        Objects.requireNonNull(this.k);
    }

    private final void n(Effect effect, ModelInfo modelInfo, d.a.e.c cVar, long j, long j2) {
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder M = e.a.a.a.a.M("model::");
        M.append(modelInfo.getName());
        M.append(",version = ");
        M.append(modelInfo.getVersion());
        M.append(",size = ");
        M.append(String.valueOf(modelInfo.getType()));
        M.append(" download success!");
        bVar.a("effect_platform", M.toString());
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) - j;
        com.ss.ugc.effectplatform.i.a a2 = this.k.s().a();
        if (a2 != null) {
            r.a0(a2, true, this.k, effect, modelInfo.getName(), modelInfo.getVersion(), this.k.r().toString(), g.J(new kotlin.g(MonitorConstants.SIZE, Long.valueOf(j2)), new kotlin.g("duration", Long.valueOf(millis))), "");
        }
        modelInfo.setTotalSize(j2 / 1024);
        Objects.requireNonNull(this.k);
        com.ss.ugc.effectplatform.algorithm.b.d(modelInfo);
    }

    private final void o(ModelInfo modelInfo, Exception exc) {
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder M = e.a.a.a.a.M("model::");
        M.append(modelInfo.getName());
        M.append(",info.getVersion() = ");
        M.append(modelInfo.getVersion());
        M.append(", size = ");
        M.append(String.valueOf(modelInfo.getType()));
        M.append(" download failure");
        bVar.b("effect_platform", M.toString(), exc);
        com.ss.ugc.effectplatform.model.d l = this.n.l(modelInfo.getName());
        if (l == null) {
            throw exc;
        }
        i iVar = i.f8543c;
        String e2 = l.e();
        if (e2 == null) {
            l.k();
            throw null;
        }
        String version = modelInfo.getVersion();
        l.g(e2, "version1");
        l.g(version, "version2");
        boolean z = false;
        if (!com.ss.ugc.effectplatform.util.l.b(e2) && !com.ss.ugc.effectplatform.util.l.b(version)) {
            if (com.ss.ugc.effectplatform.util.l.a(e2, version)) {
                z = true;
            } else {
                try {
                    String substring = e2.substring(0, kotlin.text.a.q(e2, ".", 0, false, 6, null));
                    l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String substring2 = version.substring(0, kotlin.text.a.q(e2, ".", 0, false, 6, null));
                    l.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    z = com.ss.ugc.effectplatform.util.l.a(substring, substring2);
                } catch (Exception unused) {
                }
            }
        }
        if (!z) {
            throw exc;
        }
    }

    private final Effect p(Effect effect, ModelInfo modelInfo) {
        if (effect != null) {
            return effect;
        }
        Effect effect2 = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, 0L, -1, -1, 15, null);
        effect2.setName(modelInfo.getName());
        return effect2;
    }

    @Override // com.ss.ugc.effectplatform.task.b
    protected void b() {
        String sb;
        d.a.b.d.e eVar;
        com.ss.ugc.effectplatform.task.h.c cVar;
        Objects.requireNonNull(this.k);
        String[] strArr = this.o;
        com.ss.ugc.effectplatform.a aVar = this.r;
        if (aVar != null && aVar.b(this.u) && strArr == null && (cVar = this.s) != null) {
            cVar.a(new com.ss.ugc.effectplatform.task.h.e(this));
        }
        if (strArr != null) {
            d.a.c.b bVar = d.a.c.b.b;
            StringBuilder M = e.a.a.a.a.M("[模型][依赖][Effect_ID:");
            Effect effect = this.u;
            M.append(effect != null ? effect.getEffect_id() : null);
            M.append("][");
            M.append(this.q);
            M.append("][");
            l.g(strArr, "$this$toListString");
            int length = strArr.length - 1;
            if (length == -1) {
                sb = "[]";
            } else {
                StringBuilder M2 = e.a.a.a.a.M("[");
                int i = 0;
                while (true) {
                    M2.append(strArr[i]);
                    if (i == length) {
                        break;
                    }
                    M2.append(", ");
                    i++;
                }
                M2.append(']');
                sb = M2.toString();
                l.b(sb, "builder.append(']').toString()");
            }
            M.append(sb);
            M.append("][数量:");
            M.append(strArr.length);
            M.append(']');
            bVar.e("JKL", M.toString());
            this.f8526f.b(Integer.valueOf(strArr.length));
            com.ss.ugc.effectplatform.a aVar2 = this.r;
            if (aVar2 != null && aVar2.b(this.u)) {
                k(strArr);
                return;
            }
            eVar = f.a;
            eVar.a();
            try {
                k(strArr);
            } finally {
                eVar.b();
            }
        }
    }
}
