.class public abstract Ldev/jahir/blueprint/ui/activities/BlueprintActivity;
.super Ldev/jahir/frames/ui/activities/FramesActivity;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ldev/jahir/blueprint/data/requests/RequestCallback;


# instance fields
.field private final applyFragment$delegate:Lp4/c;

.field private final blueprintPrefs$delegate:Lp4/c;

.field private final collectionsFragment:Ldev/jahir/frames/ui/fragments/CollectionsFragment;

.field private final fabBtn$delegate:Lp4/c;

.field private final favoritesFragment:Ldev/jahir/frames/ui/fragments/WallpapersFragment;

.field private final homeFragment$delegate:Lp4/c;

.field private final homeViewModel$delegate:Lp4/c;

.field private iconDialog:Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;

.field private final iconsCategoriesFragment$delegate:Lp4/c;

.field private iconsShapePickerDialog:Landroidx/appcompat/app/r;

.field private final iconsViewModel$delegate:Lp4/c;

.field private final initialFragmentTag:Ljava/lang/String;

.field private final initialItemId:I

.field private internalMenu:Landroid/view/Menu;

.field private final isDebug:Z

.field private pickerKey:I

.field private requestDialog:Landroidx/appcompat/app/r;

.field private final requestFragment$delegate:Lp4/c;

.field private final requestsViewModel$delegate:Lp4/c;

.field private shouldBuildRequest:Z

.field private final templatesViewModel$delegate:Lp4/c;

