package com.facebook.imagepipeline.nativecode;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class WebpTranscoderImpl {
    @e.c.c.d.c
    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException;

    @e.c.c.d.c
    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException;
}
