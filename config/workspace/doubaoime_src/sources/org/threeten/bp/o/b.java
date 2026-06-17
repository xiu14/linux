package org.threeten.bp.o;

import androidx.core.location.LocationRequestCompat;
import org.threeten.bp.temporal.h;

/* loaded from: classes2.dex */
public abstract class b extends c implements org.threeten.bp.temporal.a {
    public org.threeten.bp.temporal.a c(long j, h hVar) {
        return j == Long.MIN_VALUE ? d(LocationRequestCompat.PASSIVE_INTERVAL, hVar).d(1L, hVar) : d(-j, hVar);
    }
}
