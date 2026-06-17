package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
final class g implements kotlin.x.e<String> {
    private final BufferedReader a;

    public static final class a implements Iterator<String>, kotlin.s.c.E.a {
        private String a;
        private boolean b;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == null && !this.b) {
                String readLine = g.this.a.readLine();
                this.a = readLine;
                if (readLine == null) {
                    this.b = true;
                }
            }
            return this.a != null;
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.a;
            this.a = null;
            l.c(str);
            return str;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(BufferedReader bufferedReader) {
        l.f(bufferedReader, "reader");
        this.a = bufferedReader;
    }

    @Override // kotlin.x.e
    public Iterator<String> iterator() {
        return new a();
    }
}
