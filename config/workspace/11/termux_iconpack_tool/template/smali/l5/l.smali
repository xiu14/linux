.class public abstract Ll5/l;
.super Ll5/k;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method public static c0(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 10

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, La/a;->k(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/16 v4, 0x30

    .line 19
    .line 20
    invoke-static {v3, v4}, Lkotlin/jvm/internal/j;->g(II)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const v5, -0x7fffffff

    .line 25
    .line 26
    .line 27
    if-gez v4, :cond_4

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    if-ne v1, v4, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    const/16 v6, 0x2b

    .line 34
    .line 35
    if-eq v3, v6, :cond_3

    .line 36
    .line 37
    const/16 v5, 0x2d

    .line 38
    .line 39
    if-eq v3, v5, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/high16 v5, -0x80000000

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const/4 v3, 0x0

    .line 47
    goto :goto_0

    .line 48
    :cond_4
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x0

    .line 50
    :goto_0
    const v6, -0x38e38e3

    .line 51
    .line 52
    .line 53
    const v7, -0x38e38e3

    .line 54
    .line 55
    .line 56
    :goto_1
    if-ge v4, v1, :cond_9

    .line 57
    .line 58
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    invoke-static {v8, v0}, Ljava/lang/Character;->digit(II)I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-gez v8, :cond_5

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    if-ge v2, v7, :cond_6

    .line 70
    .line 71
    if-ne v7, v6, :cond_7

    .line 72
    .line 73
    div-int/lit8 v7, v5, 0xa

    .line 74
    .line 75
    if-ge v2, v7, :cond_6

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_6
    mul-int/lit8 v2, v2, 0xa

    .line 79
    .line 80
    add-int v9, v5, v8

    .line 81
    .line 82
    if-ge v2, v9, :cond_8

    .line 83
    .line 84
    :cond_7
    :goto_2
    const/4 p0, 0x0

    .line 85
    return-object p0

    .line 86
    :cond_8
    sub-int/2addr v2, v8

    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_9
    if-eqz v3, :cond_a

    .line 91
    .line 92
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_a
    neg-int p0, v2

    .line 98
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
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

.method public static d0(Ljava/lang/String;)Ljava/lang/Long;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "<this>"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-static {v1}, La/a;->k(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    const/4 v3, 0x0

    .line 21
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/16 v5, 0x30

    .line 26
    .line 27
    invoke-static {v4, v5}, Lkotlin/jvm/internal/j;->g(II)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    if-gez v5, :cond_4

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    if-ne v2, v5, :cond_1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const/16 v8, 0x2b

    .line 43
    .line 44
    if-eq v4, v8, :cond_3

    .line 45
    .line 46
    const/16 v3, 0x2d

    .line 47
    .line 48
    if-eq v4, v3, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const-wide/high16 v6, -0x8000000000000000L

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 v3, 0x1

    .line 56
    :cond_4
    const/4 v5, 0x0

    .line 57
    :goto_0
    const-wide v8, -0x38e38e38e38e38eL    # -2.772000429909333E291

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    const-wide/16 v10, 0x0

    .line 63
    .line 64
    move-wide v12, v8

    .line 65
    :goto_1
    if-ge v3, v2, :cond_9

    .line 66
    .line 67
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-static {v4, v1}, Ljava/lang/Character;->digit(II)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-gez v4, :cond_5

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    cmp-long v14, v10, v12

    .line 79
    .line 80
    if-gez v14, :cond_6

    .line 81
    .line 82
    cmp-long v14, v12, v8

    .line 83
    .line 84
    if-nez v14, :cond_7

    .line 85
    .line 86
    int-to-long v12, v1

    .line 87
    div-long v12, v6, v12

    .line 88
    .line 89
    cmp-long v14, v10, v12

    .line 90
    .line 91
    if-gez v14, :cond_6

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_6
    int-to-long v14, v1

    .line 95
    mul-long v10, v10, v14

    .line 96
    .line 97
    int-to-long v14, v4

    .line 98
    add-long v16, v6, v14

    .line 99
    .line 100
    cmp-long v4, v10, v16

    .line 101
    .line 102
    if-gez v4, :cond_8

    .line 103
    .line 104
    :cond_7
    :goto_2
    const/4 v0, 0x0

    .line 105
    return-object v0

    .line 106
    :cond_8
    sub-long/2addr v10, v14

    .line 107
    add-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_9
    if-eqz v5, :cond_a

    .line 111
    .line 112
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    return-object v0

    .line 117
    :cond_a
    neg-long v0, v10

    .line 118
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0
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
