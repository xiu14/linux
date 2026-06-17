package e.b.o.a.c;

import java.io.File;

/* loaded from: classes2.dex */
public abstract class a {
    private String b;
    protected b a = null;

    /* renamed from: c, reason: collision with root package name */
    private File f9738c = null;

    public a(String str) {
        this.b = null;
        this.b = str;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("BaseStatFile{mPath='");
        e.a.a.a.a.G0(M, this.b, '\'', ", mFile=");
        M.append(this.f9738c);
        M.append(", mLastInfo=");
        M.append(this.a);
        M.append('}');
        return M.toString();
    }
}
