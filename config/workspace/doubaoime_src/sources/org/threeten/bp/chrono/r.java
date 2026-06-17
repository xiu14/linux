package org.threeten.bp.chrono;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
final class r implements Externalizable {
    private byte a;
    private Object b;

    r(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        Object nVar;
        Object i;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                org.threeten.bp.e eVar = n.f10790d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                Objects.requireNonNull(m.f10786d);
                nVar = new n(org.threeten.bp.e.H(readInt, readByte2, readByte3));
                i = nVar;
                this.b = i;
                return;
            case 2:
                o oVar = o.f10792d;
                i = o.i(objectInput.readByte());
                this.b = i;
                return;
            case 3:
                int i2 = k.E;
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                j jVar = j.f10775c;
                i = k.B(readInt2, readByte4, readByte5);
                this.b = i;
                return;
            case 4:
                i = HijrahEra.readExternal(objectInput);
                this.b = i;
                return;
            case 5:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                p pVar = p.f10797c;
                nVar = new q(org.threeten.bp.e.H(readInt3 + 1911, readByte6, readByte7));
                i = nVar;
                this.b = i;
                return;
            case 6:
                i = MinguoEra.readExternal(objectInput);
                this.b = i;
                return;
            case 7:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                s sVar = s.f10798c;
                nVar = new t(org.threeten.bp.e.H(readInt4 - 543, readByte8, readByte9));
                i = nVar;
                this.b = i;
                return;
            case 8:
                i = ThaiBuddhistEra.readExternal(objectInput);
                this.b = i;
                return;
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                i = h.l(objectInput);
                this.b = i;
                return;
            case 12:
                i = ((b) objectInput.readObject()).f((org.threeten.bp.g) objectInput.readObject());
                this.b = i;
                return;
            case 13:
                i = ((c) objectInput.readObject()).f((org.threeten.bp.l) objectInput.readObject()).r((org.threeten.bp.k) objectInput.readObject());
                this.b = i;
                return;
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                n nVar = (n) obj;
                Objects.requireNonNull(nVar);
                objectOutput.writeInt(nVar.get(ChronoField.YEAR));
                objectOutput.writeByte(nVar.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(nVar.get(ChronoField.DAY_OF_MONTH));
                return;
            case 2:
                ((o) obj).l(objectOutput);
                return;
            case 3:
                k kVar = (k) obj;
                Objects.requireNonNull(kVar);
                objectOutput.writeInt(kVar.get(ChronoField.YEAR));
                objectOutput.writeByte(kVar.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(kVar.get(ChronoField.DAY_OF_MONTH));
                return;
            case 4:
                ((HijrahEra) obj).writeExternal(objectOutput);
                return;
            case 5:
                q qVar = (q) obj;
                Objects.requireNonNull(qVar);
                objectOutput.writeInt(qVar.get(ChronoField.YEAR));
                objectOutput.writeByte(qVar.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(qVar.get(ChronoField.DAY_OF_MONTH));
                return;
            case 6:
                ((MinguoEra) obj).writeExternal(objectOutput);
                return;
            case 7:
                t tVar = (t) obj;
                Objects.requireNonNull(tVar);
                objectOutput.writeInt(tVar.get(ChronoField.YEAR));
                objectOutput.writeByte(tVar.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(tVar.get(ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                ((ThaiBuddhistEra) obj).writeExternal(objectOutput);
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                objectOutput.writeUTF(((h) obj).j());
                return;
            case 12:
                ((d) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((g) obj).writeExternal(objectOutput);
                return;
        }
    }
}
