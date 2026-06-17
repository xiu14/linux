package com.lele.llmonitor.data.soc;
public final class MemoryInfoResult {
    public static final int $stable = 8;
    private final Long availableBytes;
    private final java.util.List probes;
    private final Long totalBytes;

    public MemoryInfoResult(Long p1, Long p2, java.util.List p3)
    {
        p3.getClass();
        this.totalBytes = p1;
        this.availableBytes = p2;
        this.probes = p3;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.MemoryInfoResult copy$default(com.lele.llmonitor.data.soc.MemoryInfoResult p0, Long p1, Long p2, java.util.List p3, int p4, Object p5)
    {
        if ((p4 & 1) != 0) {
            p1 = p0.totalBytes;
        }
        if ((p4 & 2) != 0) {
            p2 = p0.availableBytes;
        }
        if ((p4 & 4) != 0) {
            p3 = p0.probes;
        }
        return p0.copy(p1, p2, p3);
    }

    public final Long component1()
    {
        return this.totalBytes;
    }

    public final Long component2()
    {
        return this.availableBytes;
    }

    public final java.util.List component3()
    {
        return this.probes;
    }

    public final com.lele.llmonitor.data.soc.MemoryInfoResult copy(Long p1, Long p2, java.util.List p3)
    {
        p3.getClass();
        this = new com.lele.llmonitor.data.soc.MemoryInfoResult;
        this(p1, p2, p3);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.soc.MemoryInfoResult)) {
                if (ni1.o(this.totalBytes, ((com.lele.llmonitor.data.soc.MemoryInfoResult) p5).totalBytes)) {
                    if (ni1.o(this.availableBytes, ((com.lele.llmonitor.data.soc.MemoryInfoResult) p5).availableBytes)) {
                        if (ni1.o(this.probes, ((com.lele.llmonitor.data.soc.MemoryInfoResult) p5).probes)) {
                            return 1;
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final Long getAvailableBytes()
    {
        return this.availableBytes;
    }

    public final java.util.List getProbes()
    {
        return this.probes;
    }

    public final Long getTotalBytes()
    {
        return this.totalBytes;
    }

    public int hashCode()
    {
        int v0_3;
        int v0_0 = this.totalBytes;
        int v1 = 0;
        if (v0_0 != 0) {
            v0_3 = v0_0.hashCode();
        } else {
            v0_3 = 0;
        }
        int v0_4 = (v0_3 * 31);
        Long v2 = this.availableBytes;
        if (v2 != null) {
            v1 = v2.hashCode();
        }
        return (this.probes.hashCode() + ((v0_4 + v1) * 31));
    }

    public String toString()
    {
        String v0_0 = this.totalBytes;
        Long v1 = this.availableBytes;
        String v4_3 = this.probes;
        StringBuilder v2_1 = new StringBuilder("MemoryInfoResult(totalBytes=");
        v2_1.append(v0_0);
        v2_1.append(", availableBytes=");
        v2_1.append(v1);
        v2_1.append(", probes=");
        v2_1.append(v4_3);
        v2_1.append(")");
        return v2_1.toString();
    }
}
