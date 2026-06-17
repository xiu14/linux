package com.squareup.wire;

import e.a.a.a.a;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes2.dex */
public enum FieldEncoding {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);

    final int value;

    /* renamed from: com.squareup.wire.FieldEncoding$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$wire$FieldEncoding;

        static {
            FieldEncoding.values();
            int[] iArr = new int[4];
            $SwitchMap$com$squareup$wire$FieldEncoding = iArr;
            try {
                FieldEncoding fieldEncoding = FieldEncoding.VARINT;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$squareup$wire$FieldEncoding;
                FieldEncoding fieldEncoding2 = FieldEncoding.FIXED32;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$squareup$wire$FieldEncoding;
                FieldEncoding fieldEncoding3 = FieldEncoding.FIXED64;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$squareup$wire$FieldEncoding;
                FieldEncoding fieldEncoding4 = FieldEncoding.LENGTH_DELIMITED;
                iArr4[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    FieldEncoding(int i) {
        this.value = i;
    }

    static FieldEncoding get(int i) throws IOException {
        if (i == 0) {
            return VARINT;
        }
        if (i == 1) {
            return FIXED64;
        }
        if (i == 2) {
            return LENGTH_DELIMITED;
        }
        if (i == 5) {
            return FIXED32;
        }
        throw new ProtocolException(a.j("Unexpected FieldEncoding: ", i));
    }

    public ProtoAdapter<?> rawProtoAdapter() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return ProtoAdapter.UINT64;
        }
        if (ordinal == 1) {
            return ProtoAdapter.FIXED64;
        }
        if (ordinal == 2) {
            return ProtoAdapter.BYTES;
        }
        if (ordinal == 3) {
            return ProtoAdapter.FIXED32;
        }
        throw new AssertionError();
    }
}
