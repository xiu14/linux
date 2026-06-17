.class public final Landroidx/room/s1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final l:[Ljava/lang/String;


# instance fields
.field public final a:Landroidx/room/r0;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/util/HashMap;

.field public final d:Z

.field public final e:Landroidx/room/m;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:[Ljava/lang/String;

.field public final h:Landroidx/room/z;

.field public final i:La1/q;

.field public final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public k:Ld5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "UPDATE"

    .line 2
    .line 3
    const-string v1, "DELETE"

    .line 4
    .line 5
    const-string v2, "INSERT"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Landroidx/room/s1;->l:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
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

.method public constructor <init>(Landroidx/room/r0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;ZLandroidx/room/m;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/room/s1;->a:Landroidx/room/r0;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/room/s1;->b:Ljava/util/HashMap;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/room/s1;->c:Ljava/util/HashMap;

    .line 9
    .line 10
    iput-boolean p5, p0, Landroidx/room/s1;->d:Z

    .line 11
    .line 12
    iput-object p6, p0, Landroidx/room/s1;->e:Landroidx/room/m;

    .line 13
    .line 14
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Landroidx/room/s1;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    new-instance p1, La2/c;

    .line 23
    .line 24
    const/4 p3, 0x2

    .line 25
    invoke-direct {p1, p3}, La2/c;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Landroidx/room/s1;->k:Ld5/a;

    .line 29
    .line 30
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroidx/room/s1;->f:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    array-length p1, p4

    .line 38
    new-array p3, p1, [Ljava/lang/String;

    .line 39
    .line 40
    :goto_0
    const-string p5, "toLowerCase(...)"

    .line 41
    .line 42
    if-ge p2, p1, :cond_2

    .line 43
    .line 44
    aget-object p6, p4, p2

    .line 45
    .line 46
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 47
    .line 48
    invoke-virtual {p6, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p6

    .line 52
    invoke-static {p6, p5}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v2, p0, Landroidx/room/s1;->f:Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    invoke-interface {v2, p6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Landroidx/room/s1;->b:Ljava/util/HashMap;

    .line 65
    .line 66
    aget-object v2, p4, p2

    .line 67
    .line 68
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v1, :cond_0

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0, p5}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_0
    const/4 v0, 0x0

    .line 85
    :goto_1
    if-nez v0, :cond_1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_1
    move-object p6, v0

    .line 89
    :goto_2
    aput-object p6, p3, p2

    .line 90
    .line 91
    add-int/lit8 p2, p2, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    iput-object p3, p0, Landroidx/room/s1;->g:[Ljava/lang/String;

    .line 95
    .line 96
    iget-object p1, p0, Landroidx/room/s1;->b:Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_4

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Ljava/util/Map$Entry;

    .line 117
    .line 118
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    check-cast p3, Ljava/lang/String;

    .line 123
    .line 124
    sget-object p4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 125
    .line 126
    invoke-virtual {p3, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-static {p3, p5}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget-object p6, p0, Landroidx/room/s1;->f:Ljava/util/LinkedHashMap;

    .line 134
    .line 135
    invoke-interface {p6, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p6

    .line 139
    if-eqz p6, :cond_3

    .line 140
    .line 141
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    check-cast p2, Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p2, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-static {p2, p5}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    iget-object p4, p0, Landroidx/room/s1;->f:Ljava/util/LinkedHashMap;

    .line 155
    .line 156
    invoke-static {p4, p3}, Lq4/v;->T(Ljava/util/LinkedHashMap;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p3

    .line 160
    invoke-interface {p4, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_4
    new-instance p1, Landroidx/room/z;

    .line 165
    .line 166
    iget-object p2, p0, Landroidx/room/s1;->g:[Ljava/lang/String;

    .line 167
    .line 168
    array-length p2, p2

    .line 169
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 170
    .line 171
    .line 172
    new-instance p3, Ljava/util/concurrent/locks/ReentrantLock;

    .line 173
    .line 174
    invoke-direct {p3}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 175
    .line 176
    .line 177
    iput-object p3, p1, Landroidx/room/z;->c:Ljava/lang/Object;

    .line 178
    .line 179
    new-array p3, p2, [J

    .line 180
    .line 181
    iput-object p3, p1, Landroidx/room/z;->d:Ljava/lang/Object;

    .line 182
    .line 183
    new-array p2, p2, [Z

    .line 184
    .line 185
    iput-object p2, p1, Landroidx/room/z;->b:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object p1, p0, Landroidx/room/s1;->h:Landroidx/room/z;

    .line 188
    .line 189
    new-instance p1, La1/q;

    .line 190
    .line 191
    iget-object p2, p0, Landroidx/room/s1;->g:[Ljava/lang/String;

    .line 192
    .line 193
    array-length p2, p2

    .line 194
    invoke-direct {p1, p2}, La1/q;-><init>(I)V

    .line 195
    .line 196
    .line 197
    iput-object p1, p0, Landroidx/room/s1;->i:La1/q;

    .line 198
    .line 199
    return-void
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
.end method

.method public static final a(Landroidx/room/s1;Landroidx/room/c0;Lv4/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Landroidx/room/g1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/room/g1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/g1;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/room/g1;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/g1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/room/g1;-><init>(Landroidx/room/s1;Lv4/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Landroidx/room/g1;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p2, Lu4/a;->h:Lu4/a;

    .line 28
    .line 29
    iget v1, v0, Landroidx/room/g1;->k:I

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Landroidx/room/g1;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/util/Set;

    .line 42
    .line 43
    invoke-static {p0}, Le6/l;->H(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    iget-object p1, v0, Landroidx/room/g1;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Landroidx/room/c0;

    .line 58
    .line 59
    invoke-static {p0}, Le6/l;->H(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p0}, Le6/l;->H(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, Landroidx/room/f1;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-direct {p0, v1}, Landroidx/room/f1;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object p1, v0, Landroidx/room/g1;->h:Ljava/lang/Object;

    .line 73
    .line 74
    iput v3, v0, Landroidx/room/g1;->k:I

    .line 75
    .line 76
    const-string v1, "SELECT * FROM room_table_modification_log WHERE invalidated = 1"

    .line 77
    .line 78
    invoke-interface {p1, v1, p0, v0}, Landroidx/room/c0;->c(Ljava/lang/String;Ld5/l;Lv4/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, p2, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    :goto_1
    check-cast p0, Ljava/util/Set;

    .line 86
    .line 87
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_5

    .line 92
    .line 93
    iput-object p0, v0, Landroidx/room/g1;->h:Ljava/lang/Object;

    .line 94
    .line 95
    iput v2, v0, Landroidx/room/g1;->k:I

    .line 96
    .line 97
    const-string v1, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"

    .line 98
    .line 99
    invoke-static {p1, v1, v0}, Landroidx/room/d0;->b(Landroidx/room/c0;Ljava/lang/String;Lv4/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, p2, :cond_5

    .line 104
    .line 105
    :goto_2
    return-object p2

    .line 106
    :cond_5
    return-object p0
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

.method public static final b(Landroidx/room/s1;Lv4/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/room/s1;->a:Landroidx/room/r0;

    .line 2
    .line 3
    instance-of v1, p1, Landroidx/room/l1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Landroidx/room/l1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/room/l1;->l:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Landroidx/room/l1;->l:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/room/l1;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Landroidx/room/l1;-><init>(Landroidx/room/s1;Lv4/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Landroidx/room/l1;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lu4/a;->h:Lu4/a;

    .line 30
    .line 31
    iget v3, v1, Landroidx/room/l1;->l:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    iget-object p0, v1, Landroidx/room/l1;->i:Lq1/a;

    .line 39
    .line 40
    iget-object v0, v1, Landroidx/room/l1;->h:Landroidx/room/s1;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    move-object v8, p1

    .line 46
    move-object p1, p0

    .line 47
    move-object p0, v0

    .line 48
    move-object v0, v8

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_3

    .line 52
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_2
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Landroidx/room/r0;->getCloseBarrier$room_runtime_release()Lq1/a;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Lq1/a;->a()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    sget-object v5, Lq4/t;->h:Lq4/t;

    .line 72
    .line 73
    if-eqz v3, :cond_7

    .line 74
    .line 75
    :try_start_1
    iget-object v3, p0, Landroidx/room/s1;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-virtual {v3, v4, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 79
    .line 80
    .line 81
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    if-nez v3, :cond_3

    .line 83
    .line 84
    invoke-virtual {p1}, Lq1/a;->b()V

    .line 85
    .line 86
    .line 87
    return-object v5

    .line 88
    :cond_3
    :try_start_2
    iget-object v3, p0, Landroidx/room/s1;->k:Ld5/a;

    .line 89
    .line 90
    invoke-interface {v3}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 100
    if-nez v3, :cond_4

    .line 101
    .line 102
    invoke-virtual {p1}, Lq1/a;->b()V

    .line 103
    .line 104
    .line 105
    return-object v5

    .line 106
    :cond_4
    :try_start_3
    new-instance v3, Landroidx/room/m1;

    .line 107
    .line 108
    const/4 v5, 0x0

    .line 109
    const/4 v7, 0x1

    .line 110
    invoke-direct {v3, p0, v5, v7}, Landroidx/room/m1;-><init>(Landroidx/room/s1;Lt4/c;I)V

    .line 111
    .line 112
    .line 113
    iput-object p0, v1, Landroidx/room/l1;->h:Landroidx/room/s1;

    .line 114
    .line 115
    iput-object p1, v1, Landroidx/room/l1;->i:Lq1/a;

    .line 116
    .line 117
    iput v4, v1, Landroidx/room/l1;->l:I

    .line 118
    .line 119
    invoke-virtual {v0, v6, v3, v1}, Landroidx/room/r0;->useConnection$room_runtime_release(ZLd5/p;Lt4/c;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-ne v0, v2, :cond_5

    .line 124
    .line 125
    return-object v2

    .line 126
    :cond_5
    :goto_1
    check-cast v0, Ljava/util/Set;

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-nez v1, :cond_6

    .line 133
    .line 134
    iget-object v1, p0, Landroidx/room/s1;->i:La1/q;

    .line 135
    .line 136
    invoke-virtual {v1, v0}, La1/q;->B(Ljava/util/Set;)V

    .line 137
    .line 138
    .line 139
    iget-object p0, p0, Landroidx/room/s1;->e:Landroidx/room/m;

    .line 140
    .line 141
    invoke-virtual {p0, v0}, Landroidx/room/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :catchall_1
    move-exception p0

    .line 146
    move-object v8, p1

    .line 147
    move-object p1, p0

    .line 148
    move-object p0, v8

    .line 149
    goto :goto_3

    .line 150
    :cond_6
    :goto_2
    invoke-virtual {p1}, Lq1/a;->b()V

    .line 151
    .line 152
    .line 153
    return-object v0

    .line 154
    :goto_3
    invoke-virtual {p0}, Lq1/a;->b()V

    .line 155
    .line 156
    .line 157
    throw p1

    .line 158
    :cond_7
    return-object v5
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

.method public static final c(Landroidx/room/s1;Landroidx/room/e1;ILv4/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p3, Landroidx/room/o1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p3

    .line 9
    check-cast v0, Landroidx/room/o1;

    .line 10
    .line 11
    iget v1, v0, Landroidx/room/o1;->q:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Landroidx/room/o1;->q:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Landroidx/room/o1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p3}, Landroidx/room/o1;-><init>(Landroidx/room/s1;Lv4/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p3, v0, Landroidx/room/o1;->o:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 31
    .line 32
    iget v2, v0, Landroidx/room/o1;->q:I

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget p0, v0, Landroidx/room/o1;->n:I

    .line 43
    .line 44
    iget p1, v0, Landroidx/room/o1;->m:I

    .line 45
    .line 46
    iget p2, v0, Landroidx/room/o1;->l:I

    .line 47
    .line 48
    iget-object v2, v0, Landroidx/room/o1;->k:[Ljava/lang/String;

    .line 49
    .line 50
    iget-object v5, v0, Landroidx/room/o1;->j:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v6, v0, Landroidx/room/o1;->i:Landroidx/room/c0;

    .line 53
    .line 54
    iget-object v7, v0, Landroidx/room/o1;->h:Landroidx/room/s1;

    .line 55
    .line 56
    invoke-static {p3}, Le6/l;->H(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p0

    .line 69
    :cond_2
    iget p2, v0, Landroidx/room/o1;->l:I

    .line 70
    .line 71
    iget-object p1, v0, Landroidx/room/o1;->i:Landroidx/room/c0;

    .line 72
    .line 73
    iget-object p0, v0, Landroidx/room/o1;->h:Landroidx/room/s1;

    .line 74
    .line 75
    invoke-static {p3}, Le6/l;->H(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-static {p3}, Le6/l;->H(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance p3, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v2, "INSERT OR IGNORE INTO room_table_modification_log VALUES("

    .line 85
    .line 86
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v2, ", 0)"

    .line 93
    .line 94
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    iput-object p0, v0, Landroidx/room/o1;->h:Landroidx/room/s1;

    .line 102
    .line 103
    iput-object p1, v0, Landroidx/room/o1;->i:Landroidx/room/c0;

    .line 104
    .line 105
    iput p2, v0, Landroidx/room/o1;->l:I

    .line 106
    .line 107
    iput v4, v0, Landroidx/room/o1;->q:I

    .line 108
    .line 109
    invoke-static {p1, p3, v0}, Landroidx/room/d0;->b(Landroidx/room/c0;Ljava/lang/String;Lv4/c;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    if-ne p3, v1, :cond_4

    .line 114
    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_4
    :goto_1
    iget-object p3, p0, Landroidx/room/s1;->g:[Ljava/lang/String;

    .line 118
    .line 119
    aget-object p3, p3, p2

    .line 120
    .line 121
    sget-object v2, Landroidx/room/s1;->l:[Ljava/lang/String;

    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    const/4 v6, 0x3

    .line 125
    move-object v7, p0

    .line 126
    move-object v6, p1

    .line 127
    move-object v5, p3

    .line 128
    const/4 p0, 0x3

    .line 129
    const/4 p1, 0x0

    .line 130
    :goto_2
    if-ge p1, p0, :cond_7

    .line 131
    .line 132
    aget-object p3, v2, p1

    .line 133
    .line 134
    iget-boolean v8, v7, Landroidx/room/s1;->d:Z

    .line 135
    .line 136
    if-eqz v8, :cond_5

    .line 137
    .line 138
    const-string v8, "TEMP"

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    const-string v8, ""

    .line 142
    .line 143
    :goto_3
    new-instance v9, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v10, "room_table_modification_trigger_"

    .line 146
    .line 147
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const/16 v10, 0x5f

    .line 154
    .line 155
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v9, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    new-instance v10, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v11, "CREATE "

    .line 168
    .line 169
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v8, " TRIGGER IF NOT EXISTS `"

    .line 176
    .line 177
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v8, "` AFTER "

    .line 184
    .line 185
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string p3, " ON `"

    .line 192
    .line 193
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string p3, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "

    .line 200
    .line 201
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v10, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string p3, " AND invalidated = 0; END"

    .line 208
    .line 209
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p3

    .line 216
    iput-object v7, v0, Landroidx/room/o1;->h:Landroidx/room/s1;

    .line 217
    .line 218
    iput-object v6, v0, Landroidx/room/o1;->i:Landroidx/room/c0;

    .line 219
    .line 220
    iput-object v5, v0, Landroidx/room/o1;->j:Ljava/lang/String;

    .line 221
    .line 222
    iput-object v2, v0, Landroidx/room/o1;->k:[Ljava/lang/String;

    .line 223
    .line 224
    iput p2, v0, Landroidx/room/o1;->l:I

    .line 225
    .line 226
    iput p1, v0, Landroidx/room/o1;->m:I

    .line 227
    .line 228
    iput p0, v0, Landroidx/room/o1;->n:I

    .line 229
    .line 230
    iput v3, v0, Landroidx/room/o1;->q:I

    .line 231
    .line 232
    invoke-static {v6, p3, v0}, Landroidx/room/d0;->b(Landroidx/room/c0;Ljava/lang/String;Lv4/c;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p3

    .line 236
    if-ne p3, v1, :cond_6

    .line 237
    .line 238
    :goto_4
    return-object v1

    .line 239
    :cond_6
    :goto_5
    add-int/2addr p1, v4

    .line 240
    goto :goto_2

    .line 241
    :cond_7
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 242
    .line 243
    return-object p0
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

.method public static final d(Landroidx/room/s1;Landroidx/room/e1;ILv4/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p3, Landroidx/room/p1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p3

    .line 9
    check-cast v0, Landroidx/room/p1;

    .line 10
    .line 11
    iget v1, v0, Landroidx/room/p1;->o:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Landroidx/room/p1;->o:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Landroidx/room/p1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p3}, Landroidx/room/p1;-><init>(Landroidx/room/s1;Lv4/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p3, v0, Landroidx/room/p1;->m:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 31
    .line 32
    iget v2, v0, Landroidx/room/p1;->o:I

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget p0, v0, Landroidx/room/p1;->l:I

    .line 40
    .line 41
    iget p1, v0, Landroidx/room/p1;->k:I

    .line 42
    .line 43
    iget-object p2, v0, Landroidx/room/p1;->j:[Ljava/lang/String;

    .line 44
    .line 45
    iget-object v2, v0, Landroidx/room/p1;->i:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v4, v0, Landroidx/room/p1;->h:Landroidx/room/c0;

    .line 48
    .line 49
    invoke-static {p3}, Le6/l;->H(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object p3, p2

    .line 53
    move-object p2, v4

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :cond_2
    invoke-static {p3}, Le6/l;->H(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Landroidx/room/s1;->g:[Ljava/lang/String;

    .line 67
    .line 68
    aget-object p0, p0, p2

    .line 69
    .line 70
    sget-object p2, Landroidx/room/s1;->l:[Ljava/lang/String;

    .line 71
    .line 72
    const/4 p3, 0x0

    .line 73
    const/4 v2, 0x3

    .line 74
    move-object v2, p0

    .line 75
    move-object p3, p2

    .line 76
    const/4 p0, 0x3

    .line 77
    move-object p2, p1

    .line 78
    const/4 p1, 0x0

    .line 79
    :goto_1
    if-ge p1, p0, :cond_4

    .line 80
    .line 81
    aget-object v4, p3, p1

    .line 82
    .line 83
    new-instance v5, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v6, "room_table_modification_trigger_"

    .line 86
    .line 87
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const/16 v6, 0x5f

    .line 94
    .line 95
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    new-instance v5, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v6, "DROP TRIGGER IF EXISTS `"

    .line 108
    .line 109
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const/16 v4, 0x60

    .line 116
    .line 117
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iput-object p2, v0, Landroidx/room/p1;->h:Landroidx/room/c0;

    .line 125
    .line 126
    iput-object v2, v0, Landroidx/room/p1;->i:Ljava/lang/String;

    .line 127
    .line 128
    iput-object p3, v0, Landroidx/room/p1;->j:[Ljava/lang/String;

    .line 129
    .line 130
    iput p1, v0, Landroidx/room/p1;->k:I

    .line 131
    .line 132
    iput p0, v0, Landroidx/room/p1;->l:I

    .line 133
    .line 134
    iput v3, v0, Landroidx/room/p1;->o:I

    .line 135
    .line 136
    invoke-static {p2, v4, v0}, Landroidx/room/d0;->b(Landroidx/room/c0;Ljava/lang/String;Lv4/c;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    if-ne v4, v1, :cond_3

    .line 141
    .line 142
    return-object v1

    .line 143
    :cond_3
    :goto_2
    add-int/2addr p1, v3

    .line 144
    goto :goto_1

    .line 145
    :cond_4
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 146
    .line 147
    return-object p0
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


# virtual methods
.method public final e(Ld5/a;Ld5/a;)V
    .locals 4

    .line 1
    const-string v0, "onRefreshScheduled"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onRefreshCompleted"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    iget-object v2, p0, Landroidx/room/s1;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/room/s1;->a:Landroidx/room/r0;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/room/r0;->getCoroutineScope()Ln5/v;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Ln5/u;

    .line 31
    .line 32
    invoke-direct {v0}, Ln5/u;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v1, Landroidx/room/n1;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v1, p0, p2, v3, v2}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 40
    .line 41
    .line 42
    const/4 p2, 0x2

    .line 43
    invoke-static {p1, v0, v3, v1, p2}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
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

.method public final f(Lv4/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Landroidx/room/q1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/room/q1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/q1;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/room/q1;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/q1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/room/q1;-><init>(Landroidx/room/s1;Lv4/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/room/q1;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 28
    .line 29
    iget v2, v0, Landroidx/room/q1;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object v0, v0, Landroidx/room/q1;->h:Lq1/a;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Landroidx/room/s1;->a:Landroidx/room/r0;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroidx/room/r0;->getCloseBarrier$room_runtime_release()Lq1/a;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Lq1/a;->a()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_4

    .line 66
    .line 67
    :try_start_1
    new-instance v4, Landroidx/room/m1;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x2

    .line 71
    invoke-direct {v4, p0, v5, v6}, Landroidx/room/m1;-><init>(Landroidx/room/s1;Lt4/c;I)V

    .line 72
    .line 73
    .line 74
    iput-object v2, v0, Landroidx/room/q1;->h:Lq1/a;

    .line 75
    .line 76
    iput v3, v0, Landroidx/room/q1;->k:I

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-virtual {p1, v3, v4, v0}, Landroidx/room/r0;->useConnection$room_runtime_release(ZLd5/p;Lt4/c;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    if-ne p1, v1, :cond_3

    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_3
    move-object v0, v2

    .line 87
    :goto_1
    invoke-virtual {v0}, Lq1/a;->b()V

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :catchall_1
    move-exception p1

    .line 92
    move-object v0, v2

    .line 93
    :goto_2
    invoke-virtual {v0}, Lq1/a;->b()V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_4
    :goto_3
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 98
    .line 99
    return-object p1
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

.method public final g([Ljava/lang/String;)Lp4/f;
    .locals 7

    .line 1
    new-instance v0, Lr4/i;

    .line 2
    .line 3
    invoke-direct {v0}, Lr4/i;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    const-string v4, "toLowerCase(...)"

    .line 10
    .line 11
    if-ge v3, v1, :cond_1

    .line 12
    .line 13
    aget-object v5, p1, v3

    .line 14
    .line 15
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 16
    .line 17
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-static {v6, v4}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v4, p0, Landroidx/room/s1;->c:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Ljava/util/Set;

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, v4}, Lr4/i;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v0, v5}, Lr4/i;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v0}, La/a;->j(Lr4/i;)Lr4/i;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-array v0, v2, [Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, [Ljava/lang/String;

    .line 55
    .line 56
    array-length v0, p1

    .line 57
    new-array v1, v0, [I

    .line 58
    .line 59
    :goto_2
    if-ge v2, v0, :cond_3

    .line 60
    .line 61
    aget-object v3, p1, v2

    .line 62
    .line 63
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 64
    .line 65
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {v5, v4}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v6, p0, Landroidx/room/s1;->f:Ljava/util/LinkedHashMap;

    .line 73
    .line 74
    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Ljava/lang/Integer;

    .line 79
    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    aput v3, v1, v2

    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 92
    .line 93
    const-string v0, "There is no table with name "

    .line 94
    .line 95
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_3
    new-instance v0, Lp4/f;

    .line 104
    .line 105
    invoke-direct {v0, p1, v1}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-object v0
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
