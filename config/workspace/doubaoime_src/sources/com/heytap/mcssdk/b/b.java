package com.heytap.mcssdk.b;

import com.heytap.mcssdk.constant.MessageConstant;
import com.heytap.msp.push.mode.BaseMode;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends BaseMode {
    private static final String a = "&";
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f6875c;

    /* renamed from: d, reason: collision with root package name */
    private String f6876d;

    /* renamed from: e, reason: collision with root package name */
    private String f6877e;

    /* renamed from: f, reason: collision with root package name */
    private int f6878f;

    /* renamed from: g, reason: collision with root package name */
    private String f6879g;
    private int h = -2;
    private String i;
    private String j;

    public static <T> String a(List<T> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append("&");
        }
        return sb.toString();
    }

    public String a() {
        return this.b;
    }

    public void a(int i) {
        this.f6878f = i;
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.f6875c;
    }

    public void b(int i) {
        this.h = i;
    }

    public void b(String str) {
        this.f6875c = str;
    }

    public String c() {
        return this.f6876d;
    }

    public void c(String str) {
        this.f6876d = str;
    }

    public String d() {
        return this.f6877e;
    }

    public void d(String str) {
        this.f6877e = str;
    }

    public int e() {
        return this.f6878f;
    }

    public void e(String str) {
        this.f6879g = str;
    }

    public String f() {
        return this.f6879g;
    }

    public void f(String str) {
        this.j = str;
    }

    public int g() {
        return this.h;
    }

    public void g(String str) {
        this.i = str;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return MessageConstant.MessageType.MESSAGE_CALL_BACK;
    }

    public String h() {
        return this.j;
    }

    public String i() {
        return this.i;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CallBackResult{, mRegisterID='");
        e.a.a.a.a.G0(M, this.f6876d, '\'', ", mSdkVersion='");
        e.a.a.a.a.G0(M, this.f6877e, '\'', ", mCommand=");
        M.append(this.f6878f);
        M.append('\'');
        M.append(", mContent='");
        e.a.a.a.a.G0(M, this.f6879g, '\'', ", mAppPackage=");
        e.a.a.a.a.G0(M, this.i, '\'', ", mResponseCode=");
        M.append(this.h);
        M.append(", miniProgramPkg=");
        return e.a.a.a.a.G(M, this.j, '}');
    }
}
