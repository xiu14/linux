package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends Exception {

    /* renamed from: f, reason: collision with root package name */
    private static final StackTraceElement[] f1675f = new StackTraceElement[0];
    private final List<Throwable> a;
    private com.bumptech.glide.load.d b;

    /* renamed from: c, reason: collision with root package name */
    private DataSource f1676c;

    /* renamed from: d, reason: collision with root package name */
    private Class<?> f1677d;

    /* renamed from: e, reason: collision with root package name */
    private String f1678e;

    public q(String str) {
        List<Throwable> emptyList = Collections.emptyList();
        this.f1678e = str;
        setStackTrace(f1675f);
        this.a = emptyList;
    }

    private void a(Throwable th, List<Throwable> list) {
        if (!(th instanceof q)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it2 = ((q) th).a.iterator();
        while (it2.hasNext()) {
            a(it2.next(), list);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof q) {
                ((q) th).f(appendable);
            } else {
                d(th, appendable);
            }
            i = i2;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void f(Appendable appendable) {
        d(this, appendable);
        b(this.a, new a(appendable));
    }

    public void e(String str) {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder M = e.a.a.a.a.M("Root cause (");
            int i2 = i + 1;
            M.append(i2);
            M.append(" of ");
            M.append(size);
            M.append(")");
            Log.i(str, M.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    void g(com.bumptech.glide.load.d dVar, DataSource dataSource) {
        this.b = dVar;
        this.f1676c = dataSource;
        this.f1677d = null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f1678e);
        String str3 = "";
        if (this.f1677d != null) {
            StringBuilder M = e.a.a.a.a.M(", ");
            M.append(this.f1677d);
            str = M.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f1676c != null) {
            StringBuilder M2 = e.a.a.a.a.M(", ");
            M2.append(this.f1676c);
            str2 = M2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.b != null) {
            StringBuilder M3 = e.a.a.a.a.M(", ");
            M3.append(this.b);
            str3 = M3.toString();
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Throwable th = (Throwable) it2.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    void h(com.bumptech.glide.load.d dVar, DataSource dataSource, Class<?> cls) {
        this.b = dVar;
        this.f1676c = dataSource;
        this.f1677d = cls;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        f(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }

    private static final class a implements Appendable {
        private final Appendable a;
        private boolean b = true;

        a(Appendable appendable) {
            this.a = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.b) {
                this.b = false;
                this.a.append("  ");
            }
            this.b = c2 == '\n';
            this.a.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.b) {
                this.b = false;
                this.a.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.b = z;
            this.a.append(charSequence, i, i2);
            return this;
        }
    }

    public q(String str, Throwable th) {
        List<Throwable> singletonList = Collections.singletonList(th);
        this.f1678e = str;
        setStackTrace(f1675f);
        this.a = singletonList;
    }

    public q(String str, List<Throwable> list) {
        this.f1678e = str;
        setStackTrace(f1675f);
        this.a = list;
    }
}
