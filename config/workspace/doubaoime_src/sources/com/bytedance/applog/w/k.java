package com.bytedance.applog.w;

import java.util.List;

/* loaded from: classes.dex */
public class k extends b {

    /* renamed from: d, reason: collision with root package name */
    private static final com.bytedance.applog.w.a<e> f3907d = new a();

    static class a extends com.bytedance.applog.w.a<e> {
        a() {
        }
    }

    public static e z() {
        return f3907d.a(new Object[0]);
    }

    @Override // com.bytedance.applog.w.e
    public void a(int i, List<String> list, String str, Object... objArr) {
        q(i, list, str, null, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void b(String str, Object... objArr) {
        k(0, null, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void c(int i, String str, Object... objArr) {
        m(i, null, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void e(String str, Object... objArr) {
        t(null, str, null, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void f(List<String> list, String str, Object... objArr) {
        k(0, list, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void g(int i, String str, Object... objArr) {
        j(i, null, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void h(String str, Object... objArr) {
        j(0, null, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void i(String str, Throwable th, Object... objArr) {
        t(null, str, th, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void j(int i, List<String> list, String str, Object... objArr) {
        y(i, 1, list, null, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void k(int i, List<String> list, String str, Object... objArr) {
        y(i, 3, list, null, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void l(List<String> list, String str, Object... objArr) {
        t(list, str, null, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void m(int i, List<String> list, String str, Object... objArr) {
        y(i, 2, list, null, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void n(List<String> list, String str, Object... objArr) {
        j(0, list, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void o(String str, Object... objArr) {
        m(0, null, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void p(int i, String str, Object... objArr) {
        a(i, null, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void q(int i, List<String> list, String str, Throwable th, Object... objArr) {
        y(i, 4, list, th, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void r(int i, String str, Object... objArr) {
        k(i, null, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void s(List<String> list, String str, Object... objArr) {
        m(0, list, str, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void t(List<String> list, String str, Throwable th, Object... objArr) {
        q(0, list, str, th, objArr);
    }

    @Override // com.bytedance.applog.w.e
    public void u(int i, String str, Throwable th, Object... objArr) {
        q(i, null, str, th, objArr);
    }
}
