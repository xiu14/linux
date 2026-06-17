package com.squareup.wire;

import androidx.core.location.LocationRequestCompat;
import e.a.a.a.a;
import f.e;
import f.g;
import f.h;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes2.dex */
public final class ProtoReader {
    private static final int FIELD_ENCODING_MASK = 7;
    private static final int RECURSION_LIMIT = 65;
    private static final int STATE_END_GROUP = 4;
    private static final int STATE_FIXED32 = 5;
    private static final int STATE_FIXED64 = 1;
    private static final int STATE_LENGTH_DELIMITED = 2;
    private static final int STATE_PACKED_TAG = 7;
    private static final int STATE_START_GROUP = 3;
    private static final int STATE_TAG = 6;
    private static final int STATE_VARINT = 0;
    static final int TAG_FIELD_ENCODING_BITS = 3;
    private FieldEncoding nextFieldEncoding;
    private int recursionDepth;
    private final g source;
    private long pos = 0;
    private long limit = LocationRequestCompat.PASSIVE_INTERVAL;
    private int state = 2;
    private int tag = -1;
    private long pushedLimit = -1;

    public ProtoReader(g gVar) {
        this.source = gVar;
    }

    private void afterPackableScalar(int i) throws IOException {
        if (this.state == i) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j > j2) {
            StringBuilder M = a.M("Expected to end at ");
            M.append(this.limit);
            M.append(" but was ");
            M.append(this.pos);
            throw new IOException(M.toString());
        }
        if (j != j2) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
    }

    private long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            StringBuilder M = a.M("Expected LENGTH_DELIMITED but was ");
            M.append(this.state);
            throw new ProtocolException(M.toString());
        }
        long j = this.limit - this.pos;
        this.source.g0(j);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j;
    }

    private void copyTag(ProtoWriter protoWriter, int i) throws IOException {
        ProtoAdapter<?> rawProtoAdapter = peekFieldEncoding().rawProtoAdapter();
        try {
            rawProtoAdapter.encodeWithTag(protoWriter, i, rawProtoAdapter.decode(this));
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private int internalReadVarint32() throws IOException {
        int i;
        this.source.g0(1L);
        this.pos++;
        byte readByte = this.source.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        this.source.g0(1L);
        this.pos++;
        byte readByte2 = this.source.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            this.source.g0(1L);
            this.pos++;
            byte readByte3 = this.source.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                this.source.g0(1L);
                this.pos++;
                byte readByte4 = this.source.readByte();
                if (readByte4 < 0) {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    this.source.g0(1L);
                    this.pos++;
                    byte readByte5 = this.source.readByte();
                    int i4 = i3 | (readByte5 << 28);
                    if (readByte5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        this.source.g0(1L);
                        this.pos++;
                        if (this.source.readByte() >= 0) {
                            return i4;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
                i = readByte4 << 21;
            }
        }
        return i2 | i;
    }

    private void skipGroup(int i) throws IOException {
        while (this.pos < this.limit && !this.source.v()) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = internalReadVarint32 >> 3;
            int i3 = internalReadVarint32 & 7;
            if (i3 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i3 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i3 == 2) {
                long internalReadVarint322 = internalReadVarint32();
                this.pos += internalReadVarint322;
                this.source.skip(internalReadVarint322);
            } else if (i3 == 3) {
                skipGroup(i2);
            } else if (i3 == 4) {
                if (i2 != i) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i3 != 5) {
                    throw new ProtocolException(a.j("Unexpected field encoding: ", i3));
                }
                this.state = 5;
                readFixed32();
            }
        }
        throw new EOFException();
    }

    public long beginMessage() throws IOException {
        if (this.state != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j;
    }

    public void endMessage(long j) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i = this.recursionDepth - 1;
        this.recursionDepth = i;
        if (i < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.pos == this.limit || i == 0) {
            this.limit = j;
            return;
        }
        StringBuilder M = a.M("Expected to end at ");
        M.append(this.limit);
        M.append(" but was ");
        M.append(this.pos);
        throw new IOException(M.toString());
    }

    public h forEachTag(TagHandler tagHandler) throws IOException {
        long beginMessage = beginMessage();
        e eVar = null;
        ProtoWriter protoWriter = null;
        while (true) {
            int nextTag = nextTag();
            if (nextTag == -1) {
                break;
            }
            if (tagHandler.decodeMessage(nextTag) == TagHandler.UNKNOWN_TAG) {
                if (eVar == null) {
                    eVar = new e();
                    protoWriter = new ProtoWriter(eVar);
                }
                copyTag(protoWriter, nextTag);
            }
        }
        endMessage(beginMessage);
        return eVar != null ? eVar.w() : h.f10045d;
    }

    public int nextTag() throws IOException {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.v()) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = internalReadVarint32 >> 3;
            this.tag = i2;
            int i3 = internalReadVarint32 & 7;
            if (i3 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return i2;
            }
            if (i3 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return i2;
            }
            if (i3 == 2) {
                this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                this.state = 2;
                int internalReadVarint322 = internalReadVarint32();
                if (internalReadVarint322 < 0) {
                    throw new ProtocolException(a.j("Negative length: ", internalReadVarint322));
                }
                if (this.pushedLimit != -1) {
                    throw new IllegalStateException();
                }
                long j = this.limit;
                this.pushedLimit = j;
                long j2 = this.pos + internalReadVarint322;
                this.limit = j2;
                if (j2 <= j) {
                    return this.tag;
                }
                throw new EOFException();
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i3 != 5) {
                    throw new ProtocolException(a.j("Unexpected field encoding: ", i3));
                }
                this.nextFieldEncoding = FieldEncoding.FIXED32;
                this.state = 5;
                return i2;
            }
            skipGroup(i2);
        }
        return -1;
    }

    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public h readBytes() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.g0(beforeLengthDelimitedScalar);
        return this.source.m(beforeLengthDelimitedScalar);
    }

    public int readFixed32() throws IOException {
        int i = this.state;
        if (i != 5 && i != 2) {
            StringBuilder M = a.M("Expected FIXED32 or LENGTH_DELIMITED but was ");
            M.append(this.state);
            throw new ProtocolException(M.toString());
        }
        this.source.g0(4L);
        this.pos += 4;
        int W = this.source.W();
        afterPackableScalar(5);
        return W;
    }

    public long readFixed64() throws IOException {
        int i = this.state;
        if (i != 1 && i != 2) {
            StringBuilder M = a.M("Expected FIXED64 or LENGTH_DELIMITED but was ");
            M.append(this.state);
            throw new ProtocolException(M.toString());
        }
        this.source.g0(8L);
        this.pos += 8;
        long d0 = this.source.d0();
        afterPackableScalar(1);
        return d0;
    }

    public String readString() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.g0(beforeLengthDelimitedScalar);
        return this.source.k(beforeLengthDelimitedScalar);
    }

    public int readVarint32() throws IOException {
        int i = this.state;
        if (i == 0 || i == 2) {
            int internalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return internalReadVarint32;
        }
        StringBuilder M = a.M("Expected VARINT or LENGTH_DELIMITED but was ");
        M.append(this.state);
        throw new ProtocolException(M.toString());
    }

    public long readVarint64() throws IOException {
        int i = this.state;
        if (i != 0 && i != 2) {
            StringBuilder M = a.M("Expected VARINT or LENGTH_DELIMITED but was ");
            M.append(this.state);
            throw new ProtocolException(M.toString());
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            this.source.g0(1L);
            this.pos++;
            j |= (r4 & Byte.MAX_VALUE) << i2;
            if ((this.source.readByte() & 128) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public void skip() throws IOException {
        int i = this.state;
        if (i == 0) {
            readVarint64();
            return;
        }
        if (i == 1) {
            readFixed64();
            return;
        }
        if (i == 2) {
            this.source.skip(beforeLengthDelimitedScalar());
        } else {
            if (i != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            readFixed32();
        }
    }
}
