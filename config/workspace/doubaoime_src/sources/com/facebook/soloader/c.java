package com.facebook.soloader;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class c extends o {
    private final Map<String, Set<String>> a;
    private final Set<String> b;

    /* renamed from: c, reason: collision with root package name */
    private final File f6705c;

    public c(Context context) {
        this.a = new HashMap();
        this.b = c("");
        this.f6705c = new File(context.getApplicationInfo().sourceDir);
    }

    static Set<String> c(String str) {
        HashSet hashSet = new HashSet();
        String a = SysUtil$Api14Utils.a();
        if (a != null) {
            for (String str2 : a.split(Constants.COLON_SEPARATOR)) {
                if (str2.contains(str + ".apk!/")) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r4 = new com.facebook.soloader.h(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r5 = com.facebook.soloader.SoLoader.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r5 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        com.facebook.soloader.Api18TraceUtils.a("SoLoader.getElfDependencies[", r13, "]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        r7 = com.facebook.soloader.l.f6717c;
        r7 = com.facebook.soloader.MinElf.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r5 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r5 = r7.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r8 >= r5) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        r9 = r7[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        monitor-enter(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        r10 = r12.a.values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        if (r10.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a0, code lost:
    
        if (r10.next().contains(r9) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        monitor-exit(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (r10 != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        if (r9.startsWith("/") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b7, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b2, code lost:
    
        com.facebook.soloader.SoLoader.k(r9, r14 | 1, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
    
        monitor-exit(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a6, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bd, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c1, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00c4, code lost:
    
        if (com.facebook.soloader.SoLoader.a != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00c6, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00c9, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ca, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d3, code lost:
    
        throw r13;
     */
    @Override // com.facebook.soloader.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.lang.String r13, int r14, android.os.StrictMode.ThreadPolicy r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.c.a(java.lang.String, int, android.os.StrictMode$ThreadPolicy):int");
    }

    @Override // com.facebook.soloader.o
    protected void b(int i) throws IOException {
        int indexOf;
        int i2;
        String str = null;
        for (String str2 : this.b) {
            if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf(33)) >= 0 && (i2 = indexOf + 2) < str2.length()) {
                str = str2.substring(i2);
            }
            if (!TextUtils.isEmpty(str)) {
                ZipFile zipFile = new ZipFile(this.f6705c);
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement != null && nextElement.getName().startsWith(str) && nextElement.getName().endsWith(".so") && nextElement.getMethod() == 0) {
                            String substring = nextElement.getName().substring(str.length() + 1);
                            synchronized (this) {
                                if (!this.a.containsKey(str2)) {
                                    this.a.put(str2, new HashSet());
                                }
                                this.a.get(str2).add(substring);
                            }
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // com.facebook.soloader.o
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c.class.getName());
        sb.append("[root = ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        Iterator<String> it2 = this.b.iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            sb2.append(", ");
        }
        sb2.append(')');
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }

    public c(File file) {
        this.a = new HashMap();
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        this.b = c(lastIndexOf > 0 ? name.substring(0, lastIndexOf) : name);
        this.f6705c = file;
    }
}
