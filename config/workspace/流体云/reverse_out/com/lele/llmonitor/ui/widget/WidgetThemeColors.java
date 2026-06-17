package com.lele.llmonitor.ui.widget;
final class WidgetThemeColors {
    private final kx background;
    private final kx onSurface;
    private final kx onSurfaceVariant;
    private final kx outline;
    private final kx primary;
    private final kx progressTrack;
    private final kx secondary;

    public WidgetThemeColors(kx p1, kx p2, kx p3, kx p4, kx p5, kx p6, kx p7)
    {
        p1.getClass();
        p2.getClass();
        p3.getClass();
        p4.getClass();
        p5.getClass();
        p6.getClass();
        p7.getClass();
        this.background = p1;
        this.primary = p2;
        this.secondary = p3;
        this.onSurface = p4;
        this.onSurfaceVariant = p5;
        this.outline = p6;
        this.progressTrack = p7;
        return;
    }

    public static synthetic com.lele.llmonitor.ui.widget.WidgetThemeColors copy$default(com.lele.llmonitor.ui.widget.WidgetThemeColors p0, kx p1, kx p2, kx p3, kx p4, kx p5, kx p6, kx p7, int p8, Object p9)
    {
        if ((p8 & 1) != 0) {
            p1 = p0.background;
        }
        if ((p8 & 2) != 0) {
            p2 = p0.primary;
        }
        if ((p8 & 4) != 0) {
            p3 = p0.secondary;
        }
        if ((p8 & 8) != 0) {
            p4 = p0.onSurface;
        }
        if ((p8 & 16) != 0) {
            p5 = p0.onSurfaceVariant;
        }
        if ((p8 & 32) != 0) {
            p6 = p0.outline;
        }
        if ((p8 & 64) != 0) {
            p7 = p0.progressTrack;
        }
        return p0.copy(p1, p2, p3, p4, p5, p6, p7);
    }

    public final kx component1()
    {
        return this.background;
    }

    public final kx component2()
    {
        return this.primary;
    }

    public final kx component3()
    {
        return this.secondary;
    }

    public final kx component4()
    {
        return this.onSurface;
    }

    public final kx component5()
    {
        return this.onSurfaceVariant;
    }

    public final kx component6()
    {
        return this.outline;
    }

    public final kx component7()
    {
        return this.progressTrack;
    }

    public final com.lele.llmonitor.ui.widget.WidgetThemeColors copy(kx p1, kx p2, kx p3, kx p4, kx p5, kx p6, kx p7)
    {
        p1.getClass();
        p2.getClass();
        p3.getClass();
        p4.getClass();
        p5.getClass();
        p6.getClass();
        p7.getClass();
        return new com.lele.llmonitor.ui.widget.WidgetThemeColors(p1, p2, p3, p4, p5, p6, p7);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.ui.widget.WidgetThemeColors)) {
                if (ni1.o(this.background, ((com.lele.llmonitor.ui.widget.WidgetThemeColors) p5).background)) {
                    if (ni1.o(this.primary, ((com.lele.llmonitor.ui.widget.WidgetThemeColors) p5).primary)) {
                        if (ni1.o(this.secondary, ((com.lele.llmonitor.ui.widget.WidgetThemeColors) p5).secondary)) {
                            if (ni1.o(this.onSurface, ((com.lele.llmonitor.ui.widget.WidgetThemeColors) p5).onSurface)) {
                                if (ni1.o(this.onSurfaceVariant, ((com.lele.llmonitor.ui.widget.WidgetThemeColors) p5).onSurfaceVariant)) {
                                    if (ni1.o(this.outline, ((com.lele.llmonitor.ui.widget.WidgetThemeColors) p5).outline)) {
                                        if (ni1.o(this.progressTrack, ((com.lele.llmonitor.ui.widget.WidgetThemeColors) p5).progressTrack)) {
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

    public final kx getBackground()
    {
        return this.background;
    }

    public final kx getOnSurface()
    {
        return this.onSurface;
    }

    public final kx getOnSurfaceVariant()
    {
        return this.onSurfaceVariant;
    }

    public final kx getOutline()
    {
        return this.outline;
    }

    public final kx getPrimary()
    {
        return this.primary;
    }

    public final kx getProgressTrack()
    {
        return this.progressTrack;
    }

    public final kx getSecondary()
    {
        return this.secondary;
    }

    public int hashCode()
    {
        return (this.progressTrack.hashCode() + ((this.outline.hashCode() + ((this.onSurfaceVariant.hashCode() + ((this.onSurface.hashCode() + ((this.secondary.hashCode() + ((this.primary.hashCode() + (this.background.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31));
    }

    public String toString()
    {
        String v0_0 = this.background;
        kx v1 = this.primary;
        kx v2 = this.secondary;
        kx v3 = this.onSurface;
        kx v4 = this.onSurfaceVariant;
        kx v5 = this.outline;
        String v8_3 = this.progressTrack;
        StringBuilder v6_1 = new StringBuilder("WidgetThemeColors(background=");
        v6_1.append(v0_0);
        v6_1.append(", primary=");
        v6_1.append(v1);
        v6_1.append(", secondary=");
        v6_1.append(v2);
        v6_1.append(", onSurface=");
        v6_1.append(v3);
        v6_1.append(", onSurfaceVariant=");
        v6_1.append(v4);
        v6_1.append(", outline=");
        v6_1.append(v5);
        v6_1.append(", progressTrack=");
        v6_1.append(v8_3);
        v6_1.append(")");
        return v6_1.toString();
    }
}
