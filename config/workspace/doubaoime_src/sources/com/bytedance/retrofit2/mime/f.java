package com.bytedance.retrofit2.mime;

import android.text.TextUtils;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class f extends a implements h {

    /* renamed from: d, reason: collision with root package name */
    private final String f6039d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f6040e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6041f;

    public f(String str, byte[] bArr, String... strArr) {
        String str2 = strArr.length > 0 ? strArr[0] : null;
        str = str == null ? TextUtils.isEmpty(str2) ? "application/unknown" : "application/octet-stream" : str;
        Objects.requireNonNull(bArr, "bytes null");
        this.f6039d = str;
        this.f6040e = bArr;
        this.f6041f = str2;
    }

    @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
    public String a() {
        return this.f6039d;
    }

    @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
    public void b(OutputStream outputStream) throws IOException {
        outputStream.write(this.f6040e);
    }

    @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
    public String c() {
        if (TextUtils.isEmpty(this.f6041f)) {
            return null;
        }
        return this.f6041f;
    }

    @Override // com.bytedance.retrofit2.mime.h
    public InputStream d() throws IOException {
        return new ByteArrayInputStream(this.f6040e);
    }

    @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
    public String e() {
        byte[] bArr = this.f6040e;
        if (bArr == null) {
            return null;
        }
        this.f6027c = b.c(bArr);
        return this.f6027c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return Arrays.equals(this.f6040e, fVar.f6040e) && this.f6039d.equals(fVar.f6039d);
    }

    @Override // com.bytedance.retrofit2.mime.a
    public TTRequestCompressManager.a g(String str, String str2, boolean z) {
        byte[] bArr;
        byte[] bArr2 = this.f6040e;
        if (bArr2 == null) {
            return null;
        }
        TTRequestCompressManager.a c2 = TTRequestCompressManager.c(bArr2, bArr2.length, str, str2, z);
        if (c2 != null && (bArr = c2.a) != null) {
            int length = this.f6040e.length;
            this.f6040e = bArr;
            this.b = c2.b;
        }
        return c2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6040e) + (this.f6039d.hashCode() * 31);
    }

    @Override // com.bytedance.retrofit2.mime.a
    public boolean i() {
        byte[] a;
        byte[] bArr = this.f6040e;
        if (bArr == null || bArr.length > 102400 || (a = EncryptorUtil.a(bArr, bArr.length)) == null) {
            return false;
        }
        this.f6040e = a;
        this.a = true;
        return true;
    }

    public byte[] k() {
        return this.f6040e;
    }

    @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
    public long length() {
        return this.f6040e.length;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("TypedByteArray[length=");
        M.append(length());
        M.append("]");
        return M.toString();
    }
}
