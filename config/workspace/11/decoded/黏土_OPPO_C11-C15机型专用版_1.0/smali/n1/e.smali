.class public final Ln1/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Landroid/graphics/Bitmap;

.field public final b:Ljava/util/ArrayList;

.field public c:I

.field public final d:I

.field public final e:I

.field public final f:Ljava/util/ArrayList;

.field public g:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ln1/e;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    iput v1, p0, Ln1/e;->c:I

    .line 14
    .line 15
    const/16 v1, 0x3100

    .line 16
    .line 17
    iput v1, p0, Ln1/e;->d:I

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iput v1, p0, Ln1/e;->e:I

    .line 21
    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Ln1/e;->f:Ljava/util/ArrayList;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    sget-object v2, Ln1/h;->f:Ln1/c;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Ln1/e;->a:Landroid/graphics/Bitmap;

    .line 43
    .line 44
    sget-object p1, Ln1/i;->d:Ln1/i;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    sget-object p1, Ln1/i;->e:Ln1/i;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    sget-object p1, Ln1/i;->f:Ln1/i;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    sget-object p1, Ln1/i;->g:Ln1/i;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    sget-object p1, Ln1/i;->h:Ln1/i;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    sget-object p1, Ln1/i;->i:Ln1/i;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 76
    .line 77
    const-string v0, "Bitmap is not valid"

    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
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


