package e.c.g;

/* loaded from: classes2.dex */
public final class c {
    public static final d a = new d("JPEG", "jpeg");
    public static final d b = new d("PNG", "png");

    /* renamed from: c, reason: collision with root package name */
    public static final d f9839c = new d("GIF", "gif");

    /* renamed from: d, reason: collision with root package name */
    public static final d f9840d = new d("BMP", "bmp");

    /* renamed from: e, reason: collision with root package name */
    public static final d f9841e = new d("ICO", "ico");

    /* renamed from: f, reason: collision with root package name */
    public static final d f9842f = new d("WEBP_SIMPLE", "webp");

    /* renamed from: g, reason: collision with root package name */
    public static final d f9843g = new d("WEBP_LOSSLESS", "webp");
    public static final d h = new d("WEBP_EXTENDED", "webp");
    public static final d i = new d("WEBP_EXTENDED_WITH_ALPHA", "webp");
    public static final d j = new d("WEBP_ANIMATED", "webp");
    public static final d k = new d("HEIF", "heif");
    public static final d l = new d("HEIF_FORMAT", "heic");
    public static final d m = new d("DNG", "dng");

    public static boolean a(d dVar) {
        d b2 = com.facebook.imageutils.c.b();
        return b2 != null && dVar == b2;
    }

    public static boolean b(d dVar) {
        d c2 = com.facebook.imageutils.c.c();
        return c2 != null && dVar == c2;
    }

    public static boolean c(d dVar) {
        return dVar == f9842f || dVar == f9843g || dVar == h || dVar == i;
    }
}
