.class public final Le2/e;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# static fields
.field public static final n:Landroid/view/animation/LinearInterpolator;

.field public static final o:Lg1/b;

.field public static final p:[I


# instance fields
.field public final h:Le2/d;

.field public i:F

.field public final j:Landroid/content/res/Resources;

.field public final k:Landroid/animation/ValueAnimator;

.field public l:F

.field public m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le2/e;->n:Landroid/view/animation/LinearInterpolator;

    .line 7
    .line 8
    new-instance v0, Lg1/b;

    .line 9
    .line 10
    invoke-direct {v0}, Lg1/b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Le2/e;->o:Lg1/b;

    .line 14
    .line 15
    const/high16 v0, -0x1000000

    .line 16
    .line 17
    filled-new-array {v0}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Le2/e;->p:[I

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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Le2/e;->j:Landroid/content/res/Resources;

    .line 12
    .line 13
    new-instance p1, Le2/d;

    .line 14
    .line 15
    invoke-direct {p1}, Le2/d;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Le2/e;->h:Le2/d;

    .line 19
    .line 20
    sget-object v0, Le2/e;->p:[I

    .line 21
    .line 22
    iput-object v0, p1, Le2/d;->i:[I

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p1, v0}, Le2/d;->a(I)V

    .line 26
    .line 27
    .line 28
    const/high16 v0, 0x40200000    # 2.5f

    .line 29
    .line 30
    iput v0, p1, Le2/d;->h:F

    .line 31
    .line 32
    iget-object v1, p1, Le2/d;->b:Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    new-array v0, v0, [F

    .line 42
    .line 43
    fill-array-data v0, :array_0

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, Le2/b;

    .line 51
    .line 52
    invoke-direct {v1, p0, p1}, Le2/b;-><init>(Le2/e;Le2/d;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, -0x1

    .line 59
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 64
    .line 65
    .line 66
    sget-object v1, Le2/e;->n:Landroid/view/animation/LinearInterpolator;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Le2/c;

    .line 72
    .line 73
    invoke-direct {v1, p0, p1}, Le2/c;-><init>(Le2/e;Le2/d;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Le2/e;->k:Landroid/animation/ValueAnimator;

    .line 80
    .line 81
    return-void

    .line 82
    nop

    .line 83
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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

.method public static d(FLe2/d;)V
    .locals 8

    .line 1
    const/high16 v0, 0x3f400000    # 0.75f

    .line 2
    .line 3
    cmpl-float v1, p0, v0

    .line 4
    .line 5
    if-lez v1, :cond_0

    .line 6
    .line 7
    sub-float/2addr p0, v0

    .line 8
    const/high16 v0, 0x3e800000    # 0.25f

    .line 9
    .line 10
    div-float/2addr p0, v0

    .line 11
    iget-object v0, p1, Le2/d;->i:[I

    .line 12
    .line 13
    iget v1, p1, Le2/d;->j:I

    .line 14
    .line 15
    aget v2, v0, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    array-length v3, v0

    .line 20
    rem-int/2addr v1, v3

    .line 21
    aget v0, v0, v1

    .line 22
    .line 23
    shr-int/lit8 v1, v2, 0x18

    .line 24
    .line 25
    and-int/lit16 v1, v1, 0xff

    .line 26
    .line 27
    shr-int/lit8 v3, v2, 0x10

    .line 28
    .line 29
    and-int/lit16 v3, v3, 0xff

    .line 30
    .line 31
    shr-int/lit8 v4, v2, 0x8

    .line 32
    .line 33
    and-int/lit16 v4, v4, 0xff

    .line 34
    .line 35
    and-int/lit16 v2, v2, 0xff

    .line 36
    .line 37
    shr-int/lit8 v5, v0, 0x18

    .line 38
    .line 39
    and-int/lit16 v5, v5, 0xff

    .line 40
    .line 41
    shr-int/lit8 v6, v0, 0x10

    .line 42
    .line 43
    and-int/lit16 v6, v6, 0xff

    .line 44
    .line 45
    shr-int/lit8 v7, v0, 0x8

    .line 46
    .line 47
    and-int/lit16 v7, v7, 0xff

    .line 48
    .line 49
    and-int/lit16 v0, v0, 0xff

    .line 50
    .line 51
    sub-int/2addr v5, v1

    .line 52
    int-to-float v5, v5

    .line 53
    mul-float v5, v5, p0

    .line 54
    .line 55
    float-to-int v5, v5

    .line 56
    add-int/2addr v1, v5

    .line 57
    shl-int/lit8 v1, v1, 0x18

    .line 58
    .line 59
    sub-int/2addr v6, v3

    .line 60
    int-to-float v5, v6

    .line 61
    mul-float v5, v5, p0

    .line 62
    .line 63
    float-to-int v5, v5

    .line 64
    add-int/2addr v3, v5

    .line 65
    shl-int/lit8 v3, v3, 0x10

    .line 66
    .line 67
    or-int/2addr v1, v3

    .line 68
    sub-int/2addr v7, v4

    .line 69
    int-to-float v3, v7

    .line 70
    mul-float v3, v3, p0

    .line 71
    .line 72
    float-to-int v3, v3

    .line 73
    add-int/2addr v4, v3

    .line 74
    shl-int/lit8 v3, v4, 0x8

    .line 75
    .line 76
    or-int/2addr v1, v3

    .line 77
    sub-int/2addr v0, v2

    .line 78
    int-to-float v0, v0

    .line 79
    mul-float p0, p0, v0

    .line 80
    .line 81
    float-to-int p0, p0

    .line 82
    add-int/2addr v2, p0

    .line 83
    or-int p0, v1, v2

    .line 84
    .line 85
    iput p0, p1, Le2/d;->u:I

    .line 86
    .line 87
    return-void

    .line 88
    :cond_0
    iget-object p0, p1, Le2/d;->i:[I

    .line 89
    .line 90
    iget v0, p1, Le2/d;->j:I

    .line 91
    .line 92
    aget p0, p0, v0

    .line 93
    .line 94
    iput p0, p1, Le2/d;->u:I

    .line 95
    .line 96
    return-void
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


# virtual methods
.method public final a(FLe2/d;Z)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Le2/e;->m:Z

    .line 2
    .line 3
    const v1, 0x3c23d70a    # 0.01f

    .line 4
    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1, p2}, Le2/e;->d(FLe2/d;)V

    .line 9
    .line 10
    .line 11
    iget p3, p2, Le2/d;->m:F

    .line 12
    .line 13
    const v0, 0x3f4ccccd    # 0.8f

    .line 14
    .line 15
    .line 16
    div-float/2addr p3, v0

    .line 17
    float-to-double v2, p3

    .line 18
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 23
    .line 24
    add-double/2addr v2, v4

    .line 25
    double-to-float p3, v2

    .line 26
    iget v0, p2, Le2/d;->k:F

    .line 27
    .line 28
    iget v2, p2, Le2/d;->l:F

    .line 29
    .line 30
    sub-float v1, v2, v1

    .line 31
    .line 32
    sub-float/2addr v1, v0

    .line 33
    mul-float v1, v1, p1

    .line 34
    .line 35
    add-float/2addr v1, v0

    .line 36
    iput v1, p2, Le2/d;->e:F

    .line 37
    .line 38
    iput v2, p2, Le2/d;->f:F

    .line 39
    .line 40
    iget v0, p2, Le2/d;->m:F

    .line 41
    .line 42
    invoke-static {p3, v0, p1, v0}, Landroidx/appcompat/app/b;->f(FFFF)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iput p1, p2, Le2/d;->g:F

    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 50
    .line 51
    cmpl-float v2, p1, v0

    .line 52
    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    if-eqz p3, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    return-void

    .line 59
    :cond_2
    :goto_0
    iget p3, p2, Le2/d;->m:F

    .line 60
    .line 61
    sget-object v2, Le2/e;->o:Lg1/b;

    .line 62
    .line 63
    const v3, 0x3f4a3d71    # 0.79f

    .line 64
    .line 65
    .line 66
    const/high16 v4, 0x3f000000    # 0.5f

    .line 67
    .line 68
    cmpg-float v5, p1, v4

    .line 69
    .line 70
    if-gez v5, :cond_3

    .line 71
    .line 72
    div-float v0, p1, v4

    .line 73
    .line 74
    iget v4, p2, Le2/d;->k:F

    .line 75
    .line 76
    invoke-virtual {v2, v0}, Lg1/c;->getInterpolation(F)F

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    mul-float v0, v0, v3

    .line 81
    .line 82
    add-float/2addr v0, v1

    .line 83
    add-float/2addr v0, v4

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    sub-float v5, p1, v4

    .line 86
    .line 87
    div-float/2addr v5, v4

    .line 88
    iget v4, p2, Le2/d;->k:F

    .line 89
    .line 90
    add-float/2addr v4, v3

    .line 91
    invoke-virtual {v2, v5}, Lg1/c;->getInterpolation(F)F

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    sub-float/2addr v0, v2

    .line 96
    mul-float v0, v0, v3

    .line 97
    .line 98
    add-float/2addr v0, v1

    .line 99
    sub-float v0, v4, v0

    .line 100
    .line 101
    move v6, v4

    .line 102
    move v4, v0

    .line 103
    move v0, v6

    .line 104
    :goto_1
    const v1, 0x3e570a3c    # 0.20999998f

    .line 105
    .line 106
    .line 107
    mul-float v1, v1, p1

    .line 108
    .line 109
    add-float/2addr v1, p3

    .line 110
    iget p3, p0, Le2/e;->l:F

    .line 111
    .line 112
    add-float/2addr p1, p3

    .line 113
    const/high16 p3, 0x43580000    # 216.0f

    .line 114
    .line 115
    mul-float p1, p1, p3

    .line 116
    .line 117
    iput v4, p2, Le2/d;->e:F

    .line 118
    .line 119
    iput v0, p2, Le2/d;->f:F

    .line 120
    .line 121
    iput v1, p2, Le2/d;->g:F

    .line 122
    .line 123
    iput p1, p0, Le2/e;->i:F

    .line 124
    .line 125
    return-void
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

.method public final b(FFFF)V
    .locals 3

    .line 1
    iget-object v0, p0, Le2/e;->j:Landroid/content/res/Resources;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 8
    .line 9
    mul-float p2, p2, v0

    .line 10
    .line 11
    iget-object v1, p0, Le2/e;->h:Le2/d;

    .line 12
    .line 13
    iput p2, v1, Le2/d;->h:F

    .line 14
    .line 15
    iget-object v2, v1, Le2/d;->b:Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 18
    .line 19
    .line 20
    mul-float p1, p1, v0

    .line 21
    .line 22
    iput p1, v1, Le2/d;->q:F

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {v1, p1}, Le2/d;->a(I)V

    .line 26
    .line 27
    .line 28
    mul-float p3, p3, v0

    .line 29
    .line 30
    mul-float p4, p4, v0

    .line 31
    .line 32
    float-to-int p1, p3

    .line 33
    iput p1, v1, Le2/d;->r:I

    .line 34
    .line 35
    float-to-int p1, p4

    .line 36
    iput p1, v1, Le2/d;->s:I

    .line 37
    .line 38
    return-void
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

.method public final c(I)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/high16 p1, 0x41400000    # 12.0f

    .line 4
    .line 5
    const/high16 v0, 0x40c00000    # 6.0f

    .line 6
    .line 7
    const/high16 v1, 0x41300000    # 11.0f

    .line 8
    .line 9
    const/high16 v2, 0x40400000    # 3.0f

    .line 10
    .line 11
    invoke-virtual {p0, v1, v2, p1, v0}, Le2/e;->b(FFFF)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/high16 p1, 0x41200000    # 10.0f

    .line 16
    .line 17
    const/high16 v0, 0x40a00000    # 5.0f

    .line 18
    .line 19
    const/high16 v1, 0x40f00000    # 7.5f

    .line 20
    .line 21
    const/high16 v2, 0x40200000    # 2.5f

    .line 22
    .line 23
    invoke-virtual {p0, v1, v2, p1, v0}, Le2/e;->b(FFFF)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

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

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 6
    .line 7
    .line 8
    iget v1, p0, Le2/e;->i:F

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-virtual {p1, v1, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Le2/e;->h:Le2/d;

    .line 22
    .line 23
    iget-object v7, v1, Le2/d;->b:Landroid/graphics/Paint;

    .line 24
    .line 25
    iget-object v3, v1, Le2/d;->a:Landroid/graphics/RectF;

    .line 26
    .line 27
    iget v2, v1, Le2/d;->q:F

    .line 28
    .line 29
    iget v4, v1, Le2/d;->h:F

    .line 30
    .line 31
    const/high16 v8, 0x40000000    # 2.0f

    .line 32
    .line 33
    div-float/2addr v4, v8

    .line 34
    add-float/2addr v4, v2

    .line 35
    const/4 v9, 0x0

    .line 36
    cmpg-float v2, v2, v9

    .line 37
    .line 38
    if-gtz v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    int-to-float v2, v2

    .line 53
    div-float/2addr v2, v8

    .line 54
    iget v4, v1, Le2/d;->r:I

    .line 55
    .line 56
    int-to-float v4, v4

    .line 57
    iget v5, v1, Le2/d;->p:F

    .line 58
    .line 59
    mul-float v4, v4, v5

    .line 60
    .line 61
    div-float/2addr v4, v8

    .line 62
    iget v5, v1, Le2/d;->h:F

    .line 63
    .line 64
    div-float/2addr v5, v8

    .line 65
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    sub-float v4, v2, v4

    .line 70
    .line 71
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    int-to-float v2, v2

    .line 76
    sub-float/2addr v2, v4

    .line 77
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    int-to-float v5, v5

    .line 82
    sub-float/2addr v5, v4

    .line 83
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    int-to-float v6, v6

    .line 88
    add-float/2addr v6, v4

    .line 89
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    int-to-float v0, v0

    .line 94
    add-float/2addr v0, v4

    .line 95
    invoke-virtual {v3, v2, v5, v6, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 96
    .line 97
    .line 98
    iget v0, v1, Le2/d;->e:F

    .line 99
    .line 100
    iget v2, v1, Le2/d;->g:F

    .line 101
    .line 102
    add-float/2addr v0, v2

    .line 103
    const/high16 v4, 0x43b40000    # 360.0f

    .line 104
    .line 105
    mul-float v0, v0, v4

    .line 106
    .line 107
    iget v5, v1, Le2/d;->f:F

    .line 108
    .line 109
    add-float/2addr v5, v2

    .line 110
    mul-float v5, v5, v4

    .line 111
    .line 112
    sub-float/2addr v5, v0

    .line 113
    iget v2, v1, Le2/d;->u:I

    .line 114
    .line 115
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 116
    .line 117
    .line 118
    iget v2, v1, Le2/d;->t:I

    .line 119
    .line 120
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 121
    .line 122
    .line 123
    iget v2, v1, Le2/d;->h:F

    .line 124
    .line 125
    div-float/2addr v2, v8

    .line 126
    invoke-virtual {v3, v2, v2}, Landroid/graphics/RectF;->inset(FF)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    div-float/2addr v10, v8

    .line 142
    iget-object v11, v1, Le2/d;->d:Landroid/graphics/Paint;

    .line 143
    .line 144
    invoke-virtual {p1, v4, v6, v10, v11}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 145
    .line 146
    .line 147
    neg-float v2, v2

    .line 148
    invoke-virtual {v3, v2, v2}, Landroid/graphics/RectF;->inset(FF)V

    .line 149
    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    move-object v2, p1

    .line 153
    move v4, v0

    .line 154
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 155
    .line 156
    .line 157
    iget-object p1, v1, Le2/d;->c:Landroid/graphics/Paint;

    .line 158
    .line 159
    iget-boolean v0, v1, Le2/d;->n:Z

    .line 160
    .line 161
    if-eqz v0, :cond_2

    .line 162
    .line 163
    iget-object v0, v1, Le2/d;->o:Landroid/graphics/Path;

    .line 164
    .line 165
    if-nez v0, :cond_1

    .line 166
    .line 167
    new-instance v0, Landroid/graphics/Path;

    .line 168
    .line 169
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object v0, v1, Le2/d;->o:Landroid/graphics/Path;

    .line 173
    .line 174
    sget-object v6, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 175
    .line 176
    invoke-virtual {v0, v6}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 177
    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 181
    .line 182
    .line 183
    :goto_0
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    invoke-static {v0, v6}, Ljava/lang/Math;->min(FF)F

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    div-float/2addr v0, v8

    .line 196
    iget v6, v1, Le2/d;->r:I

    .line 197
    .line 198
    int-to-float v6, v6

    .line 199
    iget v7, v1, Le2/d;->p:F

    .line 200
    .line 201
    mul-float v6, v6, v7

    .line 202
    .line 203
    div-float/2addr v6, v8

    .line 204
    iget-object v7, v1, Le2/d;->o:Landroid/graphics/Path;

    .line 205
    .line 206
    invoke-virtual {v7, v9, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 207
    .line 208
    .line 209
    iget-object v7, v1, Le2/d;->o:Landroid/graphics/Path;

    .line 210
    .line 211
    iget v10, v1, Le2/d;->r:I

    .line 212
    .line 213
    int-to-float v10, v10

    .line 214
    iget v11, v1, Le2/d;->p:F

    .line 215
    .line 216
    mul-float v10, v10, v11

    .line 217
    .line 218
    invoke-virtual {v7, v10, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 219
    .line 220
    .line 221
    iget-object v7, v1, Le2/d;->o:Landroid/graphics/Path;

    .line 222
    .line 223
    iget v9, v1, Le2/d;->r:I

    .line 224
    .line 225
    int-to-float v9, v9

    .line 226
    iget v10, v1, Le2/d;->p:F

    .line 227
    .line 228
    mul-float v9, v9, v10

    .line 229
    .line 230
    div-float/2addr v9, v8

    .line 231
    iget v11, v1, Le2/d;->s:I

    .line 232
    .line 233
    int-to-float v11, v11

    .line 234
    mul-float v11, v11, v10

    .line 235
    .line 236
    invoke-virtual {v7, v9, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 237
    .line 238
    .line 239
    iget-object v7, v1, Le2/d;->o:Landroid/graphics/Path;

    .line 240
    .line 241
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    add-float/2addr v9, v0

    .line 246
    sub-float/2addr v9, v6

    .line 247
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    iget v6, v1, Le2/d;->h:F

    .line 252
    .line 253
    div-float/2addr v6, v8

    .line 254
    add-float/2addr v6, v0

    .line 255
    invoke-virtual {v7, v9, v6}, Landroid/graphics/Path;->offset(FF)V

    .line 256
    .line 257
    .line 258
    iget-object v0, v1, Le2/d;->o:Landroid/graphics/Path;

    .line 259
    .line 260
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 261
    .line 262
    .line 263
    iget v0, v1, Le2/d;->u:I

    .line 264
    .line 265
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 266
    .line 267
    .line 268
    iget v0, v1, Le2/d;->t:I

    .line 269
    .line 270
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 274
    .line 275
    .line 276
    add-float v0, v4, v5

    .line 277
    .line 278
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    invoke-virtual {v2, v0, v4, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 287
    .line 288
    .line 289
    iget-object v0, v1, Le2/d;->o:Landroid/graphics/Path;

    .line 290
    .line 291
    invoke-virtual {v2, v0, p1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 295
    .line 296
    .line 297
    :cond_2
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 298
    .line 299
    .line 300
    return-void
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

.method public final getAlpha()I
    .locals 1

    .line 1
    iget-object v0, p0, Le2/e;->h:Le2/d;

    .line 2
    .line 3
    iget v0, v0, Le2/d;->t:I

    .line 4
    .line 5
    return v0
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

.method public final getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
    .line 3
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

.method public final isRunning()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/e;->k:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Le2/e;->h:Le2/d;

    .line 2
    .line 3
    iput p1, v0, Le2/d;->t:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
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

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le2/e;->h:Le2/d;

    .line 2
    .line 3
    iget-object v0, v0, Le2/d;->b:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final start()V
    .locals 4

    .line 1
    iget-object v0, p0, Le2/e;->k:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le2/e;->h:Le2/d;

    .line 7
    .line 8
    iget v1, v0, Le2/d;->e:F

    .line 9
    .line 10
    iput v1, v0, Le2/d;->k:F

    .line 11
    .line 12
    iget v2, v0, Le2/d;->f:F

    .line 13
    .line 14
    iput v2, v0, Le2/d;->l:F

    .line 15
    .line 16
    iget v3, v0, Le2/d;->g:F

    .line 17
    .line 18
    iput v3, v0, Le2/d;->m:F

    .line 19
    .line 20
    cmpl-float v1, v2, v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Le2/e;->m:Z

    .line 26
    .line 27
    iget-object v0, p0, Le2/e;->k:Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    const-wide/16 v1, 0x29a

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Le2/e;->k:Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const/4 v1, 0x0

    .line 41
    invoke-virtual {v0, v1}, Le2/d;->a(I)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    iput v1, v0, Le2/d;->k:F

    .line 46
    .line 47
    iput v1, v0, Le2/d;->l:F

    .line 48
    .line 49
    iput v1, v0, Le2/d;->m:F

    .line 50
    .line 51
    iput v1, v0, Le2/d;->e:F

    .line 52
    .line 53
    iput v1, v0, Le2/d;->f:F

    .line 54
    .line 55
    iput v1, v0, Le2/d;->g:F

    .line 56
    .line 57
    iget-object v0, p0, Le2/e;->k:Landroid/animation/ValueAnimator;

    .line 58
    .line 59
    const-wide/16 v1, 0x534

    .line 60
    .line 61
    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Le2/e;->k:Landroid/animation/ValueAnimator;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 67
    .line 68
    .line 69
    return-void
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

.method public final stop()V
    .locals 4

    .line 1
    iget-object v0, p0, Le2/e;->k:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Le2/e;->i:F

    .line 8
    .line 9
    iget-object v1, p0, Le2/e;->h:Le2/d;

    .line 10
    .line 11
    iget-boolean v2, v1, Le2/d;->n:Z

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iput-boolean v3, v1, Le2/d;->n:Z

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v1, v3}, Le2/d;->a(I)V

    .line 19
    .line 20
    .line 21
    iput v0, v1, Le2/d;->k:F

    .line 22
    .line 23
    iput v0, v1, Le2/d;->l:F

    .line 24
    .line 25
    iput v0, v1, Le2/d;->m:F

    .line 26
    .line 27
    iput v0, v1, Le2/d;->e:F

    .line 28
    .line 29
    iput v0, v1, Le2/d;->f:F

    .line 30
    .line 31
    iput v0, v1, Le2/d;->g:F

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 34
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
