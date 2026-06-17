package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.util.j;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/* loaded from: classes.dex */
public class a implements com.bumptech.glide.load.g<ByteBuffer, GifDrawable> {

    /* renamed from: f, reason: collision with root package name */
    private static final C0039a f1772f = new C0039a();

    /* renamed from: g, reason: collision with root package name */
    private static final b f1773g = new b();
    private final Context a;
    private final List<ImageHeaderParser> b;

    /* renamed from: c, reason: collision with root package name */
    private final b f1774c;

    /* renamed from: d, reason: collision with root package name */
    private final C0039a f1775d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.gif.b f1776e;

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.resource.gif.a$a, reason: collision with other inner class name */
    static class C0039a {
        C0039a() {
        }
    }

    @VisibleForTesting
    static class b {
        private final Queue<com.bumptech.glide.n.d> a;

        b() {
            int i = j.f1862d;
            this.a = new ArrayDeque(0);
        }

        synchronized com.bumptech.glide.n.d a(ByteBuffer byteBuffer) {
            com.bumptech.glide.n.d poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new com.bumptech.glide.n.d();
            }
            poll.h(byteBuffer);
            return poll;
        }

        synchronized void b(com.bumptech.glide.n.d dVar) {
            dVar.a();
            this.a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.B.d dVar, com.bumptech.glide.load.engine.B.b bVar) {
        b bVar2 = f1773g;
        C0039a c0039a = f1772f;
        this.a = context.getApplicationContext();
        this.b = list;
        this.f1775d = c0039a;
        this.f1776e = new com.bumptech.glide.load.resource.gif.b(dVar, bVar);
        this.f1774c = bVar2;
    }

    @Nullable
    private d c(ByteBuffer byteBuffer, int i, int i2, com.bumptech.glide.n.d dVar, com.bumptech.glide.load.f fVar) {
        int i3 = com.bumptech.glide.util.f.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            com.bumptech.glide.n.c c2 = dVar.c();
            if (c2.b() > 0 && c2.c() == 0) {
                Bitmap.Config config = fVar.c(h.a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int d2 = d(c2, i, i2);
                C0039a c0039a = this.f1775d;
                com.bumptech.glide.load.resource.gif.b bVar = this.f1776e;
                Objects.requireNonNull(c0039a);
                com.bumptech.glide.n.e eVar = new com.bumptech.glide.n.e(bVar, c2, byteBuffer, d2);
                eVar.i(config);
                eVar.c();
                Bitmap b2 = eVar.b();
                if (b2 == null) {
                    return null;
                }
                d dVar2 = new d(new GifDrawable(this.a, eVar, com.bumptech.glide.load.k.c.c(), i, i2, b2));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    StringBuilder M = e.a.a.a.a.M("Decoded GIF from stream in ");
                    M.append(com.bumptech.glide.util.f.a(elapsedRealtimeNanos));
                    Log.v("BufferGifDecoder", M.toString());
                }
                return dVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder M2 = e.a.a.a.a.M("Decoded GIF from stream in ");
                M2.append(com.bumptech.glide.util.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", M2.toString());
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder M3 = e.a.a.a.a.M("Decoded GIF from stream in ");
                M3.append(com.bumptech.glide.util.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", M3.toString());
            }
        }
    }

    private static int d(com.bumptech.glide.n.c cVar, int i, int i2) {
        int min = Math.min(cVar.a() / i2, cVar.d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder O = e.a.a.a.a.O("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i, "x");
            O.append(i2);
            O.append("], actual dimens: [");
            O.append(cVar.d());
            O.append("x");
            O.append(cVar.a());
            O.append("]");
            Log.v("BufferGifDecoder", O.toString());
        }
        return max;
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return !((Boolean) fVar.c(h.b)).booleanValue() && com.bumptech.glide.load.c.g(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.g
    public v<GifDrawable> b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        com.bumptech.glide.n.d a = this.f1774c.a(byteBuffer2);
        try {
            return c(byteBuffer2, i, i2, a, fVar);
        } finally {
            this.f1774c.b(a);
        }
    }
}
