package com.bytedance.apm6.cpu.exception;

/* loaded from: classes.dex */
public abstract class a {
    protected d a;

    public a(d dVar) {
        this.a = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str) {
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("[");
            M.append(e());
            M.append("]: ");
            M.append(str);
            e.b.b.n.g.b.d("APM-CPU", M.toString());
        }
    }

    public void b(com.bytedance.apm6.cpu.b.c cVar, boolean z) {
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("enter : ");
            M.append(e());
            e.b.b.n.g.b.d("APM-CPU", M.toString());
        }
    }

    public void c(boolean z) {
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("onLifeCycleChange when state is : ");
            M.append(e());
            e.b.b.n.g.b.d("APM-CPU", M.toString());
        }
    }

    public void d() {
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("stop detect when state is : ");
            M.append(e());
            e.b.b.n.g.b.d("APM-CPU", M.toString());
        }
    }

    public abstract StateType e();
}
