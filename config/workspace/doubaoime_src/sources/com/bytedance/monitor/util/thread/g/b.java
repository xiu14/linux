package com.bytedance.monitor.util.thread.g;

import android.util.Pair;
import com.bytedance.monitor.util.thread.e;
import com.bytedance.monitor.util.thread.f;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b extends ScheduledThreadPoolExecutor implements c {
    private f a;
    private final Map<Integer, List<ScheduledFuture<?>>> b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<ScheduledFuture<?>, Pair<Integer, Boolean>> f5485c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f5486d;

    /* renamed from: e, reason: collision with root package name */
    private ThreadPoolExecutor f5487e;

    class a implements InvocationHandler {
        final /* synthetic */ ExecutorService a;

        a(ExecutorService executorService) {
            this.a = executorService;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object invoke = method.invoke(this.a, objArr);
            Objects.requireNonNull(b.this);
            return invoke;
        }
    }

    public b(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
        this.b = new ConcurrentHashMap();
        this.f5485c = new ConcurrentHashMap();
    }

    private boolean a(e eVar) {
        boolean z = false;
        if (eVar == null) {
            return false;
        }
        int hashCode = eVar.hashCode();
        List<ScheduledFuture<?>> list = this.b.get(Integer.valueOf(hashCode));
        StringBuilder M = e.a.a.a.a.M("z-debug scheduledFutures in ?");
        M.append(list != null);
        b(M.toString());
        if (list != null && !list.isEmpty()) {
            for (ScheduledFuture<?> scheduledFuture : list) {
                if (!scheduledFuture.isCancelled()) {
                    if (scheduledFuture.cancel(true)) {
                        z = true;
                    }
                    e(Integer.valueOf(hashCode), scheduledFuture);
                }
            }
        }
        return z;
    }

    private void b(String str) {
        com.bytedance.monitor.util.thread.c.b(this.a, "ApmInnerThreadPool", str);
    }

    private void e(Integer num, ScheduledFuture scheduledFuture) {
        List<ScheduledFuture<?>> list = this.b.get(num);
        if (list != null) {
            list.remove(scheduledFuture);
            if (list.isEmpty()) {
                this.b.remove(num);
            }
        }
        this.f5485c.remove(scheduledFuture);
    }

    private void g(ScheduledFuture<?> scheduledFuture, int i, boolean z) {
        List<ScheduledFuture<?>> list = this.b.get(Integer.valueOf(i));
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.b.put(Integer.valueOf(i), list);
        }
        list.add(scheduledFuture);
        this.f5485c.put(scheduledFuture, new Pair<>(Integer.valueOf(i), Boolean.valueOf(z)));
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        ScheduledFuture scheduledFuture;
        Pair<Integer, Boolean> pair;
        Object obj;
        super.afterExecute(runnable, th);
        if (!(runnable instanceof ScheduledFuture) || (pair = this.f5485c.get((scheduledFuture = (ScheduledFuture) runnable))) == null || (obj = pair.first) == null) {
            return;
        }
        int intValue = ((Integer) obj).intValue();
        Boolean bool = (Boolean) pair.second;
        if (bool == null || bool.booleanValue()) {
            return;
        }
        e(Integer.valueOf(intValue), scheduledFuture);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
    }

    public void c(e eVar) {
        submit(eVar);
    }

    public void d(e eVar, long j) {
        g(schedule(eVar, j, TimeUnit.MILLISECONDS), eVar.hashCode(), false);
    }

    public void f(e eVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f5487e;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.remove(eVar);
        }
        a(eVar);
    }

    public void h(e eVar, long j, long j2) {
        a(eVar);
        g(scheduleWithFixedDelay(eVar, j, j2, TimeUnit.MILLISECONDS), eVar.hashCode(), true);
    }

    public void i(ExecutorService executorService) {
        if (executorService == null) {
            this.f5486d = null;
            this.f5487e = null;
        } else {
            if (executorService instanceof ThreadPoolExecutor) {
                this.f5487e = (ThreadPoolExecutor) executorService;
            }
            this.f5486d = (ExecutorService) Proxy.newProxyInstance(executorService.getClass().getClassLoader(), new Class[]{ExecutorService.class}, new a(executorService));
        }
    }

    public void j(f fVar) {
        this.a = fVar;
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        ExecutorService executorService = this.f5486d;
        return executorService != null ? executorService.submit(runnable) : super.submit(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void terminated() {
        super.terminated();
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        ExecutorService executorService = this.f5486d;
        if (executorService != null) {
            return executorService.submit(callable);
        }
        return super.submit(callable);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        ExecutorService executorService = this.f5486d;
        if (executorService != null) {
            return executorService.submit(runnable, t);
        }
        return super.submit(runnable, t);
    }
}
