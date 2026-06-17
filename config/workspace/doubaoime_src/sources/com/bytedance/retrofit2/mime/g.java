package com.bytedance.retrofit2.mime;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public class g implements h, i {
    private final String a;
    private final File b;

    public g(String str, File file) {
        Objects.requireNonNull(file, "file");
        this.a = "application/octet-stream";
        this.b = file;
    }

    @Override // com.bytedance.retrofit2.mime.h
    public String a() {
        return this.a;
    }

    @Override // com.bytedance.retrofit2.mime.i
    public void b(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.b);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            } finally {
                fileInputStream.close();
            }
        }
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String c() {
        return this.b.getName();
    }

    @Override // com.bytedance.retrofit2.mime.h
    public InputStream d() throws IOException {
        return new FileInputStream(this.b);
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.b.equals(((g) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // com.bytedance.retrofit2.mime.h
    public long length() {
        return this.b.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.getAbsolutePath());
        sb.append(" (");
        return e.a.a.a.a.J(sb, this.a, ")");
    }
}
