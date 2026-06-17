package com.lele.llmonitor.ui.soc;
public final class SocUiState {
    public static final int $stable = 8;
    private final String error;
    private final boolean isLoading;
    private final com.lele.llmonitor.data.soc.SocSnapshot snapshot;

    public SocUiState()
    {
        this(0, 0, 0, 7, 0);
        return;
    }

    public SocUiState(boolean p1, com.lele.llmonitor.data.soc.SocSnapshot p2, String p3)
    {
        this.isLoading = p1;
        this.snapshot = p2;
        this.error = p3;
        return;
    }

    public synthetic SocUiState(boolean p2, com.lele.llmonitor.data.soc.SocSnapshot p3, String p4, int p5, ic0 p6)
    {
        if ((p5 & 1) != 0) {
            p2 = 1;
        }
        if ((p5 & 2) != 0) {
            p3 = 0;
        }
        if ((p5 & 4) != 0) {
            p4 = 0;
        }
        this(p2, p3, p4);
        return;
    }

    public static synthetic com.lele.llmonitor.ui.soc.SocUiState copy$default(com.lele.llmonitor.ui.soc.SocUiState p0, boolean p1, com.lele.llmonitor.data.soc.SocSnapshot p2, String p3, int p4, Object p5)
    {
        if ((p4 & 1) != 0) {
            p1 = p0.isLoading;
        }
        if ((p4 & 2) != 0) {
            p2 = p0.snapshot;
        }
        if ((p4 & 4) != 0) {
            p3 = p0.error;
        }
        return p0.copy(p1, p2, p3);
    }

    public final boolean component1()
    {
        return this.isLoading;
    }

    public final com.lele.llmonitor.data.soc.SocSnapshot component2()
    {
        return this.snapshot;
    }

    public final String component3()
    {
        return this.error;
    }

    public final com.lele.llmonitor.ui.soc.SocUiState copy(boolean p1, com.lele.llmonitor.data.soc.SocSnapshot p2, String p3)
    {
        this = new com.lele.llmonitor.ui.soc.SocUiState;
        this(p1, p2, p3);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.ui.soc.SocUiState)) {
                if (this.isLoading == ((com.lele.llmonitor.ui.soc.SocUiState) p5).isLoading) {
                    if (ni1.o(this.snapshot, ((com.lele.llmonitor.ui.soc.SocUiState) p5).snapshot)) {
                        if (ni1.o(this.error, ((com.lele.llmonitor.ui.soc.SocUiState) p5).error)) {
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

    public final String getError()
    {
        return this.error;
    }

    public final com.lele.llmonitor.data.soc.SocSnapshot getSnapshot()
    {
        return this.snapshot;
    }

    public int hashCode()
    {
        int v1_1;
        int v0_5 = (Boolean.hashCode(this.isLoading) * 31);
        int v1_0 = this.snapshot;
        int v2 = 0;
        if (v1_0 != 0) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        int v0_2 = ((v0_5 + v1_1) * 31);
        String v3_1 = this.error;
        if (v3_1 != null) {
            v2 = v3_1.hashCode();
        }
        return (v0_2 + v2);
    }

    public final boolean isLoading()
    {
        return this.isLoading;
    }

    public String toString()
    {
        String v0_0 = this.isLoading;
        com.lele.llmonitor.data.soc.SocSnapshot v1 = this.snapshot;
        String v4_2 = this.error;
        StringBuilder v2_1 = new StringBuilder("SocUiState(isLoading=");
        v2_1.append(v0_0);
        v2_1.append(", snapshot=");
        v2_1.append(v1);
        v2_1.append(", error=");
        return ve2.r(v2_1, v4_2, ")");
    }
}
