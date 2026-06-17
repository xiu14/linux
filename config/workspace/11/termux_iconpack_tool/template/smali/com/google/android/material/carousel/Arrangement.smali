.class final Lcom/google/android/material/carousel/Arrangement;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:I

.field public final b:F

.field public c:I

.field public d:I

.field public final e:F

.field public final f:F

.field public final g:I

.field public final h:F


# direct methods
.method public constructor <init>(IFFFIFIFIF)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/google/android/material/carousel/Arrangement;->a:I

    .line 3
    invoke-static {p2, p3, p4}, La/a;->l(FFF)F

    move-result p2

    iput p2, p0, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 4
    iput p5, p0, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 5
    iput p6, p0, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 6
    iput p7, p0, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 7
    iput p8, p0, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 8
    iput p9, p0, Lcom/google/android/material/carousel/Arrangement;->g:I

    int-to-float v0, p9

    mul-float v1, p8, v0

    int-to-float p7, p7

    mul-float p6, p6, p7

    add-float/2addr p6, v1

    int-to-float p7, p5

    mul-float v1, p2, p7

    add-float/2addr v1, p6

    sub-float p6, p10, v1

    const/4 v1, 0x0

    if-lez p5, :cond_0

    cmpl-float v2, p6, v1

    if-lez v2, :cond_0

    div-float/2addr p6, p7

    sub-float/2addr p4, p2

    .line 9
    invoke-static {p6, p4}, Ljava/lang/Math;->min(FF)F

    move-result p3

    add-float/2addr p3, p2

    iput p3, p0, Lcom/google/android/material/carousel/Arrangement;->b:F

    goto :goto_0

    :cond_0
    if-lez p5, :cond_1

    cmpg-float p4, p6, v1

    if-gez p4, :cond_1

    div-float/2addr p6, p7

    sub-float/2addr p3, p2

    .line 10
    invoke-static {p6, p3}, Ljava/lang/Math;->max(FF)F

    move-result p3

    add-float/2addr p3, p2

    iput p3, p0, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 11
    :cond_1
    :goto_0
    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->c:I

    if-lez p2, :cond_2

    iget p3, p0, Lcom/google/android/material/carousel/Arrangement;->b:F

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    :goto_1
    iput p3, p0, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 12
    iget p4, p0, Lcom/google/android/material/carousel/Arrangement;->d:I

    if-lez p2, :cond_3

    move p5, p3

    goto :goto_2

    :cond_3
    const/4 p5, 0x0

    :goto_2
    int-to-float p2, p2

    int-to-float p6, p4

    const/high16 p7, 0x40000000    # 2.0f

    div-float v2, p6, p7

    add-float/2addr p2, v2

    mul-float p2, p2, p5

    sub-float/2addr p10, p2

    add-float/2addr v2, v0

    div-float/2addr p10, v2

    .line 13
    iput p10, p0, Lcom/google/android/material/carousel/Arrangement;->f:F

    add-float/2addr p3, p10

    div-float/2addr p3, p7

    .line 14
    iput p3, p0, Lcom/google/android/material/carousel/Arrangement;->e:F

    if-lez p4, :cond_5

    cmpl-float p2, p10, p8

    if-eqz p2, :cond_5

    sub-float p2, p8, p10

    mul-float p2, p2, v0

    const p4, 0x3dcccccd    # 0.1f

    mul-float p3, p3, p4

    mul-float p3, p3, p6

    .line 15
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p4

    invoke-static {p4, p3}, Ljava/lang/Math;->min(FF)F

    move-result p3

    cmpl-float p2, p2, v1

    if-lez p2, :cond_4

    .line 16
    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->e:F

    iget p4, p0, Lcom/google/android/material/carousel/Arrangement;->d:I

    int-to-float p4, p4

    div-float p4, p3, p4

    sub-float/2addr p2, p4

    iput p2, p0, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 17
    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->f:F

    div-float/2addr p3, v0

    add-float/2addr p3, p2

    iput p3, p0, Lcom/google/android/material/carousel/Arrangement;->f:F

    goto :goto_3

    .line 18
    :cond_4
    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->e:F

    iget p4, p0, Lcom/google/android/material/carousel/Arrangement;->d:I

    int-to-float p4, p4

    div-float p4, p3, p4

    add-float/2addr p4, p2

    iput p4, p0, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 19
    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->f:F

    div-float/2addr p3, v0

    sub-float/2addr p2, p3

    iput p2, p0, Lcom/google/android/material/carousel/Arrangement;->f:F

    :cond_5
    :goto_3
    if-lez p9, :cond_6

    .line 20
    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->c:I

    if-lez p2, :cond_6

    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->d:I

    if-lez p2, :cond_6

    .line 21
    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->f:F

    iget p3, p0, Lcom/google/android/material/carousel/Arrangement;->e:F

    cmpl-float p2, p2, p3

    if-lez p2, :cond_7

    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->b:F

    cmpl-float p2, p3, p2

    if-lez p2, :cond_7

    goto :goto_4

    :cond_6
    if-lez p9, :cond_8

    .line 22
    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->c:I

    if-lez p2, :cond_8

    .line 23
    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->f:F

    iget p3, p0, Lcom/google/android/material/carousel/Arrangement;->b:F

    cmpl-float p2, p2, p3

    if-lez p2, :cond_7

    goto :goto_4

    :cond_7
    const p1, 0x7f7fffff    # Float.MAX_VALUE

    goto :goto_5

    .line 24
    :cond_8
    :goto_4
    iget p2, p0, Lcom/google/android/material/carousel/Arrangement;->f:F

    sub-float/2addr p8, p2

    invoke-static {p8}, Ljava/lang/Math;->abs(F)F

    move-result p2

    int-to-float p1, p1

    mul-float p1, p1, p2

    .line 25
    :goto_5
    iput p1, p0, Lcom/google/android/material/carousel/Arrangement;->h:F

    return-void
