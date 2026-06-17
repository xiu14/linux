package e.b.g.a.a;

import android.content.Context;
import e.b.g.a.a.h.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements a.c {
    private volatile boolean a = true;
    private long b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f9503c = 120;

    /* renamed from: d, reason: collision with root package name */
    private int f9504d = 100;

    /* renamed from: e, reason: collision with root package name */
    private c f9505e;

    /* renamed from: f, reason: collision with root package name */
    private String f9506f;

    /* renamed from: g, reason: collision with root package name */
    private Context f9507g;
    private JSONObject h;

    public b(Context context, String str) {
        this.f9507g = context;
        this.f9505e = c.c(context);
        this.f9506f = str;
    }

    public void a() {
        e.b.g.a.a.h.a.d().c(this);
        String str = this.f9506f;
        e.b.g.a.a.g.d.e(str, new e.b.g.a.a.g.a(this.f9507g, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.a
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            long r2 = java.lang.System.currentTimeMillis()
            e.b.g.a.a.c r0 = r10.f9505e
            java.lang.String r4 = r10.f9506f
            int r0 = r0.d(r4)
            long r4 = (long) r0
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L1a
            return r1
        L1a:
            r0 = 0
            if (r11 != 0) goto L34
            int r11 = r10.f9504d
            long r6 = (long) r11
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto L34
            long r4 = r10.b
            long r4 = r2 - r4
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            int r11 = r10.f9503c
            long r6 = (long) r11
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L33
            goto L34
        L33:
            return r0
        L34:
            r10.b = r2
            int r11 = r10.f9504d
            java.lang.String r2 = r10.f9506f
            int r2 = java.lang.Integer.parseInt(r2)
            e.b.g.a.a.c r3 = r10.f9505e
            java.util.List r11 = r3.g(r2, r11)
            boolean r2 = com.bytedance.feedbackerlib.a.U(r11)
            if (r2 == 0) goto L4c
            goto Lc2
        L4c:
            r2 = -1
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lc1
            r4.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.util.LinkedList r5 = new java.util.LinkedList     // Catch: java.lang.Throwable -> Lc1
            r5.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Lc1
        L5c:
            boolean r6 = r11.hasNext()     // Catch: java.lang.Throwable -> Lc1
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r11.next()     // Catch: java.lang.Throwable -> Lc1
            e.b.g.a.a.f.a r6 = (e.b.g.a.a.f.a) r6     // Catch: java.lang.Throwable -> Lc1
            long r7 = r6.a     // Catch: java.lang.Throwable -> Lc1
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 <= 0) goto L6f
            r2 = r7
        L6f:
            java.lang.String r9 = r6.f9518e     // Catch: java.lang.Throwable -> Lc1
            r5.add(r6)     // Catch: java.lang.Throwable -> Lc1
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r9 = "log_id"
            r6.put(r9, r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = "d_s_t"
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5c
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L5c
            r4.put(r6)     // Catch: java.lang.Throwable -> L5c
            goto L5c
        L8b:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb5
            r11.<init>()     // Catch: java.lang.Throwable -> Lb5
            int r5 = r4.length()     // Catch: java.lang.Throwable -> Lb5
            if (r5 != 0) goto L98
            r5 = r1
            goto L99
        L98:
            r5 = r0
        L99:
            if (r5 == 0) goto L9c
            goto Lb5
        L9c:
            java.lang.String r5 = "data"
            r11.put(r5, r4)     // Catch: java.lang.Throwable -> Lb5
            org.json.JSONObject r4 = r10.h     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto Lb6
            java.lang.String r1 = "header"
            r11.put(r1, r4)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = r10.f9506f     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lb5
            boolean r1 = e.b.g.a.a.g.d.c(r1, r11)     // Catch: java.lang.Throwable -> Lb5
            goto Lb6
        Lb5:
            r1 = r0
        Lb6:
            if (r1 == 0) goto Lc2
            e.b.g.a.a.c r11 = r10.f9505e     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r0 = r10.f9506f     // Catch: java.lang.Throwable -> Lc0
            r11.b(r0, r2)     // Catch: java.lang.Throwable -> Lc0
            goto Lc2
        Lc0:
            r0 = r1
        Lc1:
            r1 = r0
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g.a.a.b.b(boolean):boolean");
    }

    public void c(boolean z) {
        this.a = z;
    }

    public void d() {
        int e2 = e.b.g.a.a.e.c.e(this.f9506f);
        if (e2 > 0) {
            this.f9503c = e2;
        }
        int b = e.b.g.a.a.e.c.b(this.f9506f);
        if (b > 0) {
            this.f9504d = b;
        }
        this.h = e.b.g.a.a.e.c.f(this.f9506f);
        e.b.g.a.a.g.b b2 = e.b.g.a.a.g.d.b(this.f9506f);
        if (b2 instanceof e.b.g.a.a.g.a) {
            ((e.b.g.a.a.g.a) b2).c(null);
        }
    }

    @Override // e.b.g.a.a.h.a.c
    public void onTimeEvent(long j) {
        b(false);
    }
}
