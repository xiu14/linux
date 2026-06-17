package com.bumptech.glide.load.k.f;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.g;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class a implements g<File, File> {
    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@NonNull File file, @NonNull f fVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public v<File> b(@NonNull File file, int i, int i2, @NonNull f fVar) throws IOException {
        return new b(file);
    }
}
