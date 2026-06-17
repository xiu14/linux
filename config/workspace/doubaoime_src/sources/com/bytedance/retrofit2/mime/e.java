package com.bytedance.retrofit2.mime;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class e implements i {
    private final List<a> a;
    private final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6032c;

    /* renamed from: d, reason: collision with root package name */
    private long f6033d;

    private static final class a {
        private final i a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final String f6034c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f6035d;

        /* renamed from: e, reason: collision with root package name */
        private final String f6036e;

        /* renamed from: f, reason: collision with root package name */
        private byte[] f6037f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f6038g;
        private boolean h;

        public a(String str, String str2, i iVar, String str3, boolean z) {
            this.b = str;
            this.f6034c = str2;
            this.a = iVar;
            this.f6035d = z;
            this.f6036e = str3;
        }

        private void a() {
            if (this.h) {
                return;
            }
            this.f6037f = e.g(this.f6036e, this.f6035d, false);
            String str = this.b;
            String str2 = this.f6034c;
            i iVar = this.a;
            try {
                StringBuilder sb = new StringBuilder(128);
                sb.append("Content-Disposition: form-data; name=\"");
                sb.append(str);
                String c2 = iVar.c();
                if (c2 != null) {
                    sb.append("\"; filename=\"");
                    sb.append(c2);
                }
                sb.append("\"\r\nContent-Type: ");
                sb.append(iVar.a());
                long length = iVar.length();
                if (length != -1) {
                    sb.append("\r\nContent-Length: ");
                    sb.append(length);
                }
                sb.append("\r\nContent-Transfer-Encoding: ");
                sb.append(str2);
                sb.append("\r\n\r\n");
                this.f6038g = sb.toString().getBytes("UTF-8");
                this.h = true;
            } catch (IOException e2) {
                throw new RuntimeException("Unable to write multipart header", e2);
            }
        }

        public long b() {
            a();
            if (this.a.length() > -1) {
                return this.a.length() + this.f6037f.length + this.f6038g.length;
            }
            return -1L;
        }

        public void c(OutputStream outputStream) throws IOException {
            a();
            outputStream.write(this.f6037f);
            outputStream.write(this.f6038g);
            this.a.b(outputStream);
        }
    }

    public e() {
        String uuid = UUID.randomUUID().toString();
        this.a = new LinkedList();
        this.f6032c = uuid;
        this.b = g(uuid, false, true);
        this.f6033d = r0.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] g(String str, boolean z, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder(str.length() + 8);
            if (!z) {
                sb.append("\r\n");
            }
            sb.append("--");
            sb.append(str);
            if (z2) {
                sb.append("--");
            }
            sb.append("\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e2) {
            throw new RuntimeException("Unable to write multipart boundary", e2);
        }
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String a() {
        StringBuilder M = e.a.a.a.a.M("multipart/form-data; boundary=");
        M.append(this.f6032c);
        return M.toString();
    }

    @Override // com.bytedance.retrofit2.mime.i
    public void b(OutputStream outputStream) throws IOException {
        Iterator<a> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().c(outputStream);
        }
        outputStream.write(this.b);
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String c() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String e() {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        if (this.f6033d == -1) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                b(byteArrayOutputStream);
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (Throwable unused) {
                byteArrayInputStream = null;
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
            byteArrayInputStream = null;
        }
        try {
            String b = b.b(byteArrayInputStream);
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused3) {
            }
            try {
                byteArrayInputStream.close();
            } catch (Throwable unused4) {
            }
            return b;
        } catch (Throwable unused5) {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused6) {
                }
            }
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable unused7) {
                }
            }
            return null;
        }
    }

    public void f(String str, String str2, i iVar) {
        Objects.requireNonNull(str, "Part name must not be null.");
        Objects.requireNonNull(str2, "Transfer encoding must not be null.");
        Objects.requireNonNull(iVar, "Part body must not be null.");
        a aVar = new a(str, str2, iVar, this.f6032c, this.a.isEmpty());
        this.a.add(aVar);
        long b = aVar.b();
        if (b == -1) {
            this.f6033d = -1L;
            return;
        }
        long j = this.f6033d;
        if (j != -1) {
            this.f6033d = j + b;
        }
    }

    public int h() {
        return this.a.size();
    }

    @Override // com.bytedance.retrofit2.mime.i
    public long length() {
        return this.f6033d;
    }
}
