package okhttp3.internal.http2;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class p extends IOException {
    public final ErrorCode a;

    public p(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        this.a = errorCode;
    }
}
