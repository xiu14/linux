package org.threeten.bp.temporal;

/* loaded from: classes2.dex */
public interface e {
    <R extends a> R adjustInto(R r, long j);

    long getFrom(b bVar);

    boolean isDateBased();

    boolean isSupportedBy(b bVar);

    boolean isTimeBased();

    j range();

    j rangeRefinedBy(b bVar);
}
