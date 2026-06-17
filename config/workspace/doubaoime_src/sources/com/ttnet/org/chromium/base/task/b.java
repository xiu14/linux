package com.ttnet.org.chromium.base.task;

import java.util.ArrayDeque;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public abstract class b<Result> {
    public static final /* synthetic */ int a = 0;

    class a extends FutureTask<Result> {
        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                get();
                int i = b.a;
                throw null;
            } catch (InterruptedException e2) {
                com.ttnet.org.chromium.base.d.f("AsyncTask", e2.toString(), new Object[0]);
            } catch (CancellationException unused) {
                int i2 = b.a;
                throw null;
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
            }
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            new StringBuilder().append("AsyncTask.run: ");
            int i = b.a;
            throw null;
        }
    }

    static {
        new ArrayDeque();
    }
}
