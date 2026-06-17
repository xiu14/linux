package com.ttnet.org.chromium.net.urlconnection;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
class e extends d {

    /* renamed from: e, reason: collision with root package name */
    private h f8776e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8777f;

    e(CronetHttpURLConnection cronetHttpURLConnection) {
        super(cronetHttpURLConnection);
        this.f8777f = false;
    }

    private void l() throws IOException {
        boolean z = this.f8777f;
        if (z || z) {
            return;
        }
        if (com.ttnet.org.chromium.base.e.b()) {
            com.ttnet.org.chromium.base.e.a("TTBuffer", "calling ensureReadFromCronetDone");
        }
        this.f8776e = new h();
        while (true) {
            Segment c2 = this.f8776e.c();
            ByteBuffer innerBuffer = c2.getInnerBuffer();
            if (com.ttnet.org.chromium.base.e.b()) {
                com.ttnet.org.chromium.base.e.a("TTBuffer", "getMoreData");
            }
            int position = innerBuffer.position();
            this.a.C(innerBuffer);
            if (this.f8775d != null) {
                this.f8776e.f();
                throw this.f8775d;
            }
            int position2 = innerBuffer.position() - position;
            if (position2 == 0) {
                if (position == 0) {
                    if (com.ttnet.org.chromium.base.e.b()) {
                        StringBuilder M = e.a.a.a.a.M("no new data, release empty segment ");
                        M.append(this.f8776e.b);
                        com.ttnet.org.chromium.base.e.a("TTBuffer", M.toString());
                    }
                    c2.release();
                } else {
                    if (com.ttnet.org.chromium.base.e.b()) {
                        StringBuilder M2 = e.a.a.a.a.M("no new data, save this segment ");
                        M2.append(this.f8776e.b);
                        com.ttnet.org.chromium.base.e.a("TTBuffer", M2.toString());
                    }
                    c2.completeRead();
                }
                this.f8777f = true;
                return;
            }
            h hVar = this.f8776e;
            int i = hVar.b + position2;
            hVar.b = i;
            if (i > 5242880) {
                hVar.f();
                StringBuilder M3 = e.a.a.a.a.M("Download too large ");
                M3.append(this.f8776e.b);
                M3.append(" ");
                M3.append(5242880);
                throw new IOException(M3.toString());
            }
            if (!c2.isWritable()) {
                if (com.ttnet.org.chromium.base.e.b()) {
                    StringBuilder M4 = e.a.a.a.a.M("new data but full, will use new segment next ");
                    M4.append(this.f8776e.b);
                    com.ttnet.org.chromium.base.e.a("TTBuffer", M4.toString());
                }
                c2.completeRead();
            } else if (com.ttnet.org.chromium.base.e.b()) {
                StringBuilder M5 = e.a.a.a.a.M("new data, continue read with this segment ");
                M5.append(this.f8776e.b);
                M5.append(" remaining: ");
                M5.append(innerBuffer.remaining());
                com.ttnet.org.chromium.base.e.a("TTBuffer", M5.toString());
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.d, java.io.InputStream
    public int available() throws IOException {
        l();
        h hVar = this.f8776e;
        int i = hVar.b;
        if (i != 0) {
            if (i > 0) {
                return i;
            }
            return 0;
        }
        if (this.f8775d == null) {
            return 0;
        }
        hVar.f();
        throw this.f8775d;
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.d, java.io.InputStream
    public int read() throws IOException {
        l();
        h hVar = this.f8776e;
        if (hVar.b > 0) {
            return hVar.b() & 255;
        }
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.d, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        l();
        if (bArr.length == 0) {
            return 0;
        }
        h hVar = this.f8776e;
        if (hVar.b > 0) {
            return hVar.e(bArr, i, i2);
        }
        return -1;
    }
}
