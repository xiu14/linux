.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.super Landroidx/recyclerview/widget/p1;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroidx/recyclerview/widget/c2;


# instance fields
.field public final a:I

.field public final b:[Landroidx/recyclerview/widget/r2;

.field public final c:Landroidx/recyclerview/widget/v0;

.field public final d:Landroidx/recyclerview/widget/v0;

.field public final e:I

.field public f:I

.field public final g:Landroidx/recyclerview/widget/l0;

.field public h:Z

.field public i:Z

.field public final j:Ljava/util/BitSet;

.field public k:I

.field public l:I

.field public final m:Lu2/u;

.field public final n:I

.field public o:Z

.field public p:Z

.field public q:Landroidx/recyclerview/widget/q2;

.field public r:I

.field public final s:Landroid/graphics/Rect;

.field public final t:Landroidx/recyclerview/widget/n2;

.field public u:Z

.field public final v:Z

.field public w:[I

.field public final x:Landroidx/recyclerview/widget/a0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/p1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:Z

    .line 9
    .line 10
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 11
    .line 12
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 13
    .line 14
    const/high16 v0, -0x80000000

    .line 15
    .line 16
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 17
    .line 18
    new-instance v0, Lu2/u;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Lu2/u;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    iput v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:I

    .line 27
    .line 28
    new-instance v2, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:Landroid/graphics/Rect;

    .line 34
    .line 35
    new-instance v2, Landroidx/recyclerview/widget/n2;

    .line 36
    .line 37
    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/n2;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t:Landroidx/recyclerview/widget/n2;

    .line 41
    .line 42
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u:Z

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    iput-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    .line 46
    .line 47
    new-instance v3, Landroidx/recyclerview/widget/a0;

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-direct {v3, v4, p0}, Landroidx/recyclerview/widget/a0;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->x:Landroidx/recyclerview/widget/a0;

    .line 54
    .line 55
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/p1;->getProperties(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/o1;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget p2, p1, Landroidx/recyclerview/widget/o1;->a:I

    .line 60
    .line 61
    if-eqz p2, :cond_1

    .line 62
    .line 63
    if-ne p2, v2, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    const-string p2, "invalid orientation."

    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_1
    :goto_0
    const/4 p3, 0x0

    .line 75
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 79
    .line 80
    if-ne p2, p4, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 84
    .line 85
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 86
    .line 87
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 88
    .line 89
    iput-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 90
    .line 91
    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 92
    .line 93
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 94
    .line 95
    .line 96
    :goto_1
    iget p2, p1, Landroidx/recyclerview/widget/o1;->b:I

    .line 97
    .line 98
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 102
    .line 103
    if-eq p2, p4, :cond_4

    .line 104
    .line 105
    invoke-virtual {v0}, Lu2/u;->j()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 109
    .line 110
    .line 111
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 112
    .line 113
    new-instance p2, Ljava/util/BitSet;

    .line 114
    .line 115
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 116
    .line 117
    invoke-direct {p2, p4}, Ljava/util/BitSet;-><init>(I)V

    .line 118
    .line 119
    .line 120
    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Ljava/util/BitSet;

    .line 121
    .line 122
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 123
    .line 124
    new-array p2, p2, [Landroidx/recyclerview/widget/r2;

    .line 125
    .line 126
    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 127
    .line 128
    const/4 p2, 0x0

    .line 129
    :goto_2
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 130
    .line 131
    if-ge p2, p4, :cond_3

    .line 132
    .line 133
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 134
    .line 135
    new-instance v0, Landroidx/recyclerview/widget/r2;

    .line 136
    .line 137
    invoke-direct {v0, p0, p2}, Landroidx/recyclerview/widget/r2;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V

    .line 138
    .line 139
    .line 140
    aput-object v0, p4, p2

    .line 141
    .line 142
    add-int/lit8 p2, p2, 0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 146
    .line 147
    .line 148
    :cond_4
    iget-boolean p1, p1, Landroidx/recyclerview/widget/o1;->c:Z

    .line 149
    .line 150
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 154
    .line 155
    if-eqz p2, :cond_5

    .line 156
    .line 157
    iget-boolean p3, p2, Landroidx/recyclerview/widget/q2;->o:Z

    .line 158
    .line 159
    if-eq p3, p1, :cond_5

    .line 160
    .line 161
    iput-boolean p1, p2, Landroidx/recyclerview/widget/q2;->o:Z

    .line 162
    .line 163
    :cond_5
    iput-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:Z

    .line 164
    .line 165
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 166
    .line 167
    .line 168
    new-instance p1, Landroidx/recyclerview/widget/l0;

    .line 169
    .line 170
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-boolean v2, p1, Landroidx/recyclerview/widget/l0;->a:Z

    .line 174
    .line 175
    iput v1, p1, Landroidx/recyclerview/widget/l0;->f:I

    .line 176
    .line 177
    iput v1, p1, Landroidx/recyclerview/widget/l0;->g:I

    .line 178
    .line 179
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g:Landroidx/recyclerview/widget/l0;

    .line 180
    .line 181
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 182
    .line 183
    invoke-static {p0, p1}, Landroidx/recyclerview/widget/v0;->a(Landroidx/recyclerview/widget/p1;I)Landroidx/recyclerview/widget/v0;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 188
    .line 189
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 190
    .line 191
    sub-int/2addr v2, p1

    .line 192
    invoke-static {p0, v2}, Landroidx/recyclerview/widget/v0;->a(Landroidx/recyclerview/widget/p1;I)Landroidx/recyclerview/widget/v0;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 197
    .line 198
    return-void
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

.method public static C(III)I
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/high16 v1, -0x80000000

    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/high16 v1, 0x40000000    # 2.0f

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    return p0

    .line 20
    :cond_2
    :goto_1
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    sub-int/2addr p0, p1

    .line 25
    sub-int/2addr p0, p2

    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method


# virtual methods
.method public final A(ILandroidx/recyclerview/widget/e2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g:Landroidx/recyclerview/widget/l0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, Landroidx/recyclerview/widget/l0;->b:I

    .line 5
    .line 6
    iput p1, v0, Landroidx/recyclerview/widget/l0;->c:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->isSmoothScrolling()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    iget p2, p2, Landroidx/recyclerview/widget/e2;->a:I

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    if-eq p2, v2, :cond_2

    .line 19
    .line 20
    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 21
    .line 22
    if-ge p2, p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    if-ne v2, p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/recyclerview/widget/v0;->l()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    :goto_1
    const/4 p2, 0x0

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/recyclerview/widget/v0;->l()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    move p2, p1

    .line 44
    const/4 p1, 0x0

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    goto :goto_1

    .line 48
    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getClipToPadding()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroidx/recyclerview/widget/v0;->k()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    sub-int/2addr v2, p2

    .line 61
    iput v2, v0, Landroidx/recyclerview/widget/l0;->f:I

    .line 62
    .line 63
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 64
    .line 65
    invoke-virtual {p2}, Landroidx/recyclerview/widget/v0;->g()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    add-int/2addr p2, p1

    .line 70
    iput p2, v0, Landroidx/recyclerview/widget/l0;->g:I

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 74
    .line 75
    invoke-virtual {v2}, Landroidx/recyclerview/widget/v0;->f()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    add-int/2addr v2, p1

    .line 80
    iput v2, v0, Landroidx/recyclerview/widget/l0;->g:I

    .line 81
    .line 82
    neg-int p1, p2

    .line 83
    iput p1, v0, Landroidx/recyclerview/widget/l0;->f:I

    .line 84
    .line 85
    :goto_3
    iput-boolean v1, v0, Landroidx/recyclerview/widget/l0;->h:Z

    .line 86
    .line 87
    iput-boolean v3, v0, Landroidx/recyclerview/widget/l0;->a:Z

    .line 88
    .line 89
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 90
    .line 91
    invoke-virtual {p1}, Landroidx/recyclerview/widget/v0;->i()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_4

    .line 96
    .line 97
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 98
    .line 99
    invoke-virtual {p1}, Landroidx/recyclerview/widget/v0;->f()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-nez p1, :cond_4

    .line 104
    .line 105
    const/4 v1, 0x1

    .line 106
    :cond_4
    iput-boolean v1, v0, Landroidx/recyclerview/widget/l0;->i:Z

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

.method public final B(Landroidx/recyclerview/widget/r2;II)V
    .locals 5

    .line 1
    iget v0, p1, Landroidx/recyclerview/widget/r2;->d:I

    .line 2
    .line 3
    iget v1, p1, Landroidx/recyclerview/widget/r2;->e:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/high16 v3, -0x80000000

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    if-ne p2, v2, :cond_1

    .line 10
    .line 11
    iget p2, p1, Landroidx/recyclerview/widget/r2;->b:I

    .line 12
    .line 13
    if-eq p2, v3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/r2;->c()V

    .line 17
    .line 18
    .line 19
    iget p2, p1, Landroidx/recyclerview/widget/r2;->b:I

    .line 20
    .line 21
    :goto_0
    add-int/2addr p2, v0

    .line 22
    if-gt p2, p3, :cond_3

    .line 23
    .line 24
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Ljava/util/BitSet;

    .line 25
    .line 26
    invoke-virtual {p1, v1, v4}, Ljava/util/BitSet;->set(IZ)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget p2, p1, Landroidx/recyclerview/widget/r2;->c:I

    .line 31
    .line 32
    if-eq p2, v3, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/r2;->b()V

    .line 36
    .line 37
    .line 38
    iget p2, p1, Landroidx/recyclerview/widget/r2;->c:I

    .line 39
    .line 40
    :goto_1
    sub-int/2addr p2, v0

    .line 41
    if-lt p2, p3, :cond_3

    .line 42
    .line 43
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Ljava/util/BitSet;

    .line 44
    .line 45
    invoke-virtual {p1, v1, v4}, Ljava/util/BitSet;->set(IZ)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
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
.end method

.method public final assertNotInLayoutOrScroll(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/p1;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final canScrollHorizontally()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public final canScrollVertically()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public final checkLayoutParams(Landroidx/recyclerview/widget/q1;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Landroidx/recyclerview/widget/o2;

    .line 2
    .line 3
    return p1
    .line 4
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final collectAdjacentPrefetchPositions(IILandroidx/recyclerview/widget/e2;Landroidx/recyclerview/widget/n1;)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move p1, p2

    .line 7
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_7

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_5

    .line 16
    :cond_1
    invoke-virtual {p0, p1, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t(ILandroidx/recyclerview/widget/e2;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:[I

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    array-length p1, p1

    .line 24
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 25
    .line 26
    if-ge p1, p2, :cond_3

    .line 27
    .line 28
    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 29
    .line 30
    new-array p1, p1, [I

    .line 31
    .line 32
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:[I

    .line 33
    .line 34
    :cond_3
    const/4 p1, 0x0

    .line 35
    const/4 p2, 0x0

    .line 36
    const/4 v0, 0x0

    .line 37
    :goto_1
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g:Landroidx/recyclerview/widget/l0;

    .line 40
    .line 41
    if-ge p2, v1, :cond_6

    .line 42
    .line 43
    iget v1, v2, Landroidx/recyclerview/widget/l0;->d:I

    .line 44
    .line 45
    const/4 v3, -0x1

    .line 46
    if-ne v1, v3, :cond_4

    .line 47
    .line 48
    iget v1, v2, Landroidx/recyclerview/widget/l0;->f:I

    .line 49
    .line 50
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 51
    .line 52
    aget-object v2, v2, p2

    .line 53
    .line 54
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    :goto_2
    sub-int/2addr v1, v2

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 61
    .line 62
    aget-object v1, v1, p2

    .line 63
    .line 64
    iget v3, v2, Landroidx/recyclerview/widget/l0;->g:I

    .line 65
    .line 66
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iget v2, v2, Landroidx/recyclerview/widget/l0;->g:I

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :goto_3
    if-ltz v1, :cond_5

    .line 74
    .line 75
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:[I

    .line 76
    .line 77
    aput v1, v2, v0

    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    :cond_5
    add-int/lit8 p2, p2, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_6
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:[I

    .line 85
    .line 86
    invoke-static {p2, p1, v0}, Ljava/util/Arrays;->sort([III)V

    .line 87
    .line 88
    .line 89
    :goto_4
    if-ge p1, v0, :cond_7

    .line 90
    .line 91
    iget p2, v2, Landroidx/recyclerview/widget/l0;->c:I

    .line 92
    .line 93
    if-ltz p2, :cond_7

    .line 94
    .line 95
    invoke-virtual {p3}, Landroidx/recyclerview/widget/e2;->b()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-ge p2, v1, :cond_7

    .line 100
    .line 101
    iget p2, v2, Landroidx/recyclerview/widget/l0;->c:I

    .line 102
    .line 103
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:[I

    .line 104
    .line 105
    aget v1, v1, p1

    .line 106
    .line 107
    move-object v3, p4

    .line 108
    check-cast v3, Landroidx/recyclerview/widget/f0;

    .line 109
    .line 110
    invoke-virtual {v3, p2, v1}, Landroidx/recyclerview/widget/f0;->a(II)V

    .line 111
    .line 112
    .line 113
    iget p2, v2, Landroidx/recyclerview/widget/l0;->c:I

    .line 114
    .line 115
    iget v1, v2, Landroidx/recyclerview/widget/l0;->d:I

    .line 116
    .line 117
    add-int/2addr p2, v1

    .line 118
    iput p2, v2, Landroidx/recyclerview/widget/l0;->c:I

    .line 119
    .line 120
    add-int/lit8 p1, p1, 0x1

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    :goto_5
    return-void
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

.method public final computeHorizontalScrollExtent(Landroidx/recyclerview/widget/e2;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    .line 10
    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h(Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g(Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v1 .. v6}, Landroidx/recyclerview/widget/d;->a(Landroidx/recyclerview/widget/e2;Landroidx/recyclerview/widget/v0;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/p1;Z)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final computeHorizontalScrollOffset(Landroidx/recyclerview/widget/e2;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e(Landroidx/recyclerview/widget/e2;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final computeHorizontalScrollRange(Landroidx/recyclerview/widget/e2;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    .line 10
    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h(Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g(Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v1 .. v6}, Landroidx/recyclerview/widget/d;->c(Landroidx/recyclerview/widget/e2;Landroidx/recyclerview/widget/v0;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/p1;Z)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 10
    .line 11
    if-eqz p1, :cond_3

    .line 12
    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ge p1, v0, :cond_2

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const/4 p1, 0x0

    .line 24
    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 25
    .line 26
    if-eq p1, v0, :cond_0

    .line 27
    .line 28
    :cond_3
    :goto_1
    new-instance p1, Landroid/graphics/PointF;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 31
    .line 32
    .line 33
    if-nez v1, :cond_4

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    return-object p1

    .line 37
    :cond_4
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-nez v0, :cond_5

    .line 41
    .line 42
    int-to-float v0, v1

    .line 43
    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 44
    .line 45
    iput v2, p1, Landroid/graphics/PointF;->y:F

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_5
    iput v2, p1, Landroid/graphics/PointF;->x:F

    .line 49
    .line 50
    int-to-float v0, v1

    .line 51
    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 52
    .line 53
    return-object p1
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
.end method

.method public final computeVerticalScrollExtent(Landroidx/recyclerview/widget/e2;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    .line 10
    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h(Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g(Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v1 .. v6}, Landroidx/recyclerview/widget/d;->a(Landroidx/recyclerview/widget/e2;Landroidx/recyclerview/widget/v0;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/p1;Z)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final computeVerticalScrollOffset(Landroidx/recyclerview/widget/e2;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e(Landroidx/recyclerview/widget/e2;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final computeVerticalScrollRange(Landroidx/recyclerview/widget/e2;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    .line 10
    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h(Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g(Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v1 .. v6}, Landroidx/recyclerview/widget/d;->c(Landroidx/recyclerview/widget/e2;Landroidx/recyclerview/widget/v0;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/p1;Z)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final d()Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:I

    .line 9
    .line 10
    if-eqz v0, :cond_7

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->isAttachedToWindow()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    :goto_0
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Lu2/u;

    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    invoke-virtual {v3}, Lu2/u;->j()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestSimpleAnimationsInNextLayout()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 58
    .line 59
    .line 60
    return v4

    .line 61
    :cond_2
    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u:Z

    .line 62
    .line 63
    if-nez v5, :cond_3

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 67
    .line 68
    const/4 v6, -0x1

    .line 69
    if-eqz v5, :cond_4

    .line 70
    .line 71
    const/4 v5, -0x1

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const/4 v5, 0x1

    .line 74
    :goto_1
    add-int/2addr v2, v4

    .line 75
    invoke-virtual {v3, v0, v2, v5}, Lu2/u;->n(III)Landroidx/recyclerview/widget/p2;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    if-nez v7, :cond_5

    .line 80
    .line 81
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u:Z

    .line 82
    .line 83
    invoke-virtual {v3, v2}, Lu2/u;->m(I)V

    .line 84
    .line 85
    .line 86
    return v1

    .line 87
    :cond_5
    iget v1, v7, Landroidx/recyclerview/widget/p2;->h:I

    .line 88
    .line 89
    mul-int/lit8 v5, v5, -0x1

    .line 90
    .line 91
    invoke-virtual {v3, v0, v1, v5}, Lu2/u;->n(III)Landroidx/recyclerview/widget/p2;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-nez v0, :cond_6

    .line 96
    .line 97
    iget v0, v7, Landroidx/recyclerview/widget/p2;->h:I

    .line 98
    .line 99
    invoke-virtual {v3, v0}, Lu2/u;->m(I)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    iget v0, v0, Landroidx/recyclerview/widget/p2;->h:I

    .line 104
    .line 105
    add-int/2addr v0, v4

    .line 106
    invoke-virtual {v3, v0}, Lu2/u;->m(I)V

    .line 107
    .line 108
    .line 109
    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestSimpleAnimationsInNextLayout()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 113
    .line 114
    .line 115
    return v4

    .line 116
    :cond_7
    :goto_3
    return v1
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

.method public final e(Landroidx/recyclerview/widget/e2;)I
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    .line 10
    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h(Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g(Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    .line 22
    .line 23
    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 24
    .line 25
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 26
    .line 27
    move-object v5, p0

    .line 28
    move-object v1, p1

    .line 29
    invoke-static/range {v1 .. v7}, Landroidx/recyclerview/widget/d;->b(Landroidx/recyclerview/widget/e2;Landroidx/recyclerview/widget/v0;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/p1;ZZ)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final f(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/l0;Landroidx/recyclerview/widget/e2;)I
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Ljava/util/BitSet;

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 11
    .line 12
    const/4 v9, 0x1

    .line 13
    invoke-virtual {v1, v8, v2, v9}, Ljava/util/BitSet;->set(IIZ)V

    .line 14
    .line 15
    .line 16
    iget-object v10, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g:Landroidx/recyclerview/widget/l0;

    .line 17
    .line 18
    iget-boolean v1, v10, Landroidx/recyclerview/widget/l0;->i:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget v1, v7, Landroidx/recyclerview/widget/l0;->e:I

    .line 23
    .line 24
    if-ne v1, v9, :cond_0

    .line 25
    .line 26
    const v13, 0x7fffffff

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/high16 v13, -0x80000000

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iget v1, v7, Landroidx/recyclerview/widget/l0;->e:I

    .line 34
    .line 35
    if-ne v1, v9, :cond_2

    .line 36
    .line 37
    iget v1, v7, Landroidx/recyclerview/widget/l0;->g:I

    .line 38
    .line 39
    iget v2, v7, Landroidx/recyclerview/widget/l0;->b:I

    .line 40
    .line 41
    add-int/2addr v1, v2

    .line 42
    :goto_0
    move v13, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iget v1, v7, Landroidx/recyclerview/widget/l0;->f:I

    .line 45
    .line 46
    iget v2, v7, Landroidx/recyclerview/widget/l0;->b:I

    .line 47
    .line 48
    sub-int/2addr v1, v2

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    iget v1, v7, Landroidx/recyclerview/widget/l0;->e:I

    .line 51
    .line 52
    invoke-virtual {v0, v1, v13}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z(II)V

    .line 53
    .line 54
    .line 55
    iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroidx/recyclerview/widget/v0;->g()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    :goto_2
    move v14, v1

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 68
    .line 69
    invoke-virtual {v1}, Landroidx/recyclerview/widget/v0;->k()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    goto :goto_2

    .line 74
    :goto_3
    const/4 v1, 0x0

    .line 75
    :goto_4
    iget v2, v7, Landroidx/recyclerview/widget/l0;->c:I

    .line 76
    .line 77
    const/4 v3, -0x1

    .line 78
    if-ltz v2, :cond_2d

    .line 79
    .line 80
    invoke-virtual/range {p3 .. p3}, Landroidx/recyclerview/widget/e2;->b()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-ge v2, v4, :cond_2d

    .line 85
    .line 86
    iget-boolean v2, v10, Landroidx/recyclerview/widget/l0;->i:Z

    .line 87
    .line 88
    if-nez v2, :cond_4

    .line 89
    .line 90
    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Ljava/util/BitSet;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/util/BitSet;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_2d

    .line 97
    .line 98
    :cond_4
    iget v1, v7, Landroidx/recyclerview/widget/l0;->c:I

    .line 99
    .line 100
    const-wide v4, 0x7fffffffffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    invoke-virtual {v6, v1, v4, v5}, Landroidx/recyclerview/widget/x1;->l(IJ)Landroidx/recyclerview/widget/i2;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object v1, v1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    .line 110
    .line 111
    iget v2, v7, Landroidx/recyclerview/widget/l0;->c:I

    .line 112
    .line 113
    iget v4, v7, Landroidx/recyclerview/widget/l0;->d:I

    .line 114
    .line 115
    add-int/2addr v2, v4

    .line 116
    iput v2, v7, Landroidx/recyclerview/widget/l0;->c:I

    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    move-object v15, v2

    .line 123
    check-cast v15, Landroidx/recyclerview/widget/o2;

    .line 124
    .line 125
    iget-object v2, v15, Landroidx/recyclerview/widget/q1;->a:Landroidx/recyclerview/widget/i2;

    .line 126
    .line 127
    invoke-virtual {v2}, Landroidx/recyclerview/widget/i2;->getLayoutPosition()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    iget-object v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Lu2/u;

    .line 132
    .line 133
    iget-object v5, v4, Lu2/u;->h:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v5, [I

    .line 136
    .line 137
    if-eqz v5, :cond_6

    .line 138
    .line 139
    array-length v11, v5

    .line 140
    if-lt v2, v11, :cond_5

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_5
    aget v5, v5, v2

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_6
    :goto_5
    const/4 v5, -0x1

    .line 147
    :goto_6
    if-ne v5, v3, :cond_7

    .line 148
    .line 149
    const/4 v11, 0x1

    .line 150
    goto :goto_7

    .line 151
    :cond_7
    const/4 v11, 0x0

    .line 152
    :goto_7
    if-eqz v11, :cond_e

    .line 153
    .line 154
    iget-boolean v5, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 155
    .line 156
    if-eqz v5, :cond_8

    .line 157
    .line 158
    iget-object v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 159
    .line 160
    aget-object v5, v5, v8

    .line 161
    .line 162
    goto :goto_b

    .line 163
    :cond_8
    iget v5, v7, Landroidx/recyclerview/widget/l0;->e:I

    .line 164
    .line 165
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s(I)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_9

    .line 170
    .line 171
    iget v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 172
    .line 173
    sub-int/2addr v5, v9

    .line 174
    const/4 v12, -0x1

    .line 175
    const/16 v16, -0x1

    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_9
    iget v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 179
    .line 180
    move v12, v5

    .line 181
    const/4 v5, 0x0

    .line 182
    const/16 v16, 0x1

    .line 183
    .line 184
    :goto_8
    iget v3, v7, Landroidx/recyclerview/widget/l0;->e:I

    .line 185
    .line 186
    const/16 v17, 0x0

    .line 187
    .line 188
    if-ne v3, v9, :cond_c

    .line 189
    .line 190
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 191
    .line 192
    invoke-virtual {v3}, Landroidx/recyclerview/widget/v0;->k()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    const v8, 0x7fffffff

    .line 197
    .line 198
    .line 199
    :goto_9
    if-eq v5, v12, :cond_b

    .line 200
    .line 201
    iget-object v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 202
    .line 203
    aget-object v9, v9, v5

    .line 204
    .line 205
    move/from16 v20, v5

    .line 206
    .line 207
    invoke-virtual {v9, v3}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-ge v5, v8, :cond_a

    .line 212
    .line 213
    move v8, v5

    .line 214
    move-object/from16 v17, v9

    .line 215
    .line 216
    :cond_a
    add-int v5, v20, v16

    .line 217
    .line 218
    const/4 v9, 0x1

    .line 219
    goto :goto_9

    .line 220
    :cond_b
    move-object/from16 v5, v17

    .line 221
    .line 222
    goto :goto_b

    .line 223
    :cond_c
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 224
    .line 225
    invoke-virtual {v3}, Landroidx/recyclerview/widget/v0;->g()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    const/high16 v8, -0x80000000

    .line 230
    .line 231
    :goto_a
    if-eq v5, v12, :cond_b

    .line 232
    .line 233
    iget-object v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 234
    .line 235
    aget-object v9, v9, v5

    .line 236
    .line 237
    move/from16 v20, v5

    .line 238
    .line 239
    invoke-virtual {v9, v3}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    if-le v5, v8, :cond_d

    .line 244
    .line 245
    move v8, v5

    .line 246
    move-object/from16 v17, v9

    .line 247
    .line 248
    :cond_d
    add-int v5, v20, v16

    .line 249
    .line 250
    goto :goto_a

    .line 251
    :goto_b
    invoke-virtual {v4, v2}, Lu2/u;->l(I)V

    .line 252
    .line 253
    .line 254
    iget-object v3, v4, Lu2/u;->h:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v3, [I

    .line 257
    .line 258
    iget v8, v5, Landroidx/recyclerview/widget/r2;->e:I

    .line 259
    .line 260
    aput v8, v3, v2

    .line 261
    .line 262
    :goto_c
    move-object v8, v5

    .line 263
    goto :goto_d

    .line 264
    :cond_e
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 265
    .line 266
    aget-object v5, v3, v5

    .line 267
    .line 268
    goto :goto_c

    .line 269
    :goto_d
    iput-object v8, v15, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 270
    .line 271
    iget v3, v7, Landroidx/recyclerview/widget/l0;->e:I

    .line 272
    .line 273
    const/4 v5, 0x1

    .line 274
    if-ne v3, v5, :cond_f

    .line 275
    .line 276
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/p1;->addView(Landroid/view/View;)V

    .line 277
    .line 278
    .line 279
    goto :goto_e

    .line 280
    :cond_f
    const/4 v3, 0x0

    .line 281
    invoke-virtual {v0, v1, v3}, Landroidx/recyclerview/widget/p1;->addView(Landroid/view/View;I)V

    .line 282
    .line 283
    .line 284
    :goto_e
    iget-boolean v3, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 285
    .line 286
    if-eqz v3, :cond_11

    .line 287
    .line 288
    iget v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 289
    .line 290
    if-ne v3, v5, :cond_10

    .line 291
    .line 292
    iget v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I

    .line 293
    .line 294
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getHeight()I

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getHeightMode()I

    .line 299
    .line 300
    .line 301
    move-result v12

    .line 302
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingTop()I

    .line 303
    .line 304
    .line 305
    move-result v16

    .line 306
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingBottom()I

    .line 307
    .line 308
    .line 309
    move-result v17

    .line 310
    move/from16 v20, v11

    .line 311
    .line 312
    add-int v11, v17, v16

    .line 313
    .line 314
    iget v6, v15, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 315
    .line 316
    invoke-static {v9, v12, v11, v6, v5}, Landroidx/recyclerview/widget/p1;->getChildMeasureSpec(IIIIZ)I

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    invoke-virtual {v0, v1, v3, v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q(Landroid/view/View;II)V

    .line 321
    .line 322
    .line 323
    goto :goto_f

    .line 324
    :cond_10
    move/from16 v20, v11

    .line 325
    .line 326
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getWidth()I

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getWidthMode()I

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingLeft()I

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingRight()I

    .line 339
    .line 340
    .line 341
    move-result v11

    .line 342
    add-int/2addr v11, v9

    .line 343
    iget v9, v15, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 344
    .line 345
    invoke-static {v3, v6, v11, v9, v5}, Landroidx/recyclerview/widget/p1;->getChildMeasureSpec(IIIIZ)I

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    iget v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I

    .line 350
    .line 351
    invoke-virtual {v0, v1, v3, v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q(Landroid/view/View;II)V

    .line 352
    .line 353
    .line 354
    goto :goto_f

    .line 355
    :cond_11
    move/from16 v20, v11

    .line 356
    .line 357
    iget v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 358
    .line 359
    if-ne v3, v5, :cond_12

    .line 360
    .line 361
    iget v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 362
    .line 363
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getWidthMode()I

    .line 364
    .line 365
    .line 366
    move-result v6

    .line 367
    iget v9, v15, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 368
    .line 369
    const/4 v11, 0x0

    .line 370
    invoke-static {v3, v6, v11, v9, v11}, Landroidx/recyclerview/widget/p1;->getChildMeasureSpec(IIIIZ)I

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getHeight()I

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getHeightMode()I

    .line 379
    .line 380
    .line 381
    move-result v9

    .line 382
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingTop()I

    .line 383
    .line 384
    .line 385
    move-result v11

    .line 386
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingBottom()I

    .line 387
    .line 388
    .line 389
    move-result v12

    .line 390
    add-int/2addr v12, v11

    .line 391
    iget v11, v15, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 392
    .line 393
    invoke-static {v6, v9, v12, v11, v5}, Landroidx/recyclerview/widget/p1;->getChildMeasureSpec(IIIIZ)I

    .line 394
    .line 395
    .line 396
    move-result v6

    .line 397
    invoke-virtual {v0, v1, v3, v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q(Landroid/view/View;II)V

    .line 398
    .line 399
    .line 400
    goto :goto_f

    .line 401
    :cond_12
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getWidth()I

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getWidthMode()I

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingLeft()I

    .line 410
    .line 411
    .line 412
    move-result v9

    .line 413
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingRight()I

    .line 414
    .line 415
    .line 416
    move-result v11

    .line 417
    add-int/2addr v11, v9

    .line 418
    iget v9, v15, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 419
    .line 420
    invoke-static {v3, v6, v11, v9, v5}, Landroidx/recyclerview/widget/p1;->getChildMeasureSpec(IIIIZ)I

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    iget v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 425
    .line 426
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getHeightMode()I

    .line 427
    .line 428
    .line 429
    move-result v9

    .line 430
    iget v11, v15, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 431
    .line 432
    const/4 v12, 0x0

    .line 433
    invoke-static {v6, v9, v12, v11, v12}, Landroidx/recyclerview/widget/p1;->getChildMeasureSpec(IIIIZ)I

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    invoke-virtual {v0, v1, v3, v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q(Landroid/view/View;II)V

    .line 438
    .line 439
    .line 440
    :goto_f
    iget v3, v7, Landroidx/recyclerview/widget/l0;->e:I

    .line 441
    .line 442
    if-ne v3, v5, :cond_15

    .line 443
    .line 444
    iget-boolean v3, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 445
    .line 446
    if-eqz v3, :cond_13

    .line 447
    .line 448
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m(I)I

    .line 449
    .line 450
    .line 451
    move-result v3

    .line 452
    goto :goto_10

    .line 453
    :cond_13
    invoke-virtual {v8, v14}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    :goto_10
    iget-object v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 458
    .line 459
    invoke-virtual {v5, v1}, Landroidx/recyclerview/widget/v0;->c(Landroid/view/View;)I

    .line 460
    .line 461
    .line 462
    move-result v5

    .line 463
    add-int/2addr v5, v3

    .line 464
    if-eqz v20, :cond_18

    .line 465
    .line 466
    iget-boolean v6, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 467
    .line 468
    if-eqz v6, :cond_18

    .line 469
    .line 470
    new-instance v6, Landroidx/recyclerview/widget/p2;

    .line 471
    .line 472
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 473
    .line 474
    .line 475
    iget v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 476
    .line 477
    new-array v9, v9, [I

    .line 478
    .line 479
    iput-object v9, v6, Landroidx/recyclerview/widget/p2;->j:[I

    .line 480
    .line 481
    const/4 v9, 0x0

    .line 482
    :goto_11
    iget v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 483
    .line 484
    if-ge v9, v11, :cond_14

    .line 485
    .line 486
    iget-object v11, v6, Landroidx/recyclerview/widget/p2;->j:[I

    .line 487
    .line 488
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 489
    .line 490
    aget-object v12, v12, v9

    .line 491
    .line 492
    invoke-virtual {v12, v3}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 493
    .line 494
    .line 495
    move-result v12

    .line 496
    sub-int v12, v3, v12

    .line 497
    .line 498
    aput v12, v11, v9

    .line 499
    .line 500
    add-int/lit8 v9, v9, 0x1

    .line 501
    .line 502
    goto :goto_11

    .line 503
    :cond_14
    const/4 v9, -0x1

    .line 504
    iput v9, v6, Landroidx/recyclerview/widget/p2;->i:I

    .line 505
    .line 506
    iput v2, v6, Landroidx/recyclerview/widget/p2;->h:I

    .line 507
    .line 508
    invoke-virtual {v4, v6}, Lu2/u;->i(Landroidx/recyclerview/widget/p2;)V

    .line 509
    .line 510
    .line 511
    goto :goto_15

    .line 512
    :cond_15
    iget-boolean v3, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 513
    .line 514
    if-eqz v3, :cond_16

    .line 515
    .line 516
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n(I)I

    .line 517
    .line 518
    .line 519
    move-result v3

    .line 520
    :goto_12
    move v5, v3

    .line 521
    goto :goto_13

    .line 522
    :cond_16
    invoke-virtual {v8, v14}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 523
    .line 524
    .line 525
    move-result v3

    .line 526
    goto :goto_12

    .line 527
    :goto_13
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 528
    .line 529
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/v0;->c(Landroid/view/View;)I

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    sub-int v3, v5, v3

    .line 534
    .line 535
    if-eqz v20, :cond_18

    .line 536
    .line 537
    iget-boolean v6, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 538
    .line 539
    if-eqz v6, :cond_18

    .line 540
    .line 541
    new-instance v6, Landroidx/recyclerview/widget/p2;

    .line 542
    .line 543
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 544
    .line 545
    .line 546
    iget v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 547
    .line 548
    new-array v9, v9, [I

    .line 549
    .line 550
    iput-object v9, v6, Landroidx/recyclerview/widget/p2;->j:[I

    .line 551
    .line 552
    const/4 v9, 0x0

    .line 553
    :goto_14
    iget v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 554
    .line 555
    if-ge v9, v11, :cond_17

    .line 556
    .line 557
    iget-object v11, v6, Landroidx/recyclerview/widget/p2;->j:[I

    .line 558
    .line 559
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 560
    .line 561
    aget-object v12, v12, v9

    .line 562
    .line 563
    invoke-virtual {v12, v5}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 564
    .line 565
    .line 566
    move-result v12

    .line 567
    sub-int/2addr v12, v5

    .line 568
    aput v12, v11, v9

    .line 569
    .line 570
    add-int/lit8 v9, v9, 0x1

    .line 571
    .line 572
    goto :goto_14

    .line 573
    :cond_17
    const/4 v9, 0x1

    .line 574
    iput v9, v6, Landroidx/recyclerview/widget/p2;->i:I

    .line 575
    .line 576
    iput v2, v6, Landroidx/recyclerview/widget/p2;->h:I

    .line 577
    .line 578
    invoke-virtual {v4, v6}, Lu2/u;->i(Landroidx/recyclerview/widget/p2;)V

    .line 579
    .line 580
    .line 581
    :cond_18
    :goto_15
    iget-boolean v6, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 582
    .line 583
    if-eqz v6, :cond_19

    .line 584
    .line 585
    iget v6, v7, Landroidx/recyclerview/widget/l0;->d:I

    .line 586
    .line 587
    const/4 v9, -0x1

    .line 588
    if-ne v6, v9, :cond_19

    .line 589
    .line 590
    if-eqz v20, :cond_1a

    .line 591
    .line 592
    const/4 v9, 0x1

    .line 593
    iput-boolean v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u:Z

    .line 594
    .line 595
    :cond_19
    const/4 v6, 0x1

    .line 596
    const/high16 v9, -0x80000000

    .line 597
    .line 598
    goto :goto_1b

    .line 599
    :cond_1a
    const/4 v9, 0x1

    .line 600
    iget v6, v7, Landroidx/recyclerview/widget/l0;->e:I

    .line 601
    .line 602
    if-ne v6, v9, :cond_1d

    .line 603
    .line 604
    iget-object v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 605
    .line 606
    const/16 v18, 0x0

    .line 607
    .line 608
    aget-object v6, v6, v18

    .line 609
    .line 610
    const/high16 v9, -0x80000000

    .line 611
    .line 612
    invoke-virtual {v6, v9}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 613
    .line 614
    .line 615
    move-result v6

    .line 616
    const/4 v11, 0x1

    .line 617
    :goto_16
    iget v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 618
    .line 619
    if-ge v11, v12, :cond_1c

    .line 620
    .line 621
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 622
    .line 623
    aget-object v12, v12, v11

    .line 624
    .line 625
    invoke-virtual {v12, v9}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 626
    .line 627
    .line 628
    move-result v12

    .line 629
    if-eq v12, v6, :cond_1b

    .line 630
    .line 631
    const/16 v19, 0x0

    .line 632
    .line 633
    :goto_17
    const/4 v6, 0x1

    .line 634
    goto :goto_18

    .line 635
    :cond_1b
    add-int/lit8 v11, v11, 0x1

    .line 636
    .line 637
    goto :goto_16

    .line 638
    :cond_1c
    const/16 v19, 0x1

    .line 639
    .line 640
    goto :goto_17

    .line 641
    :goto_18
    xor-int/lit8 v11, v19, 0x1

    .line 642
    .line 643
    goto :goto_1a

    .line 644
    :cond_1d
    const/high16 v9, -0x80000000

    .line 645
    .line 646
    iget-object v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 647
    .line 648
    const/16 v18, 0x0

    .line 649
    .line 650
    aget-object v6, v6, v18

    .line 651
    .line 652
    invoke-virtual {v6, v9}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 653
    .line 654
    .line 655
    move-result v6

    .line 656
    const/4 v11, 0x1

    .line 657
    :goto_19
    iget v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 658
    .line 659
    if-ge v11, v12, :cond_1f

    .line 660
    .line 661
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 662
    .line 663
    aget-object v12, v12, v11

    .line 664
    .line 665
    invoke-virtual {v12, v9}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 666
    .line 667
    .line 668
    move-result v12

    .line 669
    if-eq v12, v6, :cond_1e

    .line 670
    .line 671
    const/16 v19, 0x0

    .line 672
    .line 673
    goto :goto_17

    .line 674
    :cond_1e
    add-int/lit8 v11, v11, 0x1

    .line 675
    .line 676
    goto :goto_19

    .line 677
    :cond_1f
    const/16 v19, 0x1

    .line 678
    .line 679
    goto :goto_17

    .line 680
    :goto_1a
    if-eqz v11, :cond_21

    .line 681
    .line 682
    invoke-virtual {v4, v2}, Lu2/u;->o(I)Landroidx/recyclerview/widget/p2;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    if-eqz v2, :cond_20

    .line 687
    .line 688
    iput-boolean v6, v2, Landroidx/recyclerview/widget/p2;->k:Z

    .line 689
    .line 690
    :cond_20
    iput-boolean v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u:Z

    .line 691
    .line 692
    :cond_21
    :goto_1b
    iget v2, v7, Landroidx/recyclerview/widget/l0;->e:I

    .line 693
    .line 694
    if-ne v2, v6, :cond_23

    .line 695
    .line 696
    iget-boolean v2, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 697
    .line 698
    if-eqz v2, :cond_22

    .line 699
    .line 700
    iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 701
    .line 702
    sub-int/2addr v2, v6

    .line 703
    :goto_1c
    if-ltz v2, :cond_25

    .line 704
    .line 705
    iget-object v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 706
    .line 707
    aget-object v4, v4, v2

    .line 708
    .line 709
    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/r2;->a(Landroid/view/View;)V

    .line 710
    .line 711
    .line 712
    add-int/lit8 v2, v2, -0x1

    .line 713
    .line 714
    goto :goto_1c

    .line 715
    :cond_22
    iget-object v2, v15, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 716
    .line 717
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/r2;->a(Landroid/view/View;)V

    .line 718
    .line 719
    .line 720
    goto :goto_1e

    .line 721
    :cond_23
    iget-boolean v2, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 722
    .line 723
    if-eqz v2, :cond_24

    .line 724
    .line 725
    iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 726
    .line 727
    const/16 v19, 0x1

    .line 728
    .line 729
    add-int/lit8 v2, v2, -0x1

    .line 730
    .line 731
    :goto_1d
    if-ltz v2, :cond_25

    .line 732
    .line 733
    iget-object v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 734
    .line 735
    aget-object v4, v4, v2

    .line 736
    .line 737
    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/r2;->o(Landroid/view/View;)V

    .line 738
    .line 739
    .line 740
    add-int/lit8 v2, v2, -0x1

    .line 741
    .line 742
    goto :goto_1d

    .line 743
    :cond_24
    iget-object v2, v15, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 744
    .line 745
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/r2;->o(Landroid/view/View;)V

    .line 746
    .line 747
    .line 748
    :cond_25
    :goto_1e
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    .line 749
    .line 750
    .line 751
    move-result v2

    .line 752
    if-eqz v2, :cond_27

    .line 753
    .line 754
    iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 755
    .line 756
    const/4 v6, 0x1

    .line 757
    if-ne v2, v6, :cond_27

    .line 758
    .line 759
    iget-boolean v2, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 760
    .line 761
    if-eqz v2, :cond_26

    .line 762
    .line 763
    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 764
    .line 765
    invoke-virtual {v2}, Landroidx/recyclerview/widget/v0;->g()I

    .line 766
    .line 767
    .line 768
    move-result v2

    .line 769
    goto :goto_1f

    .line 770
    :cond_26
    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 771
    .line 772
    invoke-virtual {v2}, Landroidx/recyclerview/widget/v0;->g()I

    .line 773
    .line 774
    .line 775
    move-result v2

    .line 776
    iget v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 777
    .line 778
    sub-int/2addr v4, v6

    .line 779
    iget v6, v8, Landroidx/recyclerview/widget/r2;->e:I

    .line 780
    .line 781
    sub-int/2addr v4, v6

    .line 782
    iget v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 783
    .line 784
    mul-int v4, v4, v6

    .line 785
    .line 786
    sub-int/2addr v2, v4

    .line 787
    :goto_1f
    iget-object v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 788
    .line 789
    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/v0;->c(Landroid/view/View;)I

    .line 790
    .line 791
    .line 792
    move-result v4

    .line 793
    sub-int v4, v2, v4

    .line 794
    .line 795
    :goto_20
    move/from16 v21, v4

    .line 796
    .line 797
    move v4, v2

    .line 798
    move/from16 v2, v21

    .line 799
    .line 800
    goto :goto_22

    .line 801
    :cond_27
    iget-boolean v2, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 802
    .line 803
    if-eqz v2, :cond_28

    .line 804
    .line 805
    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 806
    .line 807
    invoke-virtual {v2}, Landroidx/recyclerview/widget/v0;->k()I

    .line 808
    .line 809
    .line 810
    move-result v2

    .line 811
    move v4, v2

    .line 812
    goto :goto_21

    .line 813
    :cond_28
    iget v2, v8, Landroidx/recyclerview/widget/r2;->e:I

    .line 814
    .line 815
    iget v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 816
    .line 817
    mul-int v2, v2, v4

    .line 818
    .line 819
    iget-object v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 820
    .line 821
    invoke-virtual {v4}, Landroidx/recyclerview/widget/v0;->k()I

    .line 822
    .line 823
    .line 824
    move-result v4

    .line 825
    add-int/2addr v4, v2

    .line 826
    :goto_21
    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 827
    .line 828
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/v0;->c(Landroid/view/View;)I

    .line 829
    .line 830
    .line 831
    move-result v2

    .line 832
    add-int/2addr v2, v4

    .line 833
    goto :goto_20

    .line 834
    :goto_22
    iget v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 835
    .line 836
    const/4 v11, 0x1

    .line 837
    if-ne v6, v11, :cond_29

    .line 838
    .line 839
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/p1;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    .line 840
    .line 841
    .line 842
    move-object/from16 v0, p0

    .line 843
    .line 844
    goto :goto_23

    .line 845
    :cond_29
    move/from16 v21, v3

    .line 846
    .line 847
    move v3, v2

    .line 848
    move/from16 v2, v21

    .line 849
    .line 850
    move/from16 v21, v5

    .line 851
    .line 852
    move v5, v4

    .line 853
    move/from16 v4, v21

    .line 854
    .line 855
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/p1;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    .line 856
    .line 857
    .line 858
    :goto_23
    iget-boolean v2, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 859
    .line 860
    if-eqz v2, :cond_2a

    .line 861
    .line 862
    iget v2, v10, Landroidx/recyclerview/widget/l0;->e:I

    .line 863
    .line 864
    invoke-virtual {v0, v2, v13}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z(II)V

    .line 865
    .line 866
    .line 867
    :goto_24
    move-object/from16 v6, p1

    .line 868
    .line 869
    goto :goto_25

    .line 870
    :cond_2a
    iget v2, v10, Landroidx/recyclerview/widget/l0;->e:I

    .line 871
    .line 872
    invoke-virtual {v0, v8, v2, v13}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B(Landroidx/recyclerview/widget/r2;II)V

    .line 873
    .line 874
    .line 875
    goto :goto_24

    .line 876
    :goto_25
    invoke-virtual {v0, v6, v10}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/l0;)V

    .line 877
    .line 878
    .line 879
    iget-boolean v2, v10, Landroidx/recyclerview/widget/l0;->h:Z

    .line 880
    .line 881
    if-eqz v2, :cond_2c

    .line 882
    .line 883
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 884
    .line 885
    .line 886
    move-result v1

    .line 887
    if-eqz v1, :cond_2c

    .line 888
    .line 889
    iget-boolean v1, v15, Landroidx/recyclerview/widget/o2;->f:Z

    .line 890
    .line 891
    if-eqz v1, :cond_2b

    .line 892
    .line 893
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Ljava/util/BitSet;

    .line 894
    .line 895
    invoke-virtual {v1}, Ljava/util/BitSet;->clear()V

    .line 896
    .line 897
    .line 898
    goto :goto_26

    .line 899
    :cond_2b
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Ljava/util/BitSet;

    .line 900
    .line 901
    iget v2, v8, Landroidx/recyclerview/widget/r2;->e:I

    .line 902
    .line 903
    const/4 v12, 0x0

    .line 904
    invoke-virtual {v1, v2, v12}, Ljava/util/BitSet;->set(IZ)V

    .line 905
    .line 906
    .line 907
    :cond_2c
    :goto_26
    const/4 v1, 0x1

    .line 908
    const/4 v8, 0x0

    .line 909
    const/4 v9, 0x1

    .line 910
    goto/16 :goto_4

    .line 911
    .line 912
    :cond_2d
    if-nez v1, :cond_2e

    .line 913
    .line 914
    invoke-virtual {v0, v6, v10}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/l0;)V

    .line 915
    .line 916
    .line 917
    :cond_2e
    iget v1, v10, Landroidx/recyclerview/widget/l0;->e:I

    .line 918
    .line 919
    const/4 v9, -0x1

    .line 920
    if-ne v1, v9, :cond_2f

    .line 921
    .line 922
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 923
    .line 924
    invoke-virtual {v1}, Landroidx/recyclerview/widget/v0;->k()I

    .line 925
    .line 926
    .line 927
    move-result v1

    .line 928
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n(I)I

    .line 929
    .line 930
    .line 931
    move-result v1

    .line 932
    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 933
    .line 934
    invoke-virtual {v2}, Landroidx/recyclerview/widget/v0;->k()I

    .line 935
    .line 936
    .line 937
    move-result v2

    .line 938
    sub-int/2addr v2, v1

    .line 939
    goto :goto_27

    .line 940
    :cond_2f
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 941
    .line 942
    invoke-virtual {v1}, Landroidx/recyclerview/widget/v0;->g()I

    .line 943
    .line 944
    .line 945
    move-result v1

    .line 946
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m(I)I

    .line 947
    .line 948
    .line 949
    move-result v1

    .line 950
    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 951
    .line 952
    invoke-virtual {v2}, Landroidx/recyclerview/widget/v0;->g()I

    .line 953
    .line 954
    .line 955
    move-result v2

    .line 956
    sub-int v2, v1, v2

    .line 957
    .line 958
    :goto_27
    if-lez v2, :cond_30

    .line 959
    .line 960
    iget v1, v7, Landroidx/recyclerview/widget/l0;->b:I

    .line 961
    .line 962
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 963
    .line 964
    .line 965
    move-result v1

    .line 966
    return v1

    .line 967
    :cond_30
    const/16 v18, 0x0

    .line 968
    .line 969
    return v18
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
.end method

.method public final g(Z)Landroid/view/View;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/v0;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/recyclerview/widget/v0;->g()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ltz v2, :cond_4

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 27
    .line 28
    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/v0;->e(Landroid/view/View;)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 33
    .line 34
    invoke-virtual {v6, v4}, Landroidx/recyclerview/widget/v0;->b(Landroid/view/View;)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-le v6, v0, :cond_3

    .line 39
    .line 40
    if-lt v5, v1, :cond_0

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_0
    if-le v6, v1, :cond_2

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    if-nez v3, :cond_3

    .line 49
    .line 50
    move-object v3, v4

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_1
    return-object v4

    .line 53
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, -0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    return-object v3
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

.method public final generateDefaultLayoutParams()Landroidx/recyclerview/widget/q1;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, -0x2

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/recyclerview/widget/o2;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Landroidx/recyclerview/widget/q1;-><init>(II)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/o2;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/q1;-><init>(II)V

    .line 16
    .line 17
    .line 18
    return-object v0
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

.method public final generateLayoutParams(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/q1;
    .locals 1

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/o2;

    .line 2
    invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/q1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/q1;
    .locals 1

    .line 3
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Landroidx/recyclerview/widget/o2;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 5
    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/q1;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/o2;

    .line 7
    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/q1;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final getColumnCountForAccessibility(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I
    .locals 1

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 7
    .line 8
    invoke-virtual {p2}, Landroidx/recyclerview/widget/e2;->b()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, -0x1

    .line 18
    return p1
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
    .line 38
    .line 39
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
.end method

.method public final getRowCountForAccessibility(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I
    .locals 0

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/recyclerview/widget/e2;->b()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, -0x1

    .line 17
    return p1
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
    .line 38
    .line 39
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
.end method

.method public final h(Z)Landroid/view/View;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/v0;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/recyclerview/widget/v0;->g()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    :goto_0
    if-ge v4, v2, :cond_4

    .line 20
    .line 21
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 26
    .line 27
    invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/v0;->e(Landroid/view/View;)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 32
    .line 33
    invoke-virtual {v7, v5}, Landroidx/recyclerview/widget/v0;->b(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-le v7, v0, :cond_3

    .line 38
    .line 39
    if-lt v6, v1, :cond_0

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    if-ge v6, v0, :cond_2

    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    if-nez v3, :cond_3

    .line 48
    .line 49
    move-object v3, v5

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    :goto_1
    return-object v5

    .line 52
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    return-object v3
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

.method public final i(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Z)V
    .locals 2

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ne v1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/recyclerview/widget/v0;->g()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sub-int/2addr v0, v1

    .line 17
    if-lez v0, :cond_1

    .line 18
    .line 19
    neg-int v1, v0

    .line 20
    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    neg-int p1, p1

    .line 25
    sub-int/2addr v0, p1

    .line 26
    if-eqz p3, :cond_1

    .line 27
    .line 28
    if-lez v0, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/v0;->o(I)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final isAutoMeasureEnabled()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public final isLayoutRTL()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public final isLayoutReversed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:Z

    .line 2
    .line 3
    return v0
    .line 4
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

.method public final j(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Z)V
    .locals 2

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ne v1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/recyclerview/widget/v0;->k()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sub-int/2addr v1, v0

    .line 18
    if-lez v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    sub-int/2addr v1, p1

    .line 25
    if-eqz p3, :cond_1

    .line 26
    .line 27
    if-lez v1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 30
    .line 31
    neg-int p2, v1

    .line 32
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/v0;->o(I)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final k()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
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

.method public final l()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
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

.method public final m(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    :goto_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 12
    .line 13
    if-ge v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 16
    .line 17
    aget-object v2, v2, v1

    .line 18
    .line 19
    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-le v2, v0, :cond_0

    .line 24
    .line 25
    move v0, v2

    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return v0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final n(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    :goto_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 12
    .line 13
    if-ge v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 16
    .line 17
    aget-object v2, v2, v1

    .line 18
    .line 19
    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ge v2, v0, :cond_0

    .line 24
    .line 25
    move v0, v2

    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return v0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final o(III)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    :goto_0
    const/16 v1, 0x8

    .line 15
    .line 16
    if-ne p3, v1, :cond_2

    .line 17
    .line 18
    if-ge p1, p2, :cond_1

    .line 19
    .line 20
    add-int/lit8 v2, p2, 0x1

    .line 21
    .line 22
    :goto_1
    move v3, p1

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    add-int/lit8 v2, p1, 0x1

    .line 25
    .line 26
    move v3, p2

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    add-int v2, p1, p2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :goto_2
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Lu2/u;

    .line 32
    .line 33
    invoke-virtual {v4, v3}, Lu2/u;->r(I)I

    .line 34
    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    if-eq p3, v5, :cond_5

    .line 38
    .line 39
    const/4 v6, 0x2

    .line 40
    if-eq p3, v6, :cond_4

    .line 41
    .line 42
    if-eq p3, v1, :cond_3

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_3
    invoke-virtual {v4, p1, v5}, Lu2/u;->u(II)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, p2, v5}, Lu2/u;->t(II)V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    invoke-virtual {v4, p1, p2}, Lu2/u;->u(II)V

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_5
    invoke-virtual {v4, p1, p2}, Lu2/u;->t(II)V

    .line 57
    .line 58
    .line 59
    :goto_3
    if-gt v2, v0, :cond_6

    .line 60
    .line 61
    goto :goto_5

    .line 62
    :cond_6
    iget-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 63
    .line 64
    if-eqz p1, :cond_7

    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    goto :goto_4

    .line 71
    :cond_7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    :goto_4
    if-gt v3, p1, :cond_8

    .line 76
    .line 77
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 78
    .line 79
    .line 80
    :cond_8
    :goto_5
    return-void
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
.end method

.method public final offsetChildrenHorizontal(I)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/p1;->offsetChildrenHorizontal(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 6
    .line 7
    if-ge v0, v1, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 10
    .line 11
    aget-object v1, v1, v0

    .line 12
    .line 13
    iget v2, v1, Landroidx/recyclerview/widget/r2;->b:I

    .line 14
    .line 15
    const/high16 v3, -0x80000000

    .line 16
    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    add-int/2addr v2, p1

    .line 20
    iput v2, v1, Landroidx/recyclerview/widget/r2;->b:I

    .line 21
    .line 22
    :cond_0
    iget v2, v1, Landroidx/recyclerview/widget/r2;->c:I

    .line 23
    .line 24
    if-eq v2, v3, :cond_1

    .line 25
    .line 26
    add-int/2addr v2, p1

    .line 27
    iput v2, v1, Landroidx/recyclerview/widget/r2;->c:I

    .line 28
    .line 29
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final offsetChildrenVertical(I)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/p1;->offsetChildrenVertical(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 6
    .line 7
    if-ge v0, v1, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 10
    .line 11
    aget-object v1, v1, v0

    .line 12
    .line 13
    iget v2, v1, Landroidx/recyclerview/widget/r2;->b:I

    .line 14
    .line 15
    const/high16 v3, -0x80000000

    .line 16
    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    add-int/2addr v2, p1

    .line 20
    iput v2, v1, Landroidx/recyclerview/widget/r2;->b:I

    .line 21
    .line 22
    :cond_0
    iget v2, v1, Landroidx/recyclerview/widget/r2;->c:I

    .line 23
    .line 24
    if-eq v2, v3, :cond_1

    .line 25
    .line 26
    add-int/2addr v2, p1

    .line 27
    iput v2, v1, Landroidx/recyclerview/widget/r2;->c:I

    .line 28
    .line 29
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final onAdapterChanged(Landroidx/recyclerview/widget/c1;Landroidx/recyclerview/widget/c1;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Lu2/u;

    .line 2
    .line 3
    invoke-virtual {p1}, Lu2/u;->j()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    :goto_0
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 8
    .line 9
    if-ge p1, p2, :cond_0

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 12
    .line 13
    aget-object p2, p2, p1

    .line 14
    .line 15
    invoke-virtual {p2}, Landroidx/recyclerview/widget/r2;->d()V

    .line 16
    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
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
    .line 38
    .line 39
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
.end method

.method public final onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/x1;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/p1;->onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->x:Landroidx/recyclerview/widget/a0;

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/p1;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 11
    .line 12
    if-ge p2, v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 15
    .line 16
    aget-object v0, v0, p2

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/recyclerview/widget/r2;->d()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 p2, p2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 25
    .line 26
    .line 27
    return-void
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
    .line 38
    .line 39
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
.end method

.method public final onFocusSearchFailed(Landroid/view/View;ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)Landroid/view/View;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_f

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/p1;->findContainingItemView(Landroid/view/View;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto/16 :goto_f

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->x()V

    .line 18
    .line 19
    .line 20
    const/high16 v0, -0x80000000

    .line 21
    .line 22
    const/4 v1, -0x1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-eq p2, v2, :cond_b

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-eq p2, v3, :cond_9

    .line 28
    .line 29
    const/16 v3, 0x11

    .line 30
    .line 31
    if-eq p2, v3, :cond_8

    .line 32
    .line 33
    const/16 v3, 0x21

    .line 34
    .line 35
    if-eq p2, v3, :cond_6

    .line 36
    .line 37
    const/16 v3, 0x42

    .line 38
    .line 39
    if-eq p2, v3, :cond_5

    .line 40
    .line 41
    const/16 v3, 0x82

    .line 42
    .line 43
    if-eq p2, v3, :cond_3

    .line 44
    .line 45
    :cond_2
    const/high16 p2, -0x80000000

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 49
    .line 50
    if-ne p2, v2, :cond_2

    .line 51
    .line 52
    :cond_4
    :goto_0
    const/4 p2, 0x1

    .line 53
    goto :goto_3

    .line 54
    :cond_5
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 55
    .line 56
    if-nez p2, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 60
    .line 61
    if-ne p2, v2, :cond_2

    .line 62
    .line 63
    :cond_7
    :goto_1
    const/4 p2, -0x1

    .line 64
    goto :goto_3

    .line 65
    :cond_8
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 66
    .line 67
    if-nez p2, :cond_2

    .line 68
    .line 69
    :goto_2
    goto :goto_1

    .line 70
    :cond_9
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 71
    .line 72
    if-ne p2, v2, :cond_a

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-eqz p2, :cond_4

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_b
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 83
    .line 84
    if-ne p2, v2, :cond_c

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_7

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :goto_3
    if-ne p2, v0, :cond_d

    .line 95
    .line 96
    goto/16 :goto_f

    .line 97
    .line 98
    :cond_d
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Landroidx/recyclerview/widget/o2;

    .line 103
    .line 104
    iget-boolean v3, v0, Landroidx/recyclerview/widget/o2;->f:Z

    .line 105
    .line 106
    iget-object v0, v0, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 107
    .line 108
    if-ne p2, v2, :cond_e

    .line 109
    .line 110
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    goto :goto_4

    .line 115
    :cond_e
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    :goto_4
    invoke-virtual {p0, v4, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->A(ILandroidx/recyclerview/widget/e2;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y(I)V

    .line 123
    .line 124
    .line 125
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g:Landroidx/recyclerview/widget/l0;

    .line 126
    .line 127
    iget v6, v5, Landroidx/recyclerview/widget/l0;->d:I

    .line 128
    .line 129
    add-int/2addr v6, v4

    .line 130
    iput v6, v5, Landroidx/recyclerview/widget/l0;->c:I

    .line 131
    .line 132
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 133
    .line 134
    invoke-virtual {v6}, Landroidx/recyclerview/widget/v0;->l()I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    int-to-float v6, v6

    .line 139
    const v7, 0x3eaaaaab

    .line 140
    .line 141
    .line 142
    mul-float v6, v6, v7

    .line 143
    .line 144
    float-to-int v6, v6

    .line 145
    iput v6, v5, Landroidx/recyclerview/widget/l0;->b:I

    .line 146
    .line 147
    iput-boolean v2, v5, Landroidx/recyclerview/widget/l0;->h:Z

    .line 148
    .line 149
    const/4 v6, 0x0

    .line 150
    iput-boolean v6, v5, Landroidx/recyclerview/widget/l0;->a:Z

    .line 151
    .line 152
    invoke-virtual {p0, p3, v5, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/l0;Landroidx/recyclerview/widget/e2;)I

    .line 153
    .line 154
    .line 155
    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 156
    .line 157
    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:Z

    .line 158
    .line 159
    if-nez v3, :cond_f

    .line 160
    .line 161
    invoke-virtual {v0, v4, p2}, Landroidx/recyclerview/widget/r2;->k(II)Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    if-eqz p3, :cond_f

    .line 166
    .line 167
    if-eq p3, p1, :cond_f

    .line 168
    .line 169
    return-object p3

    .line 170
    :cond_f
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s(I)Z

    .line 171
    .line 172
    .line 173
    move-result p3

    .line 174
    if-eqz p3, :cond_11

    .line 175
    .line 176
    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 177
    .line 178
    sub-int/2addr p3, v2

    .line 179
    :goto_5
    if-ltz p3, :cond_13

    .line 180
    .line 181
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 182
    .line 183
    aget-object p4, p4, p3

    .line 184
    .line 185
    invoke-virtual {p4, v4, p2}, Landroidx/recyclerview/widget/r2;->k(II)Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object p4

    .line 189
    if-eqz p4, :cond_10

    .line 190
    .line 191
    if-eq p4, p1, :cond_10

    .line 192
    .line 193
    return-object p4

    .line 194
    :cond_10
    add-int/lit8 p3, p3, -0x1

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_11
    const/4 p3, 0x0

    .line 198
    :goto_6
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 199
    .line 200
    if-ge p3, p4, :cond_13

    .line 201
    .line 202
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 203
    .line 204
    aget-object p4, p4, p3

    .line 205
    .line 206
    invoke-virtual {p4, v4, p2}, Landroidx/recyclerview/widget/r2;->k(II)Landroid/view/View;

    .line 207
    .line 208
    .line 209
    move-result-object p4

    .line 210
    if-eqz p4, :cond_12

    .line 211
    .line 212
    if-eq p4, p1, :cond_12

    .line 213
    .line 214
    return-object p4

    .line 215
    :cond_12
    add-int/lit8 p3, p3, 0x1

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_13
    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:Z

    .line 219
    .line 220
    xor-int/2addr p3, v2

    .line 221
    if-ne p2, v1, :cond_14

    .line 222
    .line 223
    const/4 p4, 0x1

    .line 224
    goto :goto_7

    .line 225
    :cond_14
    const/4 p4, 0x0

    .line 226
    :goto_7
    if-ne p3, p4, :cond_15

    .line 227
    .line 228
    const/4 p3, 0x1

    .line 229
    goto :goto_8

    .line 230
    :cond_15
    const/4 p3, 0x0

    .line 231
    :goto_8
    if-nez v3, :cond_17

    .line 232
    .line 233
    if-eqz p3, :cond_16

    .line 234
    .line 235
    invoke-virtual {v0}, Landroidx/recyclerview/widget/r2;->f()I

    .line 236
    .line 237
    .line 238
    move-result p4

    .line 239
    goto :goto_9

    .line 240
    :cond_16
    invoke-virtual {v0}, Landroidx/recyclerview/widget/r2;->g()I

    .line 241
    .line 242
    .line 243
    move-result p4

    .line 244
    :goto_9
    invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/p1;->findViewByPosition(I)Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object p4

    .line 248
    if-eqz p4, :cond_17

    .line 249
    .line 250
    if-eq p4, p1, :cond_17

    .line 251
    .line 252
    return-object p4

    .line 253
    :cond_17
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s(I)Z

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    if-eqz p2, :cond_1b

    .line 258
    .line 259
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 260
    .line 261
    sub-int/2addr p2, v2

    .line 262
    :goto_a
    if-ltz p2, :cond_1e

    .line 263
    .line 264
    iget p4, v0, Landroidx/recyclerview/widget/r2;->e:I

    .line 265
    .line 266
    if-ne p2, p4, :cond_18

    .line 267
    .line 268
    goto :goto_c

    .line 269
    :cond_18
    if-eqz p3, :cond_19

    .line 270
    .line 271
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 272
    .line 273
    aget-object p4, p4, p2

    .line 274
    .line 275
    invoke-virtual {p4}, Landroidx/recyclerview/widget/r2;->f()I

    .line 276
    .line 277
    .line 278
    move-result p4

    .line 279
    goto :goto_b

    .line 280
    :cond_19
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 281
    .line 282
    aget-object p4, p4, p2

    .line 283
    .line 284
    invoke-virtual {p4}, Landroidx/recyclerview/widget/r2;->g()I

    .line 285
    .line 286
    .line 287
    move-result p4

    .line 288
    :goto_b
    invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/p1;->findViewByPosition(I)Landroid/view/View;

    .line 289
    .line 290
    .line 291
    move-result-object p4

    .line 292
    if-eqz p4, :cond_1a

    .line 293
    .line 294
    if-eq p4, p1, :cond_1a

    .line 295
    .line 296
    return-object p4

    .line 297
    :cond_1a
    :goto_c
    add-int/lit8 p2, p2, -0x1

    .line 298
    .line 299
    goto :goto_a

    .line 300
    :cond_1b
    :goto_d
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 301
    .line 302
    if-ge v6, p2, :cond_1e

    .line 303
    .line 304
    if-eqz p3, :cond_1c

    .line 305
    .line 306
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 307
    .line 308
    aget-object p2, p2, v6

    .line 309
    .line 310
    invoke-virtual {p2}, Landroidx/recyclerview/widget/r2;->f()I

    .line 311
    .line 312
    .line 313
    move-result p2

    .line 314
    goto :goto_e

    .line 315
    :cond_1c
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 316
    .line 317
    aget-object p2, p2, v6

    .line 318
    .line 319
    invoke-virtual {p2}, Landroidx/recyclerview/widget/r2;->g()I

    .line 320
    .line 321
    .line 322
    move-result p2

    .line 323
    :goto_e
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/p1;->findViewByPosition(I)Landroid/view/View;

    .line 324
    .line 325
    .line 326
    move-result-object p2

    .line 327
    if-eqz p2, :cond_1d

    .line 328
    .line 329
    if-eq p2, p1, :cond_1d

    .line 330
    .line 331
    return-object p2

    .line 332
    :cond_1d
    add-int/lit8 v6, v6, 0x1

    .line 333
    .line 334
    goto :goto_d

    .line 335
    :cond_1e
    :goto_f
    const/4 p1, 0x0

    .line 336
    return-object p1
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
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/p1;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h(Z)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g(Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-ge v1, v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
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
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Ln0/j;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/p1;->onInitializeAccessibilityNodeInfo(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Ln0/j;)V

    .line 2
    .line 3
    .line 4
    const-string p1, "androidx.recyclerview.widget.StaggeredGridLayoutManager"

    .line 5
    .line 6
    invoke-virtual {p3, p1}, Ln0/j;->i(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final onInitializeAccessibilityNodeInfoForItem(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Landroid/view/View;Ln0/j;)V
    .locals 7

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of p2, p1, Landroidx/recyclerview/widget/o2;

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-super {p0, p3, p4}, Landroidx/recyclerview/widget/p1;->onInitializeAccessibilityNodeInfoForItem(Landroid/view/View;Ln0/j;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    check-cast p1, Landroidx/recyclerview/widget/o2;

    .line 14
    .line 15
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 16
    .line 17
    const/4 p3, -0x1

    .line 18
    const/4 v0, 0x1

    .line 19
    if-nez p2, :cond_3

    .line 20
    .line 21
    iget-object p2, p1, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 22
    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget p3, p2, Landroidx/recyclerview/widget/r2;->e:I

    .line 28
    .line 29
    move v1, p3

    .line 30
    :goto_0
    iget-boolean p1, p1, Landroidx/recyclerview/widget/o2;->f:Z

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 35
    .line 36
    move v2, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 v2, 0x1

    .line 39
    :goto_1
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v3, -0x1

    .line 42
    const/4 v4, -0x1

    .line 43
    invoke-static/range {v1 .. v6}, Ln0/i;->a(IIIIZZ)Ln0/i;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p4, p1}, Ln0/j;->j(Ln0/i;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    iget-object p2, p1, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 52
    .line 53
    if-nez p2, :cond_4

    .line 54
    .line 55
    const/4 v3, -0x1

    .line 56
    goto :goto_2

    .line 57
    :cond_4
    iget p3, p2, Landroidx/recyclerview/widget/r2;->e:I

    .line 58
    .line 59
    move v3, p3

    .line 60
    :goto_2
    iget-boolean p1, p1, Landroidx/recyclerview/widget/o2;->f:Z

    .line 61
    .line 62
    if-eqz p1, :cond_5

    .line 63
    .line 64
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 65
    .line 66
    move v4, v0

    .line 67
    goto :goto_3

    .line 68
    :cond_5
    const/4 v4, 0x1

    .line 69
    :goto_3
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v1, -0x1

    .line 72
    const/4 v2, -0x1

    .line 73
    invoke-static/range {v1 .. v6}, Ln0/i;->a(IIIIZZ)Ln0/i;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p4, p1}, Ln0/j;->j(Ln0/i;)V

    .line 78
    .line 79
    .line 80
    return-void
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

.method public final onItemsAdded(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o(III)V

    .line 3
    .line 4
    .line 5
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final onItemsChanged(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Lu2/u;

    .line 2
    .line 3
    invoke-virtual {p1}, Lu2/u;->j()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final onItemsMoved(Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 0

    .line 1
    const/16 p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o(III)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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

.method public final onItemsRemoved(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o(III)V

    .line 3
    .line 4
    .line 5
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final onItemsUpdated(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o(III)V

    .line 3
    .line 4
    .line 5
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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

.method public final onLayoutChildren(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Z)V

    .line 3
    .line 4
    .line 5
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final onLayoutCompleted(Landroidx/recyclerview/widget/e2;)V
    .locals 0

    .line 1
    const/4 p1, -0x1

    .line 2
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 3
    .line 4
    const/high16 p1, -0x80000000

    .line 5
    .line 6
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t:Landroidx/recyclerview/widget/n2;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/recyclerview/widget/n2;->a()V

    .line 14
    .line 15
    .line 16
    return-void
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

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroidx/recyclerview/widget/q2;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Landroidx/recyclerview/widget/q2;

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 8
    .line 9
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    iput v1, p1, Landroidx/recyclerview/widget/q2;->h:I

    .line 15
    .line 16
    iput v1, p1, Landroidx/recyclerview/widget/q2;->i:I

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p1, Landroidx/recyclerview/widget/q2;->k:[I

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput v1, p1, Landroidx/recyclerview/widget/q2;->j:I

    .line 23
    .line 24
    iput v1, p1, Landroidx/recyclerview/widget/q2;->l:I

    .line 25
    .line 26
    iput-object v0, p1, Landroidx/recyclerview/widget/q2;->m:[I

    .line 27
    .line 28
    iput-object v0, p1, Landroidx/recyclerview/widget/q2;->n:Ljava/util/ArrayList;

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroidx/recyclerview/widget/q2;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v2, v0, Landroidx/recyclerview/widget/q2;->j:I

    .line 11
    .line 12
    iput v2, v1, Landroidx/recyclerview/widget/q2;->j:I

    .line 13
    .line 14
    iget v2, v0, Landroidx/recyclerview/widget/q2;->h:I

    .line 15
    .line 16
    iput v2, v1, Landroidx/recyclerview/widget/q2;->h:I

    .line 17
    .line 18
    iget v2, v0, Landroidx/recyclerview/widget/q2;->i:I

    .line 19
    .line 20
    iput v2, v1, Landroidx/recyclerview/widget/q2;->i:I

    .line 21
    .line 22
    iget-object v2, v0, Landroidx/recyclerview/widget/q2;->k:[I

    .line 23
    .line 24
    iput-object v2, v1, Landroidx/recyclerview/widget/q2;->k:[I

    .line 25
    .line 26
    iget v2, v0, Landroidx/recyclerview/widget/q2;->l:I

    .line 27
    .line 28
    iput v2, v1, Landroidx/recyclerview/widget/q2;->l:I

    .line 29
    .line 30
    iget-object v2, v0, Landroidx/recyclerview/widget/q2;->m:[I

    .line 31
    .line 32
    iput-object v2, v1, Landroidx/recyclerview/widget/q2;->m:[I

    .line 33
    .line 34
    iget-boolean v2, v0, Landroidx/recyclerview/widget/q2;->o:Z

    .line 35
    .line 36
    iput-boolean v2, v1, Landroidx/recyclerview/widget/q2;->o:Z

    .line 37
    .line 38
    iget-boolean v2, v0, Landroidx/recyclerview/widget/q2;->p:Z

    .line 39
    .line 40
    iput-boolean v2, v1, Landroidx/recyclerview/widget/q2;->p:Z

    .line 41
    .line 42
    iget-boolean v2, v0, Landroidx/recyclerview/widget/q2;->q:Z

    .line 43
    .line 44
    iput-boolean v2, v1, Landroidx/recyclerview/widget/q2;->q:Z

    .line 45
    .line 46
    iget-object v0, v0, Landroidx/recyclerview/widget/q2;->n:Ljava/util/ArrayList;

    .line 47
    .line 48
    iput-object v0, v1, Landroidx/recyclerview/widget/q2;->n:Ljava/util/ArrayList;

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/q2;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:Z

    .line 57
    .line 58
    iput-boolean v1, v0, Landroidx/recyclerview/widget/q2;->o:Z

    .line 59
    .line 60
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:Z

    .line 61
    .line 62
    iput-boolean v1, v0, Landroidx/recyclerview/widget/q2;->p:Z

    .line 63
    .line 64
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:Z

    .line 65
    .line 66
    iput-boolean v1, v0, Landroidx/recyclerview/widget/q2;->q:Z

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Lu2/u;

    .line 70
    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    iget-object v3, v2, Lu2/u;->h:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, [I

    .line 76
    .line 77
    if-eqz v3, :cond_1

    .line 78
    .line 79
    iput-object v3, v0, Landroidx/recyclerview/widget/q2;->m:[I

    .line 80
    .line 81
    array-length v3, v3

    .line 82
    iput v3, v0, Landroidx/recyclerview/widget/q2;->l:I

    .line 83
    .line 84
    iget-object v2, v2, Lu2/u;->i:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Ljava/util/ArrayList;

    .line 87
    .line 88
    iput-object v2, v0, Landroidx/recyclerview/widget/q2;->n:Ljava/util/ArrayList;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    iput v1, v0, Landroidx/recyclerview/widget/q2;->l:I

    .line 92
    .line 93
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    const/4 v3, -0x1

    .line 98
    if-lez v2, :cond_8

    .line 99
    .line 100
    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:Z

    .line 101
    .line 102
    if-eqz v2, :cond_2

    .line 103
    .line 104
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    goto :goto_1

    .line 109
    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    :goto_1
    iput v2, v0, Landroidx/recyclerview/widget/q2;->h:I

    .line 114
    .line 115
    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 116
    .line 117
    const/4 v4, 0x1

    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g(Z)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    goto :goto_2

    .line 125
    :cond_3
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h(Z)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    :goto_2
    if-nez v2, :cond_4

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    :goto_3
    iput v3, v0, Landroidx/recyclerview/widget/q2;->i:I

    .line 137
    .line 138
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 139
    .line 140
    iput v2, v0, Landroidx/recyclerview/widget/q2;->j:I

    .line 141
    .line 142
    new-array v2, v2, [I

    .line 143
    .line 144
    iput-object v2, v0, Landroidx/recyclerview/widget/q2;->k:[I

    .line 145
    .line 146
    :goto_4
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 147
    .line 148
    if-ge v1, v2, :cond_7

    .line 149
    .line 150
    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:Z

    .line 151
    .line 152
    const/high16 v3, -0x80000000

    .line 153
    .line 154
    if-eqz v2, :cond_5

    .line 155
    .line 156
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 157
    .line 158
    aget-object v2, v2, v1

    .line 159
    .line 160
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eq v2, v3, :cond_6

    .line 165
    .line 166
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 167
    .line 168
    invoke-virtual {v3}, Landroidx/recyclerview/widget/v0;->g()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    :goto_5
    sub-int/2addr v2, v3

    .line 173
    goto :goto_6

    .line 174
    :cond_5
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 175
    .line 176
    aget-object v2, v2, v1

    .line 177
    .line 178
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eq v2, v3, :cond_6

    .line 183
    .line 184
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 185
    .line 186
    invoke-virtual {v3}, Landroidx/recyclerview/widget/v0;->k()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    goto :goto_5

    .line 191
    :cond_6
    :goto_6
    iget-object v3, v0, Landroidx/recyclerview/widget/q2;->k:[I

    .line 192
    .line 193
    aput v2, v3, v1

    .line 194
    .line 195
    add-int/lit8 v1, v1, 0x1

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_7
    return-object v0

    .line 199
    :cond_8
    iput v3, v0, Landroidx/recyclerview/widget/q2;->h:I

    .line 200
    .line 201
    iput v3, v0, Landroidx/recyclerview/widget/q2;->i:I

    .line 202
    .line 203
    iput v1, v0, Landroidx/recyclerview/widget/q2;->j:I

    .line 204
    .line 205
    return-object v0
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
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
.end method

.method public final onScrollStateChanged(I)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d()Z

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final p()Landroid/view/View;
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v1, v0, -0x1

    .line 6
    .line 7
    new-instance v2, Ljava/util/BitSet;

    .line 8
    .line 9
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    invoke-virtual {v2, v4, v3, v5}, Ljava/util/BitSet;->set(IIZ)V

    .line 19
    .line 20
    .line 21
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 22
    .line 23
    const/4 v6, -0x1

    .line 24
    if-ne v3, v5, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v3, -0x1

    .line 35
    :goto_0
    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 36
    .line 37
    if-eqz v7, :cond_1

    .line 38
    .line 39
    const/4 v0, -0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v1, 0x0

    .line 42
    :goto_1
    if-ge v1, v0, :cond_2

    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    :cond_2
    :goto_2
    if-eq v1, v0, :cond_11

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    check-cast v8, Landroidx/recyclerview/widget/o2;

    .line 56
    .line 57
    iget-object v9, v8, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 58
    .line 59
    iget v9, v9, Landroidx/recyclerview/widget/r2;->e:I

    .line 60
    .line 61
    invoke-virtual {v2, v9}, Ljava/util/BitSet;->get(I)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-eqz v9, :cond_8

    .line 66
    .line 67
    iget-object v9, v8, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 68
    .line 69
    iget-boolean v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 70
    .line 71
    const/high16 v11, -0x80000000

    .line 72
    .line 73
    if-eqz v10, :cond_4

    .line 74
    .line 75
    iget v10, v9, Landroidx/recyclerview/widget/r2;->c:I

    .line 76
    .line 77
    if-eq v10, v11, :cond_3

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_3
    invoke-virtual {v9}, Landroidx/recyclerview/widget/r2;->b()V

    .line 81
    .line 82
    .line 83
    iget v10, v9, Landroidx/recyclerview/widget/r2;->c:I

    .line 84
    .line 85
    :goto_3
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 86
    .line 87
    invoke-virtual {v11}, Landroidx/recyclerview/widget/v0;->g()I

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    if-ge v10, v11, :cond_6

    .line 92
    .line 93
    iget-object v9, v9, Landroidx/recyclerview/widget/r2;->f:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v9, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    sub-int/2addr v10, v5

    .line 102
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    check-cast v9, Landroid/view/View;

    .line 107
    .line 108
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    check-cast v9, Landroidx/recyclerview/widget/o2;

    .line 113
    .line 114
    iget-boolean v9, v9, Landroidx/recyclerview/widget/o2;->f:Z

    .line 115
    .line 116
    :goto_4
    xor-int/2addr v9, v5

    .line 117
    goto :goto_6

    .line 118
    :cond_4
    iget v10, v9, Landroidx/recyclerview/widget/r2;->b:I

    .line 119
    .line 120
    if-eq v10, v11, :cond_5

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_5
    invoke-virtual {v9}, Landroidx/recyclerview/widget/r2;->c()V

    .line 124
    .line 125
    .line 126
    iget v10, v9, Landroidx/recyclerview/widget/r2;->b:I

    .line 127
    .line 128
    :goto_5
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 129
    .line 130
    invoke-virtual {v11}, Landroidx/recyclerview/widget/v0;->k()I

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    if-le v10, v11, :cond_6

    .line 135
    .line 136
    iget-object v9, v9, Landroidx/recyclerview/widget/r2;->f:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v9, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    check-cast v9, Landroid/view/View;

    .line 145
    .line 146
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    check-cast v9, Landroidx/recyclerview/widget/o2;

    .line 151
    .line 152
    iget-boolean v9, v9, Landroidx/recyclerview/widget/o2;->f:Z

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_6
    const/4 v9, 0x0

    .line 156
    :goto_6
    if-eqz v9, :cond_7

    .line 157
    .line 158
    goto :goto_b

    .line 159
    :cond_7
    iget-object v9, v8, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 160
    .line 161
    iget v9, v9, Landroidx/recyclerview/widget/r2;->e:I

    .line 162
    .line 163
    invoke-virtual {v2, v9}, Ljava/util/BitSet;->clear(I)V

    .line 164
    .line 165
    .line 166
    :cond_8
    iget-boolean v9, v8, Landroidx/recyclerview/widget/o2;->f:Z

    .line 167
    .line 168
    if-eqz v9, :cond_9

    .line 169
    .line 170
    goto :goto_c

    .line 171
    :cond_9
    add-int v9, v1, v6

    .line 172
    .line 173
    if-eq v9, v0, :cond_10

    .line 174
    .line 175
    invoke-virtual {p0, v9}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    iget-boolean v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 180
    .line 181
    if-eqz v10, :cond_b

    .line 182
    .line 183
    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 184
    .line 185
    invoke-virtual {v10, v7}, Landroidx/recyclerview/widget/v0;->b(Landroid/view/View;)I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 190
    .line 191
    invoke-virtual {v11, v9}, Landroidx/recyclerview/widget/v0;->b(Landroid/view/View;)I

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    if-ge v10, v11, :cond_a

    .line 196
    .line 197
    goto :goto_b

    .line 198
    :cond_a
    if-ne v10, v11, :cond_d

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_b
    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 202
    .line 203
    invoke-virtual {v10, v7}, Landroidx/recyclerview/widget/v0;->e(Landroid/view/View;)I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 208
    .line 209
    invoke-virtual {v11, v9}, Landroidx/recyclerview/widget/v0;->e(Landroid/view/View;)I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    if-le v10, v11, :cond_c

    .line 214
    .line 215
    goto :goto_b

    .line 216
    :cond_c
    if-ne v10, v11, :cond_d

    .line 217
    .line 218
    :goto_7
    const/4 v10, 0x1

    .line 219
    goto :goto_8

    .line 220
    :cond_d
    const/4 v10, 0x0

    .line 221
    :goto_8
    if-eqz v10, :cond_10

    .line 222
    .line 223
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    check-cast v9, Landroidx/recyclerview/widget/o2;

    .line 228
    .line 229
    iget-object v8, v8, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 230
    .line 231
    iget v8, v8, Landroidx/recyclerview/widget/r2;->e:I

    .line 232
    .line 233
    iget-object v9, v9, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 234
    .line 235
    iget v9, v9, Landroidx/recyclerview/widget/r2;->e:I

    .line 236
    .line 237
    sub-int/2addr v8, v9

    .line 238
    if-gez v8, :cond_e

    .line 239
    .line 240
    const/4 v8, 0x1

    .line 241
    goto :goto_9

    .line 242
    :cond_e
    const/4 v8, 0x0

    .line 243
    :goto_9
    if-gez v3, :cond_f

    .line 244
    .line 245
    const/4 v9, 0x1

    .line 246
    goto :goto_a

    .line 247
    :cond_f
    const/4 v9, 0x0

    .line 248
    :goto_a
    if-eq v8, v9, :cond_10

    .line 249
    .line 250
    :goto_b
    return-object v7

    .line 251
    :cond_10
    :goto_c
    add-int/2addr v1, v6

    .line 252
    goto/16 :goto_2

    .line 253
    .line 254
    :cond_11
    const/4 v0, 0x0

    .line 255
    return-object v0
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
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
.end method

.method public final q(Landroid/view/View;II)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/p1;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Landroidx/recyclerview/widget/o2;

    .line 11
    .line 12
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 13
    .line 14
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    add-int/2addr v2, v3

    .line 17
    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 18
    .line 19
    iget v4, v0, Landroid/graphics/Rect;->right:I

    .line 20
    .line 21
    add-int/2addr v3, v4

    .line 22
    invoke-static {p2, v2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->C(III)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 27
    .line 28
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 29
    .line 30
    add-int/2addr v2, v3

    .line 31
    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 32
    .line 33
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 34
    .line 35
    add-int/2addr v3, v0

    .line 36
    invoke-static {p3, v2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->C(III)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    invoke-virtual {p0, p1, p2, p3, v1}, Landroidx/recyclerview/widget/p1;->shouldMeasureChild(Landroid/view/View;IILandroidx/recyclerview/widget/q1;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
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
.end method

.method public final r(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Z)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    iget-object v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t:Landroidx/recyclerview/widget/n2;

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    iget v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 15
    .line 16
    if-eq v3, v4, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v2}, Landroidx/recyclerview/widget/e2;->b()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/p1;->removeAndRecycleAllViews(Landroidx/recyclerview/widget/x1;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5}, Landroidx/recyclerview/widget/n2;->a()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-boolean v3, v5, Landroidx/recyclerview/widget/n2;->e:Z

    .line 32
    .line 33
    iget-object v6, v5, Landroidx/recyclerview/widget/n2;->g:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x1

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    iget v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 40
    .line 41
    if-ne v3, v4, :cond_3

    .line 42
    .line 43
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v3, 0x0

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    :goto_0
    const/4 v3, 0x1

    .line 51
    :goto_1
    iget-object v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Lu2/u;

    .line 52
    .line 53
    const/high16 v10, -0x80000000

    .line 54
    .line 55
    if-eqz v3, :cond_25

    .line 56
    .line 57
    invoke-virtual {v5}, Landroidx/recyclerview/widget/n2;->a()V

    .line 58
    .line 59
    .line 60
    iget-object v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 61
    .line 62
    if-eqz v11, :cond_a

    .line 63
    .line 64
    iget v12, v11, Landroidx/recyclerview/widget/q2;->j:I

    .line 65
    .line 66
    const/4 v13, 0x0

    .line 67
    if-lez v12, :cond_7

    .line 68
    .line 69
    iget v14, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 70
    .line 71
    if-ne v12, v14, :cond_6

    .line 72
    .line 73
    const/4 v11, 0x0

    .line 74
    :goto_2
    iget v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 75
    .line 76
    if-ge v11, v12, :cond_7

    .line 77
    .line 78
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 79
    .line 80
    aget-object v12, v12, v11

    .line 81
    .line 82
    invoke-virtual {v12}, Landroidx/recyclerview/widget/r2;->d()V

    .line 83
    .line 84
    .line 85
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 86
    .line 87
    iget-object v14, v12, Landroidx/recyclerview/widget/q2;->k:[I

    .line 88
    .line 89
    aget v14, v14, v11

    .line 90
    .line 91
    if-eq v14, v10, :cond_5

    .line 92
    .line 93
    iget-boolean v12, v12, Landroidx/recyclerview/widget/q2;->p:Z

    .line 94
    .line 95
    if-eqz v12, :cond_4

    .line 96
    .line 97
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 98
    .line 99
    invoke-virtual {v12}, Landroidx/recyclerview/widget/v0;->g()I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    :goto_3
    add-int/2addr v14, v12

    .line 104
    goto :goto_4

    .line 105
    :cond_4
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 106
    .line 107
    invoke-virtual {v12}, Landroidx/recyclerview/widget/v0;->k()I

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    goto :goto_3

    .line 112
    :cond_5
    :goto_4
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 113
    .line 114
    aget-object v12, v12, v11

    .line 115
    .line 116
    iput v14, v12, Landroidx/recyclerview/widget/r2;->b:I

    .line 117
    .line 118
    iput v14, v12, Landroidx/recyclerview/widget/r2;->c:I

    .line 119
    .line 120
    add-int/lit8 v11, v11, 0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    iput-object v13, v11, Landroidx/recyclerview/widget/q2;->k:[I

    .line 124
    .line 125
    iput v7, v11, Landroidx/recyclerview/widget/q2;->j:I

    .line 126
    .line 127
    iput v7, v11, Landroidx/recyclerview/widget/q2;->l:I

    .line 128
    .line 129
    iput-object v13, v11, Landroidx/recyclerview/widget/q2;->m:[I

    .line 130
    .line 131
    iput-object v13, v11, Landroidx/recyclerview/widget/q2;->n:Ljava/util/ArrayList;

    .line 132
    .line 133
    iget v12, v11, Landroidx/recyclerview/widget/q2;->i:I

    .line 134
    .line 135
    iput v12, v11, Landroidx/recyclerview/widget/q2;->h:I

    .line 136
    .line 137
    :cond_7
    iget-object v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 138
    .line 139
    iget-boolean v12, v11, Landroidx/recyclerview/widget/q2;->q:Z

    .line 140
    .line 141
    iput-boolean v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:Z

    .line 142
    .line 143
    iget-boolean v11, v11, Landroidx/recyclerview/widget/q2;->o:Z

    .line 144
    .line 145
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 149
    .line 150
    if-eqz v12, :cond_8

    .line 151
    .line 152
    iget-boolean v13, v12, Landroidx/recyclerview/widget/q2;->o:Z

    .line 153
    .line 154
    if-eq v13, v11, :cond_8

    .line 155
    .line 156
    iput-boolean v11, v12, Landroidx/recyclerview/widget/q2;->o:Z

    .line 157
    .line 158
    :cond_8
    iput-boolean v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:Z

    .line 159
    .line 160
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->x()V

    .line 164
    .line 165
    .line 166
    iget-object v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 167
    .line 168
    iget v12, v11, Landroidx/recyclerview/widget/q2;->h:I

    .line 169
    .line 170
    if-eq v12, v4, :cond_9

    .line 171
    .line 172
    iput v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 173
    .line 174
    iget-boolean v12, v11, Landroidx/recyclerview/widget/q2;->p:Z

    .line 175
    .line 176
    iput-boolean v12, v5, Landroidx/recyclerview/widget/n2;->c:Z

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_9
    iget-boolean v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 180
    .line 181
    iput-boolean v12, v5, Landroidx/recyclerview/widget/n2;->c:Z

    .line 182
    .line 183
    :goto_5
    iget v12, v11, Landroidx/recyclerview/widget/q2;->l:I

    .line 184
    .line 185
    if-le v12, v8, :cond_b

    .line 186
    .line 187
    iget-object v12, v11, Landroidx/recyclerview/widget/q2;->m:[I

    .line 188
    .line 189
    iput-object v12, v9, Lu2/u;->h:Ljava/lang/Object;

    .line 190
    .line 191
    iget-object v11, v11, Landroidx/recyclerview/widget/q2;->n:Ljava/util/ArrayList;

    .line 192
    .line 193
    iput-object v11, v9, Lu2/u;->i:Ljava/lang/Object;

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->x()V

    .line 197
    .line 198
    .line 199
    iget-boolean v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 200
    .line 201
    iput-boolean v11, v5, Landroidx/recyclerview/widget/n2;->c:Z

    .line 202
    .line 203
    :cond_b
    :goto_6
    iget-boolean v11, v2, Landroidx/recyclerview/widget/e2;->g:Z

    .line 204
    .line 205
    if-nez v11, :cond_20

    .line 206
    .line 207
    iget v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 208
    .line 209
    if-ne v11, v4, :cond_c

    .line 210
    .line 211
    goto/16 :goto_10

    .line 212
    .line 213
    :cond_c
    if-ltz v11, :cond_1f

    .line 214
    .line 215
    invoke-virtual {v2}, Landroidx/recyclerview/widget/e2;->b()I

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    if-lt v11, v12, :cond_d

    .line 220
    .line 221
    goto/16 :goto_f

    .line 222
    .line 223
    :cond_d
    iget-object v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 224
    .line 225
    if-eqz v11, :cond_f

    .line 226
    .line 227
    iget v12, v11, Landroidx/recyclerview/widget/q2;->h:I

    .line 228
    .line 229
    if-eq v12, v4, :cond_f

    .line 230
    .line 231
    iget v11, v11, Landroidx/recyclerview/widget/q2;->j:I

    .line 232
    .line 233
    if-ge v11, v8, :cond_e

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_e
    iput v10, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 237
    .line 238
    iget v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 239
    .line 240
    iput v11, v5, Landroidx/recyclerview/widget/n2;->a:I

    .line 241
    .line 242
    goto/16 :goto_14

    .line 243
    .line 244
    :cond_f
    :goto_7
    iget v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 245
    .line 246
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/p1;->findViewByPosition(I)Landroid/view/View;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    if-eqz v11, :cond_17

    .line 251
    .line 252
    iget-boolean v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 253
    .line 254
    if-eqz v12, :cond_10

    .line 255
    .line 256
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l()I

    .line 257
    .line 258
    .line 259
    move-result v12

    .line 260
    goto :goto_8

    .line 261
    :cond_10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k()I

    .line 262
    .line 263
    .line 264
    move-result v12

    .line 265
    :goto_8
    iput v12, v5, Landroidx/recyclerview/widget/n2;->a:I

    .line 266
    .line 267
    iget v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 268
    .line 269
    if-eq v12, v10, :cond_12

    .line 270
    .line 271
    iget-boolean v12, v5, Landroidx/recyclerview/widget/n2;->c:Z

    .line 272
    .line 273
    if-eqz v12, :cond_11

    .line 274
    .line 275
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 276
    .line 277
    invoke-virtual {v12}, Landroidx/recyclerview/widget/v0;->g()I

    .line 278
    .line 279
    .line 280
    move-result v12

    .line 281
    iget v13, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 282
    .line 283
    sub-int/2addr v12, v13

    .line 284
    iget-object v13, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 285
    .line 286
    invoke-virtual {v13, v11}, Landroidx/recyclerview/widget/v0;->b(Landroid/view/View;)I

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    sub-int/2addr v12, v11

    .line 291
    iput v12, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 292
    .line 293
    goto/16 :goto_14

    .line 294
    .line 295
    :cond_11
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 296
    .line 297
    invoke-virtual {v12}, Landroidx/recyclerview/widget/v0;->k()I

    .line 298
    .line 299
    .line 300
    move-result v12

    .line 301
    iget v13, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 302
    .line 303
    add-int/2addr v12, v13

    .line 304
    iget-object v13, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 305
    .line 306
    invoke-virtual {v13, v11}, Landroidx/recyclerview/widget/v0;->e(Landroid/view/View;)I

    .line 307
    .line 308
    .line 309
    move-result v11

    .line 310
    sub-int/2addr v12, v11

    .line 311
    iput v12, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 312
    .line 313
    goto/16 :goto_14

    .line 314
    .line 315
    :cond_12
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 316
    .line 317
    invoke-virtual {v12, v11}, Landroidx/recyclerview/widget/v0;->c(Landroid/view/View;)I

    .line 318
    .line 319
    .line 320
    move-result v12

    .line 321
    iget-object v13, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 322
    .line 323
    invoke-virtual {v13}, Landroidx/recyclerview/widget/v0;->l()I

    .line 324
    .line 325
    .line 326
    move-result v13

    .line 327
    if-le v12, v13, :cond_14

    .line 328
    .line 329
    iget-boolean v11, v5, Landroidx/recyclerview/widget/n2;->c:Z

    .line 330
    .line 331
    if-eqz v11, :cond_13

    .line 332
    .line 333
    iget-object v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 334
    .line 335
    invoke-virtual {v11}, Landroidx/recyclerview/widget/v0;->g()I

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    goto :goto_9

    .line 340
    :cond_13
    iget-object v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 341
    .line 342
    invoke-virtual {v11}, Landroidx/recyclerview/widget/v0;->k()I

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    :goto_9
    iput v11, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 347
    .line 348
    goto/16 :goto_14

    .line 349
    .line 350
    :cond_14
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 351
    .line 352
    invoke-virtual {v12, v11}, Landroidx/recyclerview/widget/v0;->e(Landroid/view/View;)I

    .line 353
    .line 354
    .line 355
    move-result v12

    .line 356
    iget-object v13, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 357
    .line 358
    invoke-virtual {v13}, Landroidx/recyclerview/widget/v0;->k()I

    .line 359
    .line 360
    .line 361
    move-result v13

    .line 362
    sub-int/2addr v12, v13

    .line 363
    if-gez v12, :cond_15

    .line 364
    .line 365
    neg-int v11, v12

    .line 366
    iput v11, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 367
    .line 368
    goto/16 :goto_14

    .line 369
    .line 370
    :cond_15
    iget-object v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 371
    .line 372
    invoke-virtual {v12}, Landroidx/recyclerview/widget/v0;->g()I

    .line 373
    .line 374
    .line 375
    move-result v12

    .line 376
    iget-object v13, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 377
    .line 378
    invoke-virtual {v13, v11}, Landroidx/recyclerview/widget/v0;->b(Landroid/view/View;)I

    .line 379
    .line 380
    .line 381
    move-result v11

    .line 382
    sub-int/2addr v12, v11

    .line 383
    if-gez v12, :cond_16

    .line 384
    .line 385
    iput v12, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 386
    .line 387
    goto/16 :goto_14

    .line 388
    .line 389
    :cond_16
    iput v10, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 390
    .line 391
    goto/16 :goto_14

    .line 392
    .line 393
    :cond_17
    iget v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 394
    .line 395
    iput v11, v5, Landroidx/recyclerview/widget/n2;->a:I

    .line 396
    .line 397
    iget v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 398
    .line 399
    if-ne v12, v10, :cond_1d

    .line 400
    .line 401
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 402
    .line 403
    .line 404
    move-result v12

    .line 405
    if-nez v12, :cond_18

    .line 406
    .line 407
    iget-boolean v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 408
    .line 409
    if-eqz v11, :cond_1a

    .line 410
    .line 411
    goto :goto_b

    .line 412
    :cond_18
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k()I

    .line 413
    .line 414
    .line 415
    move-result v12

    .line 416
    if-ge v11, v12, :cond_19

    .line 417
    .line 418
    const/4 v11, 0x1

    .line 419
    goto :goto_a

    .line 420
    :cond_19
    const/4 v11, 0x0

    .line 421
    :goto_a
    iget-boolean v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 422
    .line 423
    if-eq v11, v12, :cond_1b

    .line 424
    .line 425
    :cond_1a
    const/4 v11, 0x0

    .line 426
    goto :goto_c

    .line 427
    :cond_1b
    :goto_b
    const/4 v11, 0x1

    .line 428
    :goto_c
    iput-boolean v11, v5, Landroidx/recyclerview/widget/n2;->c:Z

    .line 429
    .line 430
    if-eqz v11, :cond_1c

    .line 431
    .line 432
    iget-object v11, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 433
    .line 434
    invoke-virtual {v11}, Landroidx/recyclerview/widget/v0;->g()I

    .line 435
    .line 436
    .line 437
    move-result v11

    .line 438
    goto :goto_d

    .line 439
    :cond_1c
    iget-object v11, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 440
    .line 441
    invoke-virtual {v11}, Landroidx/recyclerview/widget/v0;->k()I

    .line 442
    .line 443
    .line 444
    move-result v11

    .line 445
    :goto_d
    iput v11, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 446
    .line 447
    goto :goto_e

    .line 448
    :cond_1d
    iget-boolean v11, v5, Landroidx/recyclerview/widget/n2;->c:Z

    .line 449
    .line 450
    if-eqz v11, :cond_1e

    .line 451
    .line 452
    iget-object v11, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 453
    .line 454
    invoke-virtual {v11}, Landroidx/recyclerview/widget/v0;->g()I

    .line 455
    .line 456
    .line 457
    move-result v11

    .line 458
    sub-int/2addr v11, v12

    .line 459
    iput v11, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 460
    .line 461
    goto :goto_e

    .line 462
    :cond_1e
    iget-object v11, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 463
    .line 464
    invoke-virtual {v11}, Landroidx/recyclerview/widget/v0;->k()I

    .line 465
    .line 466
    .line 467
    move-result v11

    .line 468
    add-int/2addr v11, v12

    .line 469
    iput v11, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 470
    .line 471
    :goto_e
    iput-boolean v8, v5, Landroidx/recyclerview/widget/n2;->d:Z

    .line 472
    .line 473
    goto :goto_14

    .line 474
    :cond_1f
    :goto_f
    iput v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 475
    .line 476
    iput v10, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 477
    .line 478
    :cond_20
    :goto_10
    iget-boolean v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:Z

    .line 479
    .line 480
    if-eqz v11, :cond_23

    .line 481
    .line 482
    invoke-virtual {v2}, Landroidx/recyclerview/widget/e2;->b()I

    .line 483
    .line 484
    .line 485
    move-result v11

    .line 486
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 487
    .line 488
    .line 489
    move-result v12

    .line 490
    sub-int/2addr v12, v8

    .line 491
    :goto_11
    if-ltz v12, :cond_22

    .line 492
    .line 493
    invoke-virtual {v0, v12}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 494
    .line 495
    .line 496
    move-result-object v13

    .line 497
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 498
    .line 499
    .line 500
    move-result v13

    .line 501
    if-ltz v13, :cond_21

    .line 502
    .line 503
    if-ge v13, v11, :cond_21

    .line 504
    .line 505
    goto :goto_13

    .line 506
    :cond_21
    add-int/lit8 v12, v12, -0x1

    .line 507
    .line 508
    goto :goto_11

    .line 509
    :cond_22
    const/4 v13, 0x0

    .line 510
    goto :goto_13

    .line 511
    :cond_23
    invoke-virtual {v2}, Landroidx/recyclerview/widget/e2;->b()I

    .line 512
    .line 513
    .line 514
    move-result v11

    .line 515
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 516
    .line 517
    .line 518
    move-result v12

    .line 519
    const/4 v13, 0x0

    .line 520
    :goto_12
    if-ge v13, v12, :cond_22

    .line 521
    .line 522
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 523
    .line 524
    .line 525
    move-result-object v14

    .line 526
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 527
    .line 528
    .line 529
    move-result v14

    .line 530
    if-ltz v14, :cond_24

    .line 531
    .line 532
    if-ge v14, v11, :cond_24

    .line 533
    .line 534
    move v13, v14

    .line 535
    goto :goto_13

    .line 536
    :cond_24
    add-int/lit8 v13, v13, 0x1

    .line 537
    .line 538
    goto :goto_12

    .line 539
    :goto_13
    iput v13, v5, Landroidx/recyclerview/widget/n2;->a:I

    .line 540
    .line 541
    iput v10, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 542
    .line 543
    :goto_14
    iput-boolean v8, v5, Landroidx/recyclerview/widget/n2;->e:Z

    .line 544
    .line 545
    :cond_25
    iget-object v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 546
    .line 547
    if-nez v11, :cond_27

    .line 548
    .line 549
    iget v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 550
    .line 551
    if-ne v11, v4, :cond_27

    .line 552
    .line 553
    iget-boolean v11, v5, Landroidx/recyclerview/widget/n2;->c:Z

    .line 554
    .line 555
    iget-boolean v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:Z

    .line 556
    .line 557
    if-ne v11, v12, :cond_26

    .line 558
    .line 559
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    .line 560
    .line 561
    .line 562
    move-result v11

    .line 563
    iget-boolean v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:Z

    .line 564
    .line 565
    if-eq v11, v12, :cond_27

    .line 566
    .line 567
    :cond_26
    invoke-virtual {v9}, Lu2/u;->j()V

    .line 568
    .line 569
    .line 570
    iput-boolean v8, v5, Landroidx/recyclerview/widget/n2;->d:Z

    .line 571
    .line 572
    :cond_27
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 573
    .line 574
    .line 575
    move-result v9

    .line 576
    if-lez v9, :cond_36

    .line 577
    .line 578
    iget-object v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 579
    .line 580
    if-eqz v9, :cond_28

    .line 581
    .line 582
    iget v9, v9, Landroidx/recyclerview/widget/q2;->j:I

    .line 583
    .line 584
    if-ge v9, v8, :cond_36

    .line 585
    .line 586
    :cond_28
    iget-boolean v9, v5, Landroidx/recyclerview/widget/n2;->d:Z

    .line 587
    .line 588
    if-eqz v9, :cond_2a

    .line 589
    .line 590
    const/4 v3, 0x0

    .line 591
    :goto_15
    iget v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 592
    .line 593
    if-ge v3, v6, :cond_36

    .line 594
    .line 595
    iget-object v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 596
    .line 597
    aget-object v6, v6, v3

    .line 598
    .line 599
    invoke-virtual {v6}, Landroidx/recyclerview/widget/r2;->d()V

    .line 600
    .line 601
    .line 602
    iget v6, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 603
    .line 604
    if-eq v6, v10, :cond_29

    .line 605
    .line 606
    iget-object v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 607
    .line 608
    aget-object v9, v9, v3

    .line 609
    .line 610
    iput v6, v9, Landroidx/recyclerview/widget/r2;->b:I

    .line 611
    .line 612
    iput v6, v9, Landroidx/recyclerview/widget/r2;->c:I

    .line 613
    .line 614
    :cond_29
    add-int/lit8 v3, v3, 0x1

    .line 615
    .line 616
    goto :goto_15

    .line 617
    :cond_2a
    if-nez v3, :cond_2c

    .line 618
    .line 619
    iget-object v3, v5, Landroidx/recyclerview/widget/n2;->f:[I

    .line 620
    .line 621
    if-nez v3, :cond_2b

    .line 622
    .line 623
    goto :goto_17

    .line 624
    :cond_2b
    const/4 v3, 0x0

    .line 625
    :goto_16
    iget v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 626
    .line 627
    if-ge v3, v6, :cond_36

    .line 628
    .line 629
    iget-object v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 630
    .line 631
    aget-object v6, v6, v3

    .line 632
    .line 633
    invoke-virtual {v6}, Landroidx/recyclerview/widget/r2;->d()V

    .line 634
    .line 635
    .line 636
    iget-object v9, v5, Landroidx/recyclerview/widget/n2;->f:[I

    .line 637
    .line 638
    aget v9, v9, v3

    .line 639
    .line 640
    iput v9, v6, Landroidx/recyclerview/widget/r2;->b:I

    .line 641
    .line 642
    iput v9, v6, Landroidx/recyclerview/widget/r2;->c:I

    .line 643
    .line 644
    add-int/lit8 v3, v3, 0x1

    .line 645
    .line 646
    goto :goto_16

    .line 647
    :cond_2c
    :goto_17
    const/4 v3, 0x0

    .line 648
    :goto_18
    iget v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 649
    .line 650
    if-ge v3, v9, :cond_33

    .line 651
    .line 652
    iget-object v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 653
    .line 654
    aget-object v9, v9, v3

    .line 655
    .line 656
    iget-boolean v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 657
    .line 658
    iget v12, v5, Landroidx/recyclerview/widget/n2;->b:I

    .line 659
    .line 660
    iget-object v13, v9, Landroidx/recyclerview/widget/r2;->g:Ljava/lang/Object;

    .line 661
    .line 662
    check-cast v13, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 663
    .line 664
    if-eqz v11, :cond_2d

    .line 665
    .line 666
    invoke-virtual {v9, v10}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 667
    .line 668
    .line 669
    move-result v14

    .line 670
    goto :goto_19

    .line 671
    :cond_2d
    invoke-virtual {v9, v10}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 672
    .line 673
    .line 674
    move-result v14

    .line 675
    :goto_19
    invoke-virtual {v9}, Landroidx/recyclerview/widget/r2;->d()V

    .line 676
    .line 677
    .line 678
    if-ne v14, v10, :cond_2e

    .line 679
    .line 680
    goto :goto_1a

    .line 681
    :cond_2e
    if-eqz v11, :cond_2f

    .line 682
    .line 683
    iget-object v15, v13, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 684
    .line 685
    invoke-virtual {v15}, Landroidx/recyclerview/widget/v0;->g()I

    .line 686
    .line 687
    .line 688
    move-result v15

    .line 689
    if-lt v14, v15, :cond_32

    .line 690
    .line 691
    :cond_2f
    if-nez v11, :cond_30

    .line 692
    .line 693
    iget-object v11, v13, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 694
    .line 695
    invoke-virtual {v11}, Landroidx/recyclerview/widget/v0;->k()I

    .line 696
    .line 697
    .line 698
    move-result v11

    .line 699
    if-le v14, v11, :cond_30

    .line 700
    .line 701
    goto :goto_1a

    .line 702
    :cond_30
    if-eq v12, v10, :cond_31

    .line 703
    .line 704
    add-int/2addr v14, v12

    .line 705
    :cond_31
    iput v14, v9, Landroidx/recyclerview/widget/r2;->c:I

    .line 706
    .line 707
    iput v14, v9, Landroidx/recyclerview/widget/r2;->b:I

    .line 708
    .line 709
    :cond_32
    :goto_1a
    add-int/lit8 v3, v3, 0x1

    .line 710
    .line 711
    goto :goto_18

    .line 712
    :cond_33
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 713
    .line 714
    array-length v9, v3

    .line 715
    iget-object v11, v5, Landroidx/recyclerview/widget/n2;->f:[I

    .line 716
    .line 717
    if-eqz v11, :cond_34

    .line 718
    .line 719
    array-length v11, v11

    .line 720
    if-ge v11, v9, :cond_35

    .line 721
    .line 722
    :cond_34
    iget-object v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 723
    .line 724
    array-length v6, v6

    .line 725
    new-array v6, v6, [I

    .line 726
    .line 727
    iput-object v6, v5, Landroidx/recyclerview/widget/n2;->f:[I

    .line 728
    .line 729
    :cond_35
    const/4 v6, 0x0

    .line 730
    :goto_1b
    if-ge v6, v9, :cond_36

    .line 731
    .line 732
    iget-object v11, v5, Landroidx/recyclerview/widget/n2;->f:[I

    .line 733
    .line 734
    aget-object v12, v3, v6

    .line 735
    .line 736
    invoke-virtual {v12, v10}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 737
    .line 738
    .line 739
    move-result v12

    .line 740
    aput v12, v11, v6

    .line 741
    .line 742
    add-int/lit8 v6, v6, 0x1

    .line 743
    .line 744
    goto :goto_1b

    .line 745
    :cond_36
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/p1;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/x1;)V

    .line 746
    .line 747
    .line 748
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g:Landroidx/recyclerview/widget/l0;

    .line 749
    .line 750
    iput-boolean v7, v3, Landroidx/recyclerview/widget/l0;->a:Z

    .line 751
    .line 752
    iput-boolean v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u:Z

    .line 753
    .line 754
    iget-object v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 755
    .line 756
    invoke-virtual {v6}, Landroidx/recyclerview/widget/v0;->l()I

    .line 757
    .line 758
    .line 759
    move-result v6

    .line 760
    iget v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 761
    .line 762
    div-int v9, v6, v9

    .line 763
    .line 764
    iput v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 765
    .line 766
    iget-object v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 767
    .line 768
    invoke-virtual {v9}, Landroidx/recyclerview/widget/v0;->i()I

    .line 769
    .line 770
    .line 771
    move-result v9

    .line 772
    invoke-static {v6, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 773
    .line 774
    .line 775
    move-result v6

    .line 776
    iput v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I

    .line 777
    .line 778
    iget v6, v5, Landroidx/recyclerview/widget/n2;->a:I

    .line 779
    .line 780
    invoke-virtual {v0, v6, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->A(ILandroidx/recyclerview/widget/e2;)V

    .line 781
    .line 782
    .line 783
    iget-boolean v6, v5, Landroidx/recyclerview/widget/n2;->c:Z

    .line 784
    .line 785
    if-eqz v6, :cond_37

    .line 786
    .line 787
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y(I)V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v0, v1, v3, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/l0;Landroidx/recyclerview/widget/e2;)I

    .line 791
    .line 792
    .line 793
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y(I)V

    .line 794
    .line 795
    .line 796
    iget v4, v5, Landroidx/recyclerview/widget/n2;->a:I

    .line 797
    .line 798
    iget v6, v3, Landroidx/recyclerview/widget/l0;->d:I

    .line 799
    .line 800
    add-int/2addr v4, v6

    .line 801
    iput v4, v3, Landroidx/recyclerview/widget/l0;->c:I

    .line 802
    .line 803
    invoke-virtual {v0, v1, v3, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/l0;Landroidx/recyclerview/widget/e2;)I

    .line 804
    .line 805
    .line 806
    goto :goto_1c

    .line 807
    :cond_37
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y(I)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0, v1, v3, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/l0;Landroidx/recyclerview/widget/e2;)I

    .line 811
    .line 812
    .line 813
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y(I)V

    .line 814
    .line 815
    .line 816
    iget v4, v5, Landroidx/recyclerview/widget/n2;->a:I

    .line 817
    .line 818
    iget v6, v3, Landroidx/recyclerview/widget/l0;->d:I

    .line 819
    .line 820
    add-int/2addr v4, v6

    .line 821
    iput v4, v3, Landroidx/recyclerview/widget/l0;->c:I

    .line 822
    .line 823
    invoke-virtual {v0, v1, v3, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/l0;Landroidx/recyclerview/widget/e2;)I

    .line 824
    .line 825
    .line 826
    :goto_1c
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 827
    .line 828
    invoke-virtual {v3}, Landroidx/recyclerview/widget/v0;->i()I

    .line 829
    .line 830
    .line 831
    move-result v3

    .line 832
    const/high16 v4, 0x40000000    # 2.0f

    .line 833
    .line 834
    if-ne v3, v4, :cond_38

    .line 835
    .line 836
    goto/16 :goto_21

    .line 837
    .line 838
    :cond_38
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 839
    .line 840
    .line 841
    move-result v3

    .line 842
    const/4 v4, 0x0

    .line 843
    const/4 v6, 0x0

    .line 844
    :goto_1d
    if-ge v6, v3, :cond_3b

    .line 845
    .line 846
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 847
    .line 848
    .line 849
    move-result-object v9

    .line 850
    iget-object v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 851
    .line 852
    invoke-virtual {v11, v9}, Landroidx/recyclerview/widget/v0;->c(Landroid/view/View;)I

    .line 853
    .line 854
    .line 855
    move-result v11

    .line 856
    int-to-float v11, v11

    .line 857
    cmpg-float v12, v11, v4

    .line 858
    .line 859
    if-gez v12, :cond_39

    .line 860
    .line 861
    goto :goto_1e

    .line 862
    :cond_39
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 863
    .line 864
    .line 865
    move-result-object v9

    .line 866
    check-cast v9, Landroidx/recyclerview/widget/o2;

    .line 867
    .line 868
    iget-boolean v9, v9, Landroidx/recyclerview/widget/o2;->f:Z

    .line 869
    .line 870
    if-eqz v9, :cond_3a

    .line 871
    .line 872
    const/high16 v9, 0x3f800000    # 1.0f

    .line 873
    .line 874
    mul-float v11, v11, v9

    .line 875
    .line 876
    iget v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 877
    .line 878
    int-to-float v9, v9

    .line 879
    div-float/2addr v11, v9

    .line 880
    :cond_3a
    invoke-static {v4, v11}, Ljava/lang/Math;->max(FF)F

    .line 881
    .line 882
    .line 883
    move-result v4

    .line 884
    :goto_1e
    add-int/lit8 v6, v6, 0x1

    .line 885
    .line 886
    goto :goto_1d

    .line 887
    :cond_3b
    iget v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 888
    .line 889
    iget v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 890
    .line 891
    int-to-float v9, v9

    .line 892
    mul-float v4, v4, v9

    .line 893
    .line 894
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 895
    .line 896
    .line 897
    move-result v4

    .line 898
    iget-object v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 899
    .line 900
    invoke-virtual {v9}, Landroidx/recyclerview/widget/v0;->i()I

    .line 901
    .line 902
    .line 903
    move-result v9

    .line 904
    if-ne v9, v10, :cond_3c

    .line 905
    .line 906
    iget-object v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 907
    .line 908
    invoke-virtual {v9}, Landroidx/recyclerview/widget/v0;->l()I

    .line 909
    .line 910
    .line 911
    move-result v9

    .line 912
    invoke-static {v4, v9}, Ljava/lang/Math;->min(II)I

    .line 913
    .line 914
    .line 915
    move-result v4

    .line 916
    :cond_3c
    iget v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 917
    .line 918
    div-int v9, v4, v9

    .line 919
    .line 920
    iput v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 921
    .line 922
    iget-object v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d:Landroidx/recyclerview/widget/v0;

    .line 923
    .line 924
    invoke-virtual {v9}, Landroidx/recyclerview/widget/v0;->i()I

    .line 925
    .line 926
    .line 927
    move-result v9

    .line 928
    invoke-static {v4, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 929
    .line 930
    .line 931
    move-result v4

    .line 932
    iput v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I

    .line 933
    .line 934
    iget v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 935
    .line 936
    if-ne v4, v6, :cond_3d

    .line 937
    .line 938
    goto :goto_21

    .line 939
    :cond_3d
    const/4 v4, 0x0

    .line 940
    :goto_1f
    if-ge v4, v3, :cond_41

    .line 941
    .line 942
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 943
    .line 944
    .line 945
    move-result-object v9

    .line 946
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 947
    .line 948
    .line 949
    move-result-object v10

    .line 950
    check-cast v10, Landroidx/recyclerview/widget/o2;

    .line 951
    .line 952
    iget-boolean v11, v10, Landroidx/recyclerview/widget/o2;->f:Z

    .line 953
    .line 954
    if-eqz v11, :cond_3e

    .line 955
    .line 956
    goto :goto_20

    .line 957
    :cond_3e
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    .line 958
    .line 959
    .line 960
    move-result v11

    .line 961
    if-eqz v11, :cond_3f

    .line 962
    .line 963
    iget v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 964
    .line 965
    if-ne v11, v8, :cond_3f

    .line 966
    .line 967
    iget v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 968
    .line 969
    sub-int/2addr v11, v8

    .line 970
    iget-object v10, v10, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 971
    .line 972
    iget v10, v10, Landroidx/recyclerview/widget/r2;->e:I

    .line 973
    .line 974
    sub-int/2addr v11, v10

    .line 975
    neg-int v10, v11

    .line 976
    iget v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 977
    .line 978
    mul-int v11, v11, v10

    .line 979
    .line 980
    mul-int v10, v10, v6

    .line 981
    .line 982
    sub-int/2addr v11, v10

    .line 983
    invoke-virtual {v9, v11}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 984
    .line 985
    .line 986
    goto :goto_20

    .line 987
    :cond_3f
    iget-object v10, v10, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 988
    .line 989
    iget v10, v10, Landroidx/recyclerview/widget/r2;->e:I

    .line 990
    .line 991
    iget v11, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 992
    .line 993
    mul-int v11, v11, v10

    .line 994
    .line 995
    mul-int v10, v10, v6

    .line 996
    .line 997
    iget v12, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 998
    .line 999
    if-ne v12, v8, :cond_40

    .line 1000
    .line 1001
    sub-int/2addr v11, v10

    .line 1002
    invoke-virtual {v9, v11}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 1003
    .line 1004
    .line 1005
    goto :goto_20

    .line 1006
    :cond_40
    sub-int/2addr v11, v10

    .line 1007
    invoke-virtual {v9, v11}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 1008
    .line 1009
    .line 1010
    :goto_20
    add-int/lit8 v4, v4, 0x1

    .line 1011
    .line 1012
    goto :goto_1f

    .line 1013
    :cond_41
    :goto_21
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 1014
    .line 1015
    .line 1016
    move-result v3

    .line 1017
    if-lez v3, :cond_43

    .line 1018
    .line 1019
    iget-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 1020
    .line 1021
    if-eqz v3, :cond_42

    .line 1022
    .line 1023
    invoke-virtual {v0, v1, v2, v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Z)V

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v0, v1, v2, v7}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Z)V

    .line 1027
    .line 1028
    .line 1029
    goto :goto_22

    .line 1030
    :cond_42
    invoke-virtual {v0, v1, v2, v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Z)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v0, v1, v2, v7}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Z)V

    .line 1034
    .line 1035
    .line 1036
    :cond_43
    :goto_22
    if-eqz p3, :cond_45

    .line 1037
    .line 1038
    iget-boolean v3, v2, Landroidx/recyclerview/widget/e2;->g:Z

    .line 1039
    .line 1040
    if-nez v3, :cond_45

    .line 1041
    .line 1042
    iget v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:I

    .line 1043
    .line 1044
    if-eqz v3, :cond_45

    .line 1045
    .line 1046
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 1047
    .line 1048
    .line 1049
    move-result v3

    .line 1050
    if-lez v3, :cond_45

    .line 1051
    .line 1052
    iget-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u:Z

    .line 1053
    .line 1054
    if-nez v3, :cond_44

    .line 1055
    .line 1056
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p()Landroid/view/View;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v3

    .line 1060
    if-eqz v3, :cond_45

    .line 1061
    .line 1062
    :cond_44
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->x:Landroidx/recyclerview/widget/a0;

    .line 1063
    .line 1064
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/p1;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d()Z

    .line 1068
    .line 1069
    .line 1070
    move-result v3

    .line 1071
    if-eqz v3, :cond_45

    .line 1072
    .line 1073
    goto :goto_23

    .line 1074
    :cond_45
    const/4 v8, 0x0

    .line 1075
    :goto_23
    iget-boolean v3, v2, Landroidx/recyclerview/widget/e2;->g:Z

    .line 1076
    .line 1077
    if-eqz v3, :cond_46

    .line 1078
    .line 1079
    invoke-virtual {v5}, Landroidx/recyclerview/widget/n2;->a()V

    .line 1080
    .line 1081
    .line 1082
    :cond_46
    iget-boolean v3, v5, Landroidx/recyclerview/widget/n2;->c:Z

    .line 1083
    .line 1084
    iput-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:Z

    .line 1085
    .line 1086
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    .line 1087
    .line 1088
    .line 1089
    move-result v3

    .line 1090
    iput-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:Z

    .line 1091
    .line 1092
    if-eqz v8, :cond_47

    .line 1093
    .line 1094
    invoke-virtual {v5}, Landroidx/recyclerview/widget/n2;->a()V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v0, v1, v2, v7}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;Z)V

    .line 1098
    .line 1099
    .line 1100
    :cond_47
    return-void
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
.end method

.method public final s(I)Z
    .locals 4

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 14
    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    return v3

    .line 18
    :cond_1
    return v2

    .line 19
    :cond_2
    if-ne p1, v1, :cond_3

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_3
    const/4 p1, 0x0

    .line 24
    :goto_1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 25
    .line 26
    if-ne p1, v0, :cond_4

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    goto :goto_2

    .line 30
    :cond_4
    const/4 p1, 0x0

    .line 31
    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-ne p1, v0, :cond_5

    .line 36
    .line 37
    return v3

    .line 38
    :cond_5
    return v2
    .line 39
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
.end method

.method public final scrollBy(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t(ILandroidx/recyclerview/widget/e2;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g:Landroidx/recyclerview/widget/l0;

    .line 15
    .line 16
    invoke-virtual {p0, p2, v0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/l0;Landroidx/recyclerview/widget/e2;)I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    iget v2, v0, Landroidx/recyclerview/widget/l0;->b:I

    .line 21
    .line 22
    if-ge v2, p3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    if-gez p1, :cond_2

    .line 26
    .line 27
    neg-int p1, p3

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move p1, p3

    .line 30
    :goto_0
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 31
    .line 32
    neg-int v2, p1

    .line 33
    invoke-virtual {p3, v2}, Landroidx/recyclerview/widget/v0;->o(I)V

    .line 34
    .line 35
    .line 36
    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 37
    .line 38
    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:Z

    .line 39
    .line 40
    iput v1, v0, Landroidx/recyclerview/widget/l0;->b:I

    .line 41
    .line 42
    invoke-virtual {p0, p2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/l0;)V

    .line 43
    .line 44
    .line 45
    return p1

    .line 46
    :cond_3
    :goto_1
    return v1
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
.end method

.method public final scrollHorizontallyBy(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final scrollToPosition(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, v0, Landroidx/recyclerview/widget/q2;->h:I

    .line 6
    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, v0, Landroidx/recyclerview/widget/q2;->k:[I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput v1, v0, Landroidx/recyclerview/widget/q2;->j:I

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    iput v1, v0, Landroidx/recyclerview/widget/q2;->h:I

    .line 17
    .line 18
    iput v1, v0, Landroidx/recyclerview/widget/q2;->i:I

    .line 19
    .line 20
    :cond_0
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    .line 21
    .line 22
    const/high16 p1, -0x80000000

    .line 23
    .line 24
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final scrollVerticallyBy(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final setMeasuredDimension(Landroid/graphics/Rect;II)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getPaddingRight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getPaddingTop()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getPaddingBottom()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne v0, v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    add-int/2addr p1, v2

    .line 29
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getMinimumHeight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/p1;->chooseSize(III)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 38
    .line 39
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 40
    .line 41
    mul-int p3, p3, v0

    .line 42
    .line 43
    add-int/2addr p3, v1

    .line 44
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getMinimumWidth()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-static {p2, p3, v0}, Landroidx/recyclerview/widget/p1;->chooseSize(III)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    add-int/2addr p1, v1

    .line 58
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getMinimumWidth()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-static {p2, p1, v0}, Landroidx/recyclerview/widget/p1;->chooseSize(III)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f:I

    .line 67
    .line 68
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 69
    .line 70
    mul-int p1, p1, v0

    .line 71
    .line 72
    add-int/2addr p1, v2

    .line 73
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getMinimumHeight()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/p1;->chooseSize(III)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    :goto_0
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/p1;->setMeasuredDimension(II)V

    .line 82
    .line 83
    .line 84
    return-void
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
.end method

.method public final smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/e2;I)V
    .locals 0

    .line 1
    new-instance p2, Landroidx/recyclerview/widget/q0;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/q0;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput p3, p2, Landroidx/recyclerview/widget/d2;->a:I

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/p1;->startSmoothScroll(Landroidx/recyclerview/widget/d2;)V

    .line 13
    .line 14
    .line 15
    return-void
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
    .line 38
    .line 39
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
.end method

.method public final supportsPredictiveItemAnimations()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Landroidx/recyclerview/widget/q2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public final t(ILandroidx/recyclerview/widget/e2;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lez p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, -0x1

    .line 15
    :goto_0
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g:Landroidx/recyclerview/widget/l0;

    .line 16
    .line 17
    iput-boolean v0, v3, Landroidx/recyclerview/widget/l0;->a:Z

    .line 18
    .line 19
    invoke-virtual {p0, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->A(ILandroidx/recyclerview/widget/e2;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y(I)V

    .line 23
    .line 24
    .line 25
    iget p2, v3, Landroidx/recyclerview/widget/l0;->d:I

    .line 26
    .line 27
    add-int/2addr v1, p2

    .line 28
    iput v1, v3, Landroidx/recyclerview/widget/l0;->c:I

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput p1, v3, Landroidx/recyclerview/widget/l0;->b:I

    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
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
.end method

.method public final u(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/l0;)V
    .locals 4

    .line 1
    iget-boolean v0, p2, Landroidx/recyclerview/widget/l0;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-boolean v0, p2, Landroidx/recyclerview/widget/l0;->i:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    iget v0, p2, Landroidx/recyclerview/widget/l0;->b:I

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget v0, p2, Landroidx/recyclerview/widget/l0;->e:I

    .line 17
    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    iget p2, p2, Landroidx/recyclerview/widget/l0;->g:I

    .line 21
    .line 22
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v(ILandroidx/recyclerview/widget/x1;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget p2, p2, Landroidx/recyclerview/widget/l0;->f:I

    .line 27
    .line 28
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w(ILandroidx/recyclerview/widget/x1;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    iget v0, p2, Landroidx/recyclerview/widget/l0;->e:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    const/4 v3, 0x0

    .line 36
    if-ne v0, v1, :cond_6

    .line 37
    .line 38
    iget v0, p2, Landroidx/recyclerview/widget/l0;->f:I

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 41
    .line 42
    aget-object v1, v1, v3

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    :goto_0
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 49
    .line 50
    if-ge v2, v3, :cond_4

    .line 51
    .line 52
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 53
    .line 54
    aget-object v3, v3, v2

    .line 55
    .line 56
    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/r2;->l(I)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-le v3, v1, :cond_3

    .line 61
    .line 62
    move v1, v3

    .line 63
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    sub-int/2addr v0, v1

    .line 67
    if-gez v0, :cond_5

    .line 68
    .line 69
    iget p2, p2, Landroidx/recyclerview/widget/l0;->g:I

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_5
    iget v1, p2, Landroidx/recyclerview/widget/l0;->g:I

    .line 73
    .line 74
    iget p2, p2, Landroidx/recyclerview/widget/l0;->b:I

    .line 75
    .line 76
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    sub-int p2, v1, p2

    .line 81
    .line 82
    :goto_1
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v(ILandroidx/recyclerview/widget/x1;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_6
    iget v0, p2, Landroidx/recyclerview/widget/l0;->g:I

    .line 87
    .line 88
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 89
    .line 90
    aget-object v1, v1, v3

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    :goto_2
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 97
    .line 98
    if-ge v2, v3, :cond_8

    .line 99
    .line 100
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 101
    .line 102
    aget-object v3, v3, v2

    .line 103
    .line 104
    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/r2;->j(I)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-ge v3, v1, :cond_7

    .line 109
    .line 110
    move v1, v3

    .line 111
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_8
    iget v0, p2, Landroidx/recyclerview/widget/l0;->g:I

    .line 115
    .line 116
    sub-int/2addr v1, v0

    .line 117
    if-gez v1, :cond_9

    .line 118
    .line 119
    iget p2, p2, Landroidx/recyclerview/widget/l0;->f:I

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_9
    iget v0, p2, Landroidx/recyclerview/widget/l0;->f:I

    .line 123
    .line 124
    iget p2, p2, Landroidx/recyclerview/widget/l0;->b:I

    .line 125
    .line 126
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    add-int/2addr p2, v0

    .line 131
    :goto_3
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w(ILandroidx/recyclerview/widget/x1;)V

    .line 132
    .line 133
    .line 134
    :cond_a
    :goto_4
    return-void
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

.method public final v(ILandroidx/recyclerview/widget/x1;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    :goto_0
    if-ltz v0, :cond_5

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/v0;->e(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-lt v3, p1, :cond_5

    .line 20
    .line 21
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 22
    .line 23
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/v0;->n(Landroid/view/View;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-lt v3, p1, :cond_5

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Landroidx/recyclerview/widget/o2;

    .line 34
    .line 35
    iget-boolean v4, v3, Landroidx/recyclerview/widget/o2;->f:Z

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x0

    .line 41
    :goto_1
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 42
    .line 43
    if-ge v4, v5, :cond_1

    .line 44
    .line 45
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 46
    .line 47
    aget-object v5, v5, v4

    .line 48
    .line 49
    iget-object v5, v5, Landroidx/recyclerview/widget/r2;->f:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-ne v5, v1, :cond_0

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_2
    iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 64
    .line 65
    if-ge v3, v4, :cond_4

    .line 66
    .line 67
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 68
    .line 69
    aget-object v4, v4, v3

    .line 70
    .line 71
    invoke-virtual {v4}, Landroidx/recyclerview/widget/r2;->m()V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    iget-object v4, v3, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 78
    .line 79
    iget-object v4, v4, Landroidx/recyclerview/widget/r2;->f:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v4, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-ne v4, v1, :cond_3

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    iget-object v3, v3, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 91
    .line 92
    invoke-virtual {v3}, Landroidx/recyclerview/widget/r2;->m()V

    .line 93
    .line 94
    .line 95
    :cond_4
    invoke-virtual {p0, v2, p2}, Landroidx/recyclerview/widget/p1;->removeAndRecycleView(Landroid/view/View;Landroidx/recyclerview/widget/x1;)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v0, v0, -0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    :goto_3
    return-void
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

.method public final w(ILandroidx/recyclerview/widget/x1;)V
    .locals 5

    .line 1
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_5

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/v0;->b(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-gt v2, p1, :cond_5

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c:Landroidx/recyclerview/widget/v0;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/v0;->m(Landroid/view/View;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-gt v2, p1, :cond_5

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Landroidx/recyclerview/widget/o2;

    .line 33
    .line 34
    iget-boolean v3, v2, Landroidx/recyclerview/widget/o2;->f:Z

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    :goto_1
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 41
    .line 42
    if-ge v2, v3, :cond_1

    .line 43
    .line 44
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 45
    .line 46
    aget-object v3, v3, v2

    .line 47
    .line 48
    iget-object v3, v3, Landroidx/recyclerview/widget/r2;->f:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-ne v3, v4, :cond_0

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    :goto_2
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 63
    .line 64
    if-ge v0, v2, :cond_4

    .line 65
    .line 66
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 67
    .line 68
    aget-object v2, v2, v0

    .line 69
    .line 70
    invoke-virtual {v2}, Landroidx/recyclerview/widget/r2;->n()V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    iget-object v0, v2, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 77
    .line 78
    iget-object v0, v0, Landroidx/recyclerview/widget/r2;->f:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-ne v0, v4, :cond_3

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    iget-object v0, v2, Landroidx/recyclerview/widget/o2;->e:Landroidx/recyclerview/widget/r2;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroidx/recyclerview/widget/r2;->n()V

    .line 92
    .line 93
    .line 94
    :cond_4
    invoke-virtual {p0, v1, p2}, Landroidx/recyclerview/widget/p1;->removeAndRecycleView(Landroid/view/View;Landroidx/recyclerview/widget/x1;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    :goto_3
    return-void
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

.method public final x()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:Z

    .line 14
    .line 15
    xor-int/2addr v0, v1

    .line 16
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 22
    .line 23
    return-void
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

.method public final y(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g:Landroidx/recyclerview/widget/l0;

    .line 2
    .line 3
    iput p1, v0, Landroidx/recyclerview/widget/l0;->e:I

    .line 4
    .line 5
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, -0x1

    .line 9
    if-ne p1, v3, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    if-ne v1, p1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 v2, -0x1

    .line 18
    :goto_1
    iput v2, v0, Landroidx/recyclerview/widget/l0;->d:I

    .line 19
    .line 20
    return-void
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

.method public final z(II)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    iget-object v1, v1, Landroidx/recyclerview/widget/r2;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b:[Landroidx/recyclerview/widget/r2;

    .line 22
    .line 23
    aget-object v1, v1, v0

    .line 24
    .line 25
    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B(Landroidx/recyclerview/widget/r2;II)V

    .line 26
    .line 27
    .line 28
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method
