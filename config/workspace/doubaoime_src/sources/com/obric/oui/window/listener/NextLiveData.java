package com.obric.oui.window.listener;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class NextLiveData<T> extends MutableLiveData<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Handler f8177c = new Handler(Looper.getMainLooper());
    private int a = -1;
    private final Map<Observer<? super T>, NextLiveData<T>.b<? super T>> b = new HashMap();

    class a implements Runnable {
        final /* synthetic */ Object a;

        a(Object obj) {
            this.a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            NextLiveData.this.setValue(this.a);
        }
    }

    private class b<R> implements Observer<R> {
        private int a;
        private Observer<R> b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8178c;

        b(int i, Observer<R> observer, boolean z) {
            this.a = i;
            this.b = observer;
            this.f8178c = z;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable R r) {
            if (this.f8178c || this.a < NextLiveData.this.a) {
                this.b.onChanged(r);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<? super T> observer) {
        if (this.b.containsKey(observer)) {
            return;
        }
        NextLiveData<T>.b<? super T> bVar = new b<>(this.a, observer, false);
        this.b.put(observer, bVar);
        super.observe(lifecycleOwner, bVar);
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public void observeForever(@NonNull Observer<? super T> observer) {
        if (this.b.containsKey(observer)) {
            return;
        }
        NextLiveData<T>.b<? super T> bVar = new b<>(this.a, observer, false);
        this.b.put(observer, bVar);
        super.observeForever(bVar);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(@Nullable T t) {
        f8177c.post(new a(t));
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(@NonNull Observer<? super T> observer) {
        NextLiveData<T>.b<? super T> remove = this.b.remove(observer);
        if (remove != null) {
            super.removeObserver(remove);
            return;
        }
        if (observer instanceof b) {
            Observer<? super T> observer2 = null;
            Iterator<Map.Entry<Observer<? super T>, NextLiveData<T>.b<? super T>>> it2 = this.b.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<Observer<? super T>, NextLiveData<T>.b<? super T>> next = it2.next();
                if (observer.equals(next.getValue())) {
                    observer2 = next.getKey();
                    super.removeObserver(observer);
                    break;
                }
            }
            if (observer2 != null) {
                this.b.remove(observer2);
            }
        }
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    public void setValue(@Nullable T t) {
        this.a++;
        super.setValue(t);
    }
}
