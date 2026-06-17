package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.push.ef;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* loaded from: classes2.dex */
class gi {

    /* renamed from: a, reason: collision with other field name */
    private gn f480a;

    /* renamed from: a, reason: collision with other field name */
    private InputStream f481a;

    /* renamed from: a, reason: collision with other field name */
    private volatile boolean f484a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f485a;

    /* renamed from: a, reason: collision with other field name */
    private ByteBuffer f482a = ByteBuffer.allocate(2048);
    private ByteBuffer b = ByteBuffer.allocate(4);

    /* renamed from: a, reason: collision with other field name */
    private Adler32 f483a = new Adler32();
    private gl a = new gl();

    gi(InputStream inputStream, gn gnVar) {
        this.f481a = new BufferedInputStream(inputStream);
        this.f480a = gnVar;
    }

    private void c() {
        boolean z = false;
        this.f484a = false;
        gg m425a = m425a();
        if ("CONN".equals(m425a.m414a())) {
            ef.f a = ef.f.a(m425a.m418a());
            if (a.m325a()) {
                this.f480a.a(a.m324a());
                z = true;
            }
            if (a.c()) {
                ef.b m323a = a.m323a();
                gg ggVar = new gg();
                ggVar.a("SYNC", "CONF");
                ggVar.a(m323a.m380a(), (String) null);
                this.f480a.a(ggVar);
            }
            StringBuilder M = e.a.a.a.a.M("[Slim] CONN: host = ");
            M.append(a.m326b());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        }
        if (!z) {
            com.xiaomi.channel.commonutils.logger.c.m15a("[Slim] Invalid CONN");
            throw new IOException("Invalid Connection");
        }
        this.f485a = this.f480a.m432a();
        while (!this.f484a) {
            gg m425a2 = m425a();
            long currentTimeMillis = System.currentTimeMillis();
            this.f480a.c();
            short m416a = m425a2.m416a();
            if (m416a == 1) {
                this.f480a.a(m425a2);
            } else if (m416a != 2) {
                if (m416a != 3) {
                    StringBuilder M2 = e.a.a.a.a.M("[Slim] unknow blob type ");
                    M2.append((int) m425a2.m416a());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M2.toString());
                } else {
                    try {
                        this.f480a.b(this.a.a(m425a2.m418a(), this.f480a));
                    } catch (Exception e2) {
                        StringBuilder M3 = e.a.a.a.a.M("[Slim] Parse packet from Blob chid=");
                        M3.append(m425a2.a());
                        M3.append("; Id=");
                        M3.append(m425a2.e());
                        M3.append(" failure:");
                        M3.append(e2.getMessage());
                        com.xiaomi.channel.commonutils.logger.c.m15a(M3.toString());
                    }
                }
            } else if ("SECMSG".equals(m425a2.m414a()) && ((m425a2.a() == 2 || m425a2.a() == 3) && TextUtils.isEmpty(m425a2.m421b()))) {
                try {
                    hd a2 = this.a.a(m425a2.m419a(com.xiaomi.push.service.ax.a().a(Integer.valueOf(m425a2.a()).toString(), m425a2.g()).h), this.f480a);
                    a2.f545a = currentTimeMillis;
                    this.f480a.b(a2);
                } catch (Exception e3) {
                    StringBuilder M4 = e.a.a.a.a.M("[Slim] Parse packet from Blob chid=");
                    M4.append(m425a2.a());
                    M4.append("; Id=");
                    M4.append(m425a2.e());
                    M4.append(" failure:");
                    M4.append(e3.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M4.toString());
                }
            } else {
                this.f480a.a(m425a2);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    void m426a() {
        try {
            c();
        } catch (IOException e2) {
            if (!this.f484a) {
                throw e2;
            }
        }
    }

    void b() {
        this.f484a = true;
    }

    private ByteBuffer a() {
        this.f482a.clear();
        a(this.f482a, 8);
        short s = this.f482a.getShort(0);
        short s2 = this.f482a.getShort(2);
        if (s == -15618 && s2 == 5) {
            int i = this.f482a.getInt(4);
            int position = this.f482a.position();
            if (i <= 32768) {
                if (i + 4 > this.f482a.remaining()) {
                    ByteBuffer allocate = ByteBuffer.allocate(i + 2048);
                    allocate.put(this.f482a.array(), 0, this.f482a.position() + this.f482a.arrayOffset());
                    this.f482a = allocate;
                } else if (this.f482a.capacity() > 4096 && i < 2048) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(2048);
                    allocate2.put(this.f482a.array(), 0, this.f482a.position() + this.f482a.arrayOffset());
                    this.f482a = allocate2;
                }
                a(this.f482a, i);
                this.b.clear();
                a(this.b, 4);
                this.b.position(0);
                int i2 = this.b.getInt();
                this.f483a.reset();
                this.f483a.update(this.f482a.array(), 0, this.f482a.position());
                if (i2 == ((int) this.f483a.getValue())) {
                    byte[] bArr = this.f485a;
                    if (bArr != null) {
                        com.xiaomi.push.service.bc.a(bArr, this.f482a.array(), true, position, i);
                    }
                    return this.f482a;
                }
                StringBuilder M = e.a.a.a.a.M("CRC = ");
                M.append((int) this.f483a.getValue());
                M.append(" and ");
                M.append(i2);
                com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                throw new IOException("Corrupted Blob bad CRC");
            }
            throw new IOException("Blob size too large");
        }
        throw new IOException("Malformed Input");
    }

    /* renamed from: a, reason: collision with other method in class */
    gg m425a() {
        int i;
        gg a;
        try {
            ByteBuffer a2 = a();
            i = a2.position();
            try {
                a2.flip();
                a2.position(8);
                if (i == 8) {
                    a = new gm();
                } else {
                    a = gg.a(a2.slice());
                }
                com.xiaomi.channel.commonutils.logger.c.c("[Slim] Read {cmd=" + a.m414a() + ";chid=" + a.a() + ";len=" + i + "}");
                er.a().b();
                return a;
            } catch (IOException e2) {
                e = e2;
                if (i == 0) {
                    i = this.f482a.position();
                }
                StringBuilder M = e.a.a.a.a.M("[Slim] read Blob [");
                byte[] array = this.f482a.array();
                if (i > 128) {
                    i = 128;
                }
                M.append(ae.a(array, 0, i));
                M.append("] Err:");
                M.append(e.getMessage());
                com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
            i = 0;
        }
    }

    private void a(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        do {
            int read = this.f481a.read(byteBuffer.array(), position, i);
            if (read == -1) {
                throw new EOFException();
            }
            i -= read;
            position += read;
        } while (i > 0);
        byteBuffer.position(position);
    }
}