# virtual methods
.method public final a()Ln1/h;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ln1/e;->a:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    if-eqz v1, :cond_15

    .line 6
    .line 7
    iget v2, v0, Ln1/e;->d:I

    .line 8
    .line 9
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 10
    .line 11
    if-lez v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    mul-int v5, v5, v2

    .line 22
    .line 23
    iget v2, v0, Ln1/e;->d:I

    .line 24
    .line 25
    if-le v5, v2, :cond_1

    .line 26
    .line 27
    int-to-double v2, v2

    .line 28
    int-to-double v4, v5

    .line 29
    div-double/2addr v2, v4

    .line 30
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget v2, v0, Ln1/e;->e:I

    .line 36
    .line 37
    if-lez v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    iget v5, v0, Ln1/e;->e:I

    .line 52
    .line 53
    if-le v2, v5, :cond_1

    .line 54
    .line 55
    int-to-double v3, v5

    .line 56
    int-to-double v5, v2

    .line 57
    div-double/2addr v3, v5

    .line 58
    :cond_1
    :goto_0
    const-wide/16 v5, 0x0

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    cmpg-double v7, v3, v5

    .line 62
    .line 63
    if-gtz v7, :cond_2

    .line 64
    .line 65
    move-object v4, v1

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    int-to-double v5, v5

    .line 72
    mul-double v5, v5, v3

    .line 73
    .line 74
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    double-to-int v5, v5

    .line 79
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    int-to-double v6, v6

    .line 84
    mul-double v6, v6, v3

    .line 85
    .line 86
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 87
    .line 88
    .line 89
    move-result-wide v3

    .line 90
    double-to-int v3, v3

    .line 91
    invoke-static {v1, v5, v3, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    move-object v4, v3

    .line 96
    :goto_1
    iget-object v3, v0, Ln1/e;->g:Landroid/graphics/Rect;

    .line 97
    .line 98
    if-eq v4, v1, :cond_3

    .line 99
    .line 100
    if-eqz v3, :cond_3

    .line 101
    .line 102
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    int-to-double v5, v5

    .line 107
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    int-to-double v7, v7

    .line 112
    div-double/2addr v5, v7

    .line 113
    iget v7, v3, Landroid/graphics/Rect;->left:I

    .line 114
    .line 115
    int-to-double v7, v7

    .line 116
    mul-double v7, v7, v5

    .line 117
    .line 118
    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    .line 119
    .line 120
    .line 121
    move-result-wide v7

    .line 122
    double-to-int v7, v7

    .line 123
    iput v7, v3, Landroid/graphics/Rect;->left:I

    .line 124
    .line 125
    iget v7, v3, Landroid/graphics/Rect;->top:I

    .line 126
    .line 127
    int-to-double v7, v7

    .line 128
    mul-double v7, v7, v5

    .line 129
    .line 130
    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    .line 131
    .line 132
    .line 133
    move-result-wide v7

    .line 134
    double-to-int v7, v7

    .line 135
    iput v7, v3, Landroid/graphics/Rect;->top:I

    .line 136
    .line 137
    iget v7, v3, Landroid/graphics/Rect;->right:I

    .line 138
    .line 139
    int-to-double v7, v7

    .line 140
    mul-double v7, v7, v5

    .line 141
    .line 142
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 143
    .line 144
    .line 145
    move-result-wide v7

    .line 146
    double-to-int v7, v7

    .line 147
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    iput v7, v3, Landroid/graphics/Rect;->right:I

    .line 156
    .line 157
    iget v7, v3, Landroid/graphics/Rect;->bottom:I

    .line 158
    .line 159
    int-to-double v7, v7

    .line 160
    mul-double v7, v7, v5

    .line 161
    .line 162
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 163
    .line 164
    .line 165
    move-result-wide v5

    .line 166
    double-to-int v5, v5

    .line 167
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    iput v5, v3, Landroid/graphics/Rect;->bottom:I

    .line 176
    .line 177
    :cond_3
    new-instance v3, Ln1/b;

    .line 178
    .line 179
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    mul-int v5, v7, v11

    .line 188
    .line 189
    new-array v5, v5, [I

    .line 190
    .line 191
    const/4 v8, 0x0

    .line 192
    const/4 v9, 0x0

    .line 193
    const/4 v6, 0x0

    .line 194
    move v10, v7

    .line 195
    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 196
    .line 197
    .line 198
    iget-object v6, v0, Ln1/e;->g:Landroid/graphics/Rect;

    .line 199
    .line 200
    if-nez v6, :cond_4

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_4
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    iget-object v8, v0, Ln1/e;->g:Landroid/graphics/Rect;

    .line 208
    .line 209
    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    mul-int v9, v6, v8

    .line 214
    .line 215
    new-array v9, v9, [I

    .line 216
    .line 217
    const/4 v10, 0x0

    .line 218
    :goto_2
    if-ge v10, v8, :cond_5

    .line 219
    .line 220
    iget-object v11, v0, Ln1/e;->g:Landroid/graphics/Rect;

    .line 221
    .line 222
    iget v12, v11, Landroid/graphics/Rect;->top:I

    .line 223
    .line 224
    add-int/2addr v12, v10

    .line 225
    mul-int v12, v12, v7

    .line 226
    .line 227
    iget v11, v11, Landroid/graphics/Rect;->left:I

    .line 228
    .line 229
    add-int/2addr v12, v11

    .line 230
    mul-int v11, v10, v6

    .line 231
    .line 232
    invoke-static {v5, v12, v9, v11, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 233
    .line 234
    .line 235
    add-int/lit8 v10, v10, 0x1

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_5
    move-object v5, v9

    .line 239
    :goto_3
    iget v6, v0, Ln1/e;->c:I

    .line 240
    .line 241
    iget-object v7, v0, Ln1/e;->f:Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    if-eqz v8, :cond_6

    .line 248
    .line 249
    const/4 v7, 0x0

    .line 250
    goto :goto_4

    .line 251
    :cond_6
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 252
    .line 253
    .line 254
    move-result v8

    .line 255
    new-array v8, v8, [Ln1/f;

    .line 256
    .line 257
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    check-cast v7, [Ln1/f;

    .line 262
    .line 263
    :goto_4
    invoke-direct {v3, v5, v6, v7}, Ln1/b;-><init>([II[Ln1/f;)V

    .line 264
    .line 265
    .line 266
    if-eq v4, v1, :cond_7

    .line 267
    .line 268
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 269
    .line 270
    .line 271
    :cond_7
    new-instance v1, Ln1/h;

    .line 272
    .line 273
    iget-object v3, v3, Ln1/b;->c:Ljava/util/ArrayList;

    .line 274
    .line 275
    iget-object v4, v0, Ln1/e;->b:Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-direct {v1, v3, v4}, Ln1/h;-><init>(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    const/4 v5, 0x0

    .line 285
    :goto_5
    iget-object v6, v1, Ln1/h;->d:Landroid/util/SparseBooleanArray;

    .line 286
    .line 287
    if-ge v5, v3, :cond_14

    .line 288
    .line 289
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    check-cast v7, Ln1/i;

    .line 294
    .line 295
    iget-object v8, v7, Ln1/i;->c:[F

    .line 296
    .line 297
    iget-object v10, v7, Ln1/i;->a:[F

    .line 298
    .line 299
    array-length v11, v8

    .line 300
    const/4 v12, 0x0

    .line 301
    const/4 v13, 0x0

    .line 302
    const/4 v14, 0x0

    .line 303
    :goto_6
    if-ge v13, v11, :cond_9

    .line 304
    .line 305
    aget v15, v8, v13

    .line 306
    .line 307
    cmpl-float v16, v15, v12

    .line 308
    .line 309
    if-lez v16, :cond_8

    .line 310
    .line 311
    add-float/2addr v14, v15

    .line 312
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_9
    cmpl-float v11, v14, v12

    .line 316
    .line 317
    if-eqz v11, :cond_b

    .line 318
    .line 319
    array-length v11, v8

    .line 320
    const/4 v13, 0x0

    .line 321
    :goto_7
    if-ge v13, v11, :cond_b

    .line 322
    .line 323
    aget v15, v8, v13

    .line 324
    .line 325
    cmpl-float v16, v15, v12

    .line 326
    .line 327
    if-lez v16, :cond_a

    .line 328
    .line 329
    div-float/2addr v15, v14

    .line 330
    aput v15, v8, v13

    .line 331
    .line 332
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 333
    .line 334
    goto :goto_7

    .line 335
    :cond_b
    iget-object v8, v1, Ln1/h;->a:Ljava/util/List;

    .line 336
    .line 337
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    const/4 v13, 0x0

    .line 342
    const/4 v14, 0x0

    .line 343
    const/4 v15, 0x0

    .line 344
    const/16 v16, 0x0

    .line 345
    .line 346
    :goto_8
    const/4 v2, 0x1

    .line 347
    if-ge v13, v11, :cond_12

    .line 348
    .line 349
    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v17

    .line 353
    move-object/from16 v9, v17

    .line 354
    .line 355
    check-cast v9, Ln1/g;

    .line 356
    .line 357
    invoke-virtual {v9}, Ln1/g;->b()[F

    .line 358
    .line 359
    .line 360
    move-result-object v17

    .line 361
    aget v18, v17, v2

    .line 362
    .line 363
    const/16 v19, 0x0

    .line 364
    .line 365
    iget-object v12, v7, Ln1/i;->b:[F

    .line 366
    .line 367
    aget v20, v10, v16

    .line 368
    .line 369
    cmpl-float v20, v18, v20

    .line 370
    .line 371
    if-ltz v20, :cond_11

    .line 372
    .line 373
    const/16 v20, 0x2

    .line 374
    .line 375
    aget v21, v10, v20

    .line 376
    .line 377
    cmpg-float v18, v18, v21

    .line 378
    .line 379
    if-gtz v18, :cond_11

    .line 380
    .line 381
    aget v17, v17, v20

    .line 382
    .line 383
    aget v18, v12, v16

    .line 384
    .line 385
    cmpl-float v18, v17, v18

    .line 386
    .line 387
    if-ltz v18, :cond_11

    .line 388
    .line 389
    aget v18, v12, v20

    .line 390
    .line 391
    cmpg-float v17, v17, v18

    .line 392
    .line 393
    if-gtz v17, :cond_11

    .line 394
    .line 395
    const/16 v17, 0x1

    .line 396
    .line 397
    iget v2, v9, Ln1/g;->d:I

    .line 398
    .line 399
    invoke-virtual {v6, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-nez v2, :cond_11

    .line 404
    .line 405
    invoke-virtual {v9}, Ln1/g;->b()[F

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    iget-object v0, v1, Ln1/h;->e:Ln1/g;

    .line 410
    .line 411
    if-eqz v0, :cond_c

    .line 412
    .line 413
    iget v0, v0, Ln1/g;->e:I

    .line 414
    .line 415
    :goto_9
    move-object/from16 v18, v2

    .line 416
    .line 417
    goto :goto_a

    .line 418
    :cond_c
    const/4 v0, 0x1

    .line 419
    goto :goto_9

    .line 420
    :goto_a
    iget-object v2, v7, Ln1/i;->c:[F

    .line 421
    .line 422
    aget v21, v2, v16

    .line 423
    .line 424
    const/high16 v22, 0x3f800000    # 1.0f

    .line 425
    .line 426
    cmpl-float v23, v21, v19

    .line 427
    .line 428
    if-lez v23, :cond_d

    .line 429
    .line 430
    aget v23, v18, v17

    .line 431
    .line 432
    aget v24, v10, v17

    .line 433
    .line 434
    sub-float v23, v23, v24

    .line 435
    .line 436
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(F)F

    .line 437
    .line 438
    .line 439
    move-result v23

    .line 440
    sub-float v23, v22, v23

    .line 441
    .line 442
    mul-float v23, v23, v21

    .line 443
    .line 444
    goto :goto_b

    .line 445
    :cond_d
    const/16 v23, 0x0

    .line 446
    .line 447
    :goto_b
    aget v21, v2, v17

    .line 448
    .line 449
    cmpl-float v24, v21, v19

    .line 450
    .line 451
    if-lez v24, :cond_e

    .line 452
    .line 453
    aget v18, v18, v20

    .line 454
    .line 455
    aget v12, v12, v17

    .line 456
    .line 457
    sub-float v18, v18, v12

    .line 458
    .line 459
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->abs(F)F

    .line 460
    .line 461
    .line 462
    move-result v12

    .line 463
    sub-float v22, v22, v12

    .line 464
    .line 465
    mul-float v22, v22, v21

    .line 466
    .line 467
    goto :goto_c

    .line 468
    :cond_e
    const/16 v22, 0x0

    .line 469
    .line 470
    :goto_c
    aget v2, v2, v20

    .line 471
    .line 472
    cmpl-float v12, v2, v19

    .line 473
    .line 474
    if-lez v12, :cond_f

    .line 475
    .line 476
    iget v12, v9, Ln1/g;->e:I

    .line 477
    .line 478
    int-to-float v12, v12

    .line 479
    int-to-float v0, v0

    .line 480
    div-float/2addr v12, v0

    .line 481
    mul-float v12, v12, v2

    .line 482
    .line 483
    goto :goto_d

    .line 484
    :cond_f
    const/4 v12, 0x0

    .line 485
    :goto_d
    add-float v23, v23, v22

    .line 486
    .line 487
    add-float v23, v23, v12

    .line 488
    .line 489
    if-eqz v14, :cond_10

    .line 490
    .line 491
    cmpl-float v0, v23, v15

    .line 492
    .line 493
    if-lez v0, :cond_11

    .line 494
    .line 495
    :cond_10
    move-object v14, v9

    .line 496
    move/from16 v15, v23

    .line 497
    .line 498
    :cond_11
    add-int/lit8 v13, v13, 0x1

    .line 499
    .line 500
    move-object/from16 v0, p0

    .line 501
    .line 502
    const/4 v12, 0x0

    .line 503
    goto/16 :goto_8

    .line 504
    .line 505
    :cond_12
    const/16 v17, 0x1

    .line 506
    .line 507
    if-eqz v14, :cond_13

    .line 508
    .line 509
    iget v0, v14, Ln1/g;->d:I

    .line 510
    .line 511
    const/4 v2, 0x1

    .line 512
    invoke-virtual {v6, v0, v2}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 513
    .line 514
    .line 515
    :cond_13
    iget-object v0, v1, Ln1/h;->c:Lq/f;

    .line 516
    .line 517
    invoke-virtual {v0, v7, v14}, Lq/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    add-int/lit8 v5, v5, 0x1

    .line 521
    .line 522
    move-object/from16 v0, p0

    .line 523
    .line 524
    const/4 v2, 0x0

    .line 525
    goto/16 :goto_5

    .line 526
    .line 527
    :cond_14
    invoke-virtual {v6}, Landroid/util/SparseBooleanArray;->clear()V

    .line 528
    .line 529
    .line 530
    return-object v1

    .line 531
    :cond_15
    new-instance v0, Ljava/lang/AssertionError;

    .line 532
    .line 533
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 534
    .line 535
    .line 536
    throw v0
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

.method public final b(IIII)V
    .locals 4

    .line 1
    iget-object v0, p0, Ln1/e;->a:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Ln1/e;->g:Landroid/graphics/Rect;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Ln1/e;->g:Landroid/graphics/Rect;

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Ln1/e;->g:Landroid/graphics/Rect;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-virtual {v1, v3, v3, v2, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Ln1/e;->g:Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->intersect(IIII)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string p2, "The given region must intersect with the Bitmap\'s dimensions."

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

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
