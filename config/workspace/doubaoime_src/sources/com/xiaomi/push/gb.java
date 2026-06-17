package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.net.UnknownHostException;
import java.util.Objects;

/* loaded from: classes2.dex */
final class gb {

    static class a {
        fx a;

        /* renamed from: a, reason: collision with other field name */
        String f461a;

        a() {
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m404a(Exception exc) {
        Objects.requireNonNull(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Throwable] */
    static a b(Exception exc) {
        Throwable cause;
        m404a(exc);
        boolean z = exc instanceof gx;
        Exception exc2 = exc;
        if (z) {
            gx gxVar = (gx) exc;
            exc2 = exc;
            if (gxVar.a() != null) {
                exc2 = gxVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a2 = gr.a(exc2);
        String str = exc2.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a2 != 0) {
            fx a3 = fx.a(fx.CONN_SUCCESS.a() + a2);
            aVar.a = a3;
            if (a3 == fx.CONN_BOSH_ERR && (cause = exc2.getCause()) != null && (cause instanceof UnknownHostException)) {
                aVar.a = fx.CONN_BOSH_UNKNOWNHOST;
            }
        } else {
            aVar.a = fx.CONN_XMPP_ERR;
        }
        fx fxVar = aVar.a;
        if (fxVar == fx.CONN_TCP_ERR_OTHER || fxVar == fx.CONN_XMPP_ERR || fxVar == fx.CONN_BOSH_ERR) {
            aVar.f461a = str;
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Throwable] */
    static a c(Exception exc) {
        m404a(exc);
        boolean z = exc instanceof gx;
        Exception exc2 = exc;
        if (z) {
            gx gxVar = (gx) exc;
            exc2 = exc;
            if (gxVar.a() != null) {
                exc2 = gxVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a2 = gr.a(exc2);
        String str = exc2.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a2 == 105) {
            aVar.a = fx.BIND_TCP_READ_TIMEOUT;
        } else if (a2 == 199) {
            aVar.a = fx.BIND_TCP_ERR;
        } else if (a2 == 499) {
            aVar.a = fx.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.a = fx.BIND_BOSH_ITEM_NOT_FOUND;
            }
        } else if (a2 == 109) {
            aVar.a = fx.BIND_TCP_CONNRESET;
        } else if (a2 != 110) {
            aVar.a = fx.BIND_XMPP_ERR;
        } else {
            aVar.a = fx.BIND_TCP_BROKEN_PIPE;
        }
        fx fxVar = aVar.a;
        if (fxVar == fx.BIND_TCP_ERR || fxVar == fx.BIND_XMPP_ERR || fxVar == fx.BIND_BOSH_ERR) {
            aVar.f461a = str;
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Throwable] */
    static a d(Exception exc) {
        m404a(exc);
        boolean z = exc instanceof gx;
        Exception exc2 = exc;
        if (z) {
            gx gxVar = (gx) exc;
            exc2 = exc;
            if (gxVar.a() != null) {
                exc2 = gxVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        int a2 = gr.a(exc2);
        String str = exc2.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a2 == 105) {
            aVar.a = fx.CHANNEL_TCP_READTIMEOUT;
        } else if (a2 == 199) {
            aVar.a = fx.CHANNEL_TCP_ERR;
        } else if (a2 == 499) {
            aVar.a = fx.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.a = fx.CHANNEL_BOSH_ITEMNOTFIND;
            }
        } else if (a2 == 109) {
            aVar.a = fx.CHANNEL_TCP_CONNRESET;
        } else if (a2 != 110) {
            aVar.a = fx.CHANNEL_XMPPEXCEPTION;
        } else {
            aVar.a = fx.CHANNEL_TCP_BROKEN_PIPE;
        }
        fx fxVar = aVar.a;
        if (fxVar == fx.CHANNEL_TCP_ERR || fxVar == fx.CHANNEL_XMPPEXCEPTION || fxVar == fx.CHANNEL_BOSH_EXCEPTION) {
            aVar.f461a = str;
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Throwable] */
    static a a(Exception exc) {
        m404a(exc);
        boolean z = exc instanceof gx;
        Exception exc2 = exc;
        if (z) {
            gx gxVar = (gx) exc;
            exc2 = exc;
            if (gxVar.a() != null) {
                exc2 = gxVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        String str = exc2.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        int a2 = gr.a(exc2);
        if (a2 != 0) {
            aVar.a = fx.a(fx.GSLB_REQUEST_SUCCESS.a() + a2);
        }
        if (aVar.a == null) {
            aVar.a = fx.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.a == fx.GSLB_TCP_ERR_OTHER) {
            aVar.f461a = str;
        }
        return aVar;
    }
}