.field private final wallpapersFragment$delegate:Lp4/c;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/FramesActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/blueprint/ui/activities/e;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/e;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->wallpapersFragment$delegate:Lp4/c;

    .line 15
    .line 16
    new-instance v0, La2/c;

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    invoke-direct {v0, v1}, La2/c;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->homeFragment$delegate:Lp4/c;

    .line 28
    .line 29
    new-instance v0, La2/c;

    .line 30
    .line 31
    const/16 v1, 0x9

    .line 32
    .line 33
    invoke-direct {v0, v1}, La2/c;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->iconsCategoriesFragment$delegate:Lp4/c;

    .line 41
    .line 42
    new-instance v0, La2/c;

    .line 43
    .line 44
    const/16 v1, 0xa

    .line 45
    .line 46
    invoke-direct {v0, v1}, La2/c;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->applyFragment$delegate:Lp4/c;

    .line 54
    .line 55
    new-instance v0, La2/c;

    .line 56
    .line 57
    const/16 v1, 0xb

    .line 58
    .line 59
    invoke-direct {v0, v1}, La2/c;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->requestFragment$delegate:Lp4/c;

    .line 67
    .line 68
    new-instance v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$1;

    .line 69
    .line 70
    invoke-direct {v0, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$1;-><init>(Lb/q;)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Landroidx/lifecycle/a1;

    .line 74
    .line 75
    const-class v2, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 76
    .line 77
    invoke-static {v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    new-instance v3, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$2;

    .line 82
    .line 83
    invoke-direct {v3, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$2;-><init>(Lb/q;)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$3;

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    invoke-direct {v4, v5, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$3;-><init>(Ld5/a;Lb/q;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/a1;-><init>(Lkotlin/jvm/internal/d;Ld5/a;Ld5/a;Ld5/a;)V

    .line 93
    .line 94
    .line 95
    iput-object v1, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->homeViewModel$delegate:Lp4/c;

    .line 96
    .line 97
    new-instance v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$4;

    .line 98
    .line 99
    invoke-direct {v0, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$4;-><init>(Lb/q;)V

    .line 100
    .line 101
    .line 102
    new-instance v1, Landroidx/lifecycle/a1;

    .line 103
    .line 104
    const-class v2, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;

    .line 105
    .line 106
    invoke-static {v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    new-instance v3, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$5;

    .line 111
    .line 112
    invoke-direct {v3, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$5;-><init>(Lb/q;)V

    .line 113
    .line 114
    .line 115
    new-instance v4, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$6;

    .line 116
    .line 117
    invoke-direct {v4, v5, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$6;-><init>(Ld5/a;Lb/q;)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/a1;-><init>(Lkotlin/jvm/internal/d;Ld5/a;Ld5/a;Ld5/a;)V

    .line 121
    .line 122
    .line 123
    iput-object v1, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->iconsViewModel$delegate:Lp4/c;

    .line 124
    .line 125
    new-instance v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$7;

    .line 126
    .line 127
    invoke-direct {v0, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$7;-><init>(Lb/q;)V

    .line 128
    .line 129
    .line 130
    new-instance v1, Landroidx/lifecycle/a1;

    .line 131
    .line 132
    const-class v2, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;

    .line 133
    .line 134
    invoke-static {v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    new-instance v3, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$8;

    .line 139
    .line 140
    invoke-direct {v3, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$8;-><init>(Lb/q;)V

    .line 141
    .line 142
    .line 143
    new-instance v4, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$9;

    .line 144
    .line 145
    invoke-direct {v4, v5, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$9;-><init>(Ld5/a;Lb/q;)V

    .line 146
    .line 147
    .line 148
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/a1;-><init>(Lkotlin/jvm/internal/d;Ld5/a;Ld5/a;Ld5/a;)V

    .line 149
    .line 150
    .line 151
    iput-object v1, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->templatesViewModel$delegate:Lp4/c;

    .line 152
    .line 153
    new-instance v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$10;

    .line 154
    .line 155
    invoke-direct {v0, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$10;-><init>(Lb/q;)V

    .line 156
    .line 157
    .line 158
    new-instance v1, Landroidx/lifecycle/a1;

    .line 159
    .line 160
    const-class v2, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 161
    .line 162
    invoke-static {v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    new-instance v3, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$11;

    .line 167
    .line 168
    invoke-direct {v3, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$11;-><init>(Lb/q;)V

    .line 169
    .line 170
    .line 171
    new-instance v4, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$12;

    .line 172
    .line 173
    invoke-direct {v4, v5, p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$lazyViewModel$default$12;-><init>(Ld5/a;Lb/q;)V

    .line 174
    .line 175
    .line 176
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/a1;-><init>(Lkotlin/jvm/internal/d;Ld5/a;Ld5/a;Ld5/a;)V

    .line 177
    .line 178
    .line 179
    iput-object v1, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->requestsViewModel$delegate:Lp4/c;

    .line 180
    .line 181
    sget v0, Ldev/jahir/blueprint/R$id;->fab_btn:I

    .line 182
    .line 183
    new-instance v1, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$findView$default$1;

    .line 184
    .line 185
    const/4 v2, 0x0

    .line 186
    invoke-direct {v1, p0, v0, v2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$special$$inlined$findView$default$1;-><init>(Landroid/app/Activity;IZ)V

    .line 187
    .line 188
    .line 189
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->fabBtn$delegate:Lp4/c;

    .line 194
    .line 195
    new-instance v0, Ldev/jahir/blueprint/ui/activities/e;

    .line 196
    .line 197
    const/4 v1, 0x1

    .line 198
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/e;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->blueprintPrefs$delegate:Lp4/c;

    .line 206
    .line 207
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->isIconsPicker()Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_0

    .line 212
    .line 213
    const-string v0, "icons_categories_fragment"

    .line 214
    .line 215
    goto :goto_0

    .line 216
    :cond_0
    const-string v0, "home_fragment"

    .line 217
    .line 218
    :goto_0
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->initialFragmentTag:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->isIconsPicker()Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_1

    .line 225
    .line 226
    sget v0, Ldev/jahir/blueprint/R$id;->icons:I

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_1
    sget v0, Ldev/jahir/blueprint/R$id;->home:I

    .line 230
    .line 231
    :goto_1
    iput v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->initialItemId:I

    .line 232
    .line 233
    return-void
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

.method public static synthetic Q(Ljava/lang/String;Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onRequestError$lambda$32(Ljava/lang/String;Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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

.method public static synthetic R(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->buildRequest$lambda$25(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)Lp4/k;

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

.method public static synthetic S()Lp4/k;
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->updateFab$lambda$24()Lp4/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static synthetic T(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onCreate$lambda$9(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/view/View;)V

    .line 2
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

.method public static synthetic U()Ldev/jahir/blueprint/ui/fragments/RequestFragment;
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->requestFragment_delegate$lambda$5()Ldev/jahir/blueprint/ui/fragments/RequestFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static synthetic V(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ld5/a;Landroid/content/DialogInterface;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showConsentDisclaimer$lambda$38$lambda$37(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ld5/a;Landroid/content/DialogInterface;)Lp4/k;

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

.method public static synthetic W(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onCreate$lambda$12(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;

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

.method public static synthetic X(Ljava/lang/String;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onRequestLimited$lambda$34$lambda$33(Ljava/lang/String;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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

.method public static synthetic Y(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->wallpapersFragment_delegate$lambda$0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment;

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

.method public static synthetic Z(Ld5/l;ZLcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showRequestDialog$lambda$28(Ld5/l;ZLcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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

.method public static synthetic a0()Lp4/k;
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showConsentDisclaimer$lambda$36()Lp4/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static final synthetic access$updateFabText(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->updateFabText(I)V

    .line 2
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

.method private static final applyFragment_delegate$lambda$4()Ldev/jahir/blueprint/ui/fragments/ApplyFragment;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/fragments/ApplyFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Ldev/jahir/blueprint/ui/fragments/ApplyFragment;-><init>()V

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

.method public static synthetic b0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/List;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onCreate$lambda$16(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/List;)Lp4/k;

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

.method private static final blueprintPrefs_delegate$lambda$6(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)Ldev/jahir/blueprint/data/BlueprintPreferences;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/blueprint/data/BlueprintPreferences;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldev/jahir/blueprint/data/BlueprintPreferences;-><init>(Landroid/content/Context;)V

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

.method private final buildRequest()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->shouldBuildRequest:Z

    .line 3
    .line 4
    new-instance v0, Ldev/jahir/blueprint/ui/activities/e;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/e;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showConsentDisclaimer$library_release(Ld5/a;)V

    .line 11
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

.method private static final buildRequest$lambda$25(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)Lp4/k;
    .locals 2

    .line 1
    sget-object v0, Ldev/jahir/blueprint/data/requests/SendIconRequest;->INSTANCE:Ldev/jahir/blueprint/data/requests/SendIconRequest;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->getSelectedApps$library_release()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-virtual {v0, p0, v1, p0}, Ldev/jahir/blueprint/data/requests/SendIconRequest;->sendIconRequest(Landroidx/fragment/app/q0;Ljava/util/ArrayList;Ldev/jahir/blueprint/data/requests/RequestCallback;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 19
    .line 20
    return-object p0
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

.method public static synthetic c0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/List;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onCreate$lambda$17(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/List;)Lp4/k;

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

.method public static synthetic d0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ld5/a;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showConsentDisclaimer$lambda$38(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ld5/a;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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

.method private final dismissIconDialog()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->iconDialog:Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/y;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->iconDialog:Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    :catch_0
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
.end method

.method private final dismissIconsShapesDialog()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->iconsShapePickerDialog:Landroidx/appcompat/app/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/s0;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->iconsShapePickerDialog:Landroidx/appcompat/app/r;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    :catch_0
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
.end method

.method private final dismissRequestDialog()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->requestDialog:Landroidx/appcompat/app/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/s0;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->requestDialog:Landroidx/appcompat/app/r;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    :catch_0
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
.end method

.method public static synthetic e0(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onRequestEmpty$lambda$31(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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

.method public static synthetic f0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showIconsShapePickerDialog$lambda$21(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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

.method public static synthetic g0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onCreate$lambda$8(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private final getApplyFragment()Ldev/jahir/blueprint/ui/fragments/ApplyFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->applyFragment$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/ui/fragments/ApplyFragment;

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

.method private final getBlueprintPrefs()Ldev/jahir/blueprint/data/BlueprintPreferences;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->blueprintPrefs$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/data/BlueprintPreferences;

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

.method private final getIconsCategoriesFragment()Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->iconsCategoriesFragment$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;

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

.method private final getIconsViewModel()Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->iconsViewModel$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;

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

.method private final getTemplatesViewModel()Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->templatesViewModel$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;

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

.method public static synthetic h0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/lang/String;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onRequestLimited$lambda$34(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/lang/String;)Lp4/k;

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

.method private static final homeFragment_delegate$lambda$2()Ldev/jahir/blueprint/ui/fragments/HomeFragment;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;-><init>()V

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

.method public static synthetic i0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->updateFabText$lambda$23(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)V

    .line 2
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

.method private static final iconsCategoriesFragment_delegate$lambda$3()Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;-><init>()V

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

.method public static synthetic j0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onCreate$lambda$15(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;

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

.method public static synthetic k0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/content/DialogInterface;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showIconsShapePickerDialog$lambda$21$lambda$20(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/content/DialogInterface;)Lp4/k;

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

.method public static synthetic l0()Ldev/jahir/blueprint/ui/fragments/HomeFragment;
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->homeFragment_delegate$lambda$2()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static synthetic loadPreviewIcons$library_release$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->loadPreviewIcons$library_release(Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: loadPreviewIcons"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
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

.method public static synthetic m0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onCreate$lambda$14(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;

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

.method public static synthetic n0()Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->iconsCategoriesFragment_delegate$lambda$3()Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method private final notifyIconShapeChanged()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getIconsCategoriesFragment()Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;->notifyShapeChange$library_release()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->notifyShapeChange$library_release()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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

.method public static synthetic o0(Landroid/content/DialogInterface;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showRequestDialog$lambda$28$lambda$27$lambda$26(Landroid/content/DialogInterface;)Lp4/k;

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

.method private static final onCreate$lambda$10(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/List;)Lp4/k;
    .locals 5

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getWallpapersFragment()Ldev/jahir/frames/ui/fragments/WallpapersFragment;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-static {v0, v1, v4, v2, v3}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->updateItems$default(Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;Ljava/util/List;ZILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, v1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->updateWallpapersCount$library_release(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeViewModel()Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;->postWallpapersCount(Ljava/lang/Integer;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 54
    .line 55
    return-object p0
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

.method private static final onCreate$lambda$12(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;
    .locals 6

    .line 1
    const-string v0, "components"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onTemplatesLoaded(Ljava/util/ArrayList;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    move-object v4, v3

    .line 28
    check-cast v4, Ldev/jahir/kuper/data/models/Component;

    .line 29
    .line 30
    invoke-virtual {v4}, Ldev/jahir/kuper/data/models/Component;->getType()Ldev/jahir/kuper/data/models/Component$Type;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    sget-object v5, Ldev/jahir/kuper/data/models/Component$Type;->UNKNOWN:Ldev/jahir/kuper/data/models/Component$Type;

    .line 35
    .line 36
    if-eq v4, v5, :cond_0

    .line 37
    .line 38
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->updateKustomCount$library_release(I)V

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeViewModel()Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-eqz p0, :cond_3

    .line 60
    .line 61
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;->postKustomCount(Ljava/lang/Integer;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 69
    .line 70
    return-object p0
    .line 71
.end method

.method private static final onCreate$lambda$13(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;
    .locals 4

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getIconsCategoriesFragment()Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x2

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {v0, p1, v3, v1, v2}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->updateItems$default(Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;Ljava/util/List;ZILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getIconsViewModel()Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;->getIconsCount()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p1, v0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->updateIconsCount$library_release(I)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeViewModel()Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getIconsViewModel()Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;->getIconsCount()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p1, p0}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;->postIconsCount(Ljava/lang/Integer;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 55
    .line 56
    return-object p0
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

.method private static final onCreate$lambda$14(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestFragment()Ldev/jahir/blueprint/ui/fragments/RequestFragment;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {p0, p1, v2, v0, v1}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->updateItems$default(Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;Ljava/util/List;ZILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 19
    .line 20
    return-object p0
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

.method private static final onCreate$lambda$15(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p0, v2, v0, v1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->updateFabText$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;IILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestFragment()Ldev/jahir/blueprint/ui/fragments/RequestFragment;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->updateSelectedApps$library_release(Ljava/util/ArrayList;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 22
    .line 23
    return-object p0
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

.method private static final onCreate$lambda$16(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/List;)Lp4/k;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->updateIconsPreview$library_release(Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 16
    .line 17
    return-object p0
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

.method private static final onCreate$lambda$17(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/List;)Lp4/k;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->updateHomeItems$library_release(Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 16
    .line 17
    return-object p0
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

.method private static final onCreate$lambda$8(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->isIconsPicker()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v1, Ldev/jahir/blueprint/R$id;->icons:I

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    new-instance v1, Ldev/jahir/blueprint/extensions/b;

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-direct {v1, v2, p0, p1}, Ldev/jahir/blueprint/extensions/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    invoke-virtual {p0, v0, p1, v1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->updateFab$library_release(IZLd5/a;)V

    .line 34
    .line 35
    .line 36
    return p1
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

.method private static final onCreate$lambda$8$lambda$7(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/view/MenuItem;)Lp4/k;
    .locals 6

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const/4 v4, 0x6

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    move-object v0, p0

    .line 10
    invoke-static/range {v0 .. v5}, Ldev/jahir/frames/ui/activities/FramesActivity;->changeFragment$default(Ldev/jahir/frames/ui/activities/FramesActivity;IZZILjava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ldev/jahir/frames/ui/activities/FramesActivity;->isBackPressedCallbackEnabled()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    :goto_0
    invoke-virtual {v0, p0}, Ldev/jahir/frames/ui/activities/FramesActivity;->enableOnBackPressedCallback(Z)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 29
    .line 30
    return-object p0
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

.method private static final onCreate$lambda$9(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onFabClick()V

    .line 2
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

.method private final onFabClick()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getInitialItemId()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Ldev/jahir/blueprint/extensions/LaunchersKt;->getDefaultLauncher(Landroid/content/Context;)Ldev/jahir/blueprint/data/models/Launcher;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0, v0}, Ldev/jahir/blueprint/extensions/LaunchersKt;->executeLauncherIntent(Landroid/content/Context;Ldev/jahir/blueprint/data/models/Launcher;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget v1, Ldev/jahir/blueprint/R$id;->request:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->shouldBuildRequest:Z

    .line 25
    .line 26
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->requestStoragePermission()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private static final onRequestEmpty$lambda$31(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 1

    .line 1
    const-string v0, "$this$showRequestDialog"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/blueprint/R$string;->no_selected_apps:I

    .line 7
    .line 8
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->title(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    sget v0, Ldev/jahir/blueprint/R$string;->no_selected_apps_content:I

    .line 12
    .line 13
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->message(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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

.method private static final onRequestError$lambda$32(Ljava/lang/String;Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 3

    .line 1
    const-string v0, "$this$showRequestDialog"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget v0, Ldev/jahir/blueprint/R$string;->requests_upload_error:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    new-array v1, v1, [Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    aput-object p0, v1, v2

    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget p0, Ldev/jahir/blueprint/R$string;->requests_upload_error_unknown:I

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {p1, p0, v1, v0, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_0
    invoke-static {p2, p0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->message(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;Ljava/lang/String;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
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

.method private static final onRequestLimited$lambda$34(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/lang/String;)Lp4/k;
    .locals 3

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/activities/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Ldev/jahir/blueprint/ui/activities/d;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {p0, v2, v0, p1, v1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showRequestDialog$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;ZLd5/l;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 14
    .line 15
    return-object p0
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

.method private static final onRequestLimited$lambda$34$lambda$33(Ljava/lang/String;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 1

    .line 1
    const-string v0, "$this$showRequestDialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/blueprint/R$string;->request:I

    .line 7
    .line 8
    invoke-static {p1, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->title(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->message(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;Ljava/lang/String;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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

.method private static final onRequestRunning$lambda$29(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 1

    .line 1
    const-string v0, "$this$showRequestDialog"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/blueprint/R$string;->request_in_progress:I

    .line 7
    .line 8
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->title(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    sget v0, Ldev/jahir/blueprint/R$string;->request_in_progress_content:I

    .line 12
    .line 13
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->message(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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

.method private static final onRequestStarted$lambda$30(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 1

    .line 1
    const-string v0, "$this$showRequestDialog"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/blueprint/R$string;->building_request_dialog:I

    .line 7
    .line 8
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->message(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->cancelable(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;Z)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
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

.method private static final onRequestUploadFinished$lambda$35(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 1

    .line 1
    const-string v0, "$this$showRequestDialog"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/blueprint/R$string;->request_upload_success_content:I

    .line 7
    .line 8
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->message(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
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

.method public static synthetic p0(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onRequestStarted$lambda$30(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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

.method public static synthetic q0(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onRequestUploadFinished$lambda$35(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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

.method public static synthetic r0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onCreate$lambda$13(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/ArrayList;)Lp4/k;

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

.method private static final requestFragment_delegate$lambda$5()Ldev/jahir/blueprint/ui/fragments/RequestFragment;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/fragments/RequestFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;-><init>()V

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

.method public static synthetic s0(Landroid/content/DialogInterface;I)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showIconsShapePickerDialog$lambda$21$lambda$19(Landroid/content/DialogInterface;I)Lp4/k;

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

.method private static final showConsentDisclaimer$lambda$36()Lp4/k;
    .locals 1

    .line 1
    sget-object v0, Lp4/k;->a:Lp4/k;

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

.method private static final showConsentDisclaimer$lambda$38(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ld5/a;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 4

    .line 1
    const-string v0, "$this$mdDialog"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/blueprint/R$string;->icon_request_consent_title:I

    .line 7
    .line 8
    invoke-static {p2, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->title(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    sget v0, Ldev/jahir/blueprint/R$string;->icon_request_consent:I

    .line 12
    .line 13
    iget-object v1, p2, Lp3/z;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Landroidx/appcompat/app/n;

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/appcompat/app/n;->a:Landroid/view/ContextThemeWrapper;

    .line 18
    .line 19
    invoke-static {v1}, Ldev/jahir/frames/extensions/context/ContextKt;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    new-array v2, v2, [Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    aput-object v1, v2, v3

    .line 28
    .line 29
    invoke-static {p0, v0, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {p2, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->message(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;Ljava/lang/String;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 34
    .line 35
    .line 36
    sget v0, Ldev/jahir/blueprint/R$string;->icon_request_consent_accept:I

    .line 37
    .line 38
    new-instance v1, Ldev/jahir/blueprint/ui/activities/a;

    .line 39
    .line 40
    invoke-direct {v1, p0, p1, v3}, Ldev/jahir/blueprint/ui/activities/a;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ld5/a;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p2, v0, v1}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->positiveButton(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;ILd5/l;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 44
    .line 45
    .line 46
    sget p0, Ldev/jahir/blueprint/R$string;->icon_request_consent_deny:I

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    const/4 v0, 0x2

    .line 50
    invoke-static {p2, p0, p1, v0, p1}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->neutralButton$default(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;ILd5/l;ILjava/lang/Object;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
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

.method private static final showConsentDisclaimer$lambda$38$lambda$37(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ld5/a;Landroid/content/DialogInterface;)Lp4/k;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getBlueprintPrefs()Ldev/jahir/blueprint/data/BlueprintPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p2, 0x1

    .line 11
    invoke-virtual {p0, p2}, Ldev/jahir/blueprint/data/BlueprintPreferences;->setIconsRequestConsentAccepted(Z)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 18
    .line 19
    return-object p0
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

.method public static synthetic showConsentDisclaimer$library_release$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ld5/a;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance p1, La2/c;

    .line 8
    .line 9
    const/4 p2, 0x7

    .line 10
    invoke-direct {p1, p2}, La2/c;-><init>(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showConsentDisclaimer$library_release(Ld5/a;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    const-string p1, "Super calls with default arguments not supported in this target, function: showConsentDisclaimer"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
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

.method private final showIconsShapePickerDialog()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->dismissIconsShapesDialog()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/blueprint/ui/activities/c;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/c;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->mdDialog(Landroid/content/Context;Ld5/l;)Landroidx/appcompat/app/r;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->iconsShapePickerDialog:Landroidx/appcompat/app/r;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 19
    .line 20
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
.end method

.method private static final showIconsShapePickerDialog$lambda$21(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 4

    .line 1
    const-string v0, "$this$mdDialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/blueprint/R$string;->icon_shape:I

    .line 7
    .line 8
    invoke-static {p1, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->title(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    sget v0, Ldev/jahir/blueprint/R$array;->icon_shapes_options:I

    .line 12
    .line 13
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getBlueprintPrefs()Ldev/jahir/blueprint/data/BlueprintPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ldev/jahir/blueprint/data/BlueprintPreferences;->getIconShape()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    new-instance v2, Ldev/jahir/blueprint/ui/activities/g;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v2, v3}, Ldev/jahir/blueprint/ui/activities/g;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, v1, v2}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->singleChoiceItems(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;IILd5/p;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 28
    .line 29
    .line 30
    new-instance v0, Ldev/jahir/blueprint/ui/activities/c;

    .line 31
    .line 32
    const/16 v1, 0x8

    .line 33
    .line 34
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/c;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 35
    .line 36
    .line 37
    const p0, 0x104000a

    .line 38
    .line 39
    .line 40
    invoke-static {p1, p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->positiveButton(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;ILd5/l;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
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

.method private static final showIconsShapePickerDialog$lambda$21$lambda$19(Landroid/content/DialogInterface;I)Lp4/k;
    .locals 0

    .line 1
    const-string p1, "<unused var>"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 7
    .line 8
    return-object p0
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

.method private static final showIconsShapePickerDialog$lambda$21$lambda$20(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/content/DialogInterface;)Lp4/k;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Landroidx/appcompat/app/r;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Landroidx/appcompat/app/r;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Landroidx/appcompat/app/r;->m:Landroidx/appcompat/app/q;

    .line 19
    .line 20
    iget-object v1, v0, Landroidx/appcompat/app/q;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 21
    .line 22
    :cond_1
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getCheckedItemCount()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const/4 v0, 0x0

    .line 30
    :goto_1
    if-lez v0, :cond_4

    .line 31
    .line 32
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getBlueprintPrefs()Ldev/jahir/blueprint/data/BlueprintPreferences;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ldev/jahir/blueprint/data/BlueprintPreferences;->getIconShape()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getCheckedItemPosition()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    const/4 v1, -0x1

    .line 48
    :goto_2
    if-eq v1, v0, :cond_4

    .line 49
    .line 50
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getBlueprintPrefs()Ldev/jahir/blueprint/data/BlueprintPreferences;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v1}, Ldev/jahir/blueprint/data/BlueprintPreferences;->setIconShape(I)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->notifyIconShapeChanged()V

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 64
    .line 65
    return-object p0
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method private final showRequestDialog(ZLd5/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ld5/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->dismissRequestDialog()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/blueprint/ui/activities/f;

    .line 5
    .line 6
    invoke-direct {v0, p2, p1}, Ldev/jahir/blueprint/ui/activities/f;-><init>(Ld5/l;Z)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->mdDialog(Landroid/content/Context;Ld5/l;)Landroidx/appcompat/app/r;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->requestDialog:Landroidx/appcompat/app/r;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 18
    .line 19
    .line 20
    :cond_0
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

.method public static synthetic showRequestDialog$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;ZLd5/l;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    const/4 p4, 0x1

    .line 4
    and-int/2addr p3, p4

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showRequestDialog(ZLd5/l;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: showRequestDialog"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
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
.end method

.method private static final showRequestDialog$lambda$28(Ld5/l;ZLcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 1

    .line 1
    const-string v0, "$this$mdDialog"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p2}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance p1, Landroidx/room/f1;

    .line 15
    .line 16
    const/4 p2, 0x4

    .line 17
    invoke-direct {p1, p2}, Landroidx/room/f1;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const p2, 0x104000a

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p2, p1}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->positiveButton(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;ILd5/l;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 24
    .line 25
    .line 26
    :cond_0
    return-object p0
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

.method private static final showRequestDialog$lambda$28$lambda$27$lambda$26(Landroid/content/DialogInterface;)Lp4/k;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 10
    .line 11
    return-object p0
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

.method public static synthetic t0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/List;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onCreate$lambda$10(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ljava/util/List;)Lp4/k;

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

.method private final toggleSelectAll()V
    .locals 7

    .line 1
    sget-object v0, Ldev/jahir/blueprint/data/requests/RequestStateManager;->INSTANCE:Ldev/jahir/blueprint/data/requests/RequestStateManager;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v6, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->getSelectedApps$library_release()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    move-object v2, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v2, v6

    .line 17
    :goto_0
    const/4 v4, 0x4

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v0 .. v5}, Ldev/jahir/blueprint/data/requests/RequestStateManager;->getRequestState$library_release$default(Ldev/jahir/blueprint/data/requests/RequestStateManager;Landroid/content/Context;Ljava/util/ArrayList;ZILjava/lang/Object;)Ldev/jahir/blueprint/data/requests/RequestState;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ldev/jahir/blueprint/data/requests/RequestState;->getState()Ldev/jahir/blueprint/data/requests/RequestState$State;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v3, Ldev/jahir/blueprint/data/requests/RequestState$State;->TIME_LIMITED:Ldev/jahir/blueprint/data/requests/RequestState$State;

    .line 30
    .line 31
    if-ne v2, v3, :cond_1

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x2

    .line 35
    invoke-static {p0, v0, v2, v3, v6}, Ldev/jahir/blueprint/data/requests/a;->p(Ldev/jahir/blueprint/data/requests/RequestCallback;Ldev/jahir/blueprint/data/requests/RequestState;ZILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->toggleSelectAll$library_release()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v2, 0x1

    .line 50
    if-ne v0, v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestFragment()Ldev/jahir/blueprint/ui/fragments/RequestFragment;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    invoke-virtual {v2}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->getSelectedApps$library_release()Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    :cond_2
    invoke-virtual {v0, v6}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->updateSelectedApps$library_release(Ljava/util/ArrayList;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
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

.method public static synthetic u0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/view/MenuItem;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onCreate$lambda$8$lambda$7(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/view/MenuItem;)Lp4/k;

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

.method private static final updateFab$lambda$24()Lp4/k;
    .locals 1

    .line 1
    sget-object v0, Lp4/k;->a:Lp4/k;

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

.method public static synthetic updateFab$library_release$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;IZLd5/a;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p5, :cond_3

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x1

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 12
    .line 13
    if-eqz p5, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 17
    .line 18
    if-eqz p4, :cond_2

    .line 19
    .line 20
    new-instance p3, La2/c;

    .line 21
    .line 22
    const/16 p4, 0xc

    .line 23
    .line 24
    invoke-direct {p3, p4}, La2/c;-><init>(I)V

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->updateFab$library_release(IZLd5/a;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 32
    .line 33
    const-string p1, "Super calls with default arguments not supported in this target, function: updateFab"

    .line 34
    .line 35
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p0
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

.method private final updateFabText(I)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getInitialItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne p1, v0, :cond_2

    .line 9
    .line 10
    sget p1, Ldev/jahir/blueprint/R$bool;->show_quick_apply_text:I

    .line 11
    .line 12
    invoke-static {p0, p1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean(Landroid/content/Context;IZ)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    sget v0, Ldev/jahir/blueprint/R$string;->quick_apply_custom_text:I

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    invoke-static {p0, v0, v3, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget v5, Ldev/jahir/blueprint/R$string;->quick_apply:I

    .line 24
    .line 25
    invoke-static {p0, v5, v3, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getFabBtn$library_release()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    if-eqz v5, :cond_8

    .line 34
    .line 35
    invoke-static {v0}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v0, v4

    .line 43
    :goto_0
    sget v4, Ldev/jahir/frames/R$drawable;->ic_apply:I

    .line 44
    .line 45
    invoke-static {p0}, Ldev/jahir/blueprint/extensions/LaunchersKt;->getDefaultLauncher(Landroid/content/Context;)Ldev/jahir/blueprint/data/models/Launcher;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    :cond_1
    xor-int/2addr p1, v2

    .line 53
    invoke-static {v5, v0, v4, v1, p1}, Ldev/jahir/blueprint/extensions/ExtendedFloatingActionButtonKt;->setup(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Ljava/lang/String;IZZ)V

    .line 54
    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_2
    sget v0, Ldev/jahir/blueprint/R$id;->request:I

    .line 58
    .line 59
    if-ne p1, v0, :cond_7

    .line 60
    .line 61
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->getSelectedApps$library_release()Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/4 p1, 0x0

    .line 79
    :goto_1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getFabBtn$library_release()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    if-eqz v4, :cond_8

    .line 84
    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    if-eq p1, v2, :cond_4

    .line 88
    .line 89
    sget v0, Ldev/jahir/blueprint/R$string;->request_x_icons:I

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    sget v0, Ldev/jahir/blueprint/R$string;->request_icon:I

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    sget v0, Ldev/jahir/blueprint/R$string;->request_none:I

    .line 96
    .line 97
    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    new-array v6, v2, [Ljava/lang/Object;

    .line 102
    .line 103
    aput-object v5, v6, v1

    .line 104
    .line 105
    invoke-static {p0, v0, v6}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    sget v6, Ldev/jahir/blueprint/R$drawable;->ic_send_request:I

    .line 110
    .line 111
    if-lez p1, :cond_6

    .line 112
    .line 113
    const/4 v7, 0x1

    .line 114
    goto :goto_3

    .line 115
    :cond_6
    const/4 v7, 0x0

    .line 116
    :goto_3
    const/16 v9, 0x8

    .line 117
    .line 118
    const/4 v10, 0x0

    .line 119
    const/4 v8, 0x0

    .line 120
    invoke-static/range {v4 .. v10}, Ldev/jahir/blueprint/extensions/ExtendedFloatingActionButtonKt;->setup$default(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Ljava/lang/String;IZZILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getFabBtn$library_release()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_8

    .line 129
    .line 130
    invoke-virtual {p1, v2, v3}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->e(ILdev/jahir/blueprint/ui/activities/BlueprintActivity$updateFab$2;)V

    .line 131
    .line 132
    .line 133
    :cond_8
    :goto_4
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-eqz p1, :cond_9

    .line 138
    .line 139
    new-instance v0, La1/x;

    .line 140
    .line 141
    const/16 v1, 0x9

    .line 142
    .line 143
    invoke-direct {v0, v1, p0}, La1/x;-><init>(ILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 147
    .line 148
    .line 149
    :cond_9
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-eqz p1, :cond_a

    .line 154
    .line 155
    invoke-static {p1, v3, v2, v3}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$library_release$default(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_a
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getIconsCategoriesFragment()Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-static {p1, v3, v2, v3}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->setupContentBottomOffset$default(Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;Landroid/view/View;ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestFragment()Ldev/jahir/blueprint/ui/fragments/RequestFragment;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-eqz p1, :cond_b

    .line 170
    .line 171
    invoke-static {p1, v3, v2, v3}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->setupContentBottomOffset$default(Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;Landroid/view/View;ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_b
    return-void
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

.method public static synthetic updateFabText$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;IILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    :cond_0
    invoke-direct {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->updateFabText(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 16
    .line 17
    const-string p1, "Super calls with default arguments not supported in this target, function: updateFabText"

    .line 18
    .line 19
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0
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

.method private static final updateFabText$lambda$23(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getFabBtn$library_release()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    :goto_0
    const/16 v1, 0x10

    .line 20
    .line 21
    int-to-float v1, v1

    .line 22
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 31
    .line 32
    mul-float v1, v1, v2

    .line 33
    .line 34
    float-to-int v1, v1

    .line 35
    add-int/2addr p0, v1

    .line 36
    invoke-static {v0, p0}, Ldev/jahir/frames/extensions/views/ViewKt;->setMarginBottom(Landroid/view/View;I)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
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

.method public static synthetic v0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)Ldev/jahir/blueprint/data/BlueprintPreferences;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->blueprintPrefs_delegate$lambda$6(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)Ldev/jahir/blueprint/data/BlueprintPreferences;

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

.method public static synthetic w0()Ldev/jahir/blueprint/ui/fragments/ApplyFragment;
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->applyFragment_delegate$lambda$4()Ldev/jahir/blueprint/ui/fragments/ApplyFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method private static final wallpapersFragment_delegate$lambda$0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment;
    .locals 2

    .line 1
    sget-object v0, Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment;->Companion:Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment$Companion;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->getWallpapersViewModel()Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getWallpapers()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment$Companion;->create(Ljava/util/ArrayList;)Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
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

.method public static synthetic x0(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onRequestRunning$lambda$29(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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


# virtual methods
.method public canShowSearch(I)Z
    .locals 1

    .line 1
    sget v0, Ldev/jahir/blueprint/R$id;->home:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->canShowSearch(I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
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

.method public final changeRequestAppState$library_release(Ldev/jahir/blueprint/data/models/RequestApp;Z)Z
    .locals 1

    .line 1
    const-string v0, "app"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->selectApp$library_release(Ldev/jahir/blueprint/data/models/RequestApp;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->deselectApp$library_release(Ldev/jahir/blueprint/data/models/RequestApp;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    return p1
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

.method public final clickMenuItem$library_release(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->internalMenu:Landroid/view/Menu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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

.method public getCollectionsFragment()Ldev/jahir/frames/ui/fragments/CollectionsFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->collectionsFragment:Ldev/jahir/frames/ui/fragments/CollectionsFragment;

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

.method public final getFabBtn$library_release()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->fabBtn$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

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

.method public getFavoritesFragment()Ldev/jahir/frames/ui/fragments/WallpapersFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->favoritesFragment:Ldev/jahir/frames/ui/fragments/WallpapersFragment;

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

.method public getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->homeFragment$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/ui/fragments/HomeFragment;

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

.method public getHomeViewModel()Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->homeViewModel$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

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

.method public getInitialFragmentTag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->initialFragmentTag:Ljava/lang/String;

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

.method public getInitialItemId()I
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->initialItemId:I

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

.method public getLayoutRes()I
    .locals 1

    .line 1
    sget v0, Ldev/jahir/blueprint/R$layout;->activity_blueprint:I

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

.method public getMenuRes()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->isIconsPicker()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget v0, Ldev/jahir/frames/R$menu;->toolbar_menu_simple:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    sget v0, Ldev/jahir/blueprint/R$menu;->blueprint_toolbar_menu:I

    .line 11
    .line 12
    return v0
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

.method public getNextFragment(I)Lp4/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lp4/f;"
        }
    .end annotation

    .line 1
    sget v0, Ldev/jahir/blueprint/R$id;->home:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Lp4/f;

    .line 6
    .line 7
    new-instance v0, Lp4/f;

    .line 8
    .line 9
    const-string v1, "home_fragment"

    .line 10
    .line 11
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-direct {p1, v0, v1}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget v0, Ldev/jahir/blueprint/R$id;->icons:I

    .line 25
    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    new-instance p1, Lp4/f;

    .line 29
    .line 30
    new-instance v0, Lp4/f;

    .line 31
    .line 32
    const-string v1, "icons_categories_fragment"

    .line 33
    .line 34
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getIconsCategoriesFragment()Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v0, v1, v2}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-direct {p1, v0, v1}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    sget v0, Ldev/jahir/blueprint/R$id;->apply:I

    .line 48
    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    new-instance p1, Lp4/f;

    .line 52
    .line 53
    new-instance v0, Lp4/f;

    .line 54
    .line 55
    const-string v1, "apply_fragment"

    .line 56
    .line 57
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getApplyFragment()Ldev/jahir/blueprint/ui/fragments/ApplyFragment;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-direct {v0, v1, v2}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-direct {p1, v0, v1}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_2
    sget v0, Ldev/jahir/blueprint/R$id;->request:I

    .line 71
    .line 72
    if-ne p1, v0, :cond_3

    .line 73
    .line 74
    new-instance p1, Lp4/f;

    .line 75
    .line 76
    new-instance v0, Lp4/f;

    .line 77
    .line 78
    const-string v1, "requests_fragment"

    .line 79
    .line 80
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestFragment()Ldev/jahir/blueprint/ui/fragments/RequestFragment;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-direct {v0, v1, v2}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-direct {p1, v0, v1}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_3
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/FramesActivity;->getNextFragment(I)Lp4/f;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1
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

.method public final getPickerKey()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sparse-switch v1, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :sswitch_0
    const-string v1, "org.adw.launcher.icons.ACTION_PICK_ICON"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :sswitch_1
    const-string v1, "com.novalauncher.THEME"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :sswitch_2
    const-string v1, "dev.jahir.blueprint.APPLY_ACTION"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    return v0

    .line 49
    :sswitch_3
    const-string v1, "com.spocky.projengmenu.icons.ACTION_PICK_ICON"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :sswitch_4
    const-string v1, "com.phonemetra.turbo.launcher.icons.ACTION_PICK_ICON"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const/4 v0, 0x1

    .line 68
    return v0

    .line 69
    :sswitch_5
    const-string v1, "android.intent.action.SET_WALLPAPER"

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const/4 v0, 0x3

    .line 79
    return v0

    .line 80
    :sswitch_6
    const-string v1, "android.intent.action.GET_CONTENT"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :sswitch_7
    const-string v1, "android.intent.action.PICK"

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 v0, 0x2

    .line 99
    return v0

    .line 100
    :cond_3
    :goto_0
    iget v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->pickerKey:I

    .line 101
    .line 102
    return v0

    .line 103
    :cond_4
    iget v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->pickerKey:I

    .line 104
    .line 105
    return v0

    .line 106
    nop

    .line 107
    :sswitch_data_0
    .sparse-switch
        -0x45efe99a -> :sswitch_7
        -0x22076195 -> :sswitch_6
        -0x1f66f280 -> :sswitch_5
        -0x19808264 -> :sswitch_4
        0x179159d2 -> :sswitch_3
        0x3c73c06f -> :sswitch_2
        0x3fc2aa94 -> :sswitch_1
        0x70d5222c -> :sswitch_0
    .end sparse-switch
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

.method public getRequestFragment()Ldev/jahir/blueprint/ui/fragments/RequestFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->requestFragment$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/ui/fragments/RequestFragment;

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

.method public getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->requestsViewModel$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

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

.method public getSearchHint(I)Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, Ldev/jahir/blueprint/R$id;->icons:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    sget p1, Ldev/jahir/blueprint/R$string;->search_icons:I

    .line 8
    .line 9
    invoke-static {p0, p1, v2, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    sget v0, Ldev/jahir/blueprint/R$id;->request:I

    .line 15
    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    sget p1, Ldev/jahir/blueprint/R$string;->search_apps:I

    .line 19
    .line 20
    invoke-static {p0, p1, v2, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_1
    sget v0, Ldev/jahir/blueprint/R$id;->apply:I

    .line 26
    .line 27
    if-ne p1, v0, :cond_2

    .line 28
    .line 29
    sget p1, Ldev/jahir/blueprint/R$string;->search_launchers:I

    .line 30
    .line 31
    invoke-static {p0, p1, v2, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_2
    sget v0, Ldev/jahir/blueprint/R$id;->wallpapers:I

    .line 37
    .line 38
    if-ne p1, v0, :cond_3

    .line 39
    .line 40
    sget p1, Ldev/jahir/frames/R$string;->search_wallpapers:I

    .line 41
    .line 42
    invoke-static {p0, p1, v2, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_3
    sget p1, Ldev/jahir/frames/R$string;->search_x:I

    .line 48
    .line 49
    invoke-static {p0, p1, v2, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

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

.method public getSnackbarAnchorId()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getFabBtn$library_release()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget v0, Ldev/jahir/blueprint/R$id;->fab_btn:I

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    sget v0, Ldev/jahir/blueprint/R$id;->bottom_navigation:I

    .line 17
    .line 18
    return v0
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

.method public getToolbarTitleForItem(I)Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, Ldev/jahir/blueprint/R$id;->home:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ldev/jahir/frames/extensions/context/ContextKt;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    sget v0, Ldev/jahir/blueprint/R$id;->icons:I

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    const/4 v2, 0x0

    .line 14
    if-ne p1, v0, :cond_1

    .line 15
    .line 16
    sget p1, Ldev/jahir/blueprint/R$string;->icons:I

    .line 17
    .line 18
    invoke-static {p0, p1, v2, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_1
    sget v0, Ldev/jahir/blueprint/R$id;->wallpapers:I

    .line 24
    .line 25
    if-ne p1, v0, :cond_2

    .line 26
    .line 27
    sget p1, Ldev/jahir/frames/R$string;->wallpapers:I

    .line 28
    .line 29
    invoke-static {p0, p1, v2, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_2
    sget v0, Ldev/jahir/blueprint/R$id;->apply:I

    .line 35
    .line 36
    if-ne p1, v0, :cond_3

    .line 37
    .line 38
    sget p1, Ldev/jahir/frames/R$string;->apply:I

    .line 39
    .line 40
    invoke-static {p0, p1, v2, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_3
    sget v0, Ldev/jahir/blueprint/R$id;->request:I

    .line 46
    .line 47
    if-ne p1, v0, :cond_4

    .line 48
    .line 49
    sget p1, Ldev/jahir/blueprint/R$string;->request:I

    .line 50
    .line 51
    invoke-static {p0, p1, v2, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_4
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/FramesActivity;->getToolbarTitleForItem(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1
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

.method public getWallpapersFragment()Ldev/jahir/frames/ui/fragments/WallpapersFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->wallpapersFragment$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;

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

.method public handleOnBackPressed()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getInitialItemId()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getInitialItemId()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0, v0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->selectNavigationItem$library_release(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-super {p0}, Ldev/jahir/frames/ui/activities/FramesActivity;->handleOnBackPressed()V

    .line 20
    .line 21
    .line 22
    return-void
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

.method public internalOnPermissionsGranted(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "permission"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->internalOnPermissionsGranted(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->updateWallpaper$library_release()V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-boolean p1, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->shouldBuildRequest:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->buildRequest()V

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

.method public isDebug()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->isDebug:Z

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

.method public final isIconsPicker()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getPickerKey()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getPickerKey()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getPickerKey()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x4

    .line 20
    if-ne v0, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0

    .line 25
    :cond_1
    :goto_0
    return v1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final loadAppsToRequest$library_release()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->isDebug()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->loadApps(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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

.method public final loadIconsCategories$library_release()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getIconsViewModel()Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;->loadIconsCategories()V

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
.end method

.method public final loadPreviewIcons$library_release(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeViewModel()Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;->loadPreviewIcons(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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

.method public onBillingClientReady()V
    .locals 2

    .line 1
    invoke-super {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->onBillingClientReady()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->isBillingClientReady()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getDonationItemsIds()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    invoke-virtual {v0, v1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->showDonation$library_release(Z)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
    .line 33
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/FramesActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;

    .line 11
    .line 12
    const/4 v1, 0x7

    .line 13
    invoke-direct {v0, v1, p0}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationBarView;->setOnItemSelectedListener(Lcom/google/android/material/navigation/NavigationBarView$OnItemSelectedListener;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getFabBtn$library_release()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance v0, Lcom/google/android/material/datepicker/e;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, v1, p0}, Lcom/google/android/material/datepicker/e;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->getWallpapersViewModel()Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v0, Ldev/jahir/blueprint/ui/activities/c;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/c;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p0, v0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->observeWallpapers(Landroidx/lifecycle/w;Ld5/l;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getTemplatesViewModel()Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v0, Ldev/jahir/blueprint/ui/activities/c;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/c;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p0, v0}, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;->observe(Landroidx/lifecycle/w;Ld5/l;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getIconsViewModel()Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v0, Ldev/jahir/blueprint/ui/activities/c;

    .line 65
    .line 66
    const/4 v1, 0x2

    .line 67
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/c;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p0, v0}, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;->observe(Landroidx/lifecycle/w;Ld5/l;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p1, p0}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->setRequestsCallback(Ldev/jahir/blueprint/data/requests/RequestCallback;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-eqz p1, :cond_3

    .line 87
    .line 88
    new-instance v0, Ldev/jahir/blueprint/ui/activities/c;

    .line 89
    .line 90
    const/4 v1, 0x3

    .line 91
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/c;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p0, v0}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->observeAppsToRequest(Landroidx/lifecycle/w;Ld5/l;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    new-instance v0, Ldev/jahir/blueprint/ui/activities/c;

    .line 104
    .line 105
    const/4 v1, 0x4

    .line 106
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/c;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p0, v0}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->observeSelectedApps(Landroidx/lifecycle/w;Ld5/l;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeViewModel()Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-eqz p1, :cond_5

    .line 117
    .line 118
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p1, p0, v0}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;->observeCounters(Landroidx/lifecycle/w;Ldev/jahir/blueprint/ui/fragments/HomeFragment;)V

    .line 123
    .line 124
    .line 125
    :cond_5
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeViewModel()Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_6

    .line 130
    .line 131
    new-instance v0, Ldev/jahir/blueprint/ui/activities/c;

    .line 132
    .line 133
    const/4 v1, 0x5

    .line 134
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/c;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, p0, v0}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;->observeIconsPreviewList(Landroidx/lifecycle/w;Ld5/l;)V

    .line 138
    .line 139
    .line 140
    :cond_6
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeViewModel()Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-eqz p1, :cond_7

    .line 145
    .line 146
    new-instance v0, Ldev/jahir/blueprint/ui/activities/c;

    .line 147
    .line 148
    const/4 v1, 0x6

    .line 149
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/c;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, p0, v0}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;->observeHomeItems(Landroidx/lifecycle/w;Ld5/l;)V

    .line 153
    .line 154
    .line 155
    :cond_7
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeViewModel()Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-eqz p1, :cond_8

    .line 160
    .line 161
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;->loadHomeItems()V

    .line 162
    .line 163
    .line 164
    :cond_8
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeFragment()Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    const/4 v0, 0x0

    .line 169
    const/4 v1, 0x1

    .line 170
    if-eqz p1, :cond_a

    .line 171
    .line 172
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->isBillingClientReady()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_9

    .line 177
    .line 178
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getDonationItemsIds()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-nez v2, :cond_9

    .line 187
    .line 188
    const/4 v2, 0x1

    .line 189
    goto :goto_0

    .line 190
    :cond_9
    const/4 v2, 0x0

    .line 191
    :goto_0
    invoke-virtual {p1, v2}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->showDonation$library_release(Z)V

    .line 192
    .line 193
    .line 194
    :cond_a
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->loadIconsCategories$library_release()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->isIconsPicker()Z

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    if-eqz p1, :cond_c

    .line 202
    .line 203
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    sget v0, Ldev/jahir/blueprint/R$id;->icons:I

    .line 208
    .line 209
    if-eq p1, v0, :cond_b

    .line 210
    .line 211
    invoke-virtual {p0, v0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->selectNavigationItem$library_release(I)V

    .line 212
    .line 213
    .line 214
    :cond_b
    return-void

    .line 215
    :cond_c
    const/4 p1, 0x0

    .line 216
    invoke-static {p0, v0, v1, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->loadPreviewIcons$library_release$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;ZILjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getTemplatesViewModel()Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p1}, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;->loadComponents()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->loadAppsToRequest$library_release()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->requestStoragePermission()V

    .line 230
    .line 231
    .line 232
    return-void
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

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 7

    .line 1
    const-string v0, "menu"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sget v1, Ldev/jahir/blueprint/R$id;->templates:I

    .line 11
    .line 12
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getTemplatesViewModel()Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;->getComponents()Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    xor-int/2addr v3, v2

    .line 32
    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 33
    .line 34
    .line 35
    :cond_0
    sget v1, Ldev/jahir/blueprint/R$id;->select_all:I

    .line 36
    .line 37
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v3, 0x0

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    sget v5, Ldev/jahir/blueprint/R$id;->request:I

    .line 49
    .line 50
    if-ne v4, v5, :cond_1

    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v4, 0x0

    .line 55
    :goto_0
    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 56
    .line 57
    .line 58
    :cond_2
    sget v1, Ldev/jahir/blueprint/R$id;->icons_shape:I

    .line 59
    .line 60
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    sget v5, Ldev/jahir/blueprint/R$id;->icons:I

    .line 71
    .line 72
    if-ne v4, v5, :cond_3

    .line 73
    .line 74
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 75
    .line 76
    const/16 v5, 0x1a

    .line 77
    .line 78
    if-lt v4, v5, :cond_3

    .line 79
    .line 80
    sget v4, Ldev/jahir/blueprint/R$bool;->includes_adaptive_icons:I

    .line 81
    .line 82
    const/4 v5, 0x2

    .line 83
    const/4 v6, 0x0

    .line 84
    invoke-static {p0, v4, v3, v5, v6}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean$default(Landroid/content/Context;IZILjava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    const/4 v2, 0x0

    .line 92
    :goto_1
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 93
    .line 94
    .line 95
    :cond_4
    iput-object p1, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->internalMenu:Landroid/view/Menu;

    .line 96
    .line 97
    return v0
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

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->dismissIconsShapesDialog()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->dismissRequestDialog()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->dismissIconDialog()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeViewModel()Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;->destroy(Landroidx/lifecycle/w;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getIconsViewModel()Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p0}, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;->destroy(Landroidx/lifecycle/w;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getTemplatesViewModel()Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, p0}, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;->destroy(Landroidx/lifecycle/w;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->destroy(Landroidx/lifecycle/w;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
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
    sget v1, Ldev/jahir/blueprint/R$id;->icons_shape:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showIconsShapePickerDialog()V

    .line 15
    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    sget v1, Ldev/jahir/blueprint/R$id;->select_all:I

    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->toggleSelectAll()V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    sget v1, Ldev/jahir/blueprint/R$id;->templates:I

    .line 27
    .line 28
    if-ne v0, v1, :cond_2

    .line 29
    .line 30
    new-instance v0, Landroid/content/Intent;

    .line 31
    .line 32
    const-class v1, Ldev/jahir/blueprint/ui/activities/BlueprintKuperActivity;

    .line 33
    .line 34
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    sget v1, Ldev/jahir/blueprint/R$id;->help:I

    .line 42
    .line 43
    if-ne v0, v1, :cond_3

    .line 44
    .line 45
    new-instance v0, Landroid/content/Intent;

    .line 46
    .line 47
    const-class v1, Ldev/jahir/blueprint/ui/activities/HelpActivity;

    .line 48
    .line 49
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    sget v1, Ldev/jahir/blueprint/R$id;->settings:I

    .line 57
    .line 58
    if-ne v0, v1, :cond_4

    .line 59
    .line 60
    new-instance p1, Landroid/content/Intent;

    .line 61
    .line 62
    const-class v0, Ldev/jahir/blueprint/ui/activities/BlueprintSettingsActivity;

    .line 63
    .line 64
    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    sget v1, Ldev/jahir/blueprint/R$id;->about:I

    .line 72
    .line 73
    if-ne v0, v1, :cond_5

    .line 74
    .line 75
    new-instance p1, Landroid/content/Intent;

    .line 76
    .line 77
    const-class v0, Ldev/jahir/blueprint/ui/activities/BlueprintAboutActivity;

    .line 78
    .line 79
    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    const/4 p1, 0x1

    .line 86
    return p1

    .line 87
    :cond_5
    :goto_1
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/FramesActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    return p1
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

.method public onRequestEmailIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/data/requests/a;->a(Ldev/jahir/blueprint/data/requests/RequestCallback;Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->deselectAll$library_release()Z

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->dismissRequestDialog()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public onRequestEmpty()V
    .locals 4

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/data/requests/a;->b(Ldev/jahir/blueprint/data/requests/RequestCallback;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/room/f1;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1}, Landroidx/room/f1;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {p0, v3, v0, v1, v2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showRequestDialog$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;ZLd5/l;ILjava/lang/Object;)V

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
.end method

.method public onRequestError(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/blueprint/data/requests/a;->c(Ldev/jahir/blueprint/data/requests/RequestCallback;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Ldev/jahir/blueprint/ui/activities/b;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p2, v0, p1, p0}, Ldev/jahir/blueprint/ui/activities/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p0, v1, p2, p1, v0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showRequestDialog$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;ZLd5/l;ILjava/lang/Object;)V

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

.method public onRequestLimited(Ldev/jahir/blueprint/data/requests/RequestState;Z)V
    .locals 10

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Ldev/jahir/blueprint/data/requests/a;->d(Ldev/jahir/blueprint/data/requests/RequestCallback;Ldev/jahir/blueprint/data/requests/RequestState;Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/requests/RequestState;->getState()Ldev/jahir/blueprint/data/requests/RequestState$State;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    sget-object v0, Ldev/jahir/blueprint/data/requests/RequestState$State;->TIME_LIMITED:Ldev/jahir/blueprint/data/requests/RequestState$State;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    sget p2, Ldev/jahir/blueprint/R$string;->apps_limit_dialog_day:I

    .line 20
    .line 21
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    sget v3, Ldev/jahir/blueprint/R$integer;->time_limit_in_minutes:I

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-static {p0, v3, v2, v4, v5}, Ldev/jahir/frames/extensions/context/ContextKt;->integer$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    int-to-long v6, v3

    .line 32
    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    invoke-static {p0, v6, v7}, Ldev/jahir/blueprint/extensions/ContextKt;->millisToText(Landroid/content/Context;J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-array v3, v1, [Ljava/lang/Object;

    .line 41
    .line 42
    aput-object v0, v3, v2

    .line 43
    .line 44
    invoke-static {p0, p2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 49
    .line 50
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/requests/RequestState;->getTimeLeft()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    const-wide/16 v8, 0x3c

    .line 59
    .line 60
    cmp-long v0, v6, v8

    .line 61
    .line 62
    if-ltz v0, :cond_0

    .line 63
    .line 64
    sget v0, Ldev/jahir/blueprint/R$string;->apps_limit_dialog_day_extra:I

    .line 65
    .line 66
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/requests/RequestState;->getTimeLeft()J

    .line 67
    .line 68
    .line 69
    move-result-wide v3

    .line 70
    invoke-static {p0, v3, v4}, Ldev/jahir/blueprint/extensions/ContextKt;->millisToText(Landroid/content/Context;J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-array v3, v1, [Ljava/lang/Object;

    .line 75
    .line 76
    aput-object p1, v3, v2

    .line 77
    .line 78
    invoke-static {p0, v0, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    sget p1, Ldev/jahir/blueprint/R$string;->apps_limit_dialog_day_extra_sec:I

    .line 84
    .line 85
    invoke-static {p0, p1, v5, v4, v5}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p2, " "

    .line 98
    .line 99
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    goto :goto_2

    .line 110
    :cond_1
    sget p2, Ldev/jahir/blueprint/R$integer;->max_apps_to_request:I

    .line 111
    .line 112
    const/4 v0, -0x1

    .line 113
    invoke-static {p0, p2, v0}, Ldev/jahir/frames/extensions/context/ContextKt;->integer(Landroid/content/Context;II)I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/requests/RequestState;->getRequestsLeft()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eq p1, p2, :cond_3

    .line 122
    .line 123
    if-ne p1, v0, :cond_2

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    sget p2, Ldev/jahir/blueprint/R$string;->apps_limit_dialog_more:I

    .line 127
    .line 128
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    new-array v0, v1, [Ljava/lang/Object;

    .line 133
    .line 134
    aput-object p1, v0, v2

    .line 135
    .line 136
    invoke-static {p0, p2, v0}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    goto :goto_2

    .line 141
    :cond_3
    :goto_1
    sget p1, Ldev/jahir/blueprint/R$string;->apps_limit_dialog:I

    .line 142
    .line 143
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    new-array v0, v1, [Ljava/lang/Object;

    .line 148
    .line 149
    aput-object p2, v0, v2

    .line 150
    .line 151
    invoke-static {p0, p1, v0}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :goto_2
    invoke-static {p1}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    if-nez p2, :cond_4

    .line 160
    .line 161
    return-void

    .line 162
    :cond_4
    new-instance p2, Ldev/jahir/blueprint/extensions/b;

    .line 163
    .line 164
    invoke-direct {p2, v1, p0, p1}, Ldev/jahir/blueprint/extensions/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    const-wide/16 v0, 0x19

    .line 168
    .line 169
    invoke-static {v0, v1, p2}, Ldev/jahir/frames/extensions/utils/GlobalKt;->postDelayed(JLd5/a;)V

    .line 170
    .line 171
    .line 172
    return-void
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

.method public onRequestRunning()V
    .locals 4

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/data/requests/a;->e(Ldev/jahir/blueprint/data/requests/RequestCallback;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/room/f1;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-direct {v0, v1}, Landroidx/room/f1;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {p0, v3, v0, v1, v2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showRequestDialog$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;ZLd5/l;ILjava/lang/Object;)V

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
.end method

.method public onRequestStarted()V
    .locals 4

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/data/requests/a;->f(Ldev/jahir/blueprint/data/requests/RequestCallback;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/room/f1;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1}, Landroidx/room/f1;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {p0, v3, v0, v1, v2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showRequestDialog$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;ZLd5/l;ILjava/lang/Object;)V

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
.end method

.method public onRequestUploadFinished(Z)V
    .locals 3

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/data/requests/a;->g(Ldev/jahir/blueprint/data/requests/RequestCallback;Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getRequestsViewModel()Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/viewmodels/RequestsViewModel;->deselectAll$library_release()Z

    .line 11
    .line 12
    .line 13
    :cond_0
    new-instance p1, Landroidx/room/f1;

    .line 14
    .line 15
    const/4 v0, 0x6

    .line 16
    invoke-direct {p1, v0}, Landroidx/room/f1;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {p0, v2, p1, v0, v1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showRequestDialog$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;ZLd5/l;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
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

.method public onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "savedInstanceState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/FramesActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "pickerKey"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput p1, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->pickerKey:I

    .line 17
    .line 18
    return-void
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

.method public onResume()V
    .locals 6

    .line 1
    invoke-super {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->notifyIconShapeChanged()V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x5

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    move-object v0, p0

    .line 13
    invoke-static/range {v0 .. v5}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->updateFab$library_release$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;IZLd5/a;ILjava/lang/Object;)V

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
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "outState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pickerKey"

    .line 7
    .line 8
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getPickerKey()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/FramesActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public onTemplatesLoaded(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/kuper/data/models/Component;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "templates"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->invalidateOptionsMenu()V

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

.method public final repostCounters$library_release()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getHomeViewModel()Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;->repostCounters()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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

.method public selectNavigationItem$library_release(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, p1, v1}, Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;->setSelectedItemId(IZ)V

    .line 9
    .line 10
    .line 11
    :cond_0
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

.method public shouldLoadCollections()Z
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

.method public shouldLoadFavorites()Z
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

.method public final showConsentDisclaimer$library_release(Ld5/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onConsentAccepted"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getBlueprintPrefs()Ldev/jahir/blueprint/data/BlueprintPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ldev/jahir/blueprint/data/BlueprintPreferences;->getIconsRequestConsentAccepted()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v0, Ldev/jahir/blueprint/ui/activities/a;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p0, p1, v1}, Ldev/jahir/blueprint/ui/activities/a;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ld5/a;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->mdDialog(Landroid/content/Context;Ld5/l;)Landroidx/appcompat/app/r;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final showIconDialog$library_release(Ldev/jahir/blueprint/data/models/Icon;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->dismissIconDialog()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;->Companion:Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog$Companion;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog$Companion;->create(Ldev/jahir/blueprint/data/models/Icon;)Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->iconDialog:Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;->show(Landroidx/fragment/app/q0;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
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

.method public final updateFab$library_release(IZLd5/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ld5/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "afterHidden"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    if-eqz p2, :cond_2

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getFabBtn$library_release()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getFabBtn$library_release()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    new-instance v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$updateFab$2;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity$updateFab$2;-><init>(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;I)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    invoke-virtual {p2, p1, v0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->e(ILdev/jahir/blueprint/ui/activities/BlueprintActivity$updateFab$2;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-direct {p0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->updateFabText(I)V

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_0
    invoke-interface {p3}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 46
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
.end method
