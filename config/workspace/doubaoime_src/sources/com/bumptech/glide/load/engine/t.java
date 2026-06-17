package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class t<Data, ResourceType, Transcode> {
    private final Pools.Pool<List<Throwable>> a;
    private final List<? extends i<Data, ResourceType, Transcode>> b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1679c;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.a = pool;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.b = list;
        StringBuilder M = e.a.a.a.a.M("Failed LoadPath{");
        M.append(cls.getSimpleName());
        M.append("->");
        M.append(cls2.getSimpleName());
        M.append("->");
        M.append(cls3.getSimpleName());
        M.append("}");
        this.f1679c = M.toString();
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, @NonNull com.bumptech.glide.load.f fVar, int i, int i2, i.a<ResourceType> aVar) throws q {
        List<Throwable> acquire = this.a.acquire();
        Objects.requireNonNull(acquire, "Argument must not be null");
        List<Throwable> list = acquire;
        try {
            int size = this.b.size();
            v<Transcode> vVar = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    vVar = this.b.get(i3).a(eVar, i, i2, fVar, aVar);
                } catch (q e2) {
                    list.add(e2);
                }
                if (vVar != null) {
                    break;
                }
            }
            if (vVar != null) {
                return vVar;
            }
            throw new q(this.f1679c, new ArrayList(list));
        } finally {
            this.a.release(list);
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("LoadPath{decodePaths=");
        M.append(Arrays.toString(this.b.toArray()));
        M.append('}');
        return M.toString();
    }
}
