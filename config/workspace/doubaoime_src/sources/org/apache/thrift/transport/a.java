package org.apache.thrift.transport;

import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public class a {
    protected String a;
    protected RandomAccessFile b;

    public a(String str) throws IOException {
        this.a = null;
        this.b = null;
        this.a = str;
        this.b = new RandomAccessFile(this.a, DownloadFileUtils.MODE_READ);
    }
}
