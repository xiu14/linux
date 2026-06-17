package com.lele.llmonitor.data.soc;
final class PolicyFrequency {
    private final Long currentKhz;
    private final Long maxKhz;
    private final String name;
    private final java.util.Set relatedCores;

    public PolicyFrequency(String p1, java.util.Set p2, Long p3, Long p4)
    {
        p1.getClass();
        p2.getClass();
        this.name = p1;
        this.relatedCores = p2;
        this.currentKhz = p3;
        this.maxKhz = p4;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.PolicyFrequency copy$default(com.lele.llmonitor.data.soc.PolicyFrequency p0, String p1, java.util.Set p2, Long p3, Long p4, int p5, Object p6)
    {
        if ((p5 & 1) != 0) {
            p1 = p0.name;
        }
        if ((p5 & 2) != 0) {
            p2 = p0.relatedCores;
        }
        if ((p5 & 4) != 0) {
            p3 = p0.currentKhz;
        }
        if ((p5 & 8) != 0) {
            p4 = p0.maxKhz;
        }
        return p0.copy(p1, p2, p3, p4);
    }

    public final String component1()
    {
        return this.name;
    }

    public final java.util.Set component2()
    {
        return this.relatedCores;
    }

    public final Long component3()
    {
        return this.currentKhz;
    }

    public final Long component4()
    {
        return this.maxKhz;
    }

    public final com.lele.llmonitor.data.soc.PolicyFrequency copy(String p1, java.util.Set p2, Long p3, Long p4)
    {
        p1.getClass();
        p2.getClass();
        this = new com.lele.llmonitor.data.soc.PolicyFrequency;
        this(p1, p2, p3, p4);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.soc.PolicyFrequency)) {
                if (ni1.o(this.name, ((com.lele.llmonitor.data.soc.PolicyFrequency) p5).name)) {
                    if (ni1.o(this.relatedCores, ((com.lele.llmonitor.data.soc.PolicyFrequency) p5).relatedCores)) {
                        if (ni1.o(this.currentKhz, ((com.lele.llmonitor.data.soc.PolicyFrequency) p5).currentKhz)) {
                            if (ni1.o(this.maxKhz, ((com.lele.llmonitor.data.soc.PolicyFrequency) p5).maxKhz)) {
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
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final Long getCurrentKhz()
    {
        return this.currentKhz;
    }

    public final Long getMaxKhz()
    {
        return this.maxKhz;
    }

    public final String getName()
    {
        return this.name;
    }

    public final java.util.Set getRelatedCores()
    {
        return this.relatedCores;
    }

    public int hashCode()
    {
        int v0_1;
        int v1_6 = ((this.relatedCores.hashCode() + (this.name.hashCode() * 31)) * 31);
        int v0_4 = this.currentKhz;
        int v2 = 0;
        if (v0_4 != 0) {
            v0_1 = v0_4.hashCode();
        } else {
            v0_1 = 0;
        }
        int v1_1 = ((v1_6 + v0_1) * 31);
        Long v3_1 = this.maxKhz;
        if (v3_1 != null) {
            v2 = v3_1.hashCode();
        }
        return (v1_1 + v2);
    }

    public String toString()
    {
        String v0_0 = this.name;
        java.util.Set v1 = this.relatedCores;
        Long v2 = this.currentKhz;
        String v5_3 = this.maxKhz;
        StringBuilder v3_1 = new StringBuilder("PolicyFrequency(name=");
        v3_1.append(v0_0);
        v3_1.append(", relatedCores=");
        v3_1.append(v1);
        v3_1.append(", currentKhz=");
        v3_1.append(v2);
        v3_1.append(", maxKhz=");
        v3_1.append(v5_3);
        v3_1.append(")");
        return v3_1.toString();
    }
}
