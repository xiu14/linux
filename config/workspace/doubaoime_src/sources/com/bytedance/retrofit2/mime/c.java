package com.bytedance.retrofit2.mime;

import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.ss.android.message.log.PushLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c extends com.bytedance.retrofit2.mime.a {
    private static AtomicReference<a> h = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    ByteArrayOutputStream f6028d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6029e;

    /* renamed from: f, reason: collision with root package name */
    private a f6030f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, List<String>> f6031g;

    public interface a {
        a a();

        Map<String, List<String>> b(Request request);
    }

    public c() {
        this.f6028d = new ByteArrayOutputStream();
        this.f6031g = new HashMap();
        this.f6029e = false;
        a aVar = h.get();
        this.f6030f = aVar != null ? aVar.a() : null;
    }

    private void m(String str, boolean z, String str2, boolean z2) throws IOException {
        if (this.f6028d.size() > 0) {
            this.f6028d.write(38);
        }
        if (z) {
            str = URLEncoder.encode(str, "UTF-8");
        }
        if (z2) {
            str2 = URLEncoder.encode(str2, "UTF-8");
        }
        this.f6028d.write(str.getBytes("UTF-8"));
        this.f6028d.write(61);
        this.f6028d.write(str2.getBytes("UTF-8"));
    }

    @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
    public String a() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
    public void b(OutputStream outputStream) throws IOException {
        outputStream.write(this.f6028d.toByteArray());
    }

    @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
    public String c() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
    public String e() {
        this.f6027c = b.c(this.f6028d.toByteArray());
        return this.f6027c;
    }

    @Override // com.bytedance.retrofit2.mime.a
    public TTRequestCompressManager.a g(String str, String str2, boolean z) {
        byte[] byteArray = this.f6028d.toByteArray();
        if (byteArray == null) {
            return null;
        }
        TTRequestCompressManager.a c2 = TTRequestCompressManager.c(byteArray, byteArray.length, str, str2, z);
        if (c2 != null && c2.a != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(c2.a.length);
            this.f6028d = byteArrayOutputStream;
            byte[] bArr = c2.a;
            byteArrayOutputStream.write(bArr, 0, bArr.length);
            this.b = c2.b;
        }
        return c2;
    }

    @Override // com.bytedance.retrofit2.mime.a
    public boolean i() {
        byte[] a2;
        byte[] byteArray = this.f6028d.toByteArray();
        if (byteArray == null || byteArray.length > 102400 || (a2 = EncryptorUtil.a(byteArray, byteArray.length)) == null) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(a2.length);
        this.f6028d = byteArrayOutputStream;
        byteArrayOutputStream.write(a2, 0, a2.length);
        this.a = true;
        return true;
    }

    public void k(String str, boolean z, String str2, boolean z2) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(str2, PushLog.KEY_VALUE);
        if (this.f6029e || this.f6030f != null) {
            if (this.f6031g.containsKey(str)) {
                this.f6031g.get(str).add(str2);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str2);
                this.f6031g.put(str, arrayList);
            }
        }
        if (this.f6030f == null) {
            try {
                m(str, z, str2, z2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public void l(Request request) {
        a aVar = this.f6030f;
        if (aVar == null) {
            return;
        }
        Map<String, List<String>> b = aVar.b(request);
        this.f6031g = b;
        if (b == null || b.isEmpty()) {
            return;
        }
        for (Map.Entry<String, List<String>> entry : this.f6031g.entrySet()) {
            Iterator<String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                try {
                    m(entry.getKey(), true, it2.next(), true);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
    public long length() {
        return this.f6028d.size();
    }

    public c(boolean z) {
        this.f6028d = new ByteArrayOutputStream();
        this.f6031g = new HashMap();
        this.f6029e = z;
        a aVar = h.get();
        this.f6030f = aVar != null ? aVar.a() : null;
    }
}
