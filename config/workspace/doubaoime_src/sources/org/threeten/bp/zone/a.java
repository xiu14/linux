package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.Externalizable;
import java.io.IOException;
import org.threeten.bp.l;

/* loaded from: classes2.dex */
final class a implements Externalizable {
    static long a(DataInput dataInput) throws IOException {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    static l b(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? l.n(dataInput.readInt()) : l.n(readByte * 900);
    }
}
