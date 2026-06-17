package com.ss.ugc.effectplatform;

import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.push.AttributionReporter;
import com.ss.ugc.effectplatform.bridge.network.d;
import com.ss.ugc.effectplatform.model.algorithm.FetchModelType;
import com.ss.ugc.effectplatform.task.g;
import java.util.HashMap;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class EffectConfig {
    private String A;
    private boolean B;
    private boolean C;
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f8420c;

    /* renamed from: d, reason: collision with root package name */
    private String f8421d;

    /* renamed from: e, reason: collision with root package name */
    private String f8422e;

    /* renamed from: f, reason: collision with root package name */
    private String f8423f;

    /* renamed from: g, reason: collision with root package name */
    private String f8424g;
    private String h;
    private String i;
    private String j;
    private HashMap<String, String> k;
    private int l;
    private com.ss.ugc.effectplatform.d.b.b m;
    private final d.a.b.b<d> n;
    private d.a.b.b<com.ss.ugc.effectplatform.i.a> o;
    private d.a.b.c.b p;
    private int q;
    private final d.a.b.b<Object> r;
    private d.a.b.b<com.ss.ugc.effectplatform.e.d> s;
    private g t;
    private String u;
    private Object v;
    private FetchModelType w;
    private ModelFileEnv x;
    private String y;
    private final com.ss.ugc.effectplatform.h.a z;

    public enum ModelFileEnv {
        TEST,
        ONLINE
    }

    public static class a {
        private String a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private String f8425c;

        /* renamed from: d, reason: collision with root package name */
        private String f8426d;

        /* renamed from: e, reason: collision with root package name */
        private String f8427e;

        /* renamed from: f, reason: collision with root package name */
        private d f8428f;

        /* renamed from: g, reason: collision with root package name */
        private com.ss.ugc.effectplatform.d.b.b f8429g;
        private String h;
        private String i;
        private String j;
        private String k;
        private com.ss.ugc.effectplatform.i.a m;
        private String o;
        private Object q;
        private ModelFileEnv s;
        private boolean y;
        private int l = 1;
        private HashMap<String, String> n = new HashMap<>();
        private boolean p = true;
        private FetchModelType r = FetchModelType.ORIGIN;
        private long t = 838860800;
        private String u = "";
        private int v = 5;
        private String[] w = new String[0];
        private boolean x = true;

        public final String A() {
            return this.i;
        }

        public final String B() {
            return this.f8426d;
        }

        public final String C() {
            return this.a;
        }

        public final int D() {
            return this.v;
        }

        public final a E(String str) {
            l.g(str, "hosts");
            this.o = str;
            return this;
        }

        public final a F(boolean z) {
            this.y = z;
            return this;
        }

        public final a G(com.ss.ugc.effectplatform.d.b.b bVar) {
            l.g(bVar, "jsonConverter");
            this.f8429g = bVar;
            return this;
        }

        public final a H(ModelFileEnv modelFileEnv) {
            l.g(modelFileEnv, "modelFileEnv");
            this.s = modelFileEnv;
            return this;
        }

        public final a I(com.ss.ugc.effectplatform.i.a aVar) {
            l.g(aVar, "monitorReport");
            this.m = aVar;
            return this;
        }

        public final a J(String str) {
            l.g(str, WsConstants.KEY_PLATFORM);
            this.i = str;
            return this;
        }

        public final a K(String str) {
            l.g(str, "region");
            this.f8426d = str;
            return this;
        }

        public final a L(int i) {
            this.l = i;
            return this;
        }

        public final a M(String str) {
            l.g(str, com.heytap.mcssdk.constant.b.C);
            this.a = str;
            return this;
        }

        public final a a(Object obj) {
            this.q = obj;
            return this;
        }

        public final a b(String str) {
            this.f8427e = str;
            return this;
        }

        public final a c(String str) {
            l.g(str, AttributionReporter.APP_VERSION);
            this.b = str;
            return this;
        }

        public final EffectConfig d() {
            return new EffectConfig(this);
        }

        public final a e(String str) {
            l.g(str, "channel");
            this.h = str;
            return this;
        }

        public final a f(String str) {
            l.g(str, "deviceId");
            this.f8425c = str;
            return this;
        }

        public final a g(String str) {
            l.g(str, "deviceType");
            this.j = str;
            return this;
        }

        public final a h(String str) {
            this.k = str;
            return this;
        }

        public final a i(d dVar) {
            l.g(dVar, "effectINetworkClient");
            this.f8428f = dVar;
            return this;
        }

        public final Object j() {
            return this.q;
        }

        public final String k() {
            return this.f8427e;
        }

        public final String l() {
            return this.b;
        }

        public final String m() {
            return this.h;
        }

        public final String n() {
            return this.f8425c;
        }

        public final String o() {
            return this.j;
        }

        public final String p() {
            return this.k;
        }

        public final d q() {
            return this.f8428f;
        }

        public final String r() {
            return this.o;
        }

        public final boolean s() {
            return this.x;
        }

        public final boolean t() {
            return this.y;
        }

        public final HashMap<String, String> u() {
            return this.n;
        }

        public final com.ss.ugc.effectplatform.d.b.b v() {
            return this.f8429g;
        }

        public final String w() {
            return this.u;
        }

        public final ModelFileEnv x() {
            return this.s;
        }

        public final FetchModelType y() {
            return this.r;
        }

        public final com.ss.ugc.effectplatform.i.a z() {
            return this.m;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0117, code lost:
    
        if ((r3 == null || r3.length() == 0) == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected EffectConfig(com.ss.ugc.effectplatform.EffectConfig.a r11) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.EffectConfig.<init>(com.ss.ugc.effectplatform.EffectConfig$a):void");
    }

    public final String a() {
        return this.y;
    }

    public final Object b() {
        return this.v;
    }

    public final String c() {
        return this.j;
    }

    public final String d() {
        return this.b;
    }

    public final com.ss.ugc.effectplatform.h.a e() {
        return this.z;
    }

    public final String f() {
        return this.f8421d;
    }

    public final String g() {
        return this.f8420c;
    }

    public final String h() {
        return this.f8423f;
    }

    public final d.a.b.b<d> i() {
        return this.n;
    }

    public final String j() {
        return this.u;
    }

    public final boolean k() {
        return this.B;
    }

    public final boolean l() {
        return this.C;
    }

    public final HashMap<String, String> m() {
        return this.k;
    }

    public final com.ss.ugc.effectplatform.d.b.b n() {
        return this.m;
    }

    public final String o() {
        return this.A;
    }

    public final int p() {
        return this.l;
    }

    public final ModelFileEnv q() {
        return this.x;
    }

    public final FetchModelType r() {
        return this.w;
    }

    public final d.a.b.b<com.ss.ugc.effectplatform.i.a> s() {
        return this.o;
    }

    public final String t() {
        return this.f8422e;
    }

    public final String u() {
        return this.h;
    }

    public final String v() {
        return this.i;
    }

    public final String w() {
        return this.a;
    }

    public final g x() {
        return this.t;
    }
}
