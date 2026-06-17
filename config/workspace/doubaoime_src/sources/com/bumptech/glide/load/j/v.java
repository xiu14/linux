package com.bumptech.glide.load.j;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class v implements com.bumptech.glide.load.a<InputStream> {
    private final com.bumptech.glide.load.engine.B.b a;

    public v(com.bumptech.glide.load.engine.B.b bVar) {
        this.a = bVar;
    }

    @Override // com.bumptech.glide.load.a
    public boolean a(@NonNull InputStream inputStream, @NonNull File file, @NonNull com.bumptech.glide.load.f fVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream2 = inputStream;
        byte[] bArr = (byte[]) this.a.c(65536, byte[].class);
        boolean z = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream2 = fileOutputStream;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            this.a.put(bArr);
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.a.put(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                    z = true;
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
            } catch (IOException e3) {
                e = e3;
            }
            this.a.put(bArr);
            return z;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}
