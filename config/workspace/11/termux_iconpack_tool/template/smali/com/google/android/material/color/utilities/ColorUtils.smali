.class public Lcom/google/android/material/color/utilities/ColorUtils;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final a:[D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [D

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/material/color/utilities/ColorUtils;->a:[D

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 8
        0x4057c3020c49ba5eL    # 95.047
        0x4059000000000000L    # 100.0
        0x405b3883126e978dL    # 108.883
    .end array-data
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static a(D)D
    .locals 9

    .line 1
    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    .line 2
    .line 3
    add-double/2addr p0, v0

    .line 4
    const-wide/high16 v2, 0x405d000000000000L    # 116.0

    .line 5
    .line 6
    div-double/2addr p0, v2

    .line 7
    mul-double v4, p0, p0

    .line 8
    .line 9
    mul-double v4, v4, p0

    .line 10
    .line 11
    const-wide v6, 0x3f822354d28f7cd6L    # 0.008856451679035631

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmpl-double v8, v4, v6

    .line 17
    .line 18
    if-lez v8, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    mul-double p0, p0, v2

    .line 22
    .line 23
    sub-double/2addr p0, v0

    .line 24
    const-wide v0, 0x408c3a5ed097b426L    # 903.2962962962963

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    div-double v4, p0, v0

    .line 30
    .line 31
    :goto_0
    const-wide/high16 p0, 0x4059000000000000L    # 100.0

    .line 32
    .line 33
    mul-double v4, v4, p0

    .line 34
    .line 35
    return-wide v4
    .line 36
    .line 37
.end method
