package com.ss.android.h;

import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public class a implements b {
    private final RandomAccessFile a;

    public a(File file) throws FileNotFoundException {
        this.a = new RandomAccessFile(file, DownloadFileUtils.MODE_READ);
    }

    @Override // com.ss.android.h.b
    public void close() throws IOException {
        this.a.close();
    }

    @Override // com.ss.android.h.b
    public long length() throws IOException {
        return this.a.length();
    }

    @Override // com.ss.android.h.b
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.a.read(bArr, i, i2);
    }

    @Override // com.ss.android.h.b
    public void seek(long j, long j2) throws IOException {
        this.a.seek(j);
    }
}
