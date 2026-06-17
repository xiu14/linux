package com.bumptech.glide.m;

import android.annotation.TargetApi;
import android.os.StrictMode;
import com.vivo.push.PushClient;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements Closeable {
    private final File a;
    private final File b;

    /* renamed from: c, reason: collision with root package name */
    private final File f1787c;

    /* renamed from: d, reason: collision with root package name */
    private final File f1788d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1789e;

    /* renamed from: f, reason: collision with root package name */
    private long f1790f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1791g;
    private Writer i;
    private int k;
    private long h = 0;
    private final LinkedHashMap<String, d> j = new LinkedHashMap<>(0, 0.75f, true);
    private long l = 0;
    final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    private final Callable<Void> n = new CallableC0040a();

    /* renamed from: com.bumptech.glide.m.a$a, reason: collision with other inner class name */
    class CallableC0040a implements Callable<Void> {
        CallableC0040a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (a.this) {
                if (a.this.i == null) {
                    return null;
                }
                a.this.U();
                if (a.this.H()) {
                    a.this.Q();
                    a.this.k = 0;
                }
                return null;
            }
        }
    }

    private static final class b implements ThreadFactory {
        b(CallableC0040a callableC0040a) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {
        private final d a;
        private final boolean[] b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1792c;

        c(d dVar, CallableC0040a callableC0040a) {
            this.a = dVar;
            this.b = dVar.f1796e ? null : new boolean[a.this.f1791g];
        }

        public void a() throws IOException {
            a.o(a.this, this, false);
        }

        public void b() {
            if (this.f1792c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            a.o(a.this, this, true);
            this.f1792c = true;
        }

        public File f(int i) throws IOException {
            File file;
            synchronized (a.this) {
                if (this.a.f1797f != this) {
                    throw new IllegalStateException();
                }
                if (!this.a.f1796e) {
                    this.b[i] = true;
                }
                file = this.a.f1795d[i];
                a.this.a.mkdirs();
            }
            return file;
        }
    }

    private final class d {
        private final String a;
        private final long[] b;

        /* renamed from: c, reason: collision with root package name */
        File[] f1794c;

        /* renamed from: d, reason: collision with root package name */
        File[] f1795d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f1796e;

        /* renamed from: f, reason: collision with root package name */
        private c f1797f;

        /* renamed from: g, reason: collision with root package name */
        private long f1798g;

        d(String str, CallableC0040a callableC0040a) {
            this.a = str;
            this.b = new long[a.this.f1791g];
            this.f1794c = new File[a.this.f1791g];
            this.f1795d = new File[a.this.f1791g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < a.this.f1791g; i++) {
                sb.append(i);
                this.f1794c[i] = new File(a.this.a, sb.toString());
                sb.append(".tmp");
                this.f1795d[i] = new File(a.this.a, sb.toString());
                sb.setLength(length);
            }
        }

        static void i(d dVar, String[] strArr) throws IOException {
            if (strArr.length != a.this.f1791g) {
                dVar.k(strArr);
                throw null;
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    dVar.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    dVar.k(strArr);
                    throw null;
                }
            }
        }

        private IOException k(String[] strArr) throws IOException {
            StringBuilder M = e.a.a.a.a.M("unexpected journal line: ");
            M.append(Arrays.toString(strArr));
            throw new IOException(M.toString());
        }

        public String j() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public final class e {
        private final File[] a;

        e(a aVar, String str, long j, File[] fileArr, long[] jArr, CallableC0040a callableC0040a) {
            this.a = fileArr;
        }

        public File a(int i) {
            return this.a[i];
        }
    }

    private a(File file, int i, int i2, long j) {
        this.a = file;
        this.f1789e = i;
        this.b = new File(file, "journal");
        this.f1787c = new File(file, "journal.tmp");
        this.f1788d = new File(file, "journal.bkp");
        this.f1791g = i2;
        this.f1790f = j;
    }

    @TargetApi(26)
    private static void D(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    public static a I(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                S(file2, file3, false);
            }
        }
        a aVar = new a(file, i, i2, j);
        if (aVar.b.exists()) {
            try {
                aVar.N();
                aVar.M();
                return aVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                aVar.close();
                com.bumptech.glide.m.c.a(aVar.a);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i, i2, j);
        aVar2.Q();
        return aVar2;
    }

    private void M() throws IOException {
        z(this.f1787c);
        Iterator<d> it2 = this.j.values().iterator();
        while (it2.hasNext()) {
            d next = it2.next();
            int i = 0;
            if (next.f1797f == null) {
                while (i < this.f1791g) {
                    this.h += next.b[i];
                    i++;
                }
            } else {
                next.f1797f = null;
                while (i < this.f1791g) {
                    z(next.f1794c[i]);
                    z(next.f1795d[i]);
                    i++;
                }
                it2.remove();
            }
        }
    }

    private void N() throws IOException {
        com.bumptech.glide.m.b bVar = new com.bumptech.glide.m.b(new FileInputStream(this.b), com.bumptech.glide.m.c.a);
        try {
            String l = bVar.l();
            String l2 = bVar.l();
            String l3 = bVar.l();
            String l4 = bVar.l();
            String l5 = bVar.l();
            if (!"libcore.io.DiskLruCache".equals(l) || !PushClient.DEFAULT_REQUEST_ID.equals(l2) || !Integer.toString(this.f1789e).equals(l3) || !Integer.toString(this.f1791g).equals(l4) || !"".equals(l5)) {
                throw new IOException("unexpected journal header: [" + l + ", " + l2 + ", " + l4 + ", " + l5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    P(bVar.l());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (bVar.h()) {
                        Q();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), com.bumptech.glide.m.c.a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    private void P(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException(e.a.a.a.a.s("unexpected journal line: ", str));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.j.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        d dVar = this.j.get(substring);
        if (dVar == null) {
            dVar = new d(substring, null);
            this.j.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f1796e = true;
            dVar.f1797f = null;
            d.i(dVar, split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f1797f = new c(dVar, null);
        } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
            throw new IOException(e.a.a.a.a.s("unexpected journal line: ", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Q() throws IOException {
        Writer writer = this.i;
        if (writer != null) {
            x(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1787c), com.bumptech.glide.m.c.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(PushClient.DEFAULT_REQUEST_ID);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f1789e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f1791g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.j.values()) {
                if (dVar.f1797f != null) {
                    bufferedWriter.write("DIRTY " + dVar.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.a + dVar.j() + '\n');
                }
            }
            x(bufferedWriter);
            if (this.b.exists()) {
                S(this.b, this.f1788d, true);
            }
            S(this.f1787c, this.b, false);
            this.f1788d.delete();
            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), com.bumptech.glide.m.c.a));
        } catch (Throwable th) {
            x(bufferedWriter);
            throw th;
        }
    }

    private static void S(File file, File file2, boolean z) throws IOException {
        if (z) {
            z(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() throws IOException {
        while (this.h > this.f1790f) {
            String key = this.j.entrySet().iterator().next().getKey();
            synchronized (this) {
                w();
                d dVar = this.j.get(key);
                if (dVar != null && dVar.f1797f == null) {
                    for (int i = 0; i < this.f1791g; i++) {
                        File file = dVar.f1794c[i];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        this.h -= dVar.b[i];
                        dVar.b[i] = 0;
                    }
                    this.k++;
                    this.i.append((CharSequence) "REMOVE");
                    this.i.append(' ');
                    this.i.append((CharSequence) key);
                    this.i.append('\n');
                    this.j.remove(key);
                    if (H()) {
                        this.m.submit(this.n);
                    }
                }
            }
        }
    }

    static void o(a aVar, c cVar, boolean z) throws IOException {
        synchronized (aVar) {
            d dVar = cVar.a;
            if (dVar.f1797f != cVar) {
                throw new IllegalStateException();
            }
            if (z && !dVar.f1796e) {
                for (int i = 0; i < aVar.f1791g; i++) {
                    if (!cVar.b[i]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!dVar.f1795d[i].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < aVar.f1791g; i2++) {
                File file = dVar.f1795d[i2];
                if (!z) {
                    z(file);
                } else if (file.exists()) {
                    File file2 = dVar.f1794c[i2];
                    file.renameTo(file2);
                    long j = dVar.b[i2];
                    long length = file2.length();
                    dVar.b[i2] = length;
                    aVar.h = (aVar.h - j) + length;
                }
            }
            aVar.k++;
            dVar.f1797f = null;
            if (dVar.f1796e || z) {
                dVar.f1796e = true;
                aVar.i.append((CharSequence) "CLEAN");
                aVar.i.append(' ');
                aVar.i.append((CharSequence) dVar.a);
                aVar.i.append((CharSequence) dVar.j());
                aVar.i.append('\n');
                if (z) {
                    long j2 = aVar.l;
                    aVar.l = 1 + j2;
                    dVar.f1798g = j2;
                }
            } else {
                aVar.j.remove(dVar.a);
                aVar.i.append((CharSequence) "REMOVE");
                aVar.i.append(' ');
                aVar.i.append((CharSequence) dVar.a);
                aVar.i.append('\n');
            }
            D(aVar.i);
            if (aVar.h > aVar.f1790f || aVar.H()) {
                aVar.m.submit(aVar.n);
            }
        }
    }

    private void w() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void x(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void z(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public c A(String str) throws IOException {
        synchronized (this) {
            w();
            d dVar = this.j.get(str);
            if (dVar == null) {
                dVar = new d(str, null);
                this.j.put(str, dVar);
            } else if (dVar.f1797f != null) {
                return null;
            }
            c cVar = new c(dVar, null);
            dVar.f1797f = cVar;
            this.i.append((CharSequence) "DIRTY");
            this.i.append(' ');
            this.i.append((CharSequence) str);
            this.i.append('\n');
            D(this.i);
            return cVar;
        }
    }

    public synchronized e G(String str) throws IOException {
        w();
        d dVar = this.j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f1796e) {
            return null;
        }
        for (File file : dVar.f1794c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (H()) {
            this.m.submit(this.n);
        }
        return new e(this, str, dVar.f1798g, dVar.f1794c, dVar.b, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.i == null) {
            return;
        }
        Iterator it2 = new ArrayList(this.j.values()).iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            if (dVar.f1797f != null) {
                dVar.f1797f.a();
            }
        }
        U();
        x(this.i);
        this.i = null;
    }
}
