package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class q extends com.facebook.soloader.d {

    /* renamed from: d, reason: collision with root package name */
    protected final Context f6723d;

    /* renamed from: e, reason: collision with root package name */
    protected String f6724e;

    /* renamed from: f, reason: collision with root package name */
    protected k f6725f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f6726g;

    public static class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public static final class b {
        public final a[] a;

        public b(a[] aVarArr) {
            this.a = aVarArr;
        }

        static final b a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() != 1) {
                throw new RuntimeException("wrong dso manifest version");
            }
            int readInt = dataInput.readInt();
            if (readInt < 0) {
                throw new RuntimeException("illegal number of shared libraries");
            }
            a[] aVarArr = new a[readInt];
            for (int i = 0; i < readInt; i++) {
                aVarArr[i] = new a(dataInput.readUTF(), dataInput.readUTF());
            }
            return new b(aVarArr);
        }
    }

    protected interface c extends Closeable {
    }

    protected static abstract class d implements Closeable {
        protected d() {
        }

        public abstract boolean a();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public abstract c d() throws IOException;
    }

    public static class e implements c {
        private final a a;
        private final InputStream b;

        public e(a aVar, InputStream inputStream) {
            this.a = aVar;
            this.b = inputStream;
        }

        public a a() {
            return this.a;
        }

        public int available() throws IOException {
            return this.b.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        public String d() {
            return this.a.a;
        }

        public void h(DataOutput dataOutput, byte[] bArr) throws IOException {
            int read;
            InputStream inputStream = this.b;
            int i = 0;
            while (i < Integer.MAX_VALUE && (read = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i))) != -1) {
                dataOutput.write(bArr, 0, read);
                i += read;
            }
        }
    }

    protected static abstract class f implements Closeable {
        protected f() {
        }

        public abstract b a() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public abstract d d() throws IOException;
    }

    protected q(Context context, String str) {
        super(l(context, str), 1);
        this.f6726g = new HashMap();
        this.f6723d = context;
    }

    private void f(a[] aVarArr) throws IOException {
        String[] list = this.a.list();
        if (list == null) {
            StringBuilder M = e.a.a.a.a.M("unable to list directory ");
            M.append(this.a);
            throw new IOException(M.toString());
        }
        for (String str : list) {
            if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_instance_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                boolean z = false;
                for (int i = 0; !z && i < aVarArr.length; i++) {
                    if (aVarArr[i].a.equals(str)) {
                        z = true;
                    }
                }
                if (!z) {
                    File file = new File(this.a, str);
                    Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                    MinElf.a(file);
                }
            }
        }
    }

    private void g(c cVar, byte[] bArr) throws IOException {
        StringBuilder M = e.a.a.a.a.M("extracting DSO ");
        e eVar = (e) cVar;
        M.append(eVar.a().a);
        Log.i("fb-UnpackingSoSource", M.toString());
        try {
            if (this.a.setWritable(true)) {
                h(eVar, bArr);
            } else {
                throw new IOException("cannot make directory writable for us: " + this.a);
            }
        } finally {
            if (!this.a.setWritable(false)) {
                StringBuilder M2 = e.a.a.a.a.M("error removing ");
                M2.append(this.a.getCanonicalPath());
                M2.append(" write permission");
                Log.w("fb-UnpackingSoSource", M2.toString());
            }
        }
    }

    private void h(c cVar, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        e eVar = (e) cVar;
        File file = new File(this.a, eVar.d());
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (file.exists() && !file.setWritable(true)) {
                    Log.w("fb-UnpackingSoSource", "error adding write permission to: " + file);
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                } catch (IOException e2) {
                    Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e2);
                    MinElf.a(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                }
                randomAccessFile2 = randomAccessFile;
                int available = eVar.available();
                if (available > 1) {
                    SysUtil$LollipopSysdeps.fallocateIfSupported(randomAccessFile2.getFD(), available);
                }
                eVar.h(randomAccessFile2, bArr);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                if (!file.setExecutable(true, false)) {
                    throw new IOException("cannot make file executable: " + file);
                }
                if (!file.setWritable(false)) {
                    Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
                }
                randomAccessFile2.close();
            } catch (IOException e3) {
                MinElf.a(file);
                throw e3;
            }
        } catch (Throwable th) {
            if (!file.setWritable(false)) {
                Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
            }
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    private Object j(String str) {
        Object obj;
        synchronized (this.f6726g) {
            obj = this.f6726g.get(str);
            if (obj == null) {
                obj = new Object();
                this.f6726g.put(str, obj);
            }
        }
        return obj;
    }

    public static File l(Context context, String str) {
        return new File(e.a.a.a.a.K(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:51:0x002d, B:7:0x003f, B:8:0x0046, B:9:0x0050, B:11:0x0056, B:33:0x00a8, B:38:0x00b9, B:45:0x00b6, B:54:0x0036, B:42:0x00af, B:15:0x005e, B:17:0x0063, B:19:0x0078, B:23:0x008b, B:27:0x008e, B:31:0x00a5), top: B:2:0x002b, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:51:0x002d, B:7:0x003f, B:8:0x0046, B:9:0x0050, B:11:0x0056, B:33:0x00a8, B:38:0x00b9, B:45:0x00b6, B:54:0x0036, B:42:0x00af, B:15:0x005e, B:17:0x0063, B:19:0x0078, B:23:0x008b, B:27:0x008e, B:31:0x00a5), top: B:2:0x002b, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p(byte r11, com.facebook.soloader.q.b r12, com.facebook.soloader.q.d r13) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "regenerating DSO store "
            java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
            java.lang.Class r1 = r10.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "fb-UnpackingSoSource"
            android.util.Log.v(r1, r0)
            java.io.File r0 = new java.io.File
            java.io.File r2 = r10.a
            java.lang.String r3 = "dso_manifest"
            r0.<init>(r2, r3)
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            java.lang.String r3 = "rw"
            r2.<init>(r0, r3)
            r0 = 1
            if (r11 != r0) goto L3b
            com.facebook.soloader.q$b r11 = com.facebook.soloader.q.b.a(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            goto L3c
        L32:
            r11 = move-exception
            goto Lda
        L35:
            r11 = move-exception
            java.lang.String r3 = "error reading existing DSO manifest"
            android.util.Log.i(r1, r3, r11)     // Catch: java.lang.Throwable -> L32
        L3b:
            r11 = 0
        L3c:
            r3 = 0
            if (r11 != 0) goto L46
            com.facebook.soloader.q$b r11 = new com.facebook.soloader.q$b     // Catch: java.lang.Throwable -> L32
            com.facebook.soloader.q$a[] r4 = new com.facebook.soloader.q.a[r3]     // Catch: java.lang.Throwable -> L32
            r11.<init>(r4)     // Catch: java.lang.Throwable -> L32
        L46:
            com.facebook.soloader.q$a[] r12 = r12.a     // Catch: java.lang.Throwable -> L32
            r10.f(r12)     // Catch: java.lang.Throwable -> L32
            r12 = 32768(0x8000, float:4.5918E-41)
            byte[] r12 = new byte[r12]     // Catch: java.lang.Throwable -> L32
        L50:
            boolean r4 = r13.a()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto Lba
            com.facebook.soloader.q$c r4 = r13.d()     // Catch: java.lang.Throwable -> L32
            r5 = r0
            r6 = r3
        L5c:
            if (r5 == 0) goto L8e
            com.facebook.soloader.q$a[] r7 = r11.a     // Catch: java.lang.Throwable -> Lac
            int r7 = r7.length     // Catch: java.lang.Throwable -> Lac
            if (r6 >= r7) goto L8e
            r7 = r4
            com.facebook.soloader.q$e r7 = (com.facebook.soloader.q.e) r7     // Catch: java.lang.Throwable -> Lac
            com.facebook.soloader.q$a r8 = r7.a()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r8 = r8.a     // Catch: java.lang.Throwable -> Lac
            com.facebook.soloader.q$a[] r9 = r11.a     // Catch: java.lang.Throwable -> Lac
            r9 = r9[r6]     // Catch: java.lang.Throwable -> Lac
            java.lang.String r9 = r9.a     // Catch: java.lang.Throwable -> Lac
            boolean r8 = r9.equals(r8)     // Catch: java.lang.Throwable -> Lac
            if (r8 == 0) goto L8b
            com.facebook.soloader.q$a[] r8 = r11.a     // Catch: java.lang.Throwable -> Lac
            r8 = r8[r6]     // Catch: java.lang.Throwable -> Lac
            java.lang.String r8 = r8.b     // Catch: java.lang.Throwable -> Lac
            com.facebook.soloader.q$a r7 = r7.a()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r7 = r7.b     // Catch: java.lang.Throwable -> Lac
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L8b
            r5 = r3
        L8b:
            int r6 = r6 + 1
            goto L5c
        L8e:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> Lac
            java.io.File r7 = r10.a     // Catch: java.lang.Throwable -> Lac
            r8 = r4
            com.facebook.soloader.q$e r8 = (com.facebook.soloader.q.e) r8     // Catch: java.lang.Throwable -> Lac
            java.lang.String r9 = r8.d()     // Catch: java.lang.Throwable -> Lac
            r6.<init>(r7, r9)     // Catch: java.lang.Throwable -> Lac
            boolean r6 = r6.exists()     // Catch: java.lang.Throwable -> Lac
            if (r6 != 0) goto La3
            r5 = r0
        La3:
            if (r5 == 0) goto La8
            r10.g(r8, r12)     // Catch: java.lang.Throwable -> Lac
        La8:
            r8.close()     // Catch: java.lang.Throwable -> L32
            goto L50
        Lac:
            r11 = move-exception
            if (r4 == 0) goto Lb9
            com.facebook.soloader.q$e r4 = (com.facebook.soloader.q.e) r4     // Catch: java.lang.Throwable -> Lb5
            r4.close()     // Catch: java.lang.Throwable -> Lb5
            goto Lb9
        Lb5:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch: java.lang.Throwable -> L32
        Lb9:
            throw r11     // Catch: java.lang.Throwable -> L32
        Lba:
            r2.close()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Finished regenerating DSO store "
            r11.append(r12)
            java.lang.Class r12 = r10.getClass()
            java.lang.String r12 = r12.getName()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.v(r1, r11)
            return
        Lda:
            r2.close()     // Catch: java.lang.Throwable -> Lde
            goto Le2
        Lde:
            r12 = move-exception
            r11.addSuppressed(r12)
        Le2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.q.p(byte, com.facebook.soloader.q$b, com.facebook.soloader.q$d):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(File file, byte b2) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b2);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e2) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e2);
        }
    }

    @Override // com.facebook.soloader.d, com.facebook.soloader.o
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int d2;
        synchronized (j(str)) {
            d2 = d(str, i, this.a, threadPolicy);
        }
        return d2;
    }

    @Override // com.facebook.soloader.o
    protected void b(int i) throws IOException {
        File file = this.a;
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("cannot mkdir: " + file);
        }
        k k = k(new File(this.a, "dso_lock"), true);
        if (this.f6725f == null) {
            this.f6725f = k(new File(this.a, "dso_instance_lock"), false);
        }
        boolean canWrite = this.a.canWrite();
        try {
            Log.v("fb-UnpackingSoSource", "locked dso store " + this.a);
            if (!canWrite) {
                this.a.setWritable(true);
            }
            if (o(k, i, i())) {
                k = null;
            } else {
                Log.i("fb-UnpackingSoSource", "dso store is up-to-date: " + this.a);
            }
        } finally {
            if (!canWrite) {
                this.a.setWritable(false);
            }
            if (k != null) {
                StringBuilder M = e.a.a.a.a.M("releasing dso store lock for ");
                M.append(this.a);
                Log.v("fb-UnpackingSoSource", M.toString());
                k.close();
            } else {
                StringBuilder M2 = e.a.a.a.a.M("not releasing dso store lock for ");
                M2.append(this.a);
                M2.append(" (syncer thread started)");
                Log.v("fb-UnpackingSoSource", M2.toString());
            }
        }
    }

    protected byte[] i() throws IOException {
        Parcel obtain = Parcel.obtain();
        f m = m((byte) 1);
        try {
            a[] aVarArr = m.a().a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(aVarArr.length);
            for (int i = 0; i < aVarArr.length; i++) {
                obtain.writeString(aVarArr[i].a);
                obtain.writeString(aVarArr[i].b);
            }
            m.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            if (m != null) {
                try {
                    m.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    protected k k(File file, boolean z) throws IOException {
        StringBuilder sb;
        File file2 = this.a;
        boolean z2 = true;
        try {
            file = z ? k.a(file) : k.d(file);
        } catch (FileNotFoundException e2) {
            try {
                if (!file2.setWritable(true)) {
                    throw e2;
                }
                if (z) {
                    file = k.a(file);
                    if (!file2.setWritable(false)) {
                        sb = new StringBuilder();
                        file = file;
                    }
                } else {
                    file = k.d(file);
                    if (!file2.setWritable(false)) {
                        sb = new StringBuilder();
                        file = file;
                    }
                }
                sb.append("error removing ");
                sb.append(file2.getCanonicalPath());
                sb.append(" write permission");
                Log.w("SysUtil", sb.toString());
            } catch (Throwable th) {
                th = th;
                if (z2 && !file2.setWritable(false)) {
                    StringBuilder M = e.a.a.a.a.M("error removing ");
                    M.append(file2.getCanonicalPath());
                    M.append(" write permission");
                    Log.w("SysUtil", M.toString());
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
            if (z2) {
                StringBuilder M2 = e.a.a.a.a.M("error removing ");
                M2.append(file2.getCanonicalPath());
                M2.append(" write permission");
                Log.w("SysUtil", M2.toString());
            }
            throw th;
        }
        return file;
    }

    protected abstract f m(byte b2) throws IOException;

    protected synchronized void n(String str) throws IOException {
        synchronized (j(str)) {
            this.f6724e = str;
            b(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean o(com.facebook.soloader.k r13, int r14, byte[] r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.q.o(com.facebook.soloader.k, int, byte[]):boolean");
    }
}
