.class public final Landroidx/fragment/app/b2;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/b2;->h:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/fragment/app/b2;->i:I

    iput-object p2, p0, Landroidx/fragment/app/b2;->j:Ljava/util/List;

    iput-object p3, p0, Landroidx/fragment/app/b2;->k:Ljava/util/List;

    iput-object p4, p0, Landroidx/fragment/app/b2;->l:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/fragment/app/b2;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/h;Ljava/util/List;Ljava/util/List;ILjava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/b2;->h:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/b2;->m:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/b2;->j:Ljava/util/List;

    iput-object p3, p0, Landroidx/fragment/app/b2;->k:Ljava/util/List;

    iput p4, p0, Landroidx/fragment/app/b2;->i:I

    iput-object p5, p0, Landroidx/fragment/app/b2;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/fragment/app/b2;->h:I

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/fragment/app/b2;->m:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroidx/recyclerview/widget/c;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Landroidx/recyclerview/widget/c;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroidx/recyclerview/widget/c;->i()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {v1}, Landroidx/recyclerview/widget/c;->h()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    new-instance v6, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v7, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v8, Landroidx/recyclerview/widget/x;

    .line 35
    .line 36
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput v3, v8, Landroidx/recyclerview/widget/x;->a:I

    .line 40
    .line 41
    iput v4, v8, Landroidx/recyclerview/widget/x;->b:I

    .line 42
    .line 43
    iput v3, v8, Landroidx/recyclerview/widget/x;->c:I

    .line 44
    .line 45
    iput v5, v8, Landroidx/recyclerview/widget/x;->d:I

    .line 46
    .line 47
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    add-int/2addr v4, v5

    .line 51
    const/4 v5, 0x1

    .line 52
    add-int/2addr v4, v5

    .line 53
    div-int/lit8 v4, v4, 0x2

    .line 54
    .line 55
    mul-int/lit8 v4, v4, 0x2

    .line 56
    .line 57
    add-int/2addr v4, v5

    .line 58
    new-array v8, v4, [I

    .line 59
    .line 60
    div-int/lit8 v9, v4, 0x2

    .line 61
    .line 62
    new-array v4, v4, [I

    .line 63
    .line 64
    new-instance v10, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    :goto_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    if-nez v11, :cond_1d

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    sub-int/2addr v11, v5

    .line 80
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    check-cast v11, Landroidx/recyclerview/widget/x;

    .line 85
    .line 86
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->b()I

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    if-lt v12, v5, :cond_16

    .line 91
    .line 92
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->a()I

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    if-ge v12, v5, :cond_0

    .line 97
    .line 98
    goto/16 :goto_13

    .line 99
    .line 100
    :cond_0
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->b()I

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->a()I

    .line 105
    .line 106
    .line 107
    move-result v14

    .line 108
    add-int/2addr v14, v12

    .line 109
    add-int/2addr v14, v5

    .line 110
    div-int/lit8 v14, v14, 0x2

    .line 111
    .line 112
    iget v12, v11, Landroidx/recyclerview/widget/x;->a:I

    .line 113
    .line 114
    add-int v15, v5, v9

    .line 115
    .line 116
    aput v12, v8, v15

    .line 117
    .line 118
    iget v12, v11, Landroidx/recyclerview/widget/x;->b:I

    .line 119
    .line 120
    aput v12, v4, v15

    .line 121
    .line 122
    const/4 v12, 0x0

    .line 123
    :goto_1
    if-ge v12, v14, :cond_16

    .line 124
    .line 125
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->b()I

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->a()I

    .line 130
    .line 131
    .line 132
    move-result v16

    .line 133
    sub-int v15, v15, v16

    .line 134
    .line 135
    invoke-static {v15}, Ljava/lang/Math;->abs(I)I

    .line 136
    .line 137
    .line 138
    move-result v15

    .line 139
    rem-int/lit8 v15, v15, 0x2

    .line 140
    .line 141
    if-ne v15, v5, :cond_1

    .line 142
    .line 143
    const/4 v15, 0x1

    .line 144
    goto :goto_2

    .line 145
    :cond_1
    const/4 v15, 0x0

    .line 146
    :goto_2
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->b()I

    .line 147
    .line 148
    .line 149
    move-result v16

    .line 150
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->a()I

    .line 151
    .line 152
    .line 153
    move-result v17

    .line 154
    sub-int v16, v16, v17

    .line 155
    .line 156
    neg-int v13, v12

    .line 157
    move v5, v13

    .line 158
    :goto_3
    if-gt v5, v12, :cond_a

    .line 159
    .line 160
    if-eq v5, v13, :cond_4

    .line 161
    .line 162
    if-eq v5, v12, :cond_2

    .line 163
    .line 164
    add-int/lit8 v19, v5, 0x1

    .line 165
    .line 166
    add-int v19, v19, v9

    .line 167
    .line 168
    aget v3, v8, v19

    .line 169
    .line 170
    add-int/lit8 v19, v5, -0x1

    .line 171
    .line 172
    add-int v19, v19, v9

    .line 173
    .line 174
    move-object/from16 v20, v2

    .line 175
    .line 176
    aget v2, v8, v19

    .line 177
    .line 178
    if-le v3, v2, :cond_3

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_2
    move-object/from16 v20, v2

    .line 182
    .line 183
    :cond_3
    add-int/lit8 v2, v5, -0x1

    .line 184
    .line 185
    add-int/2addr v2, v9

    .line 186
    aget v2, v8, v2

    .line 187
    .line 188
    add-int/lit8 v3, v2, 0x1

    .line 189
    .line 190
    :goto_4
    move/from16 v19, v5

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_4
    move-object/from16 v20, v2

    .line 194
    .line 195
    :goto_5
    add-int/lit8 v2, v5, 0x1

    .line 196
    .line 197
    add-int/2addr v2, v9

    .line 198
    aget v2, v8, v2

    .line 199
    .line 200
    move v3, v2

    .line 201
    goto :goto_4

    .line 202
    :goto_6
    iget v5, v11, Landroidx/recyclerview/widget/x;->c:I

    .line 203
    .line 204
    move/from16 v21, v5

    .line 205
    .line 206
    iget v5, v11, Landroidx/recyclerview/widget/x;->a:I

    .line 207
    .line 208
    sub-int v5, v3, v5

    .line 209
    .line 210
    add-int v5, v5, v21

    .line 211
    .line 212
    sub-int v5, v5, v19

    .line 213
    .line 214
    if-eqz v12, :cond_6

    .line 215
    .line 216
    if-eq v3, v2, :cond_5

    .line 217
    .line 218
    goto :goto_7

    .line 219
    :cond_5
    add-int/lit8 v21, v5, -0x1

    .line 220
    .line 221
    move/from16 v24, v21

    .line 222
    .line 223
    move/from16 v21, v3

    .line 224
    .line 225
    move/from16 v3, v24

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_6
    :goto_7
    move/from16 v21, v3

    .line 229
    .line 230
    move v3, v5

    .line 231
    :goto_8
    move/from16 v22, v9

    .line 232
    .line 233
    move v9, v5

    .line 234
    move/from16 v5, v21

    .line 235
    .line 236
    move/from16 v21, v22

    .line 237
    .line 238
    move/from16 v22, v14

    .line 239
    .line 240
    :goto_9
    iget v14, v11, Landroidx/recyclerview/widget/x;->b:I

    .line 241
    .line 242
    if-ge v5, v14, :cond_7

    .line 243
    .line 244
    iget v14, v11, Landroidx/recyclerview/widget/x;->d:I

    .line 245
    .line 246
    if-ge v9, v14, :cond_7

    .line 247
    .line 248
    invoke-virtual {v1, v5, v9}, Landroidx/recyclerview/widget/c;->f(II)Z

    .line 249
    .line 250
    .line 251
    move-result v14

    .line 252
    if-eqz v14, :cond_7

    .line 253
    .line 254
    add-int/lit8 v5, v5, 0x1

    .line 255
    .line 256
    add-int/lit8 v9, v9, 0x1

    .line 257
    .line 258
    goto :goto_9

    .line 259
    :cond_7
    add-int v14, v19, v21

    .line 260
    .line 261
    aput v5, v8, v14

    .line 262
    .line 263
    if-eqz v15, :cond_8

    .line 264
    .line 265
    sub-int v14, v16, v19

    .line 266
    .line 267
    move/from16 v23, v15

    .line 268
    .line 269
    add-int/lit8 v15, v13, 0x1

    .line 270
    .line 271
    if-lt v14, v15, :cond_9

    .line 272
    .line 273
    add-int/lit8 v15, v12, -0x1

    .line 274
    .line 275
    if-gt v14, v15, :cond_9

    .line 276
    .line 277
    add-int v14, v14, v21

    .line 278
    .line 279
    aget v14, v4, v14

    .line 280
    .line 281
    if-gt v14, v5, :cond_9

    .line 282
    .line 283
    new-instance v14, Landroidx/recyclerview/widget/y;

    .line 284
    .line 285
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 286
    .line 287
    .line 288
    iput v2, v14, Landroidx/recyclerview/widget/y;->a:I

    .line 289
    .line 290
    iput v3, v14, Landroidx/recyclerview/widget/y;->b:I

    .line 291
    .line 292
    iput v5, v14, Landroidx/recyclerview/widget/y;->c:I

    .line 293
    .line 294
    iput v9, v14, Landroidx/recyclerview/widget/y;->d:I

    .line 295
    .line 296
    const/4 v2, 0x0

    .line 297
    iput-boolean v2, v14, Landroidx/recyclerview/widget/y;->e:Z

    .line 298
    .line 299
    goto :goto_a

    .line 300
    :cond_8
    move/from16 v23, v15

    .line 301
    .line 302
    :cond_9
    add-int/lit8 v5, v19, 0x2

    .line 303
    .line 304
    move-object/from16 v2, v20

    .line 305
    .line 306
    move/from16 v9, v21

    .line 307
    .line 308
    move/from16 v14, v22

    .line 309
    .line 310
    move/from16 v15, v23

    .line 311
    .line 312
    const/4 v3, 0x0

    .line 313
    goto/16 :goto_3

    .line 314
    .line 315
    :cond_a
    move-object/from16 v20, v2

    .line 316
    .line 317
    move/from16 v21, v9

    .line 318
    .line 319
    move/from16 v22, v14

    .line 320
    .line 321
    const/4 v14, 0x0

    .line 322
    :goto_a
    if-eqz v14, :cond_b

    .line 323
    .line 324
    move-object v13, v14

    .line 325
    goto/16 :goto_14

    .line 326
    .line 327
    :cond_b
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->b()I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->a()I

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    sub-int/2addr v2, v3

    .line 336
    rem-int/lit8 v2, v2, 0x2

    .line 337
    .line 338
    if-nez v2, :cond_c

    .line 339
    .line 340
    const/4 v2, 0x1

    .line 341
    goto :goto_b

    .line 342
    :cond_c
    const/4 v2, 0x0

    .line 343
    :goto_b
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->b()I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    invoke-virtual {v11}, Landroidx/recyclerview/widget/x;->a()I

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    sub-int/2addr v3, v5

    .line 352
    move v5, v13

    .line 353
    :goto_c
    if-gt v5, v12, :cond_14

    .line 354
    .line 355
    if-eq v5, v13, :cond_e

    .line 356
    .line 357
    if-eq v5, v12, :cond_d

    .line 358
    .line 359
    add-int/lit8 v9, v5, 0x1

    .line 360
    .line 361
    add-int v9, v9, v21

    .line 362
    .line 363
    aget v9, v4, v9

    .line 364
    .line 365
    add-int/lit8 v14, v5, -0x1

    .line 366
    .line 367
    add-int v14, v14, v21

    .line 368
    .line 369
    aget v14, v4, v14

    .line 370
    .line 371
    if-ge v9, v14, :cond_d

    .line 372
    .line 373
    goto :goto_d

    .line 374
    :cond_d
    add-int/lit8 v9, v5, -0x1

    .line 375
    .line 376
    add-int v9, v9, v21

    .line 377
    .line 378
    aget v9, v4, v9

    .line 379
    .line 380
    add-int/lit8 v14, v9, -0x1

    .line 381
    .line 382
    goto :goto_e

    .line 383
    :cond_e
    :goto_d
    add-int/lit8 v9, v5, 0x1

    .line 384
    .line 385
    add-int v9, v9, v21

    .line 386
    .line 387
    aget v9, v4, v9

    .line 388
    .line 389
    move v14, v9

    .line 390
    :goto_e
    iget v15, v11, Landroidx/recyclerview/widget/x;->d:I

    .line 391
    .line 392
    move/from16 v16, v2

    .line 393
    .line 394
    iget v2, v11, Landroidx/recyclerview/widget/x;->b:I

    .line 395
    .line 396
    sub-int/2addr v2, v14

    .line 397
    sub-int/2addr v2, v5

    .line 398
    sub-int/2addr v15, v2

    .line 399
    if-eqz v12, :cond_10

    .line 400
    .line 401
    if-eq v14, v9, :cond_f

    .line 402
    .line 403
    goto :goto_f

    .line 404
    :cond_f
    add-int/lit8 v2, v15, 0x1

    .line 405
    .line 406
    goto :goto_10

    .line 407
    :cond_10
    :goto_f
    move v2, v15

    .line 408
    :goto_10
    move/from16 v19, v3

    .line 409
    .line 410
    :goto_11
    iget v3, v11, Landroidx/recyclerview/widget/x;->a:I

    .line 411
    .line 412
    if-le v14, v3, :cond_11

    .line 413
    .line 414
    iget v3, v11, Landroidx/recyclerview/widget/x;->c:I

    .line 415
    .line 416
    if-le v15, v3, :cond_11

    .line 417
    .line 418
    add-int/lit8 v3, v14, -0x1

    .line 419
    .line 420
    move/from16 v23, v5

    .line 421
    .line 422
    add-int/lit8 v5, v15, -0x1

    .line 423
    .line 424
    invoke-virtual {v1, v3, v5}, Landroidx/recyclerview/widget/c;->f(II)Z

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    if-eqz v3, :cond_12

    .line 429
    .line 430
    add-int/lit8 v14, v14, -0x1

    .line 431
    .line 432
    add-int/lit8 v15, v15, -0x1

    .line 433
    .line 434
    move/from16 v5, v23

    .line 435
    .line 436
    goto :goto_11

    .line 437
    :cond_11
    move/from16 v23, v5

    .line 438
    .line 439
    :cond_12
    add-int v5, v23, v21

    .line 440
    .line 441
    aput v14, v4, v5

    .line 442
    .line 443
    if-eqz v16, :cond_13

    .line 444
    .line 445
    sub-int v3, v19, v23

    .line 446
    .line 447
    if-lt v3, v13, :cond_13

    .line 448
    .line 449
    if-gt v3, v12, :cond_13

    .line 450
    .line 451
    add-int v3, v3, v21

    .line 452
    .line 453
    aget v3, v8, v3

    .line 454
    .line 455
    if-lt v3, v14, :cond_13

    .line 456
    .line 457
    new-instance v3, Landroidx/recyclerview/widget/y;

    .line 458
    .line 459
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 460
    .line 461
    .line 462
    iput v14, v3, Landroidx/recyclerview/widget/y;->a:I

    .line 463
    .line 464
    iput v15, v3, Landroidx/recyclerview/widget/y;->b:I

    .line 465
    .line 466
    iput v9, v3, Landroidx/recyclerview/widget/y;->c:I

    .line 467
    .line 468
    iput v2, v3, Landroidx/recyclerview/widget/y;->d:I

    .line 469
    .line 470
    const/4 v2, 0x1

    .line 471
    iput-boolean v2, v3, Landroidx/recyclerview/widget/y;->e:Z

    .line 472
    .line 473
    goto :goto_12

    .line 474
    :cond_13
    add-int/lit8 v5, v23, 0x2

    .line 475
    .line 476
    move/from16 v2, v16

    .line 477
    .line 478
    move/from16 v3, v19

    .line 479
    .line 480
    goto :goto_c

    .line 481
    :cond_14
    const/4 v3, 0x0

    .line 482
    :goto_12
    if-eqz v3, :cond_15

    .line 483
    .line 484
    move-object v13, v3

    .line 485
    goto :goto_14

    .line 486
    :cond_15
    add-int/lit8 v12, v12, 0x1

    .line 487
    .line 488
    move-object/from16 v2, v20

    .line 489
    .line 490
    move/from16 v9, v21

    .line 491
    .line 492
    move/from16 v14, v22

    .line 493
    .line 494
    const/4 v3, 0x0

    .line 495
    const/4 v5, 0x1

    .line 496
    goto/16 :goto_1

    .line 497
    .line 498
    :cond_16
    :goto_13
    move-object/from16 v20, v2

    .line 499
    .line 500
    move/from16 v21, v9

    .line 501
    .line 502
    const/4 v13, 0x0

    .line 503
    :goto_14
    if-eqz v13, :cond_1c

    .line 504
    .line 505
    invoke-virtual {v13}, Landroidx/recyclerview/widget/y;->a()I

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-lez v2, :cond_1a

    .line 510
    .line 511
    iget v2, v13, Landroidx/recyclerview/widget/y;->d:I

    .line 512
    .line 513
    iget v3, v13, Landroidx/recyclerview/widget/y;->b:I

    .line 514
    .line 515
    sub-int/2addr v2, v3

    .line 516
    iget v5, v13, Landroidx/recyclerview/widget/y;->c:I

    .line 517
    .line 518
    iget v9, v13, Landroidx/recyclerview/widget/y;->a:I

    .line 519
    .line 520
    sub-int/2addr v5, v9

    .line 521
    if-eq v2, v5, :cond_19

    .line 522
    .line 523
    iget-boolean v12, v13, Landroidx/recyclerview/widget/y;->e:Z

    .line 524
    .line 525
    if-eqz v12, :cond_17

    .line 526
    .line 527
    new-instance v2, Landroidx/recyclerview/widget/t;

    .line 528
    .line 529
    invoke-virtual {v13}, Landroidx/recyclerview/widget/y;->a()I

    .line 530
    .line 531
    .line 532
    move-result v5

    .line 533
    invoke-direct {v2, v9, v3, v5}, Landroidx/recyclerview/widget/t;-><init>(III)V

    .line 534
    .line 535
    .line 536
    goto :goto_15

    .line 537
    :cond_17
    if-le v2, v5, :cond_18

    .line 538
    .line 539
    new-instance v2, Landroidx/recyclerview/widget/t;

    .line 540
    .line 541
    add-int/lit8 v3, v3, 0x1

    .line 542
    .line 543
    invoke-virtual {v13}, Landroidx/recyclerview/widget/y;->a()I

    .line 544
    .line 545
    .line 546
    move-result v5

    .line 547
    invoke-direct {v2, v9, v3, v5}, Landroidx/recyclerview/widget/t;-><init>(III)V

    .line 548
    .line 549
    .line 550
    goto :goto_15

    .line 551
    :cond_18
    new-instance v2, Landroidx/recyclerview/widget/t;

    .line 552
    .line 553
    add-int/lit8 v9, v9, 0x1

    .line 554
    .line 555
    invoke-virtual {v13}, Landroidx/recyclerview/widget/y;->a()I

    .line 556
    .line 557
    .line 558
    move-result v5

    .line 559
    invoke-direct {v2, v9, v3, v5}, Landroidx/recyclerview/widget/t;-><init>(III)V

    .line 560
    .line 561
    .line 562
    goto :goto_15

    .line 563
    :cond_19
    new-instance v2, Landroidx/recyclerview/widget/t;

    .line 564
    .line 565
    invoke-direct {v2, v9, v3, v5}, Landroidx/recyclerview/widget/t;-><init>(III)V

    .line 566
    .line 567
    .line 568
    :goto_15
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    :cond_1a
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 572
    .line 573
    .line 574
    move-result v2

    .line 575
    if-eqz v2, :cond_1b

    .line 576
    .line 577
    new-instance v2, Landroidx/recyclerview/widget/x;

    .line 578
    .line 579
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 580
    .line 581
    .line 582
    const/16 v18, 0x1

    .line 583
    .line 584
    goto :goto_16

    .line 585
    :cond_1b
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    const/16 v18, 0x1

    .line 590
    .line 591
    add-int/lit8 v2, v2, -0x1

    .line 592
    .line 593
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    check-cast v2, Landroidx/recyclerview/widget/x;

    .line 598
    .line 599
    :goto_16
    iget v3, v11, Landroidx/recyclerview/widget/x;->a:I

    .line 600
    .line 601
    iput v3, v2, Landroidx/recyclerview/widget/x;->a:I

    .line 602
    .line 603
    iget v3, v11, Landroidx/recyclerview/widget/x;->c:I

    .line 604
    .line 605
    iput v3, v2, Landroidx/recyclerview/widget/x;->c:I

    .line 606
    .line 607
    iget v3, v13, Landroidx/recyclerview/widget/y;->a:I

    .line 608
    .line 609
    iput v3, v2, Landroidx/recyclerview/widget/x;->b:I

    .line 610
    .line 611
    iget v3, v13, Landroidx/recyclerview/widget/y;->b:I

    .line 612
    .line 613
    iput v3, v2, Landroidx/recyclerview/widget/x;->d:I

    .line 614
    .line 615
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    iget v2, v11, Landroidx/recyclerview/widget/x;->b:I

    .line 619
    .line 620
    iput v2, v11, Landroidx/recyclerview/widget/x;->b:I

    .line 621
    .line 622
    iget v2, v11, Landroidx/recyclerview/widget/x;->d:I

    .line 623
    .line 624
    iput v2, v11, Landroidx/recyclerview/widget/x;->d:I

    .line 625
    .line 626
    iget v2, v13, Landroidx/recyclerview/widget/y;->c:I

    .line 627
    .line 628
    iput v2, v11, Landroidx/recyclerview/widget/x;->a:I

    .line 629
    .line 630
    iget v2, v13, Landroidx/recyclerview/widget/y;->d:I

    .line 631
    .line 632
    iput v2, v11, Landroidx/recyclerview/widget/x;->c:I

    .line 633
    .line 634
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    goto :goto_17

    .line 638
    :cond_1c
    const/16 v18, 0x1

    .line 639
    .line 640
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    :goto_17
    move-object/from16 v2, v20

    .line 644
    .line 645
    move/from16 v9, v21

    .line 646
    .line 647
    const/4 v3, 0x0

    .line 648
    const/4 v5, 0x1

    .line 649
    goto/16 :goto_0

    .line 650
    .line 651
    :cond_1d
    move-object/from16 v20, v2

    .line 652
    .line 653
    sget-object v2, Landroidx/recyclerview/widget/d;->c:Landroidx/recyclerview/widget/s;

    .line 654
    .line 655
    invoke-static {v6, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 656
    .line 657
    .line 658
    new-instance v2, Landroidx/recyclerview/widget/u;

    .line 659
    .line 660
    invoke-direct {v2, v1, v6, v8, v4}, Landroidx/recyclerview/widget/u;-><init>(Landroidx/recyclerview/widget/c;Ljava/util/ArrayList;[I[I)V

    .line 661
    .line 662
    .line 663
    move-object/from16 v1, v20

    .line 664
    .line 665
    check-cast v1, Landroidx/recyclerview/widget/h;

    .line 666
    .line 667
    iget-object v1, v1, Landroidx/recyclerview/widget/h;->c:Landroidx/recyclerview/widget/g;

    .line 668
    .line 669
    new-instance v3, Landroidx/recyclerview/widget/e;

    .line 670
    .line 671
    const/4 v4, 0x0

    .line 672
    invoke-direct {v3, v4, v0, v2}, Landroidx/recyclerview/widget/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/g;->execute(Ljava/lang/Runnable;)V

    .line 676
    .line 677
    .line 678
    return-void

    .line 679
    :pswitch_0
    move-object/from16 v20, v2

    .line 680
    .line 681
    const/4 v4, 0x0

    .line 682
    const/4 v3, 0x0

    .line 683
    :goto_18
    iget v1, v0, Landroidx/fragment/app/b2;->i:I

    .line 684
    .line 685
    if-ge v3, v1, :cond_1e

    .line 686
    .line 687
    iget-object v1, v0, Landroidx/fragment/app/b2;->j:Ljava/util/List;

    .line 688
    .line 689
    check-cast v1, Ljava/util/ArrayList;

    .line 690
    .line 691
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    check-cast v1, Landroid/view/View;

    .line 696
    .line 697
    iget-object v2, v0, Landroidx/fragment/app/b2;->k:Ljava/util/List;

    .line 698
    .line 699
    check-cast v2, Ljava/util/ArrayList;

    .line 700
    .line 701
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    check-cast v2, Ljava/lang/String;

    .line 706
    .line 707
    sget-object v4, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 708
    .line 709
    invoke-static {v1, v2}, Lm0/k0;->v(Landroid/view/View;Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    iget-object v1, v0, Landroidx/fragment/app/b2;->l:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v1, Ljava/util/ArrayList;

    .line 715
    .line 716
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    check-cast v1, Landroid/view/View;

    .line 721
    .line 722
    move-object/from16 v2, v20

    .line 723
    .line 724
    check-cast v2, Ljava/util/ArrayList;

    .line 725
    .line 726
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    check-cast v2, Ljava/lang/String;

    .line 731
    .line 732
    invoke-static {v1, v2}, Lm0/k0;->v(Landroid/view/View;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    add-int/lit8 v3, v3, 0x1

    .line 736
    .line 737
    goto :goto_18

    .line 738
    :cond_1e
    return-void

    .line 739
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
