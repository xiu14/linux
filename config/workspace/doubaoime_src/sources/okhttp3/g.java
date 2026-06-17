package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g {
    static final Comparator<String> b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, g> f10602c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f10603d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f10604e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f10605f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f10606g;
    public static final g h;
    public static final g i;
    public static final g j;
    public static final g k;
    public static final g l;
    public static final g m;
    public static final g n;
    public static final g o;
    public static final g p;
    public static final g q;
    public static final g r;
    public static final g s;
    public static final g t;
    public static final g u;
    final String a;

    static class a implements Comparator<String> {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            return 1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int compare(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = (java.lang.String) r8
                int r0 = r7.length()
                int r1 = r8.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L11:
                r2 = -1
                r3 = 1
                if (r1 >= r0) goto L27
                char r4 = r7.charAt(r1)
                char r5 = r8.charAt(r1)
                if (r4 == r5) goto L24
                if (r4 >= r5) goto L22
                goto L35
            L22:
                r2 = r3
                goto L35
            L24:
                int r1 = r1 + 1
                goto L11
            L27:
                int r7 = r7.length()
                int r8 = r8.length()
                if (r7 == r8) goto L34
                if (r7 >= r8) goto L22
                goto L35
            L34:
                r2 = 0
            L35:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.g.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f10602c = linkedHashMap;
        linkedHashMap.put("SSL_RSA_WITH_NULL_MD5", new g("SSL_RSA_WITH_NULL_MD5"));
        linkedHashMap.put("SSL_RSA_WITH_NULL_SHA", new g("SSL_RSA_WITH_NULL_SHA"));
        linkedHashMap.put("SSL_RSA_EXPORT_WITH_RC4_40_MD5", new g("SSL_RSA_EXPORT_WITH_RC4_40_MD5"));
        linkedHashMap.put("SSL_RSA_WITH_RC4_128_MD5", new g("SSL_RSA_WITH_RC4_128_MD5"));
        linkedHashMap.put("SSL_RSA_WITH_RC4_128_SHA", new g("SSL_RSA_WITH_RC4_128_SHA"));
        linkedHashMap.put("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", new g("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"));
        linkedHashMap.put("SSL_RSA_WITH_DES_CBC_SHA", new g("SSL_RSA_WITH_DES_CBC_SHA"));
        g gVar = new g("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        linkedHashMap.put("SSL_RSA_WITH_3DES_EDE_CBC_SHA", gVar);
        f10603d = gVar;
        linkedHashMap.put("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", new g("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"));
        linkedHashMap.put("SSL_DHE_DSS_WITH_DES_CBC_SHA", new g("SSL_DHE_DSS_WITH_DES_CBC_SHA"));
        linkedHashMap.put("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", new g("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", new g("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"));
        linkedHashMap.put("SSL_DHE_RSA_WITH_DES_CBC_SHA", new g("SSL_DHE_RSA_WITH_DES_CBC_SHA"));
        linkedHashMap.put("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", new g("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", new g("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"));
        linkedHashMap.put("SSL_DH_anon_WITH_RC4_128_MD5", new g("SSL_DH_anon_WITH_RC4_128_MD5"));
        linkedHashMap.put("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", new g("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"));
        linkedHashMap.put("SSL_DH_anon_WITH_DES_CBC_SHA", new g("SSL_DH_anon_WITH_DES_CBC_SHA"));
        linkedHashMap.put("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", new g("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_KRB5_WITH_DES_CBC_SHA", new g("TLS_KRB5_WITH_DES_CBC_SHA"));
        linkedHashMap.put("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", new g("TLS_KRB5_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_KRB5_WITH_RC4_128_SHA", new g("TLS_KRB5_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_KRB5_WITH_DES_CBC_MD5", new g("TLS_KRB5_WITH_DES_CBC_MD5"));
        linkedHashMap.put("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", new g("TLS_KRB5_WITH_3DES_EDE_CBC_MD5"));
        linkedHashMap.put("TLS_KRB5_WITH_RC4_128_MD5", new g("TLS_KRB5_WITH_RC4_128_MD5"));
        linkedHashMap.put("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", new g("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"));
        linkedHashMap.put("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", new g("TLS_KRB5_EXPORT_WITH_RC4_40_SHA"));
        linkedHashMap.put("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", new g("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"));
        linkedHashMap.put("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", new g("TLS_KRB5_EXPORT_WITH_RC4_40_MD5"));
        g gVar2 = new g("TLS_RSA_WITH_AES_128_CBC_SHA");
        linkedHashMap.put("TLS_RSA_WITH_AES_128_CBC_SHA", gVar2);
        f10604e = gVar2;
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", new g("TLS_DHE_DSS_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", new g("TLS_DHE_RSA_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_128_CBC_SHA", new g("TLS_DH_anon_WITH_AES_128_CBC_SHA"));
        g gVar3 = new g("TLS_RSA_WITH_AES_256_CBC_SHA");
        linkedHashMap.put("TLS_RSA_WITH_AES_256_CBC_SHA", gVar3);
        f10605f = gVar3;
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", new g("TLS_DHE_DSS_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", new g("TLS_DHE_RSA_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_256_CBC_SHA", new g("TLS_DH_anon_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_RSA_WITH_NULL_SHA256", new g("TLS_RSA_WITH_NULL_SHA256"));
        linkedHashMap.put("TLS_RSA_WITH_AES_128_CBC_SHA256", new g("TLS_RSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_RSA_WITH_AES_256_CBC_SHA256", new g("TLS_RSA_WITH_AES_256_CBC_SHA256"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", new g("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", new g("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", new g("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", new g("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", new g("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", new g("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", new g("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_128_CBC_SHA256", new g("TLS_DH_anon_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_256_CBC_SHA256", new g("TLS_DH_anon_WITH_AES_256_CBC_SHA256"));
        linkedHashMap.put("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", new g("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", new g("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", new g("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"));
        linkedHashMap.put("TLS_PSK_WITH_RC4_128_SHA", new g("TLS_PSK_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_PSK_WITH_3DES_EDE_CBC_SHA", new g("TLS_PSK_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_PSK_WITH_AES_128_CBC_SHA", new g("TLS_PSK_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_PSK_WITH_AES_256_CBC_SHA", new g("TLS_PSK_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_RSA_WITH_SEED_CBC_SHA", new g("TLS_RSA_WITH_SEED_CBC_SHA"));
        g gVar4 = new g("TLS_RSA_WITH_AES_128_GCM_SHA256");
        linkedHashMap.put("TLS_RSA_WITH_AES_128_GCM_SHA256", gVar4);
        f10606g = gVar4;
        g gVar5 = new g("TLS_RSA_WITH_AES_256_GCM_SHA384");
        linkedHashMap.put("TLS_RSA_WITH_AES_256_GCM_SHA384", gVar5);
        h = gVar5;
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", new g("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", new g("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", new g("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", new g("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_128_GCM_SHA256", new g("TLS_DH_anon_WITH_AES_128_GCM_SHA256"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_256_GCM_SHA384", new g("TLS_DH_anon_WITH_AES_256_GCM_SHA384"));
        linkedHashMap.put("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", new g("TLS_EMPTY_RENEGOTIATION_INFO_SCSV"));
        linkedHashMap.put("TLS_FALLBACK_SCSV", new g("TLS_FALLBACK_SCSV"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_NULL_SHA", new g("TLS_ECDH_ECDSA_WITH_NULL_SHA"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", new g("TLS_ECDH_ECDSA_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", new g("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", new g("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", new g("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_NULL_SHA", new g("TLS_ECDHE_ECDSA_WITH_NULL_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", new g("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", new g("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", new g("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", new g("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_NULL_SHA", new g("TLS_ECDH_RSA_WITH_NULL_SHA"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_RC4_128_SHA", new g("TLS_ECDH_RSA_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", new g("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", new g("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", new g("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_NULL_SHA", new g("TLS_ECDHE_RSA_WITH_NULL_SHA"));
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_RC4_128_SHA", new g("TLS_ECDHE_RSA_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", new g("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"));
        g gVar6 = new g("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", gVar6);
        i = gVar6;
        g gVar7 = new g("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", gVar7);
        j = gVar7;
        linkedHashMap.put("TLS_ECDH_anon_WITH_NULL_SHA", new g("TLS_ECDH_anon_WITH_NULL_SHA"));
        linkedHashMap.put("TLS_ECDH_anon_WITH_RC4_128_SHA", new g("TLS_ECDH_anon_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", new g("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", new g("TLS_ECDH_anon_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", new g("TLS_ECDH_anon_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", new g("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", new g("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", new g("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", new g("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"));
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", new g("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", new g("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", new g("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", new g("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"));
        g gVar8 = new g("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", gVar8);
        k = gVar8;
        g gVar9 = new g("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", gVar9);
        l = gVar9;
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", new g("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", new g("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"));
        g gVar10 = new g("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", gVar10);
        m = gVar10;
        g gVar11 = new g("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", gVar11);
        n = gVar11;
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", new g("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", new g("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"));
        linkedHashMap.put("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", new g("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", new g("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"));
        g gVar12 = new g("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", gVar12);
        o = gVar12;
        g gVar13 = new g("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", gVar13);
        p = gVar13;
        linkedHashMap.put("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", new g("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"));
        linkedHashMap.put("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", new g("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"));
        g gVar14 = new g("TLS_AES_128_GCM_SHA256");
        linkedHashMap.put("TLS_AES_128_GCM_SHA256", gVar14);
        q = gVar14;
        g gVar15 = new g("TLS_AES_256_GCM_SHA384");
        linkedHashMap.put("TLS_AES_256_GCM_SHA384", gVar15);
        r = gVar15;
        g gVar16 = new g("TLS_CHACHA20_POLY1305_SHA256");
        linkedHashMap.put("TLS_CHACHA20_POLY1305_SHA256", gVar16);
        s = gVar16;
        g gVar17 = new g("TLS_AES_128_CCM_SHA256");
        linkedHashMap.put("TLS_AES_128_CCM_SHA256", gVar17);
        t = gVar17;
        g gVar18 = new g("TLS_AES_256_CCM_8_SHA256");
        linkedHashMap.put("TLS_AES_256_CCM_8_SHA256", gVar18);
        u = gVar18;
    }

    private g(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }

    public static synchronized g a(String str) {
        g gVar;
        synchronized (g.class) {
            Map<String, g> map = f10602c;
            gVar = map.get(str);
            if (gVar == null) {
                gVar = map.get(b(str));
                if (gVar == null) {
                    gVar = new g(str);
                }
                map.put(str, gVar);
            }
        }
        return gVar;
    }

    private static String b(String str) {
        if (str.startsWith("TLS_")) {
            StringBuilder M = e.a.a.a.a.M("SSL_");
            M.append(str.substring(4));
            return M.toString();
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        StringBuilder M2 = e.a.a.a.a.M("TLS_");
        M2.append(str.substring(4));
        return M2.toString();
    }

    public String toString() {
        return this.a;
    }
}
