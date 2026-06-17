package com.bytedance.ttnet.diagnosis;

import com.bytedance.frameworks.baselib.network.http.cronet.b.a;
import java.util.List;

/* loaded from: classes2.dex */
class b implements IDiagnosisRequest {
    private IDiagnosisCallback a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f6210c;

    /* renamed from: d, reason: collision with root package name */
    private int f6211d;

    /* renamed from: e, reason: collision with root package name */
    private int f6212e;

    /* renamed from: f, reason: collision with root package name */
    private int f6213f;
    private String i;
    private com.bytedance.frameworks.baselib.network.http.cronet.b.a k;
    private a.InterfaceC0255a j = new a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f6214g = false;
    private boolean h = false;

    class a implements a.InterfaceC0255a {
        a() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.cronet.b.a.InterfaceC0255a
        public void a(String str) {
            if (b.this.a != null) {
                b.this.a.onDiagnosisComplete(str);
            }
        }
    }

    public b(int i, List<String> list, int i2, int i3, int i4) throws Exception {
        Class<?> cls;
        this.b = i;
        this.f6210c = list;
        this.f6211d = i2;
        this.f6212e = i3;
        this.f6213f = i4;
        if (this.k == null) {
            try {
                cls = Class.forName("org.chromium.diagnosis.CronetDiagnosisRequestImpl");
            } catch (Throwable unused) {
                cls = null;
            }
            if (cls == null) {
                throw new ClassNotFoundException("org.chromium.diagnosis.CronetDiagnosisRequestImpl class not found");
            }
            Class<?> cls2 = Integer.TYPE;
            Object newInstance = cls.getDeclaredConstructor(a.InterfaceC0255a.class, cls2, List.class, cls2, cls2, cls2).newInstance(this.j, Integer.valueOf(this.b), this.f6210c, Integer.valueOf(this.f6211d), Integer.valueOf(this.f6212e), Integer.valueOf(this.f6213f));
            if (newInstance instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.a) {
                this.k = (com.bytedance.frameworks.baselib.network.http.cronet.b.a) newInstance;
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void cancel() {
        synchronized (this) {
            if (this.f6214g && !this.h) {
                this.k.cancel();
                this.h = true;
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void doExtraCommand(String str, String str2) {
        synchronized (this) {
            if (this.f6214g) {
                this.k.doExtraCommand(str, str2);
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void setUserExtraInfo(String str) {
        synchronized (this) {
            this.i = str;
            doExtraCommand("extra_info", str);
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void start(IDiagnosisCallback iDiagnosisCallback) {
        synchronized (this) {
            if (this.f6214g) {
                return;
            }
            this.a = iDiagnosisCallback;
            this.k.start();
            this.f6214g = true;
            String str = this.i;
            if (str != null && !str.isEmpty()) {
                doExtraCommand("extra_info", this.i);
            }
        }
    }
}
