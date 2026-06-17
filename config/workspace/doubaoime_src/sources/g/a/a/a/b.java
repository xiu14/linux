package g.a.a.a;

/* loaded from: classes2.dex */
public class b extends RuntimeException {
    protected Throwable a;

    public b() {
        this.a = null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(java.lang.String r2, java.lang.Throwable r3) {
        /*
            r1 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " (Caused by "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            r2 = 0
            r1.a = r2
            r1.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.a.b.<init>(java.lang.String, java.lang.Throwable):void");
    }
}
