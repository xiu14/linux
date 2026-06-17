package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.j;
import com.facebook.soloader.q;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class a extends j {
    private final int j;

    /* renamed from: com.facebook.soloader.a$a, reason: collision with other inner class name */
    protected class C0331a extends j.c {

        /* renamed from: e, reason: collision with root package name */
        private final File f6701e;

        /* renamed from: f, reason: collision with root package name */
        private final int f6702f;

        C0331a(j jVar) throws IOException {
            super(jVar);
            this.f6701e = new File(a.this.f6723d.getApplicationInfo().nativeLibraryDir);
            this.f6702f = a.this.j;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
        @Override // com.facebook.soloader.j.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected boolean p(java.util.zip.ZipEntry r10, java.lang.String r11) {
            /*
                r9 = this;
                java.lang.String r0 = r10.getName()
                com.facebook.soloader.a r1 = com.facebook.soloader.a.this
                java.lang.String r1 = r1.f6724e
                boolean r1 = r11.equals(r1)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L21
                com.facebook.soloader.a r10 = com.facebook.soloader.a.this
                r0 = 0
                r10.f6724e = r0
                java.lang.Object[] r10 = new java.lang.Object[r3]
                r10[r2] = r11
                java.lang.String r11 = "allowing consideration of corrupted lib %s"
                java.lang.String r10 = java.lang.String.format(r11, r10)
                goto La5
            L21:
                int r1 = r9.f6702f
                r1 = r1 & r3
                if (r1 != 0) goto L30
                java.lang.String r10 = "allowing consideration of "
                java.lang.String r11 = ": self-extraction preferred"
                java.lang.String r10 = e.a.a.a.a.t(r10, r0, r11)
                goto La5
            L30:
                java.io.File r1 = new java.io.File
                java.io.File r4 = r9.f6701e
                r1.<init>(r4, r11)
                r4 = 3
                r5 = 2
                java.lang.String r6 = r1.getCanonicalPath()     // Catch: java.io.IOException -> L5a
                java.io.File r7 = r9.f6701e     // Catch: java.io.IOException -> L5a
                java.lang.String r7 = r7.getCanonicalPath()     // Catch: java.io.IOException -> L5a
                boolean r6 = r6.startsWith(r7)     // Catch: java.io.IOException -> L5a
                if (r6 != 0) goto L56
                java.lang.String r6 = "not allowing consideration of %s: %s not in lib dir"
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.io.IOException -> L5a
                r7[r2] = r0     // Catch: java.io.IOException -> L5a
                r7[r3] = r11     // Catch: java.io.IOException -> L5a
                java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.io.IOException -> L5a
                goto L6d
            L56:
                java.lang.String r6 = ""
                r7 = r3
                goto L6e
            L5a:
                r6 = move-exception
                java.lang.Object[] r7 = new java.lang.Object[r4]
                r7[r2] = r0
                r7[r3] = r11
                java.lang.String r6 = r6.toString()
                r7[r5] = r6
                java.lang.String r6 = "not allowing consideration of %s: %s, IOException when constructing path: %s"
                java.lang.String r6 = java.lang.String.format(r6, r7)
            L6d:
                r7 = r2
            L6e:
                if (r7 == 0) goto Lb0
                boolean r6 = r1.isFile()
                if (r6 != 0) goto L83
                java.lang.Object[] r10 = new java.lang.Object[r5]
                r10[r2] = r0
                r10[r3] = r11
                java.lang.String r11 = "allowing consideration of %s: %s not in system lib dir"
                java.lang.String r10 = java.lang.String.format(r11, r10)
                goto La5
            L83:
                long r6 = r1.length()
                long r10 = r10.getSize()
                int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r8 == 0) goto La8
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r2] = r1
                java.lang.Long r1 = java.lang.Long.valueOf(r6)
                r0[r3] = r1
                java.lang.Long r10 = java.lang.Long.valueOf(r10)
                r0[r5] = r10
                java.lang.String r10 = "allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK"
                java.lang.String r10 = java.lang.String.format(r10, r0)
            La5:
                r6 = r10
                r2 = r3
                goto Lb0
            La8:
                java.lang.String r10 = "not allowing consideration of "
                java.lang.String r11 = ": deferring to libdir"
                java.lang.String r6 = e.a.a.a.a.t(r10, r0, r11)
            Lb0:
                java.lang.String r10 = "ApkSoSource"
                android.util.Log.d(r10, r6)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.a.C0331a.p(java.util.zip.ZipEntry, java.lang.String):boolean");
        }
    }

    public a(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.j = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[Catch: all -> 0x008d, TRY_ENTER, TryCatch #1 {all -> 0x008d, blocks: (B:3:0x000b, B:27:0x0025, B:7:0x0031, B:9:0x003a, B:13:0x0045, B:15:0x004f, B:18:0x005a, B:20:0x0069, B:23:0x0074), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #1 {all -> 0x008d, blocks: (B:3:0x000b, B:27:0x0025, B:7:0x0031, B:9:0x003a, B:13:0x0045, B:15:0x004f, B:18:0x005a, B:20:0x0069, B:23:0x0074), top: B:2:0x000b }] */
    @Override // com.facebook.soloader.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected byte[] i() throws java.io.IOException {
        /*
            r5 = this;
            java.io.File r0 = r5.h
            java.io.File r0 = r0.getCanonicalFile()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r2 = 2
            r1.writeByte(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = r0.getPath()     // Catch: java.lang.Throwable -> L8d
            r1.writeString(r3)     // Catch: java.lang.Throwable -> L8d
            long r3 = r0.lastModified()     // Catch: java.lang.Throwable -> L8d
            r1.writeLong(r3)     // Catch: java.lang.Throwable -> L8d
            android.content.Context r0 = r5.f6723d     // Catch: java.lang.Throwable -> L8d
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L8d
            r4 = 0
            if (r3 == 0) goto L30
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8d
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8d
            int r0 = r0.versionCode     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8d
            goto L31
        L30:
            r0 = r4
        L31:
            r1.writeInt(r0)     // Catch: java.lang.Throwable -> L8d
            int r0 = r5.j     // Catch: java.lang.Throwable -> L8d
            r3 = 1
            r0 = r0 & r3
            if (r0 != 0) goto L45
            r1.writeByte(r4)     // Catch: java.lang.Throwable -> L8d
            byte[] r0 = r1.marshall()     // Catch: java.lang.Throwable -> L8d
            r1.recycle()
            return r0
        L45:
            android.content.Context r0 = r5.f6723d     // Catch: java.lang.Throwable -> L8d
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r0.nativeLibraryDir     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L5a
            r1.writeByte(r3)     // Catch: java.lang.Throwable -> L8d
            byte[] r0 = r1.marshall()     // Catch: java.lang.Throwable -> L8d
            r1.recycle()
            return r0
        L5a:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L8d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            java.io.File r0 = r4.getCanonicalFile()     // Catch: java.lang.Throwable -> L8d
            boolean r4 = r0.exists()     // Catch: java.lang.Throwable -> L8d
            if (r4 != 0) goto L74
            r1.writeByte(r3)     // Catch: java.lang.Throwable -> L8d
            byte[] r0 = r1.marshall()     // Catch: java.lang.Throwable -> L8d
            r1.recycle()
            return r0
        L74:
            r1.writeByte(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Throwable -> L8d
            r1.writeString(r2)     // Catch: java.lang.Throwable -> L8d
            long r2 = r0.lastModified()     // Catch: java.lang.Throwable -> L8d
            r1.writeLong(r2)     // Catch: java.lang.Throwable -> L8d
            byte[] r0 = r1.marshall()     // Catch: java.lang.Throwable -> L8d
            r1.recycle()
            return r0
        L8d:
            r0 = move-exception
            r1.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.a.i():byte[]");
    }

    @Override // com.facebook.soloader.q
    protected q.f m(byte b) throws IOException {
        return new C0331a(this);
    }
}
