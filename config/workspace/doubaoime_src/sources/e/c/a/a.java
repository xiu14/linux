package e.c.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class a {
    private final File a;

    private a(File file) {
        this.a = file;
    }

    public static a a(File file) {
        return new a(file);
    }

    public File b() {
        return this.a;
    }

    public InputStream c() throws IOException {
        return new FileInputStream(this.a);
    }

    public long d() {
        return this.a.length();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        return this.a.equals(((a) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
