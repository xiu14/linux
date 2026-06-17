.class public Ldev/jahir/frames/ui/activities/AboutActivity;
.super Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldev/jahir/frames/ui/activities/base/BaseThemedActivity<",
        "Ldev/jahir/frames/data/Preferences;",
        ">;"
    }
.end annotation


# instance fields
.field private final dashboardName:Ljava/lang/String;

.field private final preferences$delegate:Lp4/c;

.field private final recyclerView$delegate:Lp4/c;

.field private final toolbar$delegate:Lp4/c;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La2/e;

    .line 5
    .line 6
    const/16 v1, 0xb

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, La2/e;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/AboutActivity;->preferences$delegate:Lp4/c;

    .line 16
    .line 17
    sget v0, Ldev/jahir/frames/R$id;->toolbar:I

    .line 18
    .line 19
    new-instance v1, Ldev/jahir/frames/ui/activities/AboutActivity$special$$inlined$findView$default$1;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, p0, v0, v2}, Ldev/jahir/frames/ui/activities/AboutActivity$special$$inlined$findView$default$1;-><init>(Landroid/app/Activity;IZ)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/AboutActivity;->toolbar$delegate:Lp4/c;

    .line 30
    .line 31
    sget v0, Ldev/jahir/frames/R$id;->recycler_view:I

    .line 32
    .line 33
    new-instance v1, Ldev/jahir/frames/ui/activities/AboutActivity$special$$inlined$findView$default$2;

    .line 34
    .line 35
    invoke-direct {v1, p0, v0, v2}, Ldev/jahir/frames/ui/activities/AboutActivity$special$$inlined$findView$default$2;-><init>(Landroid/app/Activity;IZ)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/AboutActivity;->recyclerView$delegate:Lp4/c;

    .line 43
    .line 44
    const-string v0, "Frames"

    .line 45
    .line 46
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/AboutActivity;->dashboardName:Ljava/lang/String;

    .line 47
    .line 48
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public static synthetic f(Ldev/jahir/frames/ui/activities/AboutActivity;)Ldev/jahir/frames/data/Preferences;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/ui/activities/AboutActivity;->preferences_delegate$lambda$0(Ldev/jahir/frames/ui/activities/AboutActivity;)Ldev/jahir/frames/data/Preferences;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private final getDesignerAboutItems()Ljava/util/ArrayList;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/frames/data/models/AboutItem;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    sget v2, Ldev/jahir/frames/R$array;->credits_titles:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x2

    .line 12
    invoke-static {v0, v2, v3, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->stringArray$default(Landroid/content/Context;I[Ljava/lang/String;ILjava/lang/Object;)[Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget v5, Ldev/jahir/frames/R$array;->credits_descriptions:I

    .line 17
    .line 18
    invoke-static {v0, v5, v3, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->stringArray$default(Landroid/content/Context;I[Ljava/lang/String;ILjava/lang/Object;)[Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    sget v6, Ldev/jahir/frames/R$array;->credits_photos:I

    .line 23
    .line 24
    invoke-static {v0, v6, v3, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->stringArray$default(Landroid/content/Context;I[Ljava/lang/String;ILjava/lang/Object;)[Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    sget v7, Ldev/jahir/frames/R$array;->credits_buttons:I

    .line 29
    .line 30
    invoke-static {v0, v7, v3, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->stringArray$default(Landroid/content/Context;I[Ljava/lang/String;ILjava/lang/Object;)[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    sget v8, Ldev/jahir/frames/R$array;->credits_links:I

    .line 35
    .line 36
    invoke-static {v0, v8, v3, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->stringArray$default(Landroid/content/Context;I[Ljava/lang/String;ILjava/lang/Object;)[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    array-length v8, v2

    .line 41
    array-length v9, v5

    .line 42
    array-length v10, v6

    .line 43
    array-length v11, v7

    .line 44
    array-length v12, v4

    .line 45
    if-ne v8, v9, :cond_2

    .line 46
    .line 47
    if-ne v8, v10, :cond_2

    .line 48
    .line 49
    if-ne v8, v11, :cond_2

    .line 50
    .line 51
    if-ne v8, v12, :cond_2

    .line 52
    .line 53
    array-length v8, v2

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x0

    .line 56
    :goto_0
    if-ge v10, v8, :cond_2

    .line 57
    .line 58
    aget-object v12, v2, v10

    .line 59
    .line 60
    add-int/lit8 v13, v11, 0x1

    .line 61
    .line 62
    aget-object v14, v7, v11

    .line 63
    .line 64
    const-string v15, "|"

    .line 65
    .line 66
    move-object/from16 v16, v3

    .line 67
    .line 68
    filled-new-array {v15}, [Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v14, v3}, Ll5/e;->B0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    aget-object v14, v4, v11

    .line 77
    .line 78
    filled-new-array {v15}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v15

    .line 82
    invoke-static {v14, v15}, Ll5/e;->B0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v14

    .line 86
    new-instance v15, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-ne v9, v0, :cond_1

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const/4 v3, 0x0

    .line 106
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-eqz v9, :cond_1

    .line 111
    .line 112
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    add-int/lit8 v17, v3, 0x1

    .line 117
    .line 118
    if-ltz v3, :cond_0

    .line 119
    .line 120
    check-cast v9, Ljava/lang/String;

    .line 121
    .line 122
    move-object/from16 v18, v0

    .line 123
    .line 124
    new-instance v0, Lp4/f;

    .line 125
    .line 126
    invoke-interface {v14, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-direct {v0, v9, v3}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move/from16 v3, v17

    .line 137
    .line 138
    move-object/from16 v0, v18

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_0
    invoke-static {}, Lq4/j;->i0()V

    .line 142
    .line 143
    .line 144
    throw v16

    .line 145
    :cond_1
    new-instance v0, Ldev/jahir/frames/data/models/AboutItem;

    .line 146
    .line 147
    aget-object v3, v5, v11

    .line 148
    .line 149
    aget-object v9, v6, v11

    .line 150
    .line 151
    invoke-direct {v0, v12, v3, v9, v15}, Ldev/jahir/frames/data/models/AboutItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    add-int/lit8 v10, v10, 0x1

    .line 158
    .line 159
    move-object/from16 v0, p0

    .line 160
    .line 161
    move v11, v13

    .line 162
    move-object/from16 v3, v16

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_2
    return-object v1
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

.method private final getInternalAboutItems()Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/frames/data/models/AboutItem;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/AboutActivity;->getAdditionalInternalAboutItems()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ldev/jahir/frames/data/models/AboutItem;

    .line 6
    .line 7
    sget v2, Ldev/jahir/frames/R$string;->jahir_description:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x2

    .line 11
    invoke-static {p0, v2, v3, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v5, Lp4/f;

    .line 16
    .line 17
    const-string v6, "Website"

    .line 18
    .line 19
    const-string v7, "https://jahir.dev"

    .line 20
    .line 21
    invoke-direct {v5, v6, v7}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v7, Lp4/f;

    .line 25
    .line 26
    const-string v8, "GitHub"

    .line 27
    .line 28
    const-string v9, "https://github.com/jahirfiquitiva"

    .line 29
    .line 30
    invoke-direct {v7, v8, v9}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-array v8, v4, [Lp4/f;

    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    aput-object v5, v8, v9

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    aput-object v7, v8, v5

    .line 40
    .line 41
    invoke-static {v8}, Lq4/j;->d0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    const-string v8, "Jahir Fiquitiva"

    .line 46
    .line 47
    const-string v10, "https://jahir.dev/static/images/jahir/jahir.jpg"

    .line 48
    .line 49
    invoke-direct {v1, v8, v2, v10, v7}, Ldev/jahir/frames/data/models/AboutItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/AboutActivity;->shouldIncludeContributors()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    new-instance v1, Ldev/jahir/frames/data/models/AboutItem;

    .line 62
    .line 63
    sget v2, Ldev/jahir/frames/R$string;->eduardo_description:I

    .line 64
    .line 65
    invoke-static {p0, v2, v3, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    new-instance v7, Lp4/f;

    .line 70
    .line 71
    const-string v8, "https://pratti.design/"

    .line 72
    .line 73
    invoke-direct {v7, v6, v8}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-array v8, v5, [Lp4/f;

    .line 77
    .line 78
    aput-object v7, v8, v9

    .line 79
    .line 80
    invoke-static {v8}, Lq4/j;->d0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    const-string v8, "Eduardo Pratti"

    .line 85
    .line 86
    const-string v10, "https://pbs.twimg.com/profile_images/560688750247051264/seXz0Y25_400x400.jpeg"

    .line 87
    .line 88
    invoke-direct {v1, v8, v2, v10, v7}, Ldev/jahir/frames/data/models/AboutItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    new-instance v1, Ldev/jahir/frames/data/models/AboutItem;

    .line 95
    .line 96
    sget v2, Ldev/jahir/frames/R$string;->patryk_description:I

    .line 97
    .line 98
    invoke-static {p0, v2, v3, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    new-instance v3, Lp4/f;

    .line 103
    .line 104
    const-string v4, "https://patrykmichalik.com"

    .line 105
    .line 106
    invoke-direct {v3, v6, v4}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    new-array v4, v5, [Lp4/f;

    .line 110
    .line 111
    aput-object v3, v4, v9

    .line 112
    .line 113
    invoke-static {v4}, Lq4/j;->d0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    const-string v4, "Patryk Michalik"

    .line 118
    .line 119
    const-string v5, "https://patrykmichalik.com/logo-on-indigo.png"

    .line 120
    .line 121
    invoke-direct {v1, v4, v2, v5, v3}, Ldev/jahir/frames/data/models/AboutItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    :cond_0
    return-object v0
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

.method private final getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/AboutActivity;->recyclerView$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    return-object v0
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

.method private final getToolbar()Landroidx/appcompat/widget/Toolbar;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/AboutActivity;->toolbar$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    return-object v0
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

.method private static final preferences_delegate$lambda$0(Ldev/jahir/frames/ui/activities/AboutActivity;)Ldev/jahir/frames/data/Preferences;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/frames/data/Preferences;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldev/jahir/frames/data/Preferences;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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


# virtual methods
.method public getAdditionalInternalAboutItems()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/frames/data/models/AboutItem;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method public getDashboardName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/AboutActivity;->dashboardName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method public getPreferences()Ldev/jahir/frames/data/Preferences;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/AboutActivity;->preferences$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/data/Preferences;

    .line 8
    .line 9
    return-object v0
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget p1, Ldev/jahir/frames/R$layout;->activity_recyclerview:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/u;->setContentView(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/AboutActivity;->getToolbar()Landroidx/appcompat/widget/Toolbar;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/u;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getSupportActionBar()Landroidx/appcompat/app/a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/appcompat/app/a;->r()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/a;->m(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/appcompat/app/a;->n()V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/AboutActivity;->getToolbar()Landroidx/appcompat/widget/Toolbar;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static {p1, v2, v0, v1}, Ldev/jahir/frames/extensions/views/ToolbarKt;->tint$default(Landroidx/appcompat/widget/Toolbar;IILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    new-instance p1, Ldev/jahir/frames/ui/adapters/AboutAdapter;

    .line 44
    .line 45
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/AboutActivity;->getDesignerAboutItems()Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/AboutActivity;->getInternalAboutItems()Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/AboutActivity;->getDashboardName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-direct {p1, v1, v2, v3}, Ldev/jahir/frames/ui/adapters/AboutAdapter;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/AboutActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 67
    .line 68
    invoke-direct {v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/p1;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/AboutActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/c1;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-void
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

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const v1, 0x102002c

    .line 11
    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/q0;->supportFinishAfterTransition()V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
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

.method public shouldIncludeContributors()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

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
