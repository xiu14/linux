package com.bytedance.common.wschannel.channel.c.a.i;

import com.bytedance.common.utility.Logger;
import f.e;
import f.g;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class e {
    private final long a;
    final boolean b;

    /* renamed from: c, reason: collision with root package name */
    final g f4228c;

    /* renamed from: d, reason: collision with root package name */
    final a f4229d;

    /* renamed from: e, reason: collision with root package name */
    boolean f4230e;

    /* renamed from: f, reason: collision with root package name */
    int f4231f;

    /* renamed from: g, reason: collision with root package name */
    long f4232g;
    boolean h;
    boolean i;
    private final f.e j = new f.e();
    private final f.e k = new f.e();
    private final byte[] l;
    private final e.a m;

    public interface a {
    }

    e(boolean z, g gVar, a aVar, long j) {
        Objects.requireNonNull(gVar, "source == null");
        this.b = z;
        this.f4228c = gVar;
        this.f4229d = aVar;
        this.a = j;
        this.l = z ? null : new byte[4];
        this.m = z ? null : new e.a();
    }

    private void b() throws IOException {
        String str;
        long j = this.f4232g;
        if (j > 0) {
            this.f4228c.y(this.j, j);
            if (!this.b) {
                this.j.r(this.m);
                this.m.a(0L);
                d.b(this.m, this.l);
                this.m.close();
            }
        }
        int i = this.f4231f;
        if (i == 9) {
            ((com.bytedance.common.wschannel.channel.c.a.i.a) this.f4229d).m(this.j.w());
            return;
        }
        if (i == 10) {
            ((com.bytedance.common.wschannel.channel.c.a.i.a) this.f4229d).n(this.j.w());
            return;
        }
        if (i != 8) {
            StringBuilder M = e.a.a.a.a.M("Unknown control opcode: ");
            M.append(Integer.toHexString(this.f4231f));
            throw new ProtocolException(M.toString());
        }
        short s = 1005;
        long I = this.j.I();
        if (I == 1) {
            throw new ProtocolException("Malformed close payload length of 1.");
        }
        if (I != 0) {
            s = this.j.readShort();
            str = this.j.A();
            String a2 = d.a(s);
            if (a2 != null) {
                throw new ProtocolException(a2);
            }
        } else {
            str = "";
        }
        ((com.bytedance.common.wschannel.channel.c.a.i.a) this.f4229d).j(s, str);
        this.f4230e = true;
    }

    /* JADX WARN: Finally extract failed */
    private void c() throws IOException {
        if (this.f4230e) {
            throw new IOException("closed");
        }
        long h = this.f4228c.c().h();
        this.f4228c.c().b();
        try {
            int readByte = this.f4228c.readByte() & 255;
            this.f4228c.c().g(h, TimeUnit.NANOSECONDS);
            this.f4231f = readByte & 15;
            boolean z = (readByte & 128) != 0;
            this.h = z;
            boolean z2 = (readByte & 8) != 0;
            this.i = z2;
            if (z2 && !z) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z3 = (readByte & 64) != 0;
            boolean z4 = (readByte & 32) != 0;
            boolean z5 = (readByte & 16) != 0;
            if (z3 || z4 || z5) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            int readByte2 = this.f4228c.readByte() & 255;
            boolean z6 = (readByte2 & 128) != 0;
            if (z6 == this.b) {
                throw new ProtocolException(this.b ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = readByte2 & 127;
            this.f4232g = j;
            if (j == 126) {
                this.f4232g = this.f4228c.readShort() & 65535;
            } else if (j == 127) {
                long readLong = this.f4228c.readLong();
                this.f4232g = readLong;
                if (readLong < 0) {
                    StringBuilder M = e.a.a.a.a.M("Frame length 0x");
                    M.append(Long.toHexString(this.f4232g));
                    M.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(M.toString());
                }
            }
            if (this.i && this.f4232g > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z6) {
                this.f4228c.readFully(this.l);
            }
        } catch (Throwable th) {
            this.f4228c.c().g(h, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    void a() throws IOException {
        c();
        if (this.f4232g > this.a) {
            Logger.d("WsChannelSdk_ok", "frame too large,skip");
            try {
                this.f4228c.skip(this.f4232g);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (this.i) {
            b();
            return;
        }
        int i = this.f4231f;
        if (i != 1 && i != 2) {
            StringBuilder M = e.a.a.a.a.M("Unknown opcode: ");
            M.append(Integer.toHexString(i));
            throw new ProtocolException(M.toString());
        }
        while (!this.f4230e) {
            long j = this.f4232g;
            if (j > 0) {
                this.f4228c.y(this.k, j);
                if (!this.b) {
                    this.k.r(this.m);
                    this.m.a(this.k.I() - this.f4232g);
                    d.b(this.m, this.l);
                    this.m.close();
                }
            }
            if (this.h) {
                if (i == 1) {
                    ((com.bytedance.common.wschannel.channel.c.a.i.a) this.f4229d).k(this.k.A());
                    return;
                } else {
                    ((com.bytedance.common.wschannel.channel.c.a.i.a) this.f4229d).l(this.k.w());
                    return;
                }
            }
            while (true) {
                if (this.f4230e) {
                    break;
                }
                c();
                if (this.f4232g > this.a) {
                    Logger.d("WsChannelSdk_ok", "frame too large,skip");
                    try {
                        this.f4228c.skip(this.f4232g);
                        break;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                } else if (!this.i) {
                    break;
                } else {
                    b();
                }
            }
            if (this.f4231f != 0) {
                StringBuilder M2 = e.a.a.a.a.M("Expected continuation opcode. Got: ");
                M2.append(Integer.toHexString(this.f4231f));
                throw new ProtocolException(M2.toString());
            }
        }
        throw new IOException("closed");
    }
}
