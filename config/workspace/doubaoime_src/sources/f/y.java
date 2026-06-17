package f;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class y extends b {
    private final Logger l;
    private final Socket m;

    public y(Socket socket) {
        kotlin.s.c.l.g(socket, "socket");
        this.m = socket;
        this.l = Logger.getLogger("okio.Okio");
    }

    @Override // f.b
    protected IOException u(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // f.b
    protected void v() {
        try {
            this.m.close();
        } catch (AssertionError e2) {
            if (!o.b(e2)) {
                throw e2;
            }
            Logger logger = this.l;
            Level level = Level.WARNING;
            StringBuilder M = e.a.a.a.a.M("Failed to close timed out socket ");
            M.append(this.m);
            logger.log(level, M.toString(), (Throwable) e2);
        } catch (Exception e3) {
            Logger logger2 = this.l;
            Level level2 = Level.WARNING;
            StringBuilder M2 = e.a.a.a.a.M("Failed to close timed out socket ");
            M2.append(this.m);
            logger2.log(level2, M2.toString(), (Throwable) e3);
        }
    }
}
