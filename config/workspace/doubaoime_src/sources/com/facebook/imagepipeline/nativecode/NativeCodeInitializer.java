package com.facebook.imagepipeline.nativecode;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class NativeCodeInitializer {
    @e.c.c.d.c
    public static void init(Context context) throws IOException {
        SoLoader.init(context, 0);
    }
}
