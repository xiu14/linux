package com.huawei.hms.common.data;

import com.huawei.hms.common.internal.Preconditions;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class SingleRefDBInnerIter<T> extends DBInnerIter<T> {
    public SingleRefDBInnerIter(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.huawei.hms.common.data.DBInnerIter, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            return null;
        }
        int i = this.index + 1;
        this.index = i;
        if (i == 0) {
            boolean z = this.dataBuffer.get(0) instanceof DataBufferRef;
            StringBuilder M = a.M("DataBuffer reference of type ");
            M.append(this.dataBuffer.get(0).getClass());
            M.append(" is not movable");
            Preconditions.checkState(z, M.toString());
            ((DataBufferRef) this.dataBuffer.get(0)).getWindowIndex(this.index);
        }
        return (T) this.dataBuffer.get(0);
    }
}