.end method

.method public static a(FFFF[IF[IF[I)Lcom/google/android/material/carousel/Arrangement;
    .locals 22

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    move-object/from16 v2, p8

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    :goto_0
    if-ge v7, v3, :cond_5

    .line 13
    .line 14
    aget v17, v2, v7

    .line 15
    .line 16
    array-length v8, v1

    .line 17
    const/4 v9, 0x0

    .line 18
    :goto_1
    if-ge v9, v8, :cond_4

    .line 19
    .line 20
    aget v15, v1, v9

    .line 21
    .line 22
    array-length v10, v0

    .line 23
    const/4 v11, 0x0

    .line 24
    :goto_2
    if-ge v11, v10, :cond_3

    .line 25
    .line 26
    aget v13, v0, v11

    .line 27
    .line 28
    move v12, v8

    .line 29
    new-instance v8, Lcom/google/android/material/carousel/Arrangement;

    .line 30
    .line 31
    move v14, v9

    .line 32
    move v9, v5

    .line 33
    move v5, v14

    .line 34
    move/from16 v18, p0

    .line 35
    .line 36
    move/from16 v14, p5

    .line 37
    .line 38
    move/from16 v16, p7

    .line 39
    .line 40
    move/from16 v20, v10

    .line 41
    .line 42
    move/from16 v21, v11

    .line 43
    .line 44
    move/from16 v19, v12

    .line 45
    .line 46
    move/from16 v10, p1

    .line 47
    .line 48
    move/from16 v11, p2

    .line 49
    .line 50
    move/from16 v12, p3

    .line 51
    .line 52
    invoke-direct/range {v8 .. v18}, Lcom/google/android/material/carousel/Arrangement;-><init>(IFFFIFIFIF)V

    .line 53
    .line 54
    .line 55
    iget v10, v8, Lcom/google/android/material/carousel/Arrangement;->h:F

    .line 56
    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    iget v11, v4, Lcom/google/android/material/carousel/Arrangement;->h:F

    .line 60
    .line 61
    cmpg-float v11, v10, v11

    .line 62
    .line 63
    if-gez v11, :cond_2

    .line 64
    .line 65
    :cond_0
    const/4 v4, 0x0

    .line 66
    cmpl-float v4, v10, v4

    .line 67
    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    return-object v8

    .line 71
    :cond_1
    move-object v4, v8

    .line 72
    :cond_2
    add-int/lit8 v8, v9, 0x1

    .line 73
    .line 74
    add-int/lit8 v11, v21, 0x1

    .line 75
    .line 76
    move v9, v5

    .line 77
    move v5, v8

    .line 78
    move/from16 v8, v19

    .line 79
    .line 80
    move/from16 v10, v20

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    move/from16 v19, v9

    .line 84
    .line 85
    move v9, v5

    .line 86
    move/from16 v5, v19

    .line 87
    .line 88
    move/from16 v19, v8

    .line 89
    .line 90
    add-int/lit8 v5, v5, 0x1

    .line 91
    .line 92
    move v8, v9

    .line 93
    move v9, v5

    .line 94
    move v5, v8

    .line 95
    move/from16 v8, v19

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    return-object v4
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
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Arrangement [priority="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/google/android/material/carousel/Arrangement;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", smallCount="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", smallSize="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", mediumCount="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", mediumSize="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v1, p0, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", largeCount="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, Lcom/google/android/material/carousel/Arrangement;->g:I

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", largeSize="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget v1, p0, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", cost="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget v1, p0, Lcom/google/android/material/carousel/Arrangement;->h:F

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, "]"

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0
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
