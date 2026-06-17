.class public abstract Lk6/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final a:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lk6/b;->a:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
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

.method public static final a(C)I
    .locals 3

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x3a

    .line 6
    .line 7
    if-ge p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-gt v0, p0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x67

    .line 16
    .line 17
    if-ge p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const/16 v0, 0x41

    .line 23
    .line 24
    if-gt v0, p0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x47

    .line 27
    .line 28
    if-ge p0, v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x37

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "Unexpected hex digit: "

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
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

.method public static final b(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;
    .locals 22

    .line 1
    sget-object v0, Lj6/z;->i:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "/"

    .line 4
    .line 5
    invoke-static {v0}, La1/d;->o(Ljava/lang/String;)Lj6/z;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v1, Lk6/h;

    .line 10
    .line 11
    const/16 v18, 0x0

    .line 12
    .line 13
    const v19, 0xfffc

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    const-wide/16 v7, 0x0

    .line 21
    .line 22
    const-wide/16 v9, 0x0

    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    const-wide/16 v12, 0x0

    .line 26
    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v17, 0x0

    .line 32
    .line 33
    invoke-direct/range {v1 .. v19}, Lk6/h;-><init>(Lj6/z;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lp4/f;

    .line 37
    .line 38
    invoke-direct {v0, v2, v1}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    new-array v2, v1, [Lp4/f;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    aput-object v0, v2, v3

    .line 46
    .line 47
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    invoke-static {v1}, Lq4/v;->U(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v2}, Lq4/v;->V(Ljava/util/LinkedHashMap;[Lp4/f;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Landroidx/recyclerview/widget/s;

    .line 60
    .line 61
    const/4 v2, 0x2

    .line 62
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/s;-><init>(I)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v2, p0

    .line 66
    .line 67
    invoke-static {v2, v1}, Lq4/i;->C0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Lk6/h;

    .line 86
    .line 87
    iget-object v3, v2, Lk6/h;->a:Lj6/z;

    .line 88
    .line 89
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Lk6/h;

    .line 94
    .line 95
    if-nez v3, :cond_0

    .line 96
    .line 97
    :goto_1
    iget-object v2, v2, Lk6/h;->a:Lj6/z;

    .line 98
    .line 99
    invoke-virtual {v2}, Lj6/z;->e()Lj6/z;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-nez v4, :cond_1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Lk6/h;

    .line 111
    .line 112
    if-eqz v3, :cond_2

    .line 113
    .line 114
    iget-object v3, v3, Lk6/h;->q:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_2
    new-instance v3, Lk6/h;

    .line 121
    .line 122
    const/16 v20, 0x0

    .line 123
    .line 124
    const v21, 0xfffc

    .line 125
    .line 126
    .line 127
    const/4 v5, 0x1

    .line 128
    const/4 v6, 0x0

    .line 129
    const-wide/16 v7, 0x0

    .line 130
    .line 131
    const-wide/16 v9, 0x0

    .line 132
    .line 133
    const-wide/16 v11, 0x0

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const-wide/16 v14, 0x0

    .line 137
    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    const/16 v18, 0x0

    .line 143
    .line 144
    const/16 v19, 0x0

    .line 145
    .line 146
    invoke-direct/range {v3 .. v21}, Lk6/h;-><init>(Lj6/z;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    iget-object v4, v3, Lk6/h;->q:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-object v2, v3

    .line 158
    goto :goto_1

    .line 159
    :cond_3
    return-object v0
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

.method public static final c(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, La/a;->k(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "toString(...)"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "0x"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
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

.method public static final d(Lj6/c0;)Lk6/h;
    .locals 25

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    invoke-virtual {v5}, Lj6/c0;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0x2014b50

    .line 8
    .line 9
    .line 10
    if-ne v0, v1, :cond_7

    .line 11
    .line 12
    const-wide/16 v0, 0x4

    .line 13
    .line 14
    invoke-virtual {v5, v0, v1}, Lj6/c0;->skip(J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v5}, Lj6/c0;->m()S

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v1, 0xffff

    .line 22
    .line 23
    .line 24
    and-int v2, v0, v1

    .line 25
    .line 26
    and-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    if-nez v0, :cond_6

    .line 29
    .line 30
    invoke-virtual {v5}, Lj6/c0;->m()S

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    and-int v12, v0, v1

    .line 35
    .line 36
    invoke-virtual {v5}, Lj6/c0;->m()S

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    and-int v16, v0, v1

    .line 41
    .line 42
    invoke-virtual {v5}, Lj6/c0;->m()S

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    and-int v15, v0, v1

    .line 47
    .line 48
    invoke-virtual {v5}, Lj6/c0;->c()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    int-to-long v2, v0

    .line 53
    const-wide v6, 0xffffffffL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    and-long v13, v2, v6

    .line 59
    .line 60
    move-wide v2, v6

    .line 61
    new-instance v6, Lkotlin/jvm/internal/n;

    .line 62
    .line 63
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5}, Lj6/c0;->c()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    int-to-long v7, v0

    .line 71
    and-long/2addr v7, v2

    .line 72
    iput-wide v7, v6, Lkotlin/jvm/internal/n;->h:J

    .line 73
    .line 74
    new-instance v4, Lkotlin/jvm/internal/n;

    .line 75
    .line 76
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Lj6/c0;->c()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    int-to-long v7, v0

    .line 84
    and-long/2addr v7, v2

    .line 85
    iput-wide v7, v4, Lkotlin/jvm/internal/n;->h:J

    .line 86
    .line 87
    invoke-virtual {v5}, Lj6/c0;->m()S

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    and-int/2addr v0, v1

    .line 92
    invoke-virtual {v5}, Lj6/c0;->m()S

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    and-int v11, v7, v1

    .line 97
    .line 98
    invoke-virtual {v5}, Lj6/c0;->m()S

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    and-int/2addr v1, v7

    .line 103
    const-wide/16 v7, 0x8

    .line 104
    .line 105
    invoke-virtual {v5, v7, v8}, Lj6/c0;->skip(J)V

    .line 106
    .line 107
    .line 108
    new-instance v7, Lkotlin/jvm/internal/n;

    .line 109
    .line 110
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Lj6/c0;->c()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    int-to-long v8, v8

    .line 118
    and-long/2addr v8, v2

    .line 119
    iput-wide v8, v7, Lkotlin/jvm/internal/n;->h:J

    .line 120
    .line 121
    int-to-long v8, v0

    .line 122
    invoke-virtual {v5, v8, v9}, Lj6/c0;->u(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const/4 v8, 0x0

    .line 127
    invoke-static {v0, v8}, Ll5/e;->k0(Ljava/lang/CharSequence;C)Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-nez v9, :cond_5

    .line 132
    .line 133
    iget-wide v9, v4, Lkotlin/jvm/internal/n;->h:J

    .line 134
    .line 135
    const-wide/16 v17, 0x0

    .line 136
    .line 137
    move-wide/from16 v19, v2

    .line 138
    .line 139
    const/16 v2, 0x8

    .line 140
    .line 141
    cmp-long v3, v9, v19

    .line 142
    .line 143
    if-nez v3, :cond_0

    .line 144
    .line 145
    int-to-long v9, v2

    .line 146
    move-wide/from16 v21, v9

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_0
    move-wide/from16 v21, v17

    .line 150
    .line 151
    :goto_0
    iget-wide v8, v6, Lkotlin/jvm/internal/n;->h:J

    .line 152
    .line 153
    cmp-long v10, v8, v19

    .line 154
    .line 155
    if-nez v10, :cond_1

    .line 156
    .line 157
    int-to-long v8, v2

    .line 158
    add-long v8, v21, v8

    .line 159
    .line 160
    move-wide v9, v8

    .line 161
    :goto_1
    move-object v8, v4

    .line 162
    goto :goto_2

    .line 163
    :cond_1
    move-wide/from16 v9, v21

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :goto_2
    iget-wide v3, v7, Lkotlin/jvm/internal/n;->h:J

    .line 167
    .line 168
    cmp-long v22, v3, v19

    .line 169
    .line 170
    if-nez v22, :cond_2

    .line 171
    .line 172
    int-to-long v2, v2

    .line 173
    add-long/2addr v9, v2

    .line 174
    :cond_2
    move-object v4, v8

    .line 175
    move-wide v2, v9

    .line 176
    new-instance v8, Lkotlin/jvm/internal/o;

    .line 177
    .line 178
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 179
    .line 180
    .line 181
    new-instance v9, Lkotlin/jvm/internal/o;

    .line 182
    .line 183
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    new-instance v10, Lkotlin/jvm/internal/o;

    .line 187
    .line 188
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 189
    .line 190
    .line 191
    move/from16 v19, v1

    .line 192
    .line 193
    new-instance v1, Lkotlin/jvm/internal/m;

    .line 194
    .line 195
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 196
    .line 197
    .line 198
    move-object/from16 v20, v0

    .line 199
    .line 200
    new-instance v0, Lk6/j;

    .line 201
    .line 202
    move/from16 v22, v12

    .line 203
    .line 204
    move/from16 v12, v19

    .line 205
    .line 206
    move-wide/from16 v23, v13

    .line 207
    .line 208
    move-object/from16 v13, v20

    .line 209
    .line 210
    move-wide/from16 v19, v23

    .line 211
    .line 212
    const/4 v14, 0x0

    .line 213
    invoke-direct/range {v0 .. v10}, Lk6/j;-><init>(Lkotlin/jvm/internal/m;JLkotlin/jvm/internal/n;Lj6/c0;Lkotlin/jvm/internal/n;Lkotlin/jvm/internal/n;Lkotlin/jvm/internal/o;Lkotlin/jvm/internal/o;Lkotlin/jvm/internal/o;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v5, v11, v0}, Lk6/b;->e(Lj6/c0;ILd5/p;)V

    .line 217
    .line 218
    .line 219
    cmp-long v0, v2, v17

    .line 220
    .line 221
    if-lez v0, :cond_4

    .line 222
    .line 223
    iget-boolean v0, v1, Lkotlin/jvm/internal/m;->h:Z

    .line 224
    .line 225
    if-eqz v0, :cond_3

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 229
    .line 230
    const-string v1, "bad zip: zip64 extra required but absent"

    .line 231
    .line 232
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_4
    :goto_3
    int-to-long v0, v12

    .line 237
    invoke-virtual {v5, v0, v1}, Lj6/c0;->u(J)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    sget-object v0, Lj6/z;->i:Ljava/lang/String;

    .line 242
    .line 243
    const-string v0, "/"

    .line 244
    .line 245
    invoke-static {v0}, La1/d;->o(Ljava/lang/String;)Lj6/z;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v1, v13}, Lj6/z;->g(Ljava/lang/String;)Lj6/z;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-static {v13, v0, v14}, Ll5/m;->e0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    new-instance v2, Lk6/h;

    .line 258
    .line 259
    iget-wide v11, v6, Lkotlin/jvm/internal/n;->h:J

    .line 260
    .line 261
    iget-wide v13, v4, Lkotlin/jvm/internal/n;->h:J

    .line 262
    .line 263
    iget-wide v6, v7, Lkotlin/jvm/internal/n;->h:J

    .line 264
    .line 265
    iget-object v1, v8, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 266
    .line 267
    move-object/from16 v17, v1

    .line 268
    .line 269
    check-cast v17, Ljava/lang/Long;

    .line 270
    .line 271
    iget-object v1, v9, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 272
    .line 273
    move-object/from16 v18, v1

    .line 274
    .line 275
    check-cast v18, Ljava/lang/Long;

    .line 276
    .line 277
    iget-object v1, v10, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v1, Ljava/lang/Long;

    .line 280
    .line 281
    move-wide v8, v11

    .line 282
    move-wide v10, v13

    .line 283
    move-wide v13, v6

    .line 284
    move-wide/from16 v6, v19

    .line 285
    .line 286
    const v20, 0xe000

    .line 287
    .line 288
    .line 289
    move v4, v0

    .line 290
    move-object/from16 v19, v1

    .line 291
    .line 292
    move/from16 v12, v22

    .line 293
    .line 294
    invoke-direct/range {v2 .. v20}, Lk6/h;-><init>(Lj6/z;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 295
    .line 296
    .line 297
    return-object v2

    .line 298
    :cond_5
    new-instance v0, Ljava/io/IOException;

    .line 299
    .line 300
    const-string v1, "bad zip: filename contains 0x00"

    .line 301
    .line 302
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v0

    .line 306
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 307
    .line 308
    new-instance v1, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    const-string v3, "unsupported zip: general purpose bit flag="

    .line 311
    .line 312
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-static {v2}, Lk6/b;->c(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw v0

    .line 330
    :cond_7
    new-instance v2, Ljava/io/IOException;

    .line 331
    .line 332
    new-instance v3, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    const-string v4, "bad zip: expected "

    .line 335
    .line 336
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-static {v1}, Lk6/b;->c(I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v1, " but was "

    .line 347
    .line 348
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-static {v0}, Lk6/b;->c(I)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    throw v2
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

.method public static final e(Lj6/c0;ILd5/p;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lj6/c0;->i:Lj6/i;

    .line 2
    .line 3
    int-to-long v1, p1

    .line 4
    :goto_0
    const-wide/16 v3, 0x0

    .line 5
    .line 6
    cmp-long p1, v1, v3

    .line 7
    .line 8
    if-eqz p1, :cond_4

    .line 9
    .line 10
    const-wide/16 v5, 0x4

    .line 11
    .line 12
    cmp-long p1, v1, v5

    .line 13
    .line 14
    if-ltz p1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0}, Lj6/c0;->m()S

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const v5, 0xffff

    .line 21
    .line 22
    .line 23
    and-int/2addr p1, v5

    .line 24
    invoke-virtual {p0}, Lj6/c0;->m()S

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    int-to-long v5, v5

    .line 29
    const-wide/32 v7, 0xffff

    .line 30
    .line 31
    .line 32
    and-long/2addr v5, v7

    .line 33
    const/4 v7, 0x4

    .line 34
    int-to-long v7, v7

    .line 35
    sub-long/2addr v1, v7

    .line 36
    cmp-long v7, v1, v5

    .line 37
    .line 38
    if-ltz v7, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v5, v6}, Lj6/c0;->j0(J)V

    .line 41
    .line 42
    .line 43
    iget-wide v7, v0, Lj6/i;->i:J

    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    invoke-interface {p2, v9, v10}, Ld5/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget-wide v9, v0, Lj6/i;->i:J

    .line 57
    .line 58
    add-long/2addr v9, v5

    .line 59
    sub-long/2addr v9, v7

    .line 60
    cmp-long v7, v9, v3

    .line 61
    .line 62
    if-ltz v7, :cond_1

    .line 63
    .line 64
    if-lez v7, :cond_0

    .line 65
    .line 66
    invoke-virtual {v0, v9, v10}, Lj6/i;->skip(J)V

    .line 67
    .line 68
    .line 69
    :cond_0
    sub-long/2addr v1, v5

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    new-instance p0, Ljava/io/IOException;

    .line 72
    .line 73
    const-string p2, "unsupported zip: too many bytes processed for "

    .line 74
    .line 75
    invoke-static {p1, p2}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :cond_2
    new-instance p0, Ljava/io/IOException;

    .line 84
    .line 85
    const-string p1, "bad zip: truncated value in extra field"

    .line 86
    .line 87
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p0

    .line 91
    :cond_3
    new-instance p0, Ljava/io/IOException;

    .line 92
    .line 93
    const-string p1, "bad zip: truncated header in extra field"

    .line 94
    .line 95
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p0

    .line 99
    :cond_4
    return-void
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

.method public static final f(Lj6/c0;Lk6/h;)Lk6/h;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lj6/c0;->c()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const v3, 0x4034b50

    .line 10
    .line 11
    .line 12
    if-ne v2, v3, :cond_2

    .line 13
    .line 14
    const-wide/16 v2, 0x2

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3}, Lj6/c0;->skip(J)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lj6/c0;->m()S

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const v3, 0xffff

    .line 24
    .line 25
    .line 26
    and-int v4, v2, v3

    .line 27
    .line 28
    and-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    const-wide/16 v4, 0x12

    .line 33
    .line 34
    invoke-virtual {v0, v4, v5}, Lj6/c0;->skip(J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lj6/c0;->m()S

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    int-to-long v4, v2

    .line 42
    const-wide/32 v6, 0xffff

    .line 43
    .line 44
    .line 45
    and-long/2addr v4, v6

    .line 46
    invoke-virtual {v0}, Lj6/c0;->m()S

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    and-int/2addr v2, v3

    .line 51
    invoke-virtual {v0, v4, v5}, Lj6/c0;->skip(J)V

    .line 52
    .line 53
    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    int-to-long v1, v2

    .line 57
    invoke-virtual {v0, v1, v2}, Lj6/c0;->skip(J)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    return-object v0

    .line 62
    :cond_0
    new-instance v3, Lkotlin/jvm/internal/o;

    .line 63
    .line 64
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v4, Lkotlin/jvm/internal/o;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v5, Lkotlin/jvm/internal/o;

    .line 73
    .line 74
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance v6, Lk6/i;

    .line 78
    .line 79
    invoke-direct {v6, v0, v3, v4, v5}, Lk6/i;-><init>(Lj6/c0;Lkotlin/jvm/internal/o;Lkotlin/jvm/internal/o;Lkotlin/jvm/internal/o;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v2, v6}, Lk6/b;->e(Lj6/c0;ILd5/p;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, v3, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 86
    .line 87
    move-object/from16 v24, v0

    .line 88
    .line 89
    check-cast v24, Ljava/lang/Integer;

    .line 90
    .line 91
    iget-object v0, v4, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 92
    .line 93
    move-object/from16 v25, v0

    .line 94
    .line 95
    check-cast v25, Ljava/lang/Integer;

    .line 96
    .line 97
    iget-object v0, v5, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 98
    .line 99
    move-object/from16 v26, v0

    .line 100
    .line 101
    check-cast v26, Ljava/lang/Integer;

    .line 102
    .line 103
    new-instance v6, Lk6/h;

    .line 104
    .line 105
    iget-object v7, v1, Lk6/h;->a:Lj6/z;

    .line 106
    .line 107
    iget-boolean v8, v1, Lk6/h;->b:Z

    .line 108
    .line 109
    iget-object v9, v1, Lk6/h;->c:Ljava/lang/String;

    .line 110
    .line 111
    iget-wide v10, v1, Lk6/h;->d:J

    .line 112
    .line 113
    iget-wide v12, v1, Lk6/h;->e:J

    .line 114
    .line 115
    iget-wide v14, v1, Lk6/h;->f:J

    .line 116
    .line 117
    iget v0, v1, Lk6/h;->g:I

    .line 118
    .line 119
    iget-wide v2, v1, Lk6/h;->h:J

    .line 120
    .line 121
    iget v4, v1, Lk6/h;->i:I

    .line 122
    .line 123
    iget v5, v1, Lk6/h;->j:I

    .line 124
    .line 125
    move/from16 v16, v0

    .line 126
    .line 127
    iget-object v0, v1, Lk6/h;->k:Ljava/lang/Long;

    .line 128
    .line 129
    move-object/from16 v21, v0

    .line 130
    .line 131
    iget-object v0, v1, Lk6/h;->l:Ljava/lang/Long;

    .line 132
    .line 133
    iget-object v1, v1, Lk6/h;->m:Ljava/lang/Long;

    .line 134
    .line 135
    move-object/from16 v22, v0

    .line 136
    .line 137
    move-object/from16 v23, v1

    .line 138
    .line 139
    move-wide/from16 v17, v2

    .line 140
    .line 141
    move/from16 v19, v4

    .line 142
    .line 143
    move/from16 v20, v5

    .line 144
    .line 145
    invoke-direct/range {v6 .. v26}, Lk6/h;-><init>(Lj6/z;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 146
    .line 147
    .line 148
    return-object v6

    .line 149
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 150
    .line 151
    new-instance v1, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v2, "unsupported zip: general purpose bit flag="

    .line 154
    .line 155
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v4}, Lk6/b;->c(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v0

    .line 173
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 174
    .line 175
    new-instance v1, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v4, "bad zip: expected "

    .line 178
    .line 179
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v3}, Lk6/b;->c(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v3, " but was "

    .line 190
    .line 191
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-static {v2}, Lk6/b;->c(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v0
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

.method public static final g(Lj6/f0;I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lj6/f0;->m:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget-object p0, p0, Lj6/f0;->l:[[B

    .line 6
    .line 7
    array-length p0, p0

    .line 8
    const-string v1, "<this>"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 p0, p0, -0x1

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-gt v1, p0, :cond_1

    .line 17
    .line 18
    add-int v2, v1, p0

    .line 19
    .line 20
    ushr-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    aget v3, v0, v2

    .line 23
    .line 24
    if-ge v3, p1, :cond_0

    .line 25
    .line 26
    add-int/lit8 v1, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-le v3, p1, :cond_2

    .line 30
    .line 31
    add-int/lit8 p0, v2, -0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    neg-int p0, v1

    .line 35
    add-int/lit8 v2, p0, -0x1

    .line 36
    .line 37
    :cond_2
    if-ltz v2, :cond_3

    .line 38
    .line 39
    return v2

    .line 40
    :cond_3
    not-int p0, v2

    .line 41
    return p0
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
