package com.bytedance.crash.resource;

import java.io.File;

/* loaded from: classes.dex */
public class c {
    protected int a;
    protected int b;

    /* renamed from: f, reason: collision with root package name */
    protected int f4675f;

    /* renamed from: c, reason: collision with root package name */
    protected String f4672c = null;

    /* renamed from: d, reason: collision with root package name */
    protected String f4673d = null;

    /* renamed from: e, reason: collision with root package name */
    protected String f4674e = null;

    /* renamed from: g, reason: collision with root package name */
    protected File f4676g = null;

    public c(int i, int i2, int i3) {
        this.b = i2;
        this.a = i;
        this.f4675f = i3;
    }

    public String a() {
        String str;
        if (this.f4673d == null) {
            switch (this.f4675f) {
                case 0:
                    str = "npth_xasan";
                    break;
                case 1:
                    str = "npth_heap_tracker";
                    break;
                case 2:
                    str = "npth_fd_tracker";
                    break;
                case 3:
                    str = "npth_vm_monitor";
                    break;
                case 4:
                    str = "npth_tls_monitor";
                    break;
                case 5:
                    str = "npth_ref_monitor";
                    break;
                case 6:
                    str = "npth_setpriority";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            this.f4673d = str;
        }
        return this.f4673d;
    }

    public String toString() {
        throw null;
    }
}
