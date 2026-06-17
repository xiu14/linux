package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.DecodeJob;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class i<DataType, ResourceType, Transcode> {
    private final Class<DataType> a;
    private final List<? extends com.bumptech.glide.load.g<DataType, ResourceType>> b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.k.g.e<ResourceType, Transcode> f1644c;

    /* renamed from: d, reason: collision with root package name */
    private final Pools.Pool<List<Throwable>> f1645d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1646e;

    interface a<ResourceType> {
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.g<DataType, ResourceType>> list, com.bumptech.glide.load.k.g.e<ResourceType, Transcode> eVar, Pools.Pool<List<Throwable>> pool) {
        this.a = cls;
        this.b = list;
        this.f1644c = eVar;
        this.f1645d = pool;
        StringBuilder M = e.a.a.a.a.M("Failed DecodePath{");
        M.append(cls.getSimpleName());
        M.append("->");
        M.append(cls2.getSimpleName());
        M.append("->");
        M.append(cls3.getSimpleName());
        M.append("}");
        this.f1646e = M.toString();
    }

    @NonNull
    private v<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i, int i2, @NonNull com.bumptech.glide.load.f fVar, List<Throwable> list) throws q {
        int size = this.b.size();
        v<ResourceType> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            com.bumptech.glide.load.g<DataType, ResourceType> gVar = this.b.get(i3);
            try {
                if (gVar.a(eVar.a(), fVar)) {
                    vVar = gVar.b(eVar.a(), i, i2, fVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + gVar, e2);
                }
                list.add(e2);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f1646e, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i, int i2, @NonNull com.bumptech.glide.load.f fVar, a<ResourceType> aVar) throws q {
        List<Throwable> acquire = this.f1645d.acquire();
        Objects.requireNonNull(acquire, "Argument must not be null");
        List<Throwable> list = acquire;
        try {
            v<ResourceType> b = b(eVar, i, i2, fVar, list);
            this.f1645d.release(list);
            return this.f1644c.a(((DecodeJob.b) aVar).a(b), fVar);
        } catch (Throwable th) {
            this.f1645d.release(list);
            throw th;
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("DecodePath{ dataClass=");
        M.append(this.a);
        M.append(", decoders=");
        M.append(this.b);
        M.append(", transcoder=");
        M.append(this.f1644c);
        M.append('}');
        return M.toString();
    }
}
