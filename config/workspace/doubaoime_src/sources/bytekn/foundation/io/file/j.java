package bytekn.foundation.io.file;

import java.io.Writer;

/* loaded from: classes.dex */
public class j implements h {
    private final Writer a;

    public j(Writer writer) {
        kotlin.s.c.l.g(writer, "writer");
        this.a = writer;
    }

    public final void a(CharSequence charSequence) {
        kotlin.s.c.l.g(charSequence, "csa");
        this.a.append(charSequence);
    }

    public final void b() {
        this.a.flush();
    }

    public final void c(String str) {
        kotlin.s.c.l.g(str, "str");
        this.a.write(str);
    }

    @Override // bytekn.foundation.io.file.h
    public void close() {
        this.a.close();
    }
}
