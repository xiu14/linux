package org.threeten.bp.zone;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.mcssdk.constant.MessageConstant;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.DataInput;
import java.io.IOException;
import java.io.Serializable;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Month;
import org.threeten.bp.l;

/* loaded from: classes2.dex */
public final class ZoneOffsetTransitionRule implements Serializable {
    private final Month a;
    private final byte b;

    /* renamed from: c, reason: collision with root package name */
    private final DayOfWeek f10876c;

    /* renamed from: d, reason: collision with root package name */
    private final org.threeten.bp.g f10877d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10878e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeDefinition f10879f;

    /* renamed from: g, reason: collision with root package name */
    private final l f10880g;
    private final l h;
    private final l i;

    public enum TimeDefinition {
        UTC,
        WALL,
        STANDARD;

        public org.threeten.bp.f createDateTime(org.threeten.bp.f fVar, l lVar, l lVar2) {
            int ordinal = ordinal();
            return ordinal != 0 ? ordinal != 2 ? fVar : fVar.D(lVar2.k() - lVar.k()) : fVar.D(lVar2.k() - l.f10850f.k());
        }
    }

    ZoneOffsetTransitionRule(Month month, int i, DayOfWeek dayOfWeek, org.threeten.bp.g gVar, boolean z, TimeDefinition timeDefinition, l lVar, l lVar2, l lVar3) {
        this.a = month;
        this.b = (byte) i;
        this.f10876c = dayOfWeek;
        this.f10877d = gVar;
        this.f10878e = z;
        this.f10879f = timeDefinition;
        this.f10880g = lVar;
        this.h = lVar2;
        this.i = lVar3;
    }

    static ZoneOffsetTransitionRule b(DataInput dataInput) throws IOException {
        int readInt = dataInput.readInt();
        Month of = Month.of(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        DayOfWeek of2 = i2 == 0 ? null : DayOfWeek.of(i2);
        int i3 = (507904 & readInt) >>> 14;
        TimeDefinition timeDefinition = TimeDefinition.values()[(readInt & MessageConstant.CommandId.COMMAND_BASE) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        org.threeten.bp.g n = i3 == 31 ? org.threeten.bp.g.n(dataInput.readInt()) : org.threeten.bp.g.l(i3 % 24, 0);
        l n2 = l.n(i4 == 255 ? dataInput.readInt() : (i4 - 128) * TypedValues.Custom.TYPE_INT);
        l n3 = i5 == 3 ? l.n(dataInput.readInt()) : l.n((i5 * 1800) + n2.k());
        l n4 = i6 == 3 ? l.n(dataInput.readInt()) : l.n((i6 * 1800) + n2.k());
        boolean z = i3 == 24;
        org.apache.http.conn.ssl.d.k(of, "month");
        org.apache.http.conn.ssl.d.k(n, CrashHianalyticsData.TIME);
        org.apache.http.conn.ssl.d.k(timeDefinition, "timeDefnition");
        org.apache.http.conn.ssl.d.k(n2, "standardOffset");
        org.apache.http.conn.ssl.d.k(n3, "offsetBefore");
        org.apache.http.conn.ssl.d.k(n4, "offsetAfter");
        if (i < -28 || i > 31 || i == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (!z || n.equals(org.threeten.bp.g.f10843g)) {
            return new ZoneOffsetTransitionRule(of, i, of2, n, z, timeDefinition, n2, n3, n4);
        }
        throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
    }

    public d a(int i) {
        org.threeten.bp.e I;
        byte b = this.b;
        if (b < 0) {
            Month month = this.a;
            I = org.threeten.bp.e.I(i, month, month.length(org.threeten.bp.chrono.l.f10784c.p(i)) + 1 + this.b);
            DayOfWeek dayOfWeek = this.f10876c;
            if (dayOfWeek != null) {
                I = I.b(org.threeten.bp.temporal.d.b(dayOfWeek));
            }
        } else {
            I = org.threeten.bp.e.I(i, this.a, b);
            DayOfWeek dayOfWeek2 = this.f10876c;
            if (dayOfWeek2 != null) {
                I = I.b(org.threeten.bp.temporal.d.a(dayOfWeek2));
            }
        }
        if (this.f10878e) {
            I = I.L(1L);
        }
        return new d(this.f10879f.createDateTime(org.threeten.bp.f.y(I, this.f10877d), this.f10880g, this.h), this.h, this.i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoneOffsetTransitionRule)) {
            return false;
        }
        ZoneOffsetTransitionRule zoneOffsetTransitionRule = (ZoneOffsetTransitionRule) obj;
        return this.a == zoneOffsetTransitionRule.a && this.b == zoneOffsetTransitionRule.b && this.f10876c == zoneOffsetTransitionRule.f10876c && this.f10879f == zoneOffsetTransitionRule.f10879f && this.f10877d.equals(zoneOffsetTransitionRule.f10877d) && this.f10878e == zoneOffsetTransitionRule.f10878e && this.f10880g.equals(zoneOffsetTransitionRule.f10880g) && this.h.equals(zoneOffsetTransitionRule.h) && this.i.equals(zoneOffsetTransitionRule.i);
    }

    public int hashCode() {
        int v = ((this.f10877d.v() + (this.f10878e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.f10876c;
        return ((this.f10880g.hashCode() ^ (this.f10879f.ordinal() + (v + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("TransitionRule[");
        M.append(this.h.i(this.i) > 0 ? "Gap " : "Overlap ");
        M.append(this.h);
        M.append(" to ");
        M.append(this.i);
        M.append(", ");
        DayOfWeek dayOfWeek = this.f10876c;
        if (dayOfWeek != null) {
            byte b = this.b;
            if (b == -1) {
                M.append(dayOfWeek.name());
                M.append(" on or before last day of ");
                M.append(this.a.name());
            } else if (b < 0) {
                M.append(dayOfWeek.name());
                M.append(" on or before last day minus ");
                M.append((-this.b) - 1);
                M.append(" of ");
                M.append(this.a.name());
            } else {
                M.append(dayOfWeek.name());
                M.append(" on or after ");
                M.append(this.a.name());
                M.append(' ');
                M.append((int) this.b);
            }
        } else {
            M.append(this.a.name());
            M.append(' ');
            M.append((int) this.b);
        }
        M.append(" at ");
        M.append(this.f10878e ? "24:00" : this.f10877d.toString());
        M.append(" ");
        M.append(this.f10879f);
        M.append(", standard offset ");
        M.append(this.f10880g);
        M.append(']');
        return M.toString();
    }
}
