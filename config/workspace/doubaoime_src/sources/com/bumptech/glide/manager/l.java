package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.manager.n;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class l {
    final Map<Lifecycle, com.bumptech.glide.k> a = new HashMap();

    @NonNull
    private final n.b b;

    class a implements k {
        final /* synthetic */ Lifecycle a;

        a(Lifecycle lifecycle) {
            this.a = lifecycle;
        }

        @Override // com.bumptech.glide.manager.k
        public void f() {
        }

        @Override // com.bumptech.glide.manager.k
        public void onDestroy() {
            l.this.a.remove(this.a);
        }

        @Override // com.bumptech.glide.manager.k
        public void onStart() {
        }
    }

    private final class b implements o {
        private final FragmentManager a;

        b(FragmentManager fragmentManager) {
            this.a = fragmentManager;
        }
    }

    l(@NonNull n.b bVar) {
        this.b = bVar;
    }

    com.bumptech.glide.k a(Context context, com.bumptech.glide.c cVar, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        com.bumptech.glide.util.j.a();
        com.bumptech.glide.util.j.a();
        com.bumptech.glide.k kVar = this.a.get(lifecycle);
        if (kVar != null) {
            return kVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        com.bumptech.glide.k a2 = this.b.a(cVar, lifecycleLifecycle, new b(fragmentManager), context);
        this.a.put(lifecycle, a2);
        lifecycleLifecycle.a(new a(lifecycle));
        if (z) {
            a2.onStart();
        }
        return a2;
    }
}
