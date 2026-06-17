package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.v;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.h<GifDrawable> {
    @Override // com.bumptech.glide.load.a
    public boolean a(@NonNull Object obj, @NonNull File file, @NonNull com.bumptech.glide.load.f fVar) {
        try {
            com.bumptech.glide.util.a.e(((GifDrawable) ((v) obj).get()).b(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }

    @Override // com.bumptech.glide.load.h
    @NonNull
    public EncodeStrategy b(@NonNull com.bumptech.glide.load.f fVar) {
        return EncodeStrategy.SOURCE;
    }
}
