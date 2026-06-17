package com.bytedance.feedbackerlib.model;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.ss.ttuploader.TTMediaDataReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public class h implements TTMediaDataReader {
    private final Context a;
    private final List<Uri> b;

    /* renamed from: c, reason: collision with root package name */
    private final a[] f4948c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentResolver f4949d;

    /* renamed from: e, reason: collision with root package name */
    private int f4950e = 0;

    private static class a {
        public final InputStream a;
        public final long b;

        /* renamed from: c, reason: collision with root package name */
        public int f4951c = 0;

        public a(@NonNull InputStream inputStream) {
            long j;
            this.a = inputStream;
            try {
                j = inputStream.available();
            } catch (IOException unused) {
                j = -1;
            }
            this.b = j;
        }
    }

    public h(@NonNull List<Uri> list, @NonNull Context context) {
        this.b = list;
        this.a = context;
        this.f4948c = new a[list.size()];
        this.f4949d = context.getContentResolver();
    }

    @Override // com.ss.ttuploader.TTMediaDataReader
    public int close(int i) {
        com.bytedance.feedbackerlib.a.D0(this.f4948c[i].a);
        return 0;
    }

    @Override // com.ss.ttuploader.TTMediaDataReader
    public long getValue(int i, int i2) {
        if (i2 != 0) {
            return 0L;
        }
        try {
            return this.f4948c[i].b;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.ss.ttuploader.TTMediaDataReader
    public int open(int i) {
        try {
            InputStream openInputStream = this.f4949d.openInputStream(this.b.get(i));
            if (openInputStream == null) {
                return -1;
            }
            this.f4948c[i] = new a(openInputStream);
            return 1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // com.ss.ttuploader.TTMediaDataReader
    public int read(int i, long j, byte[] bArr, int i2) {
        if (i >= 0) {
            a[] aVarArr = this.f4948c;
            if (i < aVarArr.length) {
                a aVar = aVarArr[i];
                if (j >= aVar.b) {
                    return 0;
                }
                long j2 = j - aVar.f4951c;
                if (j2 < 0) {
                    int i3 = this.f4950e;
                    this.f4950e = i3 + 1;
                    if (i3 >= 15) {
                        return -1;
                    }
                    com.bytedance.feedbackerlib.a.D0(aVarArr[i].a);
                    open(i);
                    return read(i, j, bArr, i2);
                }
                InputStream inputStream = aVar.a;
                for (long j3 = 0; j2 > j3; j3 = 0) {
                    try {
                        long skip = inputStream.skip(j2);
                        int i4 = (int) (aVar.f4951c + skip);
                        aVar.f4951c = i4;
                        if (i4 >= aVar.b) {
                            return 0;
                        }
                        j2 -= skip;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
                try {
                    int read = inputStream.read(bArr, 0, i2);
                    if (read <= 0) {
                        return -1;
                    }
                    aVar.f4951c += read;
                    return read;
                } catch (IOException unused2) {
                }
            }
        }
        return -1;
    }
}
