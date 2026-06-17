package com.xiaomi.push;

import java.io.IOException;

/* loaded from: classes2.dex */
public class e extends IOException {
    public e(String str) {
        super(str);
    }

    static e a() {
        return new e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static e b() {
        return new e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static e c() {
        return new e("CodedInputStream encountered a malformed varint.");
    }

    static e d() {
        return new e("Protocol message contained an invalid tag (zero).");
    }

    static e e() {
        return new e("Protocol message end-group tag did not match expected tag.");
    }

    static e f() {
        return new e("Protocol message tag had invalid wire type.");
    }

    static e g() {
        return new e("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static e h() {
        return new e("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
}
