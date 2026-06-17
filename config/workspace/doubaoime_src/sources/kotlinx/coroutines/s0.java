package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class s0 {
    private static final kotlinx.coroutines.N0.x a = new kotlinx.coroutines.N0.x("COMPLETING_ALREADY");
    public static final kotlinx.coroutines.N0.x b = new kotlinx.coroutines.N0.x("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final kotlinx.coroutines.N0.x f10308c = new kotlinx.coroutines.N0.x("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final kotlinx.coroutines.N0.x f10309d = new kotlinx.coroutines.N0.x("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final kotlinx.coroutines.N0.x f10310e = new kotlinx.coroutines.N0.x("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final X f10311f = new X(false);

    /* renamed from: g, reason: collision with root package name */
    private static final X f10312g = new X(true);

    public static final Object g(Object obj) {
        InterfaceC0807h0 interfaceC0807h0;
        C0809i0 c0809i0 = obj instanceof C0809i0 ? (C0809i0) obj : null;
        return (c0809i0 == null || (interfaceC0807h0 = c0809i0.a) == null) ? obj : interfaceC0807h0;
    }
}
