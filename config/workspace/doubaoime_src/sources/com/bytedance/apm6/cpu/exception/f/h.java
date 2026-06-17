package com.bytedance.apm6.cpu.exception.f;

import com.bytedance.apm6.cpu.exception.StateType;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
class h extends com.bytedance.apm6.cpu.exception.a {
    private List<Double> b;

    /* renamed from: c, reason: collision with root package name */
    private List<com.bytedance.apm6.cpu.exception.e> f3709c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.bytedance.apm6.cpu.exception.e> f3710d;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.apm6.util.timetask.a f3711e;

    /* renamed from: f, reason: collision with root package name */
    private com.bytedance.apm6.cpu.b.c f3712f;

    /* renamed from: g, reason: collision with root package name */
    private long f3713g;
    private boolean h;

    class a extends com.bytedance.apm6.util.timetask.a {
        a(long j, long j2) {
            super(j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            h.f(h.this);
        }
    }

    public h(com.bytedance.apm6.cpu.exception.d dVar) {
        super(dVar);
        this.f3713g = 0L;
        this.b = new CopyOnWriteArrayList();
        this.f3710d = new CopyOnWriteArrayList();
        this.f3709c = new CopyOnWriteArrayList();
        this.f3711e = new a(0L, 1000L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:140|(2:147|136)|142|143|145|136) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.String[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void f(com.bytedance.apm6.cpu.exception.f.h r21) {
        /*
            Method dump skipped, instructions count: 1656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.cpu.exception.f.h.f(com.bytedance.apm6.cpu.exception.f.h):void");
    }

    private void g(com.bytedance.apm6.cpu.exception.e eVar, Thread thread, StringBuilder sb) {
        int i = 0;
        for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
            i++;
            sb.append("\tat ");
            sb.append(stackTraceElement.getClassName());
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
            if (i > 40) {
                break;
            }
        }
        eVar.l(sb.toString());
        eVar.p(String.format("%.2f", Double.valueOf(eVar.a() / this.f3712f.e())));
        this.f3710d.add(eVar);
        sb.setLength(0);
    }

    private void h() {
        this.b.clear();
        this.f3710d.clear();
        this.f3709c.clear();
        this.f3713g = 0L;
        com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.CPU).b(this.f3711e);
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void b(com.bytedance.apm6.cpu.b.c cVar, boolean z) {
        super.b(cVar, z);
        this.f3712f = cVar;
        this.f3713g = System.currentTimeMillis();
        this.h = z;
        com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.CPU).c(this.f3711e);
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void c(boolean z) {
        super.c(z);
        h();
        this.a.e();
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void d() {
        super.d();
        h();
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public StateType e() {
        return StateType.THREAD_DETECT;
    }
}
