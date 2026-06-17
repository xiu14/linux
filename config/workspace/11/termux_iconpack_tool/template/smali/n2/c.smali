.class public final Ln2/c;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lm2/f;
.implements Lq2/g;
.implements Lm2/a;


# static fields
.field public static final v:Ljava/lang/String;


# instance fields
.field public final h:Landroid/content/Context;

.field public final i:Ljava/util/HashMap;

.field public final j:Ln2/a;

.field public k:Z

.field public final l:Ljava/lang/Object;

.field public final m:Lu2/u;

.field public final n:Lm2/d;

.field public final o:Lu2/c;

.field public final p:Ll2/a;

.field public final q:Ljava/util/HashMap;

.field public r:Ljava/lang/Boolean;

.field public final s:Lp3/j;

.field public final t:Lw2/a;

.field public final u:Ln2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "GreedyScheduler"

    .line 2
    .line 3
    invoke-static {v0}, Ll2/t;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ln2/c;->v:Ljava/lang/String;

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
.end method

.method public constructor <init>(Landroid/content/Context;Ll2/a;Landroidx/lifecycle/a1;Lm2/d;Lu2/c;Lw2/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ln2/c;->i:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ln2/c;->l:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Landroidx/room/m0;

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-direct {v0, v1}, Landroidx/room/m0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lu2/u;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lu2/u;-><init>(Landroidx/room/m0;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Ln2/c;->m:Lu2/u;

    .line 30
    .line 31
    new-instance v0, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Ln2/c;->q:Ljava/util/HashMap;

    .line 37
    .line 38
    iput-object p1, p0, Ln2/c;->h:Landroid/content/Context;

    .line 39
    .line 40
    iget-object p1, p2, Ll2/a;->g:La1/q;

    .line 41
    .line 42
    new-instance v0, Ln2/a;

    .line 43
    .line 44
    iget-object v1, p2, Ll2/a;->d:Ll2/a0;

    .line 45
    .line 46
    invoke-direct {v0, p0, p1, v1}, Ln2/a;-><init>(Ln2/c;La1/q;Ll2/a0;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Ln2/c;->j:Ln2/a;

    .line 50
    .line 51
    new-instance v0, Ln2/d;

    .line 52
    .line 53
    invoke-direct {v0, p1, p5}, Ln2/d;-><init>(La1/q;Lu2/c;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Ln2/c;->u:Ln2/d;

    .line 57
    .line 58
    iput-object p6, p0, Ln2/c;->t:Lw2/a;

    .line 59
    .line 60
    new-instance p1, Lp3/j;

    .line 61
    .line 62
    invoke-direct {p1, p3}, Lp3/j;-><init>(Landroidx/lifecycle/a1;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Ln2/c;->s:Lp3/j;

    .line 66
    .line 67
    iput-object p2, p0, Ln2/c;->p:Ll2/a;

    .line 68
    .line 69
    iput-object p4, p0, Ln2/c;->n:Lm2/d;

    .line 70
    .line 71
    iput-object p5, p0, Ln2/c;->o:Lu2/c;

    .line 72
    .line 73
    return-void
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


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ln2/c;->r:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ln2/c;->h:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Ln2/c;->p:Ll2/a;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lv2/j;->a(Landroid/content/Context;Ll2/a;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ln2/c;->r:Ljava/lang/Boolean;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Ln2/c;->r:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sget-object v1, Ln2/c;->v:Ljava/lang/String;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "Ignoring schedule request in non-main process"

    .line 34
    .line 35
    invoke-virtual {p1, v1, v0}, Ll2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-boolean v0, p0, Ln2/c;->k:Z

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Ln2/c;->n:Lm2/d;

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Lm2/d;->a(Lm2/a;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, Ln2/c;->k:Z

    .line 50
    .line 51
    :cond_2
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v3, "Cancelling work ID "

    .line 58
    .line 59
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v0, v1, v2}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Ln2/c;->j:Ln2/a;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    iget-object v1, v0, Ln2/a;->d:Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Ljava/lang/Runnable;

    .line 83
    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    iget-object v0, v0, Ln2/a;->b:La1/q;

    .line 87
    .line 88
    iget-object v0, v0, La1/q;->i:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Landroid/os/Handler;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    iget-object v0, p0, Ln2/c;->m:Lu2/u;

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Lu2/u;->v(Ljava/lang/String;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Lm2/j;

    .line 116
    .line 117
    iget-object v1, p0, Ln2/c;->u:Ln2/d;

    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ln2/d;->a(Lm2/j;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Ln2/c;->o:Lu2/c;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    const/16 v2, -0x200

    .line 128
    .line 129
    invoke-virtual {v1, v0, v2}, Lu2/c;->i(Lm2/j;I)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_4
    return-void
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final varargs b([Lu2/p;)V
    .locals 14

    .line 1
    iget-object v0, p0, Ln2/c;->r:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ln2/c;->h:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Ln2/c;->p:Ll2/a;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lv2/j;->a(Landroid/content/Context;Ll2/a;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ln2/c;->r:Ljava/lang/Boolean;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Ln2/c;->r:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object v0, Ln2/c;->v:Ljava/lang/String;

    .line 32
    .line 33
    const-string v1, "Ignoring schedule request in a secondary process"

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1}, Ll2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-boolean v0, p0, Ln2/c;->k:Z

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Ln2/c;->n:Lm2/d;

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Lm2/d;->a(Lm2/a;)V

    .line 47
    .line 48
    .line 49
    iput-boolean v1, p0, Ln2/c;->k:Z

    .line 50
    .line 51
    :cond_2
    new-instance v0, Ljava/util/HashSet;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance v2, Ljava/util/HashSet;

    .line 57
    .line 58
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 59
    .line 60
    .line 61
    array-length v3, p1

    .line 62
    const/4 v4, 0x0

    .line 63
    :goto_0
    if-ge v4, v3, :cond_a

    .line 64
    .line 65
    aget-object v5, p1, v4

    .line 66
    .line 67
    invoke-static {v5}, La/a;->B(Lu2/p;)Lu2/j;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget-object v7, p0, Ln2/c;->m:Lu2/u;

    .line 72
    .line 73
    invoke-virtual {v7, v6}, Lu2/u;->k(Lu2/j;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_3

    .line 78
    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :cond_3
    invoke-virtual {p0, v5}, Ln2/c;->g(Lu2/p;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v6

    .line 85
    invoke-virtual {v5}, Lu2/p;->a()J

    .line 86
    .line 87
    .line 88
    move-result-wide v8

    .line 89
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    iget-object v8, p0, Ln2/c;->p:Ll2/a;

    .line 94
    .line 95
    iget-object v8, v8, Ll2/a;->d:Ll2/a0;

    .line 96
    .line 97
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v8

    .line 104
    iget v10, v5, Lu2/p;->b:I

    .line 105
    .line 106
    if-ne v10, v1, :cond_9

    .line 107
    .line 108
    cmp-long v10, v8, v6

    .line 109
    .line 110
    if-gez v10, :cond_5

    .line 111
    .line 112
    iget-object v8, p0, Ln2/c;->j:Ln2/a;

    .line 113
    .line 114
    if-eqz v8, :cond_9

    .line 115
    .line 116
    iget-object v9, v8, Ln2/a;->b:La1/q;

    .line 117
    .line 118
    iget-object v10, v8, Ln2/a;->d:Ljava/util/HashMap;

    .line 119
    .line 120
    iget-object v11, v5, Lu2/p;->a:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v10, v11}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    check-cast v11, Ljava/lang/Runnable;

    .line 127
    .line 128
    if-eqz v11, :cond_4

    .line 129
    .line 130
    iget-object v12, v9, La1/q;->i:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v12, Landroid/os/Handler;

    .line 133
    .line 134
    invoke-virtual {v12, v11}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    new-instance v11, Landroidx/recyclerview/widget/e;

    .line 138
    .line 139
    const/4 v12, 0x7

    .line 140
    invoke-direct {v11, v12, v8, v5}, Landroidx/recyclerview/widget/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object v5, v5, Lu2/p;->a:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v10, v5, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    iget-object v5, v8, Ln2/a;->c:Ll2/a0;

    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    sub-long/2addr v6, v12

    .line 158
    iget-object v5, v9, La1/q;->i:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v5, Landroid/os/Handler;

    .line 161
    .line 162
    invoke-virtual {v5, v11, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 163
    .line 164
    .line 165
    goto/16 :goto_1

    .line 166
    .line 167
    :cond_5
    invoke-virtual {v5}, Lu2/p;->c()Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eqz v6, :cond_8

    .line 172
    .line 173
    iget-object v6, v5, Lu2/p;->j:Ll2/d;

    .line 174
    .line 175
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 176
    .line 177
    const/16 v8, 0x17

    .line 178
    .line 179
    if-lt v7, v8, :cond_6

    .line 180
    .line 181
    iget-boolean v8, v6, Ll2/d;->d:Z

    .line 182
    .line 183
    if-eqz v8, :cond_6

    .line 184
    .line 185
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    sget-object v7, Ln2/c;->v:Ljava/lang/String;

    .line 190
    .line 191
    new-instance v8, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    const-string v9, "Ignoring "

    .line 194
    .line 195
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v5, ". Requires device idle."

    .line 202
    .line 203
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-virtual {v6, v7, v5}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    goto/16 :goto_1

    .line 214
    .line 215
    :cond_6
    const/16 v8, 0x18

    .line 216
    .line 217
    if-lt v7, v8, :cond_7

    .line 218
    .line 219
    invoke-virtual {v6}, Ll2/d;->b()Z

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    if-eqz v6, :cond_7

    .line 224
    .line 225
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    sget-object v7, Ln2/c;->v:Ljava/lang/String;

    .line 230
    .line 231
    new-instance v8, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    const-string v9, "Ignoring "

    .line 234
    .line 235
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v5, ". Requires ContentUri triggers."

    .line 242
    .line 243
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-virtual {v6, v7, v5}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_7
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    iget-object v5, v5, Lu2/p;->a:Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_1

    .line 263
    :cond_8
    iget-object v6, p0, Ln2/c;->m:Lu2/u;

    .line 264
    .line 265
    invoke-static {v5}, La/a;->B(Lu2/p;)Lu2/j;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-virtual {v6, v7}, Lu2/u;->k(Lu2/j;)Z

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    if-nez v6, :cond_9

    .line 274
    .line 275
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    sget-object v7, Ln2/c;->v:Ljava/lang/String;

    .line 280
    .line 281
    new-instance v8, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    const-string v9, "Starting work for "

    .line 284
    .line 285
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    iget-object v9, v5, Lu2/p;->a:Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    invoke-virtual {v6, v7, v8}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iget-object v6, p0, Ln2/c;->m:Lu2/u;

    .line 301
    .line 302
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-static {v5}, La/a;->B(Lu2/p;)Lu2/j;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    invoke-virtual {v6, v5}, Lu2/u;->x(Lu2/j;)Lm2/j;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    iget-object v6, p0, Ln2/c;->u:Ln2/d;

    .line 314
    .line 315
    invoke-virtual {v6, v5}, Ln2/d;->b(Lm2/j;)V

    .line 316
    .line 317
    .line 318
    iget-object v6, p0, Ln2/c;->o:Lu2/c;

    .line 319
    .line 320
    iget-object v7, v6, Lu2/c;->i:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v7, Lw2/a;

    .line 323
    .line 324
    new-instance v8, La1/o;

    .line 325
    .line 326
    const/16 v9, 0x8

    .line 327
    .line 328
    const/4 v10, 0x0

    .line 329
    invoke-direct {v8, v6, v5, v10, v9}, La1/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 330
    .line 331
    .line 332
    check-cast v7, Lu2/i;

    .line 333
    .line 334
    invoke-virtual {v7, v8}, Lu2/i;->b(Ljava/lang/Runnable;)V

    .line 335
    .line 336
    .line 337
    :cond_9
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 338
    .line 339
    goto/16 :goto_0

    .line 340
    .line 341
    :cond_a
    iget-object p1, p0, Ln2/c;->l:Ljava/lang/Object;

    .line 342
    .line 343
    monitor-enter p1

    .line 344
    :try_start_0
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    if-nez v1, :cond_c

    .line 349
    .line 350
    const-string v1, ","

    .line 351
    .line 352
    invoke-static {v1, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    sget-object v3, Ln2/c;->v:Ljava/lang/String;

    .line 361
    .line 362
    new-instance v4, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 365
    .line 366
    .line 367
    const-string v5, "Starting tracking for "

    .line 368
    .line 369
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-virtual {v2, v3, v1}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    :cond_b
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-eqz v1, :cond_c

    .line 391
    .line 392
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    check-cast v1, Lu2/p;

    .line 397
    .line 398
    invoke-static {v1}, La/a;->B(Lu2/p;)Lu2/j;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    iget-object v3, p0, Ln2/c;->i:Ljava/util/HashMap;

    .line 403
    .line 404
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    if-nez v3, :cond_b

    .line 409
    .line 410
    iget-object v3, p0, Ln2/c;->s:Lp3/j;

    .line 411
    .line 412
    iget-object v4, p0, Ln2/c;->t:Lw2/a;

    .line 413
    .line 414
    check-cast v4, Lu2/i;

    .line 415
    .line 416
    iget-object v4, v4, Lu2/i;->b:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v4, Ln5/r;

    .line 419
    .line 420
    invoke-static {v3, v1, v4, p0}, Lq2/l;->a(Lp3/j;Lu2/p;Ln5/r;Lq2/g;)Ln5/a0;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    iget-object v3, p0, Ln2/c;->i:Ljava/util/HashMap;

    .line 425
    .line 426
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    goto :goto_2

    .line 430
    :catchall_0
    move-exception v0

    .line 431
    goto :goto_3

    .line 432
    :cond_c
    monitor-exit p1

    .line 433
    return-void

    .line 434
    :goto_3
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 435
    throw v0
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

.method public final c(Lu2/j;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln2/c;->m:Lu2/u;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/u;->w(Lu2/j;)Lm2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Ln2/c;->u:Ln2/d;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ln2/d;->a(Lm2/j;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Ln2/c;->f(Lu2/j;)V

    .line 15
    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    iget-object p2, p0, Ln2/c;->l:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter p2

    .line 22
    :try_start_0
    iget-object v0, p0, Ln2/c;->q:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    monitor-exit p2

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw p1

    .line 32
    :cond_1
    return-void
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

.method public final d(Lu2/p;Lq2/c;)V
    .locals 7

    .line 1
    invoke-static {p1}, La/a;->B(Lu2/p;)Lu2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p2, Lq2/a;

    .line 6
    .line 7
    iget-object v1, p0, Ln2/c;->o:Lu2/c;

    .line 8
    .line 9
    iget-object v2, p0, Ln2/c;->u:Ln2/d;

    .line 10
    .line 11
    sget-object v3, Ln2/c;->v:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v4, p0, Ln2/c;->m:Lu2/u;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v4, p1}, Lu2/u;->k(Lu2/j;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-nez p2, :cond_1

    .line 22
    .line 23
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v5, "Constraints met: Scheduling work ID "

    .line 30
    .line 31
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p2, v3, v0}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, p1}, Lu2/u;->x(Lu2/j;)Lm2/j;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v2, p1}, Ln2/d;->b(Lm2/j;)V

    .line 49
    .line 50
    .line 51
    iget-object p2, v1, Lu2/c;->i:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p2, Lw2/a;

    .line 54
    .line 55
    new-instance v0, La1/o;

    .line 56
    .line 57
    const/16 v2, 0x8

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-direct {v0, v1, p1, v3, v2}, La1/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    check-cast p2, Lu2/i;

    .line 64
    .line 65
    invoke-virtual {p2, v0}, Lu2/i;->b(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v5, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v6, "Constraints not met: Cancelling work ID "

    .line 76
    .line 77
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v0, v3, v5}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, p1}, Lu2/u;->w(Lu2/j;)Lm2/j;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-eqz p1, :cond_1

    .line 95
    .line 96
    invoke-virtual {v2, p1}, Ln2/d;->a(Lm2/j;)V

    .line 97
    .line 98
    .line 99
    check-cast p2, Lq2/b;

    .line 100
    .line 101
    iget p2, p2, Lq2/b;->a:I

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p1, p2}, Lu2/c;->i(Lm2/j;I)V

    .line 107
    .line 108
    .line 109
    :cond_1
    return-void
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

.method public final e()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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

.method public final f(Lu2/j;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ln2/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ln2/c;->i:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ln5/y0;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v2, Ln2/c;->v:Ljava/lang/String;

    .line 20
    .line 21
    new-instance v3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v4, "Stopping tracking for "

    .line 24
    .line 25
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, v2, p1}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-interface {v1, p1}, Ln5/y0;->b(Ljava/util/concurrent/CancellationException;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p1
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

.method public final g(Lu2/p;)J
    .locals 7

    .line 1
    iget-object v0, p0, Ln2/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p1}, La/a;->B(Lu2/p;)Lu2/j;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Ln2/c;->q:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ln2/b;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    new-instance v2, Ln2/b;

    .line 19
    .line 20
    iget v3, p1, Lu2/p;->k:I

    .line 21
    .line 22
    iget-object v4, p0, Ln2/c;->p:Ll2/a;

    .line 23
    .line 24
    iget-object v4, v4, Ll2/a;->d:Ll2/a0;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    invoke-direct {v2, v3, v4, v5}, Ln2/b;-><init>(IJ)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Ln2/c;->q:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    iget-wide v3, v2, Ln2/b;->b:J

    .line 45
    .line 46
    iget p1, p1, Lu2/p;->k:I

    .line 47
    .line 48
    iget v1, v2, Ln2/b;->a:I

    .line 49
    .line 50
    sub-int/2addr p1, v1

    .line 51
    add-int/lit8 p1, p1, -0x5

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    int-to-long v1, p1

    .line 59
    const-wide/16 v5, 0x7530

    .line 60
    .line 61
    mul-long v1, v1, v5

    .line 62
    .line 63
    add-long/2addr v1, v3

    .line 64
    monitor-exit v0

    .line 65
    return-wide v1

    .line 66
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    throw p1
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
