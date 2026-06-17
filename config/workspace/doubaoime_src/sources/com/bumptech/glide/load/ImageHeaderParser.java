package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int ordinal = ordinal();
            return ordinal == 5 || ordinal == 6 || ordinal == 7;
        }
    }

    @NonNull
    ImageType a(@NonNull ByteBuffer byteBuffer) throws IOException;

    int b(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.engine.B.b bVar) throws IOException;

    @NonNull
    ImageType c(@NonNull InputStream inputStream) throws IOException;

    int d(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.engine.B.b bVar) throws IOException;
}
