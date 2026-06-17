package f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes2.dex */
public final class o {
    public static final f a(x xVar) {
        kotlin.s.c.l.g(xVar, "$receiver");
        return new s(xVar);
    }

    public static final boolean b(AssertionError assertionError) {
        kotlin.s.c.l.g(assertionError, "$receiver");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? kotlin.text.a.d(message, "getsockname failed", false, 2, null) : false;
    }

    public static final x c(OutputStream outputStream) {
        kotlin.s.c.l.g(outputStream, "$receiver");
        return new q(outputStream, new A());
    }

    public static final x d(Socket socket) throws IOException {
        kotlin.s.c.l.g(socket, "$receiver");
        y yVar = new y(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.s.c.l.b(outputStream, "getOutputStream()");
        q qVar = new q(outputStream, yVar);
        kotlin.s.c.l.g(qVar, "sink");
        return new c(yVar, qVar);
    }

    public static final z e(InputStream inputStream) {
        kotlin.s.c.l.g(inputStream, "$receiver");
        return new n(inputStream, new A());
    }

    public static final z f(Socket socket) throws IOException {
        kotlin.s.c.l.g(socket, "$receiver");
        y yVar = new y(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.s.c.l.b(inputStream, "getInputStream()");
        n nVar = new n(inputStream, yVar);
        kotlin.s.c.l.g(nVar, "source");
        return new d(yVar, nVar);
    }
}
