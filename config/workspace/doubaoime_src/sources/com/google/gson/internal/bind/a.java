package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a extends com.google.gson.stream.a {
    private static final Object t;
    private Object[] p;
    private int q;
    private String[] r;
    private int[] s;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    class C0336a extends Reader {
        C0336a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    static {
        new C0336a();
        t = new Object();
    }

    private String G() {
        StringBuilder M = e.a.a.a.a.M(" at path ");
        M.append(s());
        return M.toString();
    }

    private void r0(JsonToken jsonToken) throws IOException {
        if (c0() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + c0() + G());
    }

    private String t0(boolean z) throws IOException {
        r0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) u0()).next();
        String str = (String) entry.getKey();
        this.r[this.q - 1] = z ? "<skipped>" : str;
        x0(entry.getValue());
        return str;
    }

    private Object u0() {
        return this.p[this.q - 1];
    }

    private Object v0() {
        Object[] objArr = this.p;
        int i = this.q - 1;
        this.q = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private String w(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.q;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.p;
            if (objArr[i] instanceof f) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.s[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((objArr[i] instanceof l) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String[] strArr = this.r;
                if (strArr[i] != null) {
                    sb.append(strArr[i]);
                }
            }
            i++;
        }
    }

    private void x0(Object obj) {
        int i = this.q;
        Object[] objArr = this.p;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.p = Arrays.copyOf(objArr, i2);
            this.s = Arrays.copyOf(this.s, i2);
            this.r = (String[]) Arrays.copyOf(this.r, i2);
        }
        Object[] objArr2 = this.p;
        int i3 = this.q;
        this.q = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.a
    public boolean H() throws IOException {
        r0(JsonToken.BOOLEAN);
        boolean d2 = ((o) v0()).d();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return d2;
    }

    @Override // com.google.gson.stream.a
    public double I() throws IOException {
        JsonToken c0 = c0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (c0 != jsonToken && c0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + c0 + G());
        }
        double e2 = ((o) u0()).e();
        if (!A() && (Double.isNaN(e2) || Double.isInfinite(e2))) {
            throw new com.google.gson.stream.c("JSON forbids NaN and infinities: " + e2);
        }
        v0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return e2;
    }

    @Override // com.google.gson.stream.a
    public int M() throws IOException {
        JsonToken c0 = c0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (c0 != jsonToken && c0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + c0 + G());
        }
        int f2 = ((o) u0()).f();
        v0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return f2;
    }

    @Override // com.google.gson.stream.a
    public long N() throws IOException {
        JsonToken c0 = c0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (c0 != jsonToken && c0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + c0 + G());
        }
        long g2 = ((o) u0()).g();
        v0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return g2;
    }

    @Override // com.google.gson.stream.a
    public String P() throws IOException {
        return t0(false);
    }

    @Override // com.google.gson.stream.a
    public void S() throws IOException {
        r0(JsonToken.NULL);
        v0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public String Y() throws IOException {
        JsonToken c0 = c0();
        JsonToken jsonToken = JsonToken.STRING;
        if (c0 == jsonToken || c0 == JsonToken.NUMBER) {
            String c2 = ((o) v0()).c();
            int i = this.q;
            if (i > 0) {
                int[] iArr = this.s;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return c2;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + c0 + G());
    }

    @Override // com.google.gson.stream.a
    public void a() throws IOException {
        r0(JsonToken.BEGIN_ARRAY);
        x0(((f) u0()).iterator());
        this.s[this.q - 1] = 0;
    }

    @Override // com.google.gson.stream.a
    public JsonToken c0() throws IOException {
        if (this.q == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object u0 = u0();
        if (u0 instanceof Iterator) {
            boolean z = this.p[this.q - 2] instanceof l;
            Iterator it2 = (Iterator) u0;
            if (!it2.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            x0(it2.next());
            return c0();
        }
        if (u0 instanceof l) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (u0 instanceof f) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (u0 instanceof o) {
            o oVar = (o) u0;
            if (oVar.l()) {
                return JsonToken.STRING;
            }
            if (oVar.i()) {
                return JsonToken.BOOLEAN;
            }
            if (oVar.k()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (u0 instanceof k) {
            return JsonToken.NULL;
        }
        if (u0 == t) {
            throw new IllegalStateException("JsonReader is closed");
        }
        StringBuilder M = e.a.a.a.a.M("Custom JsonElement subclass ");
        M.append(u0.getClass().getName());
        M.append(" is not supported");
        throw new com.google.gson.stream.c(M.toString());
    }

    @Override // com.google.gson.stream.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.p = new Object[]{t};
        this.q = 1;
    }

    @Override // com.google.gson.stream.a
    public void d() throws IOException {
        r0(JsonToken.BEGIN_OBJECT);
        x0(((l) u0()).h().iterator());
    }

    @Override // com.google.gson.stream.a
    public void o() throws IOException {
        r0(JsonToken.END_ARRAY);
        v0();
        v0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public void p() throws IOException {
        r0(JsonToken.END_OBJECT);
        this.r[this.q - 1] = null;
        v0();
        v0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public void p0() throws IOException {
        int ordinal = c0().ordinal();
        if (ordinal == 1) {
            o();
            return;
        }
        if (ordinal != 9) {
            if (ordinal == 3) {
                p();
                return;
            }
            if (ordinal == 4) {
                t0(true);
                return;
            }
            v0();
            int i = this.q;
            if (i > 0) {
                int[] iArr = this.s;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.a
    public String s() {
        return w(false);
    }

    i s0() throws IOException {
        JsonToken c0 = c0();
        if (c0 != JsonToken.NAME && c0 != JsonToken.END_ARRAY && c0 != JsonToken.END_OBJECT && c0 != JsonToken.END_DOCUMENT) {
            i iVar = (i) u0();
            p0();
            return iVar;
        }
        throw new IllegalStateException("Unexpected " + c0 + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.a
    public String toString() {
        return a.class.getSimpleName() + G();
    }

    public void w0() throws IOException {
        r0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) u0()).next();
        x0(entry.getValue());
        x0(new o((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.a
    public String x() {
        return w(true);
    }

    @Override // com.google.gson.stream.a
    public boolean z() throws IOException {
        JsonToken c0 = c0();
        return (c0 == JsonToken.END_OBJECT || c0 == JsonToken.END_ARRAY || c0 == JsonToken.END_DOCUMENT) ? false : true;
    }
}
