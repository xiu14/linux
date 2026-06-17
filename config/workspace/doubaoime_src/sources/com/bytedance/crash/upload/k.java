package com.bytedance.crash.upload;

/* loaded from: classes.dex */
public class k {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f4704c;

    /* renamed from: d, reason: collision with root package name */
    private int f4705d;

    /* renamed from: e, reason: collision with root package name */
    private int f4706e;

    public k(int i, int i2, int i3, int i4, int i5) {
        this.a = 50;
        this.b = 100;
        this.f4704c = 100;
        this.f4705d = 5;
        this.f4706e = 2;
        if (i > 0) {
            this.a = i;
        }
        if (i2 > 0) {
            this.b = i2;
        }
        if (i3 > 0) {
            this.f4704c = i3;
        }
        if (i4 > 0) {
            this.f4705d = i4;
        }
        if (i5 > 0) {
            this.f4706e = i5;
        }
    }

    public int a() {
        return this.f4704c;
    }

    public int b() {
        return this.f4705d;
    }

    public int c() {
        return this.f4706e;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("UploadLimitConfig{crashLimitIssue=");
        M.append(this.a);
        M.append(", crashLimitAll=");
        M.append(this.b);
        M.append(", exceptionAllLimit=");
        M.append(this.f4704c);
        M.append(", exceptionMsgLimit=");
        M.append(this.f4705d);
        M.append(", exceptionStackLimit=");
        M.append(this.f4706e);
        M.append(", isNoLimit=");
        M.append(false);
        M.append('}');
        return M.toString();
    }
}
