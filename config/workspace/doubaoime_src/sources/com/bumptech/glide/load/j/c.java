package com.bumptech.glide.load.j;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.a<ByteBuffer> {
    @Override // com.bumptech.glide.load.a
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull com.bumptech.glide.load.f fVar) {
        try {
            com.bumptech.glide.util.a.e(byteBuffer, file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e2);
            }
            return false;
        }
    }
}
