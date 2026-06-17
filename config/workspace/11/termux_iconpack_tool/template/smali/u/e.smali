.class public final Lu/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static o:I = 0x3e8

.field public static p:Z = true


# instance fields
.field public a:I

.field public final b:Lu/g;

.field public c:I

.field public d:I

.field public e:[Lu/c;

.field public f:Z

.field public g:[Z

.field public h:I

.field public i:I

.field public j:I

.field public final k:Lu2/n;

.field public l:[Lu/i;

.field public m:I

.field public n:Lu/c;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lu/e;->a:I

    .line 6
    .line 7
    const/16 v1, 0x20

    .line 8
    .line 9
    iput v1, p0, Lu/e;->c:I

    .line 10
    .line 11
    iput v1, p0, Lu/e;->d:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-object v2, p0, Lu/e;->e:[Lu/c;

    .line 15
    .line 16
    iput-boolean v0, p0, Lu/e;->f:Z

    .line 17
    .line 18
    new-array v2, v1, [Z

    .line 19
    .line 20
    iput-object v2, p0, Lu/e;->g:[Z

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    iput v2, p0, Lu/e;->h:I

    .line 24
    .line 25
    iput v0, p0, Lu/e;->i:I

    .line 26
    .line 27
    iput v1, p0, Lu/e;->j:I

    .line 28
    .line 29
    sget v2, Lu/e;->o:I

    .line 30
    .line 31
    new-array v2, v2, [Lu/i;

    .line 32
    .line 33
    iput-object v2, p0, Lu/e;->l:[Lu/i;

    .line 34
    .line 35
    iput v0, p0, Lu/e;->m:I

    .line 36
    .line 37
    new-array v2, v1, [Lu/c;

    .line 38
    .line 39
    iput-object v2, p0, Lu/e;->e:[Lu/c;

    .line 40
    .line 41
    invoke-virtual {p0}, Lu/e;->q()V

    .line 42
    .line 43
    .line 44
    new-instance v2, Lu2/n;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v3, Ll0/c;

    .line 50
    .line 51
    invoke-direct {v3}, Ll0/c;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v3, v2, Lu2/n;->h:Ljava/lang/Object;

    .line 55
    .line 56
    new-instance v3, Ll0/c;

    .line 57
    .line 58
    invoke-direct {v3}, Ll0/c;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v3, v2, Lu2/n;->i:Ljava/lang/Object;

    .line 62
    .line 63
    new-instance v3, Ll0/c;

    .line 64
    .line 65
    invoke-direct {v3}, Ll0/c;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v3, v2, Lu2/n;->j:Ljava/lang/Object;

    .line 69
    .line 70
    new-array v1, v1, [Lu/i;

    .line 71
    .line 72
    iput-object v1, v2, Lu2/n;->k:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v2, p0, Lu/e;->k:Lu2/n;

    .line 75
    .line 76
    new-instance v1, Lu/g;

    .line 77
    .line 78
    invoke-direct {v1, v2}, Lu/c;-><init>(Lu2/n;)V

    .line 79
    .line 80
    .line 81
    const/16 v3, 0x80

    .line 82
    .line 83
    new-array v4, v3, [Lu/i;

    .line 84
    .line 85
    iput-object v4, v1, Lu/g;->f:[Lu/i;

    .line 86
    .line 87
    new-array v3, v3, [Lu/i;

    .line 88
    .line 89
    iput-object v3, v1, Lu/g;->g:[Lu/i;

    .line 90
    .line 91
    iput v0, v1, Lu/g;->h:I

    .line 92
    .line 93
    new-instance v0, Lu/f;

    .line 94
    .line 95
    invoke-direct {v0, v1}, Lu/f;-><init>(Lu/g;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, v1, Lu/g;->i:Lu/f;

    .line 99
    .line 100
    iput-object v1, p0, Lu/e;->b:Lu/g;

    .line 101
    .line 102
    sget-boolean v0, Lu/e;->p:Z

    .line 103
    .line 104
    if-eqz v0, :cond_0

    .line 105
    .line 106
    new-instance v0, Lu/d;

    .line 107
    .line 108
    invoke-direct {v0, v2}, Lu/d;-><init>(Lu2/n;)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, Lu/e;->n:Lu/c;

    .line 112
    .line 113
    return-void

    .line 114
    :cond_0
    new-instance v0, Lu/c;

    .line 115
    .line 116
    invoke-direct {v0, v2}, Lu/c;-><init>(Lu2/n;)V

    .line 117
    .line 118
    .line 119
    iput-object v0, p0, Lu/e;->n:Lu/c;

    .line 120
    .line 121
    return-void
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public static m(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p0, Lv/c;

    .line 2
    .line 3
    iget-object p0, p0, Lv/c;->g:Lu/i;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget p0, p0, Lu/i;->e:F

    .line 8
    .line 9
    const/high16 v0, 0x3f000000    # 0.5f

    .line 10
    .line 11
    add-float/2addr p0, v0

    .line 12
    float-to-int p0, p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public final a(I)Lu/i;
    .locals 3

    .line 1
    iget-object v0, p0, Lu/e;->k:Lu2/n;

    .line 2
    .line 3
    iget-object v0, v0, Lu2/n;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ll0/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Ll0/c;->a()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lu/i;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lu/i;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lu/i;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput p1, v0, Lu/i;->l:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0}, Lu/i;->c()V

    .line 24
    .line 25
    .line 26
    iput p1, v0, Lu/i;->l:I

    .line 27
    .line 28
    :goto_0
    iget p1, p0, Lu/e;->m:I

    .line 29
    .line 30
    sget v1, Lu/e;->o:I

    .line 31
    .line 32
    if-lt p1, v1, :cond_1

    .line 33
    .line 34
    mul-int/lit8 v1, v1, 0x2

    .line 35
    .line 36
    sput v1, Lu/e;->o:I

    .line 37
    .line 38
    iget-object p1, p0, Lu/e;->l:[Lu/i;

    .line 39
    .line 40
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, [Lu/i;

    .line 45
    .line 46
    iput-object p1, p0, Lu/e;->l:[Lu/i;

    .line 47
    .line 48
    :cond_1
    iget-object p1, p0, Lu/e;->l:[Lu/i;

    .line 49
    .line 50
    iget v1, p0, Lu/e;->m:I

    .line 51
    .line 52
    add-int/lit8 v2, v1, 0x1

    .line 53
    .line 54
    iput v2, p0, Lu/e;->m:I

    .line 55
    .line 56
    aput-object v0, p1, v1

    .line 57
    .line 58
    return-object v0
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

.method public final b(Lu/i;Lu/i;IFLu/i;Lu/i;II)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lu/e;->k()Lu/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    if-ne p2, p5, :cond_0

    .line 8
    .line 9
    iget-object p3, v0, Lu/c;->d:Lu/b;

    .line 10
    .line 11
    invoke-interface {p3, p1, v1}, Lu/b;->h(Lu/i;F)V

    .line 12
    .line 13
    .line 14
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 15
    .line 16
    invoke-interface {p1, p6, v1}, Lu/b;->h(Lu/i;F)V

    .line 17
    .line 18
    .line 19
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 20
    .line 21
    const/high16 p3, -0x40000000    # -2.0f

    .line 22
    .line 23
    invoke-interface {p1, p2, p3}, Lu/b;->h(Lu/i;F)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_0
    const/high16 v2, 0x3f000000    # 0.5f

    .line 29
    .line 30
    const/high16 v3, -0x40800000    # -1.0f

    .line 31
    .line 32
    cmpl-float v2, p4, v2

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    iget-object p4, v0, Lu/c;->d:Lu/b;

    .line 37
    .line 38
    invoke-interface {p4, p1, v1}, Lu/b;->h(Lu/i;F)V

    .line 39
    .line 40
    .line 41
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 42
    .line 43
    invoke-interface {p1, p2, v3}, Lu/b;->h(Lu/i;F)V

    .line 44
    .line 45
    .line 46
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 47
    .line 48
    invoke-interface {p1, p5, v3}, Lu/b;->h(Lu/i;F)V

    .line 49
    .line 50
    .line 51
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 52
    .line 53
    invoke-interface {p1, p6, v1}, Lu/b;->h(Lu/i;F)V

    .line 54
    .line 55
    .line 56
    if-gtz p3, :cond_1

    .line 57
    .line 58
    if-lez p7, :cond_6

    .line 59
    .line 60
    :cond_1
    neg-int p1, p3

    .line 61
    add-int/2addr p1, p7

    .line 62
    int-to-float p1, p1

    .line 63
    iput p1, v0, Lu/c;->b:F

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const/4 v2, 0x0

    .line 67
    cmpg-float v2, p4, v2

    .line 68
    .line 69
    if-gtz v2, :cond_3

    .line 70
    .line 71
    iget-object p4, v0, Lu/c;->d:Lu/b;

    .line 72
    .line 73
    invoke-interface {p4, p1, v3}, Lu/b;->h(Lu/i;F)V

    .line 74
    .line 75
    .line 76
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 77
    .line 78
    invoke-interface {p1, p2, v1}, Lu/b;->h(Lu/i;F)V

    .line 79
    .line 80
    .line 81
    int-to-float p1, p3

    .line 82
    iput p1, v0, Lu/c;->b:F

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    cmpl-float v2, p4, v1

    .line 86
    .line 87
    if-ltz v2, :cond_4

    .line 88
    .line 89
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 90
    .line 91
    invoke-interface {p1, p6, v3}, Lu/b;->h(Lu/i;F)V

    .line 92
    .line 93
    .line 94
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 95
    .line 96
    invoke-interface {p1, p5, v1}, Lu/b;->h(Lu/i;F)V

    .line 97
    .line 98
    .line 99
    neg-int p1, p7

    .line 100
    int-to-float p1, p1

    .line 101
    iput p1, v0, Lu/c;->b:F

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    iget-object v2, v0, Lu/c;->d:Lu/b;

    .line 105
    .line 106
    sub-float v4, v1, p4

    .line 107
    .line 108
    mul-float v5, v4, v1

    .line 109
    .line 110
    invoke-interface {v2, p1, v5}, Lu/b;->h(Lu/i;F)V

    .line 111
    .line 112
    .line 113
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 114
    .line 115
    mul-float v2, v4, v3

    .line 116
    .line 117
    invoke-interface {p1, p2, v2}, Lu/b;->h(Lu/i;F)V

    .line 118
    .line 119
    .line 120
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 121
    .line 122
    mul-float v3, v3, p4

    .line 123
    .line 124
    invoke-interface {p1, p5, v3}, Lu/b;->h(Lu/i;F)V

    .line 125
    .line 126
    .line 127
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 128
    .line 129
    mul-float v1, v1, p4

    .line 130
    .line 131
    invoke-interface {p1, p6, v1}, Lu/b;->h(Lu/i;F)V

    .line 132
    .line 133
    .line 134
    if-gtz p3, :cond_5

    .line 135
    .line 136
    if-lez p7, :cond_6

    .line 137
    .line 138
    :cond_5
    neg-int p1, p3

    .line 139
    int-to-float p1, p1

    .line 140
    mul-float p1, p1, v4

    .line 141
    .line 142
    int-to-float p2, p7

    .line 143
    mul-float p2, p2, p4

    .line 144
    .line 145
    add-float/2addr p2, p1

    .line 146
    iput p2, v0, Lu/c;->b:F

    .line 147
    .line 148
    :cond_6
    :goto_0
    const/16 p1, 0x8

    .line 149
    .line 150
    if-eq p8, p1, :cond_7

    .line 151
    .line 152
    invoke-virtual {v0, p0, p8}, Lu/c;->a(Lu/e;I)V

    .line 153
    .line 154
    .line 155
    :cond_7
    invoke-virtual {p0, v0}, Lu/e;->c(Lu/c;)V

    .line 156
    .line 157
    .line 158
    return-void
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
.end method

.method public final c(Lu/c;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lu/e;->i:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    add-int/2addr v2, v3

    .line 9
    iget v4, v0, Lu/e;->j:I

    .line 10
    .line 11
    if-ge v2, v4, :cond_0

    .line 12
    .line 13
    iget v2, v0, Lu/e;->h:I

    .line 14
    .line 15
    add-int/2addr v2, v3

    .line 16
    iget v4, v0, Lu/e;->d:I

    .line 17
    .line 18
    if-lt v2, v4, :cond_1

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Lu/e;->n()V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-boolean v2, v1, Lu/c;->e:Z

    .line 24
    .line 25
    if-nez v2, :cond_1e

    .line 26
    .line 27
    iget-object v2, v1, Lu/c;->c:Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v5, v0, Lu/e;->e:[Lu/c;

    .line 30
    .line 31
    array-length v5, v5

    .line 32
    const/4 v6, -0x1

    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_2
    const/4 v5, 0x0

    .line 37
    :goto_0
    if-nez v5, :cond_9

    .line 38
    .line 39
    iget-object v7, v1, Lu/c;->d:Lu/b;

    .line 40
    .line 41
    invoke-interface {v7}, Lu/b;->d()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const/4 v8, 0x0

    .line 46
    :goto_1
    if-ge v8, v7, :cond_5

    .line 47
    .line 48
    iget-object v9, v1, Lu/c;->d:Lu/b;

    .line 49
    .line 50
    invoke-interface {v9, v8}, Lu/b;->i(I)Lu/i;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    iget v10, v9, Lu/i;->c:I

    .line 55
    .line 56
    if-ne v10, v6, :cond_3

    .line 57
    .line 58
    iget-boolean v10, v9, Lu/i;->f:Z

    .line 59
    .line 60
    if-eqz v10, :cond_4

    .line 61
    .line 62
    :cond_3
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-lez v7, :cond_8

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    const/4 v8, 0x0

    .line 79
    :goto_2
    if-ge v8, v7, :cond_7

    .line 80
    .line 81
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    add-int/lit8 v8, v8, 0x1

    .line 86
    .line 87
    check-cast v9, Lu/i;

    .line 88
    .line 89
    iget-boolean v10, v9, Lu/i;->f:Z

    .line 90
    .line 91
    if-eqz v10, :cond_6

    .line 92
    .line 93
    invoke-virtual {v1, v9, v3}, Lu/c;->g(Lu/i;Z)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_6
    iget-object v10, v0, Lu/e;->e:[Lu/c;

    .line 98
    .line 99
    iget v9, v9, Lu/i;->c:I

    .line 100
    .line 101
    aget-object v9, v10, v9

    .line 102
    .line 103
    invoke-virtual {v1, v9, v3}, Lu/c;->h(Lu/c;Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_8
    const/4 v5, 0x1

    .line 112
    goto :goto_0

    .line 113
    :cond_9
    :goto_3
    iget-object v2, v1, Lu/c;->a:Lu/i;

    .line 114
    .line 115
    const/4 v5, 0x0

    .line 116
    if-nez v2, :cond_a

    .line 117
    .line 118
    iget v2, v1, Lu/c;->b:F

    .line 119
    .line 120
    cmpl-float v2, v2, v5

    .line 121
    .line 122
    if-nez v2, :cond_a

    .line 123
    .line 124
    iget-object v2, v1, Lu/c;->d:Lu/b;

    .line 125
    .line 126
    invoke-interface {v2}, Lu/b;->d()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_a

    .line 131
    .line 132
    goto/16 :goto_f

    .line 133
    .line 134
    :cond_a
    iget v2, v1, Lu/c;->b:F

    .line 135
    .line 136
    cmpg-float v7, v2, v5

    .line 137
    .line 138
    if-gez v7, :cond_b

    .line 139
    .line 140
    const/high16 v7, -0x40800000    # -1.0f

    .line 141
    .line 142
    mul-float v2, v2, v7

    .line 143
    .line 144
    iput v2, v1, Lu/c;->b:F

    .line 145
    .line 146
    iget-object v2, v1, Lu/c;->d:Lu/b;

    .line 147
    .line 148
    invoke-interface {v2}, Lu/b;->k()V

    .line 149
    .line 150
    .line 151
    :cond_b
    iget-object v2, v1, Lu/c;->d:Lu/b;

    .line 152
    .line 153
    invoke-interface {v2}, Lu/b;->d()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    const/4 v7, 0x0

    .line 158
    move-object v9, v7

    .line 159
    move-object v10, v9

    .line 160
    const/4 v8, 0x0

    .line 161
    const/4 v11, 0x0

    .line 162
    const/4 v12, 0x0

    .line 163
    const/4 v13, 0x0

    .line 164
    const/4 v14, 0x0

    .line 165
    :goto_4
    if-ge v8, v2, :cond_14

    .line 166
    .line 167
    iget-object v15, v1, Lu/c;->d:Lu/b;

    .line 168
    .line 169
    invoke-interface {v15, v8}, Lu/b;->a(I)F

    .line 170
    .line 171
    .line 172
    move-result v15

    .line 173
    iget-object v4, v1, Lu/c;->d:Lu/b;

    .line 174
    .line 175
    invoke-interface {v4, v8}, Lu/b;->i(I)Lu/i;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    const/16 v16, 0x0

    .line 180
    .line 181
    iget v5, v4, Lu/i;->l:I

    .line 182
    .line 183
    if-ne v5, v3, :cond_f

    .line 184
    .line 185
    if-nez v9, :cond_d

    .line 186
    .line 187
    iget v5, v4, Lu/i;->k:I

    .line 188
    .line 189
    if-gt v5, v3, :cond_c

    .line 190
    .line 191
    :goto_5
    const/4 v12, 0x1

    .line 192
    goto :goto_6

    .line 193
    :cond_c
    const/4 v12, 0x0

    .line 194
    :goto_6
    move-object v9, v4

    .line 195
    move v11, v15

    .line 196
    goto :goto_9

    .line 197
    :cond_d
    cmpl-float v5, v11, v15

    .line 198
    .line 199
    if-lez v5, :cond_e

    .line 200
    .line 201
    iget v5, v4, Lu/i;->k:I

    .line 202
    .line 203
    if-gt v5, v3, :cond_c

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_e
    if-nez v12, :cond_13

    .line 207
    .line 208
    iget v5, v4, Lu/i;->k:I

    .line 209
    .line 210
    if-gt v5, v3, :cond_13

    .line 211
    .line 212
    move-object v9, v4

    .line 213
    move v11, v15

    .line 214
    const/4 v12, 0x1

    .line 215
    goto :goto_9

    .line 216
    :cond_f
    if-nez v9, :cond_13

    .line 217
    .line 218
    cmpg-float v5, v15, v16

    .line 219
    .line 220
    if-gez v5, :cond_13

    .line 221
    .line 222
    if-nez v10, :cond_11

    .line 223
    .line 224
    iget v5, v4, Lu/i;->k:I

    .line 225
    .line 226
    if-gt v5, v3, :cond_10

    .line 227
    .line 228
    :goto_7
    const/4 v14, 0x1

    .line 229
    goto :goto_8

    .line 230
    :cond_10
    const/4 v14, 0x0

    .line 231
    :goto_8
    move-object v10, v4

    .line 232
    move v13, v15

    .line 233
    goto :goto_9

    .line 234
    :cond_11
    cmpl-float v5, v13, v15

    .line 235
    .line 236
    if-lez v5, :cond_12

    .line 237
    .line 238
    iget v5, v4, Lu/i;->k:I

    .line 239
    .line 240
    if-gt v5, v3, :cond_10

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_12
    if-nez v14, :cond_13

    .line 244
    .line 245
    iget v5, v4, Lu/i;->k:I

    .line 246
    .line 247
    if-gt v5, v3, :cond_13

    .line 248
    .line 249
    move-object v10, v4

    .line 250
    move v13, v15

    .line 251
    const/4 v14, 0x1

    .line 252
    :cond_13
    :goto_9
    add-int/lit8 v8, v8, 0x1

    .line 253
    .line 254
    const/4 v5, 0x0

    .line 255
    goto :goto_4

    .line 256
    :cond_14
    const/16 v16, 0x0

    .line 257
    .line 258
    if-eqz v9, :cond_15

    .line 259
    .line 260
    goto :goto_a

    .line 261
    :cond_15
    move-object v9, v10

    .line 262
    :goto_a
    if-nez v9, :cond_16

    .line 263
    .line 264
    const/4 v2, 0x1

    .line 265
    goto :goto_b

    .line 266
    :cond_16
    invoke-virtual {v1, v9}, Lu/c;->f(Lu/i;)V

    .line 267
    .line 268
    .line 269
    const/4 v2, 0x0

    .line 270
    :goto_b
    iget-object v4, v1, Lu/c;->d:Lu/b;

    .line 271
    .line 272
    invoke-interface {v4}, Lu/b;->d()I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    if-nez v4, :cond_17

    .line 277
    .line 278
    iput-boolean v3, v1, Lu/c;->e:Z

    .line 279
    .line 280
    :cond_17
    if-eqz v2, :cond_1d

    .line 281
    .line 282
    iget v2, v0, Lu/e;->h:I

    .line 283
    .line 284
    add-int/2addr v2, v3

    .line 285
    iget v4, v0, Lu/e;->d:I

    .line 286
    .line 287
    if-lt v2, v4, :cond_18

    .line 288
    .line 289
    invoke-virtual {v0}, Lu/e;->n()V

    .line 290
    .line 291
    .line 292
    :cond_18
    const/4 v2, 0x3

    .line 293
    invoke-virtual {v0, v2}, Lu/e;->a(I)Lu/i;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    iget v4, v0, Lu/e;->a:I

    .line 298
    .line 299
    add-int/2addr v4, v3

    .line 300
    iput v4, v0, Lu/e;->a:I

    .line 301
    .line 302
    iget v5, v0, Lu/e;->h:I

    .line 303
    .line 304
    add-int/2addr v5, v3

    .line 305
    iput v5, v0, Lu/e;->h:I

    .line 306
    .line 307
    iput v4, v2, Lu/i;->b:I

    .line 308
    .line 309
    iget-object v5, v0, Lu/e;->k:Lu2/n;

    .line 310
    .line 311
    iget-object v5, v5, Lu2/n;->k:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v5, [Lu/i;

    .line 314
    .line 315
    aput-object v2, v5, v4

    .line 316
    .line 317
    iput-object v2, v1, Lu/c;->a:Lu/i;

    .line 318
    .line 319
    invoke-virtual/range {p0 .. p1}, Lu/e;->h(Lu/c;)V

    .line 320
    .line 321
    .line 322
    iget-object v4, v0, Lu/e;->n:Lu/c;

    .line 323
    .line 324
    iput-object v7, v4, Lu/c;->a:Lu/i;

    .line 325
    .line 326
    iget-object v5, v4, Lu/c;->d:Lu/b;

    .line 327
    .line 328
    invoke-interface {v5}, Lu/b;->clear()V

    .line 329
    .line 330
    .line 331
    const/4 v5, 0x0

    .line 332
    :goto_c
    iget-object v8, v1, Lu/c;->d:Lu/b;

    .line 333
    .line 334
    invoke-interface {v8}, Lu/b;->d()I

    .line 335
    .line 336
    .line 337
    move-result v8

    .line 338
    if-ge v5, v8, :cond_19

    .line 339
    .line 340
    iget-object v8, v1, Lu/c;->d:Lu/b;

    .line 341
    .line 342
    invoke-interface {v8, v5}, Lu/b;->i(I)Lu/i;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    iget-object v9, v1, Lu/c;->d:Lu/b;

    .line 347
    .line 348
    invoke-interface {v9, v5}, Lu/b;->a(I)F

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    iget-object v10, v4, Lu/c;->d:Lu/b;

    .line 353
    .line 354
    invoke-interface {v10, v8, v9, v3}, Lu/b;->f(Lu/i;FZ)V

    .line 355
    .line 356
    .line 357
    add-int/lit8 v5, v5, 0x1

    .line 358
    .line 359
    goto :goto_c

    .line 360
    :cond_19
    iget-object v4, v0, Lu/e;->n:Lu/c;

    .line 361
    .line 362
    invoke-virtual {v0, v4}, Lu/e;->p(Lu/c;)V

    .line 363
    .line 364
    .line 365
    iget v4, v2, Lu/i;->c:I

    .line 366
    .line 367
    if-ne v4, v6, :cond_1c

    .line 368
    .line 369
    iget-object v4, v1, Lu/c;->a:Lu/i;

    .line 370
    .line 371
    if-ne v4, v2, :cond_1a

    .line 372
    .line 373
    invoke-virtual {v1, v7, v2}, Lu/c;->e([ZLu/i;)Lu/i;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    if-eqz v2, :cond_1a

    .line 378
    .line 379
    invoke-virtual {v1, v2}, Lu/c;->f(Lu/i;)V

    .line 380
    .line 381
    .line 382
    :cond_1a
    iget-boolean v2, v1, Lu/c;->e:Z

    .line 383
    .line 384
    if-nez v2, :cond_1b

    .line 385
    .line 386
    iget-object v2, v1, Lu/c;->a:Lu/i;

    .line 387
    .line 388
    invoke-virtual {v2, v1}, Lu/i;->d(Lu/c;)V

    .line 389
    .line 390
    .line 391
    :cond_1b
    iget v2, v0, Lu/e;->i:I

    .line 392
    .line 393
    sub-int/2addr v2, v3

    .line 394
    iput v2, v0, Lu/e;->i:I

    .line 395
    .line 396
    :cond_1c
    const/4 v4, 0x1

    .line 397
    goto :goto_d

    .line 398
    :cond_1d
    const/4 v4, 0x0

    .line 399
    :goto_d
    iget-object v2, v1, Lu/c;->a:Lu/i;

    .line 400
    .line 401
    if-eqz v2, :cond_20

    .line 402
    .line 403
    iget v2, v2, Lu/i;->l:I

    .line 404
    .line 405
    if-eq v2, v3, :cond_1f

    .line 406
    .line 407
    iget v2, v1, Lu/c;->b:F

    .line 408
    .line 409
    cmpg-float v2, v2, v16

    .line 410
    .line 411
    if-ltz v2, :cond_20

    .line 412
    .line 413
    goto :goto_e

    .line 414
    :cond_1e
    const/4 v4, 0x0

    .line 415
    :cond_1f
    :goto_e
    if-nez v4, :cond_20

    .line 416
    .line 417
    invoke-virtual/range {p0 .. p1}, Lu/e;->h(Lu/c;)V

    .line 418
    .line 419
    .line 420
    :cond_20
    :goto_f
    return-void
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final d(Lu/i;I)V
    .locals 4

    .line 1
    iget v0, p1, Lu/i;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    if-ne v0, v2, :cond_1

    .line 6
    .line 7
    int-to-float p2, p2

    .line 8
    iput p2, p1, Lu/i;->e:F

    .line 9
    .line 10
    iput-boolean v1, p1, Lu/i;->f:Z

    .line 11
    .line 12
    iget p2, p1, Lu/i;->j:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, p2, :cond_0

    .line 17
    .line 18
    iget-object v2, p1, Lu/i;->i:[Lu/c;

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    invoke-virtual {v2, p1, v0}, Lu/c;->g(Lu/i;Z)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput v0, p1, Lu/i;->j:I

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    if-eq v0, v2, :cond_5

    .line 32
    .line 33
    iget-object v3, p0, Lu/e;->e:[Lu/c;

    .line 34
    .line 35
    aget-object v0, v3, v0

    .line 36
    .line 37
    iget-boolean v3, v0, Lu/c;->e:Z

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    int-to-float p1, p2

    .line 42
    iput p1, v0, Lu/c;->b:F

    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-object v3, v0, Lu/c;->d:Lu/b;

    .line 46
    .line 47
    invoke-interface {v3}, Lu/b;->d()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_3

    .line 52
    .line 53
    iput-boolean v1, v0, Lu/c;->e:Z

    .line 54
    .line 55
    int-to-float p1, p2

    .line 56
    iput p1, v0, Lu/c;->b:F

    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    invoke-virtual {p0}, Lu/e;->k()Lu/c;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-gez p2, :cond_4

    .line 64
    .line 65
    mul-int/lit8 p2, p2, -0x1

    .line 66
    .line 67
    int-to-float p2, p2

    .line 68
    iput p2, v0, Lu/c;->b:F

    .line 69
    .line 70
    iget-object p2, v0, Lu/c;->d:Lu/b;

    .line 71
    .line 72
    const/high16 v1, 0x3f800000    # 1.0f

    .line 73
    .line 74
    invoke-interface {p2, p1, v1}, Lu/b;->h(Lu/i;F)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    int-to-float p2, p2

    .line 79
    iput p2, v0, Lu/c;->b:F

    .line 80
    .line 81
    iget-object p2, v0, Lu/c;->d:Lu/b;

    .line 82
    .line 83
    const/high16 v1, -0x40800000    # -1.0f

    .line 84
    .line 85
    invoke-interface {p2, p1, v1}, Lu/b;->h(Lu/i;F)V

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-virtual {p0, v0}, Lu/e;->c(Lu/c;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_5
    invoke-virtual {p0}, Lu/e;->k()Lu/c;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object p1, v0, Lu/c;->a:Lu/i;

    .line 97
    .line 98
    int-to-float p2, p2

    .line 99
    iput p2, p1, Lu/i;->e:F

    .line 100
    .line 101
    iput p2, v0, Lu/c;->b:F

    .line 102
    .line 103
    iput-boolean v1, v0, Lu/c;->e:Z

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Lu/e;->c(Lu/c;)V

    .line 106
    .line 107
    .line 108
    return-void
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public final e(Lu/i;Lu/i;II)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/16 v2, 0x8

    .line 4
    .line 5
    if-ne p4, v2, :cond_1

    .line 6
    .line 7
    iget-boolean v3, p2, Lu/i;->f:Z

    .line 8
    .line 9
    if-eqz v3, :cond_1

    .line 10
    .line 11
    iget v3, p1, Lu/i;->c:I

    .line 12
    .line 13
    const/4 v4, -0x1

    .line 14
    if-ne v3, v4, :cond_1

    .line 15
    .line 16
    iget p2, p2, Lu/i;->e:F

    .line 17
    .line 18
    int-to-float p3, p3

    .line 19
    add-float/2addr p2, p3

    .line 20
    iput p2, p1, Lu/i;->e:F

    .line 21
    .line 22
    iput-boolean v1, p1, Lu/i;->f:Z

    .line 23
    .line 24
    iget p2, p1, Lu/i;->j:I

    .line 25
    .line 26
    const/4 p3, 0x0

    .line 27
    :goto_0
    if-ge p3, p2, :cond_0

    .line 28
    .line 29
    iget-object p4, p1, Lu/i;->i:[Lu/c;

    .line 30
    .line 31
    aget-object p4, p4, p3

    .line 32
    .line 33
    invoke-virtual {p4, p1, v0}, Lu/c;->g(Lu/i;Z)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 p3, p3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iput v0, p1, Lu/i;->j:I

    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-virtual {p0}, Lu/e;->k()Lu/c;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    if-gez p3, :cond_2

    .line 49
    .line 50
    mul-int/lit8 p3, p3, -0x1

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    :cond_2
    int-to-float p3, p3

    .line 54
    iput p3, v3, Lu/c;->b:F

    .line 55
    .line 56
    :cond_3
    const/high16 p3, 0x3f800000    # 1.0f

    .line 57
    .line 58
    const/high16 v1, -0x40800000    # -1.0f

    .line 59
    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    iget-object v0, v3, Lu/c;->d:Lu/b;

    .line 63
    .line 64
    invoke-interface {v0, p1, v1}, Lu/b;->h(Lu/i;F)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v3, Lu/c;->d:Lu/b;

    .line 68
    .line 69
    invoke-interface {p1, p2, p3}, Lu/b;->h(Lu/i;F)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    iget-object v0, v3, Lu/c;->d:Lu/b;

    .line 74
    .line 75
    invoke-interface {v0, p1, p3}, Lu/b;->h(Lu/i;F)V

    .line 76
    .line 77
    .line 78
    iget-object p1, v3, Lu/c;->d:Lu/b;

    .line 79
    .line 80
    invoke-interface {p1, p2, v1}, Lu/b;->h(Lu/i;F)V

    .line 81
    .line 82
    .line 83
    :goto_1
    if-eq p4, v2, :cond_5

    .line 84
    .line 85
    invoke-virtual {v3, p0, p4}, Lu/c;->a(Lu/e;I)V

    .line 86
    .line 87
    .line 88
    :cond_5
    invoke-virtual {p0, v3}, Lu/e;->c(Lu/c;)V

    .line 89
    .line 90
    .line 91
    return-void
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public final f(Lu/i;Lu/i;II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lu/e;->k()Lu/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lu/e;->l()Lu/i;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    iput v2, v1, Lu/i;->d:I

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, v1, p3}, Lu/c;->b(Lu/i;Lu/i;Lu/i;I)V

    .line 13
    .line 14
    .line 15
    const/16 p1, 0x8

    .line 16
    .line 17
    if-eq p4, p1, :cond_0

    .line 18
    .line 19
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 20
    .line 21
    invoke-interface {p1, v1}, Lu/b;->g(Lu/i;)F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/high16 p2, -0x40800000    # -1.0f

    .line 26
    .line 27
    mul-float p1, p1, p2

    .line 28
    .line 29
    float-to-int p1, p1

    .line 30
    invoke-virtual {p0, p4}, Lu/e;->i(I)Lu/i;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iget-object p3, v0, Lu/c;->d:Lu/b;

    .line 35
    .line 36
    int-to-float p1, p1

    .line 37
    invoke-interface {p3, p2, p1}, Lu/b;->h(Lu/i;F)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0, v0}, Lu/e;->c(Lu/c;)V

    .line 41
    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public final g(Lu/i;Lu/i;II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lu/e;->k()Lu/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lu/e;->l()Lu/i;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    iput v2, v1, Lu/i;->d:I

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, v1, p3}, Lu/c;->c(Lu/i;Lu/i;Lu/i;I)V

    .line 13
    .line 14
    .line 15
    const/16 p1, 0x8

    .line 16
    .line 17
    if-eq p4, p1, :cond_0

    .line 18
    .line 19
    iget-object p1, v0, Lu/c;->d:Lu/b;

    .line 20
    .line 21
    invoke-interface {p1, v1}, Lu/b;->g(Lu/i;)F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/high16 p2, -0x40800000    # -1.0f

    .line 26
    .line 27
    mul-float p1, p1, p2

    .line 28
    .line 29
    float-to-int p1, p1

    .line 30
    invoke-virtual {p0, p4}, Lu/e;->i(I)Lu/i;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iget-object p3, v0, Lu/c;->d:Lu/b;

    .line 35
    .line 36
    int-to-float p1, p1

    .line 37
    invoke-interface {p3, p2, p1}, Lu/b;->h(Lu/i;F)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0, v0}, Lu/e;->c(Lu/c;)V

    .line 41
    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public final h(Lu/c;)V
    .locals 3

    .line 1
    sget-boolean v0, Lu/e;->p:Z

    .line 2
    .line 3
    iget-object v1, p0, Lu/e;->k:Lu2/n;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lu/e;->e:[Lu/c;

    .line 8
    .line 9
    iget v2, p0, Lu/e;->i:I

    .line 10
    .line 11
    aget-object v0, v0, v2

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v1, v1, Lu2/n;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ll0/c;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ll0/c;->b(Lu/c;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lu/e;->e:[Lu/c;

    .line 24
    .line 25
    iget v2, p0, Lu/e;->i:I

    .line 26
    .line 27
    aget-object v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v1, v1, Lu2/n;->i:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ll0/c;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ll0/c;->b(Lu/c;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    iget-object v0, p0, Lu/e;->e:[Lu/c;

    .line 39
    .line 40
    iget v1, p0, Lu/e;->i:I

    .line 41
    .line 42
    aput-object p1, v0, v1

    .line 43
    .line 44
    iget-object v0, p1, Lu/c;->a:Lu/i;

    .line 45
    .line 46
    iput v1, v0, Lu/i;->c:I

    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    iput v1, p0, Lu/e;->i:I

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Lu/i;->d(Lu/c;)V

    .line 53
    .line 54
    .line 55
    return-void
    .line 56
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

.method public final i(I)Lu/i;
    .locals 4

    .line 1
    iget v0, p0, Lu/e;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget v1, p0, Lu/e;->d:I

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lu/e;->n()V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x4

    .line 13
    invoke-virtual {p0, v0}, Lu/e;->a(I)Lu/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, v0, Lu/i;->h:[F

    .line 18
    .line 19
    iget v2, p0, Lu/e;->a:I

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    iput v2, p0, Lu/e;->a:I

    .line 24
    .line 25
    iget v3, p0, Lu/e;->h:I

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    iput v3, p0, Lu/e;->h:I

    .line 30
    .line 31
    iput v2, v0, Lu/i;->b:I

    .line 32
    .line 33
    iput p1, v0, Lu/i;->d:I

    .line 34
    .line 35
    iget-object p1, p0, Lu/e;->k:Lu2/n;

    .line 36
    .line 37
    iget-object p1, p1, Lu2/n;->k:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, [Lu/i;

    .line 40
    .line 41
    aput-object v0, p1, v2

    .line 42
    .line 43
    iget-object p1, p0, Lu/e;->b:Lu/g;

    .line 44
    .line 45
    iget-object v2, p1, Lu/g;->i:Lu/f;

    .line 46
    .line 47
    iput-object v0, v2, Lu/f;->h:Lu/i;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([FF)V

    .line 51
    .line 52
    .line 53
    iget v2, v0, Lu/i;->d:I

    .line 54
    .line 55
    const/high16 v3, 0x3f800000    # 1.0f

    .line 56
    .line 57
    aput v3, v1, v2

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lu/g;->i(Lu/i;)V

    .line 60
    .line 61
    .line 62
    return-object v0
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

.method public final j(Ljava/lang/Object;)Lu/i;
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget v0, p0, Lu/e;->h:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    add-int/2addr v0, v1

    .line 8
    iget v2, p0, Lu/e;->d:I

    .line 9
    .line 10
    if-lt v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lu/e;->n()V

    .line 13
    .line 14
    .line 15
    :cond_1
    instance-of v0, p1, Lv/c;

    .line 16
    .line 17
    if-eqz v0, :cond_6

    .line 18
    .line 19
    check-cast p1, Lv/c;

    .line 20
    .line 21
    iget-object v0, p1, Lv/c;->g:Lu/i;

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Lv/c;->i()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p1, Lv/c;->g:Lu/i;

    .line 29
    .line 30
    :cond_2
    iget p1, v0, Lu/i;->b:I

    .line 31
    .line 32
    const/4 v2, -0x1

    .line 33
    iget-object v3, p0, Lu/e;->k:Lu2/n;

    .line 34
    .line 35
    if-eq p1, v2, :cond_4

    .line 36
    .line 37
    iget v4, p0, Lu/e;->a:I

    .line 38
    .line 39
    if-gt p1, v4, :cond_4

    .line 40
    .line 41
    iget-object v4, v3, Lu2/n;->k:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, [Lu/i;

    .line 44
    .line 45
    aget-object v4, v4, p1

    .line 46
    .line 47
    if-nez v4, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    return-object v0

    .line 51
    :cond_4
    :goto_0
    if-eq p1, v2, :cond_5

    .line 52
    .line 53
    invoke-virtual {v0}, Lu/i;->c()V

    .line 54
    .line 55
    .line 56
    :cond_5
    iget p1, p0, Lu/e;->a:I

    .line 57
    .line 58
    add-int/2addr p1, v1

    .line 59
    iput p1, p0, Lu/e;->a:I

    .line 60
    .line 61
    iget v2, p0, Lu/e;->h:I

    .line 62
    .line 63
    add-int/2addr v2, v1

    .line 64
    iput v2, p0, Lu/e;->h:I

    .line 65
    .line 66
    iput p1, v0, Lu/i;->b:I

    .line 67
    .line 68
    iput v1, v0, Lu/i;->l:I

    .line 69
    .line 70
    iget-object v1, v3, Lu2/n;->k:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, [Lu/i;

    .line 73
    .line 74
    aput-object v0, v1, p1

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_6
    :goto_1
    const/4 p1, 0x0

    .line 78
    return-object p1
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

.method public final k()Lu/c;
    .locals 5

    .line 1
    sget-boolean v0, Lu/e;->p:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, Lu/e;->k:Lu2/n;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, v4, Lu2/n;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ll0/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Ll0/c;->a()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lu/c;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    new-instance v0, Lu/d;

    .line 23
    .line 24
    invoke-direct {v0, v4}, Lu/d;-><init>(Lu2/n;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-object v3, v0, Lu/c;->a:Lu/i;

    .line 29
    .line 30
    iget-object v3, v0, Lu/c;->d:Lu/b;

    .line 31
    .line 32
    invoke-interface {v3}, Lu/b;->clear()V

    .line 33
    .line 34
    .line 35
    iput v2, v0, Lu/c;->b:F

    .line 36
    .line 37
    iput-boolean v1, v0, Lu/c;->e:Z

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v0, v4, Lu2/n;->i:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ll0/c;

    .line 43
    .line 44
    invoke-virtual {v0}, Ll0/c;->a()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lu/c;

    .line 49
    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    new-instance v0, Lu/c;

    .line 53
    .line 54
    invoke-direct {v0, v4}, Lu/c;-><init>(Lu2/n;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    iput-object v3, v0, Lu/c;->a:Lu/i;

    .line 59
    .line 60
    iget-object v3, v0, Lu/c;->d:Lu/b;

    .line 61
    .line 62
    invoke-interface {v3}, Lu/b;->clear()V

    .line 63
    .line 64
    .line 65
    iput v2, v0, Lu/c;->b:F

    .line 66
    .line 67
    iput-boolean v1, v0, Lu/c;->e:Z

    .line 68
    .line 69
    :goto_0
    return-object v0
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final l()Lu/i;
    .locals 3

    .line 1
    iget v0, p0, Lu/e;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget v1, p0, Lu/e;->d:I

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lu/e;->n()V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x3

    .line 13
    invoke-virtual {p0, v0}, Lu/e;->a(I)Lu/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, p0, Lu/e;->a:I

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    iput v1, p0, Lu/e;->a:I

    .line 22
    .line 23
    iget v2, p0, Lu/e;->h:I

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    iput v2, p0, Lu/e;->h:I

    .line 28
    .line 29
    iput v1, v0, Lu/i;->b:I

    .line 30
    .line 31
    iget-object v2, p0, Lu/e;->k:Lu2/n;

    .line 32
    .line 33
    iget-object v2, v2, Lu2/n;->k:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, [Lu/i;

    .line 36
    .line 37
    aput-object v0, v2, v1

    .line 38
    .line 39
    return-object v0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final n()V
    .locals 3

    .line 1
    iget v0, p0, Lu/e;->c:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Lu/e;->c:I

    .line 6
    .line 7
    iget-object v1, p0, Lu/e;->e:[Lu/c;

    .line 8
    .line 9
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, [Lu/c;

    .line 14
    .line 15
    iput-object v0, p0, Lu/e;->e:[Lu/c;

    .line 16
    .line 17
    iget-object v0, p0, Lu/e;->k:Lu2/n;

    .line 18
    .line 19
    iget-object v1, v0, Lu2/n;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, [Lu/i;

    .line 22
    .line 23
    iget v2, p0, Lu/e;->c:I

    .line 24
    .line 25
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, [Lu/i;

    .line 30
    .line 31
    iput-object v1, v0, Lu2/n;->k:Ljava/lang/Object;

    .line 32
    .line 33
    iget v0, p0, Lu/e;->c:I

    .line 34
    .line 35
    new-array v1, v0, [Z

    .line 36
    .line 37
    iput-object v1, p0, Lu/e;->g:[Z

    .line 38
    .line 39
    iput v0, p0, Lu/e;->d:I

    .line 40
    .line 41
    iput v0, p0, Lu/e;->j:I

    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final o(Lu/g;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    iget v3, v0, Lu/e;->i:I

    .line 5
    .line 6
    if-ge v2, v3, :cond_d

    .line 7
    .line 8
    iget-object v3, v0, Lu/e;->e:[Lu/c;

    .line 9
    .line 10
    aget-object v3, v3, v2

    .line 11
    .line 12
    iget-object v4, v3, Lu/c;->a:Lu/i;

    .line 13
    .line 14
    iget v4, v4, Lu/i;->l:I

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    if-ne v4, v5, :cond_0

    .line 18
    .line 19
    goto/16 :goto_8

    .line 20
    .line 21
    :cond_0
    iget v3, v3, Lu/c;->b:F

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    cmpg-float v3, v3, v4

    .line 25
    .line 26
    if-gez v3, :cond_c

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    :goto_1
    if-nez v2, :cond_d

    .line 31
    .line 32
    add-int/2addr v3, v5

    .line 33
    const/4 v6, -0x1

    .line 34
    const v7, 0x7f7fffff    # Float.MAX_VALUE

    .line 35
    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, -0x1

    .line 39
    const/4 v10, -0x1

    .line 40
    const/4 v11, 0x0

    .line 41
    :goto_2
    iget v12, v0, Lu/e;->i:I

    .line 42
    .line 43
    iget-object v13, v0, Lu/e;->k:Lu2/n;

    .line 44
    .line 45
    if-ge v8, v12, :cond_9

    .line 46
    .line 47
    iget-object v12, v0, Lu/e;->e:[Lu/c;

    .line 48
    .line 49
    aget-object v12, v12, v8

    .line 50
    .line 51
    iget-object v14, v12, Lu/c;->a:Lu/i;

    .line 52
    .line 53
    iget v14, v14, Lu/i;->l:I

    .line 54
    .line 55
    if-ne v14, v5, :cond_1

    .line 56
    .line 57
    goto :goto_6

    .line 58
    :cond_1
    iget-boolean v14, v12, Lu/c;->e:Z

    .line 59
    .line 60
    if-eqz v14, :cond_2

    .line 61
    .line 62
    goto :goto_6

    .line 63
    :cond_2
    iget v14, v12, Lu/c;->b:F

    .line 64
    .line 65
    cmpg-float v14, v14, v4

    .line 66
    .line 67
    if-gez v14, :cond_8

    .line 68
    .line 69
    const/4 v14, 0x1

    .line 70
    :goto_3
    iget v15, v0, Lu/e;->h:I

    .line 71
    .line 72
    if-ge v14, v15, :cond_8

    .line 73
    .line 74
    iget-object v15, v13, Lu2/n;->k:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v15, [Lu/i;

    .line 77
    .line 78
    aget-object v15, v15, v14

    .line 79
    .line 80
    iget-object v1, v12, Lu/c;->d:Lu/b;

    .line 81
    .line 82
    invoke-interface {v1, v15}, Lu/b;->g(Lu/i;)F

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    cmpg-float v16, v1, v4

    .line 87
    .line 88
    if-gtz v16, :cond_3

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_3
    const/4 v4, 0x0

    .line 92
    :goto_4
    const/16 v5, 0x9

    .line 93
    .line 94
    if-ge v4, v5, :cond_7

    .line 95
    .line 96
    iget-object v5, v15, Lu/i;->g:[F

    .line 97
    .line 98
    aget v5, v5, v4

    .line 99
    .line 100
    div-float/2addr v5, v1

    .line 101
    cmpg-float v17, v5, v7

    .line 102
    .line 103
    if-gez v17, :cond_4

    .line 104
    .line 105
    if-eq v4, v11, :cond_5

    .line 106
    .line 107
    :cond_4
    if-le v4, v11, :cond_6

    .line 108
    .line 109
    :cond_5
    move v11, v4

    .line 110
    move v7, v5

    .line 111
    move v9, v8

    .line 112
    move v10, v14

    .line 113
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_7
    :goto_5
    add-int/lit8 v14, v14, 0x1

    .line 117
    .line 118
    const/4 v4, 0x0

    .line 119
    const/4 v5, 0x1

    .line 120
    goto :goto_3

    .line 121
    :cond_8
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v5, 0x1

    .line 125
    goto :goto_2

    .line 126
    :cond_9
    if-eq v9, v6, :cond_a

    .line 127
    .line 128
    iget-object v1, v0, Lu/e;->e:[Lu/c;

    .line 129
    .line 130
    aget-object v1, v1, v9

    .line 131
    .line 132
    iget-object v4, v1, Lu/c;->a:Lu/i;

    .line 133
    .line 134
    iput v6, v4, Lu/i;->c:I

    .line 135
    .line 136
    iget-object v4, v13, Lu2/n;->k:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v4, [Lu/i;

    .line 139
    .line 140
    aget-object v4, v4, v10

    .line 141
    .line 142
    invoke-virtual {v1, v4}, Lu/c;->f(Lu/i;)V

    .line 143
    .line 144
    .line 145
    iget-object v4, v1, Lu/c;->a:Lu/i;

    .line 146
    .line 147
    iput v9, v4, Lu/i;->c:I

    .line 148
    .line 149
    invoke-virtual {v4, v1}, Lu/i;->d(Lu/c;)V

    .line 150
    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_a
    const/4 v2, 0x1

    .line 154
    :goto_7
    iget v1, v0, Lu/e;->h:I

    .line 155
    .line 156
    div-int/lit8 v1, v1, 0x2

    .line 157
    .line 158
    if-le v3, v1, :cond_b

    .line 159
    .line 160
    const/4 v2, 0x1

    .line 161
    :cond_b
    const/4 v4, 0x0

    .line 162
    const/4 v5, 0x1

    .line 163
    goto/16 :goto_1

    .line 164
    .line 165
    :cond_c
    :goto_8
    add-int/lit8 v2, v2, 0x1

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_d
    invoke-virtual/range {p0 .. p1}, Lu/e;->p(Lu/c;)V

    .line 170
    .line 171
    .line 172
    const/4 v1, 0x0

    .line 173
    :goto_9
    iget v2, v0, Lu/e;->i:I

    .line 174
    .line 175
    if-ge v1, v2, :cond_e

    .line 176
    .line 177
    iget-object v2, v0, Lu/e;->e:[Lu/c;

    .line 178
    .line 179
    aget-object v2, v2, v1

    .line 180
    .line 181
    iget-object v3, v2, Lu/c;->a:Lu/i;

    .line 182
    .line 183
    iget v2, v2, Lu/c;->b:F

    .line 184
    .line 185
    iput v2, v3, Lu/i;->e:F

    .line 186
    .line 187
    add-int/lit8 v1, v1, 0x1

    .line 188
    .line 189
    goto :goto_9

    .line 190
    :cond_e
    return-void
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final p(Lu/c;)V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget v2, p0, Lu/e;->h:I

    .line 4
    .line 5
    if-ge v1, v2, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lu/e;->g:[Z

    .line 8
    .line 9
    aput-boolean v0, v2, v1

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    :cond_1
    :goto_1
    if-nez v1, :cond_b

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    add-int/2addr v2, v3

    .line 20
    iget v4, p0, Lu/e;->h:I

    .line 21
    .line 22
    mul-int/lit8 v4, v4, 0x2

    .line 23
    .line 24
    if-lt v2, v4, :cond_2

    .line 25
    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_2
    iget-object v4, p1, Lu/c;->a:Lu/i;

    .line 29
    .line 30
    if-eqz v4, :cond_3

    .line 31
    .line 32
    iget-object v5, p0, Lu/e;->g:[Z

    .line 33
    .line 34
    iget v4, v4, Lu/i;->b:I

    .line 35
    .line 36
    aput-boolean v3, v5, v4

    .line 37
    .line 38
    :cond_3
    iget-object v4, p0, Lu/e;->g:[Z

    .line 39
    .line 40
    invoke-virtual {p1, v4}, Lu/c;->d([Z)Lu/i;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eqz v4, :cond_5

    .line 45
    .line 46
    iget-object v5, p0, Lu/e;->g:[Z

    .line 47
    .line 48
    iget v6, v4, Lu/i;->b:I

    .line 49
    .line 50
    aget-boolean v7, v5, v6

    .line 51
    .line 52
    if-eqz v7, :cond_4

    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_4
    aput-boolean v3, v5, v6

    .line 56
    .line 57
    :cond_5
    if-eqz v4, :cond_a

    .line 58
    .line 59
    const/4 v5, -0x1

    .line 60
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 61
    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v8, -0x1

    .line 65
    :goto_2
    iget v9, p0, Lu/e;->i:I

    .line 66
    .line 67
    if-ge v7, v9, :cond_9

    .line 68
    .line 69
    iget-object v9, p0, Lu/e;->e:[Lu/c;

    .line 70
    .line 71
    aget-object v9, v9, v7

    .line 72
    .line 73
    iget-object v10, v9, Lu/c;->a:Lu/i;

    .line 74
    .line 75
    iget v10, v10, Lu/i;->l:I

    .line 76
    .line 77
    if-ne v10, v3, :cond_6

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    iget-boolean v10, v9, Lu/c;->e:Z

    .line 81
    .line 82
    if-eqz v10, :cond_7

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_7
    iget-object v10, v9, Lu/c;->d:Lu/b;

    .line 86
    .line 87
    invoke-interface {v10, v4}, Lu/b;->e(Lu/i;)Z

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    if-eqz v10, :cond_8

    .line 92
    .line 93
    iget-object v10, v9, Lu/c;->d:Lu/b;

    .line 94
    .line 95
    invoke-interface {v10, v4}, Lu/b;->g(Lu/i;)F

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    const/4 v11, 0x0

    .line 100
    cmpg-float v11, v10, v11

    .line 101
    .line 102
    if-gez v11, :cond_8

    .line 103
    .line 104
    iget v9, v9, Lu/c;->b:F

    .line 105
    .line 106
    neg-float v9, v9

    .line 107
    div-float/2addr v9, v10

    .line 108
    cmpg-float v10, v9, v6

    .line 109
    .line 110
    if-gez v10, :cond_8

    .line 111
    .line 112
    move v8, v7

    .line 113
    move v6, v9

    .line 114
    :cond_8
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_9
    if-le v8, v5, :cond_1

    .line 118
    .line 119
    iget-object v3, p0, Lu/e;->e:[Lu/c;

    .line 120
    .line 121
    aget-object v3, v3, v8

    .line 122
    .line 123
    iget-object v6, v3, Lu/c;->a:Lu/i;

    .line 124
    .line 125
    iput v5, v6, Lu/i;->c:I

    .line 126
    .line 127
    invoke-virtual {v3, v4}, Lu/c;->f(Lu/i;)V

    .line 128
    .line 129
    .line 130
    iget-object v4, v3, Lu/c;->a:Lu/i;

    .line 131
    .line 132
    iput v8, v4, Lu/i;->c:I

    .line 133
    .line 134
    invoke-virtual {v4, v3}, Lu/i;->d(Lu/c;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_a
    const/4 v1, 0x1

    .line 139
    goto :goto_1

    .line 140
    :cond_b
    :goto_4
    return-void
.end method

.method public final q()V
    .locals 5

    .line 1
    sget-boolean v0, Lu/e;->p:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lu/e;->k:Lu2/n;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :goto_0
    iget-object v0, p0, Lu/e;->e:[Lu/c;

    .line 10
    .line 11
    array-length v4, v0

    .line 12
    if-ge v3, v4, :cond_3

    .line 13
    .line 14
    aget-object v0, v0, v3

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v4, v2, Lu2/n;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Ll0/c;

    .line 21
    .line 22
    invoke-virtual {v4, v0}, Ll0/c;->b(Lu/c;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lu/e;->e:[Lu/c;

    .line 26
    .line 27
    aput-object v1, v0, v3

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    iget-object v0, p0, Lu/e;->e:[Lu/c;

    .line 33
    .line 34
    array-length v4, v0

    .line 35
    if-ge v3, v4, :cond_3

    .line 36
    .line 37
    aget-object v0, v0, v3

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v4, v2, Lu2/n;->i:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Ll0/c;

    .line 44
    .line 45
    invoke-virtual {v4, v0}, Ll0/c;->b(Lu/c;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, Lu/e;->e:[Lu/c;

    .line 49
    .line 50
    aput-object v1, v0, v3

    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
    .line 56
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final r()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lu/e;->k:Lu2/n;

    .line 4
    .line 5
    iget-object v3, v2, Lu2/n;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v3, [Lu/i;

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    if-ge v1, v4, :cond_1

    .line 11
    .line 12
    aget-object v2, v3, v1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Lu/i;->c()V

    .line 17
    .line 18
    .line 19
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v1, v2, Lu2/n;->j:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ll0/c;

    .line 25
    .line 26
    iget-object v3, p0, Lu/e;->l:[Lu/i;

    .line 27
    .line 28
    iget v4, p0, Lu/e;->m:I

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    array-length v5, v3

    .line 34
    if-le v4, v5, :cond_2

    .line 35
    .line 36
    array-length v4, v3

    .line 37
    :cond_2
    const/4 v5, 0x0

    .line 38
    :goto_1
    if-ge v5, v4, :cond_4

    .line 39
    .line 40
    aget-object v6, v3, v5

    .line 41
    .line 42
    iget v7, v1, Ll0/c;->c:I

    .line 43
    .line 44
    iget-object v8, v1, Ll0/c;->b:[Ljava/lang/Object;

    .line 45
    .line 46
    array-length v9, v8

    .line 47
    if-ge v7, v9, :cond_3

    .line 48
    .line 49
    aput-object v6, v8, v7

    .line 50
    .line 51
    add-int/lit8 v7, v7, 0x1

    .line 52
    .line 53
    iput v7, v1, Ll0/c;->c:I

    .line 54
    .line 55
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    iput v0, p0, Lu/e;->m:I

    .line 59
    .line 60
    iget-object v1, v2, Lu2/n;->k:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, [Lu/i;

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-static {v1, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput v0, p0, Lu/e;->a:I

    .line 69
    .line 70
    iget-object v1, p0, Lu/e;->b:Lu/g;

    .line 71
    .line 72
    iput v0, v1, Lu/g;->h:I

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    iput v3, v1, Lu/c;->b:F

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    iput v1, p0, Lu/e;->h:I

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    :goto_2
    iget v3, p0, Lu/e;->i:I

    .line 82
    .line 83
    if-ge v1, v3, :cond_5

    .line 84
    .line 85
    iget-object v3, p0, Lu/e;->e:[Lu/c;

    .line 86
    .line 87
    aget-object v3, v3, v1

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    add-int/lit8 v1, v1, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    invoke-virtual {p0}, Lu/e;->q()V

    .line 96
    .line 97
    .line 98
    iput v0, p0, Lu/e;->i:I

    .line 99
    .line 100
    sget-boolean v0, Lu/e;->p:Z

    .line 101
    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    new-instance v0, Lu/d;

    .line 105
    .line 106
    invoke-direct {v0, v2}, Lu/d;-><init>(Lu2/n;)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p0, Lu/e;->n:Lu/c;

    .line 110
    .line 111
    return-void

    .line 112
    :cond_6
    new-instance v0, Lu/c;

    .line 113
    .line 114
    invoke-direct {v0, v2}, Lu/c;-><init>(Lu2/n;)V

    .line 115
    .line 116
    .line 117
    iput-object v0, p0, Lu/e;->n:Lu/c;

    .line 118
    .line 119
    return-void
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
