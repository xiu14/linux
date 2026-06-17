.class public final Lg2/v;
.super Lg2/z;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public a:J

.field public b:Z

.field public c:Z

.field public d:Lz0/f;

.field public final e:Lb6/i;

.field public f:Landroidx/fragment/app/m;

.field public final synthetic g:Lg2/e0;


# direct methods
.method public constructor <init>(Lg2/e0;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/v;->g:Lg2/e0;

    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, Lg2/v;->a:J

    .line 9
    .line 10
    new-instance p1, Lb6/i;

    .line 11
    .line 12
    invoke-direct {p1}, Lb6/i;-><init>()V

    .line 13
    .line 14
    .line 15
    const/16 v0, 0x14

    .line 16
    .line 17
    new-array v1, v0, [J

    .line 18
    .line 19
    iput-object v1, p1, Lb6/i;->c:Ljava/lang/Object;

    .line 20
    .line 21
    new-array v0, v0, [F

    .line 22
    .line 23
    iput-object v0, p1, Lb6/i;->d:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, p1, Lb6/i;->b:I

    .line 27
    .line 28
    const-wide/high16 v2, -0x8000000000000000L

    .line 29
    .line 30
    invoke-static {v1, v2, v3}, Ljava/util/Arrays;->fill([JJ)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lg2/v;->e:Lb6/i;

    .line 34
    .line 35
    return-void
    .line 36
    .line 37
.end method


# virtual methods
.method public final e(Lg2/y;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lg2/v;->c:Z

    .line 3
    .line 4
    return-void
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

.method public final h()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lg2/v;->d:Lz0/f;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_6

    .line 8
    .line 9
    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-wide v3, v0, Lg2/v;->a:J

    .line 14
    .line 15
    long-to-float v3, v3

    .line 16
    iget-object v4, v0, Lg2/v;->e:Lb6/i;

    .line 17
    .line 18
    iget v5, v4, Lb6/i;->b:I

    .line 19
    .line 20
    iget-object v6, v4, Lb6/i;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v6, [F

    .line 23
    .line 24
    iget-object v7, v4, Lb6/i;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v7, [J

    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    add-int/2addr v5, v8

    .line 30
    const/16 v9, 0x14

    .line 31
    .line 32
    rem-int/2addr v5, v9

    .line 33
    iput v5, v4, Lb6/i;->b:I

    .line 34
    .line 35
    aput-wide v1, v7, v5

    .line 36
    .line 37
    aput v3, v6, v5

    .line 38
    .line 39
    new-instance v1, Lz0/f;

    .line 40
    .line 41
    new-instance v2, Lz0/e;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    iput v3, v2, Lz0/e;->a:F

    .line 48
    .line 49
    invoke-direct {v1, v2}, Lz0/f;-><init>(Lz0/e;)V

    .line 50
    .line 51
    .line 52
    iput-object v1, v0, Lg2/v;->d:Lz0/f;

    .line 53
    .line 54
    new-instance v1, Lz0/g;

    .line 55
    .line 56
    invoke-direct {v1}, Lz0/g;-><init>()V

    .line 57
    .line 58
    .line 59
    const/high16 v2, 0x3f800000    # 1.0f

    .line 60
    .line 61
    float-to-double v10, v2

    .line 62
    iput-wide v10, v1, Lz0/g;->b:D

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    iput-boolean v2, v1, Lz0/g;->c:Z

    .line 66
    .line 67
    const/high16 v5, 0x43480000    # 200.0f

    .line 68
    .line 69
    float-to-double v10, v5

    .line 70
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 71
    .line 72
    .line 73
    move-result-wide v10

    .line 74
    iput-wide v10, v1, Lz0/g;->a:D

    .line 75
    .line 76
    iput-boolean v2, v1, Lz0/g;->c:Z

    .line 77
    .line 78
    iget-object v5, v0, Lg2/v;->d:Lz0/f;

    .line 79
    .line 80
    iput-object v1, v5, Lz0/f;->l:Lz0/g;

    .line 81
    .line 82
    iget-wide v10, v0, Lg2/v;->a:J

    .line 83
    .line 84
    long-to-float v1, v10

    .line 85
    iput v1, v5, Lz0/f;->b:F

    .line 86
    .line 87
    iput-boolean v8, v5, Lz0/f;->c:Z

    .line 88
    .line 89
    iget-object v1, v5, Lz0/f;->k:Ljava/util/ArrayList;

    .line 90
    .line 91
    iget-boolean v5, v5, Lz0/f;->e:Z

    .line 92
    .line 93
    if-nez v5, :cond_10

    .line 94
    .line 95
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-nez v5, :cond_1

    .line 100
    .line 101
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    :cond_1
    iget-object v1, v0, Lg2/v;->d:Lz0/f;

    .line 105
    .line 106
    iget v5, v4, Lb6/i;->b:I

    .line 107
    .line 108
    const-wide/high16 v10, -0x8000000000000000L

    .line 109
    .line 110
    if-nez v5, :cond_2

    .line 111
    .line 112
    aget-wide v12, v7, v5

    .line 113
    .line 114
    cmp-long v14, v12, v10

    .line 115
    .line 116
    if-nez v14, :cond_2

    .line 117
    .line 118
    goto/16 :goto_5

    .line 119
    .line 120
    :cond_2
    aget-wide v12, v7, v5

    .line 121
    .line 122
    move-wide v14, v12

    .line 123
    :goto_0
    aget-wide v16, v7, v5

    .line 124
    .line 125
    cmp-long v18, v16, v10

    .line 126
    .line 127
    if-nez v18, :cond_3

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    sub-long v10, v12, v16

    .line 131
    .line 132
    long-to-float v10, v10

    .line 133
    sub-long v14, v16, v14

    .line 134
    .line 135
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v14

    .line 139
    long-to-float v11, v14

    .line 140
    const/high16 v14, 0x42c80000    # 100.0f

    .line 141
    .line 142
    cmpl-float v10, v10, v14

    .line 143
    .line 144
    if-gtz v10, :cond_7

    .line 145
    .line 146
    const/high16 v10, 0x42200000    # 40.0f

    .line 147
    .line 148
    cmpl-float v10, v11, v10

    .line 149
    .line 150
    if-lez v10, :cond_4

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    if-nez v5, :cond_5

    .line 154
    .line 155
    const/16 v5, 0x14

    .line 156
    .line 157
    :cond_5
    sub-int/2addr v5, v8

    .line 158
    add-int/lit8 v2, v2, 0x1

    .line 159
    .line 160
    if-lt v2, v9, :cond_6

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_6
    move-wide/from16 v14, v16

    .line 164
    .line 165
    const-wide/high16 v10, -0x8000000000000000L

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_7
    :goto_1
    const/4 v5, 0x2

    .line 169
    if-ge v2, v5, :cond_8

    .line 170
    .line 171
    goto/16 :goto_5

    .line 172
    .line 173
    :cond_8
    const/high16 v10, 0x447a0000    # 1000.0f

    .line 174
    .line 175
    if-ne v2, v5, :cond_b

    .line 176
    .line 177
    iget v2, v4, Lb6/i;->b:I

    .line 178
    .line 179
    if-nez v2, :cond_9

    .line 180
    .line 181
    const/16 v4, 0x13

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_9
    add-int/lit8 v4, v2, -0x1

    .line 185
    .line 186
    :goto_2
    aget-wide v8, v7, v2

    .line 187
    .line 188
    aget-wide v11, v7, v4

    .line 189
    .line 190
    sub-long/2addr v8, v11

    .line 191
    long-to-float v5, v8

    .line 192
    cmpl-float v7, v5, v3

    .line 193
    .line 194
    if-nez v7, :cond_a

    .line 195
    .line 196
    goto/16 :goto_5

    .line 197
    .line 198
    :cond_a
    aget v2, v6, v2

    .line 199
    .line 200
    aget v3, v6, v4

    .line 201
    .line 202
    sub-float/2addr v2, v3

    .line 203
    div-float/2addr v2, v5

    .line 204
    mul-float v3, v2, v10

    .line 205
    .line 206
    goto/16 :goto_5

    .line 207
    .line 208
    :cond_b
    iget v4, v4, Lb6/i;->b:I

    .line 209
    .line 210
    sub-int v2, v4, v2

    .line 211
    .line 212
    add-int/lit8 v2, v2, 0x15

    .line 213
    .line 214
    rem-int/2addr v2, v9

    .line 215
    add-int/lit8 v4, v4, 0x15

    .line 216
    .line 217
    rem-int/2addr v4, v9

    .line 218
    aget-wide v11, v7, v2

    .line 219
    .line 220
    aget v5, v6, v2

    .line 221
    .line 222
    add-int/2addr v2, v8

    .line 223
    rem-int/lit8 v8, v2, 0x14

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    :goto_3
    const/high16 v14, 0x40000000    # 2.0f

    .line 227
    .line 228
    if-eq v8, v4, :cond_e

    .line 229
    .line 230
    aget-wide v15, v7, v8

    .line 231
    .line 232
    move/from16 v18, v4

    .line 233
    .line 234
    const/16 v17, 0x0

    .line 235
    .line 236
    sub-long v3, v15, v11

    .line 237
    .line 238
    long-to-float v3, v3

    .line 239
    cmpl-float v4, v3, v17

    .line 240
    .line 241
    if-nez v4, :cond_c

    .line 242
    .line 243
    const/16 v19, 0x14

    .line 244
    .line 245
    const/high16 v20, 0x447a0000    # 1000.0f

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_c
    aget v4, v6, v8

    .line 249
    .line 250
    invoke-static {v13}, Ljava/lang/Math;->signum(F)F

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    float-to-double v11, v11

    .line 255
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 256
    .line 257
    .line 258
    move-result v19

    .line 259
    mul-float v14, v14, v19

    .line 260
    .line 261
    const/16 v19, 0x14

    .line 262
    .line 263
    const/high16 v20, 0x447a0000    # 1000.0f

    .line 264
    .line 265
    float-to-double v9, v14

    .line 266
    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    .line 267
    .line 268
    .line 269
    move-result-wide v9

    .line 270
    mul-double v9, v9, v11

    .line 271
    .line 272
    double-to-float v9, v9

    .line 273
    sub-float v5, v4, v5

    .line 274
    .line 275
    div-float/2addr v5, v3

    .line 276
    sub-float v3, v5, v9

    .line 277
    .line 278
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    mul-float v5, v5, v3

    .line 283
    .line 284
    add-float/2addr v5, v13

    .line 285
    if-ne v8, v2, :cond_d

    .line 286
    .line 287
    const/high16 v3, 0x3f000000    # 0.5f

    .line 288
    .line 289
    mul-float v5, v5, v3

    .line 290
    .line 291
    :cond_d
    move v13, v5

    .line 292
    move v5, v4

    .line 293
    move-wide v11, v15

    .line 294
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 295
    .line 296
    rem-int/lit8 v8, v8, 0x14

    .line 297
    .line 298
    move/from16 v4, v18

    .line 299
    .line 300
    const/4 v3, 0x0

    .line 301
    const/16 v9, 0x14

    .line 302
    .line 303
    const/high16 v10, 0x447a0000    # 1000.0f

    .line 304
    .line 305
    goto :goto_3

    .line 306
    :cond_e
    const/high16 v20, 0x447a0000    # 1000.0f

    .line 307
    .line 308
    invoke-static {v13}, Ljava/lang/Math;->signum(F)F

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    float-to-double v2, v2

    .line 313
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    mul-float v4, v4, v14

    .line 318
    .line 319
    float-to-double v4, v4

    .line 320
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 321
    .line 322
    .line 323
    move-result-wide v4

    .line 324
    mul-double v4, v4, v2

    .line 325
    .line 326
    double-to-float v2, v4

    .line 327
    mul-float v3, v2, v20

    .line 328
    .line 329
    :goto_5
    iput v3, v1, Lz0/f;->a:F

    .line 330
    .line 331
    iget-object v1, v0, Lg2/v;->d:Lz0/f;

    .line 332
    .line 333
    iget-object v2, v0, Lg2/v;->g:Lg2/e0;

    .line 334
    .line 335
    iget-wide v2, v2, Lg2/y;->E:J

    .line 336
    .line 337
    const-wide/16 v4, 0x1

    .line 338
    .line 339
    add-long/2addr v2, v4

    .line 340
    long-to-float v2, v2

    .line 341
    iput v2, v1, Lz0/f;->f:F

    .line 342
    .line 343
    const/high16 v2, -0x40800000    # -1.0f

    .line 344
    .line 345
    iput v2, v1, Lz0/f;->g:F

    .line 346
    .line 347
    const/high16 v2, 0x40800000    # 4.0f

    .line 348
    .line 349
    iput v2, v1, Lz0/f;->i:F

    .line 350
    .line 351
    new-instance v2, Lg2/u;

    .line 352
    .line 353
    invoke-direct {v2, v0}, Lg2/u;-><init>(Lg2/v;)V

    .line 354
    .line 355
    .line 356
    iget-object v1, v1, Lz0/f;->j:Ljava/util/ArrayList;

    .line 357
    .line 358
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-nez v3, :cond_f

    .line 363
    .line 364
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    :cond_f
    :goto_6
    return-void

    .line 368
    :cond_10
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 369
    .line 370
    const-string v2, "Error: Update listeners must be added beforethe animation."

    .line 371
    .line 372
    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    throw v1
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
