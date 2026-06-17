package com.bytedance.apm6.cpu.b;

import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Double> f3656f;
    private Map<String, Double> h;
    private Map<String, Double> i;
    private int k;
    private int l;
    private boolean a = false;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private double f3653c = 3.0d;

    /* renamed from: d, reason: collision with root package name */
    private double f3654d = 6.0d;

    /* renamed from: e, reason: collision with root package name */
    private double f3655e = 0.05d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3657g = false;
    private boolean j = true;
    private boolean m = false;

    @NonNull
    public Map<String, Double> a() {
        return this.h;
    }

    @NonNull
    public Map<String, Double> b() {
        return this.i;
    }

    public double c() {
        return this.f3653c;
    }

    public double d() {
        return this.f3654d;
    }

    public double e() {
        return this.f3655e;
    }

    public Map<String, Double> f() {
        return this.f3656f;
    }

    public int g() {
        return this.k;
    }

    public int h() {
        return this.l;
    }

    public boolean i() {
        return this.f3657g;
    }

    public boolean j() {
        return this.b;
    }

    public boolean k() {
        return this.m;
    }

    public boolean l() {
        return this.j;
    }

    public boolean m() {
        return this.a;
    }

    public void n(Map<String, Double> map) {
        this.h = map;
    }

    public void o(boolean z) {
        this.f3657g = z;
    }

    public void p(boolean z) {
        this.b = z;
    }

    public void q(boolean z) {
        this.m = z;
    }

    public void r(boolean z) {
        this.j = z;
    }

    public void s(Map<String, Double> map) {
        this.i = map;
    }

    public void t(double d2) {
        this.f3653c = d2;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CpuExceptionConfig{isOpen=");
        M.append(this.a);
        M.append(", isCollectMainThread=");
        M.append(this.b);
        M.append(", maxProcessBackCpuSpeed=");
        M.append(this.f3653c);
        M.append(", maxProcessForeCpuSpeed=");
        M.append(this.f3654d);
        M.append(", maxThreadCpuRate=");
        M.append(this.f3655e);
        M.append(", isCollectAllProcess=");
        M.append(this.f3657g);
        M.append(", backSceneMaxSpeedMap=");
        M.append(this.h);
        M.append(", foreSceneMaxSpeedMap=");
        M.append(this.i);
        M.append('}');
        return M.toString();
    }

    public void u(double d2) {
        this.f3654d = d2;
    }

    public void v(double d2) {
        this.f3655e = d2;
    }

    public void w(Map<String, Double> map) {
        this.f3656f = map;
    }

    public void x(boolean z) {
        this.a = z;
    }

    public void y(int i) {
        this.k = i;
    }

    public void z(int i) {
        this.l = i;
    }
}
