package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.C.a;
import java.io.File;

/* loaded from: classes.dex */
class f<DataType> implements a.b {
    private final com.bumptech.glide.load.a<DataType> a;
    private final DataType b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.f f1638c;

    f(com.bumptech.glide.load.a<DataType> aVar, DataType datatype, com.bumptech.glide.load.f fVar) {
        this.a = aVar;
        this.b = datatype;
        this.f1638c = fVar;
    }

    @Override // com.bumptech.glide.load.engine.C.a.b
    public boolean a(@NonNull File file) {
        return this.a.a(this.b, file, this.f1638c);
    }
}
