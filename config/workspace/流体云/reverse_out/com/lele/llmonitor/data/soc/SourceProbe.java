package com.lele.llmonitor.data.soc;
public final class SourceProbe {
    public static final int $stable;
    private final String source;
    private final boolean success;
    private final String value;

    public SourceProbe(String p1, String p2, boolean p3)
    {
        p1.getClass();
        p2.getClass();
        this.source = p1;
        this.value = p2;
        this.success = p3;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.SourceProbe copy$default(com.lele.llmonitor.data.soc.SourceProbe p0, String p1, String p2, boolean p3, int p4, Object p5)
    {
        if ((p4 & 1) != 0) {
            p1 = p0.source;
        }
        if ((p4 & 2) != 0) {
            p2 = p0.value;
        }
        if ((p4 & 4) != 0) {
            p3 = p0.success;
        }
        return p0.copy(p1, p2, p3);
    }

    public final String component1()
    {
        return this.source;
    }

    public final String component2()
    {
        return this.value;
    }

    public final boolean component3()
    {
        return this.success;
    }

    public final com.lele.llmonitor.data.soc.SourceProbe copy(String p1, String p2, boolean p3)
    {
        p1.getClass();
        p2.getClass();
        this = new com.lele.llmonitor.data.soc.SourceProbe;
        this(p1, p2, p3);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.soc.SourceProbe)) {
                if (ni1.o(this.source, ((com.lele.llmonitor.data.soc.SourceProbe) p5).source)) {
                    if (ni1.o(this.value, ((com.lele.llmonitor.data.soc.SourceProbe) p5).value)) {
                        if (this.success == ((com.lele.llmonitor.data.soc.SourceProbe) p5).success) {
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

    public final String getSource()
    {
        return this.source;
    }

    public final boolean getSuccess()
    {
        return this.success;
    }

    public final String getValue()
    {
        return this.value;
    }

    public int hashCode()
    {
        return (Boolean.hashCode(this.success) + s42.d(this.value, (this.source.hashCode() * 31), 31));
    }

    public String toString()
    {
        String v0_0 = this.source;
        String v1 = this.value;
        String v4_3 = this.success;
        StringBuilder v2_1 = new StringBuilder("SourceProbe(source=");
        v2_1.append(v0_0);
        v2_1.append(", value=");
        v2_1.append(v1);
        v2_1.append(", success=");
        v2_1.append(v4_3);
        v2_1.append(")");
        return v2_1.toString();
    }
}
