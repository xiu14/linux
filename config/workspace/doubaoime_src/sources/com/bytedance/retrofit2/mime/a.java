package com.bytedance.retrofit2.mime;

import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class a implements i {
    protected volatile boolean a;
    protected volatile String b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile String f6027c;

    @Override // com.bytedance.retrofit2.mime.i
    public String a() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.i
    public void b(OutputStream outputStream) throws IOException {
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String c() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String e() {
        return this.f6027c;
    }

    public String f() {
        return this.b;
    }

    public abstract TTRequestCompressManager.a g(String str, String str2, boolean z);

    public String h() {
        return this.f6027c;
    }

    public abstract boolean i();

    public boolean j() {
        return this.a;
    }

    @Override // com.bytedance.retrofit2.mime.i
    public long length() {
        return 0L;
    }
}
