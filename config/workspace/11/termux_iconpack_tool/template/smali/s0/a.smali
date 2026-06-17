.class public final Ls0/a;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public a:I

.field public b:I

.field public c:F

.field public d:F

.field public e:J

.field public f:J

.field public g:J

.field public h:F

.field public i:I


# virtual methods
.method public final a(J)F
    .locals 9

    .line 1
    iget-wide v0, p0, Ls0/a;->e:J

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    cmp-long v3, p1, v0

    .line 5
    .line 6
    if-gez v3, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-wide v3, p0, Ls0/a;->g:J

    .line 10
    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    const/high16 v7, 0x3f800000    # 1.0f

    .line 14
    .line 15
    cmp-long v8, v3, v5

    .line 16
    .line 17
    if-ltz v8, :cond_2

    .line 18
    .line 19
    cmp-long v5, p1, v3

    .line 20
    .line 21
    if-gez v5, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    sub-long/2addr p1, v3

    .line 25
    iget v0, p0, Ls0/a;->h:F

    .line 26
    .line 27
    sub-float v1, v7, v0

    .line 28
    .line 29
    long-to-float p1, p1

    .line 30
    iget p2, p0, Ls0/a;->i:I

    .line 31
    .line 32
    int-to-float p2, p2

    .line 33
    div-float/2addr p1, p2

    .line 34
    invoke-static {p1, v2, v7}, Ls0/g;->b(FFF)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    mul-float p1, p1, v0

    .line 39
    .line 40
    add-float/2addr p1, v1

    .line 41
    return p1

    .line 42
    :cond_2
    :goto_0
    sub-long/2addr p1, v0

    .line 43
    long-to-float p1, p1

    .line 44
    iget p2, p0, Ls0/a;->a:I

    .line 45
    .line 46
    int-to-float p2, p2

    .line 47
    div-float/2addr p1, p2

    .line 48
    invoke-static {p1, v2, v7}, Ls0/g;->b(FFF)F

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    const/high16 p2, 0x3f000000    # 0.5f

    .line 53
    .line 54
    mul-float p1, p1, p2

    .line 55
    .line 56
    return p1
    .line 57
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method
