package bytekn.foundation.io.file;

import java.io.File;

/* loaded from: classes.dex */
public final class f {
    private final File a;
    private final String b;

    public f(String str) {
        this.b = str;
        this.a = str != null ? new File(str).getAbsoluteFile() : null;
    }

    public final f a(String str) {
        kotlin.s.c.l.g(str, "component");
        if (this.a == null) {
            return null;
        }
        File absoluteFile = new File(this.a.getAbsolutePath(), str).getAbsoluteFile();
        kotlin.s.c.l.b(absoluteFile, "File(file.absolutePath, component).absoluteFile");
        return new f(absoluteFile.getAbsolutePath());
    }

    public final String b() {
        return this.b;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("[component=");
        M.append(this.b);
        M.append(", canonicalPath=");
        File file = this.a;
        M.append(file != null ? file.getCanonicalPath() : null);
        M.append(", absolutePath=");
        File file2 = this.a;
        return e.a.a.a.a.G(M, file2 != null ? file2.getAbsolutePath() : null, ']');
    }
}
