package com.facebook.soloader;

import android.util.Log;
import com.facebook.soloader.q;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* loaded from: classes2.dex */
class p implements Runnable {
    final /* synthetic */ File a;
    final /* synthetic */ byte[] b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q.b f6718c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ File f6719d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f6720e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Boolean f6721f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ q f6722g;

    p(q qVar, File file, byte[] bArr, q.b bVar, File file2, k kVar, Boolean bool) {
        this.f6722g = qVar;
        this.a = file;
        this.b = bArr;
        this.f6718c = bVar;
        this.f6719d = file2;
        this.f6720e = kVar;
        this.f6721f = bool;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                Log.v("fb-UnpackingSoSource", "starting syncer worker");
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.a, "rw");
                try {
                    randomAccessFile.write(this.b);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    randomAccessFile.close();
                    randomAccessFile = new RandomAccessFile(new File(this.f6722g.a, "dso_manifest"), "rw");
                    try {
                        q.b bVar = this.f6718c;
                        Objects.requireNonNull(bVar);
                        randomAccessFile.writeByte(1);
                        randomAccessFile.writeInt(bVar.a.length);
                        int i = 0;
                        while (true) {
                            q.a[] aVarArr = bVar.a;
                            if (i >= aVarArr.length) {
                                randomAccessFile.close();
                                MinElf.d(this.f6722g.a);
                                q.q(this.f6719d, (byte) 1);
                                return;
                            } else {
                                randomAccessFile.writeUTF(aVarArr[i].a);
                                randomAccessFile.writeUTF(bVar.a[i].b);
                                i++;
                            }
                        }
                    } finally {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } finally {
                }
            } finally {
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + this.f6722g.a + " (from syncer thread)");
                this.f6720e.close();
            }
        } catch (IOException e2) {
            if (!this.f6721f.booleanValue()) {
                throw new RuntimeException(e2);
            }
        }
    }
}
