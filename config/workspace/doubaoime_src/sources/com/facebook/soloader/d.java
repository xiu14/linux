package com.facebook.soloader;

import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import com.facebook.soloader.SoLoader;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class d extends o {
    protected final File a;
    protected final int b;

    /* renamed from: c, reason: collision with root package name */
    protected final List<String> f6706c;

    public d(File file, int i) {
        this.a = file;
        this.b = i;
        this.f6706c = Arrays.asList(new String[0]);
    }

    private void c(String str, f fVar, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        boolean z = SoLoader.a;
        if (z) {
            Api18TraceUtils.a("SoLoader.getElfDependencies[", str, "]");
        }
        try {
            int i2 = l.f6717c;
            String[] b = MinElf.b(fVar);
            if (z) {
                Trace.endSection();
            }
            StringBuilder U = e.a.a.a.a.U("Loading ", str, "'s dependencies: ");
            U.append(Arrays.toString(b));
            Log.d("SoLoader", U.toString());
            for (String str2 : b) {
                if (!str2.startsWith("/")) {
                    SoLoader.k(str2, i | 1, threadPolicy);
                }
            }
        } catch (Throwable th) {
            if (SoLoader.a) {
                Trace.endSection();
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.o
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return d(str, i, this.a, threadPolicy);
    }

    protected int d(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        if (this.f6706c.contains(str)) {
            StringBuilder S = e.a.a.a.a.S(str, " is on the denyList, skip loading from ");
            S.append(file.getCanonicalPath());
            Log.d("SoLoader", S.toString());
            return 0;
        }
        File file2 = new File(this.a, str);
        g gVar = null;
        if (!file2.exists()) {
            file2 = null;
        }
        if (file2 == null) {
            StringBuilder S2 = e.a.a.a.a.S(str, " not found on ");
            S2.append(file.getCanonicalPath());
            Log.v("SoLoader", S2.toString());
            return 0;
        }
        StringBuilder S3 = e.a.a.a.a.S(str, " found on ");
        S3.append(file.getCanonicalPath());
        Log.d("SoLoader", S3.toString());
        if ((i & 1) != 0 && (this.b & 2) != 0) {
            Log.d("SoLoader", str + " loaded implicitly");
            return 2;
        }
        boolean z = (this.b & 1) != 0;
        boolean equals = file2.getName().equals(str);
        if (z || !equals) {
            try {
                gVar = new g(file2);
            } catch (Throwable th) {
                if (gVar != null) {
                    gVar.close();
                }
                throw th;
            }
        }
        if (z) {
            c(str, gVar, i, threadPolicy);
        } else {
            Log.d("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            if (equals) {
                ((SoLoader.a) SoLoader.b).b(file2.getAbsolutePath(), i);
                if (gVar != null) {
                    gVar.close();
                }
                return 1;
            }
            n nVar = SoLoader.b;
            file2.getAbsolutePath();
            Objects.requireNonNull((SoLoader.a) nVar);
            throw new UnsupportedOperationException();
        } catch (UnsatisfiedLinkError e2) {
            if (!e2.getMessage().contains("bad ELF magic")) {
                throw e2;
            }
            Log.d("SoLoader", "Corrupted lib file detected");
            if (gVar != null) {
                gVar.close();
            }
            return 3;
        }
    }

    @Override // com.facebook.soloader.o
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.a.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        return e.a.a.a.a.C(sb, this.b, ']');
    }

    public d(File file, int i, String[] strArr) {
        this.a = file;
        this.b = i;
        this.f6706c = Arrays.asList(strArr);
    }
}
