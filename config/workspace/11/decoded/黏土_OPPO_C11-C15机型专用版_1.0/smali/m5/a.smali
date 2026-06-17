.class public abstract Lm5/a;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final h:J

.field public static final i:J

.field public static final synthetic j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Lm5/b;->a:I

    .line 2
    .line 3
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Le6/l;->l(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    sput-wide v0, Lm5/a;->h:J

    .line 13
    .line 14
    const-wide v0, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Le6/l;->l(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sput-wide v0, Lm5/a;->i:J

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static final a(JJ)J
    .locals 10

    .line 1
    const v0, 0xf4240

    .line 2
    .line 3
    .line 4
    int-to-long v0, v0

    .line 5
    div-long v2, p2, v0

    .line 6
    .line 7
    add-long v4, p0, v2

    .line 8
    .line 9
    const-wide p0, -0x431bde82d7aL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v6, p0, v4

    .line 15
    .line 16
    if-gtz v6, :cond_0

    .line 17
    .line 18
    const-wide p0, 0x431bde82d7bL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v6, v4, p0

    .line 24
    .line 25
    if-gez v6, :cond_0

    .line 26
    .line 27
    mul-long v2, v2, v0

    .line 28
    .line 29
    sub-long/2addr p2, v2

    .line 30
    mul-long v4, v4, v0

    .line 31
    .line 32
    add-long/2addr v4, p2

    .line 33
    const/4 p0, 0x1

    .line 34
    shl-long p0, v4, p0

    .line 35
    .line 36
    sget p2, Lm5/b;->a:I

    .line 37
    .line 38
    return-wide p0

    .line 39
    :cond_0
    const-wide v6, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const-wide v8, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static/range {v4 .. v9}, Lu2/f;->g(JJJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide p0

    .line 53
    invoke-static {p0, p1}, Le6/l;->l(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p0

    .line 57
    return-wide p0
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public static final e(J)Z
    .locals 3

    .line 1
    sget-wide v0, Lm5/a;->h:J

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    sget-wide v0, Lm5/a;->i:J

    .line 8
    .line 9
    cmp-long v2, p0, v0

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method
