package e.b.b.e.a.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private long a;
    private List<String> b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f9379c;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f9380d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9381e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9382f = true;

    /* renamed from: g, reason: collision with root package name */
    private long f9383g;
    private int h;
    private int i;
    private int j;
    private int k;

    public int a() {
        return this.k;
    }

    public List<String> b() {
        return this.f9379c;
    }

    public int c() {
        return this.i;
    }

    public int d() {
        return this.h;
    }

    public int e() {
        return this.j;
    }

    public long f() {
        return this.a;
    }

    public long g() {
        return this.f9383g;
    }

    public List<String> h() {
        return this.b;
    }

    public List<String> i() {
        return this.f9380d;
    }

    public boolean j() {
        return this.f9381e;
    }

    public void k(int i) {
        this.k = i;
    }

    public void l(boolean z) {
        this.f9381e = z;
    }

    public void m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f9379c = arrayList;
        arrayList.add(str);
    }

    public void n(int i) {
        this.i = i;
    }

    public void o(int i) {
        this.h = i;
    }

    public void p(int i) {
        this.j = i;
    }

    public void q(long j) {
        this.a = j;
    }

    public void r(long j) {
        this.f9383g = j;
    }

    public void s(List<String> list) {
        if (com.bytedance.android.input.k.b.a.e0(list)) {
            return;
        }
        this.b = list;
    }

    public void t(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f9380d = arrayList;
        arrayList.add(str);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("SlardarHandlerConfig{onceReportMaxSizeBytes=");
        M.append(this.a);
        M.append(", reportUrlList=");
        M.append(this.b);
        M.append(", exceptionUrl=");
        M.append(this.f9379c);
        M.append(", traceReportUrl=");
        M.append(this.f9380d);
        M.append(", isEncrypt=");
        M.append(this.f9381e);
        M.append(", isUploadInternalExcetpion=");
        M.append(this.f9382f);
        M.append(", reportInterval=");
        M.append(this.f9383g);
        M.append(", maxSizeMB=");
        M.append(this.h);
        M.append(", keepDays=");
        M.append(this.i);
        M.append(", maxSizeMBToday=");
        return e.a.a.a.a.C(M, this.j, '}');
    }

    public void u(boolean z) {
        this.f9382f = z;
    }
}
