.class public final Lh2/g;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# instance fields
.field public a:[Le0/i;


# virtual methods
.method public final evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p2, [Le0/i;

    .line 2
    .line 3
    check-cast p3, [Le0/i;

    .line 4
    .line 5
    invoke-static {p2, p3}, Lq3/a;->f([Le0/i;[Le0/i;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    iget-object v0, p0, Lh2/g;->a:[Le0/i;

    .line 12
    .line 13
    invoke-static {v0, p2}, Lq3/a;->f([Le0/i;[Le0/i;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-static {p2}, Lq3/a;->y([Le0/i;)[Le0/i;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lh2/g;->a:[Le0/i;

    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    const/4 v1, 0x0

    .line 27
    :goto_0
    array-length v2, p2

    .line 28
    if-ge v1, v2, :cond_2

    .line 29
    .line 30
    iget-object v2, p0, Lh2/g;->a:[Le0/i;

    .line 31
    .line 32
    aget-object v2, v2, v1

    .line 33
    .line 34
    aget-object v3, p2, v1

    .line 35
    .line 36
    aget-object v4, p3, v1

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-char v5, v3, Le0/i;->a:C

    .line 42
    .line 43
    iput-char v5, v2, Le0/i;->a:C

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    :goto_1
    iget-object v6, v3, Le0/i;->b:[F

    .line 47
    .line 48
    array-length v7, v6

    .line 49
    if-ge v5, v7, :cond_1

    .line 50
    .line 51
    iget-object v7, v2, Le0/i;->b:[F

    .line 52
    .line 53
    aget v6, v6, v5

    .line 54
    .line 55
    const/high16 v8, 0x3f800000    # 1.0f

    .line 56
    .line 57
    sub-float/2addr v8, p1

    .line 58
    mul-float v8, v8, v6

    .line 59
    .line 60
    iget-object v6, v4, Le0/i;->b:[F

    .line 61
    .line 62
    aget v6, v6, v5

    .line 63
    .line 64
    mul-float v6, v6, p1

    .line 65
    .line 66
    add-float/2addr v6, v8

    .line 67
    aput v6, v7, v5

    .line 68
    .line 69
    add-int/lit8 v5, v5, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget-object p1, p0, Lh2/g;->a:[Le0/i;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    const-string p2, "Can\'t interpolate between two incompatible pathData"

    .line 81
    .line 82
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method
