package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.q;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class j extends q {
    protected final File h;
    protected final String i;

    private static final class b extends q.a implements Comparable {

        /* renamed from: c, reason: collision with root package name */
        final ZipEntry f6713c;

        /* renamed from: d, reason: collision with root package name */
        final int f6714d;

        b(String str, ZipEntry zipEntry, int i) {
            super(str, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())));
            this.f6713c = zipEntry;
            this.f6714d = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.a.compareTo(((b) obj).a);
        }
    }

    protected class c extends q.f {
        private b[] a;
        private final ZipFile b;

        /* renamed from: c, reason: collision with root package name */
        private final q f6715c;

        private final class a extends q.d {
            private int a;

            a(a aVar) {
            }

            @Override // com.facebook.soloader.q.d
            public boolean a() {
                c.this.o();
                return this.a < c.this.a.length;
            }

            @Override // com.facebook.soloader.q.d
            public q.c d() throws IOException {
                c.this.o();
                b[] bVarArr = c.this.a;
                int i = this.a;
                this.a = i + 1;
                b bVar = bVarArr[i];
                InputStream inputStream = c.this.b.getInputStream(bVar.f6713c);
                try {
                    return new q.e(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        c(q qVar) throws IOException {
            this.b = new ZipFile(j.this.h);
            this.f6715c = qVar;
        }

        @Override // com.facebook.soloader.q.f
        public final q.b a() throws IOException {
            return new q.b(o());
        }

        @Override // com.facebook.soloader.q.f, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        @Override // com.facebook.soloader.q.f
        public final q.d d() throws IOException {
            return new a(null);
        }

        final b[] o() {
            int i;
            if (this.a == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(j.this.i);
                String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
                Enumeration<? extends ZipEntry> entries = this.b.entries();
                while (true) {
                    i = 0;
                    if (!entries.hasMoreElements()) {
                        break;
                    }
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = compile.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        while (true) {
                            if (i >= supportedAbis.length) {
                                i = -1;
                                break;
                            }
                            if (supportedAbis[i] != null && group.equals(supportedAbis[i])) {
                                break;
                            }
                            i++;
                        }
                        if (i >= 0) {
                            linkedHashSet.add(group);
                            b bVar = (b) hashMap.get(group2);
                            if (bVar == null || i < bVar.f6714d) {
                                hashMap.put(group2, new b(group2, nextElement, i));
                            }
                        }
                    }
                }
                q qVar = this.f6715c;
                Objects.requireNonNull(qVar);
                b[] bVarArr = (b[]) hashMap.values().toArray(new b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i2 = 0;
                for (int i3 = 0; i3 < bVarArr.length; i3++) {
                    b bVar2 = bVarArr[i3];
                    if (p(bVar2.f6713c, bVar2.a)) {
                        i2++;
                    } else {
                        bVarArr[i3] = null;
                    }
                }
                b[] bVarArr2 = new b[i2];
                int i4 = 0;
                while (i < bVarArr.length) {
                    b bVar3 = bVarArr[i];
                    if (bVar3 != null) {
                        bVarArr2[i4] = bVar3;
                        i4++;
                    }
                    i++;
                }
                this.a = bVarArr2;
            }
            return this.a;
        }

        protected boolean p(ZipEntry zipEntry, String str) {
            throw null;
        }
    }

    public j(Context context, String str, File file, String str2) {
        super(context, str);
        this.h = file;
        this.i = str2;
    }
}
