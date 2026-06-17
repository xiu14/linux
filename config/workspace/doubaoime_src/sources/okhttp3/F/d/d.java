package okhttp3.F.d;

import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.Date;
import okhttp3.B;
import okhttp3.Request;
import okhttp3.s;

/* loaded from: classes2.dex */
public final class d {
    public final Request a;
    public final B b;

    public static class a {
        final long a;
        final Request b;

        /* renamed from: c, reason: collision with root package name */
        final B f10505c;

        /* renamed from: d, reason: collision with root package name */
        private Date f10506d;

        /* renamed from: e, reason: collision with root package name */
        private String f10507e;

        /* renamed from: f, reason: collision with root package name */
        private Date f10508f;

        /* renamed from: g, reason: collision with root package name */
        private String f10509g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l;

        public a(long j, Request request, B b) {
            this.l = -1;
            this.a = j;
            this.b = request;
            this.f10505c = b;
            if (b != null) {
                this.i = b.P();
                this.j = b.M();
                s w = b.w();
                int i = w.i();
                for (int i2 = 0; i2 < i; i2++) {
                    String e2 = w.e(i2);
                    String k = w.k(i2);
                    if ("Date".equalsIgnoreCase(e2)) {
                        this.f10506d = okhttp3.F.f.d.b(k);
                        this.f10507e = k;
                    } else if ("Expires".equalsIgnoreCase(e2)) {
                        this.h = okhttp3.F.f.d.b(k);
                    } else if (DownloadHelper.LAST_MODIFIED_CASE.equalsIgnoreCase(e2)) {
                        this.f10508f = okhttp3.F.f.d.b(k);
                        this.f10509g = k;
                    } else if ("ETag".equalsIgnoreCase(e2)) {
                        this.k = k;
                    } else if ("Age".equalsIgnoreCase(e2)) {
                        this.l = okhttp3.F.f.e.c(k, -1);
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x00c8, code lost:
        
            if (r2 > 0) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x01d5  */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v20, types: [okhttp3.B, okhttp3.Request] */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public okhttp3.F.d.d a() {
            /*
                Method dump skipped, instructions count: 487
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.F.d.d.a.a():okhttp3.F.d.d");
        }
    }

    d(Request request, B b) {
        this.a = request;
        this.b = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.d().a() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(okhttp3.B r3, okhttp3.Request r4) {
        /*
            int r0 = r3.l()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.p(r0)
            if (r0 != 0) goto L5a
            okhttp3.c r0 = r3.d()
            int r0 = r0.c()
            r1 = -1
            if (r0 != r1) goto L5a
            okhttp3.c r0 = r3.d()
            boolean r0 = r0.b()
            if (r0 != 0) goto L5a
            okhttp3.c r0 = r3.d()
            boolean r0 = r0.a()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            okhttp3.c r3 = r3.d()
            boolean r3 = r3.h()
            if (r3 != 0) goto L6f
            okhttp3.c r3 = r4.cacheControl()
            boolean r3 = r3.h()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.F.d.d.a(okhttp3.B, okhttp3.Request):boolean");
    }
}
